package ImagesPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Images extends Base {
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Images\"]")
    public static WebElement images;
    public void clickImages(){ images.click(); }
    public void show(){
        images.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Duration\"]")).getText();
        String Expected = "Duration";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
}
