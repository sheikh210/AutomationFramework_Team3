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

    @Test(priority = 1, enabled = false)
    public static void testNavigateToElectronicsPage() {

        getInItElements();
        String actualUrl = espnPlus.validateESPNPlusPageUrl();
        String expectedUrl = "https://www.espn.com/watch/espnplus/";

        Assert.assertEquals(actualUrl, expectedUrl, "Expected URL not found");

    }

    @Test(priority = 2, enabled = false)
    public static void testESPNPlusPageTitle() {
        getInItElements();
        String actualTitle = espnPlus.validateESPNPlusPageTitle();
        String expectedTitle = "ESPN+ | Videos | Watch ESPN";
        Assert.assertEquals(actualTitle, expectedTitle, "Expected title not found");
    }

    @Test(priority = 3, enabled = false)
    public static void testLookingValueIsDisplayed() throws InterruptedException {
        getInItElements();
        boolean actualValue = espnPlus.validateLookingValueIsDisplayed();
        boolean expectedValue = true;
        Assert.assertEquals(actualValue, expectedValue, "Expected value is not Displayed");
    }

    @Test(priority = 4, enabled = false)
    public static void testNapoliVsJuventusPopUpIsDisplayed() throws InterruptedException {
        getInItElements();
        espnPlus.validateNapoliVsJuventusPopUpIsDisplayed();
        // Assert.assertEquals(actualValue,true);
    }

    @Test(priority = 5, enabled = false)
    public static void testNavigateToExpectedPage() throws InterruptedException {
        getInItElements();
        espnPlus.validateNavigateToExpectedPage();

    }

    @Test(priority = 6, enabled = false)
    public static void testTopEventsDropdownListSize() {
        getInItElements();

        espnPlus.validateTopEventsDropdownListSizeAndLinks();
    }

    @Test(priority = 7, enabled = false)
    public static void testSignUpPage() {
        getInItElements();
        espnPlus.validateSignUpPage();

    }

    @Test(priority = 8, enabled = false)
    public static void testInputName() throws InterruptedException {
        getInItElements();
        espnPlus.validateInputName();

    }

    @Test(priority = 9, enabled = false)
    public static void testLinksNumber() {
        getInItElements();
        int pageLinkNum = espnPlus.validateLinksNumber();
        Assert.assertEquals(pageLinkNum, 868, "Expected Link number not found");

    }

    @Test(priority = 10, enabled = false)
    public static void testActiveLinksNumber() {
        getInItElements();
        int actualLinksNumber = espnPlus.validateActiveLinksNumber();
        int expectedLinksNumber = 307;

        Assert.assertEquals(actualLinksNumber, expectedLinksNumber, "Expected link number not found");

    }

    @Test(priority = 11, enabled = false)
    public static void testUFCPage() {
        getInItElements();
        String actualTitle = espnPlus.validateUFCPage();
        String expectedTitle = "ESPN+ | Videos | Watch ESPN";

        Assert.assertEquals(actualTitle, expectedTitle, "Expected page not found");


    }

    @Test(priority = 12, enabled = false)
    public static void testFanSupportPage() throws InterruptedException {
        getInItElements();
        String actualUrl = espnPlus.validateFanSupportPage();
        String expectedUrl = "https://support.espn.com/hc/en-us";
        Assert.assertEquals(actualUrl, expectedUrl, "Expected page not found");
    }

    @Test(priority = 13, enabled = false)
    public static void testItalianSeriePage() {
        getInItElements();
        String actualTitle = espnPlus.validateItalianSerieAPage();
        String expectedTitle = "ESPN+ | Videos | Watch ESPN";


    }

    @Test(priority = 14, enabled = false)
    public static void testPGATourPage() {
        getInItElements();
        String actualTitle = espnPlus.validatePGATourPage();
        String expectedTitle = "ESPN+ | Videos | Watch ESPN";


    }

    @Test(priority = 15, enabled = false)
    public static void validateNewNFLPage() {
        getInItElements();
        String actualURL = espnPlus.validateNewNFLPage();
        String expectedURL = "https://www.espn.com/espnplus/catalog/e364bfcd-493d-3bfb-ac83-bd27d66fedd0/baseball/_/sourceCollection/Browse_By_Sport_New/bucketId/29794";
        Assert.assertEquals(actualURL, expectedURL, "Expected url not found");


    }

    @Test(priority = 16, enabled = false)
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
        String expectedURL = "https://www.espn.com/espnplus/catalog/7b3729c9-7f69-308a-bf8a-ee15a6aba154/nba/_/sourceCollection/Browse_By_League_(ESPN%2B)/bucketId/29799";
        Assert.assertEquals(actualURL, expectedURL, "Expected url not found");

    }


    @Test(priority = 18, enabled = false)
    public static void testNHLPage() {
        getInItElements();
        String actualTitle = espnPlus.validateNHLPage();
        String expectedTitle = "ESPN+ | Videos | Watch ESPN";

    }
    @Test(priority = 19, enabled = false)
    public static void testMLSPage() {
        getInItElements();
        String actualURL = espnPlus.validateMLSPage();
        String expectedURL = "https://www.espn.com/espnplus/catalog/d9d3698e-67b3-3ca5-9eb4-f23b8e19a464/mls/_/sourceCollection/Browse_By_League_(ESPN%2B)/bucketId/29799";
        Assert.assertEquals(actualURL, expectedURL, "Expected url not found");

    }
    @Test(priority = 20, enabled = false)
    public static void testEnglishLeaguePage() {
        getInItElements();
        String actualTitle = espnPlus.validateEnglishLeaguePage();
        String expectedTitle = "ESPN+ | Videos | Watch ESPN";

    }
}