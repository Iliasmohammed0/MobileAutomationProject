package AlertsPage;

import common.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Alerts extends Base {
    @FindBy (xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[11]")
    public static WebElement alert;
    public void clickAlerts(){ alert.click(); }
    public void getAlertsSize(){
        alert.getSize();
        System.out.println(alert.getSize());
    }
    public  void getAlertsText(){
        String buttonTest = alert.getText();
        System.out.println(buttonTest);
    }
    @FindBy (xpath = "(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[1]")
    public static WebElement simple;
    public void showSimple(){
      alert.click();
      simple.click();
      String Actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"UIActionSheet <title>\"]")).getTagName();
      String Expected = "XCUIElementTypeStaticText";
      Assert.assertEquals(Actual, Expected);
      System.out.println(Actual);
  }
    @FindBy (xpath = "(//XCUIElementTypeStaticText[@name=\"Show OK-Cancel\"])[1]")
    public static WebElement okCancel;
    public void showOkCancel(){
        alert.click();
        okCancel.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"UIActionSheet <title>\"]")).getTagName();
        String Expected = "XCUIElementTypeStaticText";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    @FindBy (xpath = "//XCUIElementTypeStaticText[@name=\"Show Customized\"]")
    public static WebElement customized;
    public void showCustom(){
        alert.click();
        customized.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"UIActionSheet <title>\"]")).getTagName();
        String Expected = "XCUIElementTypeStaticText";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    @FindBy (xpath = "(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[2]")
    public static WebElement showSimpleAlerts;
    public void showSimpleAlerts(){
        alert.click();
        showSimpleAlerts.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"<Alert message>\"]")).getTagName();
        String Expected = "XCUIElementTypeStaticText";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
}
