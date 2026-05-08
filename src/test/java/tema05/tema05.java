package tema05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tema08.ex10.TestCase;

import java.time.Duration;
import java.util.List;

public class tema05 {
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

        // Accesează o categorie de produse.
        WebElement category = waitForElementVisible(By.xpath("//*[contains(text(),'Hand Tools')]/input"));
        category.click();

        // Folosește filtrele disponibile.
        driver.findElement(By.xpath("//*[contains(text(), 'Hand Saw')]/input")).click();
        category.click();

        // Selectează un filtru (ex: brand).
        driver.findElement(By.xpath("//*[contains(text(), 'Hammer')]/input")).click();

        //  Verifică faptul că cel puțin două produse conțin numele categoriei selectate.
        List<WebElement> products = driver.findElements(By.xpath("//*[@data-test='product-name']"));
        Assert.assertTrue(products.size() >= 2, "Nu exista peste 2 produse in lista.");

    }



    // Test 2
    @Test
    public void test2() {
        //    Deschide un produs.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement item = waitForElementVisible(By.xpath("(//*[@data-test='product-name'])[1]"));
        String expectedProductName = item.getText();
        item.click();

        //    Apasă Add to cart.
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btn-add-to-cart"))).click();

        //    Deschide coșul.
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-test='cart-quantity']"))).click();

        //    Verifica: produsul apare în coș
        WebElement itemCart = waitForElementVisible(By.xpath("//*[contains(@data-test,'product-title')]"));
        String productCart = itemCart.getText();
        Assert.assertEquals(productCart.trim(), expectedProductName.trim(), "Produsul nu exista in cos.");

        //   Verifica: cantitatea este 1.
        WebElement quantCart = waitForElementVisible(By.xpath("//*[contains(@data-test,'product-quantity')]"));
        //String quantityCart = quantCart.getText();
        String quantityCart = quantCart.getAttribute("value");
        Assert.assertEquals(quantityCart,"1", "Cantitatea nu este egala.");

    }


    // Test 3
    @Test
    public void test3() {
        //  Caută produsul Hammer.
        WebElement searchBar = driver.findElement(By.xpath("//input[contains(@id,'search-query')]"));
        searchBar.sendKeys("hammer");
        WebElement searchButton = driver.findElement(By.xpath("//button[contains(@class,'btn btn-secondary')]"));
        searchButton.click();

        // Deschide produsul.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement item = waitForElementVisible(By.xpath("(//*[@data-test='product-name'])[1]"));
        String expectedProductName = item.getText();
        item.click();

        // Adaugă produsul în coș.
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btn-add-to-cart"))).click();

        // Deschide coșul.
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-test='cart-quantity']"))).click();

        //    Verifica: produsul apare în coș
        WebElement itemCart = waitForElementVisible(By.xpath("//*[contains(@data-test,'product-title')]"));
        Assert.assertEquals(itemCart.getText().trim(), expectedProductName.trim(), "Produsul nu exista in cos.");

        //   Verifica: cantitatea este 1.
        WebElement quantCart = waitForElementVisible(By.xpath("//*[contains(@data-test,'product-quantity')]"));
        //String quantityCart = quantCart.getText();
        Assert.assertEquals(quantCart.getAttribute("value"),"1", "Cantitatea nu este egala.");

        //   Verifica: pretul este afisat.
        WebElement priceCart = waitForElementVisible(By.xpath("//*[contains(@data-test,'product-price')]"));
        Assert.assertTrue(priceCart.isDisplayed(), "Pretul nu este afisat.");

    }
}

