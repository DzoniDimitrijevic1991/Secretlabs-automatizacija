package PAGES;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LogInPage {

WebDriver driver;


  public By userNameInputField= By.id("user-name");
  public By passwordInputField=By.id("password");
  public By logInButton=By.id("login-button");
  public By textMessageAfterLogInFailed=By.xpath("//h3[text()=\"Epic sadface: Username and password do not match any user in this service\"]");
  public By textMessageAfterLogInWithoutTextInputFailed=By.xpath("//h3[text()=\"Epic sadface: Username is required\"]");

  public By logInCredentials=By.id("login_credentials");

  public LogInPage(WebDriver driver){
    this.driver=driver;
  }

  public void enterUserName(String textToEnterToUserNameField){
    driver.findElement(userNameInputField).sendKeys(textToEnterToUserNameField);
  }
  public void enterPassword(String textToEnterPasswordField){
    driver.findElement(passwordInputField).sendKeys(textToEnterPasswordField);
  }




  public void validLogIn() {
    driver.findElement(userNameInputField).sendKeys("standard_user");
    driver.findElement(passwordInputField).sendKeys("secret_sauce");
    driver.findElement(logInButton).click();
  }

  public void logInButton() {
    driver.findElement(logInButton).click();
  }
}
