package iPhone;

import UiCatalogPage.UiCatalog;
import WebPage.Web;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class WebTest extends Web {
    Web web;
    @BeforeMethod
    public void webElement () {
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getWeb();
        web = PageFactory.initElements(ad, Web.class );
    }
    @Test
    public void testWeb(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        webHome();
    }
    @Test
    public void clickWebsite () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        web.appleWebsite();}
}