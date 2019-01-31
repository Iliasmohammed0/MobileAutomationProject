package TrendingPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrendingPage extends Base {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/com.oath.o2.android.vrmsdk.mn.b[4]/android.widget.TextView")
    public static WebElement topVideoTitle;
    public void checkTrendingText(){
        String expected = topVideoTitle.getText();
        System.out.println("************************************************************");
        System.out.println("\tText: " + expected);
        System.out.println("************************************************************");
    }

    public void clickTrendingArictle(){
        WebElement firstTrendingArticle=ad.findElement(By.id("com.yahoo.mobile.client.android.yahoo:id/title_text_view"));
        firstTrendingArticle.click();
    }
    public void getTrendingArticleText(){
        WebElement firstTrendingArticle=ad.findElement(By.id("com.yahoo.mobile.client.android.yahoo:id/title_text_view"));
        String expected = firstTrendingArticle.getText();
        System.out.println("***********************************************************");
        System.out.println("\tText: " + expected);
        System.out.println("************************************************************");

    }
    public void getTrendingArticleTagName(){
        WebElement firstTrendingArticle=ad.findElement(By.id("com.yahoo.mobile.client.android.yahoo:id/title_text_view"));
        System.out.println("************************************************************");
        System.out.println(firstTrendingArticle.getTagName());
        System.out.println("************************************************************");
    }
    public void getTrendingArticleSize(){
        WebElement firstTrendingArticle=ad.findElement(By.id("com.yahoo.mobile.client.android.yahoo:id/title_text_view"));
        System.out.println("************************************************************");
        System.out.println(firstTrendingArticle.getSize());
        System.out.println("************************************************************");
    }
    public void getTrendingArticleLocation(){
        WebElement firstTrendingArticle=ad.findElement(By.id("com.yahoo.mobile.client.android.yahoo:id/title_text_view"));
        System.out.println("************************************************************");
        System.out.println(firstTrendingArticle.getLocation());
        System.out.println("************************************************************");
    }
}
