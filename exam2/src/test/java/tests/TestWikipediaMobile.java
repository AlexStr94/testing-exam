package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainScreen;
import pages.ArticleScreen;

public class TestWikipediaMobile extends MobileBaseTest {

    @Test
    public void searchArticleAndCheckTitle() {
        MainScreen main = new MainScreen(driver);
        main.tapSearch();
        main.typeSearch("Selenium");

        ArticleScreen article = new ArticleScreen(driver);
        Assert.assertEquals(article.getTitle(), "Selenium", "Заголовок статьи неправильный");
    }

    @Test
    public void scrollArticleAndCheckParagraph() {
        MainScreen main = new MainScreen(driver);
        main.tapSearch();
        main.typeSearch("Selenium");

        ArticleScreen article = new ArticleScreen(driver);
        Assert.assertTrue(article.isFirstParagraphDisplayed(), "Первый абзац статьи не отображается");
    }
}
