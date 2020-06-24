package securitypageTest;

import commonAPI.WebAPI;
import org.testng.Assert;
import securitypage.Securitypage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SecuritypageTest  extends WebAPI{

    static Securitypage securitypage;
    public static void getInItElements(){ securitypage = PageFactory.initElements(driver, Securitypage.class); }

    @Test(priority = 0)
    public static void testSecuritypage() throws Exception {
        getInItElements();
        Assert.assertTrue(securitypage.validateSecuritypage());
    }
    @Test(priority = 1)
    public static void testNextArrow() throws Exception {
        getInItElements();
        Assert.assertTrue(securitypage.validateNextArrow());
    }
    @Test(priority = 2)
    public static void testPreviousArrow() throws Exception {
        getInItElements();
        Assert.assertTrue(securitypage.validatePreviousArrow());
    }
    @Test(priority = 3)
    public static void testMenuOtherPrivacyText() throws Exception {
        getInItElements();
        Assert.assertTrue(securitypage.getMenuOtherPrivacyText());
    }
    @Test(priority = 4)
    public static void testMenuOtherPrivacyURL() throws Exception {
        getInItElements();
        Assert.assertTrue(securitypage.getMenuOtherPrivacyURL());
    }
    @Test(priority = 5)
    public static void testMenuTopPrivacyText() throws Exception {
    getInItElements();
    Assert.assertTrue(securitypage.getMenuTopPrivacyText());
    }
    @Test(priority = 6)
    public static void testMenuTopPrivacyURL() throws Exception {
        getInItElements();
        Assert.assertTrue(securitypage.getMenuTopPrivacyURL());
    }
    @Test(priority = 7)
    public static void testAdditionalFraudButton() throws Exception {
        getInItElements();
        Assert.assertTrue(securitypage.validateAdditionalFraudButton());
    }
    @Test(priority = 8)
    public static void testFreeProductsButton() throws Exception {
        getInItElements();
        Assert.assertTrue(securitypage.validateFreeProductsButton());
    }
    @Test(priority = 9)
    public static void testMenuTopLinks1URL() throws Exception {
        getInItElements();
        Assert.assertTrue(securitypage.getMenuTopLinks1URL());
    }
    @Test(priority = 10)
    public static void testMenuTopLinks2URL() throws Exception {
        getInItElements();
        Assert.assertTrue(securitypage.getMenuTopLinks2URL());
    }
    @Test(priority = 11)
    public static void testMenuTopLinks3URL() throws Exception {
        getInItElements();
        Assert.assertTrue(securitypage.getMenuTopLinks3URL());
    }
    @Test(priority = 12)
    public static void testMenuTopLinks4URL() throws Exception {
        getInItElements();
        Assert.assertTrue(securitypage.getMenuTopLinks4URL());
    }
    @Test(priority = 13)
    public static void testKnowFraudPageURL() throws Exception {
        getInItElements();
        Assert.assertTrue(securitypage.getKnowFraudPage());
    }
    @Test(priority = 14)
    public static void testAvoidBankScamsPageURL() throws Exception {
        getInItElements();
        Assert.assertTrue(securitypage.getAvoidBankScamsPage());
    }
    @Test(priority = 15)
    public static void testReportActivityPage() throws Exception {
        getInItElements();
        Assert.assertTrue(securitypage.getReportActivityPage());
    }
    @Test(priority = 16)
    public static void testProtectYourSelfPage() throws Exception {
        getInItElements();
        Assert.assertTrue(securitypage.getProtectYourSelf());
    }
    @Test(priority = 17)
    public static void testFullPageVersionLink() throws Exception {
        getInItElements();
        Assert.assertTrue(securitypage.getFullPageVersionLink());
    }
    @Test(priority = 18)
    public static void testSignInButton() throws Exception {
        getInItElements();
        Assert.assertTrue(securitypage.getSignInButton());
    }
    @Test(priority = 19)
    public static void testLocationsButton() throws Exception {
        getInItElements();
        Assert.assertTrue(securitypage.getLocationsButton());
    }


}
