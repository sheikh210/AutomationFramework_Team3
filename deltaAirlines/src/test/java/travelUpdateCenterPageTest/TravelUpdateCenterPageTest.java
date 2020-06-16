package travelUpdateCenterPageTest;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import travelUpdateCenterPage.TravelUpdateCenterPage;
import travelUpdateCenterPage.TravelUpdateCenterPageElements;
import utilities.DataReader;

import java.io.FileNotFoundException;
import java.io.IOException;

import static travelUpdateCenterPage.TravelUpdateCenterPageElements.*;

public class TravelUpdateCenterPageTest extends WebAPI {

    static TravelUpdateCenterPage travelUpdateCenterPage;
    static DataReader dataReader = new DataReader();
    static SoftAssert softAssert = new SoftAssert();
    static String path = System.getProperty("user.dir")+"\\src\\main\\resources\\DeltaTravelUpdateCenterPage_ExpectedElements.xlsx";

    public static void getInItElement(){
        travelUpdateCenterPage = PageFactory.initElements(driver,TravelUpdateCenterPage.class);
    }

    /**
     * Test Case 1 - Validate "Travel Update Center" Dropdown Functionality
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Click on "Travel Update Center" dropdown (located on header - top left)
     * 5 - Verify dropdown functionality
     */
    @Test (priority = 0)
    public static void testDropdownFunctionalityTravelUpdateCenter() {
        getInItElement();
        travelUpdateCenterPage.clickDropdownTravelUpdateCenter();
        Assert.assertTrue(isElementPresent(travelUpdateCenterPage.getButtonTravelUpdateCenter()));
    }

    /**
     * Test Case 2 - Validate "Travel Update Center Dropdown" List Count
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Click on "Travel Update Center" dropdown (located on header - top left)
     * 6 - Verify number of list items
     */
    @Test (priority = 1)
    public static void testListCountDropdownTravelUpdateCenter() throws IOException {
        getInItElement();
        travelUpdateCenterPage.clickDropdownTravelUpdateCenter();

        Assert.assertTrue(compareListSizeToExpectedCount(By.cssSelector(getWebElementListTravelUpdateCenterDropdown()),
                path, "TUC Dropdown List Count"));
    }

    /**
     * Test Case 3 - Validate "Travel Update Center Dropdown" List Item Names
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Click on "Travel Update Center" dropdown (located on header - top left)
     * 5 - Verify name of each list item
     */
    // ASK ABOUT ’ CHARACTER
    @Test (priority = 2)
    public static void testListNamesDropdownTravelUpdateCenter() throws IOException {
        getInItElement();
        travelUpdateCenterPage.clickDropdownTravelUpdateCenter();

        Assert.assertTrue(compareWebElementListToExpectedStringArray(By.cssSelector(getWebElementListTravelUpdateCenterDropdown()),
                path, "TUC Dropdown List Names"));
    }

    /**
     * Test Case 4 - Validate "Travel Update Center Dropdown" List - "Ways We're Keeping You Safe" submenu count
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Click on "Travel Update Center" dropdown (located on header - top left)
     * 5 - Click on "Ways We're Keeping You Safe"
     * 6 - Verify the name of each submenu list items
     */
    @Test (priority = 3)
    public static void testSubmenuListNamesTUCDropdownWaysWereKeepingYouSafe() throws IOException {
        getInItElement();
        travelUpdateCenterPage.clickDropdownTravelUpdateCenterAndWaysWereKeepingYouSafe();

        Assert.assertTrue(compareWebElementListToExpectedStringArray(By.cssSelector(getWebElementListWaysWereKeepingYouSafe()),
                path, "TUC - WWKYS Submenu Names"));
    }

    /**
     * Test Case 5 - Validate "Travel Update Center Dropdown" List - "From Delta to Our Customers" submenu item names
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Click on "Travel Update Center" dropdown (located on header - top left)
     * 5 - Click on "From Delta to Our Customers"
     * 6 - Verify the name of each submenu list items
     */
    @Test (priority = 4)
    public static void testSubmenuListNamesTUCDropdownFromDeltaToOurCustomers() throws IOException {
        getInItElement();
        travelUpdateCenterPage.clickDropdownTravelUpdateCenterAndFromDeltaToOurCustomers();

        Assert.assertTrue(compareWebElementListToExpectedStringArray(By.cssSelector(getWebElementListFromDeltaToOurCustomers()),
                path, "TUC - FDTOC Submenu Names"));
    }

    /**
     * Test Case 6 - Validate "Travel Update Center Dropdown" List - "Flying? What You Need to Know" submenu item names
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Click on "Travel Update Center" dropdown (located on header - top left)
     * 5 - Click on "Flying? What You Need to Know"
     * 6 - Verify the name of each submenu list items
     */
    @Test (priority = 5)
    public static void testSubmenuListNamesTUCDropdownFlyingWhatYouNeedToKnow() throws IOException {
        getInItElement();
        travelUpdateCenterPage.clickDropdownTravelUpdateCenterAndFlyingWhatYouNeedToKnowSubmenu();

        Assert.assertTrue(compareWebElementListToExpectedStringArray(By.cssSelector(getWebElementListFlyingWhatYouNeedToKnow()),
                path, "TUC - FWYNTK Submenu Names"));
    }

    /**
     * Test Case 7 - Validate names of each section within "Coronavirus Update Center"
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Verify the title of each section within the "Coronavirus Update Center" grid
     */
    @Test (priority = 6)
    public static void testGridHeaderNamesCoronavirusUpdateCenter() throws IOException {
        getInItElement();
        travelUpdateCenterPage.waitToBeVisibleCoronavirusUpdateCenter();

        Assert.assertTrue(compareWebElementListToExpectedStringArray(By.cssSelector(getWebElementListCoronavirusUpdateCenterGridHeaders()),
                path, "CUC - Grid Header Names"));
    }

    /**
     * Test Case 8 - Validate names of each item under "Travel Flexibility" grid ("Coronavirus Update Center" grid)
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Verify the name of each list item under "Travel Flexibility" grid, which resides under "Coronavirus Update Center"
     */
    @Test (priority = 7)
    public static void testListNamesTravelFlexibility() throws IOException {
        getInItElement();
        travelUpdateCenterPage.waitToBeVisibleTravelFlexibility();

        Assert.assertTrue(compareWebElementListToExpectedStringArray(By.cssSelector(getWebElementListTravelFlexibility()),
                path, "CUC - TravelFlexibility Names"));
    }

    /**
     * Test Case 9 - Validate URL of each item under "Travel Flexibility" grid ("Coronavirus Update Center" grid)
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Verify URL of each list item under "Travel Flexibility" grid ("Coronavirus Update Center" grid)
     */
    @Test (priority = 8)
    public static void testURLsTravelFlexibility() throws IOException {
        getInItElement();
        travelUpdateCenterPage.waitToBeVisibleURLsTravelFlexibility();

        Assert.assertTrue(compareAttributeListToExpectedStringArray(By.cssSelector(getWebElementListTravelFlexibility()),
                "href", path, "CUC - TravelFlexibility URLs"));
    }

    /**
     * Test Case 10 - Validate names of each item under "Traveling With Us" grid ("Coronavirus Update Center" grid)
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Verify the name of each list item under "Traveling With Us" grid, which resides under "Coronavirus Update Center"
     */
    @Test (priority = 9)
    public static void testListNamesTravelingWithUs() throws IOException {
        getInItElement();
        travelUpdateCenterPage.waitToBeVisibleTravelingWithUs();

        Assert.assertTrue(compareWebElementListToExpectedStringArray(By.cssSelector(getWebElementListTravelingWithUs()),
                path, "CUC - TravelingWithUs Names"));
    }

    /**
     * Test Case 11 - Validate URL of each item under "Traveling With Us" grid ("Coronavirus Update Center" grid)
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Verify URL of each list item under "Traveling With Us" grid, which resides under "Coronavirus Update Center"
     */
    @Test (priority = 10)
    public static void testURLsTravelingWithUs() throws IOException {
        getInItElement();
        travelUpdateCenterPage.waitToBeVisibleURLsTravelingWithUs();

        Assert.assertTrue(compareAttributeListToExpectedStringArray(By.cssSelector(getWebElementListTravelingWithUs()),
                "href", path, "CUC - TravelingWithUs URLs"));
    }

    /**
     * Test Case 12 - Validate names of each item under "Caring For You" grid ("Coronavirus Update Center" grid)
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Verify the name of each list item under "Caring For You" grid, which resides under "Coronavirus Update Center"
     */
    @Test (priority = 11)
    public static void testListNamesCaringForYou() throws IOException {
        getInItElement();
        travelUpdateCenterPage.waitToBeVisibleCaringForYou();

        Assert.assertTrue(compareWebElementListToExpectedStringArray(By.cssSelector(getWebElementListCaringForYou()),
                path, "CUC - CaringForYou Names"));
    }

    /**
     * Test Case 13 - Validate URL of each item under "Caring For You" grid ("Coronavirus Update Center" grid)
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Verify URL of each list item under "Caring For You" grid, which resides under "Coronavirus Update Center"
     */
    @Test (priority = 12)
    public static void testURLsCaringForYou() throws IOException {
        getInItElement();
        travelUpdateCenterPage.waitToBeVisibleURLsGridCaringForYou();

        Assert.assertTrue(compareAttributeListToExpectedStringArray(By.cssSelector(getWebElementListCaringForYou()),
                "href", path, "CUC - CaringForYou URLs"));
    }

    /**
     * Test Case 14 - Validate functionality of "Show All Recent Coronavirus Updates" Accordion
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Scroll down (below FAQ section) and click on "Show All Recent Coronavirus Updates"
     * 5 - Validate that the accordion menu expands
     */
    @Test (priority = 13)
    public static void testAccordionFunctionalityShowAllRecentCoronavirusUpdates() {
        getInItElement();
        travelUpdateCenterPage.clickAccordionShowAllRecentCoronavirusUpdates();

        Assert.assertTrue(isElementPresent(travelUpdateCenterPage.getButtonExpandedAccordionShowAllCoronavirusRecentUpdates()));
    }

    /**
     * Test Case 15 - Validate all URLs contained within "Show All Recent Coronavirus Updates" expanded menu
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Scroll down (below FAQ section) and click on "Show All Recent Coronavirus Updates"
     * 5 - Validate all URLs contained within expanded menu
     */
    @Test (priority = 14)
    public static void testURLsShowAllRecentCoronavirusUpdates() throws IOException {
        getInItElement();
        travelUpdateCenterPage.clickAccordionDropdownShowAllRecentCoronavirusUpdates();

        Assert.assertTrue(compareWebElementListToExpectedStringArray(By.xpath(getWebElementListShowAllRecentCoronavirusUpdatesLinks()),
                path, "SARCU - URLs"));
    }

    /**
     * Test Case 16 - Validate "Other Updates and Travel Tips" Grid Header Names
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Scroll down to "Other Updates and Travel Tips"
     * 5 - Verify the header name within each grid
     */
    @Test (priority = 15)
    public static void testHeaderNamesOtherUpdatesAndTravelTips() throws IOException {
        getInItElement();
        travelUpdateCenterPage.waitToBeVisibleContainerOtherUpdatesAndTravelTips();

        Assert.assertTrue(compareWebElementListToExpectedStringArray(By.cssSelector(getWebElementListOtherUpdatesAndTravelTipsHeaderTitles()),
                path, "OUATT - Header Names"));
    }

    /**
     * Test Case 17 - Validate Navigation to "Delta Sky Club Updates" - "Other Updates and Travel Tips" Container
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Scroll down to "Other Updates and Travel Tips"
     * 5 - Click "Delta Sky Club Updates"
     * 6 - Verify URL of page you are navigated to
     */
    @Test (priority = 16)
    public static void testNavigationToDeltaSkyClubUpdates() throws IOException{
        getInItElement();
        String actualURL = travelUpdateCenterPage.validateDeltaSkyClubUpdatesURLNav();

        Assert.assertTrue(compareTextToExpectedString(actualURL, path, "OUATT - DeltaSkyClub URL"));
    }

    /**
     * Test Case 18 - Validate Navigation to "Download The Fly Delta App" - "Other Updates and Travel Tips" Container
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Scroll down to "Other Updates and Travel Tips"
     * 5 - Click "Download The Fly Delta App"
     * 6 - Verify URL of page you are navigated to
     */
    @Test (priority = 17)
    public static void testNavigationToDownloadTheFlyDeltaApp() throws IOException {
        getInItElement();
        travelUpdateCenterPage.clickDownloadTheFlyDeltaApp();

        Assert.assertTrue(switchToTabAndCompareURL(path, "OUATT - FlyDeltaApp URL"));
    }

    /**
     * Test Case 19 - Validate Navigation to "Flying With A Partner Airline?" - "Other Updates and Travel Tips" Container
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Scroll down to "Other Updates and Travel Tips"
     * 5 - Click "Flying With A Partner Airline?"
     * 6 - Verify URL of page you are navigated to
     */
    @Test (priority = 18)
    public static void testNavigationToFlyingWithAPartnerAirline() throws IOException {
        getInItElement();
        String actualURL = travelUpdateCenterPage.clickFlyingWithAPartnerAirline();

        Assert.assertTrue(compareTextToExpectedString(actualURL, path, "OUATT - FlyingPartnerAir URL"));
    }

    /**
     * Test Case 20 - Validate "Frequently Asked Questions" Grid Header Titles
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Scroll down to "Frequently Asked Questions" container
     * 5 - Verify name of each grid header title
     */
    @Test (priority = 19)
    public static void testHeaderNamesFrequentlyAskedQuestions() throws IOException {
        getInItElement();
        travelUpdateCenterPage.waitToBeVisibleFrequentlyAskedQuestionsContainerHeaderNames();

        Assert.assertTrue(compareWebElementListToExpectedStringArray(By.cssSelector(getWebElementListFrequentlyAskedQuestionsHeaderTitles()),
                path, "FAQ Header Names"));
    }
}
