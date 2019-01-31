package iPhone;

import AlertsPage.Alerts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class AlertsTest extends Alerts {
   Alerts alerts;
   @BeforeMethod
   public void initElements(){
       alerts = PageFactory.initElements(ad, Alerts.class);
    }
    @Test
    public void testClickAlertButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        alerts.clickAlerts();
    }
    @Test
    public void testShowSimple1() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        alerts.showSimple();
    }
    @Test
    public void testShowSimple2() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        alerts.showOkCancel();
    }
    @Test
    public void testShowSimple3() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        alerts.showCustom();
    }
    @Test
    public void testShowSimple4() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        alerts.showSimpleAlerts();
    }
}