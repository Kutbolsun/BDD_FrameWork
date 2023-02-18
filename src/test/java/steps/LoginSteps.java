package steps;

import common.ConfigReader;
import common.WebElementActions;
import driverManager.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginSteps {


    WebElementActions webElementActions = new WebElementActions();
    LoginPage loginPage = new LoginPage();
    WebDriver driver = Driver.getDriver();
    @Given("user should go to login page")
    public void user_should_go_to_login_page() {
        driver.get(ConfigReader.getProperty("qa_env"));
        
    }
    @And("user should enter in username field valid credential")
    public void userShouldEnterInUsernameFieldValidCredential() {
        loginPage.usernameInput.sendKeys(ConfigReader.getProperty("username"));
        
    }
    @And("user should enter in password field valid password credentials")
    public void userShouldEnterInPasswordFieldValidPasswordCredentials()  {
        loginPage.passwordInput.sendKeys(ConfigReader.getProperty("password"));
        
    }
    @When("user click login button")
    public void user_click_login_button() {
        loginPage.submitLoginBtn.click();
    }
    @Then("user should login successfully")
    public void user_should_login_successfully() {
        Assert.assertTrue(false);
        
    }

    @Given("user should enter in username field invalid username")
    public void user_should_enter_in_username_field_invalid_username() {

    }

    @Then("user should not login and user should see error message")
    public void user_should_not_login_and_user_should_see_error_message() {

    }
}
