package autoLoansPage;

public class BankOfAmericaAutoLoansPageWebElements {
    /**
     * WebElements required to navigate to Auto-loans page
     */
    //Auto-Loans tab in home page by xpath
    public static final String WebElementAutoLoansTab="//a[@id='navAutoLoans']//span[@class='title'][contains(text(),'Auto Loans')]";
    //Learn more in auto-loans menu by id
    public static final String WebElementLearnMore="btnAutoLoans";
    //Select state dropdown menu by CSs
    public static final String WebElementStateDropDown="#stateSelectModal";
    // Go button by id
    public static final String WebElementGoButton="stateSelectorSubmit";
    /**
     * Header WebElements
     */
    //Home Page Logo by xpath
    public static final String WebElementHomePageLogo="//*[@id=\"globalNavModule\"]/header/div[2]/div[1]/div/a/img";
    //Header Search box by CSS
    public static final String WebElementHeaderSearchBox="#nav-search-query";
    // Car financing Link by xpath
    public static final String WebElementCarFinancingLink="//*[@id=\"searchStub\"]/div/div/div/div/div[5]/ul/li[1]/p/a";
    //Menu by xpath
    public static final String WebElementMenu="//section[@id='head-row']//span[4]//*[local-name()='svg']";
    //MenuItems by xpath
    public static final String WebElementMenuItems="//div[@class='row small-collapse medium-uncollapse menu-items-container']";
    /**
     * Body
     */
    // Loan Amount box by xpath
    public static final String WebElementLoanAmountBox="//input[@id='currencyInputField']";
    // Payment Amount box by css
    public static final String WebElementPaymentAmountBox = "#simpleCalcAutoModule  div.payment > p > span";
    //Calculate button by xpath
    public static final String WebElementCalculateButton="//a[@id='calculate']";
    // Apply now button by xpath
    public static final String WebElementApplyNowButton="//a[@id='refi-button']";
    // Shop for your car now button by xpath
    public static final String WebElementShopForYourCarButton="//a[@id='shop-now-button']";
    // LoanType drop menu by xpath
    public static final String WebElementLoanTypeDropMenu="//select[@id='dropdown-loan']";
    //Lease buy-out by xpath
    public static final String WebElementLeaseBuyOutButton="//div[@class='show-for-medium-up']//div[@id='advantageRelationshipTile']";
    //Lease buy-out dropdown links by css
    public static final String WebElementLeaseBuyOutDropDownLinks="#advantageRelationshipLayerDrawer div.row div a:not([class*='button spa-btn spa-btn--primary spa-btn--medium'])";
    //Zip code search by xpath
    public static final String WebElementZipCodeSearchBox="//div[@class='zipinput-container show-for-medium-up']//input[@id='zipCodeField']";
    //Refine your search by xpath
    public static final String WebElementButtonRefineYourSearch="#rioSearchFilterLabel > a";
    //specialized vehicle by xpath
    public static final String WebElementSpecializedVehicleLinks="//p[contains(text(),'Loans for customers needing accessible vehicles')]";
    // Small business vehicle by xpath
    public static final String WebElementSmallBusinessVehicle="//p[contains(text(),'Small business vehicles and equipment loans')]";
    /**
     * footer
     */
    // Advertising practices by xpath
    public static final String WebElementAdvertisingPractices="//a[contains(text(),'Advertising Practices')]";
    // Exit from pop out window by xpath
    public static final String WebElementExit="//span[contains(text(),'×')]";


}
