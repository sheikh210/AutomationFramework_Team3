package homepage;
import static homepage.VerizonWirelessHomepageElements.*;
import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.DataReader;

import java.io.IOException;
import java.util.List;

public class VerizonWirelessHomepage extends WebAPI {

    //page object design pattern
    //case 1 elements
    @FindBy(xpath = websigninButton)
    public WebElement signbutton;

    @FindBy(xpath = webusernamefield)
    public WebElement usernamefield;

    @FindBy(xpath = webpasswordfield)
    public WebElement passwordfield;

    @FindBy(xpath = webloginbutton)
    public WebElement loginbutton;

    //-----------------------------------------------------------------------
    //Case 2 Elements
    @FindBy(xpath = webclick5g)
    public WebElement click5g;

    @FindBy(xpath = webclick5gOverview)
    public WebElement click5gOverview;

    @FindBy(xpath = webswipeButton)
    public WebElement swipeButton;

    @FindBy(xpath = webclick5gHomeInternet)
    public WebElement click5gHomeInternet;

    //-----------------------------------------------------------------------
    //Case 3 Elements
    @FindBy(xpath = webclickSupportOverview)
    public WebElement clickSupportOverview;

    @FindBy(xpath = websearchBar)
    public WebElement searchBar;

    @FindBy(xpath = websearchButton)
    public WebElement searchButton;

    @FindBy(xpath = webclickPayBill)
    public WebElement clickPayBill;

    //-----------------------------------------------------------------------
    //Case 4 Elements
    @FindBy(xpath = webclickSmartphone)
    public WebElement clickSmartphone;

    @FindBy(xpath = webclickRetailPrice)
    public WebElement clickRetailPrice;

    @FindBy(xpath = webclickView)
    public WebElement clickView;

    @FindBy(xpath = webclickAddToCard)
    public WebElement clickAddToCard;

    @FindBy(xpath = webclickZipcodeForLocation)
    public WebElement clickZipcodeForLocation;

    @FindBy(css = webclickConfirmLocation)
    public WebElement clickConfirmLocation;

    @FindBy(css = webcloseWindow)
    public WebElement closeWindow;

    //-----------------------------------------------------------------------
    //Case 5 Elements
    @FindBy(xpath = webclickVerizonUp)
    public WebElement clickVerizonUp;

    @FindBy(xpath = webclickEligible)
    public WebElement clickEligible;

    @FindBy(xpath = webclickResponders)
    public WebElement clickResponders;

    @FindBy(xpath = webclickFios)
    public WebElement clickFios;

    @FindBy(xpath = webclickLearnMore)
    public WebElement clickLearnMore;

    //-----------------------------------------------------------------------
    //Case 6 Elements
    @FindBy(xpath = webclickUnlimited)
    public WebElement clickUnlimited;
    //
    @FindBy(xpath = webclickChartView)
    public WebElement clickChartView;

    @FindBy(xpath = webclickMinusButton)
    public WebElement clickMinusButton;

    //-----------------------------------------------------------------------
    //Case 7 Elements
    @FindBy(xpath = webclickTradeIn)
    public WebElement clickTradeIn;

    @FindBy(xpath = webclickSearchbar)
    public WebElement clickSearchbar;

    @FindBy(xpath = webclickConfirm)
    public WebElement clickConfirm;

    @FindBy(xpath = webclickGood)
    public WebElement clickGood;

    //-----------------------------------------------------------------------
    //Case 8 Elements
    @FindBy(xpath = webclickInHome)
    public WebElement clickInHome;

    @FindBy(xpath = webclickTV)
    public WebElement clickTV;

    @FindBy(xpath = webclickAvailability)
    public WebElement clickAvailability;

    @FindBy(xpath = webclickZipcode)
    public WebElement clickZipcode;

    @FindBy(xpath = webclickAddress)
    public WebElement clickAddress;

    @FindBy(xpath = webclickResult)
    public WebElement clickResult;

    //-----------------------------------------------------------------------
    //Case 9 Elements
    @FindBy(xpath = webclickBusiness)
    public WebElement clickBusiness;

    @FindBy(xpath = webclickEducation)
    public WebElement clickEducation;

    @FindBy(xpath = webclickLearnMore2)
    public WebElement clickLearnMore2;

    @FindBy(xpath = webclickBusinessContinuity)
    public WebElement clickBusinessContinuity;

    //-----------------------------------------------------------------------
    //Case 10 Elements
    @FindBy(xpath = webclickHomePage)
    public WebElement clickHomePage;

    @FindBy(xpath = webclickResponsibility)
    public WebElement clickResponsibility;

    @FindBy(xpath = webclickAbilities)
    public WebElement clickAbilities;

    @FindBy(xpath = webclickReadStory)
    public WebElement clickReadStory;

    //-----------------------------------------------------------------------
    //Case 11 Elements
    @FindBy(xpath = webclickWirelessButton)
    public WebElement clickWirelessButton;

    @FindBy(xpath = webclickShopAllAccessories)
    public WebElement clickShopAllAccessories;

    @FindBy(xpath = webclickKeyboards)
    public WebElement clickKeyboards;

    @FindBy(xpath = webclickItem)
    public WebElement clickItem;

    @FindBy(xpath = webclickAddFilter)
    public WebElement clickAddFilter;

    @FindBy(xpath = webclickBrand)
    public WebElement clickBrand;

    @FindBy(xpath = webclickApple)
    public WebElement clickApple;

    @FindBy(xpath = webclickCloseFilter)
    public WebElement clickCloseFilter;

    //-----------------------------------------------------------------------
    //Case 12 Elements
    @FindBy(xpath = webclickMobileApp)
    public WebElement clickMobileApp;

    @FindBy(xpath = webclickDataHub)
    public WebElement clickDataHub;

    //-----------------------------------------------------------------------
    //Case 13 Elements
    @FindBy(xpath = webclickStores)
    public WebElement clickStores;

    @FindBy(xpath = webclickZipCodeBar)
    public WebElement clickZipCodeBar;

    @FindBy(xpath = webclickStoresNearMe)
    public WebElement clickStoresNearMe;

    //-----------------------------------------------------------------------
    //Case 14 Elements
    @FindBy(xpath = webclickReturnPolicy)
    public WebElement clickReturnPolicy;

    @FindBy(xpath = webclickReturnAndService)
    public WebElement clickReturnAndService;

    @FindBy(xpath = webclickGiftCard)
    public WebElement clickGiftCard;

    //-----------------------------------------------------------------------
    //Case 15 Elements
    @FindBy(xpath = webclickSeeMoreApps)
    public WebElement clickSeeMoreApps;

    @FindBy(xpath = webclickEntertainment)
    public WebElement clickEntertainment;

    @FindBy(xpath = webclickLearnMoreMessages)
    public WebElement clickLearnMoreMessages;

    //-----------------------------------------------------------------------
    //Case 16 Elements
    @FindBy(xpath = webclickVerizonGiftCard)
    public WebElement clickVerizonGiftCard;

    @FindBy(xpath = webclick50)
    public WebElement click50;

    @FindBy(xpath = webclickAddToCardButton)
    public WebElement clickAddToCardButton;

    //-----------------------------------------------------------------------
    //Case 17 Elements
    @FindBy(xpath = webclickCommunityForum)
    public WebElement clickCommunityForum;

    @FindBy(xpath = webchooseCommunityBlog)
    public WebElement chooseCommunityBlog;

    //-----------------------------------------------------------------------
    //Case 18 Elements
    @FindBy(xpath = webclickVerizonCloud)
    public WebElement clickVerizonCloud;

    @FindBy(xpath = webclickNeedHelp)
    public WebElement clickNeedHelp;

    @FindBy(xpath = webselectBackupAssistantPlus)
    public WebElement selectBackupAssistantPlus;

    //-----------------------------------------------------------------------
    //Case 19 Elements
    @FindBy(xpath = webclickSmartFamily)
    public WebElement clickSmartFamily;

    @FindBy(xpath = webclickPickMeUp)
    public WebElement clickPickMeUp;

    @FindBy(xpath = webclickLearnMoreDigital)
    public WebElement clickLearnMoreDigital;

    //-----------------------------------------------------------------------
    //Case 20 Elements
    @FindBy(xpath = webclickDeviceProtection)
    public WebElement clickDeviceProtection;

    @FindBy(xpath = webclickSecurity)
    public WebElement clickSecurity;

    @FindBy(xpath = webclickSecurityLearnMoreNews)
    public WebElement clickSecurityLearnMoreNews;
    //-----------------------------------------------------------------------
    DataReader dataReader = new DataReader();
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
    public void validatePageTitle() throws IOException {
        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title: " + actualTitle);

        String [] expectedHomePageTitleArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir")+
                "//src/main/resources/VerizonWireless_Homepage_ExpectedElements.xlsx","Homepage Title");
        String expectedHomePageTitle = expectedHomePageTitleArray [0];
        System.out.println("Expected Page Title: "+expectedHomePageTitle);

        Assert.assertEquals(actualTitle, expectedHomePageTitle, "HOMEPAGE TITLE DOES NOT MATCH");
    }
    public void doLogin() {
        WebDriverWait expWait = new WebDriverWait(driver, 10);
        expWait.until(ExpectedConditions.elementToBeClickable(signbutton));
        signbutton.click();
        usernamefield.sendKeys(username);
        passwordfield.sendKeys(password);
        loginbutton.click();
    }

    /**
     * >>>Test Case 2 - 5G Page<<<
     * Click Verizon icon
     * Go to Home Page
     * Wait Landing page
     * Click 5G
     * Verify subcategories are visible
     * Open 5G Overview
     * Wait landing
     * Scroll down
     * Swipe advertisements
     * Click 5G
     * Open 5G Home Internet
     */
    public int goto5Gpage() {
        mouseHover(click5g);
        List<WebElement> topEventsDropDownList = getListOfWebElementsByXpath(click5g, webclick5g);
        int listSize = topEventsDropDownList.size();
        click5gOverview.click();
        swipeButton.click();
        click5gHomeInternet.click();
        return listSize;
    }
    public void validate5GPage() throws IOException {
        int [] expectedListArrayCount = dataReader.fileReaderIntegerHSSF(System.getProperty("user.dir")+
                "//src/main/resources/TripAdvisor_FlightsPage_ExpectedElements.xlsx","5G Page List");
        int expectedCategoryList = expectedListArrayCount[0];

        Assert.assertEquals(goto5Gpage(),expectedCategoryList,"List size does not match");
    }

    /**
     * >>>Test Case 3 - Go To Support Page<<<
     * Click Support
     * Open Support overview
     *
     */
    public void goToSupportPage() {
        clickSupportOverview.click();
        searchBar.click();
        searchButton.click();
        clickPayBill.click();
    }

     /**
     * Click Search bar
     * Type >>>Make Payment<<<
     * Click search
     * Wait landing page
     * Click Pay Bill
     */



    /**
     * >>>Test Case 4 - SmartPhone Page<<<
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
        clickSmartphone.click();
        clickRetailPrice.click();
        clickView.click();
        clickAddToCard.click();
        clickZipcodeForLocation.sendKeys("11223");
        clickConfirmLocation.click();
        closeWindow.click();
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
        clickVerizonUp.click();
        clickEligible.click();
        clickResponders.click();
        clickFios.click();
        clickLearnMore.click();
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
        clickUnlimited.click();
        clickChartView.click();
        clickMinusButton.click();
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
        clickTradeIn.click();
        clickSearchbar.sendKeys("Iphone XR");
        clickConfirm.click();
        clickGood.click();
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
        clickInHome.click();
        clickTV.click();
        clickAvailability.click();
        clickZipcode.sendKeys("11223");
        clickAddress.sendKeys("2203 West Street");
        clickResult.click();
    }

    /**
     * >>>Test Case 9 - Business Page<<<
     * Click Business page
     * Click Education
     * Click Learn more
     * Click Business continuity
     */
    public void goToBusinessPage() {
        clickBusiness.click();
        clickEducation.click();
        clickLearnMore2.click();
        clickBusinessContinuity.click();
    }

    /**
     * >>>Test Case 10 - News Page<<<
     * Go to home page
     * Click Responsibility
     * Click Building abilities/Learn More
     * Click Read Story
     */
    public void goToResponsibilityPage() {
        clickHomePage.click();
        clickResponsibility.click();
        clickAbilities.click();
        clickReadStory.click();
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
        clickWirelessButton.click();
        clickShopAllAccessories.click();
        clickKeyboards.click();
        clickItem.click();
        clickAddFilter.click();
        clickBrand.click();
        clickApple.click();
        clickCloseFilter.click();
    }


}
