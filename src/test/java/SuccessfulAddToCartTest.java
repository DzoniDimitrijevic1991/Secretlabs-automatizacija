import PAGES.LogInPage;
import PAGES.ProductsPage;
import PAGES.YourCartPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuccessfulAddToCartTest extends BaseTest  {



    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");
        login.validLogIn();
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(1000);
    }

    @Test
    public void successfulAddToCartTest() {
        productpage.addSauceLabsBackpackItem();
        productpage.addSauceLabsFleeceJacket();
        productpage.clickOnCartIcon();
        String expectedItemOne="Sauce Labs Backpack";
        String expectedItemTwo="Sauce Labs Fleece Jacket";
        String realItemOne=driver.findElement(yourcart.sauceLabsBackPackItem).getText();
        String realItemTwo=driver.findElement(yourcart.sauceLabsFleeceJacketItem).getText();
        Assert.assertTrue("pogresan predmet dodat",realItemOne.equals(expectedItemOne));
        Assert.assertTrue("pogresan predmet dodat",expectedItemTwo.equals(realItemTwo));





    }
}
