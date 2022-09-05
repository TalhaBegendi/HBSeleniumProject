package pages;

import com.google.gson.JsonObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Component.SearchResults;
import utils.PropertyManager;
import utils.Utilities;
import org.apache.log4j.Logger;

import java.util.List;


public class GoogleKeywordPage extends Utilities  {
    final static Logger logger = Logger.getLogger(GoogleKeywordPage.class);
    @FindBy(css = "[name='q']")
    public WebElement googleKeywordInput;
    @FindBy(css = "[name='btnK']")
    public WebElement googleSearchButton;
    @FindBy(css = "[data-sokoban-container]")
    public List<SearchResults> results;
    public void googleKeywordSearch() {
        PropertyManager propertyManager = new PropertyManager();
        String keyword = propertyManager.getProperty("env.properties", "keyword");
        elementSendkey(googleKeywordInput,keyword);
        logger.info("Keyword entered for Google");
        elementClick(googleSearchButton);
        logger.info("Search for Google button clicked.");
        JsonObject json = new JsonObject();
        for (SearchResults result:results)
        {
            json.addProperty("title",result.getTitle());
            json.addProperty("detail",result.getDetail());
            json.addProperty("link",result.getLink());
        }
    }
}
