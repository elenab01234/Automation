package tema02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tema02_01 {
    @Test
    public static void openURL() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://example.com/");

        driver.quit();
    }

}


