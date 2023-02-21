package pages.reports;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CourseReports {

    @FindBy(xpath = "//td[@class=' tl-align-left hidden-phone']")
    public List<WebElement> webTableOfCategory;

    @FindBy(xpath = "//span[contains(text(),'New Courses Name ')]")
    public WebElement courseText;

    @FindBy(xpath = "//td[contains(text(),'1')]")
    public WebElement assignedLearnersText;

    @FindBy(xpath = "//td[contains(text(),'-')]")
    public WebElement completedLearnersText;

    @FindBy(xpath = "//i[@alt='Reports']")
    public WebElement reportsBtn;

    @FindBy(xpath = "//td[@class=' tl-align-left']")
    public List<WebElement> webTableOfCourse;

    public CourseReports listOfCourses() {

        for (WebElement list : webTableOfCourse) {
            System.out.println(list.getText());
            if (list.getText().equals("ItHelper")) {
                Assert.assertEquals(list.getText(), "ItHelper");
            }
        }
        return this;
    }
}
