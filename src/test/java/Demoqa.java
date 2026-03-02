import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demoqa {

    @Test
    public void textBoxTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        WebElement FullName = driver.findElement(By.id("userName"));
        WebElement email = driver.findElement(By.id("userEmail"));
        WebElement CurrentAdress = driver.findElement(By.id("currentAddress"));
        WebElement PermanentAdress = driver.findElement(By.id("permanentAddress"));
        WebElement Submit = driver.findElement(By.id("submit"));
        //NOK WebElement Submit = driver.findElement(By.className("btn btn-primary"));

        FullName.sendKeys("eee");
        email.sendKeys("test@itschool.com");
        //NOK email.sendKeys("test");
        CurrentAdress.sendKeys("a");
        PermanentAdress.sendKeys("b");

        Submit.click();

        WebElement output = driver.findElement(By.id("output"));

        Assert.assertTrue(output.isDisplayed());

        //Actions actions = new Actions(driver);
        //actions.scrollToElement(submit).perform(); //aduce obiectul in partea din mijlo a paginii
    }

    @Test
    public void textBoxTestNegativ(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        WebElement FullName = driver.findElement(By.id("userName"));
        WebElement email = driver.findElement(By.id("userEmail"));
        WebElement CurrentAdress = driver.findElement(By.id("currentAddress"));
        WebElement PermanentAdress = driver.findElement(By.id("permanentAddress"));
        WebElement Submit = driver.findElement(By.id("submit"));
        //NOK WebElement Submit = driver.findElement(By.className("btn btn-primary"));

        FullName.sendKeys("eee");
        //caz test OK: email.sendKeys("test@itschool.com");
        email.sendKeys("test");
        CurrentAdress.sendKeys("a");
        PermanentAdress.sendKeys("b");

        Submit.click();

        String classAttribute = email.getAttribute("class");
        System.out.println(classAttribute);
        Assert.assertTrue(classAttribute.contains("field-error")); // testare ca testul este NOK

        WebElement output = driver.findElement(By.id("output"));
        Assert.assertTrue(output.isDisplayed());

        //Actions actions = new Actions(driver);
        //actions.scrollToElement(submit).perform(); //aduce obiectul in partea din mijlo a paginii
    }
}
