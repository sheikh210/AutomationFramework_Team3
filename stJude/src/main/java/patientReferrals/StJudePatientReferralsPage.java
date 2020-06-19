package patientReferrals;

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
import static patientReferrals.StJudePatientReferralPageWebElements.*;
public class StJudePatientReferralsPage extends WebAPI {
    String path = System.getProperty("user.dir") + "\\src\\main\\resources\\StJudePatientReferralsExpectedElements.xlsx";
    WebDriverWait wait = new WebDriverWait(driver, 10);
    DataReader dataReader = new DataReader();
    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    /**
     * Header
     */
    @FindBy(css = WebElementPatientReferralsLink)
    public WebElement patientReferralsLink;
    @FindBy(xpath = WebElementButtonContactUs)
    public WebElement buttonContactUs;
    @FindBy(xpath = WebElementSpanishLanguage)
    public WebElement spanishLanguage;
    @FindBy(xpath = WebElementDonateNowLink)
    public WebElement donateNowLink;
    @FindBy(xpath = WebElementAboutUsMenu)
    public WebElement aboutUsMenu;
    @FindBy(xpath = WebElementAboutUsLinks)
    public WebElement aboutUsLinks;
    @FindBy(xpath = WebElementButtonSearch)
    public WebElement buttonSearch;
    @FindBy(xpath = WebElementSearchBox)
    public WebElement searchBox;

    /**
     * Body
     */
    @FindBy(xpath = WebElementFamiliesSeekingTreatmentLinks)
    public WebElement bodyLinks;
    @FindBy(xpath = WebElementForReferringPhysicians)
    public WebElement forReferringPhysicians;
    @FindBy(css = WebElementClinicalTrials)
    public WebElement clinicalTrials;
    @FindBy(xpath = WebElementAcceptanceRequirements)
    public WebElement acceptanceRequirements;
    @FindBy(xpath = WebElementContactForm)
    public WebElement contactForm;
    @FindBy(xpath = WebElementPagerPhoneNumber)
    public WebElement pagerPhoneNumber;
    @FindBy(xpath = WebElementTollFreeNumber)
    public WebElement tollFreeNumber;
    @FindBy(xpath = WebElementFaxNumber)
    public WebElement faxNumber;
    @FindBy(xpath = WebElementEmail)
    public WebElement email;

    /**
     * Footer
     */
    @FindBy(xpath = WebElementSiteMap)
    WebElement siteMap;
    @FindBy(xpath = WebElementLinkingPolicy)
    WebElement linkingPolicy;

    public void navigateToPatientReferralsPage() {
        wait.until(ExpectedConditions.elementToBeClickable(patientReferralsLink));
        clickOnElement(patientReferralsLink);
        waitUntilVisible(By.xpath("//body/main/div/section/div/section/div[1]"));
        System.out.println("Navigated to Patient Referrals Page Successfully \n");
    }

    /**
     * Test case 1:
     * 1)Navigate to "https://www.stjude.org/"
     * 2)Click on "Patient Referrals"
     * 3)Get page title
     *
     * @return
     */

    public String validatePatientReferralTitle() {
        navigateToPatientReferralsPage();
        waitUntilVisible(By.xpath("//body/main/div/section/div/section/div[1]"));
        String title = getCurrentPageTitle();
        return title;

    }

    /**
     * Test Case 2: "Validate Contact us button"
     * 1)Navigate to "https://www.stjude.org/"
     * 2)Click on "Patient Referrals"
     * 3)Click on Contact us
     * 4)Get the page title
     * 5)close browser
     */
    public boolean validateContactUsLink() throws IOException {
        navigateToPatientReferralsPage();
        buttonContactUs.click();
        waitUntilVisible(By.xpath("//b[contains(text(),'Donor Services:')]"));
        String title = getCurrentPageTitle();
        boolean flag = compareTextToExpectedString(title, path, "contactUsTitle");

        return flag;
    }

    /**
     * Test Case 3: "Change language to spanish"
     * 1)Navigate to "https://www.stjude.org/"
     * 2)Click on "Patient Referrals"
     * 3)Click on spanish language button
     * 4) Get title
     * 5)Close Browser
     *
     * @return
     * @throws IOException
     */
    public boolean validateSpanishLanguage() throws IOException {
        navigateToPatientReferralsPage();
        spanishLanguage.click();
        String title = getCurrentPageTitle();
        boolean flag = compareTextToExpectedString(title, path, "changeLanguageTitle");

        return flag;
    }

    /**
     * Test Case 4: "Validate Donate now link"
     * 1)Navigate to "https://www.stjude.org/"
     * 2)Click on "Patient Referrals"
     * 3)Click "Donate now link"
     * 4)Get page Title
     * 5)Close Browser
     *
     * @return
     * @throws IOException
     */
    public boolean validateDonateNowLink() throws IOException {
        navigateToPatientReferralsPage();
        donateNowLink.click();
        waitUntilVisible(By.xpath("//label[contains(text(),'Monthly')]"));
        String title = getCurrentPageTitle();
        boolean flag = compareTextToExpectedString(title, path, "donateNowTitle");

        return flag;
    }

    /**
     * Test Case 5 : "Count about us tab links"
     * 1)Navigate to "https://www.stjude.org/"
     * 2)Click on "Patient Referrals"
     * 4) Click on about Us button
     * 5) Count links included
     * 6) validate count
     * 7) Close Browser
     */

    public boolean countAboutUsLinks() throws IOException {
        navigateToPatientReferralsPage();
        aboutUsMenu.click();
        boolean flag = compareListSizeToExpectedCount(By.xpath(WebElementAboutUsLinks), path, "aboutUsLinks");
        return flag;
    }

    /**
     * Test Case 6:
     * 1)Navigate to "https://www.stjude.org/"
     * 2)Click on "Patient Referrals"
     * 3) Click on search button
     * 4) pass "Hematology" in search box
     * 5) Get page title
     * 6) validate title
     * 7)Close Browser
     *
     * @return
     * @throws IOException
     */
    public boolean searchHematology() throws IOException, InterruptedException {
        navigateToPatientReferralsPage();
        buttonSearch.click();
        typeOnElementNEnter(WebElementSearchBox, "Hematology");
        sleepFor(3);
        waitUntilVisible(By.xpath("//*[@id=\"site-content\"]/section/div/section[2]/div[1]/div[1]/a/strong"));
        String title = getCurrentPageTitle();
        boolean flag = compareTextToExpectedString(title, path, "searchResultsTitle");
        return flag;
    }

    /**
     * Test Case 7 : "count body links"
     * 1)Navigate to "https://www.stjude.org/"
     * 2)Click on "Patient Referrals"
     * 3)Count body links"left side of tha page"
     * 4)Validate count
     * 5)Close Browser
     */
    public boolean countBodyLinks() throws IOException {
        navigateToPatientReferralsPage();
        waitUntilVisible(By.xpath(WebElementFamiliesSeekingTreatmentLinks));
        boolean flag = compareListSizeToExpectedCount(By.xpath(WebElementFamiliesSeekingTreatmentLinks), path, "bodyLinksCount");
        return flag;
    }

    /**
     * Test Case 8) : "Open body links in new tab and compare titel"
     * 1)Navigate to "https://www.stjude.org/"
     * 2)Click on "Patient Referrals"
     * 3)Open 4 body links in new tabs
     * 4) Get the title from each page
     * 5)compare titles
     * 6)Close browser
     */
    public boolean openBodyLinksInNewTabs() throws IOException, InterruptedException {
        navigateToPatientReferralsPage();
        waitUntilVisible(By.xpath("//h2[contains(text(),'For Families Seeking Treatment')]"));
        boolean flag = clickLinksSwitchTabsCompareURLs(By.xpath(WebElementFamiliesSeekingTreatmentLinks), path, "bodyTabsTitles");
        return flag;
    }

    /**
     * Test Case 9) : "Open body links in new tab and compare title"
     * 1)Navigate to "https://www.stjude.org/"
     * 2)Click on "Patient Referrals"
     * 3)Open 4 body links in new tabs "For famillies referral
     * 4) Get the title from each page
     * 5)compare titles
     * 6)Close browser
     */
    public boolean openBodyLinksInNewTabsForPhysicians() throws IOException, InterruptedException {
        navigateToPatientReferralsPage();
        waitUntilClickAble(By.xpath("//a[contains(text(),'How to refer your patient')]"));
        boolean flag = clickLinksSwitchTabsCompareURLs(By.xpath(WebElementForReferringPhysicians), path, "forReferringPhysicians");
        return flag;
    }

    /**
     * Test Case 10:" Validate clinical trials link
     * 1)Navigate to "https://www.stjude.org/"
     * 2)Click on "Patient Referrals"
     * 3) Click on "Clinical Trials"
     * 4) Get page Title
     * 5) Close Browser
     */
    public boolean validateClinicalTrialsLink() throws IOException {
        navigateToPatientReferralsPage();
        waitUntilClickAble(By.cssSelector(WebElementClinicalTrials));
        clinicalTrials.click();
        boolean flag = compareTextToExpectedString(getCurrentPageTitle(), path, "clinicalTrialsTitle");
        return flag;
    }

    /**
     * Test Case :11
     * 1)Navigate to "https://www.stjude.org/"
     * 2)Click on "Patient Referrals"
     * 3)Get requirements for acceptance in StJude hospital
     * 4)Validate text
     * 5)Close Browser
     */

    public boolean getAcceptanceRequirementText() throws IOException {
        navigateToPatientReferralsPage();
        waitUntilVisible(By.xpath(WebElementAcceptanceRequirements));
        boolean flag = compareTextToExpectedString(acceptanceRequirements.getText(), path, "acceptanceRequirementsText");
        return flag;
    }

    /**
     * Test case 12: "Validate in a new tab" Physician Referral Contact Form
     * 1)Navigate to "https://www.stjude.org/"
     * 2)Click on "Patient Referrals"
     * 3)Click on "Physician Referral Contact Form"
     * 4)Open in new tab
     * 5)Get page url
     * 6)Validate url
     * 7)Close browser
     */
    public boolean validateReferralContactForm() throws IOException, InterruptedException {
        navigateToPatientReferralsPage();
        //js.executeScript("arguments[0].scrollIntoView(true);",contactForm);
        waitUntilClickAble(By.xpath(WebElementContactForm));
        contactForm.click();
        boolean flag = switchToTabAndCompareURL(path, "contactFormUrl");
        return flag;
    }

    /**
     * Test Case 13 "Validate 24 hours pager is displayed"
     * 1)Navigate to "https://www.stjude.org/"
     * 2)Click on "Patient Referrals"
     * 3)Verify if 24 hours pager is displayed
     * 4)Close browser
     */
    public boolean verifyPagerPhoneNumberIsDisplayed() {
        navigateToPatientReferralsPage();
        waitUntilVisible(By.xpath(WebElementPagerPhoneNumber));
        boolean flag = pagerPhoneNumber.isDisplayed();
        return flag;
    }

    /**
     * @return
     */
    public boolean verifyTollFreePhoneNumberIsDisplayed() {
        navigateToPatientReferralsPage();
        waitUntilVisible(By.xpath(WebElementTollFreeNumber));
        boolean flag = tollFreeNumber.isDisplayed();
        return flag;
    }

    /**
     *
     */
    public boolean verifyFaxNumberIsDisplayed() {
        navigateToPatientReferralsPage();
        waitUntilVisible(By.xpath(WebElementFaxNumber));
        boolean flag = faxNumber.isDisplayed();
        return flag;
    }

    /**
     *
     */
    public boolean verifyEmailIsDisplayed() {
        navigateToPatientReferralsPage();
        waitUntilVisible(By.xpath(WebElementEmail));
        boolean flag = email.isDisplayed();
        return flag;
    }
    /**
     *  Test Case 17: "Validate social media links"
     *   1)Navigate to "https://www.stjude.org/"
     *   2)Click on "Patient Referrals"
     *   3)Open 4 social media  in new tabs
     *   4)compare url for each page
     *   5)Close browser
     */
    public boolean openSocialMediaIconsInNewTabs() throws IOException, InterruptedException {
        navigateToPatientReferralsPage();
        waitUntilVisible(By.xpath(WebElementSocialMediaIcons));
        boolean flag=clickLinksSwitchTabsCompareURLs(By.xpath(WebElementSocialMediaIcons),path,"socialMediaIcons");
        return flag;
    }
    /**
     *  Test Case 18: "Validate social media links"
     *   1)Navigate to "https://www.stjude.org/"
     *   2)Click on "Patient Referrals"
     *   3)Open 5 partners links  in new tabs
     *   4)compare url for each page
     *   5)Close browser
     */
    public boolean openPartnersIconsInNewTabs() throws IOException, InterruptedException {
        navigateToPatientReferralsPage();
        waitUntilVisible(By.xpath(WebElementPartnersLinks));
        boolean flag=clickLinksSwitchTabsCompareURLs(By.xpath(WebElementPartnersLinks),path,"partnersLinks");
        return flag;
    }
    /**
     *Test Case 19: "Validate Site map in footer section"
     *   1)Navigate to "https://www.stjude.org/"
     *   2)Click on "Patient Referrals"
     *   3)Scroll down the page
     *   4)Click on site map
     *   5)Get page Title
     */
    public boolean validateSiteMapLink() throws IOException {
        navigateToPatientReferralsPage();
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        siteMap.click();
        waitUntilClickAble(By.xpath(WebElementSiteMap));
        String title=getCurrentPageTitle();
        boolean flag=compareTextToExpectedString(getCurrentPageTitle(),path,"siteMapTitle");

        return flag;
    }
    /**
     *  Test Case 20: "Validate linking policy in footer section"
     *     1)Navigate to "https://www.stjude.org/"
     *     2)Click on "Patient Referrals"
     *     3)Scroll down the page
     *     4)Click "linking policy"
     *     5)Get page Title
     */
    public boolean validateLinkingPolicyLink() throws IOException {
        navigateToPatientReferralsPage();
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        linkingPolicy.click();
        waitUntilClickAble(By.xpath(WebElementLinkingPolicy));
        String title=getCurrentPageTitle();
        boolean flag=compareTextToExpectedString(getCurrentPageTitle(),path,"linkingPolicyTitle");

        return flag;
    }
}