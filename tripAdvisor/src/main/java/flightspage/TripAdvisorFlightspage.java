package flightspage;
import static flightspage.TripAdvisorFlightspageElements.*;
import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utilities.DataReader;

import java.io.IOException;
import java.util.List;

public class TripAdvisorFlightspage extends WebAPI {

    //Case 2 Elements
    @FindBy (xpath = clickMoreButton)
    public WebElement webclickMoreButton;

    @FindBy (xpath = clickFlightsButton)
    public WebElement webclickFlightsButton;

    //-----------------------------------------------------------------------
    //Case 3 Elements
    @FindBy (xpath = clickEllipsMenuButton)
    public WebElement webclickEllipsMenuButton;

    //-----------------------------------------------------------------------
    //Case 4 Elements
    @FindBy (xpath = clickFrombox)
    public WebElement webclickFrombox;

    @FindBy (xpath = clickToWhereBox)
    public WebElement webclickToWhereBox;

    //-----------------------------------------------------------------------
    //Case 5 Elements
    @FindBy (xpath = clickCalendarbox)
    public WebElement webclickCalendarbox;

    @FindBy (xpath = clickRightswipe)
    public WebElement webclickRightswipe;

    @FindBy (xpath = click18July)
    public WebElement webclick18July;

    @FindBy (xpath = click15August)
    public WebElement webclick15August;

    //-----------------------------------------------------------------------
    //Case 6 Elements
    @FindBy (xpath = clickClassBox)
    public WebElement webclickClassBox;

    @FindBy (xpath = clickEconomyButton)
    public WebElement webclickEconomyButton;

    @FindBy (xpath = clickFirstClass)
    public WebElement webclickFirstClass;

    @FindBy (xpath = clickCloseButton)
    public WebElement webclickCloseButton;

    //-----------------------------------------------------------------------
    //case 7 elements
    @FindBy (xpath = clickPreferNonstopButton)
    public WebElement webclickPreferNonstopButton;

    @FindBy (xpath = clickNearbyAirportsButton)
    public WebElement webclickNearbyAirportsButton;

    //-----------------------------------------------------------------------
    //case 8 elements
    @FindBy (xpath = clickEmailBar)
    public WebElement webclickEmailBar;

    //-----------------------------------------------------------------------
    //case 9 elements
    @FindBy (xpath = clickCurrencyBox)
    public WebElement webclickCurrencyBox;

    //-----------------------------------------------------------------------
    //case 10 elements
    @FindBy (xpath = clickCountryBox)
    public WebElement webclickCountryBox;

    //-----------------------------------------------------------------------
    //case 11 elements
    @FindBy (xpath = clickGreenSearch)
    public WebElement webclickGreenSearch;

    //-----------------------------------------------------------------------
    //case 12 elements
    @FindBy (xpath = clickSortByBox)
    public WebElement webclickSortByBox;

    @FindBy (xpath = clickBestValue)
    public WebElement webclickBestValue;

    //-----------------------------------------------------------------------
    //case 13 elements
    @FindBy (xpath = clickViewDealsButton)
    public WebElement webclickViewDealsButton;

    @FindBy (xpath = clickDownArrow)
    public WebElement webclickDownArrow;

    @FindBy (xpath = clickAirlineView)
    public WebElement webclickAirlineView;

    @FindBy (xpath = clickXtoClose)
    public WebElement webclickXtoClose;

    //-----------------------------------------------------------------------
    //case 14 elements
    @FindBy (xpath = clickAlaskaAirlines )
    public WebElement webclickAlaskaAirlines ;

    @FindBy (xpath = clickAmericanAirlines)
    public WebElement webclickAmericanAirlines;

    //-----------------------------------------------------------------------
    //case 15 elements
    @FindBy (xpath = clickWifi)
    public WebElement webclickWifi;

    @FindBy (xpath = clickPowerAvailable)
    public WebElement webclickPowerAvailable;

    //-----------------------------------------------------------------------
    //case 16 elements
    @FindBy (xpath = clickOneWay)
    public WebElement webclickOneWay;

    @FindBy (xpath = clickTravelers)
    public WebElement webcclickTravelers;

    @FindBy (xpath = clickFirstClassButton)
    public WebElement webclickFirstClassButton;

    @FindBy (xpath = clickCloseButton2)
    public WebElement webclickCloseButton2;

    @FindBy (xpath = clickSearch)
    public WebElement webclickSearch;

    //-----------------------------------------------------------------------
    //case 17 elements
    @FindBy (xpath = clickMultiCity)
    public WebElement webclickMultiCity;

    @FindBy (xpath = clickSecondFromBox)
    public WebElement webclickSecondFromBox;

    @FindBy (xpath = clickSecondToTox)
    public WebElement webclickSecondToTox;

    @FindBy (xpath = clickDepart)
    public WebElement webclickDepart;

    @FindBy (xpath = click30August)
    public WebElement webclick30August;

    @FindBy (xpath = clickSearchButton)
    public WebElement webclickSearchButton;

    //-----------------------------------------------------------------------
    //case 18 elements


    //-----------------------------------------------------------------------
    //case 19 elements


    //-----------------------------------------------------------------------
    //case 20 elements


    //-----------------------------------------------------------------------

    DataReader dataReader = new DataReader();

    /**
     * >>>Test Case 1 - Go to Home Page<<<
     * Open Chrome Browser
     * Type Url >>https://www.tripadvisor.com/<<
     * Wait until home page is landing
     * Get Home Page Title
     */
    public void goToHomePage() {

    }
    public void validateHomePage() throws IOException {
        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title:"+actualTitle);

        String [] expectedHomePageTitleArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir")+
                "//src/main/resources/TripAdvisor_FlightsPage_ExpectedElements.xlsx","Homepage Title");
        String expectedHomePageTitle = expectedHomePageTitleArray [0];
        System.out.println("Expected Page Title: "+expectedHomePageTitle);

        Assert.assertEquals(actualTitle,expectedHomePageTitle,"Homepage Title Does not match");
    }

    /**
     * >>>Test Case 2 - Go to Flights page <<<
     * Click >>More<< button on header
     * Expand it
     * Validate 9 Category are there
     * Click Flights button
     * Wait until home page is landing
     * Get Title
     */
    public int getMoreCategories() {
        webclickMoreButton.click();
        List<WebElement> moreCategories = webclickMoreButton.findElements(By.xpath(clickMoreButton));
        int moreCtegoryList = moreCategories.size();
        return moreCtegoryList;
    }

    public void validateCategoryList() throws IOException {
        int [] expectedMenuArrayCount = dataReader.fileReaderIntegerHSSF(System.getProperty("user.dir")+
                "//src/main/resources/TripAdvisor_FlightsPage_ExpectedElements.xlsx","MoreCategory List");
        int expectedCategoryList = expectedMenuArrayCount[0];


        Assert.assertEquals(getMoreCategories(),expectedCategoryList,"List size does not match");
    }

    public void goToFlightsPage() {
        webclickFlightsButton.click();
        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title:"+actualTitle);
    }

    /**
     * >>>Test Case 3 - Drop Down Menu<<<
     * Click ellipsis button
     * Validate 5 Category are visible
     */
    public int getEllipsMenu() {
        mouseHover(webclickEllipsMenuButton);
        List<WebElement> ellipsMenuList = webclickEllipsMenuButton.findElements(By.xpath(clickEllipsMenuButton));
        int ellipsMenuSize = ellipsMenuList.size();
        return ellipsMenuSize;

    }
    public void validateEllipsMenu() {
        Assert.assertEquals(getEllipsMenu(),5,"List Size does not match");
    }

    /**
     * >>>Test Case 4 - Round Trip<<<
     * Click From box
     * Type New York City (NYC)
     * Click To Where Box
     * Type Los Angeles (LAX)
     */
    public void roundTripBox() {
        webclickFrombox.sendKeys("New York City (NYC)");
        webclickToWhereBox.sendKeys("Los Angeles (LAX)");

    }
    /**
     * >>>Test Case 5 - Calendar Box<<<
     * Click Calendar box
     * Click right swipe
     * Click 18 July
     * Click 15 August
     */
    public void goToCalendarBox() {
        webclickCalendarbox.click();
        webclickRightswipe.click();
        webclick18July.click();
        webclick15August.click();
    }
    /**
     * >>>Test Case 6 - Check class type<<<
     * Click Class box
     * Expand it
     * Click Economy button
     * Validate 4 type of class
     * Click First Class
     * Click Close
     */
    public int getClasType() {
        webclickClassBox.click();
        webclickEconomyButton.click();
        List <WebElement> classTypeList = webclickEconomyButton.findElements(By.xpath(clickEconomyButton));
        int classTypeListSize = classTypeList.size();
        webclickFirstClass.click();
        webclickCloseButton.click();
        return classTypeListSize;
    }
    public void validateClassTypelist() {
        Assert.assertEquals(getClasType(),4,"List Size does not match");
    }

    /**
     * >>>Test Case 7 - Extra options<<<
     * Click >>Prefer nonstop<< button
     * Click >>Include nearby airports<< button
     */
    public void chooseExtraFlightOptions() {
        webclickPreferNonstopButton.click();
        webclickNearbyAirportsButton.click();
    }

    /**
     * >>>Test Case 8 - Price Alert<<<
     * Click Email Bar
     * Type >>pnttest@gmail.com<<
     */
    public void priceAlert() {
        webclickEmailBar.sendKeys("pnttest@gmail.com");
    }

    /**
     * >>>Test Case 9 - Currency box<<<
     * Click Currency box
     * Validate 8 currency type are displayed
     */
    public int getCurrencyBox() {
        webclickCurrencyBox.click();
        List<WebElement> currencyBoxList = webclickCurrencyBox.findElements(By.xpath(clickCurrencyBox));
        int currencyBoxListSize = currencyBoxList.size();
        return currencyBoxListSize;
    }
    public void validateCurrencyBox() {
        Assert.assertEquals(getCurrencyBox(),9,"List Size does not match");
    }

    /**
     * >>>Test Case 10 - Country box<<<
     * Click Country box
     * Validate how many country names are there
     */
    public void getCountryBox() {
        webclickCountryBox.click();
        List<WebElement> countryBox = webclickCountryBox.findElements(By.xpath(clickCountryBox));
        System.out.println(countryBox);
    }

    /**
     * >>>Test Case 11 - Do flight search<<<
     * Click green search bar on the right side of the header
     */
    public void doFlightSearch() {
        webclickGreenSearch.click();
    }

    /**
     * >>>Test Case 12 - Check Sort By Box<<<
     * Click Sort By Box
     * Validate 11 Elements are visible
     * Click Best Value
     */

    public int getCheckSortByBox() {
        webclickSortByBox.click();
        List<WebElement> sortByBoxList = webclickSortByBox.findElements(By.xpath(clickSortByBox));
        int sortByBoxSize = sortByBoxList.size();
        return sortByBoxSize;
    }
    public void validateCheckSortBybox() {
        Assert.assertEquals(getCheckSortByBox(),11,"List Size Does not match");
        webclickBestValue.click();
    }

    /**
     * >>>Test Case 13 - Check Deals Box<<<
     * Click View Deals button
     * Scroll down
     * Click Down Arrow expand more info
     * Click Airline view arrow
     * Click X to close window
     */
    public void validateCheckDealsBox() {
        webclickViewDealsButton.click();
        webclickDownArrow.click();
        webclickAirlineView.click();
        webclickXtoClose.click();
    }

    /**
     * >>>Test Case 14 - Airlines Options<<<
     * Click Alaska Airlines
     * Click American Airlines
     */
    public void validateAirlineOptions() {
        webclickAlaskaAirlines.click();
        webclickAmericanAirlines.click();
    }

    /**
     * >>>Test Case 15 - Click Amenities<<<
     * Click Wifi
     * Click Power available
     */
    public void validateAmenitiesBox() {
        webclickWifi.click();
        webclickPowerAvailable.click();
    }

    /**
     * >>>Test Case 16 - Choose one way option<<<
     * Click one-way
     * Click Travelers
     * Click First Class
     * Click close button to close tab
     * Click Search
     */
    public void validateOneWayOption() {
        webclickOneWay.click();
        webcclickTravelers.click();
        webclickFirstClassButton.click();
        webclickCloseButton2.click();
        webclickSearch.click();
    }

    /**
     * >>>Test Case 17 - Choose Multi City<<<
     * Click Multi City
     * Click SecondFrom box
     * Type >>Los Angeles (LAX)<<
     * Click Second >>To<< box
     * Type San Francisco (SFO)
     * Click Depart
     * Click 30 August
     * Click Search
     */






}
