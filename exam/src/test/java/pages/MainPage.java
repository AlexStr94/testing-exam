package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;

    private By searchInput = By.id("searchInput");
    private By englishLanguageLink = By.id("js-link-box-en");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.wikipedia.org");
    }

    public void search(String text) {
        driver.findElement(searchInput).sendKeys(text);
        driver.findElement(searchInput).submit();
    }

    public void clickEnglishLanguage() {
        driver.findElement(englishLanguageLink).click();
    }
}
