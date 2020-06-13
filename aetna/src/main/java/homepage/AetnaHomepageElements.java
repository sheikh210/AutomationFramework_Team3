package homepage;

public class AetnaHomepageElements {
  
    /**
     * HEADER
     */

    // Search Button - Header (xPath)
    public static final String webElementButtonSearchHeader = "//body//header//form//button[1]";
    // Search Input Field - Header (xPath)
    public static final String webElementInputSearchFieldHeader = "//input[@id='globalSearch']";
    // Header 'Login' Button (CSS)
    public static final String webElementButtonLogin = "#header__loginbtn";
    // Search Term
    public static final String searchTerm = "Insurance Plans";
    // 'Explore Aetna sites' Dropdown Button (CSS)
    public static final String webElementExploreAetnaSitesButton = "body > div.header.headerwithmegamenu > div > header > div > nav > div:nth-child(3) > div > div.lang-select.dropdown > button";
    // 'Explore Aetna sites' Dropdown Menu (CSS)
    public static final String webElementDropdownMenuExploreAetnaSites = "body > div.header.headerwithmegamenu > div > header > div > nav > div:nth-child(3) > div > div.lang-select.dropdown.show > ul";
    // 'Explore Aetna sites' Dropdown Menu Items [LIST] (CSS)
    public static final String webElementItemsDropdownMenuExploreAetnaSites1 = "body > div.header.headerwithmegamenu > div > header > div > nav > div:nth-child(3) > div > div.lang-select.dropdown.show > ul > li > a > span";
    // 'Explore Aetna sites' Dropdown Menu Items - Clickable [LIST] (CSS)
    public static final String webElementItemsDropdownMenuExploreAetnaSites2 = "body > div.header.headerwithmegamenu > div > header > div > nav > div:nth-child(3) > div > div.lang-select.dropdown.show > ul > li > a";
    // 'Shop for a plan' Button (xPath)
    public static final String webElementButtonShopForAPlan = "//div[@class=\"header headerwithmegamenu\"]/div/nav/div/ul/li/div/button[contains(text(),'Shop for a plan')]";
    // 'Shop for a plan' Menu - Left (CSS)
    public static final String webElementDropdownMenuShopForAPlan = "body > div.header.headerwithmegamenu > div > nav > div > ul.megamenu__primary.meganav__primary--left > li.megamenu__primary--item.active > div.megamenu__dropdown > div > div > section > ul";
    // 'Shop for a plan' Menu Items - Left (List) (CSS)
    public static final String webElementDropdownMenuShopForAPlanItemsLeft = "body > div.header.headerwithmegamenu > div > nav > div > ul.megamenu__primary.meganav__primary--left > li.megamenu__primary--item.active > div.megamenu__dropdown > div > div > section > ul button";
    // 'Medicare' Button - 'Shop for a plan' Menu (CSS)
    public static final String webElementButtonMedicare = "body > div.header.headerwithmegamenu > div > nav > div > ul.megamenu__primary.meganav__primary--left > li.megamenu__primary--item.active > div.megamenu__dropdown > div > div > section > ul > li:nth-child(1) > div.megamenu__secondary--link.megamenu__secondary--inactive > button";
    // 'Medicare' Submenu (CSS)
    public static final String webElementSubmenuMedicare = "body > div.header.headerwithmegamenu > div > nav > div > ul.megamenu__primary.meganav__primary--left > li.megamenu__primary--item.active > div.megamenu__dropdown > div > div > section > ul > li.megamenu__secondary--item.megamenu__secondary--clicklink.secondaryblock--active > div.megamenu__tertiary--block > ul";
    // 'Medicare' Submenu Items (List) (CSS)
    public static final String webElementsSubmenuMedicareItems = "body > div.header.headerwithmegamenu > div > nav > div > ul.megamenu__primary.meganav__primary--left > li.megamenu__primary--item.active > div.megamenu__dropdown > div > div > section > ul > li.megamenu__secondary--item.megamenu__secondary--clicklink.secondaryblock--active > div.megamenu__tertiary--block > ul > li > a";
    // 'Health Coverage' Button - 'Shop for a plan' Menu (CSS)
    public static final String webElementButtonHealthCoverage = "body > div.header.headerwithmegamenu > div > nav > div > ul.megamenu__primary.meganav__primary--left > li.megamenu__primary--item.active > div.megamenu__dropdown > div > div > section > ul > li:nth-child(2) > div.megamenu__secondary--link.megamenu__secondary--inactive > button";
    // 'Health Coverage' Submenu (CSS)
    public static final String webElementSubmenuHealthCoverage = "body > div.header.headerwithmegamenu > div > nav > div > ul.megamenu__primary.meganav__primary--left > li.megamenu__primary--item.active > div.megamenu__dropdown > div > div > section > ul > li.megamenu__secondary--item.megamenu__secondary--clicklink.secondaryblock--active > div.megamenu__tertiary--block > ul";
    // 'Health Coverage' Submenu Items (List) (CSS)
    public static final String webElementsSubmenuHealthCoverageItems = "body > div.header.headerwithmegamenu > div > nav > div > ul.megamenu__primary.meganav__primary--left > li.megamenu__primary--item.active > div.megamenu__dropdown > div > div > section > ul > li.megamenu__secondary--item.megamenu__secondary--clicklink.secondaryblock--active > div.megamenu__tertiary--block > ul > li > a";
    // 'Dental, Vision and Supplemental' Button - 'Shop for a plan' Menu (CSS)
    public static final String webElementButtonDentalVisionSupplemental = "body > div.header.headerwithmegamenu > div > nav > div > ul.megamenu__primary.meganav__primary--left > li.megamenu__primary--item.active > div.megamenu__dropdown > div > div > section > ul > li:nth-child(3) > div.megamenu__secondary--link.megamenu__secondary--inactive > button";
    // 'Dental, Vision and Supplemental' Submenu (CSS)
    public static final String webElementSubmenuDentalVisionSupplemental = "body > div.header.headerwithmegamenu > div > nav > div > ul.megamenu__primary.meganav__primary--left > li.megamenu__primary--item.active > div.megamenu__dropdown > div > div > section > ul > li.megamenu__secondary--item.megamenu__secondary--clicklink.secondaryblock--active > div.megamenu__tertiary--block > ul";
    // 'Dental, Vision and Supplemental' Submenu Items (List) (CSS)
    public static final String webElementsSubmenuDentalVisionSupplementalItems = "body > div.header.headerwithmegamenu > div > nav > div > ul.megamenu__primary.meganav__primary--left > li.megamenu__primary--item.active > div.megamenu__dropdown > div > div > section > ul > li.megamenu__secondary--item.megamenu__secondary--clicklink.secondaryblock--active > div.megamenu__tertiary--block > ul > li > a";
    // 'Pharmacy' Button - 'Shop for a plan' Menu (CSS)
    public static final String webElementButtonPharmacy = "body > div.header.headerwithmegamenu > div > nav > div > ul.megamenu__primary.meganav__primary--left > li.megamenu__primary--item.active > div.megamenu__dropdown > div > div > section > ul > li:nth-child(4) > div.megamenu__secondary--link.megamenu__secondary--inactive > button";
    // 'Pharmacy' Submenu (CSS)
    public static final String webElementSubmenuPharmacy = "body > div.header.headerwithmegamenu > div > nav > div > ul.megamenu__primary.meganav__primary--left > li.megamenu__primary--item.active > div.megamenu__dropdown > div > div > section > ul > li.megamenu__secondary--item.megamenu__secondary--clicklink.secondaryblock--active > div.megamenu__tertiary--block > ul";
    // 'Pharmacy' Submenu Items (List) (CSS)
    public static final String webElementsSubmenuPharmacyItems = "body > div.header.headerwithmegamenu > div > nav > div > ul.megamenu__primary.meganav__primary--left > li.megamenu__primary--item.active > div.megamenu__dropdown > div > div > section > ul > li.megamenu__secondary--item.megamenu__secondary--clicklink.secondaryblock--active > div.megamenu__tertiary--block > ul > li > a";
    // 'Medicaid' Button - 'Shop for a plan' Menu (CSS)
    public static final String webElementButtonMedicaid = "body > div.header.headerwithmegamenu > div > nav > div > ul.megamenu__primary.meganav__primary--left > li.megamenu__primary--item.active > div.megamenu__dropdown > div > div > section > ul > li:nth-child(5) > div.megamenu__secondary--link.megamenu__secondary--inactive > button";
    // 'Medicaid' Submenu (CSS)
    public static final String webElementSubmenuMedicaid = "body > div.header.headerwithmegamenu > div > nav > div > ul.megamenu__primary.meganav__primary--left > li.megamenu__primary--item.active > div.megamenu__dropdown > div > div > section > ul > li.megamenu__secondary--item.megamenu__secondary--clicklink.secondaryblock--active > div.megamenu__tertiary--block > ul";
    // 'Medicaid' Submenu Items (List) (CSS)
    public static final String webElementsSubmenuMedicaidItems = "body > div.header.headerwithmegamenu > div > nav > div > ul.megamenu__primary.meganav__primary--left > li.megamenu__primary--item.active > div.megamenu__dropdown > div > div > section > ul > li.megamenu__secondary--item.megamenu__secondary--clicklink.secondaryblock--active > div.megamenu__tertiary--block > ul > li > a";

    /**
     * BODY
     */

    // Customer Identifier Section (CSS)
    public static final String webElementCustomerIdentifierSection = "#content__main > div.herobanner.parbase > div > div > div.herobanner__titlecontainer > div.component.nextaction > div > div";
    // Customer Identifier Boxes [LIST] (CSS)
    public static final String webElementsCustomerIdentifierBoxes = "#content__main > div.herobanner.parbase > div > div > div.herobanner__titlecontainer > div.component.nextaction > div > div div.nextaction__top__headline a";
    // Miscellaneous Grid Section (CSS)
    public static final String webElementMiscellaneousGridSection = "#content__main > div.responsivegrid > div > div > div";
    // Miscellaneous Grid Boxes - Names [LIST] (CSS)
    public static final String webElementsMiscellaneousGridBoxesNames = "#content__main > div.responsivegrid > div > div > div h2";
    // Miscellaneous Grid Boxes - URLs [LIST] (CSS)
    public static final String webElementsMiscellaneousGridBoxesURLs = "#content__main > div.responsivegrid > div > div > div a";

    /**
     * FOOTER
     */

    // Social Media Wrapper (CSS)
    public static final String webElementWrapperSocialMedia = "footer div.row.footer__logo__social__wrapper ul";
    // Social Media Links (CSS)
    public static final String webElementsIconsSocialMedia = "footer div.row.footer__logo__social__wrapper ul a";


    /**
     * (EXPECTED ELEMENTS)
     */
    // EXPECTED 'Shop for a plan' Dropdown Item Count (Integer)
    public static final int expectedElementShopForAPlanItemsListCount = 5;
    // EXPECTED 'Shop for a plan' Dropdown Item Names (String[])
    public static final String[] expectedElementShopForAPlanItemsListNames = {"Medicare", "Health coverage", "Dental, vision and supplemental", "Pharmacy", "Medicaid"};
    // EXPECTED 'Medicare' Submenu Item Count (Integer)
    public static final int expectedElementSubmenuMedicareItemCount = 6;
    // EXPECTED 'Medicare' Submenu Item Names (String[])
    public static final String[] expectedElementsSubmenuMedicareItemNames = {"Browse Aetna Medicare plans", "Find a doctor", "Check our drug list", "Understand Medicare", "Find a plan to meet your needs", "Enroll in Medicare"};
    // EXPECTED 'Medicare' Submenu Item URLs (String[])
    public static final String[] expectedElementsSubmenuMedicareItemURLs = {"https://www.aetnamedicare.com/en/compare-plans-enroll/find-plans.html", "https://www.aetna.com/dsepublic/#/contentPage?page=providerSearchLanding&site_id=medicare&language=en", "https://www.aetnamedicare.com/en/prescription-drugs/check-medicare-drug-list.html", "https://www.aetnamedicare.com/en/understanding-medicare.html", "https://www.aetnamedicare.com/en/right-medicare-plan.html", "https://rxtools.aetnamedicare.com/2020/Compare/Method?ZipCode="};
    // EXPECTED 'Health Coverage' Submenu Item Count (Integer)
    public static final int expectedElementSubmenuHealthCoverageItemCount = 4;
    // EXPECTED 'Health Coverage' Submenu Item Names (String[])
    public static final String[] expectedElementsSubmenuHealthCoverageItemNames = {"Plans through an employer", "Student plans", "International plans", "Find a doctor"};
    // EXPECTED 'Health Coverage' Submenu Item URLs (String[])
    public static final String[] expectedElementsSubmenuHealthCoverageItemURLs = {"https://www.aetna.com/individuals-families/health-insurance-through-work.html", "https://www.aetnastudenthealth.com/en/index.html", "https://int.aetnainternational.com/individuals/getQuote.do", "https://www.aetna.com/individuals-families/find-a-doctor.html"};

    // EXPECTED 'Dental, Vision and Supplemental' Submenu Item Count (Integer)
    public static final int expectedElementSubmenuDentalVisionSupplementalItemCount = 5;
    // EXPECTED 'Dental, Vision and Supplemental' Submenu Item Names (String[])
    public static final String[] expectedElementsSubmenuDentalVisionSupplementalItemNames = {"Dental plans", "Find a dentist", "Vision plans", "Find an eye doctor", "Supplemental plans"};
    // EXPECTED 'Dental, Vision and Supplemental' Submenu Item URLs (String[])
    public static final String[] expectedElementsSubmenuDentalVisionSupplementalItemURLs = {"https://www.aetna.com/individuals-families/buy-dental-coverage.html", "https://www.aetna.com/dsepublic/#/contentPage?page=providerSearchLanding&site_id=dse&language=en", "https://www.aetna.com/individuals-families/vision-insurance.html", "https://www.aetna.com/dsepublic/#/contentPage?page=providerSearchLanding&site_id=dse&language=en",
    "https://www.aetna.com/individuals-families/voluntary-benefits.html"};

    // EXPECTED 'Pharmacy' Submenu Item Count (Integer)
    public static final int expectedElementSubmenuPharmacyItemCount = 3;
    // EXPECTED 'Pharmacy' Submenu Item Names (String[])
    public static final String[] expectedElementsSubmenuPharmacyItemNames = {"Get pharmacy plan information", "Find a pharmacy", "Find medicine and costs"};
    // EXPECTED 'Pharmacy' Submenu Item URLs (String[])
    public static final String[] expectedElementsSubmenuPharmacyItemURLs = {"https://www.aetna.com/individuals-families/pharmacy.html", "http://www.aetna.com/docfind/home.do?site_id=aetnapharmacy&langpref=en", "https://www.aetna.com/individuals-families/find-a-medication.html"};

    // EXPECTED 'Medicaid' Submenu Item Count (Integer)
    public static final int expectedElementSubmenuMedicaidItemCount = 2;
    // EXPECTED 'Medicaid' Submenu Item Names (String[])
    public static final String[] expectedElementsSubmenuMedicaidItemNames = {"Medicaid plans", "Find a doctor"};
    // EXPECTED 'Medicaid' Submenu Item URLs (String[])
    public static final String[] expectedElementsSubmenuMedicaidItemURLs = {"https://www.aetna.com/individuals-families/medicaid-coverage.html", "https://www.aetna.com/dsepublicContent/assets/html/content.html?resource=aetna-medicaid"};

    // EXPECTED Customer Identifier Box Names (String[])
    public static final String[] expectedElementsCustomerIdentifierNames = {"Individuals", "Employers", "Providers", "Agents/Brokers"};
    // EXPECTED Customer Identifier Box URLs (String[])
    public static final String[] expectedElementsCustomerIdentifierURLs = {"https://www.aetna.com/individuals-families.html", "https://www.aetna.com/employers-organizations.html", "https://www.aetna.com/health-care-professionals.html", "https://www.aetna.com/insurance-producer.html"};

    // EXPECTED Miscellaneous Grid Box Names (String[])
    public static final String[] expectedElementsMiscellaneousGridBoxesNames = {"Health News", "About Us", "Careers"};
    // EXPECTED Miscellaneous Grid Box URLs (String[])
    public static final String[] expectedElementsMiscellaneousGridBoxesURLs = {"https://news.aetna.com/", "https://www.aetna.com/about-us.html", "https://www.aetnacareers.com/"};

    // EXPECTED Social Media Icon Count (Integer)
    public static final int expectedElementIconSocialMediaCount = 5;
    // EXPECTED Social Media Icon Name (String [])
    public static final String[] expectedElementsIconSocialMediaNames = {"instagram", "facebook", "twitter", "youtube", "linkedin"};
    // EXPECTED Social Media Icon URLs (String [])
    public static final String[] expectedElementsIconSocialMediaURLs = {"https://www.instagram.com/aetna/?hl=en", "https://www.facebook.com/aetna", "https://twitter.com/aetna", "https://www.youtube.com/aetna", "https://www.linkedin.com/company/aetna"};

    // Travel Info Hover Button (id)
    public static final String webElementButtonTravelInfo = "headSectab1";

}
