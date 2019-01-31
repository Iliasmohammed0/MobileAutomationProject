package TestTopVideosPage;

import HomePage.HomePage;
import TopVideosPage.TopVideosPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestTopVideosPage extends TopVideosPage {
    HomePage HomePage;
    TopVideosPage TopVideosPage;
    @BeforeMethod
    public void initElements() throws InterruptedException {
        TopVideosPage = PageFactory.initElements(ad, TopVideosPage.class);
        HomePage = PageFactory.initElements(ad, HomePage.class);
        HomePage.clickTopVideos();
        Thread.sleep(4000);
    }
    @Test
    public void testVideoTitleText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        checkVideoTitleText(); }
    @Test
    public void testPlayFirstVideo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickFirstVideo();
    }
    @Test
    public void testFirstVideoText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getFirstVideoText(); }
    @Test
    public void testFirstVideoSize(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getFirstVideoSize();
    }
    @Test
    public void testFirstVideoTagName(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getFirstVideoTagName();
    }
    @Test
    public void testFirstVideoLocation(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getTrendingFirstVideoLocation(); }
}