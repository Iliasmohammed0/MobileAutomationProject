package WebPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Web extends Base {
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Web\"]")
    public static WebElement web;
    @FindBy(xpath = "//XCUIElementTypeOther[@name=\"Global, navigation\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]\n" + "\n")
    public static WebElement website;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Use of UIWebView\"]")
    public static WebElement webText;

    public void appleWebsite() {
        web.click();
    }
    public void getTagName() {
        System.out.println(web.getTagName());
    }
    public void getWebSize(){
        System.out.println(web.getSize());
    }
    public  void getWebText(){
        System.out.println(web.getText());
    }
}