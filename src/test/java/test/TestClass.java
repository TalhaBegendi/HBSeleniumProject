package test;

import org.testng.annotations.Test;
import pages.GoogleKeywordPage;
import pages.YandexKeywordPage;
import utils.driver.Driver;

public class TestClass {
    Driver driver = new Driver();
    @Test
    public  void browserSearch()  {
        driver.searchEngineInitialize("https://www.google.com/");
        GoogleKeywordPage googleKeywordPage = new GoogleKeywordPage();
        googleKeywordPage.googleKeywordSearch();
        driver.searchEngineInitialize("https://www.yandex.com/");
        YandexKeywordPage yandexKeywordPage = new YandexKeywordPage();
        yandexKeywordPage.yandexKeywordSearch();
        terminate();
    }
}
