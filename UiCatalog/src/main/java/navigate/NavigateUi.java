package navigate;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class NavigateUi extends Base {
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Buttons\"]")
    public static WebElement Buttons;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Controls\"]")
    public static WebElement Controls;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TextFields\"]")
    public static WebElement TextFields;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SearchBar\"]")
    public static WebElement SearchBar;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TextView\"]")
    public static WebElement TextView;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Pickers\"]")
    public static WebElement Pickers;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Images\"]")
    public static WebElement Images;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Web\"]")
    public static WebElement Web;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Segments\"]")
    public static WebElement Segments;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Toolbar\"]")
    public static WebElement Toolbar;
    public List getNavigateUi1() {
        List<WebElement> elements1 = new ArrayList<WebElement>();
        elements1.add(Buttons);
        elements1.add(Controls);
        elements1.add(TextFields);
        elements1.add(SearchBar);
        elements1.add(TextView);
        List<String> list = new ArrayList<String>();
        for (int i = 0; i<elements1.size();i++){
           list.add(elements1.get(i).getText());
        }
        System.out.println(list);
        return list;
    }
    public List getNavigateUi2() {
        List<WebElement> elements2 = new ArrayList<WebElement>();
        elements2.add(Pickers);
        elements2.add(Images);
        elements2.add(Web);
        elements2.add(Segments);
        elements2.add(Toolbar);
        List<String> list = new ArrayList<String>();
        for (int i = 0; i<elements2.size();i++){
            list.add(elements2.get(i).getText());
        }
        System.out.println(list);
        return list;
    }

//    public void home()throws InterruptedException{
//
//        List<WebElement> elements = new ArrayList<WebElement>();
//        sleep(1);
//        //store mobile elements into ArrayList
//        elements = ad.findElements(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell"));
//        sleep(1);
//
//        for(int i=1; i<elements.size(); i++){
//            //click on each elements
//            clickByXpath("//XCUIElementTypeCell["+i+"]");
//            clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIANavigationBar[1]/UIAButton[1]");
//        }
//    }
}
