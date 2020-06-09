package homepage;

public class AetnaHomepageElements {
  
    /**
     * HEADER
     */

    // EXPECTED Homepage Title [String]
    public static final String expectedElementHomepageTitle = "Health Insurance Plans | Aetna";

    // EXPECTED Search Results page title [String]
    public static final String expectedElementSearchResultsTitle = "Search Results";

    // Search Button - Header (xPath)
    public static final String webElementButtonSearchHeader = "//body//header//form//button[1]";

    // Search Input Field - Header (xPath)
    public static final String webElementInputSearchFieldHeader = "//input[@id='globalSearch']";

    // Search Term
    public static final String searchTerm = "Insurance Plans";

    // Search Results Page - Showing Results Text (xPath)
    public static final String webElementSearchResultsShowingResults = "//div[@id=\"main\"]//p//span";

    // 'Explore Aetna sites' Dropdown Button (CSS)
    public static final String webElementExploreAetnaSitesButton = "body > div.header.headerwithmegamenu > div > header > div > nav > div:nth-child(3) > div > div.lang-select.dropdown > button";

    // 'Explore Aetna sites' Dropdown Menu (CSS)
    public static final String webElementDropdownMenuExploreAetnaSites = "body > div.header.headerwithmegamenu > div > header > div > nav > div:nth-child(3) > div > div.lang-select.dropdown.show > ul";

    // 'Explore Aetna sites' Dropdown Menu Items [LIST] (CSS)
    public static final String webElementItemsDropdownMenuExploreAetnaSites1 = "body > div.header.headerwithmegamenu > div > header > div > nav > div:nth-child(3) > div > div.lang-select.dropdown.show > ul > li > a > span";

    // 'Explore Aetna sites' Dropdown Menu Items - Clickable [LIST] (CSS)
    public static final String webElementItemsDropdownMenuExploreAetnaSites2 = "body > div.header.headerwithmegamenu > div > header > div > nav > div:nth-child(3) > div > div.lang-select.dropdown.show > ul > li > a";

    // EXPECTED 'Explore Aetna sites' Dropdown Menu Item Count (Integer)
    public static final int expectedElementExploreAetnaSitesItemCount = 7;

    // EXPECTED 'Explore Aetna sites' Dropdown Menu Item Names (String[])
    public static final String[] expectedElementExploreAetnaSitesItemNames = {"Aetna.com", "For Providers", "For Employers", "For Agents/Brokers", "For Partners", "Careers", "About Us"};

    // EXPECTED 'Explore Aetna sites' Dropdown Menu Item Names (String[])
    public static final String[] expectedElementExploreAetnaSitesItemURL = {"https://www.aetna.com/individuals-families.html", "https://www.aetna.com/health-care-professionals.html", "https://www.aetna.com/employers-organizations.html",
            "https://www.aetna.com/insurance-producer.html", "https://www.aetna.com/partners.html", "https://www.aetnacareers.com/", "https://www.aetna.com/about-us.html"};

    // 'Shop for a plan' Button (xPath)
    public static final String webElementButtonShopForAPlan = "//div[@class=\"header headerwithmegamenu\"]/div/nav/div/ul/li/div/button[contains(text(),'Shop for a plan')]";

    // 'Shop for a plan' Menu - Left (CSS)
    public static final String webElementDropdownMenuShopForAPlan = "body > div.header.headerwithmegamenu > div > nav > div > ul.megamenu__primary.meganav__primary--left > li.megamenu__primary--item.active > div.megamenu__dropdown > div > div > section > ul";

    // 'Shop for a plan' Menu Items - Left (List) (CSS)
    public static final String webElementDropdownMenuShopForAPlanItemsLeft = "body > div.header.headerwithmegamenu > div > nav > div > ul.megamenu__primary.meganav__primary--left > li.megamenu__primary--item.active > div.megamenu__dropdown > div > div > section > ul button";

    // EXPECTED 'Shop for a plan' Dropdown Item Count (Integer)
    public static final int expectedElementShopForAPlanItemsListCount = 5;

    // EXPECTED 'Shop for a plan' Dropdown Item Names (String[])
    public static final String[] expectedElementShopForAPlanItemsListNames = {"Medicare", "Health coverage", "Dental, vision and supplemental", "Pharmacy", "Medicaid"};

    // 'Medicare' Button - 'Shop for a plan' Menu (CSS)
    public static final String webElementButtonMedicare = "body > div.header.headerwithmegamenu > div > nav > div > ul.megamenu__primary.meganav__primary--left > li.megamenu__primary--item.active > div.megamenu__dropdown > div > div > section > ul > li:nth-child(1) > div.megamenu__secondary--link.megamenu__secondary--inactive > button";

    // 'Medicare' Submenu (CSS)
    public static final String webElementSubmenuMedicare = "body > div.header.headerwithmegamenu > div > nav > div > ul.megamenu__primary.meganav__primary--left > li.megamenu__primary--item.active > div.megamenu__dropdown > div > div > section > ul > li.megamenu__secondary--item.megamenu__secondary--clicklink.secondaryblock--active > div.megamenu__tertiary--block > ul";

    // 'Medicare' Submenu Items (List) (CSS)
    public static final String webElementSubmenuMedicareItems = "body > div.header.headerwithmegamenu > div > nav > div > ul.megamenu__primary.meganav__primary--left > li.megamenu__primary--item.active > div.megamenu__dropdown > div > div > section > ul > li.megamenu__secondary--item.megamenu__secondary--clicklink.secondaryblock--active > div.megamenu__tertiary--block > ul > li";

}
