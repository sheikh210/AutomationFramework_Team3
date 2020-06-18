package inHomePage;

import commonAPI.WebAPI;
import org.testng.Assert;


public class VerizonWirelessInHomePageWebElements {

    /**
     * Header
     */
    //InHome tab by xpath
    public static final String WebElementInHomeTab="//a[contains(text(),'In Home')]";
    //Shop Menu by xpath
    public static final String WebElementShopMenu= "//*[@id=\"vcm_menu1\"]";
    //Icons links by xpath
    public static final String WebElementIconsLinks="//*[@id=\"app\"]/div[2]/div/div/div/div/div/div";
    //Search Button by CSS
    public static final String WebElementSearchButton="#GHSearch > form > input[type=text]:nth-child(1)";
    //Fios Internet option by CSS
    public static final String WebElementFiosInternetOption="#vzw-gn > nav > div > div > div > div > ul > li:nth-child(1) > a";
    //TV Image link by CSS
    public static final String WebElementTvImage="//*[@id=\"scbResEspanolLink\"]";
    //InputSearchBox By xpath
    public static final String WebElementInputSearchBox="//*[@id=\"scbsearchtopinput\"]";
    // register NY times button
    public static final String WebElementRegisterNyButton="//a[contains(@class,'tiny-text-small medium-text-normal')]";
    // My Verizon tab by xpath
    public static final String WebElementMyVerizonTab="//*[@id=\"vcm_menu2\"]/a";
    //SignInText by xpath
    public static final String WebElementSignInText ="//*[@id=\"vcm_menu2\"]/a";
    //Support by xpath
    public static final String WebElementSupportTab="//*[@id=\"vcm_menu3\"]/a";
    //Watch TV by xpath
    public static final String WebElementWatchTvTab="//*[@id=\"vcm_menu4\"]/a";
    //Spanish language by xpath
    public static final String WebElementSpanishLanguage="//*[@id=\"scbResEspanolLink\"]";
    //Sign in Button
    public static final String WebElementSignInButton="//*[@id=\"a_signinoruname\"]";
    //HomePage Logo by xpath
    public static final String  WebElementHomePageLogo="//a[@id='logo-url']";
    //Validate Locate compass by xpath
    public static final String WebElementLocateCompass="//a[@id='vcm_compass_cart_icon_link']//*[local-name()='svg']";
    /**
     * Footer Web Elements
     */
    //Contact us Link by xpath
    public static final String WebElementContactUs="//*[@id=\"Need Help?-links\"]/li[1]/a";
    //Social media tabs by xpath
    public static final String WebElementSocialMediaTabs="//div[@class='social_icon']";
    //google play logo by xpath
    public static final String WebElementGooglePlayLogo="//a[@class='margin-left-tiny']//img";
    //My fios app link by xpath
    public static final String WebElementMyFiosAppLink="//a[contains(text(),'My Fios Account App')]";
    //Terms and conditions text by xpath
    public static final String WebElementTermsAndConditionsLink="//a[contains(text(),'Terms and Conditions')]";
    //text "Terms&Conditions" by xpath
    public static final String WebElementTermsAndConditionsText="//div[contains(text(),'Terms & Conditions')]";
    //Search by state button by xpath
    public static final String WebElementSearchByStateLink="//a[contains(text(),'Search by state')]";
    //Footer Section Links by xpath
    public static final String WebElementFooterSectionLinks="//div[@class='global-links']";



    /**
     * Expected elements
     */

    public static final String [] expectedElementSignInButtonLinks = {"https://www.verizon.com/home/myverizon/",
            "https://activate.verizon.com/register?goto=https%3a%2f%2fwww.verizon.com%2fconsumer%2fmyverizon%2frouter%3fTarget%3d&clientId=ghlogin&src=myverizon",
            "https://www.verizon.com/home/fiosmobileapps/"};




}
