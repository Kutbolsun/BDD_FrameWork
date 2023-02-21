package pages.reports;

import driverManager.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

/**
 * @author Kutbolsun Toktonazarov
 */
public class ReportsPage extends BasePage {

    @FindBy(xpath = "//div[@class='tl-ellipsis']//a[contains(text(),'Course reports')]")
    public WebElement courseReportsBtn;



}
