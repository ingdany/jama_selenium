package stepDefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static pages.LoginPage.*;
import static pages.ProductsPage.*;

public class LoginStep {

    @Given("User is on Login Page")
    public void userIsOnLoginPageStep() throws InterruptedException {
        userIsOnLoginPage();
    }

    @When("User fill {string} and {string}")
    public void userFillUsernameAndPasswordStep(String username, String password) throws InterruptedException {
        enterUsername(username);
        enterPassword(password);
    }

    @And("User click Login button")
    public void userClickLoginButtonStep() throws InterruptedException {
        clickLoginButton();
    }

    @Then("User will redirect to Products page")
    public void userWillRedirectToProductsPageStep() throws InterruptedException {
        userWillRedirectToProductsPage();
    }


}
