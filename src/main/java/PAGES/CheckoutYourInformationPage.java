package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutYourInformationPage {

    WebDriver driver=new ChromeDriver();

    public By firstNameTextInputField=By.xpath("//input[@placeholder=\"First Name\"]");

    public By lastNameTextInputField=By.cssSelector("input[placeholder=\"Last Name\"]");

    public By postalCodeInputField=By.id("postal-code");

    public By continueButton=By.cssSelector("input[name=\"continue\"]");

    public By checkoutYourInformationPageName=By.xpath("//span[text()=\"Checkout: Your Information\"]");

    public By sideBarInvertory=By.id("inventory_sidebar_link");
    public By sideBarAbout=By.id("about_sidebar_link");

    public By sideBarLogout=By.id("logout_sidebar_link");

    public By sideBarReset=By.id("reset_sidebar_link");

    public void validLogIn(){
        driver.findElement(firstNameTextInputField).sendKeys("Nikola");
        driver.findElement(lastNameTextInputField).sendKeys("Dimitrijevic");
        driver.findElement(postalCodeInputField).sendKeys("11000");
    }
    public CheckoutYourInformationPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickOnContinueButton(){
        driver.findElement(continueButton).click();
    }






}
