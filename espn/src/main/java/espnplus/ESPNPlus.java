package espnplus;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static espnplus.ESPNPlusElements.*;
import static homepage.ESPNHomepageElements.*;

public class ESPNPlus extends WebAPI {


    @FindBy(how = How.XPATH, using = webElementESPNPlusButton)
    public WebElement ESPNPlusButton;
    @FindBy(how = How.XPATH, using = webElementNFLButton)
    public WebElement NFLButton;
    @FindBy(how = How.XPATH, using = webElementBuffaloBillsButton)
    public WebElement buffaloBillsButton;
    @FindBy(how = How.XPATH, using = webElementNapoliVsJuventusButton)
    public WebElement napoliVsJuventusButton;
    @FindBy(how = How.XPATH, using = webElementNapoliVsJuventusPopUpWindow)
    public WebElement napoliVsJuventusPopUpWindow;
    @FindBy(how = How.XPATH, using = webElementOrginalsButton)
    public WebElement orginalsButton;
    @FindBy(xpath = ESPNPlusElements.webElementTopEventsDropdownMenu)
    public WebElement topEventsDropdownMenu;
    @FindBy(how = How.XPATH, using = ESPNPlusElements.webElementTopEventsDropdown)
    public WebElement topEventsDropdown;
    @FindBy(how = How.XPATH, using = webElementMoreEspnPlusButton)
    public WebElement moreEspnPlusButton;
    @FindBy(how = How.XPATH, using = webElementOriginalsMenu)
    public WebElement orginalsMenu;
    @FindBy(how = How.XPATH, using = webElementSignUpButton)
    public WebElement signUpButton;
    @FindBy(how = How.XPATH, using = webElementCreateAccount)
    public WebElement createAccount;
    @FindBy(how = How.XPATH, using = webElementUFCButton)
    public WebElement uFCButton;
    @FindBy(how = How.XPATH, using = webElementESPNHelpCenterButton)
    public WebElement eSPNHelpCenterButton;
    @FindBy(how = How.XPATH, using = webElementSupportFaqsButton)
    public WebElement supportFaqsButton;
    @FindBy(how = How.XPATH, using = webElementItalianSerieAButton)
    public WebElement italianSerieAButton;
    @FindBy(how = How.XPATH, using = webElementPGATourButton)
    public WebElement pGATourButton;
    @FindBy(how = How.XPATH, using =webElementNewNFLButton)
    public WebElement newNFLButton;
    @FindBy(how = How.XPATH, using = webElementMLBButton)
    public WebElement mLBButton;
    @FindBy(how = How.XPATH, using = webElementNBAButton)
    public WebElement nBAButton;
    @FindBy(how = How.XPATH, using = webElementNHLButton)
    public WebElement nHLButton;
    @FindBy(how = How.XPATH, using = webElementMLSButton)
    public WebElement mLSButton;
    @FindBy(how = How.XPATH, using = webElementEnglishLeagueButton)
    public WebElement englishLeagueButton;

    public void navigateToESPNPlusPage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(ESPNPlusButton));

        ESPNPlusButton.click();
        driver.navigate().refresh();

    }

    /**
     * Test Case:1
     * Navigate to ESPN home page
     * click on ESPN plus Button
     * Validate new page url
     */

    public String validateESPNPlusPageUrl() {
        navigateToESPNPlusPage();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        String url = super.getCurrentPageUrl();
        System.out.println("ESPN Plus page URL is " + url);

        return url;
    }

    /**
     * Test Case:2
     * Navigate to ESPN home page
     * click on ESPN plus Button
     * Validate new page title
     */

    public String validateESPNPlusPageTitle() {
        navigateToESPNPlusPage();
        String title = super.getCurrentPageTitle();
        System.out.println("ESPN plus page title is " + title);
        return title;
    }

    /**
     * Test Case:3
     * Navigate to ESPN home page
     * click on ESPN plus Button
     * Click on Back Button
     * Mouse hover on NFL button
     * Check Buffalo Bills is Displayed
     */
    public boolean validateLookingValueIsDisplayed() throws InterruptedException {
        navigateToESPNPlusPage();
        driver.navigate().back();
        driver.navigate().refresh();
        Actions actions = new Actions(driver);
        actions.moveToElement(NFLButton).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(3000);
        boolean lookingValueISDisplayed = buffaloBillsButton.isDisplayed();
        System.out.println("Buffalo Bills is displayed: " + lookingValueISDisplayed);
        return lookingValueISDisplayed;


    }

    /**
     * Test Case:4
     * Navigate to ESPN home page
     * click on ESPN plus Button
     * Mouse hover  Napoli Vs Juventus on  button
     * Click on Napoli Vs Juventus Button
     * Check pop up window is Displayed
     */
    public boolean validateNapoliVsJuventusPopUpIsDisplayed() throws InterruptedException {
        navigateToESPNPlusPage();
        Actions actions = new Actions(driver);
        actions.moveToElement(napoliVsJuventusButton).build().perform();
        napoliVsJuventusButton.click();
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(napoliVsJuventusPopUpWindow.isDisplayed());
        return napoliVsJuventusPopUpWindow.isDisplayed();
    }

    /**
     * Test Case:5
     * Navigate to ESPN home page
     * click on ESPN plus Button
     * Mouse hover on Orginals  button
     * Check new page is Displayed
     */
    public void validateNavigateToExpectedPage() throws InterruptedException {
        navigateToESPNPlusPage();
        Actions actions = new Actions(driver);
        actions.moveToElement(orginalsButton).build().perform();
        Thread.sleep(2000);
        System.out.println(orginalsButton.getText());
        System.out.println(orginalsButton.getSize());
    }

    /**
     * Test Case 6 - Validate number of elements in "Top Events" dropdown menu list
     * Navigate to ESPN home page
     * Click on ESPN plus button
     * Click on "Top Events" dropdown menu
     * Click on "back button"
     * Verify number of links present in "Top Events" dropdown menu
     */
    public void validateTopEventsDropdownListSizeAndLinks() {
        navigateToESPNPlusPage();
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mouseHover(topEventsDropdown);
        List<WebElement> topEventsDropDownList = getListOfWebElementsByXpath(topEventsDropdownMenu, webElementTopEventsDropdownMenuItems);

        int listSize = topEventsDropDownList.size();


        System.out.println("Size of 'Top Events' Dropdown List: " + listSize);
        Assert.assertEquals(listSize, 11, "LIST SIZE DOES NOT MATCH");
    }

    /**
     * Test Case 7
     * Navigate to ESPN home page
     * Click on ESPN plus button
     * Click on Sign up button
     * Verify It,s navigate to sign up page by titles
     */
    public void validateSignUpPage() {
        navigateToESPNPlusPage();
        signUpButton.click();
        String actualPageUrl = driver.getCurrentUrl();
        String signUpPageUrl = "https://secure.web.plus.espn.com/account?returnUrl=%2Fbilling%2Fpurchase%2FESPN_PURCHASE_CMPGN%2FESPN_PURCHASE_VOCHR%2FMESPN&start=socialregistration&locale=en_US";
        Assert.assertEquals(actualPageUrl, signUpPageUrl, "Sign up page not found");

    }

    /**
     * Test Case 8 -
     * Navigate to ESPN home page
     * Click on ESPN plus button
     * Click on Sign up button
     * Verify  the page
     */

    public void validateInputName() throws InterruptedException {
        navigateToESPNPlusPage();
        signUpButton.click();
        Thread.sleep(2000);
        String actualValue = super.getCurrentPageUrl();
        String expectedValue = "https://secure.web.plus.espn.com/account?returnUrl=%2Fbilling%2Fpurchase%2FESPN_PURCHASE_CMPGN%2FESPN_PURCHASE_VOCHR%2FMESPN&start=socialregistration&locale=en_US";
        Assert.assertEquals(actualValue, expectedValue, "Expected page not found");


    }

    /**
     * Test Case: 9
     * Navigate to ESPN home page
     * Click on ESPN plus button
     * Verify  the page links
     */
    public int validateLinksNumber() {
        navigateToESPNPlusPage();
        driver.manage().deleteAllCookies();
        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        linkList.addAll(driver.findElements(By.tagName("img")));
        int actualLink = linkList.size();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Total links number= " + actualLink);
        return actualLink;
    }

    /**
     * Test Case: 10
     * Navigate to ESPN home page
     * Click on ESPN plus button
     * Verify  the page active links
     */

    public int validateActiveLinksNumber() {
        navigateToESPNPlusPage();
        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        linkList.addAll(driver.findElements(By.tagName("img")));
        List<WebElement> activeLinks = new ArrayList<>();
        for (int i = 0; i < linkList.size(); i++) {
            if (linkList.get(i).getAttribute("href") != null) {
                activeLinks.add(linkList.get(i));

            }
        }
        int activeLinkNUm = activeLinks.size();
        System.out.println("Total active links = " + activeLinkNUm);
        return activeLinkNUm;

    }
    /**
     * Test Case: 11
     * Navigate to ESPN home page
     * Click on ESPN plus button
     * Verify  the page page title
     */

    public String validateUFCPage() {
        navigateToESPNPlusPage();
        uFCButton.click();
        String uFCPageTitle = super.getCurrentPageTitle();
        return uFCPageTitle;

    }

    /**
     * Test Case: 12
     * Navigate to ESPN home page
     * Click on ESPN plus button
     * Mouse hover on Support & Faqs Button
     * Click on ESPN Help Center Button
     * Verify  the page page Url
     */
    public String validateFanSupportPage() throws InterruptedException {
        navigateToESPNPlusPage();
        Actions actions=new Actions(driver);
        actions.moveToElement(supportFaqsButton).build().perform();

        Thread.sleep(2000);

        eSPNHelpCenterButton.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        String pageUrl=super.getCurrentPageUrl();
        return pageUrl;

    }
    /**
     * Test Case: 13
     * Navigate to ESPN home page
     * Click on ESPN plus button
     * Click on "Italian Serie" Button
     * Verify  the page page Title
     */
    public String validateItalianSerieAPage() {

        navigateToESPNPlusPage();
        italianSerieAButton.click();
        String italianSerieAPageTitle = super.getCurrentPageTitle();
        return italianSerieAPageTitle;

    }
    /**
     * Test Case: 14
     * Navigate to ESPN home page
     * Click on ESPN plus button
     * Click on "PGA Tour" Button
     * Verify  the page page Title
     */
    public String validatePGATourPage() {

        navigateToESPNPlusPage();
        pGATourButton.click();
        String pGATourPageTitle = super.getCurrentPageTitle();
        return pGATourPageTitle;

    }
    /**
     * Test Case: 15
     * Navigate to ESPN home page
     * Click on ESPN plus button
     * Click on "NFL" Button
     * Verify  the page URL
     */
    public String validateNewNFLPage() {
        navigateToESPNPlusPage();
        newNFLButton.click();
        String nFLPageUrl=super.getCurrentPageUrl();
        return nFLPageUrl;

    }
    /**
     * Test Case: 16
     * Navigate to ESPN home page
     * Click on ESPN plus button
     * Click on "MLB" Button
     * Verify  the page Url
     */
    public String validateMLBPage() {
        navigateToESPNPlusPage();
        mLBButton.click();
        String  mLBPageUrl=super.getCurrentPageUrl();
        return mLBPageUrl;

    }/**
     * Test Case: 17
     * Navigate to ESPN home page
     * Click on ESPN plus button
     * Click on "NBA Tour" Button
     * Verify  the page URL
     */
    public String validateNBAPage() {
        navigateToESPNPlusPage();
     //   new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(nBAButton));
        nBAButton.click();
        String  nBAPageUrl=super.getCurrentPageUrl();
        return nBAPageUrl;

    }/**
     * Test Case: 18
     * Navigate to ESPN home page
     * Click on ESPN plus button
     * Click on "NHL" Button
     * Verify  the page Title
     */
    public String validateNHLPage() {

        navigateToESPNPlusPage();
        nHLButton.click();
        String nHLPagerTitle = super.getCurrentPageTitle();
        return nHLPagerTitle;

    }

    /**
     * Test Case: 19
     * Navigate to ESPN home page
     * Click on ESPN plus button
     * Click on "MLS" Button
     * Verify  the page Url
     */
    public String validateMLSPage() {

        navigateToESPNPlusPage();
        mLSButton.click();
        String mLSPagerUrl = super.getCurrentPageUrl();
        return mLSPagerUrl;
    }
    /**
     * Test Case: 20
     * Navigate to ESPN home page
     * Click on ESPN plus button
     * Click on "English League" Button
     * Verify  the page page Title
     */
    public String validateEnglishLeaguePage() {

        navigateToESPNPlusPage();
        englishLeagueButton.click();
        String englishLeaguePageTitle = super.getCurrentPageTitle();
        return englishLeaguePageTitle;

    }



}







