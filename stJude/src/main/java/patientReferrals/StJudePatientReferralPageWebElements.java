package patientReferrals;

import commonAPI.WebAPI;

public class StJudePatientReferralPageWebElements {
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
    public static final String WebElementButtonSearch="//li[@class='search']";
    // Search box by xpath
    public static final String WebElementSearchBox="//section[@class='search-form section']//input[@placeholder='What are you looking for?']";

}
