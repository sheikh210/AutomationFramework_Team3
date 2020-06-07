package homepage;

public class ESPNHomepageElements {

    /**
     * HEADER
     */

    // EXPECTED Homepage Title [STRING]
    public static final String expectedElementHomepageTitle = "ESPN: Serving sports fans. Anytime. Anywhere.";

    // Top Events Dropdown (xPath)
    public static final String webElementTopEventsDropdown = "//button[contains(text(),'Top Events')]";

    // Top Events Dropdown Menu Box (CSS)
    public static final String webElementTopEventsDropdownMenu = "#global-scoreboard > div > div > div.scoreboard-dropdown-wrapper.scoreboard-menu > div.dropdown-wrapper.league-nav-desktop.desktop-dropdown.hoverable > ul";

    // Top Events Dropdown Menu Box Items (xPath)
    public static final String webElementTopEventsDropdownMenuItems = "//*[@id=\"global-scoreboard\"]/div/div/div[1]/div[2]/ul/li/a";

    // EXPECTED - Top Events Dropdown Menu Items Count (Integer)
    public static final int expectedElementTopEventsDropdownCount = 8;

    // Featured Hover Box (xPath)
    public static final String webElementFeaturedHoverBox = "//*[@id=\"leagues\"]//div[@class=\"scoreEvent scoreEvent--featured\"]";

    // Featured Hover Box Hidden (xPath)
    public static final String webElementFeaturedHoverHidden = "//*[@id=\"leagues\"]//div[@class=\"scoreEvent scoreEvent--featured\"]//a[contains(text(),'Full Coverage')]";

    // EXPECTED - Featured Hover Box Expected Link [STRING]
    public static final String expectedElementFeaturedHoverBoxLink = "Full Coverage\nhttps://fantasy.espn.com/games/ufc-250-pickem/make-picks?addata=ufc250pickem_ufc_web_headerscoreboard_p1";

    // Header Scroll Right Arrow (CSS)
    public static final String webElementHeaderScrollRight = "#global-scoreboard > div > div > div.scores-next.controls";

    // Header Scroll Left Arrow (CSS)
    public static final String webElementHeaderScrollLeft = "#global-scoreboard > div > div > div.scores-prev.controls";

    // EXPECTED - Header Dropdowns List Size
    public static final int expectedHeaderDropdownListSize = 9;

    // NFL Dropdown (CSS)
    public static final String webElementNFLDropdown = "#global-nav > ul > li.sports.menu-nfl > a > span";

    // NFL Dropdown Menu (Left Section) (xPath)
    public static final String webElementNFLDropdownMenuLeft = "//*[@id=\"global-nav\"]/ul/li[1]/div/ul[1]";

    // NFL Dropdown Menu Items (Left Section) [LIST] (CSS)
    public static final String webElementNFLDropdownMenuItemsLeft = "#global-nav > ul > li.sports.menu-nfl>div>ul:nth-child(1)>li:not([style*=\"display: none;\"])>a>span>span:not([class*=\"link-text-short\"])";

    // EXPECTED - NFL Dropdown Menu Items Actual (Left Section) [String []]
    public static final String[] expectedElementNFLDropdownMenuItemsLeft = {"Home", "Scores", "Schedule", "Teams", "Standings", "Stats", "Draft", "Depth Charts", "Free Agency"};

    // NFL Dropdown Menu Links (Left Section) [LIST] (CSS)
    public static final String webElementNFLDropdownMenuLinksLeft = "#global-nav > ul > li.sports.menu-nfl>div>ul:nth-child(1)>li:not([style*=\"display: none;\"])>a";

    // EXPECTED - NFL Dropdown Menu Link Page Titles (Left Section) [String []]
    public static final String[] expectedElementNFLDropdownMenuLeftPageTitles = {"NFL Football Teams, Scores, Stats, News, Standings, Rumors - National Football League - ESPN", "NFL Football Scores - NFL Scoreboard - ESPN", "2020 NFL Schedule",
            "NFL Teams | ESPN", "2019 NFL Standings | ESPN", "2019 NFL Stat Leaders | ESPN", "NFL Draft 2020 News - ESPN Draftcast", "2020 NFL depth charts for all 32 teams","NFL Free Agency - ESPN"};

    // NFL Dropdown Menu Links (Left Section) [String []]
    public static final String [] expectedElementNFLDropdownMenuLeftLinks = {"https://www.espn.com/nfl/", "https://www.espn.com/nfl/scoreboard", "https://www.espn.com/nfl/schedule", "https://www.espn.com/nfl/teams", "https://www.espn.com/nfl/standings",
            "https://www.espn.com/nfl/stats", "https://www.espn.com/nfl/draft/news", "https://www.espn.com/nfl/story/_/id/29098001/2020-nfl-depth-charts-all-32-teams", "https://www.espn.com/nfl/nfl-free-agency/"};

    // NFL Dropdown Menu (Right Section) (CSS)
    public static final String webElementNFLDropdownMenuRight = "#global-nav > ul > li.sports.menu-nfl.hover > div > ul:nth-child(2) > li > div";

    // NFL Dropdown Menu - NFL Divisions (Right Section) [LIST] (CSS)
    public static final String webElementNFLDropdownMenuDivisions = "#global-nav > ul > li.sports.menu-nfl > div > ul:nth-child(2) > li > div > ul>li>span>span:not([class*=\"link-text-short\"])";

    // NFL Dropdown Menu - Expected NFL Division Names (Right Section) [STRING []]
    public static final String[] expectedElementNFLDivisions = {"AFC East", "AFC North", "AFC South", "AFC West", "NFC East", "NFC North", "NFC South", "NFC West"};

    // NFL Dropdown Menu - NFL Teams (Right Section) [LIST] (CSS)
    public static final String webElementNFLDropdownMenuTeams = "#global-nav > ul > li.sports.menu-nfl.hover > div > ul:nth-child(2) > li > div ul>li:not([class*=\"conference label group\"])>a>span>span:not([class*=\"link-text-short\"])";

    // EXPECTED NFL Dropdown Menu - NFL Teams Count (Right Section) [Integer]
    public static final int expectedNFLTeamsCount = 32;

    // EXPECTED NFL Dropdown Menu - NFL Team Names (Right Section) [STRING []]
    public static final String[] expectedNFLTeamNames = {"Buffalo Bills", "Miami Dolphins", "New England Patriots", "New York Jets", "Baltimore Ravens", "Cincinnati Bengals", "Cleveland Browns", "Pittsburgh Steelers", "Houston Texans", "Indianapolis Colts", "Jacksonville Jaguars", "Tennessee Titans",
            "Denver Broncos", "Kansas City Chiefs", "Las Vegas Raiders", "Los Angeles Chargers", "Dallas Cowboys", "New York Giants", "Philadelphia Eagles", "Washington Redskins", "Chicago Bears", "Detroit Lions", "Green Bay Packers", "Minnesota Vikings", "Atlanta Falcons", "Carolina Panthers",
            "New Orleans Saints", "Tampa Bay Buccaneers", "Arizona Cardinals", "Los Angeles Rams", "San Francisco 49ers", "Seattle Seahawks"};

    // NBA Dropdown (CSS)
    public static final String webElementNBADropdown = "#global-nav > ul > li.sports.menu-nba > a > span";

    // NBA Dropdown (Left Section) (CSS)
    public static final String webElementNBADropdownMenuLeft = "#global-nav > ul > li.sports.menu-nba.hover > div > ul:nth-child(1)";

    // NBA Dropdown Menu Items (Left Section) [LIST] (CSS)
    public static final String webElementNBADropdownMenuItemsLeft = "#global-nav > ul > li.sports.menu-nba.hover > div > ul:nth-child(1) > li:not([style*=\"display: none;\"])>a>span>span:not([class=\"link-text-short\"])";

    // EXPECTED - NBA Dropdown Menu Items Actual (Left Section) [String []]
    public static final String[] expectedElementNBADropdownMenuItemsLeft = {"Home", "Orlando Playoffs", "The Last Dance", "Scores", "Schedule", "Standings", "Stats", "Teams", "Draft"};

    // NBA Dropdown Menu Links (Left Section) [LIST] (CSS)
    public static final String webElementNBADropdownMenuLinksLeft = "#global-nav > ul > li.sports.menu-nba.hover > div > ul:nth-child(1)>li:not([style*=\"display: none;\"])>a";

    // NBA Dropdown Menu Links (Left Section) [String []]
    public static final String[] expectedElementNBADropdownMenuLeftLinks = {"https://www.espn.com/nba/", "https://www.espn.com/nba/story/_/id/28911848/when-nba-return-latest-updates-amid-coronavirus-suspension", "https://www.espn.com/nba/story/_/id/28973557/the-last-dance-updates-untold-story-michael-jordan-chicago-bulls",
            "https://www.espn.com/nba/scoreboard", "https://www.espn.com/nba/schedule", "https://www.espn.com/nba/standings", "https://www.espn.com/nba/stats", "https://www.espn.com/nba/teams", "http://www.espn.com/nba/draft/news"};

    // NBA Dropdown Menu (Right Section) (CSS)
    public static final String webElementNBADropdownMenuRight = "#global-nav > ul > li.sports.menu-nba.hover > div > ul:nth-child(2) > li > div";

    // NBA Dropdown Menu - NBA Divisions (Right Section) [LIST] (CSS)
    public static final String webElementNBADropdownMenuDivisions = "#global-nav > ul > li.sports.menu-nba.hover > div > ul:nth-child(2) > li > div >ul>li[class*=\"conference label group\"]>span>span:not([class*=\"link-text-short\"])";

    // NFL Dropdown Menu - Expected NFL Division Names (Right Section) [STRING []]
    public static final String[] expectedElementNBADivisions = {"Atlantic", "Central", "Southeast", "Pacific", "Southwest", "Northwest"};

    // NFL Dropdown Menu - NFL Teams (Right Section) [LIST] (CSS)
    public static final String webElementNBADropdownMenuTeams = "";

    // EXPECTED NFL Dropdown Menu - NFL Teams Count (Right Section) [Integer]
    public static final int expectedNBATeamsCount = 30;

    // EXPECTED NFL Dropdown Menu - NFL Team Names (Right Section) [STRING []]
    public static final String[] expectedNBATeamNames = {"Buffalo Bills", "Miami Dolphins", "New England Patriots", "New York Jets", "Baltimore Ravens", "Cincinnati Bengals", "Cleveland Browns", "Pittsburgh Steelers", "Houston Texans", "Indianapolis Colts", "Jacksonville Jaguars", "Tennessee Titans",
            "Denver Broncos", "Kansas City Chiefs", "Las Vegas Raiders", "Los Angeles Chargers", "Dallas Cowboys", "New York Giants", "Philadelphia Eagles", "Washington Redskins", "Chicago Bears", "Detroit Lions", "Green Bay Packers", "Minnesota Vikings", "Atlanta Falcons", "Carolina Panthers",
            "New Orleans Saints", "Tampa Bay Buccaneers", "Arizona Cardinals", "Los Angeles Rams", "San Francisco 49ers", "Seattle Seahawks"};




    // MLB Dropdown (xPath)
    public static final String webElementMLBDropdown = "//a[@name='&lpos=sitenavdefault+sitenav_mlb']";

    // NCAAF Dropdown (xPath)
    public static final String webElementNCAAFDropdown = "//a[@name='&lpos=sitenavdefault+sitenav_ncf']";

    // Soccer Dropdown (xPath)
    public static final String webElementSoccerDropdown = "//a[@name='&lpos=sitenavdefault+sitenav_soccer']";

    // MMA Dropdown (xPath)
    public static final String webElementMMADropdown = "//a[@name='&lpos=sitenavdefault+sitenav_mma']";

    /**
     * BODY
     *
     */




    /**
     * FOOTER
     */

}
