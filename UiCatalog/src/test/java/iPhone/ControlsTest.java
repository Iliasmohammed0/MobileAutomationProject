package iPhone;

import ControlsPage.Controls;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class ControlsTest extends Controls {
    Controls controls;
    @BeforeMethod
    public void initElements(){
        controls = PageFactory.initElements(ad, Controls.class);
    }
    @Test
    public void testClickControl(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        controls.clickControl();
    }
    @Test
    public void testControlText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        controls.getControlText();
    }
    @Test
    public void testControlSize(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        controls.getControlSize();
    }
    @Test
    public void testButton1() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        controls.showPageControl();
    }
    @Test
    public void testButton2() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        controls.showSlider();
    }
    @Test
    public void testButton3() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        controls.showSwitch();
    }
}
