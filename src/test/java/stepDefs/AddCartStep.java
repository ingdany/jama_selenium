package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.LoginPage.*;
import static pages.ProductsPage.*;
import static pages.CheckoutPage.*;

public class AddCartStep {
    @Given("User is in Product Page")
    public void userIsInProductPageStep() throws InterruptedException {
        userIsOnLoginPage();
        enterUsername("standard_user");
        enterPassword("secret_sauce");
        clickLoginButton();
        userWillRedirectToProductsPage();
    }

    @When("Select a Product")
    public void selectAProductStep() throws InterruptedException {
        clickAddToCart(1);
    }

    @And("Click the Shopping Cart Icon")
    public void clickTheShoppingCartIconStep() throws InterruptedException {
        clickShoppingCartLink();
    }

    @Then("User will redirect to Your Cart Page")
    public void userWillRedirectToYourCartPageStep() throws InterruptedException {
        verifyYourCartTitle();
    }
}
