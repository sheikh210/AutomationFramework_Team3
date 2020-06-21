package nbapageTest;

import commonAPI.WebAPI;
import nbapage.ESPNnbapage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DataReader;

import java.io.IOException;

public class ESPNnbapageTest extends WebAPI {
   static ESPNnbapage espnNbapage;
   static DataReader dataReader = new DataReader();
    public static void getInItElements(){
        espnNbapage = PageFactory.initElements(driver, ESPNnbapage.class);
    }


    @Test(priority = 0)
    public static void testNBApage() throws Exception {
        getInItElements();

        String actualTitle = espnNbapage.validateNBApage();
        String [] expectedNBApageTitleArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir")+ "\\src\\main\\resources\\ESPNnbapageElements.xlsx","ESPNnbaTitle");
        String expectedNBApageTitle = expectedNBApageTitleArray[0];
        System.out.println("Expected Page Title: " + expectedNBApageTitle);

        Assert.assertEquals(actualTitle,expectedNBApageTitle,"NBApage Title does not match");
    }

    @Test(priority = 1)
    public static void testESPNPlusList() throws Exception{
        getInItElements();
        espnNbapage.validateESPNPlusLinkList();

    }

    @Test(priority = 2)
    public static void testQuickLinks() throws Exception{
        getInItElements();
        espnNbapage.validateESPNQuickLinks();


    }
    @Test(priority = 3)
    public static void testStatsList() throws Exception{

        getInItElements();
        espnNbapage.getNBApage();
        espnNbapage.getStatsListText();

    }

    @Test(priority = 4)
    public static void testTeamsSize() throws Exception {
        getInItElements();
        espnNbapage.validateTeamsDropDownSize();
    }
    @Test(priority = 5)
    public static void testTeamsCategories() throws Exception {
        getInItElements();
        espnNbapage.validateTeamsList();
    }

    @Test(priority = 6)
    public static void testPodcastList() throws Exception {
        getInItElements();
        espnNbapage.validatePodcastsList();
    }

    @Test(priority = 7)
    public static void testFantasyList() throws Exception {
        getInItElements();
        espnNbapage.validateFantasyList();
    }
    @Test(priority = 8)
    public static void testESPNSitesList() throws Exception {
        getInItElements();
        espnNbapage.validateESPNSitesList();
    }
    @Test(priority = 9)
    public static void testESPNAppsList() throws Exception {
        getInItElements();
        espnNbapage.validateESPNAppsList();
    }
    @Test(priority = 10)
    public static void testFollowESPNList() throws Exception {
        getInItElements();
        espnNbapage.validateFollowESPNList();
    }

    @Test (priority = 11)
    public static void testTopEventsDropdownListSize(){
        getInItElements();
        espnNbapage.getNBApage();
        espnNbapage.topEventsDropdownList();
        espnNbapage.validateTopEventsDropdownListSize();
    }


    @Test(priority = 12)
    public static void testESPNFooter() throws Exception {
        getInItElements();
        espnNbapage.validateESPNFooterList();
    }

    @Test (priority = 13)
    public static void testNBADropdownMenuItemsCount() throws IOException {
        getInItElements();
        espnNbapage.getNBApage();
        espnNbapage.getNBADropdownMenuLeft();
        espnNbapage.validateNBADropdownMenuLeftSize();
    }

    @Test (priority = 14)
    public static void testNBADropdownMenuItemsText() throws IOException {
        getInItElements();
        espnNbapage.getNBApage();
        espnNbapage.getNBADropdownMenuLeft();
        espnNbapage.validateNBADropdownMenuItemsText();
    }

    @Test(priority = 15)
    public static void testNBADropdownMenuLinks()throws Exception {
        getInItElements();
        espnNbapage.getNBApage();
        espnNbapage.validateNBADropdownMenuLinks();
    }

    @Test(priority = 16)
    public static void testMoreDropdownSize() throws Exception{
        getInItElements();
        espnNbapage.getNBApage();
        espnNbapage.validateMoreDropdownMenuSize();
    }
    @Test(priority = 17)
    public static void testMoreDropdownText() throws Exception{
        getInItElements();
        espnNbapage.getNBApage();
        espnNbapage.validateMoreDropdownMenuText();
    }

    @Test(priority = 18)
    public static void testMoreDropdownLinks() throws Exception{
        getInItElements();
        espnNbapage.getNBApage();
        espnNbapage.validateMoreDropdownMenuLinks();
    }


    @Test (priority = 19)
    public static void testScrollHeader() throws Exception {
        getInItElements();
        espnNbapage.getNBApage();
        espnNbapage.scrollHeader();
        espnNbapage.validateScrollHeader();

    }


}
