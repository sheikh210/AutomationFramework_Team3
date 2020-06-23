package fashionTest;

import commonAPI.WebAPI;
import fashion.FashionPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FashionTest extends WebAPI {
    static FashionPage fashionPage;

    public static void getInElement(){

        fashionPage = PageFactory.initElements(driver,FashionPage.class);
    }
    @Test
    public static void testNavigateFashionPage(){
        getInElement();
        fashionPage.navigateToFashionPage();
        fashionPage.validateNavigateToFashionPage();
    }
    @Test
    public static void testPageTitle() throws InterruptedException {
        getInElement();
        fashionPage.pageTitle();
        fashionPage.validatePageTitle();

    }
    @Test
    public static void testTopCategories() throws InterruptedException {
        getInElement();
        fashionPage.topCategories();
        fashionPage.validateTopCategories();

    }
    @Test
    public static void testShopByCategory() throws InterruptedException {
        getInElement();
        fashionPage.shopByCategory();
        fashionPage.validateShopByCategories();
    }
    @Test
    public static void testSearchProduct1() throws InterruptedException {
        getInElement();
        fashionPage.searchProduct1();
        fashionPage.validateSearchProduct1();
    }
    @Test
    public static void testPageUrl() throws InterruptedException {
        getInElement();
        fashionPage.pageUrl();
        fashionPage.validatePageUrl();
    }
    @Test
    public static void testSearchingProduct() throws InterruptedException {
        getInElement();
        fashionPage.searchingProduct();
        fashionPage.validateSeachingProduct();
    }
    @Test
    public void testMoveBackward(){
        getInElement();
        fashionPage.validateMoveBackward();
    }
    @Test
    public static void testReturnToFashionPage(){
        getInElement();
        fashionPage.validateReturnToFashionPage();
    }
    @Test
    public static void testExpectedPage() throws InterruptedException {
        getInElement();
        fashionPage.expectedPage();
        fashionPage.validateExpectedPage();
    }
    @Test
    public static void testNavigateToMainPage(){
        getInElement();
        String actualURL = fashionPage.validateFashionPage();
        String expectedURL = "https://www.ebay.com/b/Fashion/bn_7000259856";
        Assert.assertEquals(actualURL, expectedURL,"Page not found");
    }
    @Test
    public static void testArrowMenu(){
        getInElement();
        fashionPage.validateArrowMenu();

    }
    @Test
    public static void testChanelLink(){
        getInElement();
        fashionPage.validateChanelLink();
    }
    @Test
    public static void testWebElementIsAvailable() throws InterruptedException {
        getInElement();
        boolean actualValue = fashionPage.validateWebElementIsAvailable();
        Assert.assertEquals(actualValue,true);


    }
    @Test
    public static void testTitle() throws InterruptedException {
        getInElement();
        fashionPage.validateTitle();

    }
    @Test
    public static void testVintageArrow() throws InterruptedException {
        getInElement();
        fashionPage.validateVintageArrow();
    }

    @Test
    public static void testHealthMenuIsAvailable() throws InterruptedException {
        getInElement();
        boolean actualValue = fashionPage.validateHealthMenuIsAvailable();
        Assert.assertEquals(actualValue,true);

    }
    @Test
    public static void testNavigateToWomensClothingPageUrl(){
        getInElement();
        String actualURL = fashionPage.validateReturnToWomensClothingPage();
        String expectedURL = "https://www.ebay.com/b/Fashion/bn_7000259856";
        Assert.assertEquals(actualURL, expectedURL,"Page not found");
    }
    @Test
    public static void testShoesMenu() throws InterruptedException {
        getInElement();
        fashionPage.validateShoesMenu();
    }
    @Test
    public static void testWatchesMenu(){
        getInElement();
        fashionPage.validateShoesMenu();
    }



}
