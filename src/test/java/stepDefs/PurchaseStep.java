package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.CheckoutPage.*;

public class PurchaseStep {
    @Given("You have an item in the Cart")
    public void youHaveAnItemInTheCartStep() throws InterruptedException {
        verifyCartItem();
    }

    @When("Click the Checkout Button")
    public void clickTheCheckoutButtonStep() throws InterruptedException {
        clickCheckoutButton();
    }

    @And("Fill the User Information")
    public void fillTheUserInformationStep() throws InterruptedException {
        typeFirstName("John");
        typeLastName("Doe");
        typeZipCode("12345");
    }

    @And("Click the Continue Button")
    public void clickTheContinueButtonStep() throws InterruptedException {
        clickContinueButton();
    }

    @Then("Will Complete the Order")
    public void willCompleteTheOrderStep() throws InterruptedException {
        clickFinishButton();
    }
}
