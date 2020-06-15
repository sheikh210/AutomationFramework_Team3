package electronicsPageTest;

import commonAPI.WebAPI;
import electronicsPage.ElectronicsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
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
    public static void testPageTitle() throws InterruptedException {
        getInItElements();
        electronicsPage.findOutPageTitle();
        electronicsPage.validatePageTitle();

    }
    @Test(priority = 3, enabled = false)
    public static void testPageUrl() throws InterruptedException {
        getInItElements();
        electronicsPage.findOutPageUrl();
        electronicsPage.validatePageUrl();
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
    @Test(priority = 7, enabled = false)
    public static void testProductAvailablity() throws InterruptedException {
        getInItElements();
        electronicsPage.checkProductAvailablity();
        electronicsPage.validateProductAvailablity();
    }
    @Test
    public static void testNavigationToOwnersPage(){
        getInItElements();
        String actualURL = electronicsPage.validateNavigationToEletronicsPage();

        String expectedURL = "https://www.ebay.com/b/Electronics/bn_7000259124";

        Assert.assertEquals(actualURL, expectedURL, "NOT NAVIGATED TO ELECTRONICS PAGE");
    }


}


