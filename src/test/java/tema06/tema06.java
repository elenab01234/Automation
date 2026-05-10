

package tema06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class tema06 {
    WebDriver driver;

    public WebElement waitForElementVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement visible = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        locator));
        return visible;
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        // driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        //driver.get("https://practicesoftwaretesting.com/");
        //waitForElementVisible(By.id("Layer_1"));
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        // Inchide browser
        driver.quit();
    }

    // Test 1
    @Test
    public void test1() {
        //    deschide un site
        driver.get("https://practicesoftwaretesting.com/");
        String mainTab = driver.getWindowHandle();

        //    deschide un tab nou (WindowType.TAB)
        driver.switchTo().newWindow(WindowType.TAB);

        //    accesează alt site în noul tab
        driver.get("https://demoqa.com/");

        //    Afișează titlul ambelor taburi
        System.out.println(driver.getTitle());
        driver.switchTo().window(mainTab);
        System.out.println(driver.getTitle());

    }

    // Test 2
    @Test
    public void test2() {
        //    deschide 2 taburi
        //    salvează windowHandles
        driver.get("https://practicesoftwaretesting.com/");
        String tab1 = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://demoqa.com/");
        String tab2 = driver.getWindowHandle();

        //    navighează între ele
        driver.switchTo().window(tab1);
        driver.switchTo().window(tab2);

        //    Verifică titlul fiecărui tab folosind Assert
        driver.switchTo().window(tab1);
        String title1 = driver.getTitle();
        Assert.assertTrue(title1.contains("Toolshop"),"Nu suntem pe pagina Toolshop");

        driver.switchTo().window(tab2);
        String title2 = driver.getTitle().toLowerCase();
        Assert.assertTrue(title2.contains("demo"),"Nu suntem pe pagina DemoQA");
    }

    // Test 3
    //    Ruleaza testul folosing fisier .xml
    @Test(groups = {"xml"})
    public void test3() {
        //    deschide 2 taburi
        driver.get("https://practicesoftwaretesting.com/");
        String tab1 = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://demoqa.com/");

        //    închide unul cu driver.close()
        driver.close();

        //    revine pe tabul principal
        driver.switchTo().window(tab1);

        //    Verifică dacă încă ești pe pagina corectă
        String tab2 = driver.getWindowHandle();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://practicesoftwaretesting.com/");
    }



    // Test 4
//    Ruleaza testul folosind un fisier .xml
    @Test(groups = {"xml"})
    public void test4() {
        //    Deschide https://practicesoftwaretesting.com/
        driver.get("https://practicesoftwaretesting.com/");
        String tab1 = driver.getWindowHandle();
        // String urlMain = driver.getCurrentUrl();

        //    Deschide produsul într-un tab nou
        //String expectedProductName = item.getText();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://practicesoftwaretesting.com/");

        //    Navighează pe o categorie
        WebElement category = waitForElementVisible(By.xpath("//*[contains(text(),'Hand Tools')]/input"));
        category.click();

        WebElement item = waitForElementVisible(By.xpath("(//*[contains(@class,'card-title')])[1]"));
        String selectedProduct = item.getText();
        //System.out.println(selectedProduct);
        item.click();

        //    Revine în tabul principal
        driver.switchTo().window(tab1);

        //    Face refresh
        driver.navigate().refresh();

        String refreshedProduct = waitForElementVisible(By.xpath("(//*[contains(@class,'card-title')])[1]")).getText();
        //System.out.println(refreshedProduct);
        Assert.assertEquals(refreshedProduct, selectedProduct);

    }
}
