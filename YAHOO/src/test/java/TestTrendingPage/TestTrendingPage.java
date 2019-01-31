package TestTrendingPage;

import HomePage.HomePage;
import TrendingPage.TrendingPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestTrendingPage extends TrendingPage {
    HomePage HomePage;
    TrendingPage TrendingPage;
    @BeforeMethod
    public void initElements() throws InterruptedException {
        TrendingPage = PageFactory.initElements(ad, TrendingPage.class);
        HomePage = PageFactory.initElements(ad, HomePage.class);
        HomePage.clickTrending();
        Thread.sleep(4000);
    }
    @Test
    public void testTrendingTitleText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        checkTrendingText(); }
    @Test
    public void testTrendingArticle(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickTrendingArictle();
    }
    @Test
    public void testTrendingArticleText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getTrendingArticleText(); }
    @Test
    public void testTrendingArticleSize(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getTrendingArticleSize();
    }
    @Test
    public void testTrendingArticleTagName(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getTrendingArticleTagName();
    }
    @Test
    public void testTrendingArticleLocation(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getTrendingArticleLocation(); }
}
