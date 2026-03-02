package tema02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tema02_03 {
    @Test
    public void goToURL1() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/");
        driver.quit();
    }
    @Test
    public void goToURL2() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.apple.com/");

        driver.quit();
    }
}
