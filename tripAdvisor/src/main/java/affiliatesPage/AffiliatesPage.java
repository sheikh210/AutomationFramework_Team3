package affiliatesPage;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConnectToSqlDB;
import utilities.DataReader;

import java.io.IOException;

import static affiliatesPage.AffiliatesPageElements.*;

public class AffiliatesPage extends WebAPI {
    String path = System.getProperty("user.dir") +"\\src\\main\\resources\\TripAdvisor_AffiliatesPage_ExpectedElements.xlsx" ;
    WebDriverWait wait = new WebDriverWait(driver, 10);
    DataReader dataReader = new DataReader();
    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    /**
     * Header
     */
    @FindBy(xpath = WebElementBecomeAnAffiliatesButton)
    public WebElement becomeAnAffiliatesButton;
    @FindBy(xpath = WebElementGetStartedButton)
    public WebElement getStartedButton;
    @FindBy(xpath = WebElementFAQsButton)
    public WebElement fAQsButton;
    @FindBy(xpath = WebElementTipsButton)
    public WebElement tipsButton;
    @FindBy(xpath = WebElementGetStartedImage)
    public WebElement getStartedImage;
    @FindBy(xpath = WebElementFAQsImage)
    public WebElement fAQsImage;
    @FindBy(xpath = WebElementTipsImage)
    public WebElement tipsImage;
    @FindBy(xpath = WebElementSignInButton)
    public WebElement signInButton;
    @FindBy(xpath = WebElementSignInFrame)
    public WebElement signInFrame;
    @FindBy(xpath = WebElementContinueWithEmail)
    public WebElement continueWithEmail;
    @FindBy(xpath = WebElementEmailBox)
    public WebElement emailBox;
    @FindBy(xpath = webElementPostReviewLink)
    public WebElement postReviewLink;
    @FindBy(xpath = webElementPostPhoto)
    public WebElement postPhoto;
    @FindBy(xpath = webElementPostButton)
    public WebElement postButton;


    /**
     * Body
     */
    @FindBy(xpath = WebElementMinimumCommission)
    public WebElement minimumCommission;
    @FindBy(xpath = WebElementNoHotelBooking)
    public WebElement noHotelBooking;
    /**
     * Footer
     */
    @FindBy(xpath = WebElementCurrencyButton)
    public WebElement currency;
    @FindBy(xpath = WebElementCountryButton)
    public WebElement countryButton;
    @FindBy(className = WebElementAllRights)
    public WebElement allRights;
    @FindBy(xpath = WebElementFooterSectionLinks)
    public WebElement footerSectionLinks;

    /**
     * Test Case 1: "Validate affiliatesPage title"
     * 1) Navigate to "tripadvisor.com"
     * 2) Scroll down the page
     * 3) Click on "Become an affiliate"
     * 4) Get page title
     * @return
     * @throws IOException
     */
    public boolean validateAffiliatesPageTitle() throws IOException {
        navigateToAffiliatePage();
        boolean flag=compareTextToExpectedString(getCurrentPageTitle(),path,"affiliatesPageTitle");
        return flag;
    }

    /**
     * Test Case 2:
     * 1) Navigate to "tripadvisor.com"
     * 2) Scroll down the page
     * 3) Click on "Become an affiliate"
     * 4) Click on "Get started"
     * 5) Verify if image is displayed
     */
    public boolean validateGetStartedImage(){
        navigateToAffiliatePage();
        clickOnElement(getStartedButton);
        waitUntilVisible(By.xpath(WebElementGetStartedImage));
        boolean flag=getStartedImage.isDisplayed();
        return flag;

    }
    /**
     * Test Case 3:
     * 1) Navigate to "tripadvisor.com"
     * 2) Scroll down the page
     * 3) Click on "Become an affiliate"
     * 4) Click on "FAQs"
     * 5) Verify if image is displayed
     */
    public boolean validateFAQsImage(){
        navigateToAffiliatePage();
        clickOnElement(fAQsButton);
        waitUntilVisible(By.xpath(WebElementFAQsImage));
        boolean flag=fAQsImage.isDisplayed();
        return flag;

    }
    /**
     * Test Case 4:
     * 1) Navigate to "tripadvisor.com"
     * 2) Scroll down the page
     * 3) Click on "Become an affiliate"
     * 4) Click on "Tips"
     * 5) Verify if image is displayed
     */
    public boolean validateTipsImage(){
        navigateToAffiliatePage();
        clickOnElement(tipsButton);
        waitUntilVisible(By.xpath(WebElementTipsImage));
        boolean flag=tipsImage.isDisplayed();
        return flag;

    }

    /**
     * Test Case 5:
     * 1) Navigate to "tripadvisor.com"
     * 2) Scroll down the page
     * 3) Click on "Become an affiliate"
     * 4) Get the text from "Minimum 50% commission"
     * 5) validate the text
     * 6) Close browser
     */
    public boolean validateCommissionText() throws IOException {
        navigateToAffiliatePage();
        waitUntilVisible(By.xpath(WebElementMinimumCommission));
        minimumCommission.getText();
        boolean flag= compareTextToExpectedString(minimumCommission.getText(),path,"commissionText");
        return flag;
    }

    /**
     * Test Case 6:
     * 1) Navigate to "tripadvisor.com"
     * 2) Scroll down the page
     * 3) Click on "Become an affiliate"
     * 4) Get the Text from "No hotel booking is required"
     * 5) Write the text in excel.
     * 6) Close browser
     */
    public boolean validateNoBookingText() throws IOException {
        navigateToAffiliatePage();
        waitUntilVisible(By.xpath(WebElementNoHotelBooking));
        String text=noHotelBooking.getText();
        System.out.println(text);
        dataReader.setCellData(path,"noBookingRequiredText",0,0,text);
        System.out.println("Text was extracted");
        boolean flag= compareTextToExpectedString(noHotelBooking.getText(),path,"noBookingRequiredText");
        return flag;
    }

    /**
     *
     Test Case 7:
     1) Navigate to "tripadvisor.com"
     2) Scroll down the page
     3) Click on "Become an affiliate"
     4) count Network partners links
     5) Validate count
     */
    public boolean countPartnersLinks() throws IOException {
        navigateToAffiliatePage();
        waitUntilVisible(By.xpath(WebElementPartnersLinks));
        boolean flag= compareListSizeToExpectedCount(By.xpath(WebElementPartnersLinks),path,"partnersLinks");
        return flag;
    }

    /**
     * Test Case 8:
     * 1) Navigate to "tripadvisor.com"
     * 2) Scroll down the page
     * 3) Click on "Become an affiliate"
     * 4) Open each network link in new page
     * 5) Validate urls
     */
    public boolean validatePartnersLinks() throws IOException, InterruptedException {
        navigateToAffiliatePage();
        waitUntilVisible(By.xpath(WebElementPartnersLinks));
        boolean flag= clickLinksSwitchTabsCompareURLs(By.xpath(WebElementPartnersLinks),path,"partnersUrls");
        return flag;
    }

    /**
     * Test Case 9: "Validate SignIn button"
     * 1) Navigate to "tripadvisor.com"
     * 2) Scroll down the page
     * 3) Click on "Become an affiliate"
     * 4) Click On "SignIn"
     * 5) validate if there is a popout window
     * 6) Click on "Continue with email"
     * 7) validate the tooltip text
     */

    public String validateSignInToolTip() throws InterruptedException {
        navigateToAffiliatePage();
        clickOnElement(signInButton);
        //iframeHandle(signInFrame);
        driver.switchTo().frame(0);
        clickOnElement(continueWithEmail);
        String toolTipText=emailBox.getAttribute("title");
        System.out.println(toolTipText);

        return toolTipText;

    }

    /**
     * Test Case 10 "count Country currency menu"
     * 1) Navigate to "tripadvisor.com"
     * 2) Scroll down the page
     * 3) Click on "Become an affiliate"
     * 4) Click Currency box
     * 5) count all items
     * @return
     * @throws IOException
     */
    public boolean countCurrencyMenuItems() throws IOException {
        navigateToAffiliatePage();
        waitUntilClickAble(By.xpath(WebElementCurrencyButton));
        clickOnElement(currency);
        boolean flag= compareListSizeToExpectedCount(By.xpath(WebElementCurrencyItems),path,"currencyMenu");
        return flag;
    }

    /**
     *Test Case 11:
     * 1) Navigate to "tripadvisor.com"
     * 2) Scroll down the page
     * 3) Click on "Become an affiliate"
     * 4) Click countries box
     * 5) count all items
     */
    public boolean countCountryMenuItems() throws IOException {
        navigateToAffiliatePage();
        waitUntilClickAble(By.xpath(WebElementCountryButton));
        clickOnElement(countryButton);
        boolean flag= compareListSizeToExpectedCount(By.xpath(WebElementCountryList),path,"countryMenu");
        return flag;
    }

    /**
     *Test Case 12:
     * 1) Navigate to "tripadvisor.com"
     * 2) Scroll down the page
     * 3) Click on "Become an affiliate"
     * 4)Scroll down the page
     * 5) Verify "All right reserved text is displayed"
     */
    public boolean isAllRightsReservedDisplayed(){
        navigateToAffiliatePage();
        waitUntilVisible(By.className(WebElementAllRights));
        boolean flag=allRights.isDisplayed();
        return flag;
    }

    /**
     * Test Case 13: "Count footer section links"
     * 1) Navigate to "tripadvisor.com"
     * 2) Scroll down the page
     * 3) Click on "Become an affiliate"
     * 4) count footer section links
     * 5) Validate count
     */
    public boolean countFooterSectionLinks() throws IOException {
        navigateToAffiliatePage();
        waitUntilVisible(By.xpath(WebElementFooterSectionLinks));
        boolean flag=compareListSizeToExpectedCount(By.xpath(WebElementFooterSectionLinks),path,"footerSectionLinksCount");
        return flag;
    }

    /**
     * Test Case 14:"Open footer section links in new tabs and compare urls"
     * 1) Navigate to "tripadvisor.com"
     * 2) Scroll down the page
     * 3) Click on "Become an affiliate"
     * 4) Open each link in new tab
     * 5) compare urls
     */
    public boolean validateFooterSectionLinks() throws IOException, InterruptedException {
        navigateToAffiliatePage();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        //waitUntilClickAble(By.xpath(WebElementFooterSectionLinks));
        boolean flag= clickLinksSwitchTabsCompareURLs(By.xpath(WebElementFooterSectionLinks),path,"footerSectionLinks");
        return flag;
    }

    /**
     * Test Case 15: "Validate Post a photo button"
     * 1) Navigate to "tripadvisor.com"
     * 2) Scroll down the page
     * 3) Click on "Become an affiliate"
     * 4) Click on "Post"
     * 5) Click on "Post a Photo"
     * 6) Get the page title
     */
    public boolean validatePostPhoto() throws IOException {
        navigateToAffiliatePage();
        clickOnElement(postButton);
        wait.until(ExpectedConditions.elementToBeClickable(postPhoto));
        clickOnElement(postPhoto);
        boolean flag=compareTextToExpectedString(getCurrentPageTitle(),path,"postPhotoTitle");
        return flag;

    }

    /**
     * Test Case 16: "Validate Post a review"
     * 1) Navigate to "tripadvisor.com"
     * 2) Scroll down the page
     * 3) Click on "Become an affiliate"
     * 4) Click on "Post"
     * 5) Click on "Post a review"
     * 6) Get the page title
     */
    public boolean validatePostReview() throws IOException {
        navigateToAffiliatePage();
        clickOnElement(postButton);
        wait.until(ExpectedConditions.elementToBeClickable(postReviewLink));
        clickOnElement(postReviewLink);
        boolean flag=compareTextToExpectedString(getCurrentPageTitle(),path,"postReviewTitle");
        return flag;

    }














//Helper method to navigate to Affiliate page
    public void navigateToAffiliatePage(){
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        wait.until(ExpectedConditions.elementToBeClickable(becomeAnAffiliatesButton));
        clickOnElement(becomeAnAffiliatesButton);
        String title= getCurrentPageTitle();
        if (title.equalsIgnoreCase(getCurrentPageTitle()))
            System.out.println("Navigated to Affiliates Page Successfully");
        else
            System.out.println("Failed to navigate");
    }





}
