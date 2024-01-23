package steps.reports;

import driverManager.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.reports.CourseReports;
import pages.reports.ReportsPage;

public class CourseReportsSteps {

    ReportsPage reportsPage = new ReportsPage();
    CourseReports courseReports = new CourseReports();
    WebDriver driver = Driver.getDriver();

    @Given("user should go to Course Reports page")
    public void user_should_go_to_course_reports_page() {

    }
    @When("user should click Course Reports button")
    public void user_should_click_course_reports_button() {
        reportsPage.courseReportsBtn.click();
    }
    @Then("user should enter to Course Reports page")
    public void user_should_enter_to_course_reports_page() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/reports/course");
    }
    @Then("user should see name of courses")
    public void user_should_see_name_of_courses() {
        courseReports.listOfCourses();
    }

    @When("user click option button")
    public void user_click_option_button() {

    }
    @Then("user should enter option page")
    public void user_should_enter_option_page() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/reports/courseinfo/id:187");
    }

}
