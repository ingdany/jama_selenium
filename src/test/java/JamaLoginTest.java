import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.Random;
import utils.BasePage;

import static pages.JamaLoginPage.*;
import static pages.MainPage.*;
import static pages.StreamPage.*;

public class JamaLoginTest extends BasePage {
    String version;

    @BeforeClass
    public void setUp() throws InterruptedException {
        version = getVersion();
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][] {
                { "qat_user", "3TZqWxtiu4w7ZSF" },
        };
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) throws InterruptedException {
        try {
            enterUsername(username);
            enterPassword(password);
            clickLoginButton();
            searchForVersion(version);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    @Test
    public void testStream() throws InterruptedException {
        try {
            String randomText = "Comment " + Integer.toString(new Random().nextInt(1000));
            clickStream();
            enterComment(randomText);
            clickCommentButton();
            searchAddedComment(randomText);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    @AfterClass
    public void tearDown() throws InterruptedException{
        try {
            if (this.driver != null) {
                this.driver.quit();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
