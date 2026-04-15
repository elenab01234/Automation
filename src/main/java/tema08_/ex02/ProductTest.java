package tema08_.ex02;
import org.testng.annotations.Test;
import org.testng.Assert;

public class ProductTest {
    public int testPrice;
    @Test
    public void testValidPrice() {
        Product product = new Product();
        testPrice = 3500;
        product.setName("Laptop");
        product.setPrice(testPrice);
        Assert.assertTrue(testPrice>0, "Price should be greater than 0");

        System.out.println("Product: " + product.getName() + "price is " + product.getPrice());
    }

    @Test
    public void testInvalidPriceZero() {
        Product product = new Product();
        testPrice = 0;
        product.setName("Mouse");
        product.setPrice(testPrice);
        Assert.assertTrue(testPrice>0, "Price should be greater than 0");

        System.out.println("Product: " + product.getName() + "price is " + product.getPrice());
    }

    @Test
    public void testInvalidPriceNegative() {
        Product product = new Product();
        testPrice = -50;
        product.setName("Casti");
        product.setPrice(testPrice);
        Assert.assertTrue(testPrice>0, "Price should be greater than 0");

        System.out.println("Product: " + product.getName() + "price is " + product.getPrice());
    }


}
