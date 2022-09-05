package test;

import org.testng.annotations.Test;
import pages.GoogleKeywordPage;
import pages.YandexKeywordPage;
import utils.driver.Driver;

public class TestClass {
    Driver driver = new Driver();
    @Test
    public  void firstBrowserSearch()  {
        driver.firstSearchEngineInitialize();
        GoogleKeywordPage googleKeywordPage = new GoogleKeywordPage();
        googleKeywordPage.googleKeywordSearch();
    }
    @Test
    public  void secondBrowserSearch()  {
        driver.secondSearchEngineInitialize();
        YandexKeywordPage yandexKeywordPage = new YandexKeywordPage();
        yandexKeywordPage.yandexKeywordSearch();
    }

}
