package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import utils.BasePage;

public class MainPage extends BasePage {

    static By versionNumberLocator = By.xpath("//div[@class='j-homescreen-alert']/descendant::*/span[2]");
    static By streamLocator = By.xpath("//a[normalize-space()='Stream']");


    public static void searchForVersion(String version) throws InterruptedException {
        By versionLocator = By.xpath("//*[contains(text(), '" + version + "')]");
        Assert.assertTrue(findElement(versionLocator).isDisplayed());
        System.out.println(findElement(versionLocator).getText());
    }

    public static void clickStream() throws InterruptedException {
        clickElement(streamLocator);
    }

}
