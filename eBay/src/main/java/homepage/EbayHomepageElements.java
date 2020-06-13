package homepage;

public class EbayHomepageElements {

    // Expected Homepage Title [STRING]
    public static final String expectedElementHomepageTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
    //Search Category Drop Down by xpath
    public static final String webElementsSearchCategoryDropDown = "//select[@id='gh-cat']";
    //Search Category Items (list)
    public static final String webElementsSearchCategoryDropDownItems = "//select[@id=\"gh-cat\"]//option";
    //Expected Search category drop down items
    public static final String[] expectedSearchCategoryDropDownItems = {"All Categories", "Antiques", "Art","Baby","Books",
            "Business & Industrial", "Cameras & Photo","Cell Phones & Accessories","Clothing, Shoes & Accessories","Coins & Paper Money","Collectibles",
            "Computers/Tablets & Networking","Consumer Electronics","Crafts","Dolls & Bears","DVDs & Movies","eBay Motors","Entertainment Memorabilia","Gift Cards & Coupons",
            "Health & Beauty","Home & Garden","Jewelry & Watches","Music","Musical Instruments & Gear","Pet Supplies","Pottery & Glass","Real Estate","Specialty Services",
            "Sporting Goods","Sports Mem, Cards & Fan Shop","Stamps","Tickets & Experiences","Toys & Hobbies","Travel","Video Games & Consoles","Everything Else"};
    //daily deals by xpath
    public static final String webElementDailyDeals = "//a[@class='gh-p'][contains(text(),'Daily Deals')]";
    //daily deals expected title page
    public static final String expectedDailyDealsTitle = "Daily Deals on eBay | Best deals and Free Shipping";
    //Sign In button by css
    public static final String webElementSignIn = "//*[@id=\"gh-ug\"]/a";
    //Sign In page expected title
    public static final String expectedSignInPageTitle = "Sign in or Register | eBay";
    //Shopping cart icon button by className
    public static final String webElementShoppingCart = "//*[@id=\"gh-minicart-hover\"]/div/a[1]";
    //Shopping cart expected title
    public static final String expectedShoppingCartTitle = "eBay shopping cart";
    //My Ebay button by xpath
    public static final String webElementSellPage = "//*[@id=\"gh-p-2\"]/a";
    // Sell page expected title
    public static final String expectedSellPageTitle = "Selling on eBay | Electronics, Fashion, Home & Garden | eBay";
    //Help & Contact button by xpath
    public static final String webElementHelpAndContact = "//*[@id=\"gh-p-3\"]/a";
    // Help & contact page title
    public static final String  expectedHelpAndContactTitle = "eBay Customer Service";
    // Direct to motors page from homepage
    public static final String webElementMotorsPage = "//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a";
    // Expected motors page title
    public static final String expectedMotorsPageTitle = "eBay Motors: Auto Parts and Vehicles | eBay";
    // Direct to Fashion page from homepage
    public static final String webElementFashionPage ="//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a";
    // Expected Fashion page title
    public static final String expectedFashionPageTitle = "Fashion products for sale | eBay";
    //Direct to Electronics page from homepage
    public static final String webElementElectronicsPage ="//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a";
    //Expected Electronics page title
    public static final String expectedElectronicsPageTitle = "Electronics products for sale | eBay";
    //Direct to Collectibles & Art page from homepage
    public static final String webElementCollectiblesAndArtPage ="//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a";
    //Expected Collectibles & Art page title
    public static final String expectedCollectiblesAndArtPageTitle = "Collectibles & Art products for sale | eBay";
    // Shop By Category (xPath)
    public static final String webElementShopByCategoryDropdown = "//button[@id='gh-shop-a']";
    // Shop By Category Drop down Menu Items
    public static final String webElementsShopByCategoryDropdownItems = "//*[@id=\"gh-sbc\"]/tbody/tr//h3//a";
    //Expected Shop by Category Items
    public static final String[] expectedShopByCategoryItems ={"Collectibles & art", "Electronics","Entertainment memorabilia",
            "Fashion","Home & garden","Motors", "Sporting goods","Toys & hobbies", "Other categories","All Brands", "All Categories" };
    // ShopByCategoryDropdownCount
    public static final int expectedElementShopByCategoryDropdownCount = 11;
    //Next carousel Slide button by xpath
    public static final String webElementCarouselNextSlide = "//div[@class='carousel hl-carousel carousel--slides carousel__autoplay']//button[@class='carousel__control carousel__control--next']";
    //Previous carousel Slide button by xpath
    public static final String webElementCarouselPrevSlide = "//div[@class='carousel hl-carousel carousel--slides carousel__autoplay']//button[@class='carousel__control carousel__control--prev']";
    //Carousel first slide text
    public static final String expectedCarouselText = "Huge savings at The Brand Outlet";
    //Carousel first slide text locater
    public static final String webElementCarouselSlideText = "//*[@id=\"s0-0-35-3-0-2[0]-2-match-media-0-ebay-carousel-list\"]/li[1]/div/div[1]/div/h2/a/div/span";
    //eBay Sites box
    public static final String webElementEbaySitesBox = "//*[@id=\"gf-fbtn\"]";
    //eBay sites countries list
    public static final String webElementEbaySitesList = "//*[@id=\"gf-f\"]/ul/li";
    //expected number of EbaySites
    public static final int expectedEbaySitesListNum = 49;
    //expected eBay sites list
    public static final String[] expectedEbaySitesList ={ "Argentina","Australia", "Austria", "Belarus", "Belgium","Bolivia", "Brazil","Canada","Chile",
    "China", "Colombia","Costa Rica","Dominican Republic","Ecuador","El Salvador", "France","Germany","Guatemala","Honduras","Hong Kong","India","Ireland",
    "Israel","Italy","Japan","Kazakhstan","Korea","Malaysia","Mexico","Netherlands","Nicaragua","Panama","Paraguay","Peru","Philippines","Poland","Portugal",
            "Puerto Rico","Russia","Singapore","Spain","Sweden","Switzerland","Taiwan","Thailand","Turkey","United Kingdom","Uruguay","Venezuela"};
    //COVID-19 page
    public static final String webElementAboutEbay= "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li";

    public static final int expectedAboutEbayNum = 12;

    public static final String[] expectedAboutEbayList ={"About eBay","Company info","News","Investors","Careers","Diversity & Inclusion","Global Impact",
            "Government relations", "Advertise with us", "Policies","Verified Rights Owner (VeRO) Program","eCI Licenses"};

    public static final String webElementSearchBar = "//*[@id=\"gh-ac\"]";

    public static final String webElementSearchButton = "//*[@id=\"gh-btn\"]";

    public static final String expectedHandSanitizerTitle = "Hand Sanitizer | eBay";

    public static final String webElementItemToAdd = "//*[@id=\"srp-river-results\"]/ul/li[6]/div/div[2]/a/h3";

    public static final String webElementAddToCartButton = "//*[@id=\"atcRedesignId_btn\"]";

    public static final String webElementGoToCartButton = "//*[@id=\"atcRedesignId_overlay-atc-container\"]/div/div[1]/div/div[2]/a[2]";

    public static final String webElementItemText = "//*[@id=\"mainContent\"]/div/div[3]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/h3/span/a/span/span";

    public static final String expectedItemText = "Purell Advanced Hand Sanitizer, Clean Scent, 1 fl oz Portable flip Cap - 12 Pack";

    public static final String webElementEbayLogo = "//*[@id=\"gh-la\"]";

    public static final String webElementMiniCart = "//*[@id=\"gh-minicart-hover\"]/div/a[1]";

    public static final String webElementDeleteIcon ="//*[@id=\"gh-minicart-hover-body\"]/div/div/div[2]/div/button";

    public static final String webElementMiniCartEmpty = "//*[@id=\"gh-minicart-hover-body\"]/div/div/div[1]/span[1]";

    public static final String expectedMiniCartEmptyText = "Shopping cart";

    public static final String webElementHelpButton = "//*[@id=\"i-faq\"]";

    public static final String webElementFAQText = "//*[@id=\"OC2885\"]";

    public static final String expectedFAQText = "Where can I find updates to the searches and sellers I've saved?";

    }

