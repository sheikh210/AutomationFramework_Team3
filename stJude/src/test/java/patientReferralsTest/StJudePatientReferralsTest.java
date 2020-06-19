package patientReferralsTest;

import commonAPI.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import patientReferrals.StJudePatientReferralsPage;
import utilities.DataReader;

import java.io.IOException;

public class StJudePatientReferralsTest extends WebAPI {
    static StJudePatientReferralsPage stJudePatientReferralsPage;
    static DataReader dataReader = new DataReader();
    static String path=System.getProperty("user.dir") + "StJudePatientReferralsExpectedElements.xlsx";

    public static void getInItElement() {
        stJudePatientReferralsPage = PageFactory.initElements(driver, StJudePatientReferralsPage.class);
    }
//    @Test(priority = 1)
//    public void testValidatePatientReferralTitle(){
//        getInItElement();
//        String actualTitle= stJudePatientReferralsPage.validatePatientReferralTitle();
//        String expectedTitle="Patient Referrals - St. Jude Children’s Research Hospital";
//        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
//
//    }
//    @Test(priority = 2)
//    public void testValidateContactUsLink() throws IOException {
//        getInItElement();
//        Assert.assertTrue(stJudePatientReferralsPage.validateContactUsLink());
//    }
//    @Test(priority = 3)
//    public void testValidateSpanishLanguage() throws IOException {
//        getInItElement();
//        Assert.assertTrue(stJudePatientReferralsPage.validateSpanishLanguage());
//    }
//    @Test(priority = 4)
//    public void testValidateDonateNowLink() throws IOException {
//        getInItElement();
//        Assert.assertTrue(stJudePatientReferralsPage.validateDonateNowLink());
//    }
//    @Test(priority = 5)
//    public void testCountAboutUsLinks() throws IOException {
//        getInItElement();
//        Assert.assertTrue(stJudePatientReferralsPage.countAboutUsLinks());
//}
//    @Test(priority = 6)
//    public void testSearchHematology() throws IOException, InterruptedException {
//        getInItElement();
//        Assert.assertTrue(stJudePatientReferralsPage.searchHematology());
//    }
    @Test(priority = 7)
    public void testCountBodyLinks() throws IOException {
        getInItElement();
        Assert.assertTrue(stJudePatientReferralsPage.countBodyLinks());
    }
    @Test(priority = 8)
    public void testOpenBodyLinksInNewTabs() throws IOException, InterruptedException {
        getInItElement();
        Assert.assertTrue(stJudePatientReferralsPage.openBodyLinksInNewTabs());
    }
    @Test(priority = 9)
    public void testOpenBodyLinksInNewTabsForReferringPhysicians() throws IOException, InterruptedException {
        getInItElement();
        Assert.assertTrue(stJudePatientReferralsPage.openBodyLinksInNewTabsForPhysicians());
    }
    @Test(priority = 10)
    public void testValidateClinicalTrialsLink() throws IOException {
        getInItElement();
        Assert.assertTrue(stJudePatientReferralsPage.validateClinicalTrialsLink());
    }
    @Test (priority=11)
    public void testGetAcceptanceRequirementText() throws IOException {
        getInItElement();
        Assert.assertTrue(stJudePatientReferralsPage.getAcceptanceRequirementText());
    }
    @Test(priority=12)
    public void testValidateReferralContactForm() throws IOException, InterruptedException {
        getInItElement();
        Assert.assertTrue(stJudePatientReferralsPage.validateReferralContactForm());
    }
    @Test(priority=13)
    public void testVerifyPagerPhoneNumberIsDisplayed(){
        getInItElement();
        stJudePatientReferralsPage.verifyPagerPhoneNumberIsDisplayed();

    }
    @Test(priority=14)
    public void testVerifyTollFreePhoneNumberIsDisplayed(){
        getInItElement();
        stJudePatientReferralsPage.verifyTollFreePhoneNumberIsDisplayed();

    }
    @Test(priority=15)
    public void testVerifyFaxNumberIsDisplayed(){
        getInItElement();
        stJudePatientReferralsPage.verifyFaxNumberIsDisplayed();

    }
    @Test(priority=16)
    public void testVerifyEmailIsDisplayed(){
        getInItElement();
        stJudePatientReferralsPage.verifyFaxNumberIsDisplayed();
    }
    @Test(priority = 17)
    public void testOpenSocialMediaIconsInNewTabs() throws IOException, InterruptedException {
        getInItElement();
        Assert.assertTrue(stJudePatientReferralsPage.openSocialMediaIconsInNewTabs());
    }
    @Test(priority = 18)
    public void testOpenPartnersIconsInNewTabs() throws IOException, InterruptedException {
        getInItElement();
        Assert.assertTrue(stJudePatientReferralsPage.openPartnersIconsInNewTabs());
    }
    @Test(priority = 19)
    public void testValidateSiteMapLink() throws IOException {
        getInItElement();
        Assert.assertTrue(stJudePatientReferralsPage.validateSiteMapLink());
    }
    @Test(priority = 20)
    public void testValidateLinkingPolicyLink() throws IOException {
        getInItElement();
        Assert.assertTrue(stJudePatientReferralsPage.validateLinkingPolicyLink());
    }



}
