package steps;

import org.openqa.selenium.WebDriver;
import pages.ExpediaHome;
import pages.SearchResult;

public class BaseStep {

    private static WebDriver driver = null;

    public BaseStep() {}

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        BaseStep.driver = driver;
    }

    public ExpediaHome getHomepage() {
        return new ExpediaHome(driver);
    }

    public SearchResult getSearchResultPage() {
        return new SearchResult(driver);
    }
}
