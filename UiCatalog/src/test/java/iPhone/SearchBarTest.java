package iPhone;

import SearchBarPage.SearchBar;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SearchBarTest extends SearchBar {
    SearchBar searchBar;
    @BeforeMethod
    public void initElements(){
        searchBar = PageFactory.initElements(ad, SearchBar.class);
    }
    @Test
    public void testPicker1() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBar.setSearchBar();
    }
}
