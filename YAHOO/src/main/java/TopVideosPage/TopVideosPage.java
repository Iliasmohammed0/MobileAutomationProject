package TopVideosPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TopVideosPage extends Base {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/com.oath.o2.android.vrmsdk.mn.b[2]/android.widget.TextView")
    public static WebElement topVideoTitle;
    public void checkVideoTitleText(){
        String expected = topVideoTitle.getText();
        String actual = "Top Videos";
        Assert.assertEquals(expected, actual);
        System.out.println("************************************************************");
        System.out.println("\tExpected: " + expected);
        System.out.println("\tActual: " + actual);
        System.out.println("************************************************************");
    }
    public void clickFirstVideo(){
        WebElement firstVideo=ad.findElement(By.id("com.yahoo.mobile.client.android.yahoo:id/title_text_view"));
        firstVideo.click();
    }
    public void getFirstVideoText(){
        WebElement firstVideo=ad.findElement(By.id("com.yahoo.mobile.client.android.yahoo:id/title_text_view"));
        String expected = firstVideo.getText();
        System.out.println("***********************************************************");
        System.out.println("\tText: " + expected);
        System.out.println("************************************************************");

    }
    public void getFirstVideoTagName(){
        WebElement firstVideo=ad.findElement(By.id("com.yahoo.mobile.client.android.yahoo:id/title_text_view"));
        System.out.println("************************************************************");
        System.out.println(firstVideo.getTagName());
        System.out.println("************************************************************");
    }
    public void getFirstVideoSize(){
        WebElement firstVideo=ad.findElement(By.id("com.yahoo.mobile.client.android.yahoo:id/title_text_view"));
        System.out.println("************************************************************");
        System.out.println(firstVideo.getSize());
        System.out.println("************************************************************");
    }
    public void getTrendingFirstVideoLocation(){
        WebElement firstVideo=ad.findElement(By.id("com.yahoo.mobile.client.android.yahoo:id/title_text_view"));
        System.out.println("************************************************************");
        System.out.println(firstVideo.getLocation());
        System.out.println("************************************************************");
    }
}
