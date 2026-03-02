package tema02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tema02_04 {
    WebDriver driver1, driver2;

    @BeforeMethod
    public void setUp() {
        driver1 = new ChromeDriver();
        driver2 = new ChromeDriver();
   }

    @Test
    public void goToURL1() {
        driver1.get("https://example.com/");
        driver2.get("https://www.apple.com/");
    }

    @AfterMethod
    public void tearDown() {
        driver1.quit();driver2.quit();
    }
}
