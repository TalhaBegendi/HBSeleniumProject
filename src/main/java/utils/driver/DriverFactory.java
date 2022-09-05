package utils.driver;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import utils.PropertyManager;
public class DriverFactory {
    public static WebDriver getDriver(String searchEngine){
        PropertyManager propertyManager = new PropertyManager();
        String browserName = propertyManager.getProperty("env.properties","browser");
        WebDriver driver;
        switch (browserName.toLowerCase()){
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("disable-notifications");
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/drivers/chromedriver.exe");
                driver = new ChromeDriver(chromeOptions);
                break;
            case "firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "/drivers/geckodriver.exe");
                driver = new FirefoxDriver(firefoxOptions);
                break;
            default:
                Assert.fail("Please your choose browser");
                return null ;
        }
        driver.get(searchEngine);
        return driver;
    }
}
