package iPhone;

import ToolbarPage.Toolbar;
import UiCatalogPage.UiCatalog;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class ToolbarTest extends Base {
    public Toolbar toolbar(){
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getToolbar();
        return PageFactory.initElements(ad, Toolbar.class);
    }
    @Test
    public void imageTest() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toolbar().setImage();
        sleep(3);
    }
    @Test
    public void tintedTest() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toolbar().setTinted();
        sleep(2);
    }
    @Test
    public void styleDefaultTest() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toolbar().setStyleDefault();
        sleep(2);
    }
    @Test
    public void styleBlackTest() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toolbar().setStyleBlack();
        sleep(2);
    }
    @Test
    public void styleTranslucient() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toolbar().setStyleTranslucent();
        sleep(2);
    }
    @Test
    public void doneTest()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toolbar().setDone();
        sleep(2);
    }
    @Test
    public void item1Test() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toolbar().setItem1();
        sleep(2);
    }
    @Test
    public void item2Test()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toolbar().setItem2();
        sleep(2);
    }
    @Test
    public void toolsTest() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toolbar().setTools();
        sleep(2);
    }
}