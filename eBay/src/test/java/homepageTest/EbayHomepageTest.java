package homepageTest;
import commonAPI.WebAPI;
import homepage.EbayHomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class EbayHomepageTest extends WebAPI {

    static EbayHomepage ebayHomepage;

    public static void getInItElements(){
        ebayHomepage = PageFactory.initElements(driver, EbayHomepage.class);
    }

    @Test (priority = 0,enabled = false)
    public static void testHomepage(){
        getInItElements();
        ebayHomepage.getCurrentPageTitle();
        ebayHomepage.validateCurrentPage();
    }
    @Test(priority = 1,enabled = false)
    public static void testSignIn(){
        getInItElements();
        ebayHomepage.getSignInPage();
        ebayHomepage.validateSignInPage();
    }

    @Test(priority = 2,enabled = false)
    public static void testDailyDeals(){
        getInItElements();
        ebayHomepage.getDailyDeals();
        ebayHomepage.validateDailyDeals();
    }

    @Test(priority = 3,enabled = false)
    public static void testShoppingCart(){
        getInItElements();
        ebayHomepage.getShoppingCart();
        ebayHomepage.validateShoppingCart();
}

    @Test(priority = 4,enabled = false)
    public static void testSellPage(){
        getInItElements();
        ebayHomepage.getSellPage();
        ebayHomepage.validateSellPage();
}

    @Test(priority = 5,enabled = false)
    public static void testHelpAndContact(){
        getInItElements();
        ebayHomepage.getHelpAndContact();
        ebayHomepage.validateHelpAndContact();
}

    @Test()
    public static void testMotorsPage(){
        getInItElements();
        ebayHomepage.getMotorsPage();
        ebayHomepage.validateMotorsPage();
    }

    @Test()
    public static void testFashionPage(){
        getInItElements();
        ebayHomepage.getFashionPage();
        ebayHomepage.validateFashionPage();
    }

    @Test()
    public static void testElectronicsPage(){
        getInItElements();
        ebayHomepage.getElectronicsPage();
        ebayHomepage.validateElectronicsPage();
    }

    @Test()
    public static void testCollectiblesAndArt(){
        getInItElements();
        ebayHomepage.getCollectiblesAndArtPage();
        ebayHomepage.validateCollectiblesAndArtPage();
    }

    @Test(priority = 6,enabled = false)
    public static void testSearchCategoryDropdownList(){
        getInItElements();
        ebayHomepage.getSearchCategoryDropDownNum();
        ebayHomepage.validateSearchCategoryDropDownNum();
        ebayHomepage.getSearchCategoryText();
        ebayHomepage.validateSearchCategoryText();
    }

}
