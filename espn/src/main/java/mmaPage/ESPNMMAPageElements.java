package mmaPage;

public class ESPNMMAPageElements {
    /**
     * Navigate to MMAPage
     */
    //MAA Button by xpath
    public static final String WebElementMMAButton="//a[contains(@name,'&lpos=sitenavdefault+sitenav_mma')]";
    public static final String WebElementMMAHomeButton="//a[@name='&lpos=sitenavdefault+mma_mmaindex']";
    /**
     * Header
     */
    //Schedule button by xpath
    public static final String WebElementMMAScheduleButton="//a[@name='&lpos=subnav+subnav_mma_schedule/results']";
    //Play UFC Fight night button by xpath
    public static final String WebElementPlayUFCFightButton="//a[contains(@name,\"&lpos=subnav+subnav_mma_play_ufc_fight_night_pick'em\")]";
    //Fight Center by xpath
    public static final String WebElementFightCenterButton="//a[contains(@name,'&lpos=subnav+subnav_mma_fightcenter')]";
    //ESPN+ Best of UFC Button by xpath
    public static final String WebElementESPNBestFightsButton="//a[contains(@name,'&lpos=subnav+subnav_mma_best_of_ufc')]";
    // ESPN+ Menu items by xpath
    public static final String WebElementESPNBestMenu="//*[@id=\"fitt-analytics\"]/div/header/div[1]/nav[2]/ul/li[6]/span/div/div/div/ul/li/a";
    //mORE BUTTON by xpath
    public static final String webElementMoreButton="//*[@id=\"global-nav-secondary\"]/div/ul/li[8]/a";
    //more menu links by xpath
    public static final String webElementMoreMenuLinks="//*[@id=\"fitt-analytics\"]/div/header/div[1]/nav[2]/ul/li[10]/span/div/div//a";
    //Subscribe now by xpath
    public static final String webElementSubscribeNow="//a[@name='&lpos=espnplus:leftrail:upsellmodule']";
    //Quick links by xpath
    public static final String webElementQuickLinks="//*[@id=\"main-container\"]/div/section[1]/article[2]//a";
    //Fantasy links by xpath
    public static final String webElementFantasySection="//*[@id=\"main-container\"]/div/section[1]/article[6]//a";
    //ESPN Sites by xpath
    public static final String webElementESPNSites="//*[@id=\"main-container\"]/div/section[1]/article[7]//a";
    //ESPN Apps by xpath
    public static final String webElementESPNApps="//*[@id=\"main-container\"]/div/section[1]/article[8]//a";
}
