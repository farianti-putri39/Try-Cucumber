package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("User is on login page")
    public void userIsOnLoginPage() {
        System.out.println("Test");
    }

    @When("User input valid username {string}")
    public void userInputValidUsername(String arg0) {
        System.out.println("Test");
    }

    @And("User input valid password {string}")
    public void userInputValidPassword(String arg0) {
        System.out.println("Test");
    }

    @Then("User is logged in")
    public void userIsLoggedIn() {
        System.out.println("Test");
    }

    @When("User input invalid username {string}")
    public void userInputInvalidUsername(String arg0) {
        System.out.println("Test");
    }

    @And("User input invalid password {string}")
    public void userInputInvalidPassword(String arg0) {
        System.out.println("Test");
    }

    @Then("Error message is displayed")
    public void errorMessageIsDisplayed() {
        System.out.println("Test");
    }
}
