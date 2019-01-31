package TopStoriesPage;

import common.Base;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TopStoriesPage extends Base{
    @FindBy(id = "com.yahoo.mobile.client.android.yahoo:id/cover_image_view")
    public static WebElement firstHeadlineNews;
    public void clickFirstStory() {
        firstHeadlineNews.click();
    }
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView")
    public static WebElement firstStoryHeadline;
    public void getFirstHeadlineText(){
        firstStoryHeadline.getText();
        String actual = firstStoryHeadline.getText();
        //String expected = "Acting AG says Mueller probe 'close to being completed'";
        //Assert.assertEquals(actual, expected);
        System.out.println("Actual: " + actual);
       // System.out.println("Expected: " + expected);
            }
    public void getFirstStoryLocation(){
        firstStoryHeadline.getLocation();
    }
    public void getFirstStorysize(){
        firstStoryHeadline.getSize();
    }
    @FindBy(xpath = "//android.widget.Button[@content-desc=’share’]”")
    public static WebElement shareButton;
    public void clickShare() {
        TouchAction touchAction=new TouchAction(ad);
        touchAction.tap(1149, 1851).perform();
        /*shareButton.click();*/}
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageButton")
    public static WebElement bookMarkButton;
    public void clickBookmark() {
        TouchAction touchAction=new TouchAction(ad);
        touchAction.tap(1301, 1846).perform();
        /* bookMarkButton.click();*/}
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Cover image: Cohen to testify to House Intelligence Committee \"]")
    public static WebElement secondStory;
    public void clickSecondStory() {
       scrollAndClickByName("Cohen to testify to House Intelligence Committee"); }
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView")
    public static WebElement secondStoryHeadline;
    public void getSecondHeadlineText(){
        secondStoryHeadline.getText();
        String actual = secondStoryHeadline.getText();
        String expected = "Acting AG says Mueller probe 'close to being completed'";
        Assert.assertEquals(actual,expected);
        System.out.println("Actual: " + actual);
        System.out.println("Expected: " + expected); }
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Cover image: SOTU back on: Pelosi invites Trump to deliver speech at Capitol \"]")
    public static WebElement thirdStory;
    public void clickThirdStory() {
        scrollAndClickByName("Cohen to testify to House Intelligence Committee"); }
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.TextView")
    public static WebElement thirdStoryHeadline;
    public void getThirdHeadlineText(){
        String actual = thirdStoryHeadline.getText();
        String expected = "SOTU back on: Pelosi invites Trump to deliver speech at Capitol";
        Assert.assertEquals(actual,expected);
        System.out.println("Actual: " + actual);
        System.out.println("Expected: " + expected);
    }
}
