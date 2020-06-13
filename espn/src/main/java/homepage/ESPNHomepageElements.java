package homepage;

public class ESPNHomepageElements {

    /**
     * HEADER
     */

    // EXPECTED Homepage Title [String]
    public static final String expectedElementHomepageTitle = "ESPN: Serving sports fans. Anytime. Anywhere.";
    // Top Events Dropdown (xPath)
    public static final String webElementTopEventsDropdown = "//button[contains(text(),'Top Events')]";
    // Top Events Dropdown Menu Box (CSS)
    public static final String webElementTopEventsDropdownMenu = "#global-scoreboard > div > div > div.scoreboard-dropdown-wrapper.scoreboard-menu > div.dropdown-wrapper.league-nav-desktop.desktop-dropdown.hoverable > ul";
    // Top Events Dropdown Menu Box Items (xPath)
    public static final String webElementTopEventsDropdownMenuItems = "//*[@id=\"global-scoreboard\"]/div/div/div[1]/div[2]/ul/li/a";
    // EXPECTED - Top Events Dropdown Menu Items Count (Integer)
    public static final int expectedElementTopEventsDropdownCount = 10;
    // UFC Scroll Header Tile (CSS)
    public static final String webElementUFCHeaderTile = "#leagues > li:nth-child(1) > div > div.scoreLabel.mma.js-show > div";
    // Header Scroll Right Arrow (CSS)
    public static final String webElementHeaderScrollRight = "#global-scoreboard > div > div > div.scores-next.controls";
    // Header Scroll Left Arrow (CSS)
    public static final String webElementHeaderScrollLeft = "#global-scoreboard > div > div > div.scores-prev.controls";
    // EXPECTED - Header Dropdowns List Size (Integer)
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
    // NFL Dropdown Menu - Expected NFL Division Names (Right Section) [String []]
    public static final String[] expectedElementNFLDivisions = {"AFC East", "AFC North", "AFC South", "AFC West", "NFC East", "NFC North", "NFC South", "NFC West"};
    // NFL Dropdown Menu - NFL Teams (Right Section) [LIST] (CSS)
    public static final String webElementNFLDropdownMenuTeams = "#global-nav > ul > li.sports.menu-nfl.hover > div > ul:nth-child(2) > li > div ul>li:not([class*=\"conference label group\"])>a>span>span:not([class*=\"link-text-short\"])";
    // EXPECTED NFL Dropdown Menu - NFL Teams Count (Right Section) [Integer]
    public static final int expectedNFLTeamsCount = 32;
    // EXPECTED NFL Dropdown Menu - NFL Team Names (Right Section) [String []]
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
    // NBA Dropdown Menu - Expected NBA Division Names (Right Section) [String []]
    public static final String[] expectedElementNBADivisions = {"Atlantic", "Central", "Southeast", "Pacific", "Southwest", "Northwest"};
    // NBA Dropdown Menu - NBA Teams (Right Section) [LIST] (CSS)
    public static final String webElementNBADropdownMenuTeams = "#global-nav > ul > li.sports.menu-nba.hover > div > ul:nth-child(2)>li>div>ul>li[class*=\"team\"]>a>span>span:not([class*=\"link-text-short\"])";
    // EXPECTED NBA Dropdown Menu - NBA Teams Count (Right Section) [Integer]
    public static final int expectedNBATeamsCount = 30;
    // EXPECTED NBA Dropdown Menu - NBA Team Names (Right Section) [String []]
    public static final String[] expectedNBATeamNames = {"Boston Celtics", "Brooklyn Nets", "New York Knicks", "Philadelphia 76ers", "Toronto Raptors", "Chicago Bulls", "Cleveland Cavaliers", "Detroit Pistons", "Indiana Pacers", "Milwaukee Bucks", "Atlanta Hawks", "Charlotte Hornets",
            "Miami Heat", "Orlando Magic", "Washington Wizards", "Golden State Warriors", "LA Clippers", "Los Angeles Lakers", "Phoenix Suns", "Sacramento Kings", "Dallas Mavericks", "Houston Rockets", "Memphis Grizzlies", "New Orleans Pelicans", "San Antonio Spurs", "Denver Nuggets",
            "Minnesota Timberwolves", "Oklahoma City Thunder", "Portland Trail Blazers", "Utah Jazz"};
    // MLB Dropdown (CSS)
    public static final String webElementMLBDropdown = "#global-nav > ul > li.sports.menu-mlb > a > span";
    // MLB Dropdown (Left Section) (CSS)
    public static final String webElementMLBDropdownMenuLeft = "#global-nav > ul > li.sports.menu-mlb.hover > div > ul:nth-child(1)";
    // MLB Dropdown Menu Items (Left Section) [LIST] (CSS)
    public static final String webElementMLBDropdownMenuItemsLeft = "#global-nav > ul > li.sports.menu-mlb.hover > div > ul:nth-child(1) > li:not([style*=\"display: none;\"])>a>span>span:not([class=\"link-text-short\"])";
    // EXPECTED - MLB Dropdown Menu Items Actual (Left Section) [String []]
    public static final String[] expectedElementMLBDropdownMenuItemsLeft = {"Home", "Draft", "When could MLB return?", "KBO League", "Teams", "Scores", "Schedule", "Standings", "Stats"};
    // MLB Dropdown Menu Links (Left Section) [LIST] (CSS)
    public static final String webElementMLBDropdownMenuLinksLeft = "#global-nav > ul > li.sports.menu-mlb.hover > div > ul:nth-child(1)>li:not([style*=\"display: none;\"])>a";
    // MLB Dropdown Menu Links (Left Section) [String []]
    public static final String[] expectedElementMLBDropdownMenuLeftLinks = {"https://www.espn.com/mlb/", "https://www.espn.com/mlb/story/_/id/29144339/2020-mlb-draft-mock-drafts-rankings-order-more", "https://www.espn.com/mlb/story/_/id/28910482/when-mlb-actually-return-here-latest-hearing",
            "https://www.espn.com/mlb/story/_/id/29136672/kbo-espn-schedule-how-watch-teams-korea-baseball-league-more", "https://www.espn.com/mlb/teams", "https://www.espn.com/mlb/scoreboard", "https://www.espn.com/mlb/schedule", "https://www.espn.com/mlb/standings", "https://www.espn.com/mlb/stats"};
    // MLB Dropdown Menu (Right Section) (CSS)
    public static final String webElementMLBDropdownMenuRight = "#global-nav > ul > li.sports.menu-mlb.hover > div > ul:nth-child(2) > li > div";
    // MLB Dropdown Menu - MLB Divisions (Right Section) [LIST] (CSS)
    public static final String webElementMLBDropdownMenuDivisions = "#global-nav > ul > li.sports.menu-mlb.hover > div > ul:nth-child(2) > li > div >ul>li[class*=\"conference label group\"]>span>span:not([class*=\"link-text-short\"])";
    // MLB Dropdown Menu - Expected MLB Division Names (Right Section) [String []]
    public static final String[] expectedElementMLBDivisions = {"AL East", "AL Central", "AL West", "NL East", "NL Central", "NL West"};
    // MLB Dropdown Menu - MLB Teams (Right Section) [LIST] (CSS)
    public static final String webElementMLBDropdownMenuTeams = "#global-nav > ul > li.sports.menu-mlb.hover > div > ul:nth-child(2)>li>div>ul>li[class*=\"team\"]>a>span>span:not([class*=\"link-text-short\"])";
    // EXPECTED MLB Dropdown Menu - MLB Teams Count (Right Section) [Integer]
    public static final int expectedMLBTeamsCount = 30;
    // EXPECTED MLB Dropdown Menu - MLB Team Names (Right Section) [String []]
    public static final String[] expectedMLBTeamNames = {"Baltimore Orioles", "Boston Red Sox", "New York Yankees", "Tampa Blue Rays", "Toronto Blue Jays", "Chicago White Sox", "Cleveland Indians", "Detroit Tigers", "Kansas City Royals", "Minnesota Twins",
            "Houston Astros", "Los Angeles Angels", "Oakland Athletics", "Seattle Mariners", "Texas Rangers", "Atlanta Braves", "Miami Marlins", "New York Mets", "Philadelphia Phillies", "Washington Nationals", "Chicago Cubs", "Cincinnati Reds",
            "Milwaukee Brewers", "Pittsburgh Pirates", "St. Louis Cardinals", "Arizona Diamondbacks", "Colorado Rockies", "Los Angeles Dodgers", "San Diego Padres", "San Francisco Giants"};


    /**
     * BODY
     */

    // Disney iFrame (Register/Login) (xPath)
    public static final String webElementIFrame = "//div/iframe[@id=\"disneyid-iframe\"]";
    // Login Button (xPath)
    public static final String webElementButtonLogin = "//article[@id=\"sideLogin-left-rail\"]/button[2]";
    // Username or Email Address Field (xPath)
    public static final String webElementInputUsernameEmailAddress = "//*[@id=\"did-ui-view\"]//div[@class=\"field-group\"]//span/input[@type=\"email\"]";
    // Password Field (xPath)
    public static final String webElementInputPassword = "//*[@id=\"did-ui-view\"]//div[@class=\"field-group\"]//span/input[@type=\"password\"]";
    // Login Button (inside iFrame/Login form) (xPath)
    public static final String webElementButtonLoginFormLogin = "//*[@id=\"did-ui-view\"]//div[@class=\"btn-group touch-print-btn-group-wrapper\"]//button";
    // Login Error Message (xPath)
    public static final String webElementErrorLoginMessage = "//*[@id=\"did-ui-view\"]//div[@ng-repeat=\"item in parsedItems\"]";
    // EXPECTED Login Error Message
    public static final String expectedElementLoginErrorMessage = "The credentials you entered are incorrect.\nReminder: Passwords are case sensitive.";
    // ESPN Sites Container Header (Left Body) (CSS)
    public static final String webElementContainerESPNSitesHeader = "#main-container > div > section.col-one > article:nth-child(5) > div > header";
    // ESPN Sites Container List (Left Body) (CSS)
    public static final String webElementContainerESPNSitesList = "#main-container > div > section.col-one > article:nth-child(5) > div > ul";
    // ESPN Sites Container List Items (Left Body) [LIST] (CSS)
    public static final String webElementsContainerESPNSitesListItems = "#main-container > div > section.col-one > article:nth-child(5) > div > ul > li a div span";
    // EXPECTED ESPN Sites Container Header Title (Left Body)
    public static final String expectedElementESPNSitesHeaderTitle = "ESPN Sites";
    // EXPECTED ESPN Sites Container List Count (Left Body)
    public static final int expectedElementESPNSitesListCount = 6;
    // EXPECTED ESPN Sites Container List Item Names (Left Body)
    public static final String[] expectedElementsESPNSitesListItemNames = {"ESPN Deportes", "The Undefeated", "espnW", "ESPNFC", "X Games", "SEC Network"};
    // Follow ESPN Container Header (Left Body) (CSS)
    public static final String webElementContainerFollowESPNHeader= "#main-container > div > section.col-one > article:nth-child(7) > div > header > h2";
    // Follow ESPN Container List (Left Body) (CSS)
    public static final String webElementContainerFollowESPNList = "#main-container > div > section.col-one > article:nth-child(7) > div > ul";
    // ESPN Sites Container List Items (Left Body) [LIST] (CSS)
    public static final String webElementsContainerFollowESPNListItems = "#main-container > div > section.col-one > article:nth-child(7) > div > ul li div:not([class=\"quicklinks_list__icon\"])>span";
    // EXPECTED Follow ESPN Container Header Title (Left Body)
    public static final String expectedElementFollowESPNHeaderTitle = "Follow ESPN";
    // EXPECTED Follow ESPN Container List Count (Left Body)
    public static final int expectedElementFollowESPNListCount = 9;
    // EXPECTED ESPN Sites Container List Item Names (Left Body)
    public static final String[] expectedElementsFollowESPNListItemNames = {"Facebook", "Twitter", "Instagram", "Snapchat", "YouTube", "Quibi", "The ESPN Daily Podcast", "The ESPN Daily Newsletter", "ESPN Daily Calendar"};

}
