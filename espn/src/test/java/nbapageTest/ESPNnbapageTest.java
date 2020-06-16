package nbapageTest;
import commonAPI.WebAPI;
import nbapage.ESPNnbapage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.DataReader;

import java.io.IOException;

public class ESPNnbapageTest extends WebAPI {
   static ESPNnbapage espnNbapage;
   static DataReader dataReader = new DataReader();
    public static void getInItElements(){
        espnNbapage = PageFactory.initElements(driver, ESPNnbapage.class);
    }


    @Test(priority = 0,enabled = false)
    public static void testNBApage() throws Exception {
        getInItElements();

        String actualTitle = espnNbapage.validateNBApage();
        String [] expectedNBApageTitleArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir")+ "\\src\\main\\resources\\ESPNnbapageElements.xlsx","ESPNnbaTitle");
        String expectedNBApageTitle = expectedNBApageTitleArray[0];
        System.out.println("Expected Page Title: " + expectedNBApageTitle);

        Assert.assertEquals(actualTitle,expectedNBApageTitle,"NBApage Title does not match");
    }

    @Test(priority = 1,enabled = false)
    public static void testESPNPlusList() throws Exception{
        getInItElements();
        espnNbapage.validateESPNPlusLinkList();

    }

    @Test(priority = 2,enabled = false)
    public static void testQuickLinks() throws Exception{
        getInItElements();
        espnNbapage.validateESPNQuickLinks();


    }
    @Test(priority = 3,enabled = false)
    public static void testStatsList() throws Exception{

        getInItElements();
        espnNbapage.getNBApage();
        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i < 4;i++) {
            String actualText =  espnNbapage.getStatsListText(i);
            System.out.println(actualText);
            String expectedStatsList = espnNbapage.validateStatsList(i);
            softAssert.assertEquals(actualText, expectedStatsList, "Stats list at index of " + i + " " + "Does not match");
        }
        softAssert.assertAll();


    }

    @Test(priority = 4,enabled = false)
    public static void testTeamsCategories() throws Exception {
        getInItElements();
        espnNbapage.validateTeamsList();
    }

    @Test(priority = 5,enabled = false)
    public static void testPodcastList() throws Exception {
        getInItElements();
        espnNbapage.validatePodcastsList();
    }

    @Test(priority = 6,enabled = false)
    public static void testFantasyList() throws Exception {
        getInItElements();
        espnNbapage.validateFantasyList();
    }
    @Test(priority = 7,enabled = false)
    public static void testESPNSitesList() throws Exception {
        getInItElements();
        espnNbapage.validateESPNSitesList();
    }
    @Test(priority = 8,enabled = false)
    public static void testESPNAppsList() throws Exception {
        getInItElements();
        espnNbapage.validateESPNAppsList();
    }
    @Test(priority = 9,enabled = false)
    public static void testFollowESPNList() throws Exception {
        getInItElements();
        espnNbapage.validateFollowESPNList();
    }

    @Test (priority = 10,enabled = false)
    public static void testTopEventsDropdownListSize(){
        getInItElements();
        espnNbapage.getNBApage();
        espnNbapage.topEventsDropdownList();
        espnNbapage.validateTopEventsDropdownListSizeAndLinks();
    }


    @Test(priority = 11,enabled = false)
    public static void testESPNFooter() throws Exception {
        getInItElements();
        espnNbapage.validateESPNFooterList();
    }

    @Test (priority = 12,enabled = false)
    public static void testNBADropdownMenuLeftItemsCountAndText() throws IOException {
        getInItElements();
        espnNbapage.getNBADropdownMenuLeft();
        espnNbapage.validateNBADropdownMenuLeftSize();
        espnNbapage.validateNBADropdownMenuLeftItemsText();
    }
}
