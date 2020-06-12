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

    @Test (priority = 0)
    public static void testHomepage(){
        getInItElements();
        aetnaHomepage.getCurrentPageTitle();
        aetnaHomepage.validateCurrentPage();
    }

    @Test (priority = 1)
    public static void testDoSearch(){
        getInItElements();
        aetnaHomepage.doSearch();
        aetnaHomepage.validateDoSearch();
    }

    @Test (priority = 2)
    public static void testExploreAetnaSitesDropdownItemCountAndNames(){
        getInItElements();
        aetnaHomepage.validateExploreAetnaSitesDropdownItemCountAndNames();
    }

    @Test (priority = 3)
    public static void testExploreAetnaSitesDropdownItemURLs(){
        getInItElements();
        aetnaHomepage.validateExploreAetnaSitesDropdownItemURL();
    }

//    @Test (priority = 4)
//    public static void testSearchForAPlanDropdownItemCountAndNames(){
//        getInItElements();
//        aetnaHomepage.validateShopForAPlanMenuItemCountAndNames();
//    }
//
//    @Test (priority = 5)
//    public static void testMedicareSubmenuItemCountAndNames(){
//        getInItElements();
//        aetnaHomepage.validateMedicareSubmenuItemCountAndNames();
//    }
//
//    @Test (priority = 6)
//    public static void testMedicareSubmenuItemURLs(){
//        getInItElements();
//        aetnaHomepage.validateMedicareSubmenuItemURLs();
//    }
//
//    @Test (priority = 7)
//    public static void testHealthCoverageSubmenuItemCountAndNames(){
//        getInItElements();
//        aetnaHomepage.validateHealthCoverageSubmenuItemCountAndNames();
//    }
//
//    @Test (priority = 8)
//    public static void testHealthCoverageSubmenuItemURLS(){
//        getInItElements();
//        aetnaHomepage.validateHealthCoverageSubmenuItemURLs();
//    }
//
//    @Test (priority = 9)
//    public static void testDentalVisionSupplementalSubmenuItemCountAndNames(){
//        getInItElements();
//        aetnaHomepage.validateDentalVisionSupplementalSubmenuItemCountAndNames();
//    }
//
//    @Test (priority = 10)
//    public static void testDentalVisionSupplementalSubmenuItemURLs(){
//        getInItElements();
//        aetnaHomepage.validateDentalVisionSupplementalSubmenuItemURLs();
//    }
//
//    @Test (priority = 11)
//    public static void testPharmacySubmenuItemCountAndNames(){
//        getInItElements();
//        aetnaHomepage.validatePharmacySubmenuItemCountAndNames();
//    }
//
//    @Test (priority = 12)
//    public static void testPharmacySubmenuItemURLs(){
//        getInItElements();
//        aetnaHomepage.validatePharmacySubmenuItemURLs();
//    }
//
//    @Test (priority = 13)
//    public static void testMedicaidSubmenuItemCountAndNames(){
//        getInItElements();
//        aetnaHomepage.validateMedicaidSubmenuItemCountAndNames();
//    }
//
//    @Test (priority = 14)
//    public static void testMedicaidSubmenuItemURLs(){
//        getInItElements();
//        aetnaHomepage.validateMedicaidSubmenuItemURLs();
//    }
//
//    @Test (priority = 15)
//    public static void testLoginButton(){
//        getInItElements();
//        aetnaHomepage.validateLoginButton();
//    }
//
//    @Test (priority = 16)
//    public static void testCustomerIdentifierSectionNamesAndURLs(){
//        getInItElements();
//        aetnaHomepage.validateCustomerIdentifierSectionNamesAndURLs();
//    }
//
//    @Test (priority = 17)
//    public static void testMiscellaneousGridBoxNamesAndURLs(){
//        getInItElements();
//        aetnaHomepage.validateMiscellaneousGridBoxNamesAndURLs();
//    }
//    @Test (priority = 18)
//    public static void testSocialMediaIconCount(){
//        getInItElements();
//        aetnaHomepage.validateSocialMediaIconCount();
//    }
//
//    @Test (priority = 19)
//    public static void testSocialMediaIconNamesAndURLs(){
//        getInItElements();
//        aetnaHomepage.validateSocialMediaIconNamesAndURLs();
//    }
}