package iPhone;

import TransitionsPage.Transitions;
import UiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TransitionsTest extends Transitions{
    public Transitions transitions(){
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getTransitions();
        return PageFactory.initElements(ad, Transitions.class);
    }
    @Test
    public void testCLickTransitions(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickTransitions();
    }
    @Test
    public void imageTest() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        transitions().flipImage();
    }
    @Test
    public void tintedTest() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        transitions().curlImage();
    }
}
