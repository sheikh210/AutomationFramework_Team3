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
}
