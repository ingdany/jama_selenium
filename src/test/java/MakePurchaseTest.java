import org.testng.annotations.Test;

import static pages.LoginPage.*;
import static pages.ProductsPage.*;
import static pages.CheckoutPage.*;

public class MakePurchaseTest {

    @Test
    public void testFirstPurchase() throws InterruptedException {
        try {
            String username = "standard_user";
            String password = "secret_sauce";
            userIsOnLoginPage();
            enterUsername(username);
            enterPassword(password);
            clickLoginButton();
            userWillRedirectToProductsPage();
            clickAddToCart(1);
            clickShoppingCartLink();
            verifyYourCartTitle();
            verifyCartItem();
            clickCheckoutButton();
            typeFirstName("John");
            typeLastName("Doe");
            typeZipCode("12345");
            clickContinueButton();
            clickFinishButton();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    @Test()
    public void testSecondPurchase() throws InterruptedException {
        try {
            String username = "standard_user";
            String password = "secret_sauce";
            userIsOnLoginPage();
            enterUsername(username);
            enterPassword(password);
            clickLoginButton();
            userWillRedirectToProductsPage();
            clickAddToCart(1);
            clickShoppingCartLink();
            verifyYourCartTitle();
            verifyCartItem();
            clickCheckoutButton();
            typeFirstName("James");
            typeLastName("Pipkins");
            typeZipCode("84888");
            clickContinueButton();
            clickFinishButton();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

}
