package patientReferrals;

import commonAPI.WebAPI;

public class StJudePatientReferralPageWebElements {
    /**
     * Header
     */
    // Patient Referrals link by css
    public static final String WebElementPatientReferralsLink="body>header>section section.cta-buttons";
    //Contact us Button by xpath
    public static final String WebElementButtonContactUs="//div[@class='utility-wrapper']//a[contains(text(),'Contact Us')]";
    //Spanish language by xpath
    public static final String WebElementSpanishLanguage="//div[@class='utility-wrapper']//a[contains(text(),'Español')]";
    //Donate now by xpath
    public static final String WebElementDonateNowLink="//section[@class='cta-buttons']//span[contains(text(),'Donate Now')]";
    //About us by xpath
    public static final String WebElementAboutUsMenu="//body/header/section/nav/ul/li[2]/a[1]";
    //about us menu links by xpath
    public static final String WebElementAboutUsLinks="//body/header/section/nav/ul/li[2]/div[1]/div[1]";
    // Search button by xpath
    public static final String WebElementButtonSearch="//a[contains(text(),'Search')]";
    // Search box by xpath
    public static final String WebElementSearchBox="//section[@class='search-form section']//input[@placeholder='What are you looking for?']";
    /**
     * Body
     */
    //Body links "For Families Seeking Treatment" by xpath
    public static final String WebElementFamiliesSeekingTreatmentLinks ="//*[@id=\"affb7acb3944e89b7ec33abcdd811ddf83ae9625bdde1e9a9c5afce905a9fd29\"]/div[1]/section[2]//a";
    // Body links "For Referring Physicians"
    public static final String WebElementForReferringPhysicians="//*[@id=\"affb7acb3944e89b7ec33abcdd811ddf83ae9625bdde1e9a9c5afce905a9fd29\"]/div[2]/section[2]//a";
    //Clinical trials by css
    public static final String WebElementClinicalTrials="[href='https\\:\\/\\/www\\.stjude\\.org\\/research\\/clinical-trials\\.html'] .btn-secondary";
    // Acceptance requirements by xpath
    public static final String WebElementAcceptanceRequirements="//body/main[@id='site-content']/section/div/section/section/div/section[2]";
    // Physician Referral Contact Form by xpath
    public static final String WebElementContactForm="//u[contains(text(),'Physician Referral Contact Form')]";
    //24 hours pager phone number by xpath
    public static final String WebElementPagerPhoneNumber="//body/main/section/div/section/section/div/section[3]/section[1]/div[1]/div[2]/section[1]/div[1]";
    // Toll free phone number xpath
    public static final String WebElementTollFreeNumber="//body/main/section/div/section/section/div/section[4]/section[1]/div[1]/div[1]/section[1]/div[1]";
    // Fax number by xpath
    public static final String WebElementFaxNumber="//body/main/section/div/section/section/div/section[4]/section[1]/div[1]/div[2]/section[1]/div[1]";
    // Email by xpath
    public static final String WebElementEmail ="//body/main/section/div/section/section/div/section/section/div/div[3]/section[1]/div[1]";
    /**
     * Footer
     */
    //Social media links by xpath
    public static final String WebElementSocialMediaIcons="//*[@id=\"global-footer\"]/section[2]/section/div/div[1]/ul//a";
    //Partners links by xpath
    public static final String WebElementPartnersLinks="//*[@id=\"global-footer\"]/section[2]/section/div/div[3]/section[2]//a";
    // site map by xpath
    public static final String WebElementSiteMap="//a[contains(text(),'Site Map')]";
    //Lining policy by xpath
    public static final String WebElementLinkingPolicy="//a[contains(text(),'Linking Policy')]";
}
