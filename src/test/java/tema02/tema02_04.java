package tema02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tema02_04 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
   }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void goToURL1() {
        driver.get("https://example.com/");
    }
    @Test
    public void goToURL2() {
        driver.get("https://www.apple.com/");
    }


}
