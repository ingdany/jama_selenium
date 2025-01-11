import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static pages.LoginPage.*;
import static pages.ProductsPage.*;

public class LoginTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() throws InterruptedException {
        userIsOnLoginPage();
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][] {
                { "standard_user", "secret_sauce" },
                { "locked_out_user", "secret_sauce" },
                { "problem_user", "secret_sauce" },
                { "performance_glitch_user", "secret_sauce" }
        };
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) throws InterruptedException {
        try {
            enterUsername(username);
            enterPassword(password);
            clickLoginButton();
            userWillRedirectToProductsPage();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
