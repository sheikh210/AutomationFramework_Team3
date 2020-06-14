package inHomePageTest;


import commonAPI.WebAPI;
import inHomePage.VerizonWirelessInHomePage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VerizonWirelessInHomePageTest extends WebAPI {

    static VerizonWirelessInHomePage verizonWirelessInHomePage;

    public static void getInItElement() {
        verizonWirelessInHomePage = PageFactory.initElements(driver, VerizonWirelessInHomePage.class);
    }

    @Test(priority = 0)
    public static void testInHomePageTitle(){
        getInItElement();
        verizonWirelessInHomePage.validateInHomePage();
        verizonWirelessInHomePage.validatePageTitle();
    }
    @Test(priority = 1)
    public static void testCountShopMenuOption(){
        getInItElement();
        verizonWirelessInHomePage.countShopMenuOption();
        verizonWirelessInHomePage.validateShopMenuOption();
    }
    @Test(priority=2)
    public static void testOpenDisplayMenuLinks(){
        getInItElement();
        verizonWirelessInHomePage.openDisplayMenuLinks();
        verizonWirelessInHomePage.validateOpenDisplayMenuLinks();
    }
    @Test(priority=3)
    public static void testOpenSearchButton(){
        getInItElement();
        verizonWirelessInHomePage.OpenSearchBox();
        verizonWirelessInHomePage.validateSearchBox();

    }
    @Test(priority = 4)
    public static void testOpenNewTab(){
        getInItElement();
        verizonWirelessInHomePage.openNewTab();
    }
    @Test(priority = 5)
    public static void testTypeOnSearchBox(){
        getInItElement();
        verizonWirelessInHomePage.typeOnSearchBox();
        verizonWirelessInHomePage.validateTypeOnSearchBar();
    }
    @Test(priority = 6)
    public static void testRegisterNyTimes(){
        getInItElement();
        verizonWirelessInHomePage.registerNyTimes();
        verizonWirelessInHomePage.validateRegisterNyTimes();

    }
    @Test(priority = 7)
    public static void testClickMyVerizonTab(){
        getInItElement();
        verizonWirelessInHomePage.clickMyVerizonTab();
        verizonWirelessInHomePage.validateClickMyVerizonTab();

    }
    @Test(priority = 8)
    public static void testClickSupportTab() throws InterruptedException {
        getInItElement();
        verizonWirelessInHomePage.clickSupportTab();
        verizonWirelessInHomePage.validateClickSupportTab();

    }
    @Test(priority = 9)
    public static void testClickWatchTvTab() {
        getInItElement();
        verizonWirelessInHomePage.clickWatchTvTab();
        verizonWirelessInHomePage.validateClickWatchTvTab();

    }
    @Test(priority = 10)
    public static void testChangeLanguage() throws InterruptedException {
        getInItElement();
        verizonWirelessInHomePage.changePageLanguage();
        verizonWirelessInHomePage.validateChangePageTitle();

    }
    @Test(priority = 11)
    public static void testCountSignInButton() throws InterruptedException {
        getInItElement();
        verizonWirelessInHomePage.countSignInButtonOption();
        verizonWirelessInHomePage.validateCountSignInButtonOption();

    }
    @Test(priority = 12)
    public static void testClickContactUsLink() throws InterruptedException {
        getInItElement();
        verizonWirelessInHomePage.clickContactUsLink();
        verizonWirelessInHomePage.validateClickContactUsLink();

    }
    @Test(priority = 13)
    public static void testValidateSocialMediaTabs() throws InterruptedException {
        getInItElement();
        verizonWirelessInHomePage.countSocialMediaTabs();
        verizonWirelessInHomePage.validateCountSocialMediaLinks();

    }
    @Test(priority = 14)
    public static void verifyMyFiosApp() throws InterruptedException {
        getInItElement();
        verizonWirelessInHomePage.verifyMyFiosApp();
        verizonWirelessInHomePage.validateMyFiosAppLink();

    }
    @Test(priority = 15)
    public static void testVerifyTermsAndConditionsLink() throws InterruptedException {
        getInItElement();
        verizonWirelessInHomePage.verifyTermsAndConditionsLink();
        verizonWirelessInHomePage.validateTermsAndConditionsLink();

    }
    @Test(priority = 16)
    public static void testClickSearchByStateLink() throws InterruptedException {
        getInItElement();
        verizonWirelessInHomePage.clickSearchByStateLink();
        verizonWirelessInHomePage.validateClickSearchByStateLink();

    }
    @Test(priority = 17)
    public static void testValidateHomePageLogo() throws InterruptedException {
        getInItElement();
        verizonWirelessInHomePage.validateHomePageLogo();


    }
    @Test(priority = 18)
    public static void testValidateLocateCompass() throws InterruptedException {
        getInItElement();
        verizonWirelessInHomePage.validateLocateCompass();


    }
    @Test(priority = 19)
    public static void testPrintFooterSectionLinks() throws InterruptedException {
        getInItElement();
        verizonWirelessInHomePage.printFooterSectionLinks();
    }
}

