package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import utils.BasePage;

public class MainPage extends BasePage {

    static By versionNumberLocator = By.xpath("//div[@class='j-homescreen-alert']/descendant::*/span[2]");
    static By streamLocator = By.xpath("//a[normalize-space()='Stream']");
    static By commentPlaceHolder = By.xpath("//div[@class='add-comment-interactions']");
    static By commentInput = By.id("js-add-comment-field");
    static By commentButton = By.xpath("//span[@class='ladda-label'][normalize-space()='Comment']");



    public static void searchForVersion(String version) throws InterruptedException {
        By versionLocator = By.xpath("//*[contains(text(), '" + version + "')]");
        Assert.assertTrue(findElement(versionLocator).isDisplayed());
        System.out.println(findElement(versionLocator).getText());
    }

    public static void clickStream() throws InterruptedException {
        clickElement(streamLocator);
    }

    public static void enterComment(String comment) throws InterruptedException {
//        scrollToElement(findElement(commentInput));
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
