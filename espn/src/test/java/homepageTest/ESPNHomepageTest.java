package homepageTest;

import commonAPI.WebAPI;
import homepage.ESPNHomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class ESPNHomepageTest extends WebAPI {

    static ESPNHomepage espnHomepage;

    public static void getInItElements(){
        espnHomepage = PageFactory.initElements(driver, ESPNHomepage.class);
    }

    @Test (priority = 0, enabled = false)
    public static void testHomepage(){
        getInItElements();
        espnHomepage.getCurrentPageTitle();
        espnHomepage.validateCurrentPage();
    }

    @Test (priority = 1, enabled = false)
    public static void testTopEventsDropdownListSize(){
        getInItElements();
        espnHomepage.topEventsDropdownList();
        espnHomepage.validateTopEventsDropdownListSizeAndLinks();
    }

    @Test(priority = 2, enabled = false)
    public static void testScrollHeader() throws Exception {
        getInItElements();
        espnHomepage.scrollHeader();
        espnHomepage.validateScrollHeader();
    }

    @Test (priority = 3, enabled = false)
    public static void testNFLDropdownMenuLeftItemsCountAndText(){
        getInItElements();
        espnHomepage.getNFLDropdownMenuLeft();
        espnHomepage.validateNFLDropdownMenuLeftSize();
        espnHomepage.validateNFLDropdownMenuLeftItemsText();
    }

    @Test (priority = 4, enabled = false)
    public static void testNFLDropdownMenuLeftItems() {
        getInItElements();
        espnHomepage.getNFLDropdownMenuLeftLinks();
        espnHomepage.validateNFLDropdownMenuLeftLinks();
//        espnHomepage.getNFLDropdownMenuLeftPageTitles();
//        espnHomepage.validateNFLDropdownMenuLeftTitles();
    }

    @Test (priority = 5, enabled = false)
    public static void testNFLDropdownMenuRightDivisions(){
        getInItElements();
        espnHomepage.getNFLDropdownMenuRightNFLDivisionNames();
        espnHomepage.validateNFLDropdownMenuRightNFLDivisionNames();
    }

    @Test (priority = 6, enabled = false)
    public static void testNFLDropdownMenuRightNFLTeams(){
        getInItElements();
        espnHomepage.getNFLDropdownMenuRightNFLTeams();
        espnHomepage.validateNFLDropdownMenuRightNFLTeamsCount();
        espnHomepage.validateNFLDropdownMenuRightNFLTeams();
    }

    @Test (priority = 7, enabled = false)
    public static void testNBADropdownMenuLeftItemsCountAndText(){
        getInItElements();
        espnHomepage.getNBADropdownMenuLeft();
        espnHomepage.validateNBADropdownMenuLeftSize();
        espnHomepage.validateNBADropdownMenuLeftItemsText();
    }

    @Test (priority = 8, enabled = false)
    public static void testNBADropdownMenuLeftItems(){
        getInItElements();
        espnHomepage.getNBADropdownMenuLeftLinks();
        espnHomepage.validateNBADropdownMenuLeftLinks();
    }

    @Test (priority = 9, enabled = false)
    public static void testNBADropdownMenuRightDivisions(){
        getInItElements();
        espnHomepage.getNBADropdownMenuRightNBADivisionNames();
        espnHomepage.validateNBADropdownMenuRightNBADivisionNames();
    }

    @Test (priority = 10, enabled = false)
    public static void testNBADropdownMenuRightNBATeams(){
        getInItElements();
        espnHomepage.getNBADropdownMenuRightNBATeams();
        espnHomepage.validateNBADropdownMenuRightNBATeamsCount();
        espnHomepage.validateNBADropdownMenuRightNBATeams();
    }

    @Test (priority = 11)
    public static void testMLBDropdownMenuLeftItemsCountAndText(){
        getInItElements();
        espnHomepage.getMLBDropdownMenuLeft();
        espnHomepage.validateMLBDropdownMenuLeftSize();
        espnHomepage.validateMLBDropdownMenuLeftItemsText();
    }

    @Test (priority = 12)
    public static void testMLBDropdownMenuLeftItems(){
        getInItElements();
        espnHomepage.getMLBDropdownMenuLeftLinks();
        espnHomepage.validateMLBDropdownMenuLeftLinks();
    }

    @Test (priority = 13)
    public static void testMLBDropdownMenuRightDivisions(){
        getInItElements();
        espnHomepage.getMLBDropdownMenuRightMLBDivisionNames();
        espnHomepage.validateMLBDropdownMenuRightMLBDivisionNames();
    }

    @Test (priority = 14)
    public static void testMLBDropdownMenuRightMLBTeams(){
        getInItElements();
        espnHomepage.getMLBDropdownMenuRightMLBTeams();
        espnHomepage.validateMLBDropdownMenuRightMLBTeamsCount();
        espnHomepage.validateMLBDropdownMenuRightMLBTeams();
    }


}
