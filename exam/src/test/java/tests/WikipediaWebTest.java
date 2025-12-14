package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ArticlePage;
import pages.MainPage;

public class WikipediaWebTest extends BaseTest {

    @Test
    public void testOpenMainPage() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();

        Assert.assertTrue(driver.getTitle().contains("Wikipedia"),
                "Заголовок страницы не содержит Wikipedia");
    }

    @Test
    public void testSearchArticle() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.search("Selenium");

        ArticlePage articlePage = new ArticlePage(driver);
        Assert.assertEquals(articlePage.getHeadingText(), "Selenium",
                "Открыта неправильная статья");
    }

    @Test
    public void testNavigateByLink() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.search("Selenium");

        ArticlePage articlePage = new ArticlePage(driver);
        articlePage.clickFirstLink();

        Assert.assertNotEquals(articlePage.getHeadingText(), "Selenium",
                "Переход по ссылке не произошёл");
    }

    @Test
    public void testSwitchLanguageToEnglish() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickEnglishLanguage();

        Assert.assertTrue(driver.getCurrentUrl().contains("en.wikipedia.org"),
                "Английская версия не открылась");
    }
}
