package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import utils.BasePage;

public class StreamPage extends BasePage {

    static By commentPlaceHolder = By.xpath("//div[@class='add-comment-interactions']");
    static By commentInput = By.id("js-add-comment-field");
    static By commentButton = By.xpath("//span[@class='ladda-label'][normalize-space()='Comment']");

    public static void enterComment(String comment) throws InterruptedException {
        clickElement(commentPlaceHolder);
        findElement(commentInput).isDisplayed();
        typeText(commentInput, comment);
    }

    public static void clickCommentButton() throws InterruptedException {
        clickElement(commentButton);
    }

    public static void searchAddedComment(String comment) throws InterruptedException {
        By commentLocator = By.xpath("//*[contains(text(), '" + comment + "')]");
        scrollToElement(findElement(commentLocator));
        Assert.assertTrue(findElement(commentLocator).isDisplayed());
        System.out.println(findElement(commentLocator).getText());
    }
}
