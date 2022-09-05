package utils;

import com.github.webdriverextensions.WebDriverExtensionFieldDecorator;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.driver.Driver;

public class Utilities extends Driver {
    public Utilities(){PageFactory.initElements(new WebDriverExtensionFieldDecorator(driver),this);}
    public void elementClick(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    public void elementSendkey(WebElement element,String keyword)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(keyword);
    }
}
