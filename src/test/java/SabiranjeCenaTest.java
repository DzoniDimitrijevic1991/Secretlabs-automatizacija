import org.junit.*;

import java.util.Scanner;

public class SabiranjeCenaTest extends BaseTest {

    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void sabiranjeCenaTest() {
        login.validLogIn();
        productpage.addSauceLabsBackpackItem();
        productpage.addSauceLabsFleeceJacket();
        productpage.clickOnCartIcon();
        yourcart.clickOnCheckoutButton();
        infopage.validLogIn();
        double firstItemPrice= (double) yourcart.priceForSauceLabsBackPack;
        double secondItemPrice= (double) yourcart.priceForSauceLabsFleeceJacket;
        double taxPrice= (double) overviewpage.taxPrice;
        double tPrice=firstItemPrice+secondItemPrice+taxPrice;
        Assert.assertEquals(86.38,tPrice,0.1);
    }

}
