
package tema09.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import tema09.pages.HomePage;
import tema09.pages.CartPage;
import tema09.pages.ProductPage;
import java.time.Duration;

public class Teste {
    WebDriver driver;

    //    Test 1 – Adăugare produs în coș
    @Test
    public void test_AdaugareProdusInCos() {
        //    Deschide aplicația
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        HomePage homePage = new HomePage(driver);
        homePage.openApp();

        //    Selectează un produs (ex: “Hammer” sau alt produs disponibil)
        homePage.clickOnProduct("Hammer");

        //    Accesează pagina de detalii a produsului
        ProductPage productPage = new ProductPage(driver);

        //    Salvează numele produsului într-o variabilă
        String prodName = productPage.getProductName();
        System.out.println(prodName);
        System.out.println(productPage.getProductPrice());

        //    Adaugă produsul în coș
        productPage.addToCart();

        //    Accesează pagina de cart
        productPage.openCart();
        CartPage cartPage = new CartPage(driver);

        //    Verifică faptul că produsul apare în coș
        Assert.assertTrue(cartPage.isProductInCart(prodName),"Produsul nu este in cosul de produse" );


        if (driver != null) {
            driver.quit();
        }
    }

    //    Test 2 – Verificare detalii produs
    @Test
    public void test_VerificareDetaliiProdus() {
        //    Deschide aplicația
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        HomePage homePage = new HomePage(driver);
        homePage.openApp();

        //    Selectează un produs
        homePage.clickOnProduct("Hammer");

        //    Accesează pagina de detalii
        ProductPage productPage = new ProductPage(driver);

        //    Verifică: numele produsului NU este gol
        String prodName = productPage.getProductName();
        Assert.assertFalse(prodName.isEmpty(), " Numele produsului este gol");

        //    Verifică: prețul produsului este mai mare decât 0
        String prodPrice = productPage.getProductPrice();
        Assert.assertTrue(Float.parseFloat(prodPrice) > 0,"Pretul produsului este mai mic ca 0");

        if (driver != null) {
            driver.quit();
        }
    }

}