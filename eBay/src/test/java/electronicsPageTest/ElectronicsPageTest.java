package electronicsPageTest;

import commonAPI.WebAPI;
import electronicsPage.ElectronicsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ElectronicsPageTest extends WebAPI {

    static ElectronicsPage electronicsPage;

    public static void getInItElements() {
        electronicsPage = PageFactory.initElements(driver, ElectronicsPage.class);

    }

    @Test(priority = 1, enabled = false)
    public static void testNavigateToElectronicsPage() {
        getInItElements();
        electronicsPage.navigateToElectronicsPage();
        electronicsPage.validateNavigateToElectronicsPage();
    }

    @Test(priority = 2, enabled = false)
    public static void testFigureOutSubMenus() throws InterruptedException {
        getInItElements();
        electronicsPage.doMouseHover();
        electronicsPage.validateMouseHover();

    }
    @Test(priority = 3, enabled = false)
    public static void TestHandleDropDown() throws InterruptedException {
        getInItElements();
        electronicsPage.doHandleDropDown();
        electronicsPage.validateHandleDropDown();
    }
    @Test(priority = 4, enabled = false)
    public static void testSearchProduct() throws InterruptedException {
        getInItElements();
        electronicsPage.doSearchProduct();
        electronicsPage.validateSearchProduct();

    }
    @Test(priority = 5, enabled = false)
    public static void testFigureOutExpectedPage() {
        getInItElements();
        electronicsPage.doFigureOutExpectedPage();
        electronicsPage.validateFigureOutExpectedPage();
    }
    @Test(priority = 6, enabled = false)
    public static void testArrowButtonLinks(){
        getInItElements();
        electronicsPage.doCheckArrowButtonLinks();
        electronicsPage.validateArrowButtonLinks();
    }
    @Test
    public static void testProductAvailablity() throws InterruptedException {
        getInItElements();
        electronicsPage.checkProductAvailablity();
        electronicsPage.validateProductAvailablity();
    }

}


