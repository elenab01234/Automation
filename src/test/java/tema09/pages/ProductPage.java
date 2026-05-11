package tema09.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//extragerea informațiilor despre produs
//adăugarea produsului în coș
public class ProductPage extends BasePage {
    private By prodName = By.xpath("//*[@data-test='product-name']");
    private By prodPrice = By.xpath("//*[@data-test='unit-price']");
    private By addToCart = By.id("btn-add-to-cart");
    private By goToCart = By.xpath("//*[@data-test='cart-quantity']");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    // metodă pentru obținerea numelui produsului
    public String getProductName() {
        return extractText(prodName);
    }

    // metodă pentru obținerea prețului produsului
    public String getProductPrice(){
        return extractText(prodPrice);
    }

    //metodă: addToCart()- adaugă produsul în coș
    public void addToCart(){
        clickElement(addToCart);
    }

    public void openCart(){
        clickElement(goToCart);
    }
}