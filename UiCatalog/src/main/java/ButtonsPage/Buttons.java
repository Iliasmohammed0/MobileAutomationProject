package ButtonsPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Buttons extends Base {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Buttons\"]")
    public static WebElement buttons;
    public void clickButton(){ buttons.click();
    }
    public void getButtonSize(){
        buttons.getSize();
        System.out.println(buttons.getSize());
    }
    public  void getButtonText(){
        String buttonTest = buttons.getText();
        System.out.println(buttonTest);
    }
    public void showBackgroundImage(){
        buttons.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Background Image\"]")).getText();
        String Expected = "Background Image";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showButtonWithImage() {
        buttons.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Button with Image\"]")).getText();
        String Expected = "Button with Image";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void showRoundedButton(){
        buttons.click();
        String Actual = ad.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"UIButtonTypeRoundedRect\"])[1]")).getText();
        String Expected = "UIButtonTypeRoundedRect";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
}
