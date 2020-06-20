package nbapage;

public class ESPNnbapageElements {

    //Direct to NBApage from homepage
    public static final String webElementnbapage = "//*[@id=\"global-nav\"]/ul/li[2]/a/span/span[1]";

    public static final String verifyNBApageUrl = "https://www.espn.com/nba/";
    //ESPN link list
    public static final String webElementESPNPlusList = "//*[@id=\"main-container\"]/div/section[1]/article[1]/div/ul/li";

    public static final String webElementQuickLinksList = "//*[@id=\"main-container\"]/div/section[1]/article[2]/div/ul/li";

    public static final String webElementStatsBox = "//*[@id=\"global-nav-secondary\"]/div/ul/li[8]/a";

    public static final String webElementSubHeaderStatsList = "//*[@id=\"global-nav-secondary\"]/div/ul/li[8]/div/ul/li/a/span[1]";

    public static final String webElementTeamsBox = "//*[@id=\"global-nav-secondary\"]/div/ul/li[9]/a";

    public static final String webElementTeamsList = "//*[@id=\"global-nav-secondary\"]/div/ul/li[9]/div/ul/li/div/ul/li/a/span[1]";

    public static final String webElementPodcastsList = "//*[@id=\"main-container\"]/div/section[1]/article[5]/div/ul/li";

    public static final String webElementFantasyList = "//*[@id=\"main-container\"]/div/section[1]/article[6]/div/ul/li";

    public static final String webElementESPNSitesList = "//*[@id=\"main-container\"]/div/section[1]/article[7]/div/ul/li";

    public static final String webElementESPNAppsList = "//*[@id=\"main-container\"]/div/section[1]/article[8]/div/ul/li/a";

    public static final String webElementFollowESPNList = "//*[@id=\"main-container\"]/div/section[1]/article[9]/div/ul/li/a";

    public static final String webElementTopEventsDropdown = "//button[contains(text(),'Top Events')]";
    // Top Events Dropdown Menu Box (CSS)
    public static final String webElementTopEventsDropdownMenu = "#global-scoreboard > div > div > div.scoreboard-dropdown-wrapper.scoreboard-menu > div.dropdown-wrapper.league-nav-desktop.desktop-dropdown.hoverable > ul";
    // Top Events Dropdown Menu Box Items (xPath)
    public static final String webElementTopEventsDropdownMenuItems = "//*[@id=\"global-scoreboard\"]/div/div/div[1]/div[2]/ul/li/a";
    // EXPECTED - Top Events Dropdown Menu Items Count (Integer)
    public static final int expectedElementTopEventsDropdownCount = 12;



    public static final String webElementESPNFooterList = "//*[@id=\"main-container\"]/div/footer/div[2]/div/div[2]/ul/li/a";

    public static final String webElementNBADropdown = "#global-nav > ul > li.sports.menu-nba > a > span";
    // NBA Dropdown (Left Section) (CSS)
    public static final String webElementNBADropdownMenuLeft = "#global-nav > ul > li.sports.menu-nba.hover > div > ul:nth-child(1)";
    // NBA Dropdown Menu Items (Left Section) [LIST] (CSS)
    public static final String webElementNBADropdownMenuItemsLeft = "#global-nav > ul > li.sports.menu-nba.hover > div > ul:nth-child(1) > li:not([style*=\"display: none;\"])>a>span>span:not([class=\"link-text-short\"])";
    // NBA Dropdown Menu Links (Left Section) [LIST] (CSS)
    public static final String webElementNBADropdownMenuLinksLeft = "#global-nav > ul > li.sports.menu-nba.hover > div > ul:nth-child(1)>li:not([style*=\"display: none;\"])>a";

    public static final String[] expectedElementNBADropdownMenuLeftLinks = {"https://www.espn.com/nba/", "https://www.espn.com/nba/story/_/id/28911848/when-nba-return-latest-updates-amid-coronavirus-suspension", "https://www.espn.com/nba/story/_/id/28973557/the-last-dance-updates-untold-story-michael-jordan-chicago-bulls",
            "https://www.espn.com/nba/scoreboard", "https://www.espn.com/nba/schedule", "https://www.espn.com/nba/standings", "https://www.espn.com/nba/stats", "https://www.espn.com/nba/teams", "http://www.espn.com/nba/draft/news"};

    public static final String webElementMoreDropDownMenu = "//*[@id=\"global-nav-secondary\"]/div/ul/li[12]";

    public static final String webElementMoreDropDownMenuItems ="//*[@id=\"global-nav-secondary\"]/div/ul/li[12]/div/ul/li/a/span[2]";

    public static final String webElementMoreDropDownMenuLinks ="//*[@id=\"global-nav-secondary\"]/div/ul/li[12]/div/ul/li/a";
    // Header Scroll Right Arrow (CSS)
    public static final String webElementHeaderScrollRight = "#global-scoreboard > div > div > div.scores-next.controls";
    // Header Scroll Left Arrow (CSS)
    public static final String webElementHeaderScrollLeft = "#global-scoreboard > div > div > div.scores-prev.controls";




}
