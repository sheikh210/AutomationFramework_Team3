package protectYourEnterprisePage;

import org.openqa.selenium.support.ui.WebDriverWait;

public class ProtectYourEnterprisePageElements {

    /**
     * Elements used to navigate to "Protect Your Enterprise" Page
     */
    public static final String webElementButtonBusiness = "//a[@href='https://www.verizon.com/business/gateway/']";
    public static final String webElementButtonEnterprise = "//a[@href='https://enterprise.verizon.com/' and @tabindex='0']";
    public static final String webElementPopup = "//div[@id='ctryoverlay']";
    public static final String webElementButtonPopupClose = "#ctryoverlay > button";
    public static final String webElementButtonThreats = "#main > div.home-content.at-element-marker > div.clap8 div.scroll.c4.scroll > ul > li:nth-child(2)  a.thumb";
    public static final String webElementTextPageConfirm = "div.imagevideooverlay p";

    /**
     * HEADER
     */
    public static final String webElementDropdownProtectEnterprise = "ul.breadcrumb-list > li:nth-child(3)";
    private static final String webElementsListDropdownProtectEnterprise = "//ul[@class=\"bc-accordion\"]//ul[@class='inner siblings-breadcrumbs active']/li/a";
    public static String getWebElementsListDropdownProtectEnterprise() { return webElementsListDropdownProtectEnterprise; }


    /**
     * BODY
     */
    private static final String webElementsListPageNavBar = "#main div.anchornav ul li a";
    public static String getWebElementsListPageNavBar() { return webElementsListPageNavBar; }
    public static final String webElementIFrameYouTubePlayer = "#main div.section iframe";
    public static final String webElementButtonYouTubePlayerPlay = "#main div.imagevideo button";
    private static final String webElementsTextTitlesGridContainerOne = "#main > div.about div.grid div[class*='col-sm-6'] div > h2";
    public static String getWebElementsTextTitlesGridContainerOne() { return webElementsTextTitlesGridContainerOne; }
    private static final String webElementTextBodyGridContainerOneSectionOne = "#main > div.about > div.section:nth-child(1) > section > div.main >div.grid div.row div[class*='col-sm-6']:nth-child(2) div.text";
    public static String getWebElementTextBodyGridContainerOneSectionOne() { return webElementTextBodyGridContainerOneSectionOne; }
    private static final String webElementTextBodyGridContainerOneSectionTwo = "#main > div.about > div.section:nth-child(3) > section > div.main div.grid div.row div[class*='col-sm-6']:nth-child(2) div.text";
    public static String getWebElementTextBodyGridContainerOneSectionTwo() { return webElementTextBodyGridContainerOneSectionTwo; }
    public static final String webElementButtonContactUs = "#main > div.about a.secondary.button.vz-button-link";
    public static final String webElementTextPageConfirmContactUs = "div.support";
    private static final String webElementTextExpandStackContainers = "#main > div.about > div.clap8 ul:nth-child(1) >li h2";
    public static String getWebElementTextExpandStackContainers() { return webElementTextExpandStackContainers; }


}
