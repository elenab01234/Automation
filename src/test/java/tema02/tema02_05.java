package tema02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tema02_05 {
    WebDriver driver1;

    @BeforeMethod
    public void setUp1() {
        driver1 = new ChromeDriver();
        driver1.get("https://example.com/");
    }

    @Test
    public void goToURL1() {
        String title = driver1.getTitle();
        //System.out.println(title);

        if (title.isEmpty()) {
            System.out.println("Titlul este nul");
            }
        if (title.toLowerCase().contains("example")) {
            System.out.println("Titlul contine textul 'example'");
            }
        }

    @AfterMethod
    public void tearDown1() {
        driver1.quit();
    }

}
