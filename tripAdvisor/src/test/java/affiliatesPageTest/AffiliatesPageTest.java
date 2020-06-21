package affiliatesPageTest;

import affiliatesPage.AffiliatesPage;
import commonAPI.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConnectToSqlDB;
import utilities.DataReader;

import java.io.IOException;

public class AffiliatesPageTest extends WebAPI {
    static AffiliatesPage affiliatesPage;
    String path = System.getProperty("user.dir") +"" ;
    DataReader dataReader = new DataReader();
    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    public static void getInItElements(){
        affiliatesPage = PageFactory.initElements(driver, AffiliatesPage.class);
    }

//    @Test(priority = 1)
//    public void testValidateAffiliatesPageTitle() throws IOException {
//        getInItElements();
//        Assert.assertTrue(affiliatesPage.validateAffiliatesPageTitle());
//
//    }
//    @Test(priority = 2)
//    public void testValidateGetStartedImage() throws IOException {
//        getInItElements();
//        Assert.assertTrue(affiliatesPage.validateGetStartedImage());
//
//    }
//    @Test(priority = 3)
//    public void testValidateFAQsImage() throws IOException {
//        getInItElements();
//        Assert.assertTrue(affiliatesPage.validateFAQsImage());
//
//    }
//    @Test(priority = 4)
//    public void testValidateTipsImage() throws IOException {
//        getInItElements();
//        Assert.assertTrue(affiliatesPage.validateTipsImage());
//
//    }
//    @Test(priority = 5)
//    public void testValidateCommissionText() throws IOException {
//        getInItElements();
//        Assert.assertTrue(affiliatesPage.validateCommissionText());
//    }
//    @Test(priority = 6)
//    public void testValidateNoBookingText() throws IOException {
//        getInItElements();
//        Assert.assertTrue(affiliatesPage.validateNoBookingText());
//    }
//    @Test(priority = 7)
//    public void testCountPartnersLinks() throws IOException {
//        getInItElements();
//        Assert.assertTrue(affiliatesPage.countPartnersLinks());
//
//    }
//    @Test(priority = 8)
//    public void testValidatePartnersLinks() throws IOException, InterruptedException {
//        getInItElements();
//        Assert.assertTrue(affiliatesPage.validatePartnersLinks());
//
//    }
//    @Test(priority = 9)
//    public void testValidateSignInToolTip() throws InterruptedException {
//        getInItElements();
//        String expectedToolTipText="Enter your email address";
//        Assert.assertEquals(affiliatesPage.validateSignInToolTip(),expectedToolTipText,"Text does not match");
//
//    }
//    @Test(priority = 10)
//    public void testCountCurrencyMenuItems() throws IOException {
//        getInItElements();
//        Assert.assertTrue(affiliatesPage.countCurrencyMenuItems());
//    }
//    @Test(priority = 11)
//    public void testCountCountryMenuItems() throws IOException {
//        getInItElements();
//        Assert.assertTrue(affiliatesPage.countCountryMenuItems());
//    }
//    @Test(priority = 12)
//    public void testIsAllRightsReservedDisplayed(){
//        getInItElements();
//        Assert.assertTrue(affiliatesPage.isAllRightsReservedDisplayed());
//    }
//    @Test(priority = 13)
//    public void testCountFooterSectionLinks() throws IOException {
//        getInItElements();
//        Assert.assertTrue(affiliatesPage.countFooterSectionLinks());
//    }
    @Test(priority = 13)
    public void testValidateFooterSectionLinks() throws IOException, InterruptedException {
        getInItElements();
        Assert.assertTrue(affiliatesPage.validateFooterSectionLinks());
    }
}
