package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArticlePage {

    private WebDriver driver;

    private By heading = By.id("firstHeading");
    private By firstLinkInContent = By.cssSelector("#mw-content-text a");

    public ArticlePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }

    public void clickFirstLink() {
        driver.findElement(firstLinkInContent).click();
    }
}
