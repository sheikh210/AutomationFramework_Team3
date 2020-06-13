package homepage;
import static homepage.VerizonWirelessHomepageElements.*;
import commonAPI.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerizonWirelessHomepage extends WebAPI {

    //page object design pattern
    //case 1 elements
    @FindBy(xpath = signinButton)
    public WebElement websignbutton;

    @FindBy(xpath = usernamefield)
    public WebElement webusernamefield;

    @FindBy(xpath = passwordfield)
    public WebElement webpasswordfield;

    @FindBy(xpath = loginbutton)
    public WebElement webloginbutton;

    //-----------------------------------------------------------------------
    //Case 2 Elements
    @FindBy(xpath = click5gOverview)
    public WebElement webclick5gOverview;

    @FindBy(xpath = swipeButton)
    public WebElement webswipeButton;

    @FindBy(xpath = click5gHomeInternet)
    public WebElement webclick5gHomeInternet;

    //-----------------------------------------------------------------------
    //Case 3 Elements
    @FindBy(xpath = clickSupportOverview)
    public WebElement webclickSupportOverview;

    @FindBy(xpath = searchBar)
    public WebElement websearchBar;

    @FindBy(xpath = searchButton)
    public WebElement websearchButton;

    @FindBy(xpath = clickPayBill)
    public WebElement webclickPayBill;

    //-----------------------------------------------------------------------
    //Case 4 Elements
    @FindBy(xpath = clickSmartphone)
    public WebElement webclickSmartphone;

    @FindBy(xpath = clickRetailPrice)
    public WebElement webclickRetailPrice;

    @FindBy(xpath = clickView)
    public WebElement webclickView;

    @FindBy(xpath = clickAddToCard)
    public WebElement webclickAddToCard;

    @FindBy(xpath = clickZipcodeForLocation)
    public WebElement webclickZipcodeForLocation;

    @FindBy(css = clickConfirmLocation)
    public WebElement webclickConfirmLocation;

    @FindBy(css = closeWindow)
    public WebElement webcloseWindow;

    //-----------------------------------------------------------------------
    //Case 5 Elements
    @FindBy(xpath = clickVerizonUp)
    public WebElement webclickVerizonUp;

    @FindBy(xpath = clickEligible)
    public WebElement webclickEligible;

    @FindBy(xpath = clickResponders)
    public WebElement webclickResponders;

    @FindBy(xpath = clickFios)
    public WebElement webclickFios;

    @FindBy(xpath = clickLearnMore)
    public WebElement webclickLearnMore;

    //-----------------------------------------------------------------------
    //Case 6 Elements
    @FindBy(xpath = clickUnlimited)
    public WebElement webclickUnlimited;
    //
    @FindBy(xpath = clickChartView)
    public WebElement webclickChartView;

    @FindBy(xpath = clickMinusButton)
    public WebElement webclickMinusButton;

    //-----------------------------------------------------------------------
    //Case 7 Elements
    @FindBy(xpath = clickTradeIn)
    public WebElement webclickTradeIn;

    @FindBy(xpath = clickSearchbar)
    public WebElement webclickSearchbar;

    @FindBy(xpath = clickConfirm)
    public WebElement webclickConfirm;

    @FindBy(xpath = clickGood)
    public WebElement webclickGood;

    //-----------------------------------------------------------------------
    //Case 8 Elements
    @FindBy(xpath = clickInHome)
    public WebElement webclickInHome;

    @FindBy(xpath = clickTV)
    public WebElement webclickTV;

    @FindBy(xpath = clickAvailability)
    public WebElement webclickAvailability;

    @FindBy(xpath = clickZipcode)
    public WebElement webclickZipcode;

    @FindBy(xpath = clickAddress)
    public WebElement webclickAddress;

    @FindBy(xpath = clickResult)
    public WebElement webclickResult;

    //-----------------------------------------------------------------------
    //Case 9 Elements
    @FindBy(xpath = clickBusiness)
    public WebElement webclickBusiness;

    @FindBy(xpath = clickEducation)
    public WebElement webclickEducation;

    @FindBy(xpath = clickLearnMore2)
    public WebElement webclickLearnMore2;

    @FindBy(xpath = clickBusinessContinuity)
    public WebElement webclickBusinessContinuity;

    //-----------------------------------------------------------------------
    //Case 10 Elements
    @FindBy(xpath = clickHomePage)
    public WebElement webclickHomePage;

    @FindBy(xpath = clickResponsibility)
    public WebElement webclickResponsibility;

    @FindBy(xpath = clickAbilities)
    public WebElement webclickAbilities;

    @FindBy(xpath = clickReadStory)
    public WebElement webclickReadStory;

    //-----------------------------------------------------------------------
    //Case 11 Elements
    @FindBy(xpath = clickWirelessButton)
    public WebElement webclickWirelessButton;

    @FindBy(xpath = clickShopAllAccessories)
    public WebElement webclickShopAllAccessories;

    @FindBy(xpath = clickKeyboards)
    public WebElement webclickKeyboards;

    @FindBy(xpath = clickItem)
    public WebElement webclickItem;

    @FindBy(xpath = clickAddFilter)
    public WebElement webclickAddFilter;

    @FindBy(xpath = clickBrand)
    public WebElement webclickBrand;

    @FindBy(xpath = clickApple)
    public WebElement webclickApple;

    @FindBy(xpath = clickCloseFilter)
    public WebElement webclickCloseFilter;

    //-----------------------------------------------------------------------
    //Case 12 Elements
    @FindBy(xpath = clickMobileApp)
    public WebElement webclickMobileApp;

    @FindBy(xpath = clickDataHub)
    public WebElement webclickDataHub;

    //-----------------------------------------------------------------------
    //Case 13 Elements
    @FindBy(xpath = clickStores)
    public WebElement webclickStores;

    @FindBy(xpath = clickZipCodeBar)
    public WebElement webclickZipCodeBar;

    @FindBy(xpath = clickStoresNearMe)
    public WebElement webclickStoresNearMe;

    //-----------------------------------------------------------------------
    //Case 14 Elements
    @FindBy(xpath = clickReturnPolicy)
    public WebElement webclickReturnPolicy;

    @FindBy(xpath = clickReturnAndService)
    public WebElement webclickReturnAndService;

    @FindBy(xpath = clickGiftCard)
    public WebElement webclickGiftCard;

    //-----------------------------------------------------------------------
    //Case 15 Elements
    @FindBy(xpath = clickSeeMoreApps)
    public WebElement webclickSeeMoreApps;

    @FindBy(xpath = clickEntertainment)
    public WebElement webclickEntertainment;

    @FindBy(xpath = clickLearnMoreMessages)
    public WebElement webclickLearnMoreMessages;

    //-----------------------------------------------------------------------
    //Case 16 Elements
    @FindBy(xpath = clickVerizonGiftCard)
    public WebElement webclickVerizonGiftCard;

    @FindBy(xpath = click50)
    public WebElement webclick50;

    @FindBy(xpath = clickAddToCardButton)
    public WebElement webclickAddToCardButton;

    //-----------------------------------------------------------------------
    //Case 17 Elements
    @FindBy(xpath = clickCommunityForum)
    public WebElement webclickCommunityForum;

    @FindBy(xpath = chooseCommunityBlog)
    public WebElement webchooseCommunityBlog;

    //-----------------------------------------------------------------------
    //Case 18 Elements
    @FindBy(xpath = clickVerizonCloud)
    public WebElement webclickVerizonCloud;

    @FindBy(xpath = ClickNeedHelp)
    public WebElement webClickNeedHelp;

    @FindBy(xpath = selectBackupAssistantPlus)
    public WebElement webselectBackupAssistantPlus;

    //-----------------------------------------------------------------------
    //Case 19 Elements
    @FindBy(xpath = clickSmartFamily)
    public WebElement webclickSmartFamily;

    @FindBy(xpath = clickPickMeUp)
    public WebElement webclickPickMeUp;

    @FindBy(xpath = clickLearnMoreDigital)
    public WebElement webclickLearnMoreDigital;

    //-----------------------------------------------------------------------
    //Case 20 Elements
    @FindBy(xpath = clickDeviceProtection)
    public WebElement webclickDeviceProtection;

    @FindBy(xpath = clickSecurity)
    public WebElement webclickSecurity;

    @FindBy(xpath = clickSecurityLearnMoreNews)
    public WebElement webclickSecurityLearnMoreNews;
    //-----------------------------------------------------------------------

    /**
     * >>>Test Case 1 - Login Functionality<<<
     * Open Chrome Browser
     * Maximize Window
     * Go to https://www.verizonwireless.com/
     * Get Title
     * Click Sign in button
     * Wait landing page
     * Type Email
     * Type Password
     * Click sign in
     */
    public void doLogin() {
        websignbutton.click();
        webusernamefield.sendKeys(username);
        webpasswordfield.sendKeys(password);
        webloginbutton.click();
    }

    /**
     * >>>Test Case 2 - 5G Page<<<
     * Click Verizon icon
     * Go to Home Page
     * Wait Landing page
     * Click 5G
     * Verify subcategories are visible
     * Verify subcategories are clickable
     * Open 5G Overview
     * Wait landing
     * Scroll down
     * Swipe advertisements
     * Click 5G
     * Open 5G Home Internet
     */
    public void goto5Gpage() {
        webclick5gOverview.click();
        webswipeButton.click();
        webclick5gHomeInternet.click();
    }

    /**
     * >>>Test Case 3 - Support Page<<<
     * Click Support
     * Open Support overview
     * Click Search bar
     * Type >>>Make Payment<<<
     * Click search
     * Wait landing page
     * Click Pay Bill
     */
    public void goToSupportPage() {
        webclickSupportOverview.click();
        websearchBar.click();
        websearchButton.click();
        webclickPayBill.click();
    }

    /**
     * >>>Test Case 4 - Shop Page<<<
     * Click Shop
     * Open Smartphones
     * Click Pricing
     * Click Retail Price
     * Click first item
     * Click quick view button
     * Click add to card
     * Click zip code bar
     * Type 11223
     * Click Confirm location
     * Click X to exit
     */
    public void goToSmartPhonePage() {
        webclickSmartphone.click();
        webclickRetailPrice.click();
        webclickView.click();
        webclickAddToCard.click();
        webclickZipcodeForLocation.sendKeys("11223");
        webclickConfirmLocation.click();
        webcloseWindow.click();
    }

    /**
     * >>>Test Case 5 - Deals Page<<<
     * Click Deals
     * Open Verizon Up
     * Scroll down
     * Click >>i am eligible<<
     * Click Deals
     * Open First responders
     * Click Fios button
     * Click Learn more
     */
    public void goToDealsPage() {
        webclickVerizonUp.click();
        webclickEligible.click();
        webclickResponders.click();
        webclickFios.click();
        webclickLearnMore.click();
    }

    /**
     * >>>Test Case 6 - Plans Page<<<
     * Click Plan
     * Open Unlimited
     * Click Chart view
     * Click How many lines bar
     * Click minus 3 times
     */
    public void goToPlanPage() {
        webclickUnlimited.click();
        webclickChartView.click();
        webclickMinusButton.click();
    }

    /**
     * >>>Test Case 7 - Phones Page<<<
     * Click phone
     * Open >Trade in your phone<
     * Click Search bar
     * Type >>Apple iPhone X 64GB Verizon Gray<<
     * Click >Confirm
     * Click >Good
     */
    public void goToPhonePage() {
        webclickTradeIn.click();
        webclickSearchbar.sendKeys("Iphone XR");
        webclickConfirm.click();
        webclickGood.click();
    }

    /**
     * >>>Test Case 8 - In Home Page<<<
     * Click In home page
     * Click TV
     * Click >check availability
     * Click zip code
     * Type 11223
     * Click address bar
     * Type >>2203 West street<<
     * Click result
     */
    public void goToInHomePage() {
        webclickInHome.click();
        webclickTV.click();
        webclickAvailability.click();
        webclickZipcode.sendKeys("11223");
        webclickAddress.sendKeys("2203 West Street");
        webclickResult.click();
    }

    /**
     * >>>Test Case 9 - Business Page<<<
     * Click Business page
     * Click Education
     * Click Learn more
     * Click Business continuity
     */
    public void goToBusinessPage() {
        webclickBusiness.click();
        webclickEducation.click();
        webclickLearnMore2.click();
        webclickBusinessContinuity.click();
    }

    /**
     * >>>Test Case 10 - News Page<<<
     * Go to home page
     * Click Responsibility
     * Click Building abilities/Learn More
     * Click Read Story
     */
    public void goToResponsibilityPage() {
        webclickHomePage.click();
        webclickResponsibility.click();
        webclickAbilities.click();
        webclickReadStory.click();
    }

    /**
     * >>>Test Case 11 - Wireless Page<<<
     * Go tome Home Page
     * Click Wireless button
     * Click Shop all accessories
     * Click Keyboards
     * Click fist item
     * Click add filter
     * Click brand
     * Click apple
     * Click Close filter
     */
    public void goToAccessories() {
        webclickWirelessButton.click();
        webclickShopAllAccessories.click();
        webclickKeyboards.click();
        webclickItem.click();
        webclickAddFilter.click();
        webclickBrand.click();
        webclickApple.click();
        webclickCloseFilter.click();
    }



    //3---validate method
    //assertion
    public void validateLogin() {

    }
}
