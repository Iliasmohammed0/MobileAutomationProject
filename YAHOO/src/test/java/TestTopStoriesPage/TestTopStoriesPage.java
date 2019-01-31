package TestTopStoriesPage;

import HomePage.HomePage;
import TopStoriesPage.TopStoriesPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestTopStoriesPage extends TopStoriesPage{
    TopStoriesPage TopStoriesPage;
    @BeforeMethod
    public void initElements(){
        TopStoriesPage = PageFactory.initElements(ad, TopStoriesPage.class);
    }
    @Test
    public void testFirstStory(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickFirstStory(); }
    @Test
    public void testFirstStoryText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getFirstHeadlineText(); }
    @Test
    public void testFirstStorySize(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getFirstStorysize(); }
    @Test
    public void testSecondStoryLocation(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getFirstStoryLocation();
    }
    @Test
    public void testShare(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickShare(); }
    @Test
    public void testBookmark(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickBookmark(); }
}
