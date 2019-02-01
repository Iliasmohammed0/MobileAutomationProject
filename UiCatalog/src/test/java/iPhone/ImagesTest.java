package iPhone;

import ImagesPage.Images;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class ImagesTest extends Images {

    Images images;
    @BeforeMethod
    public void initElements(){
        images = PageFactory.initElements(ad, Images.class);
    }
    @Test public void testClickImage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        images.clickImages();
    }
    @Test
    public void testWebText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        images.getImagesText();
    }
    @Test
    public void testWebSize(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        images.getImagesSize();
    }
    @Test
    public void testButton1() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        images.show();
    }
}
