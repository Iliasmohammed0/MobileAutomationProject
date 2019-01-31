package PickersPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Picker extends Base {
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Pickers\"]")
    public static WebElement pickers;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"UIDatePicker\"]")
    public static WebElement datePickers;
    public void clickPickers(){
        pickers.click();
    }
    public void showDate(){
        pickers.click();
        datePickers.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"UIDatePickerModeDate\"]")).getText();
        String Expected = "UIDatePickerModeDate";
        System.out.println(Actual);
    }
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"UIPicker\"]")
    public static WebElement UIPickers;
    public void showUI() {
        pickers.click();
        UIPickers.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypePicker/XCUIElementTypePickerWheel[1]")).getAttribute("value");
        String Expected = "John Appleseed";
        System.out.println(Actual);
    }
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Custom\"]")
    public static WebElement custom;
    public void showCustom1(){
        pickers.click();
        custom.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypePicker/XCUIElementTypePickerWheel")).getAttribute("value");
        String Expected = "Early Morning, 1 of 4";
        System.out.println(Actual);
    }
}
