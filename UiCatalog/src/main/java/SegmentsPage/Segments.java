package SegmentsPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Segments extends Base {
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Segments\"]")
    public static WebElement Segments;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[1]")
    public static WebElement uiSegmentedControlCheck;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[1]")
    public static WebElement uiSegmentedControlSearch;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[1]")
    public static WebElement uiSegmentedTools;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[2]")
    public static WebElement uiSegmentedControlStyleCheck;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[3]")
    public static WebElement uiSegmentedControlStyleSearch;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[2]")
    public static WebElement uiSegmentedControlStyleTools;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[3]")
    public static WebElement uiSegmentedControlStyleBarCheck;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[3]")
    public static WebElement uiSegmentedControlStyleBarSearch;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[3]")
    public static WebElement uiSegmentedControlStyleBarTools;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[4]")
    public static WebElement uiSegmentTintCheck;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[4]")
    public static WebElement uiSegmentTintSearch;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[4]")
    public static WebElement uiSegmentTintTools;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[5]")
    public static WebElement uiSegmentImageCheck;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[5]")
    public static WebElement uiSegmentImageSearch;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[5]")
    public static WebElement uiSegmentImageTools;

    public void clickSegments(){
        Segments.click();
    }
    public void setUiSegmentControl(){
        Segments.click();
        clickByXpathWebElement(uiSegmentedControlCheck);
        clickByXpathWebElement(uiSegmentedControlSearch);
        clickByXpathWebElement(uiSegmentedTools);
    }
    public void setUiSegmentControlStyleBordered(){
        Segments.click();
        clickByXpathWebElement(uiSegmentedControlStyleCheck);
        clickByXpathWebElement(uiSegmentedControlStyleSearch);
        clickByXpathWebElement(uiSegmentedControlStyleTools);
    }
    public void setUiSegmentControlStyleBar(){
        Segments.click();
        clickByXpathWebElement(uiSegmentedControlStyleBarCheck);
        clickByXpathWebElement(uiSegmentedControlStyleBarSearch);
        clickByXpathWebElement(uiSegmentedControlStyleBarTools);
    }
    public void setUiSegmentControlStyleBarTint(){
        Segments.click();
        clickByXpathWebElement(uiSegmentTintCheck);
        clickByXpathWebElement(uiSegmentTintSearch);
        clickByXpathWebElement(uiSegmentTintTools);
    }
    public void setUiSegmentcontrolStyleBarImage(){
        Segments.click();
        clickByXpathWebElement(uiSegmentImageCheck);
        clickByXpathWebElement(uiSegmentImageSearch);
        clickByXpathWebElement(uiSegmentImageTools);
    }
}
