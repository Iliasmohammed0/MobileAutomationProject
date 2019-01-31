package OriginalsPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OriginalsPage extends Base {
    public void getOriginalTopStoryText(){
        WebElement actual = ad.findElementById("com.yahoo.mobile.client.android.yahoo:id/title_text_view");
        String expected="New hacking threat from Iran detected, cyber firm says";
        System.out.println("************************************************************");
        System.out.println(actual);
        System.out.println(expected);
        System.out.println("************************************************************");
    }
    public void clickOriginalsFirstStory(){
        WebElement clickFirstStoryOriginal = ad.findElementById("com.yahoo.mobile.client.android.yahoo:id/title_text_view");
        clickFirstStoryOriginal .click();
    }
    public void getSizeOriginalStory(){
        WebElement clickFirstStoryOriginal = ad.findElementById("com.yahoo.mobile.client.android.yahoo:id/title_text_view");
        System.out.println("************************************************************");
        System.out.println(clickFirstStoryOriginal.getSize());
        System.out.println("************************************************************");
    }
    public void getTagOriginalStory(){
        WebElement clickFirstStoryOriginal = ad.findElementById("com.yahoo.mobile.client.android.yahoo:id/title_text_view");
        System.out.println("************************************************************");
        System.out.println(clickFirstStoryOriginal.getTagName());
        System.out.println("************************************************************");
    }
    public void getFirstOriginalsStoryLocation(){
        WebElement clickFirstStoryOriginal = ad.findElementById("com.yahoo.mobile.client.android.yahoo:id/title_text_view");
        System.out.println("************************************************************");
        System.out.println(clickFirstStoryOriginal.getLocation());
        System.out.println("************************************************************");
    }
}
