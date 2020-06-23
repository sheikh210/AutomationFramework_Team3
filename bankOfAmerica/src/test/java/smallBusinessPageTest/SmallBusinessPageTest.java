package smallBusinessPageTest;

import commonAPI.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import smallBusinessPage.SmallBusinessPage;



import java.io.IOException;


public class SmallBusinessPageTest extends WebAPI {
    static SmallBusinessPage smallBusinessPage;
    public static void getInItElements() {
        smallBusinessPage = PageFactory.initElements(driver,SmallBusinessPage.class);
    }
    //1
    @Test(priority = 1, enabled = false)
    public static void testSmallBusiness(){
        getInItElements();
        smallBusinessPage.navigateToSmallBusinessPage();
    }
    //2
    @Test(priority = 2, enabled = false)
    public static void testSmallBusinessPageUrl(){
        getInItElements();
        String actualUrl = smallBusinessPage.validateSmallBusinessPageUrl();
        Assert.assertEquals(actualUrl,"https://www.bankofamerica.com/smallbusiness/");
    }
    //3
    @Test(priority = 3, enabled = false)
    public static void testSmallBusinessPageTitle(){
        getInItElements();
        String actualTitle = smallBusinessPage.validateSmallBusinessPageTitle();
        Assert.assertEquals(actualTitle,"Small Business Banking, Credit Cards & Loans – Bank of America");
    }
    //4
    @Test(priority = 4, enabled = false)
    public static void testSmallBusinessLinkNumber(){
        getInItElements();
        smallBusinessPage.validateSmallBusinessLinkNumber();
    }
    //5
    @Test(priority = 5,enabled = false)
    public void testDoMoveBackward() {
        getInItElements();
        smallBusinessPage.validateDoMoveBackward();
    }
    //6
    @Test (priority = 6, enabled = false)
    public static void testReturnToSmallBusiness() {
        getInItElements();
        smallBusinessPage.validateReturnToSmallBusiness();
    }
    //7
    @Test (priority = 7, enabled = false)
    public static void testNavigateToSmallBusinessOwnerPage() {
        getInItElements();
        String actualURL = smallBusinessPage.validateNavigateToSmallBusinessOwnerPage();
        String expectedURL = "https://www.bankofamerica.com/smallbusiness/";
        Assert.assertEquals(actualURL, expectedURL, "NAVIGATE TO OWNER PAGE");
    }
    //8
    @Test (priority = 8, enabled = false)
    public static void testCreditCard () {
        getInItElements();
        smallBusinessPage.validatePageUrl2();
    }
    //9
    @Test(priority = 9,enabled = false)
    public static void testCheckingAccount() {
        getInItElements();
        smallBusinessPage.validatePageUrl3();
    }
    //10
    @Test (priority = 10, enabled = false)
    public static void testSavingAccount() {
        getInItElements();
        smallBusinessPage.validatePageUrl4();
    }
    //11
    @Test (priority = 11, enabled = false)
    public static void testBusinessService () {
        getInItElements();
        smallBusinessPage.validatePageUrl5();
    }
    //12
    @Test(priority = 12,enabled = false)
    public void testIsHomePageLogoDisplayed(){
       getInItElements();
       smallBusinessPage.isHomePageLogoDisplayed();
      Assert.assertEquals(smallBusinessPage.isHomePageLogoDisplayed(),true,"Home Page Logo is not displayed");
    }
    //13
    @Test (priority = 13,enabled = false)
    public void testIsHomePageHeaderDisplayed(){
        getInItElements();
        smallBusinessPage.isHomePageHeaderDisplayed();
        Assert.assertEquals(smallBusinessPage.isHomePageHeaderDisplayed(),true,"Home Page Header is not displayed");
    }
    //14
    @Test(priority = 14,enabled = false)
    public void testIsHomePageInvestingDisplayed(){
        getInItElements();
        smallBusinessPage.isHomePageInvestingDisplayed();
        Assert.assertEquals(smallBusinessPage.isHomePageInvestingDisplayed(),true,"Investing is not displayed");
    }
    //15
    @Test (priority = 15,enabled = false)
    public void testIsHomePageLendingDisplayed(){
        getInItElements();
        smallBusinessPage.isHomePageLendingDisplayed();
        Assert.assertEquals(smallBusinessPage.isHomePageLendingDisplayed(),true,"Lending is not displayed");
    }
    //16
    @Test (priority = 16,enabled = false)
    public void testIsHomePageExploreAppButtonDisplayed(){
        getInItElements();
        smallBusinessPage.isHomePageExploreAppButtonDisplayed();
        Assert.assertEquals(smallBusinessPage.isHomePageExploreAppButtonDisplayed(),true,"not displayed");
    }
    //17
    @Test(priority = 17,enabled = false)
    public static void testBusinessService2() {
        getInItElements();
        smallBusinessPage.clickBusinessService2();
    }
    //18
    @Test (priority = 18, enabled = false)
    public void testIsHomeSignInDisplayed(){
        getInItElements();
        smallBusinessPage.isHomePageSignInDisplayed();
        Assert.assertEquals(smallBusinessPage.isHomePageSignInDisplayed(),true,"Sign In not displayed");
    }
    //19
    @Test(priority = 19,enabled = false)
    public void testIsHomeForgotPasswordButtonDisplayed(){
        getInItElements();
        smallBusinessPage.isHomePageForgotPasswordButtonDisplayed();
        Assert.assertEquals(smallBusinessPage.isHomePageForgotPasswordButtonDisplayed(),true,"Password not displayed");
    }
    //20
    @Test (priority = 20,enabled = false)
    public void testIsHomeBenefitMenuDisplayed(){
        getInItElements();
        smallBusinessPage.isHomePageOnlineBankingDisplayed();
        Assert.assertEquals(smallBusinessPage.isHomePageOnlineBankingDisplayed(),true,"Online Banking is Not displayed");
    }



}
