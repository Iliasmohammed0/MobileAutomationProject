package iPhone;

import WebPage.Web;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class WebTest extends Web {
    Web web;
    @BeforeMethod
    public void initElements() throws InterruptedException {
        web = PageFactory.initElements(ad, Web.class );
        Thread.sleep(3000);
    }
    @Test
    public void clickWebsite () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        appleWebsite();}
    @Test
    public void testTagName () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getTagName();
    }
    @Test
    public void testWebText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getWebText();
    }
    @Test
    public void testWebSize(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getWebSize();
    }
}