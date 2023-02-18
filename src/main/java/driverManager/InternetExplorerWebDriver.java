package driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;

public class InternetExplorerWebDriver {

    public static WebDriver loadFireFoxDriver() {

        System.setProperty("webdriver.ie.driver", "src/main/resources/drivers/IEDriverServer.exe");

        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver;

    }
}
