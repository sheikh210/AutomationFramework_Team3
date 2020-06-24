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

    @Test(priority = 1)
    public static void testNavigateToElectronicsPage() {

        getInItElements();
        String actualUrl = espnPlus.validateESPNPlusPageUrl();
        String expectedUrl = "https://www.espn.com/watch/espnplus/";

        Assert.assertEquals(actualUrl, expectedUrl, "Expected URL not found");

    }

    @Test(priority = 2)
    public static void testESPNPlusPageTitle() {
        getInItElements();
        String actualTitle = espnPlus.validateESPNPlusPageTitle();
        String expectedTitle = "ESPN+ | Videos | Watch ESPN";
        Assert.assertEquals(actualTitle, expectedTitle, "Expected title not found");
    }

    @Test(priority = 3)
    public static void testLookingValueIsDisplayed() throws InterruptedException {
        getInItElements();
        boolean actualValue = espnPlus.validateLookingValueIsDisplayed();
        boolean expectedValue = true;
        Assert.assertEquals(actualValue, expectedValue, "Expected value is not Displayed");
    }

    @Test(priority = 4)
    public static void testNapoliVsJuventusPopUpIsDisplayed() throws InterruptedException {
        getInItElements();
        boolean actualValue = espnPlus.validateNapoliVsJuventusPopUpIsDisplayed();
         Assert.assertEquals(actualValue,true);
    }

    @Test(priority = 5)
    public static void testNavigateToExpectedPage() throws InterruptedException {
        getInItElements();
        espnPlus.validateNavigateToExpectedPage();

    }

    @Test(priority = 6)
    public static void testTopEventsDropdownListSize() {
        getInItElements();

        espnPlus.validateTopEventsDropdownListSizeAndLinks();
    }

    @Test(priority = 7)
    public static void testSignUpPage() {
        getInItElements();
        espnPlus.validateSignUpPage();

    }

    @Test(priority = 8)
    public static void testInputName() throws InterruptedException {
        getInItElements();
        espnPlus.validateInputName();

    }

    @Test(priority = 9)
    public static void testLinksNumber() {
        getInItElements();
        int pageLinkNum = espnPlus.validateLinksNumber();

        Assert.assertEquals(pageLinkNum, 868, "Expected Link number not found");

    }

    @Test(priority = 10)
    public static void testActiveLinksNumber() {
        getInItElements();
        int actualLinksNumber = espnPlus.validateActiveLinksNumber();
        System.out.println(actualLinksNumber);
        int expectedLinksNumber = 307;

        Assert.assertEquals(actualLinksNumber, expectedLinksNumber, "Expected link number not found");

    }

    @Test(priority = 11)
    public static void testUFCPage() {
        getInItElements();
        String actualTitle = espnPlus.validateUFCPage();
        String expectedTitle = "ESPN+ | Videos | Watch ESPN";

        Assert.assertEquals(actualTitle, expectedTitle, "Expected page not found");


    }

    @Test(priority = 12)
    public static void testFanSupportPage() throws InterruptedException {
        getInItElements();
        String actualUrl = espnPlus.validateFanSupportPage();
        String expectedUrl = "https://support.espn.com/hc/en-us";
        Assert.assertEquals(actualUrl, expectedUrl, "Expected page not found");
    }

    @Test(priority = 13)
    public static void testItalianSeriePage() {
        getInItElements();
        String actualTitle = espnPlus.validateItalianSerieAPage();
        String expectedTitle = "ESPN+ | Videos | Watch ESPN";
        Assert.assertEquals(actualTitle,expectedTitle);


    }

    @Test(priority = 14)
    public static void testPGATourPage() {
        getInItElements();
        String actualTitle = espnPlus.validatePGATourPage();
        String expectedTitle = "ESPN+ | Videos | Watch ESPN";
        Assert.assertEquals(actualTitle,expectedTitle);


    }

    @Test(priority = 15)
    public static void validateNewNFLPage() {
        getInItElements();
        String actualURL = espnPlus.validateNewNFLPage();
        String expectedURL = "https://www.espn.com/espnplus/catalog/e364bfcd-493d-3bfb-ac83-bd27d66fedd0/baseball/_/sourceCollection/Browse_By_Sport_New/bucketId/29794";
        Assert.assertEquals(actualURL, expectedURL, "Expected url not found");


    }

    @Test(priority = 16)
    public static void validateMLBPage() {
        getInItElements();
        String actualURL = espnPlus.validateMLBPage();
        String expectedURL = "https://www.espn.com/espnplus/catalog/119cfa41-71d4-39bf-a790-6273a52b0259/soccer/_/sourceCollection/Browse_By_Sport_New/bucketId/29794";
        Assert.assertEquals(actualURL, expectedURL, "Expected url not found");

    }

    @Test(priority = 17)
    public static void validateNBAPage() {
        getInItElements();
        String actualURL = espnPlus.validateNBAPage();
        String expectedURL = "https://www.espn.com/espnplus/catalog/6fa31473-a322-3ed5-ac85-4e76b37065f3/golf/_/sourceCollection/Browse_By_Sport_New/bucketId/29794";
        Assert.assertEquals(actualURL, expectedURL, "Expected url not found");

    }


    @Test(priority = 18)
    public static void testNHLPage() {
        getInItElements();
        String actualTitle = espnPlus.validateNHLPage();
        String expectedTitle = "ESPN+ | Videos | Watch ESPN";
        Assert.assertEquals(actualTitle,expectedTitle);

    }
    @Test(priority = 19)
    public static void testMLSPage() {
        getInItElements();
        String actualURL = espnPlus.validateMLSPage();
        String expectedUrl = "https://www.espn.com/espnplus/catalog/2512ac76-a335-39cb-af51-b9afffc6571d/ice-hockey/_/sourceCollection/Browse_By_Sport_New/bucketId/29794";
        Assert.assertEquals(actualURL, expectedUrl, "Expected url not found");

    }
    @Test(priority = 20)
    public static void testEnglishLeaguePage() {
        getInItElements();
        String actualTitle = espnPlus.validateEnglishLeaguePage();
        String expectedTitle = "ESPN+ | Videos | Watch ESPN";
        Assert.assertEquals(actualTitle,expectedTitle,"Expected title is not found");

    }
}