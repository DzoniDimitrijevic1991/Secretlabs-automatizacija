import PAGES.LogInPage;
import PAGES.ProductsPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class socialNetworkLogoButtonTest extends BaseTest  {

    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");
        login.validLogIn();
    }

    @Test
    public void twitterLogoButtonTest() throws InterruptedException {

        js.executeScript("window.scrollBy(0,250)", "");
        productpage.clickOnTwitterLogo();
        Thread.sleep(2000);
        String expectedPageUrl="https://twitter.com/saucelabs";
        String realTitle=driver.getCurrentUrl();
        Assert.assertTrue("pogresan url",expectedPageUrl.equals(realTitle));
        //umesto ocekivanog url-a https://twitter.com/saucelabs otvara se stranica https://www.saucedemo.com/inventory.html

    }

    @Test
    public void facebookLogoButtonTest() throws InterruptedException {

        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,250)", "");
        productpage.clickOnFacebookLogo();
        Thread.sleep(2000);
        String expectedPageText="Facebook";
        String realPageText=driver.findElement(productpage.facebookTextLogo).getText();
        Assert.assertTrue("pogresan text",expectedPageText.equals(realPageText));
    }

    @Test
    public void linkeInPageTest() {
        js.executeScript("window.scrollBy(0,250)", "");
        productpage.clickOnLinkedInLogo();
        String expectedPageUrl="https://www.linkedin.com/company/sauce-labs/";
        String realPageUrl=driver.getCurrentUrl();
        Assert.assertTrue("pogresan url",expectedPageUrl.equals(realPageUrl));
//umesto ocekivanog url-a https://www.linkedin.com/company/sauce-labs/ otvara se stranica https://www.saucedemo.com/inventory.html
    }
}
