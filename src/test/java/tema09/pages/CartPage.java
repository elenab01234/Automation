package tema09.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//verificarea produselor din coș
public class CartPage extends BasePage {
    private By prodNameCart = By.xpath("//*[contains(@data-test,'product-title')]");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    //metodă: isProductInCart(String productName)-verifică dacă un produs există în coș
    public boolean isProductInCart(String productName) {
        return productName.equals(extractText(prodNameCart));
    }
}