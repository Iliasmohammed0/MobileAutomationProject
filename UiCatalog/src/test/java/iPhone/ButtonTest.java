package iPhone;

import ButtonsPage.Buttons;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class ButtonTest extends Buttons {
    Buttons buttons;
    @BeforeMethod
    public void initElements(){
        buttons = PageFactory.initElements(ad, Buttons.class);
    }
   @Test
   public void testClickButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        buttons.clickButton();
   }
    @Test
    public void testButton1() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        buttons.showBackgroundImage();
    }
    @Test
    public void testButton2() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        buttons.showButtonWithImage();
    }
    @Test
    public void testButton3() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        buttons.showRoundedButton();
    }
}
