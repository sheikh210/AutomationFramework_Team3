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

    public static final String webElementIFrameYouTubePlayer = "#main div.section iframe";
    public static final String webElementButtonYouTubePlayerPlay = "#main div.imagevideo button";
    private static final String webElementsTextTitlesGridContainerOne = "#main > div.about div.grid div[class*='col-sm-6'] div > h2";
    private static final String webElementsTextBodyGridContainerOneSectionOne = "#main > div.about > div.section:nth-child(1) > section > div.main >div.grid div.row div[class*='col-sm-6']:nth-child(2) div.text";
    private static final String webElementsTextBodyGridContainerOneSectionTwo = "#main > div.about > div.section:nth-child(3) > section > div.main div.grid div.row div[class*='col-sm-6']:nth-child(2) div.text";
    public static final String webElementButtonContactUs = "#main > div.about a.secondary.button.vz-button-link";
    public static final String webElementTextPageConfirmContactUs = "div.support";
    public static final String webElementFirstExpandStackContainer = "#main > div.about > div.clap8 ul:nth-child(1) >li:nth-child(1)";
    public static final String webElementSecondExpandStackContainer = "#main > div.about > div.clap8 ul:nth-child(1) >li:nth-child(2)";
    public static final String webElementThirdExpandStackContainer = "#main > div.about > div.clap8 ul:nth-child(1) >li:nth-child(3)";
    public static final String webElementFourthExpandStackContainer = "#main > div.about > div.clap8 ul:nth-child(1) >li:nth-child(4)";
    public static final String webElementTitleFirstExpandStackContainer = "#main > div.about > div.clap8 ul:nth-child(1) >li:nth-child(1) h2";
    public static final String webElementTitleSecondExpandStackContainer = "#main > div.about > div.clap8 ul:nth-child(1) >li:nth-child(2) h2";
    public static final String webElementTitleThirdExpandStackContainer = "#main > div.about > div.clap8 ul:nth-child(1) >li:nth-child(3) h2";
    public static final String webElementTitleFourthExpandStackContainer = "#main > div.about > div.clap8 ul:nth-child(1) >li:nth-child(4) h2";
    public static final String webElementTextTitleFirstExpandStackContainer = "#main > div.about > div.clap8 ul:nth-child(1) >li:nth-child(1) div.double p";
    public static final String webElementTextTitleSecondExpandStackContainer = "#main > div.about > div.clap8 ul:nth-child(1) >li:nth-child(2) div.double p";
    public static final String webElementTextTitleThirdExpandStackContainer = "#main > div.about > div.clap8 ul:nth-child(1) >li:nth-child(3) div.double p";
    public static final String webElementTextTitleFourthExpandStackContainer = "#main > div.about > div.clap8 ul:nth-child(1) >li:nth-child(4) div.double p";
    private static final String webElementsTextBodyFirstExpandStackContainers = "#main > div.about > div.clap8 ul:nth-child(1) >li:nth-child(1) div.double ul li";
    private static final String webElementsTextBodySecondExpandStackContainers = "#main > div.about > div.clap8 ul:nth-child(1) >li:nth-child(2) div.double ul li";
    private static final String webElementsTextBodyThirdExpandStackContainers = "#main > div.about > div.clap8 ul:nth-child(1) >li:nth-child(3) div.double ul li";
    private static final String webElementsTextBodyFourthExpandStackContainers = "#main > div.about > div.clap8 ul:nth-child(1) >li:nth-child(4) div.double ul li";
    public static String getWebElementsListPageNavBar() { return webElementsListPageNavBar; }
    public static String getWebElementsTextTitlesGridContainerOne() { return webElementsTextTitlesGridContainerOne; }
    public static String getWebElementsTextBodyGridContainerOneSectionOne() { return webElementsTextBodyGridContainerOneSectionOne; }
    public static String getWebElementsTextBodyGridContainerOneSectionTwo() { return webElementsTextBodyGridContainerOneSectionTwo; }
    public static String getWebElementsTextBodyFirstExpandStackContainers() { return webElementsTextBodyFirstExpandStackContainers; }
    public static String getWebElementsTextBodySecondExpandStackContainers() { return webElementsTextBodySecondExpandStackContainers; }
    public static String getWebElementsTextBodyThirdExpandStackContainers() { return webElementsTextBodyThirdExpandStackContainers; }
    public static String getWebElementsTextBodyFourthExpandStackContainers() { return webElementsTextBodyFourthExpandStackContainers; }
}
