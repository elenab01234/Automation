package tema08_.ex08;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.openUrl("https://example.com/login");
        loginPage.login("user1", "pass123");

        driver.quit();
    }
}