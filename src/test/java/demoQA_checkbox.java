import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demoQA_checkbox {
    @Test
    public void textBoxTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        WebElement checkbox = driver.findElement(By.xpath("//span[contains(@role,'checkbox')]"));
        checkbox.click();
    }
}
