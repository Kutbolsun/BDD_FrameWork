package steps;

import common.ConfigReader;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AdminHomePage;
import pages.LoginPage;
import pojo.UserDetails;

import java.util.List;
import java.util.Map;

public class DataTableSteps{

    LoginPage loginPage = new LoginPage();
    AdminHomePage adminHomePage = new AdminHomePage();


    @DataTableType
    public UserDetails userDetails(Map<String,String> row){
        return new UserDetails(
                row.get("firstname"),
                row.get("lastname"),
                row.get("email"),
                row.get("username"),
                row.get("password"),
                row.get("bio")
        );
    }

    @Given("user should login with valid credentials")
    public void user_should_login_with_valid_credentials() {
        loginPage.usernameInput.sendKeys(ConfigReader.getProperty("username"));
        loginPage.passwordInput.sendKeys(ConfigReader.getProperty("password"));
        loginPage.submitLoginBtn.click();

    }

    @Then("user click on Add user button")
    public void user_click_on_add_user_button() {
        adminHomePage.addUserBtn.click();

    }

    @Then("user should land to create new user page")
    public void user_should_land_to_create_new_user_page() {

    }

    @Given("create new user with following data")
    public void create_new_user_with_following_data(List<UserDetails> userDetails) {
//        List<List<String>> userDetails = dataTable.asLists();
//
//        System.out.println(userDetails.get(1).get(0));
//        System.out.println(userDetails.get(3).get(3));


        System.out.println(userDetails.get(3).getFirstname());

        for (UserDetails e: userDetails){
            System.out.println(e.getFirstname());
        }

    }
}
