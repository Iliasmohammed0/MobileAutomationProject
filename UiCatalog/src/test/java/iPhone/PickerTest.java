package iPhone;

import PickersPage.Picker;
import UiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class PickerTest extends Picker{
    Picker picker;
    @BeforeMethod
    public void initElements(){
        picker = PageFactory.initElements(ad, Picker.class);
    }
    @Test
    public void testClickPickers(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        picker.clickPickers();
    }
    @Test
    public void testPicker1() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        picker.showDate();
    }
    @Test
    public void testPicker2() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        picker.showUI();
    }
    @Test
    public void testPicker3() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        picker.showCustom1();
    }
}
