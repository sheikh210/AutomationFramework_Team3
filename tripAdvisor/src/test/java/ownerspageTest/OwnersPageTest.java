package ownerspageTest;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import ownerspage.OwnersPage;
import utilities.DataReader;

import java.io.IOException;

import static ownerspage.OwnersPageElements.*;

public class OwnersPageTest extends WebAPI {

    static OwnersPage ownersPage;
    static SoftAssert softAssert = new SoftAssert();
    static DataReader dataReader = new DataReader();
    static String path = System.getProperty("user.dir")+"\\src\\main\\resources" +
            "\\TripAdvisor_OwnersPage_ExpectedElements.xlsx";

    public static void getInItElements() {
        ownersPage = PageFactory.initElements(driver, OwnersPage.class);
    }


    /**
     * Test Case 1 - Validate Header Bar - Names
     * 1 - Navigate to http://tripadvisor.com
     * 2 - In footer, under "Do Business With Us", click "Owners"
     * 3 - Verify the name of each header bar item
     */
    @Test (priority = 0)
    public static void testHeaderNames() throws IOException {
        getInItElements();
        ownersPage.navigateToOwnersPage();

        // Validate the button names
        System.out.println("Buttons:");
        softAssert.assertTrue(compareWebElementListToExpectedStringArray(By.cssSelector(getWebElementListButtonsHeaderBar()),
                path, "HeaderBar ButtonNames"));

        // Validate the dropdown names
        System.out.println("Dropdowns:");
        softAssert.assertTrue(compareWebElementListToExpectedStringArray(By.cssSelector(getWebElementListDropdownsHeaderBar()),
                path, "HeaderBar DropdownNames"));

        softAssert.assertAll();
    }

    /**
     * Test Case 2 - Validate "Products" Dropdown List Items
     * 1 - Navigate to http://tripadvisor.com
     * 2 - In footer, under "Do Business With Us", click "Owners"
     * 3 - Hover over "Products" in header bar
     * 4 - Verify the name of each item within the dropdown
     */
    @Test (priority = 1)
    public static void testNamesProductDropdown() throws IOException {
        getInItElements();
        ownersPage.hoverOverProductsDropdown();

        Assert.assertTrue(compareWebElementListToExpectedStringArray(By.cssSelector(getWebElementListDropdownNamesProducts()),
                path, "ProductsDropdown Names"));
    }

    /**
     * Test Case 3 - Validate Navigation to Each Link Under "Products" Dropdown
     * 1 - Navigate to http://tripadvisor.com
     * 2 - In footer, under "Do Business With Us", click "Owners"
     * 3 - Hover over "Products" in header bar
     * 4 - Click each list item
     * 5 - Verify URL of each page user is navigated to
     */
    @Test (priority = 2)
    public static void testNavigationProductDropdownLinks() throws IOException, InterruptedException {
        getInItElements();
        ownersPage.hoverOverProductsDropdown();

        Assert.assertTrue(clickLinksSwitchTabsCompareURLs(By.cssSelector(getWebElementListDropdownLinksProducts()),
                path, "ProductsDropdown URLs"));
    }

    /**
     * Test Case 4 - Validate "Reviews" Dropdown List Items
     * 1 - Navigate to http://tripadvisor.com
     * 2 - In footer, under "Do Business With Us", click "Owners"
     * 3 - Hover over "Reviews" in header bar
     * 4 - Verify the name of each item within the dropdown
     */
    @Test (priority = 3)
    public static void testNamesReviewsDropdown() throws IOException {
        getInItElements();
        ownersPage.hoverOverReviewsDropdown();

        Assert.assertTrue(compareWebElementListToExpectedStringArray(By.cssSelector(getWebElementListDropdownNamesReviews()),
                path, "ReviewsDropdown Names"));
    }

    /**
     * Test Case 5 - Validate Navigation to Each Link Under "Reviews" Dropdown
     * 1 - Navigate to http://tripadvisor.com
     * 2 - In footer, under "Do Business With Us", click "Owners"
     * 3 - Hover over "Reviews" in header bar
     * 4 - Click each list item
     * 5 - Verify URL of each page user is navigated to
     */
    @Test (priority = 4)
    public static void testNavigationReviewsDropdownLinks() throws IOException, InterruptedException {
        getInItElements();
        ownersPage.hoverOverReviewsDropdown();

        Assert.assertTrue(clickLinksSwitchTabsCompareURLs(By.cssSelector(getWebElementListDropdownLinksReviews()),
                path, "ReviewsDropdown URLs"));
    }

    /**
     * Test Case 6 - Validate "Marketing Tools" Dropdown List Items
     * 1 - Navigate to http://tripadvisor.com
     * 2 - In footer, under "Do Business With Us", click "Owners"
     * 3 - Hover over "Marketing Tools" in header bar
     * 4 - Verify the name of each item within the dropdown
     */
    @Test (priority = 5)
    public static void testNamesMarketingToolsDropdown() throws IOException {
        getInItElements();
        ownersPage.hoverOverMarketingToolsDropdown();

        Assert.assertTrue(compareWebElementListToExpectedStringArray(By.cssSelector(getWebElementListDropdownNamesMarketingTools()),
                path, "MktgToolsDropdown Names"));
    }

    /**
     * Test Case 7 - Validate Navigation to Each Link Under "Marketing Tools" Dropdown
     * 1 - Navigate to http://tripadvisor.com
     * 2 - In footer, under "Do Business With Us", click "Owners"
     * 3 - Hover over "Marketing Tools" in header bar
     * 4 - Click each list item
     * 5 - Verify URL of each page user is navigated to
     */
    @Test (priority = 6)
    public static void testNavigationMarketingToolsDropdownLinks() throws IOException, InterruptedException {
        getInItElements();
        ownersPage.hoverOverMarketingToolsDropdown();

        Assert.assertTrue(clickLinksSwitchTabsCompareURLs(By.cssSelector(getWebElementListDropdownLinksMarketingTools()),
                path, "MktgToolsDropdown URLs"));
    }

    /**
     * Test Case 8 - Validate "Help" Dropdown List Items
     * 1 - Navigate to http://tripadvisor.com
     * 2 - In footer, under "Do Business With Us", click "Owners"
     * 3 - Hover over "Help" in header bar
     * 4 - Verify the name of each item within the dropdown
     */
    @Test (priority = 7)
    public static void testNamesHelpDropdown() throws IOException {
        getInItElements();
        ownersPage.hoverOverHelpDropdown();

        Assert.assertTrue(compareWebElementListToExpectedStringArray(By.cssSelector(getWebElementListDropdownNamesHelp()),
                path, "HelpDropdown Names"));
    }

    /**
     * Test Case 9 - Validate Navigation to Each Link Under "Help" Dropdown
     * 1 - Navigate to http://tripadvisor.com
     * 2 - In footer, under "Do Business With Us", click "Owners"
     * 3 - Hover over "Help" in header bar
     * 4 - Click each list item
     * 5 - Verify URL of each page user is navigated to
     */
    @Test (priority = 8)
    public static void testNavigationHelpDropdownLinks() throws IOException, InterruptedException {
        getInItElements();
        ownersPage.hoverOverHelpDropdown();

        Assert.assertTrue(clickLinksSwitchTabsCompareURLs(By.cssSelector(getWebElementListDropdownLinksHelp()),
                path, "HelpDropdown URLs"));
    }

    /**
     * Test Case 10 - Validate "Location" Search Box Functionality
     * 1 - Navigate to http://tripadvisor.com
     * 2 - In footer, under "Do Business With Us", click "Owners"
     * 3 - In "Location" input box, type "New York"
     * 4 - Verify there are 8 search results shown
     */
    @Test (priority = 9)
    public static void testResultsCountLocationInputBox() throws IOException {
        getInItElements();
        ownersPage.sendKeysToLocationSearchBox();

        Assert.assertTrue(compareListSizeToExpectedCount(By.cssSelector(getWebElementListNamesSearchResultsLocation()),
                path, "SearchResult Count"));
    }

    /**
     * Test Case 11 - Validate "Location" Results
     * 1 - Navigate to http://tripadvisor.com
     * 2 - In footer, under "Do Business With Us", click "Owners"
     * 3 - In "Location" input box, type "New York"
     * 4 - Verify the name of each city shown in search results
     */
    @Test (priority = 10)
    public static void testResultNamesLocationInputBox() throws IOException {
        getInItElements();
        ownersPage.sendKeysToLocationSearchBox();

        Assert.assertTrue(compareWebElementListToExpectedStringArray(By.cssSelector(getWebElementListNamesSearchResultsLocation()),
                path, "Location SearchResult Names"));
    }

    /**
     * Test Case 12 - Validate "Location" Result Select
     * 1 - Navigate to http://tripadvisor.com
     * 2 - In footer, under "Do Business With Us", click "Owners"
     * 3 - In "Business Name" input box, type "New York"
     * 4 - If the first search result option is "New York City", click on it
     * 5 - Verify "Location" input box is populated with "New York, United States"
     */
    @Test (priority = 11)
    public static void testResultSelectLocationInputBox() throws IOException {
        getInItElements();
        ownersPage.sendKeysToLocationSearchBox();

        Assert.assertTrue(compareTextToExpectedString(ownersPage.selectAndVerifySearchResultLocationSearchBox(),
                path, "Location ResultSelect"));
    }

    /**
     * Test Case 13 - Validate "Business Name" Search Box Functionality
     * 1 - Navigate to http://tripadvisor.com
     * 2 - In footer, under "Do Business With Us", click "Owners"
     * 3 - In "Location" input box, type "New York"
     * 4 - Select "New York City" (1st option)
     * 5 - In "Business Name" input box, type "Museum"
     * 6 - Verify there are 8 search results shown
     */
    @Test (priority = 12)
    public static void testResultsCountBusinessNameInputBox() throws IOException {
        getInItElements();
        ownersPage.sendKeysToBusinessNameSearchBox();

        Assert.assertTrue(compareListSizeToExpectedCount(By.cssSelector(getWebElementListNamesSearchResultsBusinessName()),
                path, "SearchResult Count"));
    }

    /**
     * Test Case 14 - Validate "Business Name" Search Results
     * 1 - Navigate to http://tripadvisor.com
     * 2 - In footer, under "Do Business With Us", click "Owners"
     * 3 - In "Business Name" input box, type "Museum"
     * 4 - Verify the name of each business shown in search results
     */
    @Test (priority = 13)
    public static void testResultsNamesBusinessNameInputBox() throws IOException {
        getInItElements();
        ownersPage.sendKeysToBusinessNameSearchBox();

        Assert.assertTrue(compareWebElementListToExpectedStringArray(By.cssSelector(getWebElementListNamesSearchResultsBusinessName()),
                path, "BizName SearchResults Names"));
    }

    /**
     * Test Case 15 - Validate "Business Name" Result Select
     * 1 - Navigate to http://tripadvisor.com
     * 2 - In footer, under "Do Business With Us", click "Owners"
     * 3 - In "Location" input box, type "New York"
     * 4 - Select "New York City" (1st option)
     * 5 - In "Business Name" input box, type "Museum"
     * 6 - Click on box containing "American Museum of Natural History"
     * 7 - Verify user is navigated to business listing detail page by capturing business name text
     */
    @Test (priority = 14)
    public static void testResultSelectBusinessNameInputBox() throws IOException {
        getInItElements();
        ownersPage.sendKeysToBusinessNameSearchBox();
        ownersPage.selectSearchResultBusinessNameSearchBox();

        compareTextToExpectedString(ownersPage.verifyNavigationToClaimListingPage(), path, "ClaimListingPage Title");
    }



}
