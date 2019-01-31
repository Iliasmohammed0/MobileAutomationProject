package iPhone;

import TextViewPage.TextView;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TextViewTest extends TextView {
    TextView textView;
    @BeforeMethod
    public void initElements(){
        textView = PageFactory.initElements(ad, TextView.class);
    }
    @Test
    public void testButton1() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        textView.setTextView();
    }
    @Test
    public void testClickTextView(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        textView.clickTextView();
    }
}
