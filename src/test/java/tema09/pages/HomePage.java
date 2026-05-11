package tema09.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// accesarea paginii principale
// selectarea unui produs din listă
public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //  metodă pentru deschiderea aplicației
    public void openApp() {
        driver.get("https://practicesoftwaretesting.com/");
    }

    //  metodă: clickOnProduct(String productName)-selectează un produs după nume și navighează către pagina de detalii
    public void clickOnProduct(String productName){
        clickElement(By.xpath("//h5[contains(text(),'" + productName + "')]"));
    }
}