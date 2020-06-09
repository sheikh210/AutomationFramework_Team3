package homepageTest;

import commonAPI.WebAPI;
import homepage.AetnaHomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class AetnaHomepageTest extends WebAPI{

    static AetnaHomepage aetnaHomepage;

    public static void getInItElements(){
        aetnaHomepage = PageFactory.initElements(driver, AetnaHomepage.class);
    }

    @Test (priority = 0, enabled = false)
    public static void testHomepage(){
        getInItElements();
        aetnaHomepage.getCurrentPageTitle();
        aetnaHomepage.validateCurrentPage();
    }

    @Test (priority = 1, enabled = false)
    public static void testDoSearch(){
        getInItElements();
        aetnaHomepage.doSearch();
        aetnaHomepage.validateDoSearch();
    }

    @Test (priority = 2, enabled = false)
    public static void testExploreAetnaSitesDropdownItemCountAndNames(){
        getInItElements();
        aetnaHomepage.validateExploreAetnaSitesDropdownItemCountAndNames();
    }

    @Test (priority = 3, enabled = false)
    public static void testExploreAetnaSitesDropdownItemNavigation(){
        getInItElements();
        aetnaHomepage.validateExploreAetnaSitesDropdownItemURL();
    }

    @Test (priority = 4)
    public static void testSearachForAPlanDropdownItemCountAndNames(){
        getInItElements();
        aetnaHomepage.validateShopForAPlanMenuItemCountAndNames();
    }


}