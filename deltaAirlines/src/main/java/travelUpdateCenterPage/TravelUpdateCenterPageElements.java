package travelUpdateCenterPage;

public class TravelUpdateCenterPageElements {

    /**
     * HEADER
     */
    // Travel Update Center Dropdown Button (xPath)
    public static final String webElementButtonTravelUpdateCenter = "//a[contains(text(),'Travel Update Center')]";
    // Travel Update Center Dropdown Button (CSS)
    public static final String webElementMenuTravelUpdateCenterDropdown = "ul#accordion2";
    // Travel Update Center - 'Ways We're Keeping You Safe' Accordion Button (CSS)
    public static final String webElementButtonAccordionWaysWereKeepingYouSafe = "a[href*='#collapseInner4']";
    // Travel Update Center - 'Ways We're Keeping You Safe' Menu (CSS)
    public static final String webElementSubmenuWaysWereKeepingYouSafe = "ul#accordion2>li div#collapseInner4 ul";
    // Travel Update Center - 'From Delta to Our Customers' Accordion Button (CSS)
    public static final String webElementButtonAccordionFromDeltaToOurCustomers = "ul#accordion2>li div>a[href*='5']";
    // Travel Update Center - 'From Delta to Our Customers' Menu (CSS)
    public static final String webElementSubmenuFromDeltaToOurCustomers = "ul#accordion2>li div#collapseInner5 ul";
    // Travel Update Center - 'Flying? What You Need To Know' Accordion Button (CSS)
    public static final String webElementButtonAccordionFlyingWhatYouNeedToKnow = "ul#accordion2>li div>a[href*='6']";
    // Travel Update Center - 'Flying? What You Need To Know' Menu (CSS)
    public static final String webElementSubmenuFlyingWhatYouNeedToKnow = "ul#accordion2>li div#collapseInner6 ul";

    // Travel Update Center - 'From Delta to Our Customers' List Items (LIST) (CSS)
    private static final String webElementListFromDeltaToOurCustomers = "ul#accordion2>li div#collapseInner5 ul a";
    // GETTER - Travel Update Center - 'From Delta to Our Customers' List Items (LIST) (CSS)
    public static String getWebElementListFromDeltaToOurCustomers() {
        return webElementListFromDeltaToOurCustomers;
    }

    // Travel Update Center - 'Flying? What You Need To Know' List Items (LIST) (CSS)
    private static final String webElementListFlyingWhatYouNeedToKnow = "ul#accordion2>li div#collapseInner6 ul a";
    // GETTER - Travel Update Center - 'Flying? What You Need To Know' List Items (LIST) (CSS)
    public static String getWebElementListFlyingWhatYouNeedToKnow() {
        return webElementListFlyingWhatYouNeedToKnow;
    }

    // Travel Update Center List Items (LIST) (CSS)
    private static final String webElementListTravelUpdateCenterDropdown = "ul#accordion2 > li div > a";
    // GETTER - Travel Update Center List Items (LIST) (CSS)
    public static String getWebElementListTravelUpdateCenterDropdown() {
        return webElementListTravelUpdateCenterDropdown;
    }

    // Travel Update Center - 'Ways We're Keeping You Safe' List Items (LIST) (CSS)
    private static final String webElementListWaysWereKeepingYouSafe = "ul#accordion2>li div#collapseInner4 ul a";
    // GETTER - Travel Update Center - 'Ways We're Keeping You Safe' List Items (LIST) (CSS)
    public static String getWebElementListWaysWereKeepingYouSafe() {
        return webElementListWaysWereKeepingYouSafe;
    }

    /**
     * BODY
     */
    // Travel Update Button (CSS)
    public static final String webElementButtonTravelUpdate = "#BS4-hero > div:nth-child(6) > div > div > div > div:nth-child(3) a";
    // Coronavirus Update Center Grid (CSS)
    public static final String webElementGridCoronavirusUpdateCenter = "#maincontent > div.container-fluid div.container-fluid";
    // Coronavirus Update Center - "Travel Flexibility" Container (CSS)
    public static final String webElementContainerTravelFlexibility = "#maincontent div.container-fluid div" + ".col-sm-12:nth-child(1)>div.text >div";
    // Coronavirus Update Center - "Traveling With Us" Container (CSS)
    public static final String webElementContainerTravelingWithUs = "#maincontent div.container-fluid div.col-sm-12:nth-child(2)>div.text >div";
    // Coronavirus Update Center - "Caring For You" Container (CSS)
    public static final String webElementContainerCaringForYou = "#maincontent div.container-fluid div.col-sm-12:nth-child(3)>div.text >div";
    // "Show All Coronavirus Recent Updates" Accordion Button (xPath)
    public static final String webElementButtonAccordionShowAllRecentCoronavirusUpdates = "//*[@id=\"maincontent\"]//a[@class=\"details-controller\"]";
    // "Show All Coronavirus Recent Updates" Accordion Button EXPANDED (xPath)
    public static final String webElementButtonExpandedAccordionShowAllRecentCoronavirusUpdates = "//*[@id=\"maincontent\"]//a[@class=\"details-controller active\"]";
    // "Show All Coronavirus Recent Updates" Accordion Container EXPANDED (xPath)
    public static final String webElementContainerShowAllRecentCoronavirusUpdates = "//*[@id=\" All recent Coronavirus updates\"]/ul";
    // "Other Updates and Travel Tips" Container (CSS)
    public static final String webElementContainerOtherUpdatesAndTravelTips = "#maincontent > div:nth-child(15) > div";
    // "Delta Sky Club Updates" - "Other Updates and Travel Tips" Container (CSS)
    public static final String webElementLinkDeltaSkyClubUpdates = "#maincontent > div:nth-child(15) > div >div a[href*='corona']";
    // "Download The Fly Delta App" - "Other Updates and Travel Tips" Container (CSS)
    public static final String webElementLinkDownloadTheFlyDeltaApp = "#maincontent > div:nth-child(15) > div >div a[href*='delta-digital']";
    // "Flying With A Partner Airline" - "Other Updates and Travel Tips" Container (CSS)
    public static final String webElementLinkFlyingWithAPartnerAirline = "#maincontent > div:nth-child(15) > div >div a[href*='partner-airline']";
    // "Frequently Asked Questions" Container (CSS)
    public static final String webElementContainerFrequentlyAskedQuestions = "#maincontent > div:nth-child(23) div[class*='row']";

    // Coronavirus Update Center - Grid Headers (LIST) (CSS)
    private static final String webElementListCoronavirusUpdateCenterGridHeaders = "#maincontent div.container-fluid div.col-sm-12 div.text div.container>p:nth-child(1)>b";
    // GETTER - Coronavirus Update Center - Grid Headers (LIST) (CSS)
    public static String getWebElementListCoronavirusUpdateCenterGridHeaders() {
        return webElementListCoronavirusUpdateCenterGridHeaders;
    }

    // Coronavirus Update Center - "Travel Flexibility" Items List (LIST) (CSS)
    private static final String webElementListTravelFlexibility = "#maincontent div.container-fluid div.col-sm-12:nth-child(1) div.container >p span a";
    // GETTER - Coronavirus Update Center - "Travel Flexibility" Items List (LIST) (CSS)
    public static String getWebElementListTravelFlexibility() {
        return webElementListTravelFlexibility;
    }

    // Coronavirus Update Center - "Traveling With Us" Items List (LIST) (CSS)
    private static final String webElementListTravelingWithUs = "#maincontent div.container-fluid div.col-sm-12:nth-child(2) div.container >p span a";
    // GETTER - Coronavirus Update Center - "Traveling With Us" Items List (LIST) (CSS)
    public static String getWebElementListTravelingWithUs() {
        return webElementListTravelingWithUs;
    }

    // Coronavirus Update Center - "Caring For You" Items List (LIST) (CSS)
    private static final String webElementListCaringForYou = "#maincontent div.container-fluid div.col-sm-12:nth-child(3) div.container >p span a";
    // GETTER - Coronavirus Update Center - "Caring For You" Items List (LIST) (CSS)
    public static String getWebElementListCaringForYou() {
        return webElementListCaringForYou;
    }

    // "Show All Coronavirus Recent Updates" Expanded Accordion Links (LIST) (xPath)
    private static final String webElementListShowAllRecentCoronavirusUpdatesLinks = "//*[@id=\" All recent Coronavirus updates\"]/ul/li//a[contains(@href,'/')]";
    // GETTER - "Show All Coronavirus Recent Updates" Expanded Accordion Links (LIST) (xPath)
    public static String getWebElementListShowAllRecentCoronavirusUpdatesLinks() {
        return webElementListShowAllRecentCoronavirusUpdatesLinks;
    }

    // "Other Updates and Travel Tips" Container Header Titles (LIST) (CSS)
    private static final String webElementListOtherUpdatesAndTravelTipsHeaderTitles = "#maincontent > div:nth-child(15) > div >div span.card-headertxt";
    // GETTER - "Other Updates and Travel Tips" Container Header Titles (LIST) (CSS)
    public static String getWebElementListOtherUpdatesAndTravelTipsHeaderTitles() {
        return webElementListOtherUpdatesAndTravelTipsHeaderTitles;
    }

    // "Frequently Asked Questions" Grid Header Titles (LIST) (CSS)
    private static final String webElementListFrequentlyAskedQuestionsHeaderTitles = "#maincontent > div:nth-child(23) div[class*='row'] h3";
    // GETTER - "Frequently Asked Questions" Grid Header Titles (LIST) (CSS)
    public static String getWebElementListFrequentlyAskedQuestionsHeaderTitles() {
        return webElementListFrequentlyAskedQuestionsHeaderTitles;
    }

}
