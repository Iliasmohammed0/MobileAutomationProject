package TestOriginalsPage;

import HomePage.HomePage;
import OriginalsPage.OriginalsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestOriginalsPage extends OriginalsPage {
    HomePage HomePage;
    OriginalsPage OriginalsPage;
    @BeforeMethod
    public void initElements() throws InterruptedException {
        OriginalsPage = PageFactory.initElements(ad, OriginalsPage.class);
        HomePage = PageFactory.initElements(ad, HomePage.class);
        HomePage.clickOriginalOption();
        Thread.sleep(4000);
    }

    @Test
    public void testOriginalsTopStory(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOriginalsFirstStory(); }
    @Test
    public void testOriginalTopStoryText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getOriginalTopStoryText(); }
    @Test
    public void testOriginalStorySize(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getSizeOriginalStory(); }
    @Test
    public void testTagNameOriginalStory(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getTagOriginalStory(); }
    @Test
    public void testOriginalStoryLocation(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getFirstOriginalsStoryLocation(); }

}
