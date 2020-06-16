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
    //Calculate button by xpath
    public static final String WebElementCalculateButton="//a[@id='calculate']";
    // Apply now button by xpath
    public static final String WebElementApplyNowButton="//a[@id='refi-button']";
    // Shop for your car now button by xpath
    public static final String WebElementShopForYourCarButton="//a[@id='shop-now-button']";



}
