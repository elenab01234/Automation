package tema02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tema02_02 {
    @Test
    public void verifyTitle() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Example Domain"));

        driver.quit();
}
}
