package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class ArticleScreen {

    private AppiumDriver driver;

    // Локаторы
    private By articleTitle = AppiumBy.id("org.wikipedia.alpha:id/view_page_title_text");
    private By firstParagraph = AppiumBy.id("org.wikipedia.alpha:id/view_page_content_text");

    public ArticleScreen(AppiumDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.findElement(articleTitle).getText();
    }

    public boolean isFirstParagraphDisplayed() {
        return driver.findElement(firstParagraph).isDisplayed();
    }
}
