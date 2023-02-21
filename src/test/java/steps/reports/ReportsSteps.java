package steps.reports;

import driverManager.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AdminHomePage;

public class ReportsSteps  {
    WebDriver driver = Driver.getDriver();
    AdminHomePage adminHomePage = new AdminHomePage();

    @Given("user should click Reports button")
    public void user_should_click_reports_button() {
        adminHomePage.reportsBtn.click();
    }
    @Then("user should see Reports page")
    public void user_should_see_reports_page() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/reports/index");
    }
}
