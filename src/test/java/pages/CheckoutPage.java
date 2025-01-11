package pages;
import utils.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;



public class CheckoutPage extends BasePage {
    static By yourCartTitle = By.id("cart_contents_container");
    static By cartQuantity = By.className("cart_quantity");
    static By checkoutButton = By.className("btn_action");
    static By firstNameTextBox = By.id("first-name");
    static By lastNameTextBox = By.id("last-name");
    static By postalCodeTextBox = By.id("postal-code");
    static By continueButton = By.className("btn_primary");
    static By finishButton = By.className("btn_action");


    public static void verifyYourCartTitle() throws InterruptedException {
        Assert.assertTrue(findElement(yourCartTitle).isDisplayed());
    }

    public static void verifyCartItem() throws InterruptedException {
        Assert.assertEquals("1", findElement(cartQuantity).getText());
    }

    public static void clickCheckoutButton() throws InterruptedException {
        clickElement(checkoutButton);
    }

    public static void typeFirstName(String firstName) throws InterruptedException {
        typeText(firstNameTextBox, firstName);
    }

    public static void typeLastName(String lastName) throws InterruptedException {
        typeText(lastNameTextBox, lastName);
    }

    public static void typeZipCode(String zipCode) throws InterruptedException {
        typeText(postalCodeTextBox, zipCode);
    }

    public static void clickContinueButton() throws InterruptedException {
        clickElement(continueButton);
    }

    public static void clickFinishButton() throws InterruptedException {
        clickElement(finishButton);
        driver.quit();
    }
}
