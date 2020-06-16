package nbapage;

import commonAPI.WebAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utilities.DataReader;

import java.io.IOException;
import java.util.List;

import static nbapage.ESPNnbapageElements.*;

public class ESPNnbapage extends WebAPI {

    @FindBy(xpath = webElementnbapage)
            public WebElement nbaPage;

    @FindBy(xpath = webElementESPNPlusList)
            public WebElement espnPlusList;

    @FindBy(xpath = webElementQuickLinksList)
            public WebElement quickLinksList;

    @FindBy(xpath = webElementSubHeaderStatsList)
            public WebElement subHeaderStatsList;

    @FindBy(xpath = webElementStatsBox)
            public WebElement statsBox;

    @FindBy(xpath = webElementTeamsBox)
            public WebElement teamsBox;
    @FindBy(xpath = webElementSubHeaderTeams)
            public WebElement subHeaderTeams;

    @FindBy(xpath = webElementPodcastsList)
            public WebElement podcastsList;

    @FindBy(xpath = webElementFantasyList)
            public WebElement fantasyList;

    @FindBy(xpath = webElementESPNSitesList)
            public WebElement espnSitesList;

    @FindBy(xpath = webElementESPNAppsList)
            public WebElement espnAppsList;

    @FindBy(xpath = webElementFollowESPNList)
            public WebElement followESPNList;

    @FindBy(xpath = webElementTopEventsDropdown)
            public WebElement topEventsDropdown;

    @FindBy(css = webElementTopEventsDropdownMenu)
            public WebElement topEventsDropdownMenu;

    @FindBy(xpath = webElementESPNFooterList)
            public WebElement espnFooterList;


    @FindBy(css = webElementNBADropdown)
    public WebElement nbaDropdown;

    @FindBy(css = webElementNBADropdownMenuLeft)
    public WebElement nbaDropdownMenuLeft;


    DataReader dataReader = new DataReader();

    // helper method to direct to ESPN NBApage
    public void getNBApage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(nbaPage));
        clickOnElement(nbaPage);

    }

    public String validateNBApage() throws Exception {
        getNBApage();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlToBe(verifyNBApageUrl));
        String title = getCurrentPageTitle();
        System.out.println("Actual Page Title: " + title);
        return title;


    }

    public void validateESPNPlusLinkList() throws Exception {
        getNBApage();
        List<WebElement> espnLinkListArray = espnPlusList.findElements(By.xpath(webElementESPNPlusList));
        String[] expectedESPNPlusList = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") + "\\src\\main\\resources\\ESPNnbapageElements.xlsx", "ESPNPlusList");
        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < espnLinkListArray.size(); i++) {
            String actualText = espnLinkListArray.get(i).getText();
            System.out.println(actualText);
            String expectedESPNPlusListArray = expectedESPNPlusList[i];
            softAssert.assertEquals(actualText, expectedESPNPlusListArray, "ESPN+ List at index of " + i + " " + "Does not match");
        }
        softAssert.assertAll();

    }

    public void validateESPNQuickLinks() throws Exception {
        getNBApage();
        List<WebElement> espnQuickLinkArray = quickLinksList.findElements(By.xpath(webElementQuickLinksList));
        String[] expectedQuickLinksArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") + "\\src\\main\\resources\\ESPNnbapageElements.xlsx", "QuickLinksTitles");
        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < espnQuickLinkArray.size(); i++) {
            String actualText = espnQuickLinkArray.get(i).getText();
            System.out.println(actualText);
            String expectedQuickLinks = expectedQuickLinksArray[i];
            softAssert.assertEquals(actualText, expectedQuickLinks, "Quick Links at index of " + i + " " + "Does not match");

        }
        softAssert.assertAll();
    }

    public String getStatsListText(int a){
        List<WebElement> subHeaderStatsListArray = subHeaderStatsList.findElements(By.xpath(webElementSubHeaderStatsList));
            return subHeaderStatsListArray.get(a).getText();

    }

    public String validateStatsList(int x) throws Exception {
        String[] expectedStatsListArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") + "\\src\\main\\resources\\ESPNnbapageElements.xlsx", "StatsList");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(statsBox));
        mouseHover(statsBox);

        return expectedStatsListArray[x];
    }

    public void validateTeamsList() throws Exception {
        getNBApage();
        List<WebElement> teamListArray = subHeaderTeams.findElements(By.xpath(webElementSubHeaderTeams));
        String[] expectedTeamsArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") + "\\src\\main\\resources\\ESPNnbapageElements.xlsx", "TeamCategories");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(teamsBox));
        mouseHover(teamsBox);
        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < teamListArray.size(); i++) {
            String actualText = teamListArray.get(i).getText();
            System.out.println(actualText);
            String expectedTeamList = expectedTeamsArray[i];
            softAssert.assertEquals(actualText, expectedTeamList, "Team Categories at index of " + i + " " + "Does not match");

        }
        softAssert.assertAll();
    }

    public void validatePodcastsList() throws Exception {
        getNBApage();
        List<WebElement> podcastListArray = podcastsList.findElements(By.xpath(webElementPodcastsList));
        String[] expectedPodcastArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") + "\\src\\main\\resources\\ESPNnbapageElements.xlsx", "PodcastsTitles");
        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < podcastListArray.size(); i++) {
            String actualText = podcastListArray.get(i).getText();
            System.out.println(actualText);
            String expectedPodcastsList = expectedPodcastArray[i];
            softAssert.assertEquals(actualText, expectedPodcastsList ,"Podcasts title at index of " + i + " " + "Does not match");

        }
        softAssert.assertAll();
    }

    public void validateFantasyList() throws Exception {
        getNBApage();
        List<WebElement> fantasyListArray = fantasyList.findElements(By.xpath(webElementFantasyList));
        String[] expectedFantasyArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") + "\\src\\main\\resources\\ESPNnbapageElements.xlsx", "FantasyTitles");
        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < fantasyListArray.size(); i++) {
            String actualText = fantasyListArray.get(i).getText();
            System.out.println(actualText);
            String expectedFantasyList = expectedFantasyArray[i];
            softAssert.assertEquals(actualText, expectedFantasyList ,"Fantasy title at index of " + i + " " + "Does not match");

        }
        softAssert.assertAll();
    }

    /**
     * Test Case 8:Validate ESPN Sites list
     * 1. Navigate to espn.com
     * 2. Go to espn nba page
     * 3.Get the ESPN Sites title's list
     * 4. Validate that those ESPN Sites title's are displayed compare to titles stored in excel
     * @throws Exception
     */
    public void validateESPNSitesList() throws Exception {
        getNBApage();
        List<WebElement> espnSitesListArray = espnSitesList.findElements(By.xpath(webElementESPNSitesList));
        String[] expectedESPNSitesList = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") + "\\src\\main\\resources\\ESPNnbapageElements.xlsx", "ESPNSites");
        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < espnSitesListArray.size(); i++) {
            String actualText = espnSitesListArray.get(i).getText();
            System.out.println(actualText);
            String expectedESPNSitesArray = expectedESPNSitesList[i];
            softAssert.assertEquals(actualText, expectedESPNSitesArray ,"Fantasy title at index of " + i + " " + "Does not match");

        }
        softAssert.assertAll();
    }

    /**
     * Test Case 9:Validate ESPN Apps list
     * 1. Navigate to espn.com
     * 2. Go to espn nba page
     * 3.Get the ESPN Apps title's list
     * 4. Validate that those ESPN Apps title's are displayed compare to titles stored in excel
     * @throws Exception
     */
    public void validateESPNAppsList() throws Exception {
        getNBApage();
        List<WebElement> espnAppsListArray = espnAppsList.findElements(By.xpath(webElementESPNAppsList));
        String[] expectedESPNAppsList = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") + "\\src\\main\\resources\\ESPNnbapageElements.xlsx", "ESPNApps");
        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < espnAppsListArray.size(); i++) {
            String actualText = espnAppsListArray.get(i).getText();
            System.out.println(actualText);
            String expectedESPNAppsArray = expectedESPNAppsList[i];
            softAssert.assertEquals(actualText, expectedESPNAppsArray ,"Fantasy title at index of " + i + " " + "Does not match");

        }
        softAssert.assertAll();
    }

    /**
     * Test Case 10:Validate Follow ESPN list
     * 1. Navigate to espn.com
     * 2. Go to espn nba page
     * 3.Get the Follow ESPN title's list
     * 4. Validate that those Follow ESPN title's are displayed compare to titles stored in excel
     * @throws Exception
     */
    public void validateFollowESPNList() throws Exception {
        getNBApage();
        List<WebElement> followESPNListArray = followESPNList.findElements(By.xpath(webElementFollowESPNList));
        String[] expectedFollowESPNList = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") + "\\src\\main\\resources\\ESPNnbapageElements.xlsx", "FollowESPN");
        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < followESPNListArray.size(); i++) {
            String actualText = followESPNListArray.get(i).getText();
            System.out.println(actualText);
            String expectedFollowESPNArray = expectedFollowESPNList[i];
            softAssert.assertEquals(actualText, expectedFollowESPNArray ,"Fantasy title at index of " + i + " " + "Does not match");

        }
        softAssert.assertAll();
    }

    /**
     * Test Case 11 - Validate number of elements in "Top Events" dropdown menu list
     * 1 - Navigate to http://espn.com
     * 2 - Click on "Top Events" dropdown menu
     * 3 - Verify number of links present in "Top Events" dropdown menu
     */
    public int topEventsDropdownList() {
        mouseHover(topEventsDropdown);
        List<WebElement> topEventsDropDownList = getListOfWebElementsByXpath(topEventsDropdownMenu, webElementTopEventsDropdownMenuItems);
        int listSize = topEventsDropDownList.size();

        return listSize;
    }

    public void validateTopEventsDropdownListSizeAndLinks() {
        int actualListSize = topEventsDropdownList();

        System.out.println("Size of 'Top Events' Dropdown List: " + actualListSize);
        Assert.assertEquals(actualListSize, expectedElementTopEventsDropdownCount, "LIST SIZE DOES NOT MATCH");
    }

    /**
     * Test Case 12:Validate ESPN footer list
     * 1. Navigate to espn.com
     * 2. Go to espn nba page
     * 3.Get the ESPN Footer title's list
     * 4. Validate that those Follow ESPN title's are displayed compare to titles stored in excel
     * @throws Exception
     */
    public void validateESPNFooterList() throws Exception {
        getNBApage();
        scrollToElementJScript(espnFooterList);
        List<WebElement> espnFooterListArray = espnFooterList.findElements(By.xpath(webElementESPNFooterList));
        String[] expectedESPNFooterList = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") + "\\src\\main\\resources\\ESPNnbapageElements.xlsx", "ESPNFooter");
        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < espnFooterListArray.size(); i++) {
            String actualText = espnFooterListArray.get(i).getText();
            System.out.println(actualText);
            String expectedESPNFooterArray = expectedESPNFooterList[i];
            softAssert.assertEquals(actualText, expectedESPNFooterArray ,"Fantasy title at index of " + i + " " + "Does not match");

        }
        softAssert.assertAll();
    }

    /**
     * Test Case 13 - NBA Dropdown Menu (Left Div)
     * 1 - Navigate to http://espn.com
     * 2 - Hover over NBA Dropdown on header bar
     * 3 - Verify there are 9 elements located on left menu of NBA Dropdown menu
     * 4 - Validate that those title's are displayed compare to titles stored in excel
     */
    public List<WebElement> getNBADropdownMenuLeft() {
        mouseHover(nbaDropdown);
        List<WebElement> nbaDropdownElementsLeftList = getListOfWebElementsByCss(nbaDropdownMenuLeft, webElementNBADropdownMenuItemsLeft);

        return nbaDropdownElementsLeftList;
    }

    public void validateNBADropdownMenuLeftSize() throws IOException {
        int actualSize = getNBADropdownMenuLeft().size();
        System.out.println("Number of elements in NBA Menu (Left Side): " + actualSize);
        String[] expectedNBADropdownMenu = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") + "\\src\\main\\resources\\ESPNnbapageElements.xlsx", "NBADropdownMenuLinksLeft");
        SoftAssert softAssert = new SoftAssert();
        int expectedHeaderDropdownListSize = expectedNBADropdownMenu.length;
        softAssert.assertEquals(actualSize, expectedHeaderDropdownListSize, "SIZE OF LIST (NBA MENU LEFT) DOES NOT MATCH");
        softAssert.assertAll();
    }

    public void validateNBADropdownMenuLeftItemsText() throws IOException {
        List<WebElement> nbaDropdownElementsLeftList = getNBADropdownMenuLeft();
        SoftAssert softAssert = new SoftAssert(); String[] expectedNBADropdownMenuItems = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") + "\\src\\main\\resources\\ESPNnbapageElements.xlsx", "NBADropdownMenuItemsLeft");

        for (int i = 0; i < nbaDropdownElementsLeftList.size(); i++) {
            String actualText = nbaDropdownElementsLeftList.get(i).getAttribute("innerHTML");
            System.out.println(nbaDropdownElementsLeftList.get(i).getAttribute("innerHTML"));
            String[] expectedElementNBADropdownMenuItemsLeft = expectedNBADropdownMenuItems;
            softAssert.assertEquals(actualText, expectedElementNBADropdownMenuItemsLeft[i], "ELEMENT OF LIST AT POSITION " + i + " (NBA MENU LEFT) DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


}