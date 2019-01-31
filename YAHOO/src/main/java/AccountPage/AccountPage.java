package AccountPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Base {
    @FindBy(id = "com.yahoo.mobile.client.android.yahoo:id/signin_img_btn")
    public static WebElement signInButton;
    public void clickSignInButton(){ signInButton.click(); }
    public void signButtonText(){
        System.out.println("************************************************************");
        System.out.println(signInButton.getText());
        System.out.println("************************************************************"); }
    public void signButtonLocation(){
        System.out.println("************************************************************");
        System.out.println(signInButton.getLocation());
        System.out.println("************************************************************"); }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[1]")
    public static WebElement notifications;
    public void clickNotifications(){ notifications.click(); }
    public void notificationsText(){
        System.out.println("************************************************************");
        System.out.println(notifications.getText());
        System.out.println("************************************************************"); }
    public void notificationsLocation(){
        System.out.println("************************************************************");
        System.out.println(notifications.getLocation());
        System.out.println("************************************************************"); }
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[2]")
    public static WebElement bookmark;
    public void clickBookmark(){ bookmark.click(); }
    public void bookmarkText(){
        System.out.println("************************************************************");
        System.out.println(bookmark.getText());
        System.out.println("************************************************************"); }
    public void bookmarkLocation(){
        System.out.println("************************************************************");
        System.out.println(bookmark.getLocation());
        System.out.println("************************************************************"); }
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[3]")
    public static WebElement settings;
    public void clickSettings(){ settings.click(); }
    public void settingsText(){
        System.out.println("************************************************************");
        System.out.println(settings.getText());
        System.out.println("************************************************************"); }
    public void settingsLocation(){
        System.out.println("************************************************************");
        System.out.println(settings.getLocation());
        System.out.println("************************************************************"); }
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[4]")
    public static WebElement help;
    public void clickHelp(){ help.click(); }
    public void helpText(){
        System.out.println("************************************************************");
        System.out.println(help.getText());
        System.out.println("************************************************************"); }
    public void helpLocation(){
        System.out.println("************************************************************");
        System.out.println(help.getLocation());
        System.out.println("************************************************************"); }
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[3]")
    public static WebElement sendFeedback;
    public void clickSendFeedback(){ sendFeedback.click(); }
    public void sendFeedbackText(){
        System.out.println("************************************************************");
        System.out.println(sendFeedback.getText());
        System.out.println("************************************************************"); }
    public void sendFeedbackLocation(){
        System.out.println("************************************************************");
        System.out.println(sendFeedback.getLocation());
        System.out.println("************************************************************"); }
}

