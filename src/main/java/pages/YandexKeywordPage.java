package pages;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.PropertyManager;
import utils.Utilities;
public class YandexKeywordPage extends Utilities {
    final static Logger logger = Logger.getLogger(YandexKeywordPage.class);
    @FindBy(css = "[id='text']")
    public WebElement yandexKeywordInput;
    @FindBy(css = "[role='button']")
    public WebElement yandexSearchButton;
    public void yandexKeywordSearch() {
        PropertyManager propertyManager = new PropertyManager();
        String keyword = propertyManager.getProperty("env.properties", "keyword");
        elementSendkey(yandexKeywordInput,keyword);
        logger.info("Keyword entered for Yandex");
        elementClick(yandexSearchButton);
        logger.info("Search for Yandex button clicked.");
    }
}

