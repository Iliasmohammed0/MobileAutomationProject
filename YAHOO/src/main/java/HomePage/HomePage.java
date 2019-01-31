package HomePage;

import common.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends Base {
    @FindBy(xpath = "\t/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")
    public static WebElement accountButton;
    public void clickAccountButton() {
        accountButton.click();
    }
    @FindBy(xpath = "\t//android.widget.TextView[@content-desc=\"YAHOO NEWS. Heading.\"]")
    public static WebElement yahooNewsTitle;
    public void clickTitle() {
        yahooNewsTitle.click();
    }
    public void getTitleValues() {
        String homeTitle = yahooNewsTitle.getText();
        Assert.assertEquals(homeTitle, "YAHOO NEWS"); }
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/com.oath.o2.android.vrmsdk.mn.b[1]/android.widget.TextView")
    public static WebElement topStories;
    public void clickTopStories() {
        topStories.click();
    }
    public void getTopStoriesText() {
        String topStoriesTitle = topStories.getText();
        Assert.assertEquals(topStoriesTitle, "Top Stories"); }
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/com.oath.o2.android.vrmsdk.mn.b[2]/android.widget.TextView")
    public static WebElement topVideos;
    public void clickTopVideos() {
        topVideos.click();
    }
    public void getTopVideosText() {
        String topStoriesTitle = topVideos.getText();
        Assert.assertEquals(topStoriesTitle, "Top Videos"); }
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/com.oath.o2.android.vrmsdk.mn.b[3]/android.widget.TextView")
    public static WebElement originals;
    public void clickOriginalOption() {
        originals.click();
    }
    public void getOriginalsText() {
        String topStoriesTitle = originals.getText();
        Assert.assertEquals(topStoriesTitle, "Originals"); }
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/com.oath.o2.android.vrmsdk.mn.b[4]/android.widget.TextView")
    public static WebElement trending;
    public void clickTrending() { trending.click(); }
    public void getTrendingText() {
        String actual = trending.getText();
        String expected = "Trending";
        Assert.assertEquals(actual, expected); }
    @FindBy(id = "com.yahoo.mobile.client.android.yahoo:id/action_search")
    public static WebElement homePageSearch;
    public void clickHomePageSearch() { homePageSearch.click(); }
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.EditText")
    public static WebElement searchBar;
    public void searchBar(String value) { searchBar.sendKeys(value, Keys.ENTER); }
    @FindBy(id = "com.yahoo.mobile.client.android.yahoo:id/cover_image_view")
    public static WebElement firstHeadlineNews;
    public void clickFirstStory() { firstHeadlineNews.click(); }
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Share\"]")
    public static WebElement shareButton;
    public void clickShare() { shareButton.click(); }
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageButton")
    public static WebElement bookMarkButton;
    public void clickBookmark() { bookMarkButton.click(); }
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Cover image: Cohen to testify to House Intelligence Committee \"]")
    public static WebElement secondStory;
    public void clickSecondStory() {
        scrollAndClickByName("Cohen to testify to House Intelligence Committee"); }
}
