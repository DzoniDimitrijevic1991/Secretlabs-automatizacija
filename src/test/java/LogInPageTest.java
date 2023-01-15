import PAGES.LogInPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInPageTest extends BaseTest {

    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");

    }
    @Test
    public void testValidUserNameAndPassword() {
        login.validLogIn();
        String logInPageExpected="https://www.saucedemo.com/inventory.html";
        String realLogInPage= driver.getCurrentUrl();
        Assert.assertTrue("neuspesan log in",logInPageExpected.equals(realLogInPage));

    }

    @Test
    public void testInvalidUserNameValidPassword() {

        login.enterUserName("Nikola");
        login.enterPassword("secret_sauce");
        login.logInButton();
        String expectedMessageAfterLogInFailed="Epic sadface: Username and password do not match any user in this service";
        String realMessageAfterLogInFailed=driver.findElement(login.textMessageAfterLogInFailed).getText();
        Assert.assertTrue("uspesan log in",expectedMessageAfterLogInFailed.equals(realMessageAfterLogInFailed));
    }

    @Test
    public void testValidUserNameInvalidPassword() {
        login.enterUserName("standard_user");
        login.enterPassword("Nikola");
        login.logInButton();
        String expectedMessageAfterLogInFailed="Epic sadface: Username and password do not match any user in this service";
        String realMessageAfterLogInFailed=driver.findElement(login.textMessageAfterLogInFailed).getText();
        Assert.assertTrue("uspesan log in",expectedMessageAfterLogInFailed.equals(realMessageAfterLogInFailed));
    }

    @Test
    public void testInvalidUserNameInvalidPassword() {
        login.enterUserName("Nikola");
        login.enterPassword("Dimitrijevic");
        login.logInButton();
        String expectedMessageAfterLogInFailed="Epic sadface: Username and password do not match any user in this service";
        String realMessageAfterLogInFailed=driver.findElement(login.textMessageAfterLogInFailed).getText();
        Assert.assertTrue("uspesan log in",expectedMessageAfterLogInFailed.equals(realMessageAfterLogInFailed));

    }

    @Test
    public void testWithoutEnteringUserNameAndPassword() {

        login.logInButton();
        String expectedMessageAfterLogInFailed="Epic sadface: Username is required";
        String realMessageAfterLogInFailed=driver.findElement(login.textMessageAfterLogInWithoutTextInputFailed).getText();
        Assert.assertTrue("uspesan log in",expectedMessageAfterLogInFailed.equals(realMessageAfterLogInFailed));

    }
}
