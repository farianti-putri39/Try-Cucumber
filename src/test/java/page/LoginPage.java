package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    ChromeDriver driver;

    By usernameInputText = By.cssSelector("#user-name");
    By passwordInputText = By.xpath("//*[@id=\"password\"]");
    By loginButton = By.id("login-button");


    public LoginPage(ChromeDriver driver){
        this.driver = driver;
    }

    public void goToLoginPage(){
        driver.get("https://www.saucedemo.com");
    }
    public void inputUsername(String username){
        driver.findElement(usernameInputText).sendKeys(username);
    }

    public void inputPassword(String password){
        driver.findElement(passwordInputText).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public void validateErrorMessage(String errorMessage){
        driver.getPageSource().contains(errorMessage);
    }

}
