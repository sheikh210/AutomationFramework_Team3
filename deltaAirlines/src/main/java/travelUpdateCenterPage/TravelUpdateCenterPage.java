package travelUpdateCenterPage;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DataReader;

import java.io.IOException;

import static travelUpdateCenterPage.TravelUpdateCenterPageElements.*;

public class TravelUpdateCenterPage extends WebAPI {

    WebDriverWait wait = new WebDriverWait(driver, 10);

    @FindBy (css = webElementButtonTravelUpdate)
    private WebElement buttonTravelUpdate;

    @FindBy (xpath = webElementButtonTravelUpdateCenter)
    private WebElement buttonTravelUpdateCenter;

    @FindBy (css = webElementMenuTravelUpdateCenterDropdown)
    private WebElement menuTravelUpdateCenterDropdown;

    @FindBy (css = webElementButtonAccordionWaysWereKeepingYouSafe)
    private WebElement buttonAccordionWaysWereKeepingYouSafe;

    @FindBy (css = webElementSubmenuWaysWereKeepingYouSafe)
    private WebElement submenuWaysWereKeepingYouSafe;

    @FindBy (css = webElementButtonAccordionFromDeltaToOurCustomers)
    private WebElement buttonAccordionFromDeltaToOurCustomers;

    @FindBy (css = webElementSubmenuFromDeltaToOurCustomers)
    private WebElement submenuFromDeltaToOurCustomers;

    @FindBy (css = webElementButtonAccordionFlyingWhatYouNeedToKnow)
    private WebElement buttonAccordionFlyingWhatYouNeedToKnow;

    @FindBy (css = webElementSubmenuFlyingWhatYouNeedToKnow)
    private WebElement submenuFlyingWhatYouNeedToKnow;

    @FindBy (css = webElementGridCoronavirusUpdateCenter)
    private WebElement gridCoronavirusUpdateCenter;

    @FindBy (css = webElementContainerTravelFlexibility)
    private WebElement containerTravelFlexibility;

    @FindBy (css = webElementContainerTravelingWithUs)
    private WebElement containerTravelingWithUs;

    @FindBy (css = webElementContainerCaringForYou)
    private WebElement containerCaringForYou;

    @FindBy (xpath = webElementButtonAccordionShowAllRecentCoronavirusUpdates)
    private WebElement buttonAccordionShowAllRecentCoronavirusUpdates;

    @FindBy (xpath = webElementButtonExpandedAccordionShowAllRecentCoronavirusUpdates)
    private WebElement buttonExpandedAccordionShowAllCoronavirusRecentUpdates;

    @FindBy (xpath = webElementContainerShowAllRecentCoronavirusUpdates)
    private WebElement containerShowAllCoronavirusRecentUpdates;

    @FindBy (css = webElementContainerOtherUpdatesAndTravelTips)
    private WebElement containerOtherUpdatesAndTravelTips;

    @FindBy (css = webElementLinkDeltaSkyClubUpdates)
    private WebElement linkDeltaSkyClubUpdates;

    @FindBy (css = webElementLinkDownloadTheFlyDeltaApp)
    private WebElement linkDownloadTheFlyDeltaApp;

    @FindBy (css = webElementLinkFlyingWithAPartnerAirline)
    private WebElement linkFlyingWithAPartnerAirline;

    @FindBy (css = webElementContainerFrequentlyAskedQuestions)
    private WebElement containerFrequentlyAskedQuestions;

    /**
     * GETTERS
     */
    public WebElement getButtonTravelUpdate() {
        return buttonTravelUpdate;
    }

    public WebElement getButtonTravelUpdateCenter() {
        return buttonTravelUpdateCenter;
    }

    public WebElement getMenuTravelUpdateCenterDropdown() {
        return menuTravelUpdateCenterDropdown;
    }

    public WebElement getButtonAccordionWaysWereKeepingYouSafe() {
        return buttonAccordionWaysWereKeepingYouSafe;
    }

    public WebElement getSubmenuWaysWereKeepingYouSafe() {
        return submenuWaysWereKeepingYouSafe;
    }

    public WebElement getButtonAccordionFromDeltaToOurCustomers() {
        return buttonAccordionFromDeltaToOurCustomers;
    }

    public WebElement getSubmenuFromDeltaToOurCustomers() {
        return submenuFromDeltaToOurCustomers;
    }

    public WebElement getButtonAccordionFlyingWhatYouNeedToKnow() {
        return buttonAccordionFlyingWhatYouNeedToKnow;
    }

    public WebElement getSubmenuFlyingWhatYouNeedToKnow() {
        return submenuFlyingWhatYouNeedToKnow;
    }

    public WebElement getGridCoronavirusUpdateCenter() {
        return gridCoronavirusUpdateCenter;
    }

    public WebElement getContainerTravelFlexibility() {
        return containerTravelFlexibility;
    }

    public WebElement getContainerTravelingWithUs() {
        return containerTravelingWithUs;
    }

    public WebElement getContainerCaringForYou() {
        return containerCaringForYou;
    }

    public WebElement getButtonAccordionShowAllRecentCoronavirusUpdates() {
        return buttonAccordionShowAllRecentCoronavirusUpdates;
    }

    public WebElement getButtonExpandedAccordionShowAllCoronavirusRecentUpdates() {
        return buttonExpandedAccordionShowAllCoronavirusRecentUpdates;
    }

    public WebElement getContainerShowAllCoronavirusRecentUpdates() {
        return containerShowAllCoronavirusRecentUpdates;
    }

    public WebElement getContainerOtherUpdatesAndTravelTips() {
        return containerOtherUpdatesAndTravelTips;
    }

    public WebElement getLinkDeltaSkyClubUpdates() {
        return linkDeltaSkyClubUpdates;
    }

    public WebElement getLinkDownloadTheFlyDeltaApp() {
        return linkDownloadTheFlyDeltaApp;
    }

    public WebElement getLinkFlyingWithAPartnerAirline() {
        return linkFlyingWithAPartnerAirline;
    }

    public WebElement getContainerFrequentlyAskedQuestions() {
        return containerFrequentlyAskedQuestions;
    }


    /**
     * Test Case 1 - Validate "Travel Update Center Dropdown" Functionality
     * Test Case 2 - Validate "Travel Update Center Dropdown" List Count
     * Test Case 3 - Validate "Travel Update Center Dropdown" List Item Names
     */
    public void clickDropdownTravelUpdateCenter(){
        navigateToTravelUpdateCenterPage();
        wait.until(ExpectedConditions.elementToBeClickable(buttonTravelUpdateCenter));

        try {
            clickOnElement(buttonTravelUpdateCenter);
            System.out.println("Clicked \"Travel Update Center\" dropdown\n");
        } catch (Exception e) {
            System.out.println("COULD NOT CLICK ON \"TRAVEL UPDATE CENTER\" DROPDOWN - TRYING AGAIN\n");
            clickJScript(buttonTravelUpdateCenter);
        }
    }

    /**
     * Test Case 4 - Validate "Travel Update Center Dropdown" List - "Ways We're Keeping You Safe" submenu count
     */
    public void clickDropdownTravelUpdateCenterAndWaysWereKeepingYouSafe() {
        navigateToTravelUpdateCenterPage();
        wait.until(ExpectedConditions.elementToBeClickable(buttonTravelUpdateCenter));

        try {
            clickOnElement(buttonTravelUpdateCenter);
            System.out.println("Clicked \"Travel Update Center\" dropdown\n");
        } catch (Exception e) {
            System.out.println("COULD NOT CLICK ON \"TRAVEL UPDATE CENTER\" DROPDOWN - TRYING AGAIN\n");
            clickJScript(buttonTravelUpdateCenter);
        }
        try {
            clickOnElement(buttonAccordionWaysWereKeepingYouSafe);
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(getWebElementListWaysWereKeepingYouSafe())));
            System.out.println("Clicked & expanded \"Ways We're Keeping You Safe\"\n");
        } catch (Exception e1) {
            System.out.println("COULD NOT CLICK ON \"WAYS WE'RE KEEPING YOU SAFE\" ACCORDION BUTTON --- TRYING AGAIN");
            clickJScript(buttonAccordionWaysWereKeepingYouSafe);
            System.out.println("Clicked & expanded \"Ways We're Keeping You Safe\"\n");
        }
    }

    /**
     * Test Case 5 - Validate "Travel Update Center Dropdown" List - "From Delta to Our Customers" submenu item names
     */
    public void clickDropdownTravelUpdateCenterAndFromDeltaToOurCustomers() {
        navigateToTravelUpdateCenterPage();
        wait.until(ExpectedConditions.elementToBeClickable(buttonTravelUpdateCenter));

        try {
            clickOnElement(buttonTravelUpdateCenter);
            System.out.println("Clicked \"Travel Update Center\" dropdown\n");
        } catch (Exception e) {
            System.out.println("COULD NOT CLICK ON \"TRAVEL UPDATE CENTER\" DROPDOWN - TRYING AGAIN\n");
            clickJScript(buttonTravelUpdateCenter);
        }

        try {
            clickOnElement(buttonAccordionFromDeltaToOurCustomers);
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(getWebElementListFromDeltaToOurCustomers())));
            System.out.println("Clicked & expanded \"From Delta To Our Customers\"\n");
        } catch (Exception e) {
            System.out.println("COULD NOT CLICK ON \"FROM DELTA TO OUR CUSTOMERS\" ACCORDION BUTTON --- TRYING AGAIN\n");
            clickJScript(buttonAccordionFromDeltaToOurCustomers);
            System.out.println("Clicked & expanded \"From Delta To Our Customers\"\n");
        }
    }

    /**
     * Test Case 6 - Validate "Travel Update Center Dropdown" List - "Flying? What You Need to Know" submenu item names
     */
    public void clickDropdownTravelUpdateCenterAndFlyingWhatYouNeedToKnowSubmenu() {
        navigateToTravelUpdateCenterPage();
        wait.until(ExpectedConditions.elementToBeClickable(buttonTravelUpdateCenter));

        clickDropdownTravelUpdateCenter();
        wait.until(ExpectedConditions.elementToBeClickable(buttonAccordionFlyingWhatYouNeedToKnow));

        try {
            clickOnElement(buttonAccordionFlyingWhatYouNeedToKnow);
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(getWebElementListFlyingWhatYouNeedToKnow())));
            System.out.println("Clicked & expanded \"Flying? What You Need To Know\"\n");
        } catch (Exception e) {
            System.out.println("COULD NOT CLICK ON \"FLYING? WHAT YOU NEED TO KNOW\" --- TRYING AGAIN\n");
            clickJScript(buttonAccordionFlyingWhatYouNeedToKnow);
            System.out.println("Clicked & expanded \"Flying? What You Need To Know\"\n");
        }
    }

    /**
     * Test Case 7 - Validate names of each section within "Coronavirus Update Center"
     */
    public void waitToBeVisibleCoronavirusUpdateCenter() {
        navigateToTravelUpdateCenterPage();
        wait.until(ExpectedConditions.visibilityOf(gridCoronavirusUpdateCenter));
        System.out.println("Header Titles Under \"Coronavirus Update Center\":\n");
    }

    /**
     * Test Case 8 - Validate names of each item under "Travel Flexibility" grid ("Coronavirus Update Center" grid)
     */
    public void waitToBeVisibleTravelFlexibility() {
        navigateToTravelUpdateCenterPage();
        wait.until(ExpectedConditions.visibilityOf(gridCoronavirusUpdateCenter));
        System.out.println("List Items Under \"Travel Flexibility\" Section:\n");
    }

    /**
     * Test Case 9 - Validate URL of each item under "Travel Flexibility" grid ("Coronavirus Update Center" grid)
     */
    public void waitToBeVisibleURLsTravelFlexibility() {
        navigateToTravelUpdateCenterPage();
        wait.until(ExpectedConditions.visibilityOf(gridCoronavirusUpdateCenter));
        System.out.println("\"Travel Flexibility\" Grid - URLs:\n");
    }

    /**
     * Test Case 10 - Validate names of each item under "Traveling With Us" grid ("Coronavirus Update Center" grid)
     */
    public void waitToBeVisibleTravelingWithUs() {
        navigateToTravelUpdateCenterPage();
        wait.until(ExpectedConditions.visibilityOf(gridCoronavirusUpdateCenter));
        System.out.println("List Items Under \"Traveling With Us\" Section:\n");
    }

    /**
     * Test Case 11 - Validate URL of each item under "Traveling With Us" grid ("Coronavirus Update Center" grid)
     */
    public void waitToBeVisibleURLsTravelingWithUs() {
        navigateToTravelUpdateCenterPage();
        wait.until(ExpectedConditions.visibilityOf(gridCoronavirusUpdateCenter));
        System.out.println("\"Traveling With Us\" Grid - URLs:\n");
    }

    /**
     * Test Case 12 - Validate names of each item under "Caring For You" grid ("Coronavirus Update Center" grid)
     */
    public void waitToBeVisibleCaringForYou() {
        navigateToTravelUpdateCenterPage();
        wait.until(ExpectedConditions.visibilityOf(gridCoronavirusUpdateCenter));
        System.out.println("List Items Under \"Caring For You\" Section:\n");
    }

    /**
     * Test Case 13 - Validate URL of each item under "Caring For You" grid ("Coronavirus Update Center" grid)
     */
    public void waitToBeVisibleURLsGridCaringForYou() {
        navigateToTravelUpdateCenterPage();
        wait.until(ExpectedConditions.visibilityOf(gridCoronavirusUpdateCenter));
        System.out.println("\"Caring For You\" Grid - URLs:\n");
    }

    /**
     * Test Case 14 - Validate functionality of "Show All Recent Coronavirus Updates" Accordion
     */
    public void clickAccordionShowAllRecentCoronavirusUpdates(){
        navigateToTravelUpdateCenterPage();
        wait.until(ExpectedConditions.elementToBeClickable(buttonAccordionShowAllRecentCoronavirusUpdates));

        clickOnElement(buttonAccordionShowAllRecentCoronavirusUpdates);
        wait.until(ExpectedConditions.visibilityOf(buttonExpandedAccordionShowAllCoronavirusRecentUpdates));

        System.out.println("Clicked \"Show All Recent Coronavirus Updates Accordion Button\"\n");
    }

    /**
     * Test Case 15 - Validate all URLs contained within "Show All Recent Coronavirus Updates" expanded menu
     */
    public void clickAccordionDropdownShowAllRecentCoronavirusUpdates() {
        navigateToTravelUpdateCenterPage();
        wait.until(ExpectedConditions.elementToBeClickable(buttonAccordionShowAllRecentCoronavirusUpdates));

        clickOnElement(buttonAccordionShowAllRecentCoronavirusUpdates);
        wait.until(ExpectedConditions.visibilityOf(containerShowAllCoronavirusRecentUpdates));

        System.out.println("Clicked \"Show All Recent Coronavirus Updates Accordion Button\"\n");
    }

    /**
     * Test Case 16 - Validate "Other Updates and Travel Tips" Grid Header Names
     */
    public void waitToBeVisibleContainerOtherUpdatesAndTravelTips() {
        navigateToTravelUpdateCenterPage();
        wait.until(ExpectedConditions.visibilityOf(containerOtherUpdatesAndTravelTips));
        System.out.println("\"Other Updates and Travel Tips\" - Header Names\n");
    }

    /**
     * Test Case 17 - Validate Navigation to "Delta Sky Club Updates" - "Other Updates and Travel Tips" Container
     */
    public String validateDeltaSkyClubUpdatesURLNav() {
        navigateToTravelUpdateCenterPage();
        wait.until(ExpectedConditions.visibilityOf(linkDeltaSkyClubUpdates));

        clickOnElement(linkDeltaSkyClubUpdates);
        System.out.println("Clicked \"Delta Sky Club Updates\"\n");

        String url = driver.getCurrentUrl();
        System.out.println("\"Delta Sky Club Updates\" URL: " + url);

        return url;
    }

    /**
     * Test Case 18 - Validate Navigation to "Download The Fly Delta App" - "Other Updates and Travel Tips" Container
     */
    public void clickDownloadTheFlyDeltaApp() {
        navigateToTravelUpdateCenterPage();
        wait.until(ExpectedConditions.elementToBeClickable(linkDownloadTheFlyDeltaApp));

        clickOnElement(linkDownloadTheFlyDeltaApp);
        System.out.println("Clicked \"Download The Fly Delta App\"\n");
    }

    /**
     * Test Case 19 - Validate Navigation to "Flying With A Partner Airline?" - "Other Updates and Travel Tips" Container
     */
    public String clickFlyingWithAPartnerAirline() {
        navigateToTravelUpdateCenterPage();
        wait.until(ExpectedConditions.elementToBeClickable(linkFlyingWithAPartnerAirline));

        clickOnElement(linkFlyingWithAPartnerAirline);
        System.out.println("Clicked \"Flying With a Partner Airline?\"\n");

        String url = getCurrentPageUrl();

        return url;
    }

    /**
     * Test Case 20 - Validate "Frequently Asked Questions" Grid Header Titles
     */
    public void waitToBeVisibleFrequentlyAskedQuestionsContainerHeaderNames() throws IOException {
        navigateToTravelUpdateCenterPage();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(getWebElementListFrequentlyAskedQuestionsHeaderTitles())));
    }


    /**
     * Helper Method to navigate to Travel Update Center Page
     */
    public void navigateToTravelUpdateCenterPage() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonTravelUpdate));
        clickOnElement(buttonTravelUpdate);
        System.out.println("Navigated to Travel Update Center page\n");
    }
}
