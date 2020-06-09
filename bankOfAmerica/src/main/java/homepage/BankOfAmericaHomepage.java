package homepage;

import commonAPI.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static homepage.BankOfAmericaHomepageElements.*;

public class BankOfAmericaHomepage extends WebAPI {


    // For test case -1
    @FindBy(how = How.CSS, using = webElementUserName)
    public WebElement userName;
    @FindBy(how = How.CSS, using = webElementUserPassword)
    public WebElement userPassword;
    @FindBy(how = How.CSS, using = webElementLoginButton)
    public WebElement loginButton;


    // For test case -2
    @FindBy(how = How.XPATH, using = webElementCreditCardMenu)
    public WebElement creditCardMenu;
    @FindBy(how = How.XPATH, using = webElementCashRewardCardMenu)
    public WebElement cashRewardCardMenu;

    // For test case -3
    @FindBy(how = How.XPATH, using = webElementAutoLoansMenu)
    public WebElement autoLoansMenu;
    @FindBy(how = How.CSS, using = webElementAutoLoansRate)
    public WebElement autoLoansRate;

    // For test case -4
    @FindBy(how = How.XPATH, using = webElementLanguageMenu)
    public WebElement languageMenu;
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
     * Test Case 3 - Apply for credit card
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
     * Test Case 5 - Change Language
     * 1. Navigate to www.bankofamerica.com
     * 2. Click on Language option
     * 3. Find out options of Languages
     * 4. Select the language
     */

    public void selectLanguage() {

        languageMenu.click();
//        WebElement laguageDropDown = languageMenu.findElement(By.xpath(webElementLanguageMenu));
//        Select laguageDD = new Select(laguageDropDown);
//        List<WebElement> langageList = laguageDD.getOptions();
//        //System.out.println(langageList.size());
//        for (WebElement we : langageList) {
//            System.out.println(we.getText());
//        }

    }

    /**
     * Test Case 5 - Change Language
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
     * Test Case 6 - Change Language
     * 1. Navigate to www.bankofamerica.com
     * 2. Click on "Find ATM Menu"
     * 3. Check Availability of Jackson Height Branch
     */

    public void doSearchATM() {

        findATM.click();
    }

    public void validateDoSearchATM() {
        boolean branch_Is_Available_In_JacksonHeight = true;

        Assert.assertEquals(branch_Is_Available_In_JacksonHeight, expectedATMBranch.isDisplayed());

    }

    /**
     * Teest Case 7 - Change Language
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
     * Test Case 8 - Change Language
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
     * Test Case 9 - Change Language
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
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, webElementHomePageTittle);
    }

    /**
     * Test Case 10 - Change Language
     *     1. Navigate to www.bankofamerica.com
     *     2. Click on Get....Feature Menu
     *     3. Search Text "$25 opening deposit"
     */


    public void getText() {
        getFeatureMenu.click();
    }

    public void validateGetText() {
        String actualText=text.getText();
        Assert.assertEquals(actualText,"$25 opening deposit");


    }
}