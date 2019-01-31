package ControlsPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Controls extends Base {
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Controls\"]")
    public static WebElement control;
    public void clickControl(){ control.click(); }
    public void showSwitch(){
        control.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"UISwitch\"]")).getText();
        String Expected = "UISwitch";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showSlider(){
        control.click();
        String Actual = ad.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"UISlider\"])[1]")).getText();
        String Expected = "UISlider";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showPageControl(){
        control.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"UIPageControl\"]")).getText();
        String Expected = "UIPageControl";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
}
