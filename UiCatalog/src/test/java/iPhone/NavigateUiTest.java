package iPhone;

import navigate.NavigateUi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.List;

public class NavigateUiTest extends NavigateUi {
    NavigateUi navigateUi;
    @BeforeMethod
    public void initElements(){
        navigateUi = PageFactory.initElements(ad, NavigateUi.class);
    }
    @Test
    public void webElementName() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List actual = navigateUi.getNavigateUi1();
        List expected = navigateUi.getNavigateUi1();
        Assert.assertEquals(actual,expected);
    }
}

