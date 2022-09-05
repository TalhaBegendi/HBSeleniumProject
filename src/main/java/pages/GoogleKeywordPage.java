package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.PropertyManager;
import utils.Utilities;
import org.apache.log4j.Logger;
public class GoogleKeywordPage extends Utilities  {
    final static Logger logger = Logger.getLogger(GoogleKeywordPage.class);
    @FindBy(css = "[name='q']")
    public WebElement googleKeywordInput;
    @FindBy(css = "[name='btnK']")
    public WebElement googleSearchButton;
    public void googleKeywordSearch() {
        PropertyManager propertyManager = new PropertyManager();
        String keyword = propertyManager.getProperty("env.properties", "keyword");
        elementSendkey(googleKeywordInput,keyword);
        logger.info("Keyword entered for Google");
        elementClick(googleSearchButton);
        logger.info("Search for Google button clicked.");
    }
}
