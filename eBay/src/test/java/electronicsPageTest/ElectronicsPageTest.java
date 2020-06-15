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
    @Test(priority = 8, enabled = false)
    public static void testNavigationToOwnersPage(){
        getInItElements();
        String actualURL = electronicsPage.validateNavigationToEletronicsPage();

        String expectedURL = "https://www.ebay.com/b/Electronics/bn_7000259124";

        Assert.assertEquals(actualURL, expectedURL, "NOT NAVIGATED TO ELECTRONICS PAGE");
    }
    @Test(priority = 9, enabled = false)
    public static void testMenuNumber(){
        getInItElements();

        int actualMenuNum=electronicsPage.validateMenuNumber();

        Assert.assertEquals(actualMenuNum,160);

    }
    @Test(priority = 10, enabled = false)
    public static void testMyEbayMenuNumber(){
        getInItElements();
        int actualNumber=electronicsPage.validateMyEbayMenuNumber();
        Assert.assertEquals(actualNumber,69);
    }
    @Test(priority = 11, enabled = false)
    public static void testEbayElectronicsPageTitle(){
        getInItElements();
        String actualTitle=electronicsPage.validateEbayElectronicsPageTitle();
        String expectedTitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
        Assert.assertEquals(actualTitle,expectedTitle,"Ebay Electronics home page title not found");

    }
    @Test(priority = 12, enabled = false)
    public static void testLink(){

        getInItElements();
        electronicsPage.validateLink();

    }
    @Test(priority = 13, enabled = false)
    public void testDoMoveBackward(){
        getInItElements();
        electronicsPage.validateDoMoveBackward();
    }
   @Test(priority = 14, enabled = false)
   public static void testReturnToElectronicsPage() {
       getInItElements();
       electronicsPage.validateReturnToElectronicsPage();
   }
   @Test(priority = 15, enabled = false)
   public static void testElementsIsDisplayed(){
        getInItElements();
        boolean actualElementIsDisplayed=electronicsPage.validateElementsIsDisplayed();
        Assert.assertEquals(actualElementIsDisplayed,true);
   }
   @Test(priority = 16,enabled = false)
   public static void testKidsToysIsDisplayed() {
        getInItElements();
        boolean actualValue=electronicsPage.validateKidsToysIsDisplayed();
        Assert.assertEquals(actualValue,true,"Expected Value does not exist");
   }
   @Test(priority = 17,enabled = false)
    public static void testCountryList() throws InterruptedException {
        getInItElements();
        electronicsPage.validateFigureOutCountryFromList();
    }
    @Test(priority = 18,enabled = false)
    public static void testElementIsDisplayed(){
        getInItElements();
       boolean actualValue=electronicsPage.validateElementIsDisplayed();
       Assert.assertEquals(actualValue,true,"Expected Element not found");
    }
    @Test(priority = 19,enabled = false)
    public static void testAirPodProAvailability(){
        getInItElements();
        boolean actualValue=electronicsPage.validateAirPodProAvailability();
        Assert.assertEquals(actualValue,true,"Air pod Pro is not available in stock");
    }
    @Test(priority = 20)
    public static void testElectronicsPageUrl(){

        getInItElements();
        electronicsPage.validateElectronicsPageUrl();
    }



}


