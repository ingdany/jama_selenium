package pages;
import utils.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.stream.IntStream;

public class ProductsPage extends BasePage {

    static By container = By.id("inventory_container");
    static By addToCart = By.className("btn_primary");
    static By shoppingCartLink = By.id("shopping_cart_container");


    public static void userWillRedirectToProductsPage() throws InterruptedException {
        Assert.assertTrue(findElement(container).isDisplayed());
    }


    public static void clickAddToCart(int items) throws InterruptedException {
        IntStream.range(0, items)
                .forEach(
                        i -> {
                            clickElement(addToCart);
                        });
    }

    public static void clickShoppingCartLink() throws InterruptedException {
        clickElement(shoppingCartLink);
    }


}
