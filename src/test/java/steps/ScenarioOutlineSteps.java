package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;


public class ScenarioOutlineSteps{

    LoginPage loginPage = new LoginPage();
    @Given("enter in username field {string}")
    public void enter_in_username_field(String username) {
        loginPage.usernameInput.sendKeys(username);
    }
    @Given("enter in password field {string}")
    public void enter_in_password_field(String password) {
        loginPage.passwordInput.sendKeys(password);
    }
    @Then("login not successful")
    public void login_not_successful() {
        System.out.println("Login is not successfully");
    }
}
