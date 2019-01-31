package iPhone;

import AlertsPage.Alerts;
import SegmentsPage.Segments;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SegmentsTest extends Segments {
    Segments segments;
    @BeforeMethod
    public void initElements(){
        segments = PageFactory.initElements(ad, Segments.class);
    }
    @Test
    public void testClickSegments(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        segments.clickSegments();
    }
    @Test
    public void testSegments1() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        segments.setUiSegmentControl();
    }
    @Test
    public void testSegments2() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        segments.setUiSegmentControlStyleBar();
    }
    @Test
    public void testSegments3() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        segments.setUiSegmentControlStyleBarTint();
    }
    @Test
    public void testSegments4() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        segments.setUiSegmentcontrolStyleBarImage();
    }
    @Test
    public void testSegments5() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        segments.setUiSegmentControlStyleBordered();
    }
}
