package protectYourEnterprisePageTest;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import protectYourEnterprisePage.ProtectYourEnterprisePage;
import utilities.DataReader;

import java.io.IOException;

import static protectYourEnterprisePage.ProtectYourEnterprisePageElements.*;


public class ProtectYourEnterprisePageTest extends WebAPI {

    static ProtectYourEnterprisePage protectYourEnterprisePage;
    static String path = System.getProperty("user.dir")+"\\src\\main\\resources\\" +
            "VerizonWireless_ProtectYourEnterprisePage_ExpectedElements.xlsx";
    static DataReader dataReader = new DataReader();

    public static void getInItElements() {
        protectYourEnterprisePage = PageFactory.initElements(driver, ProtectYourEnterprisePage.class);
    }

    /**
     * TEST CASE 1 - Navigate to "Protect Your Enterprise From Threats" Page
     * 1. Navigate to http://verizonwireless.com
     * 2. Click "Business" button in header
     * 3. Click "Enterprise" button in header
     * 4. If pop-up is displayed, close pop-up.
     * 5. If pop-up is not displayed, scroll down and click "Protect Your Enterprise From Threats" box
     * 6. Verify image text is correct
     */
    @Test (priority = 0)
    public static void testNavToPage() throws Exception {
        getInItElements();
        Assert.assertEquals(protectYourEnterprisePage.navigateToProtectYourEnterprisePage(),
                dataReader.fileReaderStringXSSF(path, "PageConfirmText")[0]);
    }

    /**
     * TEST CASE 2 - Validate number of list items contained in "Protect your enterprise from threats" dropdown
     * 1. Navigate to "Protect Your Enterprise" page
     * 2. Hover over "Protect your enterprise from threats" dropdown
     * 3. Verify number of list items contained within dropdown
     */
    @Test (priority = 1)
    public static void testProtectEnterpriseDropdownListCount() throws IOException {
        getInItElements();
        protectYourEnterprisePage.hoverProtectEnterpriseDropdown();

        Assert.assertTrue(compareListSizeToExpectedCount(By.xpath(getWebElementsListDropdownProtectEnterprise()),
                path, "DropdownProtectEnt Count"));
    }

    /**
     * TEST CASE 3 - Validate name of each list item contained in "Protect your enterprise from threats" dropdown
     * 1. Navigate to "Protect Your Enterprise" page
     * 2. Hover over "Protect your enterprise from threats" dropdown
     * 3. Verify name of each list item contained within dropdown
     */
    @Test (priority = 2)
    public static void testProtectEnterpriseDropdownListItemNames() throws IOException {
        getInItElements();
        protectYourEnterprisePage.hoverProtectEnterpriseDropdown();

        Assert.assertTrue(compareAttributeListToExpectedStringArray(By.xpath(getWebElementsListDropdownProtectEnterprise()),
                "innerHTML", path, "DropdownProtectEnt Names"));
    }

    /**
     * TEST CASE 4 - Validate navigation to URL of each list item contained in "Protect your enterprise from threats" dropdown
     * 1. Navigate to "Protect Your Enterprise" page
     * 2. Hover over "Protect your enterprise from threats" dropdown
     * 3. Click on each list item contained within dropdown, capture and verify each URL
     */
    @Test (priority = 3)
    public static void testProtectEnterpriseDropdownListItemNav() throws IOException, InterruptedException {
        getInItElements();
        protectYourEnterprisePage.hoverProtectEnterpriseDropdown();

        Assert.assertTrue(clickLinksSwitchTabsCompareURLs(protectYourEnterprisePage.getDropdownProtectEnterprise(),
                By.xpath(getWebElementsListDropdownProtectEnterprise()),
                path, "DropdownProtectEnt URLs"));
    }

    /**
     * TEST CASE 5 - Validate the name of each item on the sticky Navigation Bar (located under page image)
     * 1. Navigate to "Protect Your Enterprise" page
     * 2. Verify the name of each section contained within navigation bar, under the main page image
     */
    @Test (priority = 4)
    public static void testNamesPageNavBar() throws IOException {
        getInItElements();
        protectYourEnterprisePage.navigateToProtectYourEnterprisePage();

        Assert.assertTrue(compareAttributeListToExpectedStringArray(By.cssSelector(getWebElementsListPageNavBar()),
                "innerHTML", path, "NavBar Names"));
    }

    /**
     * TEST CASE 6 - Validate titles of first section (below nav bar)
     * 1. Navigate to "Protect Your Enterprise" page
     * 2. Verify the title of each section below the nav bar
     */
    @Test (priority = 5)
    public static void testTitlesGridContainerOne() throws IOException {
        getInItElements();
        protectYourEnterprisePage.navigateToProtectYourEnterprisePage();

        Assert.assertTrue(compareWebElementListToExpectedStringArray(By.cssSelector(getWebElementsTextTitlesGridContainerOne()),
                path, "GridContainerOne Titles"));
    }

    /**
     * TEST CASE 7 - Validate body text of first grid container section (below nav bar)
     * 1. Navigate to "Protect Your Enterprise" page
     * 2. Verify the body text of each section below the nav bar
     */
    @Test (priority = 6)
    public static void testTextGridContainerOne() throws IOException {
        getInItElements();
        protectYourEnterprisePage.navigateToProtectYourEnterprisePage();

        SoftAssert softAssert = new SoftAssert();

        // Section 1
        softAssert.assertTrue(compareWebElementListToExpectedStringArray(By.cssSelector(getWebElementTextBodyGridContainerOneSectionOne()),
                path, "GridContainerOne Sec1 Body"));
        // Section 2
        softAssert.assertTrue(compareWebElementListToExpectedStringArray(By.cssSelector(getWebElementTextBodyGridContainerOneSectionTwo()),
                path, "GridContainerOne Sec2 Body"));

        softAssert.assertAll();
    }

    /**
     * TEST CASE 8 - Validate "Contact Us" button
     * 1. Navigate to "Protect Your Enterprise" page
     * 2. Click on "Contact Us" button (above YouTube video iFrame)
     * 3. Verify pageURL of "Contact Us" page
     */
    @Test (priority = 7)
    public static void testContactUsButton () throws IOException {
        getInItElements();

        Assert.assertTrue(compareTextToExpectedString(protectYourEnterprisePage.validateURLButtonContactUs(),
                path, "ContactUs URL"));
    }

    /**
     * TEST CASE 9 -Validate YouTube Player
     *  1. Navigate to "Protect Your Enterprise" page
     *  2. Scroll down to embedded YouTube video frame
     *  3. Verify that user can click play button to play YouTube video
     */

    @Test (priority = 8)
    public static void testYouTubePlayer() throws InterruptedException {
        getInItElements();
        protectYourEnterprisePage.clickYouTubePlayer();
    }

    /**
     * TEST CASE 10 - Validate titles of each expandable stack container (under YouTube iFrame)
     * 1. Navigate to "Protect Your Enterprise" page
     * 2. Scroll down below embedded YouTube video frame
     * 3. Verify title of each expandable stack container section
     */

    @Test (priority = 9)
    public static void testTitlesExpandableStackContainers() throws IOException {
        getInItElements();
        protectYourEnterprisePage.navigateToProtectYourEnterprisePage();

        Assert.assertTrue(compareWebElementListToExpectedStringArray(By.cssSelector(getWebElementTextExpandStackContainers()),
               path, "ExpandStack Titles"));
    }

}
