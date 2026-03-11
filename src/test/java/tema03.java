import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class tema03 {

    /* 1.	Creaza un test, pornind de la URL-ul:
     https://demoqa.com/automation-practice-form
    a.	Gaseste campul First Name folosind Xpath, bazat pe placeholder
    b.	Introdu in acel camp valoarea “Test”
    c.	Gaseste campul Last Name folosing XPath bazat pe atributul id
    d.	Introdu valoarea “User”
    e.	Gaseste campul Email folosing XPath bazat pe atributul id
    f.	Introdu textul “test@email.com”
    g.	Apasa oricare din butoanele radio de la Gender
    h.	Introdu un numar de telefon in campul pentru Mobile
    i.	Introdu un text in campul pentru ‘Subjects’
    j.	Introdu un text in campul pentru ‘Current Address’
    k.	Gaseste butonul Submit dupa text si apasa folosind click
    l.	BONUS optional: verifica aparitia pop-up-ului de confirmare si apasa pe butonul Close
*/
//    @Test
//    public void demoqaForm() {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demoqa.com/automation-practice-form");
//
//        // a. Gaseste campul First Name folosind Xpath, bazat pe placeholder
//        WebElement FirstName = driver.findElement(By.xpath("//input[contains(@placeholder,'First Name')]"));
//        // b. Introdu in acel camp valoarea “Test”
//        FirstName.sendKeys("Test");
//        // c. Gaseste campul Last Name folosing XPath bazat pe atributul id
//        WebElement LastName = driver.findElement(By.id("lastName"));
//        // d.	Introdu valoarea “User”
//        LastName.sendKeys("User");
//        // e.	Gaseste campul Email folosing XPath bazat pe atributul id
//        WebElement Email = driver.findElement(By.xpath("//input[contains(@id,'userEmail')]"));
//        // f.	Introdu textul “test@email.com”
//        Email.sendKeys("test@email.com");
//        // g.	Apasa oricare din butoanele radio de la Gender
//        WebElement Radio2 = driver.findElement(By.xpath("//input[contains(@id,'gender-radio-2')]"));
//        Radio2.click(); // ??
//        // h. Introdu un numar de telefon in campul pentru Mobile
//        WebElement Mobile = driver.findElement(By.xpath("//input[contains(@id,'userNumber')]"));
//        Mobile.sendKeys("0752000111");
//        // i.	Introdu un text in campul pentru ‘Subjects’
//        WebElement Subjects = driver.findElement(By.xpath("//div[contains(@class,'subjects-auto-complete__input-container css-19bb58m')]"));
//        // Subjects.sendKeys("automation");
//        // j.	Introdu un text in campul pentru ‘Current Address’
//        WebElement CurrentAddress = driver.findElement(By.xpath("//textarea[contains(@id,'currentAddress')]"));
//        CurrentAddress.sendKeys("bd. Tudor Vladimirescu, nr 31");
//        // k.	Gaseste butonul Submit dupa text si apasa folosind click
//        //WebElement Submit = driver.findElement(By.xpath("//button[text()='Submit']"));
//        //WebElement Submit = driver.findElement(By.xpath("//button[contains(.,'Submit')]"));
////        driver.findElement(By.xpath("//button[text()='Close']")).click();
////        WebElement Submit = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
//        //WebElement Submit = driver.findElement(By.xpath("//button[text()= btn btn-primary']"));
//        //WebElement Submit = driver.findElement(By.id("submit"));
//        //Submit.click();
//    }
  /*
    2.	Creaza un test, pornind de la URL-ul https://demoqa.com/webtables
    a.	Da click pe butonul ‘Add’
    b.	Completeaza toate campurile din pop-up-ul care se deschide
    c.	Da click pe butonul Submit
     */
    @Test
    public void demoqaWebTab() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement Add = driver.findElement(By.xpath("//button[contains('addNewRecordButton')]"));
        //WebElement addButton = driver.findElement(By.xpath("//button[contains(@id,'addNewRecordButton')]"));
//        WebElement addButton = wait.until(
//                ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@id,'addNewRecordButton')]")));
        WebElement button = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("addNewRecordButton")));

        button.click();

        WebElement FirstName = driver.findElement(By.xpath("//input[contains(@placeholder,'First Name')]"));
        WebElement LastName = driver.findElement(By.xpath("//input[contains(@placeholder,'Last Name')]"));
        WebElement Email = driver.findElement(By.xpath("//input[contains(@placeholder,'name@example.com')]"));
        WebElement Age = driver.findElement(By.xpath("//input[contains(@placeholder,'Age')]"));
        WebElement Salary = driver.findElement(By.xpath("//input[contains(@placeholder,'Salary')]"));
        WebElement Department = driver.findElement(By.xpath("//input[contains(@placeholder,'Department')]"));
        FirstName.sendKeys("A");
        LastName.sendKeys("B");
        Email.sendKeys("a.b@hmail.com");
        Age.sendKeys("25");
        Salary.sendKeys("7000");
        Department.sendKeys("IT");
//        WebElement Submit = driver.findElement(
//                By.xpath("(//button[contains(@type,'submit')]"));
        
        WebElement submit = wait.until(
                ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']"))
        );
        Thread.sleep(1000);
        submit.click();

    }
}

//button[contains(@type,"button")]parents::div