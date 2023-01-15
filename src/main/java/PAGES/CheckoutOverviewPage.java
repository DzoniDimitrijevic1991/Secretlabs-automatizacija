package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutOverviewPage {

    WebDriver driver = new ChromeDriver();

    public By finishPurchaseButton = By.cssSelector("button[data-test=\"finish\"]");

    public By sauceLabsBackpackPrice = By.xpath("//div[text()=\"49.99\"]");

    public By sauceLabsFleeceJacketPrice = By.xpath("//div[text()=\"29.99\"]");

    public By taxPrice1=By.xpath("//div[text()=\"6.40\"]");


    public By cancelButton = By.id("cancel");
    public By totalPrice = By.xpath("//div[text()=\"86.38\"]");

    public double taxPrice = 6.40;


    public By checkoutOverviewPageName = By.xpath("//span[text()=\"Checkout: Overview\"]");
    public By sideBarInvertory = By.id("inventory_sidebar_link");
    public By sideBarAbout = By.id("about_sidebar_link");

    public By sideBarLogout = By.id("logout_sidebar_link");

    public By sideBarReset = By.id("reset_sidebar_link");


    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnFinishButton (){
        driver.findElement(finishPurchaseButton);
    }

}








