package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MainScreen {

    private AppiumDriver driver;

    // Локаторы
    private By searchContainer = AppiumBy.accessibilityId("Search Wikipedia");
    private By searchInput = AppiumBy.id("org.wikipedia.alpha:id/search_src_text");

    public MainScreen(AppiumDriver driver) {
        this.driver = driver;
    }

    public void tapSearch() {
        driver.findElement(searchContainer).click();
    }

    public void typeSearch(String text) {
        driver.findElement(searchInput).sendKeys(text);
    }
}
