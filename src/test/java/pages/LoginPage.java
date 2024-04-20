package pages;

import static stepDef.Hooks.driver;
import static org.assertj.core.api.Assertions.assertThat;
import org.openqa.selenium.By;

public class LoginPage {


    By usernameInputText = By.cssSelector("#user-name");
    By passwordInputText = By.xpath("//*[@id=\"password\"]");
    By loginButton = By.id("login-button");


    public void goToLoginPage() {
        driver.get("https://www.saucedemo.com");
    }

    public void inputUsername(String username) {
        driver.findElement(usernameInputText).sendKeys(username);
    }

    public void inputPassword(String password) {
        driver.findElement(passwordInputText).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void validateErrorMessage(String errorMessage) {
        String pageSource = driver.getPageSource();
        assertThat(pageSource).contains(errorMessage);
    }

}
