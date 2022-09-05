package pages;
import com.google.gson.JsonObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Component.SearchResults;
import utils.PropertyManager;
import utils.Utilities;

import javax.naming.directory.SearchResult;
import java.util.List;

public class YandexKeywordPage extends Utilities {
    final static Logger logger = Logger.getLogger(YandexKeywordPage.class);
    @FindBy(css = "[id='text']")
    public WebElement yandexKeywordInput;
    @FindBy(css = "[role='button']")
    public WebElement yandexSearchButton;
    @FindBy(css = "[data-sokoban-container]")
    public List<SearchResults> results;
    public void yandexKeywordSearch() {
        PropertyManager propertyManager = new PropertyManager();
        String keyword = propertyManager.getProperty("env.properties", "keyword");
        elementSendkey(yandexKeywordInput,keyword);
        logger.info("Keyword entered for Yandex");
        elementClick(yandexSearchButton);
        logger.info("Search for Yandex button clicked.");
        JsonObject json = new JsonObject();
        for (SearchResults result:results)
        {
            json.addProperty("title",result.getTitle());
            json.addProperty("detail",result.getDetail());
            json.addProperty("link",result.getLink());
        }
    }
}

