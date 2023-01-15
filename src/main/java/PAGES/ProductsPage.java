package PAGES;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductsPage {

    WebDriver driver=new ChromeDriver();

    public By sauceLabsBackpackItem=By.xpath("//div[text()=\"Sauce Labs Backpack\"]");
    public By sauceLabsBikeLightItem=By.xpath("//div[text()=\"Sauce Labs Bike Light\"]");
    public By sauceLabsBoltTshirtItem=By.xpath("//div[text()=\"Sauce Labs Bolt T-Shirt\"]");
    public By sauceLabsFleeceJacketItem=By.xpath("//div[text()=\"Sauce Labs Fleece Jacket\"]");
    public By sauceLabsOnesieItem=By.xpath("//div[text()=\"Sauce Labs Onesie\"]");
    public By sauceTestAllThingsItem=By.xpath("//div[text()=\"Test.allTheThings() T-Shirt (Red)\"]");

    public By twitterLogoButton=By.xpath("//a[text()=\"Twitter\"]");

    public By facebookLogoButton=By.xpath("//a[text()=\"Facebook\"]");

    public By linkedInLogoButton=By.xpath("//a[text()=\"LinkedIn\"]");

    public By facebookTextLogo=By.xpath("//*[text()=\"Facebook\"]");

    public By addToCartSauceLabsBackpack=By.id("add-to-cart-sauce-labs-backpack");
    public By addToCartSauceLabsBikeLight=By.id("add-to-cart-sauce-labs-bike-light");

    public By addToCartSauceLabsBoltTshirt=By.id("add-to-cart-sauce-labs-bolt-t-shirt");

    public By addToCartSauceLabsFleeceJacket=By.id("add-to-cart-sauce-labs-fleece-jacket");

    public By addToCartSauceLabsOnesie=By.id("add-to-cart-sauce-labs-onesie");

    public By addToCartSauceTestAllThings=By.id("add-to-cart-test.allthethings()-t-shirt-(red)");

    public By cartIconButton=By.id("shopping_cart_container");

    public By removeSauceLabsBackpack=By.id("remove-sauce-labs-backpack");

    public By removeSauceLabsFleeceJacket=By.id("remove-sauce-labs-fleece-jacket");

    public By removeSauceLabsBikeLight=By.id("remove-sauce-labs-bike-light");

    public By removeSauceLabsBoltTshirt=By.id("remove-sauce-labs-bolt-t-shirt");

    public By removeSauceLabsOnesie=By.id("remove-sauce-labs-onesie");

    public By removeSauceTestAllThings=By.id("remove-test.allthethings()-t-shirt-(red)");

    public By imageSauceLabsBoltTshirt=By.xpath("//img[@src=\"/static/media/bolt-shirt-1200x1500.c0dae290.jpg\"]");

    public By imageSauceLabsOnesie=By.xpath("//img[@src=\"/static/media/red-onesie-1200x1500.1b15e1fa.jpg\"]");

    public By imageSauceTestAllThings=By.xpath("//img[@src=\"/static/media/red-tatt-1200x1500.e32b4ef9.jpg\"]");

    public By imageSauceLabsFleeceJacket=By.xpath("//img[@src=\"/static/media/sauce-pullover-1200x1500.439fc934.jpg\"]");

    public By imageSauceLabsBikeLight=By.xpath("src=\"/static/media/bike-light-1200x1500.a0c9caae.jpg\"");

    public By imageSauceLabsBackpack=By.xpath("//img[@src=\"/static/media/sauce-backpack-1200x1500.34e7aa42.jpg\"]");
    public By sideBarInvertory=By.id("inventory_sidebar_link");
    public By sideBarAbout=By.id("about_sidebar_link");

    public By sideBarLogout=By.id("logout_sidebar_link");

    public By sideBarReset=By.id("reset_sidebar_link");

    public ProductsPage(WebDriver driver){
        this.driver=driver;
    }
    public void addSauceLabsBackpackItem(){
        driver.findElement(addToCartSauceLabsBackpack).click();
    }
    public void addSauceLabsFleeceJacket(){
        driver.findElement(addToCartSauceLabsFleeceJacket).click();
    }
    public void clickOnCartIcon(){
        driver.findElement(cartIconButton).click();
    }
    public void addSauceLabsBikeLight(){
        driver.findElement(addToCartSauceLabsBikeLight).click();
    }
    public void addSauceLabsOnesie(){
        driver.findElement(addToCartSauceLabsOnesie).click();
    }
    public void AddToCartSauceLabsBoltTshirt(){
        driver.findElement(addToCartSauceLabsBoltTshirt).click();
    }
    public void addSauceTestAllThingsItem(){
        driver.findElement(addToCartSauceTestAllThings).click();
    }
    public void clickOnFacebookLogo(){
        driver.findElement(facebookLogoButton).click();
    }public void clickOnTwitterLogo(){
        driver.findElement(twitterLogoButton).click();
    }
    public void clickOnLinkedInLogo(){
        driver.findElement(linkedInLogoButton).click();
    }






}
