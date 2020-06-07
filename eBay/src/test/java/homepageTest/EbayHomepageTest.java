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
        ebayHomepage.getCurrentPageTitle();
        ebayHomepage.validateCurrentPage();
    }

    @Test
    public static void testSearchCategoryDropdownList(){
        getInItElements();
        ebayHomepage.getSearchCategoryDropDownNum();
        ebayHomepage.validateSearchCategoryDropDownNum();
        ebayHomepage.getSearchCategoryText();
        ebayHomepage.validateSearchCategoryText();
    }

}
