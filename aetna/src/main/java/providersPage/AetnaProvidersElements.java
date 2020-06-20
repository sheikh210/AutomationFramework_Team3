package providersPage;

import org.openqa.selenium.WebElement;

public class AetnaProvidersElements {

    /**
     * Navigate to providers page elements
     */
    //Providers link by xpath
    public static final String WebElementProvidersLink="//span[contains(@class,'headline__link link__text')][contains(text(),'Providers')]";
    /**
     * Header WebElements
     */
    // Contact us button by xpath
    public static final String WebElementContactUsButton="//li[@class='megamenu__nav--topItems']//a[contains(text(),'Contact us')]";
    // Spanish language by xpath
    public static final String WebElementSpanishLanguageButton="//a[@class='link--localeselector']";
    // Search box by xpath
    public static final String WebElementSearchBox="//input[@id='globalSearch']";
    // HSA search result by xpath
    public static final String WebElementHsaSearch="//span[@class='redText']";
    // Explore menu button
    public static final String webElementExploreAetnaSitesButton = "body > div.header.headerwithmegamenu > div > header > div > nav > div:nth-child(3) > div > div.lang-select.dropdown > button";
    // Explore Aetna site menu by xpath
    public static final String WebElementExploreMenu="//ul[@class='langSelect-dropdown dropdown-menu show']//a";
    // Claims button by xpath
    public static final String WebElementClaimsButton="/html/body/div[2]/div/nav/div/ul[1]/li[2]/div[1]/button";
    // Health care providers button by xpath
    public static final String WebElementHealthCareProvidersButton="//html/body/div[2]/div/nav/div/ul[1]/li[2]/div[2]/div/div/section/ul/li[1]/div[1]/button";
    // Health care providers sub items by xpath
    public static final String WebElementHealthCareProvidersSubItems="//ul[@class='megamenu__tertiary--main']//a";

    /**
     * Body
     */
    //Video Play button by xpath
    public static final String WebElementVideoPlayButton="//*[@id=\"player_uid_579228291_1\"]/div[4]/button";
    // View transcript by id
    public static final String WebElementViewTranscriptButton ="link_content_section_textwithmedia_largemedia_inpagetranscriptcontent_1";
    //Transcript text by class name
    public static final String WebElementTranscriptText="accordian__elemcontent";
    // CoronaVirus Fact button by xpath
    public static final String WebElementResourceLink ="//a[contains(text(),'Resources')]";
    // Quick links by xpath
    public static final String WebElementQuickLinks="//*[@id=\"content__main\"]/div[1]/div//div/div[2]/div/div[2]/div//a";
    // News Letter by xpath
    public static  final String WebElementNewsLetter="//span[contains(text(),'Read provider newsletters')]";
    // Explore Health Care link by xpath
    public static final String WebElementExploreHealthCareLink="//span[contains(text(),'Explore health care resources')]";
    //Helpful links by xpath
    public static final String WebElementHelpfulLinks="//*[@id=\"content__main\"]/div[7]/div/div/div/div[3]/div/div[3]/div/div/div[1]//a";

    /**
     * Footer
     */
    //footer sections links by xpath
    public static final String WebElementFooterSocialMediaLinks ="//ul[@class='social__wrapper']//a";
    // Instagram icon by xpath
    public static final String WebElementInstagramIcon="//span[@class='instagram-icon']";
    // Facebook icon by xpath
    public static final String WebElementFacebookIcon="//span[@class='facebook-icon']";


}
