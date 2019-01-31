package ToolbarPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Toolbar extends Base {
    @FindBy(xpath = "//XCUIElementTypeSwitch[@name=\"Image\"]")
    public static WebElement image;
    @FindBy(xpath = "//XCUIElementTypeSwitch[@name=\"Tinted\"]")
    public static WebElement tinted;
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypePicker/XCUIElementTypePickerWheel")
    public static WebElement scrollDown;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Default\"]")
    public static WebElement styleDefault;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Black\"]")
    public static WebElement styleBlack;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Translucent\"]")
    public static WebElement styleTranslucent;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Done\"])[2]")
    public static WebElement done;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Item1\"]")
    public static WebElement item1;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Item2\"]")
    public static WebElement item2;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Tools\"]")
    public static WebElement tools;

    public void setImage(){
        clickByXpathWebElement(image);
    }
    public void setTinted(){
        clickByXpathWebElement(tinted);
    }
    public void setStyleDefault(){
        clickByXpathWebElement(styleDefault);
    }
    public void setStyleBlack(){
        clickByXpathWebElement(styleBlack);
    }
    public void setStyleTranslucent(){
        clickByXpathWebElement(styleTranslucent);
    }
    public void setDone(){
        clickByXpathWebElement(done);
    }
    public void setItem1(){
        clickByXpathWebElement(item1);
    }
    public void setItem2(){
        clickByXpathWebElement(item2);
    }
    public void setTools(){
        clickByXpathWebElement(tools);
    }
}

