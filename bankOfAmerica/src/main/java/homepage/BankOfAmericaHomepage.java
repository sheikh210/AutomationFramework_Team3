package homepage;

import commonAPI.WebAPI;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;

import java.util.List;

import static homepage.BankOfAmericaHomepageElements.*;

public class BankOfAmericaHomepage extends WebAPI {

    // For test case -1
    @FindBy(how = How.CSS, using = webElementUserName)
    public WebElement userName;
    @FindBy(how = How.CSS, using = webElementUserPassword)
    public WebElement userPassword;
    @FindBy(how = How.CSS, using = webElementLoginButton)
    public WebElement loginButton;
    // For test case -2,4
    @FindBy(how = How.XPATH, using = webElementCreditCardMenu)
    public WebElement creditCardMenu;
    @FindBy(how = How.XPATH, using = webElementCashRewardCardMenu)
    public WebElement cashRewardCardMenu;
    // For test case -3
    @FindBy(how = How.XPATH, using = webElementAutoLoansMenu)
    public WebElement autoLoansMenu;
    @FindBy(how = How.CSS, using = webElementAutoLoansRate)
    public WebElement autoLoansRate;
    // For test case -5
    @FindBy(how = How.XPATH, using = webElementSearchBox)
    public WebElement searchBox;
    @FindBy(xpath = webElementSearchButton)
    public WebElement searchButton;
    @FindBy(xpath = webElementSearchText)
    public WebElement searchText;
    // For test case -6
    @FindBy(how = How.XPATH, using = webElementFindATM)
    public WebElement findATM;
    @FindBy(how = How.XPATH, using = webElementExpectedATMBranch)
    public WebElement expectedATMBranch;
    // For test case -7
    @FindBy(how = How.XPATH, using = webElementDigitalWalletMenu)
    public WebElement digitalWalletMenu;
    @FindBy(xpath = webElementSearchingText)
    public WebElement searchingText;
    // For test case -8
    @FindBy(how = How.XPATH, using = webElementInvestmentMenu)
    public WebElement investmentMenu;
    @FindBy(how = How.XPATH, using = webElementSearchingExpectedText)
    public WebElement searchingExpectedText;
    // For test case -9
    @FindBy(how = How.XPATH, using = webElementZelleButton)
    public WebElement zelleButton;
    @FindBy(how = How.XPATH, using = webElementVideoPlayButton)
    public WebElement videoPlayButton;
    // For test case -10
    @FindBy(how = How.XPATH, using = webElementGetFeatureMenu)
    public WebElement getFeatureMenu;
    @FindBy(how = How.XPATH, using = webElementText)
    public WebElement text;
    // for test 11
    @FindBy(how = How.XPATH, using = webElementDealsAllDayMenu)
    public WebElement dealsAllDayMenu;
    // For test case 13
    @FindBy(how = How.XPATH, using = webElementCheckingMenu)
    public WebElement checkingMenu;
    @FindBy(how = How.CSS, using = webElementAdvantageMenu)
    public WebElement advantageMenu;
    @FindBy(how = How.XPATH, using = webElementZipcodeSearchField)
    public WebElement zipcodeSearchField;
    @FindBy(how = How.ID, using = webElementZipcodeSearchButton)
    public WebElement zipcodeSearchButton;
    // For test case 14
    @FindBy(how = How.XPATH, using = webElementSavingsMenu)
    public WebElement savingsMenu;
    @FindBy(how = How.CSS, using = webElementSavingsAccountMenu)
    public WebElement savingsAccountMenu;
    // For test case 15
    @FindBy(how = How.XPATH, using = webElementInvestYourWAy)
    public WebElement investYourWay;
    @FindBy(how = How.XPATH, using = webElementSecureUserNameBox)
    public WebElement secureUserNameBox;
    @FindBy(how = How.XPATH, using = webElementSecureUserPasswordBox)
    public WebElement secureUserPasswordBox;
    @FindBy(how = How.XPATH, using = webElementSecureUserLoginButton)
    public WebElement secureUserLoginButton;
    @FindBy(how = How.XPATH, using = webElementInvalidLoginText)
    public WebElement invalidLoginText;
    // For test case 16
    @FindBy(how = How.CSS, using = webElementLifeServiceButton)
    public WebElement lifeServiceButton;
    //For test case 19
    @FindBy(how = How.XPATH, using = webElementDesireElement)
    public WebElement desireElement;
    //For test case 20
    @FindBy(how = How.XPATH, using = webElementDesireText)
    public WebElement desireText;


    /**
     * Test case 1 - Do log in
     * 1. Navigate to www.bankofamerica.com
     * 2. Enter User Name
     * 3. Enter Password
     * 4. Click Submit Button
     */


    public void doLogin() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(userName));
        try {

            userName.sendKeys("abcdefgh");
        } catch (Exception e) {
            e.getMessage();
            userName.sendKeys("abcdefgh");
        }
        userPassword.sendKeys("abcd1234");
        loginButton.click();
    }

    public void validateDoLogin() {

        String actualTitle = expectedInvalidLoginTitle;

        Assert.assertEquals(actualTitle, expectedInvalidLoginTitle, "Search Result not Match");
    }

    /**
     * Test Case 2 - Apply for credit card
     * 1. Navigate to www.bankofamerica.com
     * 2. Click on Credit Card
     * 3. figure out all option
     * 4. Check how many options are there
     */
    public void checkMenuOptions() throws InterruptedException {
        creditCardMenu.click();
        cashRewardCardMenu.click();
        Thread.sleep(3000);
    }

    public void validateOptions() throws InterruptedException {

        String actualUrl = getCurrentPageUrl();

        Assert.assertEquals(actualUrl, expectedUrl, "Expected text not found");
    }

    /**
     * Test Case 3 - Validate text
     * 1. Navigate to www.bankofamerica.com
     * 2. Click on Auto loan Menu
     * 3. Check "Auto Loan rate" is there
     * 4. if auto loan rate is there then test is pass
     * 5. otherwise Fail
     */
    public void getCurrentPageTittle() {

        autoLoansMenu.click();
    }

    public void validateGetCurrentPageTittle() {
        String actualText = autoLoansRate.getText();

        Assert.assertEquals(actualText, "Auto loan rates");
    }

    /**
     * Test Case 4 - Check link number
     * 1. Navigate to www.bankofamerica.com
     * 2. Click on Click on Credit Card Menu
     * 3. Find out all the links
     * 4. Check how many link is there and validate it
     */
    public int figureOutWebLinksNum() throws IOException {

        creditCardMenu.click();
        // Capture link from current page
        List<WebElement> links = driver.findElements(By.tagName("span"));
        int linksNum = links.size();

        return linksNum;
    }

    public void validateFigureOutWebLinksNum() throws IOException {
        int actualLinkNum = figureOutWebLinksNum();
        System.out.println(actualLinkNum);

        Assert.assertEquals(actualLinkNum, 193);
    }

    /**
     * Test Case 5 - Validate Text
     * 1. Navigate to www.bankofamerica.com
     * 2. Click on Search Box
     * 3. Write on Search box
     * 4. Click on Search button
     */

    public void doSearch() {
        searchBox.sendKeys("activate credit card");
        searchButton.click();
    }

    public void validateDoSearch() {
        String actualText = searchText.getText();

        Assert.assertEquals(actualText, "Activate your eligible consumer credit card online.");
    }

    /**
     * Test Case 6 - Validate Web Element
     * 1. Navigate to www.bankofamerica.com
     * 2. Click on "Find ATM Menu"
     * 3. Check Availability of Jackson Height Branch
     */
    public void doSearchATM() {
        findATM.click();
    }

    public void validateDoSearchATM() {
        boolean branch_Is_Available_In_JacksonHeight = expectedATMBranch.isDisplayed();
        boolean expectedBranch_Is_There = true;

        Assert.assertEquals(branch_Is_Available_In_JacksonHeight, expectedBranch_Is_There);
    }

    /**
     * Teest Case 7 - Validate Text
     * 1. Navigate to www.bankofamerica.com
     * 2. Click on "Digital Wallet Menu"
     * 3. Get the Expected page title
     */
    public void doAvailable() {

        digitalWalletMenu.click();
    }

    public void validateDoAvailable() {

        String actualText = searchingText.getText();
        Assert.assertEquals(actualText, "What is a digital wallet?");
    }
    /**
     * Test Case 8 - Validate Text
     * 1. Navigate to www.bankofamerica.com
     * 2. Click on Investment Menu
     * 3. Search expected text
     */
    public void doSearchText() {
        investmentMenu.click();
    }

    public void validateDoSearchText() {
        String actualText = searchingExpectedText.getText();

        Assert.assertEquals(actualText, "Personalized planning and advice that evolves with you");
    }

    /**
     * Test Case 9 - Validate Title
     * 1. Navigate to www.bankofamerica.com
     * 2. Click on Zelle Menu
     * 3. Click on play button to play video
     * 4. Watch video for 5 seconds
     * 5. Finally check page Title
     */
    public void doSearchElements() throws InterruptedException {
        zelleButton.click();
        //driver.get("https://promo.bankofamerica.com/zelle/?cm_sp=Mobile%20Zelle-_-Default-_-M4T1QSBN01_Highlights_NH_Zelle_DefaultDefault_HL1_zelleWinterHLCta");
        videoPlayButton.click();

        Thread.sleep(5000);
    }

    public void validateDoSearchElements() {
        String actualTitle = super.getCurrentPageTitle();

        Assert.assertEquals(actualTitle, webElementHomePageTittle);
    }

    /**
     * Test Case 10 - Validate Text
     * 1. Navigate to www.bankofamerica.com
     * 2. Click on Get....Feature Menu
     * 3. Search Text "$25 opening deposit"
     */
    public void getText() {

        getFeatureMenu.click();
    }

    public void validateGetText() {
        String actualText = text.getText();

        Assert.assertEquals(actualText, "$25 opening deposit");
    }

    /**
     * Test Case 11 - Verify Current URL
     * 1. Navigate to www.bankofamerica.com
     * 2. Click on 'Deals all day Every day' menu
     * 3. Find out New page Url
     * 4. Validate New page Url
     */
    public void doGetCurrentUrl() {
        dealsAllDayMenu.click();
    }

    public void validateCurrentUrl() {
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        String expectedUrl = "https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go?reason=cbdavaialablecash&SortedBy=ExpiringSoon&cm_sp=OLB-BankAmeriDeals-Offers-_-BankAmeriDeals-_-DZT1QUOU01_Highlights_NH_BAMD_IconUpdate_G3_dealsAllDayHLCta&channel=desktop&screen=Deals:Entry&version=7.1.0";

        Assert.assertEquals(actualUrl, expectedUrl, "Expected URL not found");
    }

    /**
     * Test Case 12 - Verify link Number
     * 1. Navigate to www.bankofamerica.com
     * 2. Find link number
     * 3. Validate link number
     */
    public int doCountWebLink() {
        List<WebElement> list = driver.findElements(By.tagName("a"));
        int linkNum = list.size();
        System.out.println(linkNum);

        return linkNum;
    }

    public void validateDoCountWebLink() {

        int actualLinkNum = doCountWebLink();
        int expectedLinkNum = 208;

        Assert.assertEquals(actualLinkNum, expectedLinkNum);
    }

    /**
     * Test Case 13 - Verify Url
     * 1. Navigate to www.bankofamerica.com
     * 2. Click on checkingMenu
     * 3. Click on advantageMenu
     * 4. Write Zip Code
     * 5. click on Search Button
     * 6. Validate Current Url
     */
    public void doCheckUrl() {
        checkingMenu.click();
        advantageMenu.click();
        zipcodeSearchField.sendKeys("11370");
        zipcodeSearchButton.click();
    }

    public void validateDoCheckUrl() {
        String actualUrl = super.getCurrentPageUrl();
        String expectedUrl = "https://www.bankofamerica.com/deposits/checking/advantage-banking/";

        Assert.assertEquals(actualUrl, expectedUrl, "Expected Url not found");
    }

    /**
     * Test Case 14 - Verify Text
     * 1. Navigate to www.bankofamerica.com
     * 2. Click on "Savings"
     * 3. Search 'Bank of America Advantage Savings' text
     * 4. Validate text
     */
    public void doBrowsingForText() throws InterruptedException {

        savingsMenu.click();
        Thread.sleep(2000);

    }
    public void validateBrowsingForText() {

        String actualText = savingsAccountMenu.getText();
        String expectedText = "Bank of America Advantage Savings";

        Assert.assertEquals(actualText,expectedText,"Expected Text not found");
    }

    /**
     * Test Case 15 - Verify Elements
     * 1. Navigate to www.bankofamerica.com
     * 2. Click on  'invest Your Way'
     * 3. Write User Name
     * 4. Write password
     * 5. Click on login Button
     * 6. Then validate Elements
     */
    public void doSecureLogIn() {
        investYourWay.click();
        secureUserNameBox.sendKeys("ssyfuysuy");
        secureUserPasswordBox.sendKeys("sytgyuj22353");
        secureUserLoginButton.click();
    }

    public void validateSecureLogIn() {
        String actualText = invalidLoginText.getText();
        String expectedText = "We don't recognize your User ID and/or Password. Please try again or visit Forgot ID or Forgot Password.";

        Assert.assertEquals(actualText, expectedText, "Expected text not found");
    }

    /**
     * Test Case 16 - Verify Elements
     * 1. Navigate to www.bankofamerica.com
     * 2. Click on  "life Service" Button
     * 3. validate new page Url.
     */
    public void doCheckWebPage() {
        lifeServiceButton.click();
    }

    public void validateCheckWebPage() {
        String actualUrl = super.getCurrentPageUrl();
        System.out.println(actualUrl);
        String expectedUrl = "https://www.bankofamerica.com/life-services/";

        Assert.assertEquals(actualUrl, expectedUrl, "Expected URL Not Found");
    }

    /**
     * Test Case 17 - Verify homepage links
     * 1. Navigate to www.bankofamerica.com
     * 2. Find out homepage link number
     * 3. validate the link number
     */
    public void validateHomepageLinksNum() {
        int list = driver.findElements(By.tagName("a")).size();
        System.out.println(list);
        int linkNum = list;

        Assert.assertEquals(linkNum, 208, "Expected link Number not Found");
    }

    /**
     * Test Case 18 - Verify homepage title
     * 1. Navigate to www.bankofamerica.com
     * 2. Find out homepage title
     * 3. validate Title
     */
    public void validateHomePageTitle() {
        String homePageTitle = super.getCurrentPageTitle();
        String actualTitle = homePageTitle;
        String expectedTitle = "Bank of America - Banking, Credit Cards, Loans and Merrill Investing";

        Assert.assertEquals(actualTitle, expectedTitle, "Expected title not found");
    }

    /**
     * Test Case 19 - Verify Web Element is true
     * 1. Navigate to www.bankofamerica.com
     * 2. Write text on search Box
     * 3. Click on search button
     * 4. Check desire element is displayed
     * 5. Validate the elements
     */
    public void doSearchDisplayedElement() {
        searchBox.sendKeys("student loan");
        searchButton.click();
    }

    public void validateSearchDisplayedElement() {
        boolean actualElement = desireElement.isDisplayed();
        boolean expectedElement = true;

        Assert.assertEquals(actualElement, expectedElement);
    }

    /**
     * Test Case 20 - Verify text is there (True)
     * 1. Navigate to www.bankofamerica.com
     * 2. Write text on search Box
     * 3. Click on search button
     * 4. Check desire text "travel notification" is displayed
     * 5. Validate the text
     */
    public void doSearchDisplayedText() {
        searchBox.sendKeys("travel notification");
        searchButton.click();
    }
    public void validateSearchDisplayedText() {
        boolean actualText_Is_Available = desireText.isDisplayed();
        boolean expectedText_Is_Available = true;

        Assert.assertEquals(actualText_Is_Available, expectedText_Is_Available, "Expected text is not available");
    }
}

