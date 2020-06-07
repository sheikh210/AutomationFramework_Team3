package homepage;

import org.openqa.selenium.WebElement;

public class DeltaHomePageElements {
    /**
     * Header Web Elements
     */
    //Check in button by xpath
    public static final String WebElementCheckInButton="//*[@id=\"headPrimary2\"]";
    //Search button by CSS Selector
    public static final String WebElementSearchBar="/html/body/app-root/app-home/ngc-global-nav/header/div/nav/div/div[2]/ngc-search";
    //Search for topic bar by XPath
    public static final String WebElementSearchForTopicBar="//*[@id=\"search_input\"]";
    //Search button for topics by Xpath
    public static final String WebElementSearchForTopicButton="/html/body/modal-container/div/div/ngc-flyout-search/div/div/div/div/div[2]/div[1]/form/div/div[2]/div/span/button[2]";
    //Sign up button by xpath
    public static final String WebElementSignUpButton="//a[@class='sign-up btn btn-link']";
    //Log in button by Xpath
    public static final String WebElementLogInButton="//form[@name='loginForm']";
    //HomeLogo by Xpath
    public static final String WebElementHomePageLogo="//img[@class='siteLogo']";
    //Departure airport by Xpath
    public static final String WebElementDepartureAirportButton="//a[@id='fromAirportName']";
    //Departure airport search box by xpath
    public static final String WebElementDepartureAirportSearchBox="//input[@id='search_input']";
    // EWR Departure airport code by xpath
    public static final String WebElementDepartureAirportCode="//div[@class='tab-content']//li[1]//a[1]";
    //Continue red button by xpath
    public static final String WebElementContinueButton="//button[@id='btn-book-submit']";
    //Correction bar by xpath
    public static final String WebElementCorrectionMessage="//div[@id='correctionBar']";
    //Arrival airport button by xpath
    public static final String  WebElementArrivalAirportButton="//a[@id='toAirportName']";
    //Arrival airport search box by xpath
    public static final String WebElementArrivalAirportSearchBox="//input[@id='search_input']";
    //SFO Arrival airport code path
    public static final String WebElementArrivalAirportCode="//li[@class='airport-list ng-star-inserted']//a";
    //Departure date by xpath
    public static final String WebElementDepartureReturnDateButton="//div[@id='input_departureDate_1']";
    //"06/11/2020" date by xpath
    public static final String WebElementDepartureDate="//div[contains(@class,'dl-datepicker-group dl-datepicker-group-0')]//tr[3]//td[5]";
    //"06/22/2020" date by xpath
    public static final String WebElementReturnDate="//div[@class='dl-datepicker-group dl-datepicker-group-0']//tr[3]//td[7]";
    //Done "DatePicker" button by xpath
    public static final String WebElementDateDoneButton="//button[contains(@class,'donebutton')]";
    //Find yourTripBy Button by xpath
    public static final String WebElementFidYourTripButton="//span[@class='select-ui-wrapper focusable-element']";
    //TicketNumber option by xpath
    public static final String WebElementTicketNumberOption="//li[@id='ui-list-searchType2']";
    //Check in continue button
    public static final String WebElementCheckInContinueButton="//button[@id='btn-checkin-submit']";
    //CheckIn error message by xpath
    public static final String WebElementCheckInErrorMessage="//div[@id='correctionBar']";
    //Ticket number box by xpath
    public static final String WebElementTicketNumberBox="//input[@id='eticketNumber']";
    //Ticket Number error message by xpath
    public static final String WebElementTicketNumberError="//div[@id='eticketNumber-error']";

    /**
     * Footer Web Elements
     */
    //about us link
    public static final String WebElementAboutUsLink="/html/body/app-root/app-home/ngc-global-footer/footer/div/div/div[2]/div/ngc-footer-column/div/div/div[1]/ul[2]/li[1]/a";










}


