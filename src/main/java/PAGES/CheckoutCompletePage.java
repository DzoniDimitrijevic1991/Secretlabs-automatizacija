package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutCompletePage {

    WebDriver driver=new ChromeDriver();

    public By backHomeButton=By.id("back-to-products");

    public By thankYouForOrderMessage=By.xpath("//h2[text()=\"THANK YOU FOR YOUR ORDER\"]");

    public By checkoutCompletePageName=By.xpath("//span[text()=\"Checkout: Complete!\"]");

    public By sideBarInvertory=By.id("inventory_sidebar_link");
    public By sideBarAbout=By.id("about_sidebar_link");

    public By sideBarLogout=By.id("logout_sidebar_link");

    public By sideBarReset=By.id("reset_sidebar_link");



    public CheckoutCompletePage(WebDriver driver){
        this.driver=driver;
    }

}
