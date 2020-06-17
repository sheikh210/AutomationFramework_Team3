package businessandinstutionsTest;

import businessandinstitutions.BusinessAndInstitutionsPage;
import commonAPI.WebAPI;
import org.apache.xmlbeans.impl.xb.xsdschema.Facet;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BusinessAndInstitutionsTest extends WebAPI {

    static BusinessAndInstitutionsPage businessAndInstitutionsPage;

    public static void getInItElements() {
        businessAndInstitutionsPage = PageFactory.initElements(driver, BusinessAndInstitutionsPage.class);
    }


    @Test
    public static void testBusinessAndInstitutions() {
        getInItElements();
        businessAndInstitutionsPage.navigateToBusinessAndInstitutionsPage();

    }

    @Test
    public static void testBusinessAndInstitutionsUrl() {
        getInItElements();
        String actualUrl = businessAndInstitutionsPage.validateBusinessAndInstitutionsUrl();
        Assert.assertEquals(actualUrl, "https://www.bofaml.com/content/boaml/en_us/home.html");
    }

    @Test
    public static void testBusinessAndInstitutionsPageTitle() {
        getInItElements();
        String actualTitle = businessAndInstitutionsPage.validateBusinessAndInstitutionsPageTitle();
        Assert.assertEquals(actualTitle, "Bank of America Merrill Lynch - Business Solutions");
    }

    @Test
    public static void testBusinessAndInstitutionsLinkNumber() {
        getInItElements();
        businessAndInstitutionsPage.validateBusinessAndInstitutionsLinkNumber();

    }

    @Test
    public static void testFraudAndCyberSecurity() {
        getInItElements();
        businessAndInstitutionsPage.validatePageUrl2();

    }

    @Test
    public static void testAccessingReserchInsights() {
        getInItElements();
        businessAndInstitutionsPage.clickFeaturedContentMenu();
    }

    @Test
    public static void testFeaturedContentMenu() {
        getInItElements();
        businessAndInstitutionsPage.clickFeaturedContentMenu();

    }

    @Test
    public static void testTransactionServices() {
        getInItElements();
        businessAndInstitutionsPage.clickFeaturedContentMenu();
    }

    @Test
    public static void testBusinessBankingSolutions() {
        getInItElements();
        businessAndInstitutionsPage.clickFeaturedContentMenu();
    }
    @Test
    public static void testFundingGrowth() {
        getInItElements();
        businessAndInstitutionsPage.clickFeaturedContentMenu();
    }


    @Test
    public static void testFindingGrowth() {
        getInItElements();
        businessAndInstitutionsPage.validatePageUrl3();

    }
    @Test
    public static void testGrowingGlobally1() {
        getInItElements();
        businessAndInstitutionsPage.clickFeaturedContentMenu();

    }
    @Test
    public static void testFraudAndCybersecurity1() {
        getInItElements();
        businessAndInstitutionsPage.clickFeaturedContentMenu();

    }
    @Test
    public static void testOurBusiness1() {
        getInItElements();
        businessAndInstitutionsPage.clickFeaturedContentMenu();

    }

    @Test
    public static void testGrowingGlobally(){
        getInItElements();
        businessAndInstitutionsPage.validatePageUrl1();
    }
    @Test
    public static void testFraudAndCybersecurity(){
        getInItElements();
        businessAndInstitutionsPage.validatePageUrl4();
    }
    @Test
    public static void testAttractingAndRetainingTalent(){
        getInItElements();
        businessAndInstitutionsPage.validatePageUrl5();
    }
    @Test
    public static void testOptimizingTradingPerformance(){
        getInItElements();
        businessAndInstitutionsPage.validatePageUrl6();
    }
    @Test
    public static void testOurBusiness(){
        getInItElements();
        businessAndInstitutionsPage.validatePageUrl7();
    }
    @Test
    public static void testOurRegions(){
        getInItElements();
        businessAndInstitutionsPage.validatePageUrl8();
    }

}






