package utils.driver;

import com.github.webdriverextensions.WebComponent;
import org.openqa.selenium.WebDriver;

public class Driver extends WebComponent {
    public static WebDriver driver;
    public void firstSearchEngineInitialize(){
        driver = DriverFactory.getDriver("https://www.google.com/");
    }
    public void secondSearchEngineInitialize(){
        driver = DriverFactory.getDriver("https://www.yandex.com/");
    }
   // public void terminate(){driver.quit();}
}
