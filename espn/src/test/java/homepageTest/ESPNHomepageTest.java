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

    @Test (priority = 0)
    public static void testHomepage(){
        getInItElements();
        espnHomepage.getCurrentPageTitle();
        espnHomepage.validateCurrentPage();
    }

    @Test (priority = 1)
    public static void testTopEventsDropdownListSize(){
        getInItElements();
        espnHomepage.topEventsDropdownList();
        espnHomepage.validateTopEventsDropdownListSizeAndLinks();
    }

    @Test(priority = 2)
    public static void testFeaturedBoxTextAndLink(){
        getInItElements();
        espnHomepage.featuredBoxHoverTextAndLink();
        espnHomepage.validateFeaturedBox();
    }

    @Test(priority = 3)
    public static void testScrollHeader() throws Exception {
        getInItElements();
        espnHomepage.scrollHeader();
        espnHomepage.validateScrollHeader();
    }

    @Test (priority = 4)
    public static void testNFLDropdownMenuLeftItemsText(){
        getInItElements();
        espnHomepage.dropdownNFLMenuLeft();
        espnHomepage.validateNFLMenuLeftSize();
        espnHomepage.validateNFLMenuLeftItemsText();
    }

    @Test (priority = 5, enabled = false, groups = "PENDING")
    public static void testNFLDropdownMenuLeftItems() throws Exception{
        getInItElements();
//        espnHomepage.getNFLDropdownMenuLeftPageTitles();
        espnHomepage.getNFLDropdownMenuLeftLinks();
//        espnHomepage.validateDropdownNFLMenuLeftTitles();
        espnHomepage.validateDropdownNFLMenuLeftLinks();
    }
}
