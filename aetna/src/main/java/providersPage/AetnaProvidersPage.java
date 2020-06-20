package providersPage;

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
import java.util.concurrent.TimeUnit;

import static providersPage.AetnaProvidersElements.*;

public class AetnaProvidersPage extends WebAPI {
    String path = System.getProperty("user.dir") +"\\src\\main\\resources\\AetnaProvidersPage_ExpectedElements.xlsx" ;
    WebDriverWait wait = new WebDriverWait(driver, 10);
    DataReader dataReader = new DataReader();
    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @FindBy(xpath = WebElementProvidersLink)
    public WebElement providersLink;
    /**
     * Header
     */
    @FindBy(xpath = WebElementContactUsButton)
    public WebElement contactUsButton;
    @FindBy(xpath = WebElementSpanishLanguageButton)
    public WebElement spanishLanguageButton;
    @FindBy(xpath = WebElementSearchBox)
    public WebElement searchBox;
    @FindBy(xpath = WebElementHsaSearch)
    public WebElement hsaSearch;
    @FindBy(css = webElementExploreAetnaSitesButton)
    public WebElement exploreAetnaSitesButton;
    @FindBy(xpath = WebElementExploreMenu)
    public WebElement exploreMenuItems;
    @FindBy(xpath = WebElementClaimsButton)
    public WebElement claimsButton;
    @FindBy(xpath = WebElementHealthCareProvidersButton)
    public WebElement healthCareProvidersButton;
    @FindBy(xpath = WebElementHealthCareProvidersSubItems)
    public  WebElement healthCareProvidersSubItems;
    /**
     * Body
     */
    @FindBy(xpath = WebElementVideoPlayButton)
    public WebElement videoPlayButton;
    @FindBy(id = WebElementViewTranscriptButton)
    public WebElement viewTranscript;
    @FindBy(className = WebElementTranscriptText)
    public WebElement transcriptText;
    @FindBy(xpath = WebElementResourceLink)
    public WebElement resourceLink;
    /**
     * Footer
     */
    @FindBy(xpath = WebElementFooterSocialMediaLinks)
    public WebElement footerSocialMediaLinks;
    @FindBy(xpath = WebElementInstagramIcon)
    public WebElement instagramIcon;
    @FindBy(xpath = WebElementFacebookIcon)
    public WebElement facebookIcon;

    public AetnaProvidersPage() throws IOException {
    }

    /**
     * Test case 1: "Validate providers page title"
     * 1)Navigate to "Navigate to http://aetna.com"
     * 2) Navigate to "https://www.aetna.com/health-care-professionals.html".
     * 3)Get title
     * 4)validate title
     * 5)Close browser
     */

    public boolean validateProvidersPageTitle() throws IOException {
        navigateToProvidersPage();
        boolean flag=compareTextToExpectedString(getCurrentPageTitle(),path,"providersPageTitle");
        return flag;
    }
    /**
     * Test Case 2 "Validate Contact us button"
     * 1) Navigate to "Navigate to http://aetna.com"
     * 2) Navigate to "https://www.aetna.com/health-care-professionals.html".
     * 3) Click on "Contact us"
     * 4) Get the page title
     * 5) Validate page title
     * 6) Close browser
     */
    public boolean validateContactUsButton() throws IOException {
        navigateToProvidersPage();
        clickOnElement(contactUsButton);
        String title="Contact Us - Health Care Providers | Aetna";
        wait.until(ExpectedConditions.titleIs(title));
        boolean flag=compareTextToExpectedString(title,path,"contactUsPageTitle");
        return flag;
    }

    /**
     * Test cases 3: "Change language to spanish"
     * 1) Navigate to "Navigate to http://aetna.com"
     * 2) Navigate to "https://www.aetna.com/health-care-professionals.html"
     * 3) Click on "Espagnol" button.
     * 4) Get page title
     * 5) close browser
     */
    public boolean changeLanguageToSpanish() throws IOException {
        navigateToProvidersPage();
        clickOnElement(spanishLanguageButton);
        String title= "Aetna para proveedores del cuidado de salud | Recursos y apoyo para profesionales de la salud";
        wait.until(ExpectedConditions.titleIs(title));
        boolean flag=compareTextToExpectedString(title,path,"spanishPageTitle");
        navigateBack();
        return flag;
    }

    /**
     * Test case 4: "Validate search box"
     * 1) Navigate to "Navigate to http://aetna.com"
     * 2) Navigate to "https://www.aetna.com/health-care-professionals.html"
     * 3) Click on search box
     * 4) Type "HSA"
     * 5) validate search
     * 6)Close browser
     * @return
     */
    public boolean searchHsa(){
        navigateToProvidersPage();
        typeOnElementNEnter(WebElementSearchBox,"HSA");
        wait.until(ExpectedConditions.visibilityOf(hsaSearch));
        boolean flag=hsaSearch.isDisplayed();
        return flag;
    }

    /**
     * Test Cae 5:"
     * Validate "Explore Aetna sites" button in header & elements contained within it
     * 1) Navigate to http://aetna.com
     * 2) Navigate to "https://www.aetna.com/health-care-professionals.html"
     * 3) Click on "Explore Aetna sites" button on top right of header
     * 4) Verify the number of items contained within the dropdown
     * 5) Verify the name of each of the items
     * 6)Verify each item in the list takes us to the expected pages
     * 7) Close browser
     */
    public boolean exploreAetnaMenu() throws IOException {
        navigateToProvidersPage();
        clickOnElement(exploreAetnaSitesButton);
        wait.until(ExpectedConditions.visibilityOf(exploreMenuItems));
        boolean flag=compareWebElementListToExpectedStringArray(By.xpath(WebElementExploreMenu),path,"exploreMenuItems");
        return flag;
    }

    /**
     * Test Case 6: "Validate sub links for "Health care providers" under claims menu
     * 1) Navigate to http://aetna.com
     * 2) Navigate to "https://www.aetna.com/health-care-professionals.html"
     * 3) Click on Claims button
     * 4) click on "Health care providers" button
     * 5) Count menu sublinks
     * 6) Validate count
     * 5) Close browser
     */
    public boolean  countClaimsProvidersSubmenuItems() throws IOException {
        navigateToProvidersPage();
        claimsButton.click();
        healthCareProvidersButton.click();
        wait.until(ExpectedConditions.visibilityOf(healthCareProvidersSubItems));
        boolean flag=compareListSizeToExpectedCount(By.xpath(WebElementHealthCareProvidersSubItems),path,"claimsSubMenuCount");
        return flag;

    }

    /**
     * Test Case 7:"Validate sub links text for "Health care providers" under claims menu
     * 1) Navigate to http://aetna.com
     * 2) Navigate to "https://www.aetna.com/health-care-professionals.html"
     * 3) Click on Claims button
     * 4) click on "Health care providers" button
     * 5) print menu sublinks
     * 6) Validate text for each item
     * 5) Close browser
     */
    public boolean getTextClaimsProvidersSubmenuItems() throws IOException {
        navigateToProvidersPage();
        claimsButton.click();
        healthCareProvidersButton.click();
        wait.until(ExpectedConditions.visibilityOf(healthCareProvidersSubItems));
        boolean flag= compareWebElementListToExpectedStringArray(By.xpath(WebElementHealthCareProvidersSubItems),path,"claimsSubMenuText");
        return flag;
    }

    /**
     * Test Case 8: "Validate video is playing when clicked"
     * 1) Navigate to http://aetna.com
     * 2) Navigate to "https://www.aetna.com/health-care-professionals.html"
     * 3) Play youtube video
     */
    public void playVideo() throws InterruptedException {
        navigateToProvidersPage();
        js.executeScript("window.scrollBy(0,1000)");
//        WebElement innerFrame=driver.findElement(By.xpath("//*[@id=\"content__main\"]/div[3]/div/div/div/div[2]/div/div[2]/div/iframe"));
//        driver.switchTo().frame(innerFrame);
//        js.executeScript("document.getElementById(\"video\").play()");
       // waitUntilVisible(By.xpath(WebElementVideoPlayButton));
       // clickOnElement(videoPlayButton);
        WebElement elm = driver.findElement(By.xpath("//*[@id=\"content__main\"]/div[3]/div/div/div/div[2]/div/div[2]/div/iframe"));
        String urlStr = elm.getAttribute("src");
        System.out.println("Video Url : " + urlStr);
        driver.navigate().to(urlStr);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //Click on play button
        jse.executeScript("html5-video-player().play();");

    }

    /**
     * Test Case 9: "Validate transcript text"
     * 1) Navigate to http://aetna.com
     * 2) Navigate to "https://www.aetna.com/health-care-professionals.html"
     * 3) Click on "View Transcript"
     * 4) Extract text
     * 5) validate Text
     * 6) Close browser
     */
    public boolean viewTranscript() throws IOException {
        navigateToProvidersPage();
        mouseHover(viewTranscript);
        clickOnElement(viewTranscript);
        String actualText=transcriptText.getText();
        dataReader.setCellData(path,"transcriptText",0,0,actualText);
        boolean flag=compareTextToExpectedString(actualText,path,"transcriptText");
        return flag;
    }

    /**
     * Test case 10:"Validate Corona virus fact" link
     * 1) Navigate to http://aetna.com
     * 2) Navigate to "https://www.aetna.com/health-care-professionals.html"
     * 3) Click on "Get CoronaVirus Fact"
     * 4) Get title
     * 5) Close browser
     */

    public boolean validateCoronaVirusFactLink() throws IOException {
        navigateToProvidersPage();
        clickOnElement(resourceLink);
        wait.until(ExpectedConditions.titleIs("COVID-19 Resources & Support for Aetna Providers"));
        boolean flag= compareTextToExpectedString(getCurrentPageTitle(),path,"coronaVirusFcatTitle");
        return flag;
    }
    /**
     * Test Case 11: "get count of quick links"
     * 1) Navigate to http://aetna.com
     * 2) Navigate to "https://www.aetna.com/health-care-professionals.html"
     * 3) get count of quick links section
     * 4) validate count
     * 5 close browser
     */
    public boolean countQuickLinks() throws IOException {
        navigateToProvidersPage();
        waitUntilClickAble(By.xpath(WebElementQuickLinks));
        boolean flag=compareListSizeToExpectedCount(By.xpath(WebElementQuickLinks),path,"quickLinksCount");
        return flag;
    }

    /**
     * Test Case 12: "Validate quick links"
     * 1) Navigate to http://aetna.com
     * 2) Navigate to "https://www.aetna.com/health-care-professionals.html"
     * 3) Open each quick link in new tab and get URL
     * 4) Validate each URL
     * 5) Close browser
     */
    public boolean validateQuickLinks() throws IOException, InterruptedException {
        navigateToProvidersPage();
        waitUntilClickAble(By.xpath(WebElementQuickLinks));
        boolean flag=clickLinksSwitchTabsCompareURLs(By.xpath(WebElementQuickLinks),path,"quickLinksTabs");
        return flag;
    }

    /**
     * Test case 13: " Validate newsLetter link"
     * 1) Navigate to http://aetna.com
     * 2) Navigate to "https://www.aetna.com/health-care-professionals.html"
     * 3) Click on "Read provider newsletters"
     * 4) Get page title
     * 5) Close browser
     */
    public boolean validateNewsLetterLink() throws IOException {
        navigateToProvidersPage();
        waitUntilClickAble(By.xpath(WebElementNewsLetter));
        clickOnElement(WebElementNewsLetter);
        boolean flag=compareTextToExpectedString(getCurrentPageTitle(),path,"newsLetterTitle");
        return flag;
    }

    /**
     *Test case 14: " Validate Explore health care resources link"
     * 1) Navigate to http://aetna.com
     * 2) Navigate to "https://www.aetna.com/health-care-professionals.html"
     * 3) Click on "Explore health care resources"
     * 4) Get page title
     * 5) Close browser
     */

    public boolean validateExploreHealthCareResourceLink() throws IOException {
        navigateToProvidersPage();
        waitUntilClickAble(By.xpath(WebElementExploreHealthCareLink));
        clickOnElement(WebElementExploreHealthCareLink);
        boolean flag=compareTextToExpectedString(getCurrentPageTitle(),path,"exploreHealthCareTitle");
        return flag;
    }

    /**
     * Test Case 15: "count Helpful links"
     * 1) Navigate to http://aetna.com
     * 2) Navigate to "https://www.aetna.com/health-care-professionals.html"
     * 3) count helpful links
     * 4) validate count
     * 5) Close browser
     */
    public boolean countHelpfulLinks() throws IOException {
        navigateToProvidersPage();
        waitUntilVisible(By.xpath(WebElementHelpfulLinks));
        boolean flag=compareListSizeToExpectedCount(By.xpath(WebElementHelpfulLinks),path,"helpfulLinksCount");
        return flag;
    }

    /**
     * Test Case 16:"print helpful links"
     * 1) Navigate to http://aetna.com
     * 2) Navigate to "https://www.aetna.com/health-care-professionals.html"
     * 3) Print helpful links
     * 4) validate URL
     * 5) Close browser
     */
    public boolean printHelpfulLinks() throws IOException, InterruptedException {
        navigateToProvidersPage();
        waitUntilVisible(By.xpath(WebElementHelpfulLinks));
        boolean flag=clickLinksSwitchTabsCompareURLs(By.xpath(WebElementHelpfulLinks),path,"helpfulLinksUrl");
        return flag;
    }

    /**
     * Test Case 17: "Count footer section links"
     * 1) Navigate to http://aetna.com
     * 2) Navigate to "https://www.aetna.com/health-care-professionals.html"
     * 3) Count footer section links
     * 4) Validate count
     * 5) Close browse
     */
    public boolean countFooterSectionLinks() throws IOException {
        navigateToProvidersPage();
        waitUntilClickAble(By.xpath(WebElementFooterSocialMediaLinks));
        boolean flag=compareListSizeToExpectedCount(By.xpath(WebElementFooterSocialMediaLinks),path,"footerSectionLinks");
        return flag;
    }

    /**
     * Test Case 18: "validate all footer section text"
     * 1) Navigate to http://aetna.com
     * 2) Navigate to "https://www.aetna.com/health-care-professionals.html"
     * 3) extract text from each footer section item
     * 4) Validate text
     * 5) Close Browser
     */
    public boolean printFooterSectionItems() throws IOException, InterruptedException {
        navigateToProvidersPage();
        scrollToElementJScript(footerSocialMediaLinks);
        boolean flag= clickLinksSwitchTabsCompareURLs(By.xpath(WebElementFooterSocialMediaLinks),path,"footerSectionLinks");
        return flag;
    }

    /**
     * Test Case 19: "Ensure Instagram icon is displayed"
     * 1) Navigate to http://aetna.com
     * 2) Navigate to "https://www.aetna.com/health-care-professionals.html"
     * 3) Verify if Instagram icon is displayed
     * 4) Close browse
     */
    public boolean isInsIconDisplayed(){
        navigateToProvidersPage();
        scrollToElementJScript(instagramIcon);
        boolean flag=instagramIcon.isDisplayed();
        return flag;
    }
    /**
     * Test Case 20: "Ensure Facebook icon is displayed"
     * 1) Navigate to http://aetna.com
     * 2) Navigate to "https://www.aetna.com/health-care-professionals.html"
     * 3) Verify if Facebook icon is displayed
     * 4) Close browser
     */
    public boolean isFacebookIconDisplayed(){
        navigateToProvidersPage();
        scrollToElementJScript(facebookIcon);
        boolean flag=facebookIcon.isDisplayed();
        return flag;
    }






    //Helper Method
    public void navigateToProvidersPage(){
        wait.until(ExpectedConditions.elementToBeClickable(providersLink));
        clickOnElement(providersLink);
        waitUntilVisible(By.xpath("//div[@class='hb_image']//img"));
        System.out.println("Navigated to Aetna Providers Page Successfully");
    }
}
