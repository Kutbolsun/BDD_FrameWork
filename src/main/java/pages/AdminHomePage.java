package pages;

import driverManager.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Kutbolsun Toktonazarov
 */

public class AdminHomePage extends BasePage{

//    public AdminHomePage(){
//        PageFactory.initElements(Driver.getDriver(),this);
//
//    }

    @FindBy(xpath = "(//a[contains(text(),'Add user')])[1]")
    public WebElement addUserBtn;

    @FindBy(xpath = "//a[contains(text(),'Reports')] ")
    public WebElement reportsBtn;
}
