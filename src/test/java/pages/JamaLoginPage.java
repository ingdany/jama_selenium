package pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.junit.Assert;
import utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JamaLoginPage extends BasePage {

    static By versionNumberLocator = By.xpath("//div[@class='j-homescreen-alert']/descendant::*/span[2]");
    static By usernameInput = By.id("j_username");
    static By passwordInput = By.id("j_password");
    static By loginButton = By.id("loginButton");

    public static String getVersion() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        String version = findElement(versionNumberLocator).getText();
        return version;
    }

    public static void enterUsername(String username) throws InterruptedException {
        typeText(usernameInput, username);
    }

    public static void enterPassword(String password) throws InterruptedException {
        typeText(passwordInput, password);
    }

    public static void clickLoginButton() throws InterruptedException {
        clickElement(loginButton);
    }

}
