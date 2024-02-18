package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import page.HomePage;
import page.LoginPage;
import baseTest.BaseTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStepdefs extends BaseTest{

    ChromeDriver driver;
    LoginPage loginPage;
    HomePage homePage;

    @Given("User is on login page")
    public void userIsOnLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
    }

    @When("User input valid username {string}")
    public void userInputValidUsername(String username) {
        loginPage.inputUsername(username);
    }

    @And("User input valid password {string}")
    public void userInputValidPassword(String password) {
        loginPage.inputPassword(password);
    }

    @Then("User is logged in")
    public void userIsLoggedIn() {
        homePage = new HomePage(driver);
        homePage.validateBackpackDisplayed();
    }

    @When("User input invalid username {string}")
    public void userInputInvalidUsername(String username) {
        loginPage.inputUsername(username);
    }

    @And("User input invalid password {string}")
    public void userInputInvalidPassword(String password) {
        loginPage.inputPassword(password);
    }

    @And("User click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("Error message is displayed {string}")
    public void errorMessageIsDisplayed(String errorMessage) {
        loginPage.validateErrorMessage(errorMessage);
    }
}
