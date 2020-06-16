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

    @Test (priority = 0)
    public static void testHomepage(){
        getInItElements();
        //ebayHomepage.getCurrentPageTitle();
        ebayHomepage.validateCurrentPage();
    }
    @Test(priority = 1,enabled = false)
    public static void testSignIn(){
        getInItElements();
        ebayHomepage.getSignInPage();
        ebayHomepage.validateSignInPage();
    }

    @Test(priority = 2)
    public static void testDailyDeals(){
        getInItElements();
        ebayHomepage.getDailyDeals();
        ebayHomepage.validateDailyDeals();
    }

    @Test(priority = 3)
    public static void testShoppingCart(){
        getInItElements();
        ebayHomepage.getShoppingCart();
        ebayHomepage.validateShoppingCart();
}

    @Test(priority = 4)
    public static void testSellPage(){
        getInItElements();
        ebayHomepage.getSellPage();
        ebayHomepage.validateSellPage();
}

    @Test(priority = 5)
    public static void testHelpAndContact(){
        getInItElements();
        ebayHomepage.getHelpAndContact();
        ebayHomepage.validateHelpAndContact();
}

    @Test(priority = 6)
    public static void testMotorsPage(){
        getInItElements();
        ebayHomepage.getMotorsPage();
        ebayHomepage.validateMotorsPage();
    }

    @Test(priority = 7)
    public static void testFashionPage(){
        getInItElements();
        ebayHomepage.getFashionPage();
        ebayHomepage.validateFashionPage();
    }

    @Test(priority = 8)
    public static void testElectronicsPage(){
        getInItElements();
        ebayHomepage.getElectronicsPage();
        ebayHomepage.validateElectronicsPage();
    }

    @Test(priority = 9)
    public static void testCollectiblesAndArt(){
        getInItElements();
        ebayHomepage.getCollectiblesAndArtPage();
        ebayHomepage.validateCollectiblesAndArtPage();
    }

    @Test(priority = 10)
    public static void testSearchCategoryDropdownList(){
        getInItElements();
        ebayHomepage.getSearchCategoryDropDownNum();
        ebayHomepage.validateSearchCategoryDropDownNum();
        ebayHomepage.getSearchByCategoryText();
        ebayHomepage.validateSearchCategoryText();
    }

    @Test(priority = 11)
    public static void testShopByCategory(){
        getInItElements();
        ebayHomepage.validateShopByCategoryListNum();
        ebayHomepage.getShopByCategoryListText();
        ebayHomepage.validateShopByCategoryListText();
    }

    @Test(priority = 12)
    public static void testCarouselSlideRight(){
        getInItElements();
        ebayHomepage.validateClickCarouselRight();

    }
    @Test(priority = 13)
    public static void testCarouselSlideLeft(){
        getInItElements();
        ebayHomepage.validateCarouselLeft();
    }

    @Test(priority = 14)
    public static void testEbaySitesList(){
        getInItElements();
        ebayHomepage.validateEbaySitesListNum();
        ebayHomepage.getEbaySitesList();
        ebayHomepage.validateEbaySitesList();
    }

    @Test(priority = 15)
    public static void testAboutEbayList(){
        getInItElements();
        ebayHomepage.validateAboutEbayListNum();
        ebayHomepage.getAboutEbayList();
        ebayHomepage.validateAboutEbayList();
    }

    @Test(priority = 16)
    public static void testSearchBox(){
        getInItElements();
        ebayHomepage.getSearchItem();

    }

    @Test(priority = 17)
    public static void testAddItemToCart(){
        getInItElements();
        ebayHomepage.addItemToCart();
    }

    @Test(priority = 18)
    public static void testDeleteItemMiniCart(){
        getInItElements();
        ebayHomepage.deleteItemMiniCart();


    }
    @Test(priority = 19)
    public static void testFAQButton(){
        getInItElements();
        ebayHomepage.getHelpButton();
    }

}
