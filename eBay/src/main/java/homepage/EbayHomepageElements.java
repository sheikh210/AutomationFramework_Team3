package homepage;

public class EbayHomepageElements {

    // Expected Homepage Title [STRING]
    public static final String expectedElementHomepageTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
    // Shop By Category (xPath)
    public static final String webElementShopByCategoryDropdown = "//button[@id='gh-shop-a']";

    // Shop By Category Drop Down Menu
    public static final String webElementShopByCategoryDropdownMenu = "";

    // Shop By Category Drop down Menu Items
    public static final String webElementShopByCategoryDropdownMenuItems = "";

    // ShopByCategoryDropdownCount
    public static final int expectedElementShopByCategoryDropdownCount = 9;

    //Search Category Drop Down by xpath
    public static final String webElementsSearchCategoryDropDown = "//select[@id='gh-cat']";

    //Search Category Items (list)
    public static final String webElementsSearchCategoryDropDownItems = "//select[@id=\"gh-cat\"]//option";

    public static final String[] expectedSearchCategoryDropDownItems = {"All Categories", "Antiques", "Art","Baby","Books",
            "Business & Industrial", "Cameras & Photo","Cell Phones & Accessories","Clothing, Shoes & Accessories","Coins & Paper Money","Collectibles",
            "Computers/Tablets & Networking","Consumer Electronics","Crafts","Dolls & Bears","DVDs & Movies","eBay Motors","Entertainment Memorabilia","Gift Cards & Coupons",
            "Health & Beauty","Home & Garden","Jewelry & Watches","Music","Musical Instruments & Gear","Pet Supplies","Pottery & Glass","Real Estate","Specialty Services",
            "Sporting Goods","Sports Mem, Cards & Fan Shop","Stamps","Tickets & Experiences","Toys & Hobbies","Travel","Video Games & Consoles","Everything Else"};

    public static final String webElementSearchCategoryDropdownMenu = "";

    //daily deals by xpath
    public static final String webElementDailyDeals = "//a[@class='gh-p'][contains(text(),'Daily Deals')]";

    //daily deals expected title page
    public static final String expectedDailyDealsTitle = "Daily Deals on eBay | Best deals and Free Shipping";

    //Sign In button by css
    public static final String webElementSignIn = "//*[@id=\"gh-ug\"]/a";

    public static final String expectedSignInPageTitle = "Sign in or Register | eBay";

    //Shopping cart iron button by className
    public static final String webElementShoppingCart = "//*[@id=\"gh-minicart-hover\"]/div/a[1]";

    public static final String expectedShoppingCartTitle = "eBay shopping cart";

    //My Ebay button by xpath
    public static final String webElementSellPage = "//*[@id=\"gh-p-2\"]/a";

    public static final String expectedSellPageTitle = "Selling on eBay | Electronics, Fashion, Home & Garden | eBay";

    //Help & Contact button by xpath
    public static final String webElementHelpAndContact = "//a[@class='gh-p'][contains(text(),'Help & Contact')]";

    //Next carousel Slide button by xpath
    public static final String webElementCarouselNextSlide = "//div[@class='carousel hl-carousel carousel--slides carousel__autoplay']//button[@class='carousel__control carousel__control--next']";

    //Previous carousel Slide button by xpath
    public static final String webElementCarouselPrevSlide = "//div[@class='carousel hl-carousel carousel--slides carousel__autoplay']//button[@class='carousel__control carousel__control--prev']";
}
