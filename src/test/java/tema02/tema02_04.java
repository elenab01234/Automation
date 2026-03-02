package tema02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tema02_04 {
    WebDriver driver1, driver2;

    @BeforeMethod
    public void setUp1() {
        driver1 = new ChromeDriver();
        driver1.get("https://example.com/");
   }

    @Test
    public void goToURL1() {
        String title = driver1.getTitle();
        System.out.println(title);
    }

    @AfterMethod
    public void tearDown1() {
        driver1.quit();
    }
    
    @BeforeMethod
    public void setUp2() {
        driver2 = new ChromeDriver();
        driver2.get("https://www.apple.com/");
    }

    @Test
    public void goToURL2() {
        String title = driver2.getTitle();
        System.out.println(title);

    }
    @AfterMethod
    public void tearDown2() {
        driver2.quit();
    }
}
