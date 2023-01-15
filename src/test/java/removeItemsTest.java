import PAGES.LogInPage;
import PAGES.ProductsPage;
import PAGES.YourCartPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class removeItemsTest extends BaseTest {

    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");
        login.validLogIn();
    }


    @Test
    public void removeItemTest() {
        productpage.addSauceLabsBackpackItem();
        productpage.addSauceLabsFleeceJacket();
        productpage.clickOnCartIcon();
        boolean itemOne = yourcart.itemSauceLabsBackpack();
        boolean expectedItemOne = false;
        boolean itemTwo = yourcart.itemSauceLabsFleeceJacket();
        boolean expectedItemTwo = false;
        driver.findElement(yourcart.removeBackPack).click();
        driver.findElement(yourcart.removeFleeceJacket).click();
        Assert.assertTrue("proizvod vidljiv", itemOne != expectedItemOne);
        Assert.assertTrue("proizvod vidljiv",itemTwo != expectedItemTwo);
    }
}