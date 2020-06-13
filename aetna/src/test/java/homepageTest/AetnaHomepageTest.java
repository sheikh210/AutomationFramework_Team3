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

//    @Test (priority = 0)
//    public static void testHomepage() throws Exception{
//        getInItElements();
//        aetnaHomepage.getCurrentPageTitle();
//        aetnaHomepage.validateCurrentPage();
//    }
//
//    @Test (priority = 1)
//    public static void testDoSearch() throws Exception{
//        getInItElements();
//        aetnaHomepage.doSearch();
//        aetnaHomepage.validateDoSearch();
//    }
//
//    @Test (priority = 2)
//    public static void testExploreAetnaSitesDropdownItemCount() throws Exception{
//        getInItElements();
//        aetnaHomepage.validateExploreAetnaSitesDropdownItemCount();
//    }
//
//    @Test (priority = 3)
//    public static void testExploreAetnaSitesDropdownItemNamesAndURLs() throws Exception {
//        getInItElements();
//        aetnaHomepage.validateExploreAetnaSitesDropdownItemNamesAndURL();
//
//    }
//
//    @Test (priority = 4)
//    public static void testSearchForAPlanDropdownItemCountAndNames() throws Exception{
//        getInItElements();
//        aetnaHomepage.validateShopForAPlanMenuItemCountAndNames();
//    }
//
//    @Test (priority = 5)
//    public static void testMedicareSubmenuItemCountAndNames() throws Exception{
//        getInItElements();
//        aetnaHomepage.validateMedicareSubmenuItemCountAndNames();
//    }
//
//    @Test (priority = 6)
//    public static void testMedicareSubmenuItemURLs() throws Exception{
//        getInItElements();
//        aetnaHomepage.validateMedicareSubmenuItemURLs();
//    }
//
//    @Test (priority = 7)
//    public static void testHealthCoverageSubmenuItemCountAndNames() throws Exception{
//        getInItElements();
//        aetnaHomepage.validateHealthCoverageSubmenuItemCountAndNames();
//    }
//
//    @Test (priority = 8)
//    public static void testHealthCoverageSubmenuItemURLS() throws Exception{
//        getInItElements();
//        aetnaHomepage.validateHealthCoverageSubmenuItemURLs();
//    }
//
    @Test (priority = 9)
    public static void testDentalVisionSupplementalSubmenuItemCountAndNames() throws Exception{
        getInItElements();
        aetnaHomepage.validateDentalVisionSupplementalSubmenuItemCountAndNames();
    }
//
//    @Test (priority = 10)
//    public static void testDentalVisionSupplementalSubmenuItemURLs() throws Exception{
//        getInItElements();
//        aetnaHomepage.validateDentalVisionSupplementalSubmenuItemURLs();
//    }
//
//    @Test (priority = 11)
//    public static void testPharmacySubmenuItemCountAndNames() throws Exception{
//        getInItElements();
//        aetnaHomepage.validatePharmacySubmenuItemCountAndNames();
//    }
//
//    @Test (priority = 12)
//    public static void testPharmacySubmenuItemURLs() throws Exception{
//        getInItElements();
//        aetnaHomepage.validatePharmacySubmenuItemURLs();
//    }
//
//    @Test (priority = 13)
//    public static void testMedicaidSubmenuItemCountAndNames() throws Exception{
//        getInItElements();
//        aetnaHomepage.validateMedicaidSubmenuItemCountAndNames();
//    }
//
//    @Test (priority = 14)
//    public static void testMedicaidSubmenuItemURLs() throws Exception{
//        getInItElements();
//        aetnaHomepage.validateMedicaidSubmenuItemURLs();
//    }
//
//    @Test (priority = 15)
//    public static void testLoginButton() throws Exception throws Exception{
//        getInItElements();
//        aetnaHomepage.validateLoginButton();
//    }
//
//    @Test (priority = 16)
//    public static void testCustomerIdentifierSectionNamesAndURLs() throws Exception{
//        getInItElements();
//        aetnaHomepage.validateCustomerIdentifierSectionNamesAndURLs();
//    }
//
//    @Test (priority = 17)
//    public static void testMiscellaneousGridBoxNamesAndURLs() throws Exception{
//        getInItElements();
//        aetnaHomepage.validateMiscellaneousGridBoxNamesAndURLs();
//    }
//    @Test (priority = 18)
//    public static void testSocialMediaIconCount() throws Exception{
//        getInItElements();
//        aetnaHomepage.validateSocialMediaIconCount();
//    }
//
//    @Test (priority = 19)
//    public static void testSocialMediaIconNamesAndURLs() throws Exception{
//        getInItElements();
//        aetnaHomepage.validateSocialMediaIconNamesAndURLs();
//    }
}