package pages;

import org.junit.Assert;
import utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import utils.BasePage;

import java.time.Duration;

public class LoginPage extends BasePage {

    static By usernameLocator = By.name("user-name");
    static By passwordLocator = By.id("password");
    static By loginButton = By.xpath("//input[@type='submit'][@data-test='login-button']");

     public static void userIsOnLoginPage() throws InterruptedException {
         System.setProperty("webdriver.chrome.driver",
         "src\\main\\resources\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get(baseUrl);
         Assert.assertTrue(findElement(usernameLocator).isDisplayed());
     }

     public static void enterUsername(String username) throws InterruptedException {
         typeText(usernameLocator, username);
     }

     public static void enterPassword(String password) throws InterruptedException {
         typeText(passwordLocator, password);
     }

     public static void clickLoginButton() throws InterruptedException {
         clickElement(loginButton);
     }

}
