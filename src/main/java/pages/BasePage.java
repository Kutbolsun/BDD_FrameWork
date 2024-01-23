package pages;

import common.WebElementActions;
import driverManager.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

    public abstract class BasePage {
    protected WebDriver driver;

    public WebElementActions elementActions = new WebElementActions();

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
