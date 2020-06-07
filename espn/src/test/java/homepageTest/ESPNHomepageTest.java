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

    @Test (priority = 1,enabled = false)
    public static void testTopEventsDropdownListSize(){
        getInItElements();
        espnHomepage.topEventsDropdownList();
        espnHomepage.validateTopEventsDropdownListSizeAndLinks();
    }

    @Test(priority = 2,enabled = false)
    public static void testFeaturedBoxTextAndLink(){
        getInItElements();
        espnHomepage.featuredBoxHoverTextAndLink();
        espnHomepage.validateFeaturedBox();
    }

    @Test(priority = 3, enabled = false)
    public static void testScrollHeader() throws Exception {
        getInItElements();
        espnHomepage.scrollHeader();
        espnHomepage.validateScrollHeader();
    }

    @Test (priority = 4,enabled = false)
    public static void testNFLDropdownMenuLeftItemsText(){
        getInItElements();
        espnHomepage.dropdownNFLMenuLeft();
        espnHomepage.validateNFLMenuLeftSize();
        espnHomepage.validateNFLMenuLeftItemsText();
    }

    @Test (priority = 5,enabled = false)
    public static void testNFLDropdownMenuLeftItems() {
        getInItElements();
        espnHomepage.getNFLDropdownMenuLeftLinks();
        espnHomepage.validateDropdownNFLMenuLeftLinks();
//        espnHomepage.getNFLDropdownMenuLeftPageTitles();
//        espnHomepage.validateDropdownNFLMenuLeftTitles();
    }

    @Test (priority = 6, enabled = false)
    public static void testNFLDropdownMenuRightDivisions(){
        getInItElements();
        espnHomepage.getNFLDropdownMenuRightNFLDivisionNames();
        espnHomepage.validateNFLDropdownMenuRightNFLDivisionNames();
    }

    @Test (priority = 7)
    public static void testNFLDropdownMenuRightTeams(){
        getInItElements();
        espnHomepage.getNFLDropdownMenuRightNFLTeams();
        espnHomepage.validateNFLDropdownMenuRightNFLTeamsCount();
        espnHomepage.validateNFLDropdownMenuRightNFLTeams();
    }

}
