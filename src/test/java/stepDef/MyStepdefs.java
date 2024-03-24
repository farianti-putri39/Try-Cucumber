package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
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

    @Before
    public void beforeTest(){
        driver = new ChromeDriver();
    }

    @After
    public void afterTest(){
        driver.close();
    }


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

    @Given("user is on home page")
    public void userIsOnHomePage() {
        userIsOnLoginPage();
        userInputValidUsername("standard_user");
        userInputValidPassword("secret_sauce");
        userClickLoginButton();
        userIsLoggedIn();
    }

    @When("user click on item's add to cart button")
    public void userClickOnItemSAddToCartButton() {
        homePage.clickBackpackAddToCart();
    }

    @Then("counter on cart icon is increased")
    public void counterOnCartIconIsIncreased() {
        homePage.validateCartCounter();
    }

    @Given("item is on cart")
    public void itemIsOnCart() {
        userIsOnHomePage();
        userClickOnItemSAddToCartButton();
        counterOnCartIconIsIncreased();
    }

    @When("user click on item's remove button")
    public void userClickOnItemSRemoveButton() {
        homePage.clickBackpackRemove();
    }

    @Then("counter on cart icon is decreased")
    public void counterOnCartIconIsDecreased() {
        homePage.validateCartNoItem();
    }

    @When("user click on all item's add to cart button")
    public void userClickOnAllItemSAddToCartButton() {
        homePage.addAllItemToCart();
    }
}
