package TestAccountPage;

import AccountPage.AccountPage;
import HomePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestAccountPage extends AccountPage {
    HomePage HomePage;
    AccountPage AccountPage;
    @BeforeMethod
    public void initElements() throws InterruptedException {
        AccountPage = PageFactory.initElements(ad, AccountPage.class);
        HomePage = PageFactory.initElements(ad, HomePage.class);
        HomePage.clickAccountButton();
        Thread.sleep(4000);
    }
    @Test
    public void testSignInButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickSignInButton(); }
    @Test
    public void testSignInText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signButtonText(); }
    @Test
    public void testNotifications(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickNotifications(); }
    @Test
    public void testNotificationsText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        notificationsText(); }
    @Test
    public void testBookmark(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickBookmark(); }
    @Test
    public void testBookmarkText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        bookmarkText(); }
    @Test
    public void testSettings(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickSettings(); }
    @Test
    public void testSettingsText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        settingsText(); }
    @Test
    public void testHelp(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickHelp(); }
    @Test
    public void testHelpText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        helpText(); }
    @Test
    public void testSendFeedback(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickSendFeedback(); }
    @Test
    public void testSendFeedbackText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));sendFeedbackText(); }
    @Test
    public void testNotificationsLocation(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        notificationsLocation(); }
    @Test
    public void testBookmarkLocation(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        bookmarkLocation(); }
    @Test
    public void testSettingsLocation(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        settingsLocation(); }
    @Test
    public void testHelpLocation(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        helpLocation(); }
    @Test
    public void testSendFeedbackLocation(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        sendFeedbackLocation(); }
}
