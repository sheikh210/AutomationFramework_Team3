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
    public static final String webElementsListDropdownProtectEnterprise = "//ul[@class=\"bc-accordion\"]//ul[@class='inner siblings-breadcrumbs active']/li/a";
}
