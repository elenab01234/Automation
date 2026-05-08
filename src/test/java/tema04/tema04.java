package tema04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class tema04 {
    WebDriver driver;

    public WebElement waitForElementVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement visible = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        locator));
        return visible;
    }

    @BeforeMethod
    public void setUp() {
        // driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://practicesoftwaretesting.com/");
        waitForElementVisible(By.id("Layer_1"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


    // Test 1
    @Test
    public void test1() {
        // Deschide aplicația https://practicesoftwaretesting.com/ .
        driver.get("https://practicesoftwaretesting.com/");

        // Verifică titlul paginii.
        // System.out.println("Titlul este: " + driver.getTitle());
        String titlu = driver.getTitle();
        Assert.assertTrue(titlu.contains("Practice Software Testing - Toolshop"));

        // Verifică dacă logo-ul aplicației este vizibil.
        waitForElementVisible(By.id("Layer_1"));
        boolean logo = driver.findElement(By.id("Layer_1")).isDisplayed();
        Assert.assertTrue(logo,"Logo-ul nu este vizibil!");
    }

    // Test2
    @Test
    public void test2() {
        // Identifică search bar.
        WebElement searchBar = driver.findElement(By.xpath("//input[contains(@id,'search-query')]"));

        // Introdu textu “hammer”
        searchBar.sendKeys("hammer");

        // Apasă Enter sau butonul de căutare.
        WebElement searchButton = driver.findElement(By.xpath("//button[contains(@class,'btn btn-secondary')]"));
        searchButton.click();
        // searchBar.sendKeys(Keys.ENTER);

        // Așteaptă afișarea rezultatelor.
        WebElement searchedResult = waitForElementVisible(By.xpath("//h3[contains(@data-test,'search-caption')] "));
        boolean searchResultDisplay= searchedResult.isDisplayed();
        Assert.assertTrue(searchResultDisplay, "Rezultatul cautarii nu apare.");
        // System.out.println("rezultatele au fost afisate " + searchResultDisplay);

        // Verifică dacă apare cel puțin un produs în listă.
        WebElement searchResultCount = waitForElementVisible(By.xpath("//p[contains(@data-test,'search-result-count')]"));
        boolean countDisplay = searchResultCount.isDisplayed();
        Assert.assertTrue(countDisplay, "Rezultatul cautarii are zero produse.");
        // System.out.println("Apare cel putin un element in lista " + countDisplay);

    }

    // Test3
    @Test
    public void test3() {
        // Deschide pagina principală.
        WebElement navHome = driver.findElement(By.xpath("//*[contains(@data-test,'nav-home')]"));
        navHome.click();

        // Așteaptă încărcarea produselor.
        WebElement firstItem = waitForElementVisible(By.xpath("//*[contains(@src,'assets/img/products/pliers01.avif')]"));

        // Apasă pe primul produs din listă.
        //WebElement firstItem = driver.findElement(By.xpath("//*[contains(@src,'assets/img/products/pliers01.avif')]"));
        firstItem.click();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Verifică dacă:
        //    imaginea produsului este vizibilă
        //    butonul Add to cart este vizibil.

        // asteapta sa se incarce pagina
        WebElement itemPage = waitForElementVisible(By.xpath("//h1[contains(@data-test,'product-name')]"));

        WebElement itemImg = driver.findElement(By.xpath("//img[contains(@class,'figure-img img-fluid')]"));
        //WebElement itemImg = waitForElementVisible(By.xpath("//img[contains(@class,'figure-img')]"));
        boolean imgDisplay = itemImg.isDisplayed();
        Assert.assertTrue(imgDisplay, "Imaginea produsului nu este afisatad.");

        WebElement addToCart = driver.findElement(By.xpath("//button[contains(@data-test,'add-to-cart')]"));
        //WebElement addToCart = waitForElementVisible(By.xpath("//button[contains(@data-test,'add-to-cart')]"));
        boolean addToCartEnabled = addToCart.isDisplayed();
        Assert.assertTrue(addToCartEnabled, "Butonul Add to cart nu este vizibil.");
        addToCart.click();
    }

    // Test4
    @Test
    public void test4() {
        // Deschide pagina principală.
        WebElement navHome = driver.findElement(By.xpath("//*[contains(@data-test,'nav-home')]"));
        navHome.click();

        // Selectează un filtru (ex: brand sau categorie)
        WebElement byCategory = driver.findElement(By.xpath("//label[contains(text(),' Show only eco-friendly products')]"));
        byCategory.click();

        // Așteaptă actualizarea listei.
        waitForElementVisible(By.xpath("//img[contains(@src,'assets/img/products/saw01.avif')]"));

        // Verifică dacă produsele afișate respectă filtrul.
        boolean eco = driver.findElement(By.xpath( "//span[contains(@class,'rating-b')]")).isDisplayed();
        Assert.assertTrue(eco, "Produsul afisat nu respecta filtrul");


    }
}

