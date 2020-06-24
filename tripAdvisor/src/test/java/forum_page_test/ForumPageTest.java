package forum_page_test;

import commonAPI.WebAPI;
import forum_page.ForumPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForumPageTest extends WebAPI {

    static ForumPage forumPage;

    public void forumPageInIt() {

        forumPage = PageFactory.initElements(driver, ForumPage.class);

    }

    @Test(priority = 1)
    public void testForumPageUrl() throws InterruptedException {
        forumPageInIt();

        String actualUrl = forumPage.validateForumPageUrl();
        String expectedUrl = "https://www.tripadvisor.com/ForumHome";
        Assert.assertEquals(actualUrl, expectedUrl, "Expected url not found");
    }

    @Test(priority = 2)
    public void testForumPageTitle() {
        forumPageInIt();
        String actualTitle = forumPage.validateForumPageTitle();
        String expectedTitle = "Tripadvisor: Read Reviews, Compare Prices & Book";
        Assert.assertEquals(actualTitle, expectedTitle, "expected title not found");
    }

    @Test(priority = 3)
    public void testAirlinesLinkIsDisplayed() {
        forumPageInIt();
        boolean actualValue = forumPage.validateAirlinesLinkIsDisplayed();
        Assert.assertEquals(actualValue, true);
    }

    @Test(priority = 4)
    public void testAirlinesLinkPageTitle() {
        forumPageInIt();
        String actualTitle = forumPage.validateAirlinesLinkPageTitle();
        String expectedTitle = "Browse all Airlines and Airline Reviews - Tripadvisor";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(priority = 5)
    public void testTravelForumLinkIsDisplayed() {
        forumPageInIt();
        boolean actualValue = forumPage.validateTravelForumLinkIsDisplayed();
        Assert.assertEquals(actualValue, true);


    }

    @Test(priority = 6)
    public void testTravelForumLinkPageTitle() {
        forumPageInIt();
        String actualTitle = forumPage.validateTravelForumLinkPageTitle();
        String expectedTitle = "Travel Forum, Discussion Board for Talk and Chat - Tripadvisor";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(priority = 7)
    public void testBestOf2020LinkIsDisplayed() {
        forumPageInIt();
        boolean actualValue = forumPage.validateBestOf2020LinkIsDisplayed();
        Assert.assertEquals(actualValue, true);


    }

    @Test(priority = 8)
    public void testBestOf2020LinkPageTitle() {
        forumPageInIt();
        String actualTitle = forumPage.validateBestOfLinkPageTitle();
        String expectedTitle = "Travelers' Choice - Tripadvisor - Best Airlines, Beaches, Family Vacations, Hotels & Destinations";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(priority = 9)
    public void testRoadTripsLinkIsDisplayed() {
        forumPageInIt();
        boolean actualValue = forumPage.validateRoadTripsLinkIsDisplayed();
        Assert.assertEquals(actualValue, true);


    }

    @Test(priority = 10)
    public void testRoadTripsLinkPageTitle() {
        forumPageInIt();
        String actualTitle = forumPage.validateRoadTripsLinkPageTitle();
        String expectedTitle = "The Best Road Trips in America - Tripadvisor";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(priority = 11)
    public void testHelpCenterLinkIsDisplayed() {
        forumPageInIt();
        boolean actualValue = forumPage.validateHelpCenterLinkIsDisplayed();
        Assert.assertEquals(actualValue, true);

    }

    @Test(priority = 12)
    public void testAirlinesLinkPageUrl() {
        forumPageInIt();
        String actualUrl = forumPage.validateAirlinesLinkPageUrl();
        String expectedUrl = "https://www.tripadvisor.com/Airlines";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Test(priority = 13)
    public void testTravelForumLinkPageSource() {
        forumPageInIt();
        String actualSource = forumPage.validateTravelForumLinkPageTitle();
        String expectedSource = "Travel Forum, Discussion Board for Talk and Chat - Tripadvisor";
        Assert.assertEquals(actualSource, expectedSource);
    }

    @Test(priority = 14)
    public void testTravelForumLinkPageUrl() {
        forumPageInIt();
        String actualUrl = forumPage.validateTravelForumLinkPageUrl();
        String expectedUrl = "https://www.tripadvisor.com/ForumHome";
        Assert.assertEquals(actualUrl, expectedUrl, "Expected URL not found");
    }

    @Test(priority = 15)
    public void testBestOf2020LinkPageSource() {
        forumPageInIt();
        String actualSource = forumPage.validateBestOfLinkPageTitle();
        String expectedSource = "Travelers' Choice - Tripadvisor - Best Airlines, Beaches, Family Vacations, Hotels & Destinations";
        Assert.assertEquals(actualSource, expectedSource, "Page Source not found");
    }

    @Test(priority = 16)
    public void testRoadTripsLinkPageUrl() {
        forumPageInIt();
        String actualUrl = forumPage.validateRoadTripsLinkPageUrl();
        String expectedUrl = "https://www.tripadvisor.com/RoadTrip-g191-United_States.html";
        Assert.assertEquals(actualUrl, expectedUrl, "Expected page Url not found");
    }
}