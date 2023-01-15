package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YourCartPage {

    WebDriver driver=new ChromeDriver();


    public By checkoutButton= By.id("checkout");

    public By removeItemButton=By.xpath("//button[text()=\"Remove\"]");

    public By continueShoppingButton=By.xpath("//button[@data-test=\"remove-sauce-labs-backpack\"]");

    public By sauceLabsBackPackItem=By.xpath("//div[text()=\"Sauce Labs Backpack\"]");

    public By removeBackPack=By.id("remove-sauce-labs-backpack");

    public By removeFleeceJacket=By.id("remove-sauce-labs-fleece-jacket");

    public By sauceLabsFleeceJacketItem=By.xpath("//div[text()=\"Sauce Labs Fleece Jacket\"]");

    public By priceForItemSauceLabsBackpack=By.xpath("//div[text()=\"29.99\"]");

    public By priceForItemSauceLabsFleeceJacket=By.xpath("//div[text()=\"49.99\"]");

    public By priceForItemSauceLabsBikeLight=By.xpath("//div[text()=\"9.99\"]");

    public By priceForItemSauceLabsOnesie=By.xpath("//div[text()=\"7.99\"]");

    public By priceForItemSauceLabsBoltTshirt=By.xpath("//div[text()=\"15.99\"]");

    public By sideBarInvertory=By.id("inventory_sidebar_link");
    public By sideBarAbout=By.id("about_sidebar_link");

    public By sideBarLogout=By.id("logout_sidebar_link");

    public By sideBarReset=By.id("reset_sidebar_link");

    public By itemSauceLabsBackpackPrice=By.xpath("//div[text()=\"29.99\"]");

    public By itemSauceLabsFleeceJacket=By.xpath("//div[text()=\"49.99\"]");

    public double priceForSauceLabsBackPack=29.99;
    public double priceForSauceLabsFleeceJacket=49.99;

    public double priceForSauceLabsBikeLight=9.99;
    public double priceForSauceLabsBoltTshirt=15.99;
    public double priceForSauceLabsOnesie=7.99;

    public double priceForTestAllTheThingsTshirt=15.99;
    public double taxPrice=6.40;

    public YourCartPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickOnCheckoutButton(){
        driver.findElement(checkoutButton).click();
    }
    public boolean itemSauceLabsBackpack(){
        return driver.findElement(sauceLabsBackPackItem).isDisplayed();
    }
    public boolean itemSauceLabsFleeceJacket(){
        return driver.findElement(sauceLabsFleeceJacketItem).isDisplayed();
    }


}
