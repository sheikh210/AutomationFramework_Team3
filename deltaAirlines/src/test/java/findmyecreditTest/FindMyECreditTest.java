package findmyecreditTest;

import commonAPI.WebAPI;
import findmyecredit.FindMyECreditPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindMyECreditTest extends WebAPI {

    static FindMyECreditPage findMyECreditPage;

    public static void getInItElements() {

        findMyECreditPage = PageFactory.initElements(driver, FindMyECreditPage.class);
    }

    @Test(priority = 1)
    public static void testCoronaVirusUpdatePage() {
        getInItElements();
        String actualUrl = findMyECreditPage.validateCoronaVirusUpdatePage();
        String expectedUrl = "https://www.delta.com/us/en/travel-update-center/overview";
        Assert.assertEquals(actualUrl, expectedUrl, "Expected url not found");
    }

    @Test(priority = 2)
    public static void testECreditTextAvailablety() {
        getInItElements();
        boolean actualValue = findMyECreditPage.validateECreditTextAvailablety();
        Assert.assertEquals(actualValue, true, "Expected value does not exist");
    }

    @Test(priority = 3)
    public static void testPrefixText() {
        getInItElements();
        String actualText = findMyECreditPage.validatePrefixText();
        String expectedText = "Mr";
        Assert.assertEquals(actualText, expectedText, "Expected text not found");
    }

    @Test(priority = 4)
    public static void testSuffixMDFilling() throws InterruptedException {
        getInItElements();
        boolean actualValue = findMyECreditPage.validateSuffixMDFilling();
        Assert.assertEquals(actualValue, true, "Expected value have not Filled");
    }

    @Test(priority = 5)
    public static void testGenderMaleDisplayed() throws InterruptedException {
        getInItElements();
        boolean actualValue = findMyECreditPage.validateGenderMaleDisplayed();
        Assert.assertEquals(actualValue, true);
    }

    @Test(priority = 6)
    public static void testJuneMonthIsDisplayed() {
        getInItElements();
        boolean actualValue = findMyECreditPage.validateJuneMonthIsDisplayed();
        Assert.assertEquals(actualValue, true);

    }

    @Test(priority = 7)
    public static void testSubMenuNumber() {
        getInItElements();
        int actualSubMenuNumber = findMyECreditPage.validateSubMenuNumber();
        Assert.assertEquals(actualSubMenuNumber, 8, "Expected Sub menu number not found");

    }

    @Test(priority = 8)
    public static void testGet_To_KnowMedallion_Status() {
        getInItElements();
        boolean actualStatus = findMyECreditPage.validateGet_To_KnowMedallion_Status();
        Assert.assertEquals(actualStatus, true, "Expected value is not displayed");

    }

    @Test(priority = 9)
    public static void testProgramResourcesAvailable() {
        getInItElements();
        String actualValue = findMyECreditPage.validateProgramResourcesAvailable();
        String expectedValue = "Program Resources";
        Assert.assertEquals(actualValue, expectedValue, "Expected Element does not exist");
    }

    @Test(priority = 10)
    public static void testBuyOrTransferMilesIsDisplayed() {
        getInItElements();
        boolean actualStatus = findMyECreditPage.validateBuyOrTransferMilesIsDisplayed();
        Assert.assertEquals(actualStatus, true, "Expected Element not found");
    }

    @Test(priority = 11)
    public static void testSkyMilesCreditCards() {
        getInItElements();
        String actualValue = findMyECreditPage.validateSkyMilesCreditCards();
        String expectedValue = "SkyMiles Credit Cards";
        Assert.assertEquals(actualValue, expectedValue, "Expected Element does not exist");
    }

    @Test(priority = 12)
    public static void testSkyMilesPartnersAvailablity() {
        getInItElements();
        boolean actualStatus = findMyECreditPage.validateSkyMilesPartnersAvailablity();
        Assert.assertEquals(actualStatus, true, "Expected Element not found");
    }
    @Test(priority = 13)
    public static void testNewsSpecialOffers() {
        getInItElements();
        String actualText=findMyECreditPage.validateNewsSpecialOffers();
        String expectedText="News & Special Offers";
        Assert.assertEquals(actualText,expectedText,"Expected text not found");
    }
    @Test(priority = 14)
    public static void testSkyMilesCruisesAvailablity() {
        getInItElements();
        boolean actualStatus=findMyECreditPage.validateSkyMilesCruisesAvailablity();
        Assert.assertEquals(actualStatus,true,"Expected value not found");
    }
    @Test(priority = 15)
    public static void testBookAwardTravelAvailable() {
        getInItElements();
        String actualValue=findMyECreditPage.validateBookAwardTravelAvailable();
        String expectedValue="Book Award Travel";
        Assert.assertEquals(actualValue,expectedValue,"Expected value not found");

    }
    @Test(priority = 16)
    public static void testUpgradeWithMilesAvailablity() {
        getInItElements();
        boolean actualStatus=findMyECreditPage.validateUpgradeWithMilesAvailablity();
        Assert.assertEquals(actualStatus,true,"Expected value not found");
    }
    @Test(priority = 17)
    public static void testManageYourAccountAvailable() {
        getInItElements();
        String actualValue=findMyECreditPage.validateManageYourAccountAvailable();
        String expectedValue="Manage your Account";
        Assert.assertEquals(actualValue,expectedValue,"Expected value not found");

    }
    @Test(priority = 18)
    public static void testCertificatesECreditsAvailablity() {
        getInItElements();
        boolean actualStatus = findMyECreditPage.validateCertificatesECreditsAvailablity();
        Assert.assertEquals(actualStatus, true, "Expected value not found");

    }
    @Test(priority = 19)
    public static void testQuestionOneAnswerIsDisplayed() {
        getInItElements();
        boolean actualStatus=findMyECreditPage.validateQuestionOneAnswerIsDisplayed();
        Assert.assertEquals(actualStatus,true,"Questions one is not displayed");
    }
    @Test(priority = 20)
    public static void testQuestionTwoAnswerIsDisplayed() {
        getInItElements();
        boolean actualStatus=findMyECreditPage.validateQuestionTwoAnswerIsDisplayed();
        Assert.assertEquals(actualStatus,true,"Questions Two is not displayed");
    }


}



