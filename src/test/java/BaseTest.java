import PAGES.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    static WebDriver driver;

    LogInPage login=new LogInPage(driver);
    ProductsPage productpage = new ProductsPage(driver);

    YourCartPage yourcart = new YourCartPage(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    CheckoutYourInformationPage infopage=new CheckoutYourInformationPage(driver);

    CheckoutOverviewPage overviewpage=new CheckoutOverviewPage(driver);

    CheckoutCompletePage completePage=new CheckoutCompletePage(driver);
    @BeforeClass
    public static void beforeClass() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void afterClass() throws Exception {
        driver.quit();
    }
}
