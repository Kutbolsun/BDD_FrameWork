package driverManager;

import common.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {

    private static WebDriver driver;


    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser").toLowerCase()) {
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "edge":
                    driver = EdgeWebDriver.loadEdgeDriver();
                    break;

                default:
                    throw new IllegalArgumentException();

            }
        }
        return driver;
    }

    public static void closeDriver(){
        try {
            if (driver!=null){
                driver.close();
                driver.quit();
                driver = null;
            }
        }catch (Exception e){
            System.out.println("Error while closing driver");
        }
    }
}
