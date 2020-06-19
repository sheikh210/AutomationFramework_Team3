package espnplusTest;

import commonAPI.WebAPI;
import espnplus.ESPNPlus;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ESPNPlusTest extends WebAPI {

    static ESPNPlus espnPlus;

    public static void getInItElements() {

        espnPlus = PageFactory.initElements(driver, ESPNPlus.class);

    }

    @Test(priority = 1,enabled = false)
    public static void testNavigateToElectronicsPage() {

        getInItElements();
        String actualUrl = espnPlus.validateESPNPlusPageUrl();
        String expectedUrl = "https://www.espn.com/watch/espnplus/";

        Assert.assertEquals(actualUrl, expectedUrl, "Expected URL not found");

    }

    @Test(priority = 2,enabled = false)
    public static void testESPNPlusPageTitle() {
        getInItElements();
        String actualTitle = espnPlus.validateESPNPlusPageTitle();
        String expectedTitle = "ESPN+ | Videos | Watch ESPN";
        Assert.assertEquals(actualTitle,expectedTitle,"Expected title not found");
    }
    @Test(priority = 3,enabled = false)
    public static void testLookingValueIsDisplayed() throws InterruptedException {
        getInItElements();
        boolean actualValue=espnPlus.validateLookingValueIsDisplayed();
        boolean expectedValue=true;
        Assert.assertEquals(actualValue,expectedValue,"Expected value is not Displayed");
    }
    @Test(priority = 4,enabled = false)
    public static void testNapoliVsJuventusPopUpIsDisplayed() throws InterruptedException {
        getInItElements();
        espnPlus.validateNapoliVsJuventusPopUpIsDisplayed();
       // Assert.assertEquals(actualValue,true);
    }
    @Test(priority = 5,enabled = false )
    public static void testNavigateToExpectedPage() throws InterruptedException {
        getInItElements();
        espnPlus.validateNavigateToExpectedPage();

    }
    @Test (priority = 6,enabled = false)
    public static void testTopEventsDropdownListSize(){
        getInItElements();

        espnPlus.validateTopEventsDropdownListSizeAndLinks();
    }
    @Test(priority = 7,enabled = false)
    public static void testSignUpPage(){
        getInItElements();
        espnPlus.validateSignUpPage();

    }

    @Test(priority = 8,enabled = false)
    public static void testInputName() throws InterruptedException {
        getInItElements();
        espnPlus.validateInputName();

    }
    @Test(priority = 9)
    public static void testLinksNumber(){
        getInItElements();
        int pageLinkNum=espnPlus.validateLinksNumber();
      Assert.assertEquals(pageLinkNum,868,"Expected Link number not found");

    }
    @Test(priority = 10,enabled = false)
    public static void testActiveLinksNumber(){
        getInItElements();
        int actualLinksNumber=espnPlus.validateActiveLinksNumber();
        int expectedLinksNumber=307;

        Assert.assertEquals(actualLinksNumber,expectedLinksNumber,"Expected link number not found");

    }
    @Test(priority = 11,enabled = false)
    public static void testUFCPage() {
        getInItElements();
        String actualTitle=espnPlus.validateUFCPage();
        String expectedTitle="ESPN+ | Videos | Watch ESPN";

        Assert.assertEquals(actualTitle,expectedTitle,"Expected page not found");


    }
}
