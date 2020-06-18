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
    @FindBy (xpath = webclickMoreButton)
    public WebElement clickMoreButton;

    //-----------------------------------------------------------------------
    //Case 3 Elements
    @FindBy (xpath = webclickFlightsButton)
    public WebElement clickFlightsButton;

    //-----------------------------------------------------------------------
    //Case 4 Elements
    @FindBy (xpath = webclickEllipsMenuButton)
    public WebElement clickEllipsMenuButton;

    //-----------------------------------------------------------------------
    //Case 5 Elements
    @FindBy (xpath = webclickFrombox)
    public WebElement clickFrombox;

    @FindBy (xpath = webclickToWhereBox)
    public WebElement clickToWhereBox;

    //-----------------------------------------------------------------------
    //Case 6 Elements
    @FindBy (xpath = webclickCalendarbox)
    public WebElement clickCalendarbox;

    @FindBy (xpath = webclickRightswipe)
    public WebElement clickRightswipe;

    @FindBy (xpath = webclick18July)
    public WebElement click18July;

    @FindBy (xpath = webclick15August)
    public WebElement click15August;

    //-----------------------------------------------------------------------
    //case 7 elements
    @FindBy (xpath = webclickClassBox)
    public WebElement clickClassBox;

    @FindBy (xpath = webclickEconomyButton)
    public WebElement clickEconomyButton;

    @FindBy (xpath = webclickFirstClass)
    public WebElement clickFirstClass;

    @FindBy (xpath = webclickCloseButton)
    public WebElement clickCloseButton;

    //-----------------------------------------------------------------------
    //case 8 elements
    @FindBy (xpath = webclickPreferNonstopButton)
    public WebElement clickPreferNonstopButton;

    @FindBy (xpath = webclickNearbyAirportsButton)
    public WebElement clickNearbyAirportsButton;

    //-----------------------------------------------------------------------
    //case 9 elements
    @FindBy (xpath = webclickEmailBar)
    public WebElement clickEmailBar;

    //-----------------------------------------------------------------------
    //case 10 elements
    @FindBy (xpath = webclickCurrencyBox)
    public WebElement clickCurrencyBox;

    //-----------------------------------------------------------------------
    //case 11 elements
    @FindBy (xpath =webclickCountryBox)
    public WebElement clickCountryBox;

    //-----------------------------------------------------------------------
    //case 12 elements
    @FindBy (xpath = webclickGreenSearch)
    public WebElement clickGreenSearch;

    //-----------------------------------------------------------------------
    //case 13 elements
    @FindBy (xpath = webclickSortByBox)
    public WebElement clickSortByBox;

    @FindBy (xpath = webclickBestValue)
    public WebElement clickBestValue;

    //-----------------------------------------------------------------------
    //case 14 elements
    @FindBy (xpath = webclickViewDealsButton)
    public WebElement clickViewDealsButton;

    @FindBy (xpath = webclickDownArrow)
    public WebElement clickDownArrow;

    @FindBy (xpath = webclickAirlineView)
    public WebElement clickAirlineView;

    @FindBy (xpath = webclickXtoClose)
    public WebElement clickXtoClose;

    //-----------------------------------------------------------------------
    //case 15 elements
    @FindBy (xpath = webclickAlaskaAirlines)
    public WebElement clickAlaskaAirlines;

    @FindBy (xpath = webclickAmericanAirlines)
    public WebElement clickAmericanAirlines;

    //-----------------------------------------------------------------------
    //case 16 elements
    @FindBy (xpath = webclickWifi)
    public WebElement clickWifi;

    @FindBy (xpath = webclickPowerAvailable)
    public WebElement clickPowerAvailable;

    //-----------------------------------------------------------------------
    //case 17 elements
    @FindBy (xpath = webclickOneWay)
    public WebElement clickOneWay;

    @FindBy (xpath = webclickTravelers)
    public WebElement clickTravelers;

    @FindBy (xpath = webclickFirstClassButton)
    public WebElement clickFirstClassButton;

    @FindBy (xpath = webclickCloseButton2)
    public WebElement clickCloseButton2;

    @FindBy (xpath = webclickSearch)
    public WebElement clickSearch;

    //-----------------------------------------------------------------------
    //case 18 elements
    @FindBy (xpath = webclickMultiCity)
    public WebElement clickMultiCity;

    @FindBy (xpath = webclickSecondFromBox)
    public WebElement clickSecondFromBox;

    @FindBy (xpath = webclickSecondToTox)
    public WebElement clickSecondToTox;

    @FindBy (xpath = webclickDepart)
    public WebElement clickDepart;

    @FindBy (xpath = webclick30August)
    public WebElement click30August;

    @FindBy (xpath = webclickSearchButton)
    public WebElement clickSearchButton;

    //-----------------------------------------------------------------------
    //case 19 elements
    @FindBy (xpath = webclickNonStop)
    public WebElement clickNonStop;

    @FindBy (xpath = webclickAmerican)
    public WebElement clickAmerican;

    @FindBy (xpath = webclickClearAllFilters)
    public WebElement clickClearAllFilters;

    //-----------------------------------------------------------------------
    //case 20 elements
    @FindBy (xpath = webclickMinimizeStopsBar)
    public WebElement clickMinimizeStopsBar;

    @FindBy (xpath = webclickMinimizeCovid19Bar)
    public WebElement clickMinimizeCovid19Bar;

    @FindBy (xpath = webclickMinimizeFlightTimes)
    public WebElement clickMinimizeFlightTimes;

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
     * >>>Test Case 2 - Validate More Button bar <<<
     * Click >>More<< button on header
     * Expand it
     * Validate 9 Category are there
     */
    public int getMoreCategories() {
        clickMoreButton.click();
        List<WebElement> moreCategories = clickMoreButton.findElements(By.xpath(webclickMoreButton));
        int moreCategoryList = moreCategories.size();
        return moreCategoryList;
    }

    public void validateCategoryList() throws IOException {
        int [] expectedMenuArrayCount = dataReader.fileReaderIntegerHSSF(System.getProperty("user.dir")+
                "//src/main/resources/TripAdvisor_FlightsPage_ExpectedElements.xlsx","MoreCategory List");
        int expectedCategoryList = expectedMenuArrayCount[0];

        Assert.assertEquals(getMoreCategories(),expectedCategoryList,"List size does not match");
    }

    /**
     *  >>>Test Case 3 - Go to Flights page <<<
     * Click Flights button
     * Wait until home page is landing
     * Get Title
     */
    public void goToFlightsPage() {
        clickFlightsButton.click();
        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title:"+actualTitle);
    }

    /**
     * >>>Test Case 4 - Drop Down Menu<<<
     * Click ellipsis button
     * Validate 5 Category are visible
     */
    public int getEllipsMenu() {
        mouseHover(clickEllipsMenuButton);
        List<WebElement> ellipsMenuList = clickEllipsMenuButton.findElements(By.xpath(webclickEllipsMenuButton));
        int ellipsMenuSize = ellipsMenuList.size();
        return ellipsMenuSize;

    }
    public void validateEllipsMenu() throws IOException {
        int [] expectedEllipsMenuArrayCount = dataReader.fileReaderIntegerHSSF(System.getProperty("user.dir")+
                "//src/main/resources/TripAdvisor_FlightsPage_ExpectedElements.xlsx","Ellips Menu");
        int expectedEllipsMenu = expectedEllipsMenuArrayCount[0];

        Assert.assertEquals(getEllipsMenu(),expectedEllipsMenu,"List Size does not match");
    }

    /**
     * >>>Test Case 5 - Round Trip<<<
     * Click From box
     * Type New York City (NYC)
     * Click To Where Box
     * Type Los Angeles (LAX)
     */
    public void roundTripBox() {
        clickFrombox.sendKeys("New York City (NYC)");
        clickToWhereBox.sendKeys("Los Angeles (LAX)");

    }
    /**
     * >>>Test Case 6 - Calendar Box<<<
     * Click Calendar box
     * Click right swipe
     * Click 18 July
     * Click 15 August
     */
    public void goToCalendarBox() {
        clickCalendarbox.click();
        clickRightswipe.click();
        click18July.click();
        click15August.click();
    }
    /**
     * >>>Test Case 7 - Check class type<<<
     * Click Class box
     * Expand it
     * Click Economy button
     * Validate 4 type of class
     * Click First Class
     * Click Close
     */
    public int getClassType() {
        clickClassBox.click();
        clickEconomyButton.click();
        List <WebElement> classTypeList = clickEconomyButton.findElements(By.xpath(webclickEconomyButton));
        int classTypeListSize = classTypeList.size();
        clickFirstClass.click();
        clickCloseButton.click();
        return classTypeListSize;
    }
    public void validateClassTypelist() throws IOException {
        int [] expectedClassTypeArrayCount = dataReader.fileReaderIntegerHSSF(System.getProperty("user.dir")+
                "//src/main/resources/TripAdvisor_FlightsPage_ExpectedElements.xlsx","Class Type List");
        int expectedClassTypelist = expectedClassTypeArrayCount[0];

        Assert.assertEquals(getClassType(),expectedClassTypelist,"List Size does not match");
    }

    /**
     * >>>Test Case 8 - Extra options<<<
     * Click >>Prefer nonstop<< button
     * Click >>Include nearby airports<< button
     */
    public void chooseExtraFlightOptions() {
        clickPreferNonstopButton.click();
        clickNearbyAirportsButton.click();
    }

    /**
     * >>>Test Case 9 - Price Alert<<<
     * Click Email Bar
     * Type >>pnttest@gmail.com<<
     */
    public void priceAlert() {
        clickEmailBar.sendKeys("pnttest@gmail.com");
    }

    /**
     * >>>Test Case 10 - Currency box<<<
     * Click Currency box
     * Validate 8 currency type are displayed
     */
    public int getCurrencyBox() {
        clickCurrencyBox.click();
        List<WebElement> currencyBoxList = clickCurrencyBox.findElements(By.xpath(webclickCurrencyBox));
        int currencyBoxListSize = currencyBoxList.size();
        return currencyBoxListSize;
    }
    public void validateCurrencyBox() throws IOException {
        int [] expectedCurrencyBoxArrayCount = dataReader.fileReaderIntegerHSSF(System.getProperty("user.dir")+
                "//src/main/resources/TripAdvisor_FlightsPage_ExpectedElements.xlsx","Currency Box List");
        int expectedCurrencyBoxList = expectedCurrencyBoxArrayCount[0];
        Assert.assertEquals(getCurrencyBox(),expectedCurrencyBoxList,"List Size does not match");
    }

    /**
     * >>>Test Case 11 - Country box<<<
     * Click Country box
     * Validate how many country names are there
     */
    public void getCountryBox() {
        clickCountryBox.click();
        List<WebElement> countryBox = clickCountryBox.findElements(By.xpath(webclickCountryBox));
        System.out.println(countryBox);
    }

    /**
     * >>>Test Case 12 - Do flight search<<<
     * Click green search bar on the right side of the header
     */
    public void doFlightSearch() {
        clickGreenSearch.click();
    }

    /**
     * >>>Test Case 13 - Check Sort By Box<<<
     * Click Sort By Box
     * Validate 11 Elements are visible
     * Click Best Value
     */

    public int getCheckSortByBox() {
        clickSortByBox.click();
        List<WebElement> sortByBoxList = clickSortByBox.findElements(By.xpath(webclickSortByBox));
        int sortByBoxSize = sortByBoxList.size();
        return sortByBoxSize;
    }
    public void validateCheckSortBybox() throws IOException {
        int [] expectedSortByboxArrayCount = dataReader.fileReaderIntegerHSSF(System.getProperty("user.dir")+
                "//src/main/resources/TripAdvisor_FlightsPage_ExpectedElements.xlsx","Sort By Box");
        int expectedSortByBoxList = expectedSortByboxArrayCount[0];

        Assert.assertEquals(getCheckSortByBox(),expectedSortByBoxList,"List Size Does not match");
        clickBestValue.click();
    }

    /**
     * >>>Test Case 14 - Check Deals Box<<<
     * Click View Deals button
     * Scroll down
     * Click Down Arrow expand more info
     * Click Airline view arrow
     * Click X to close window
     */
    public void validateCheckDealsBox() {
        clickViewDealsButton.click();
        clickDownArrow.click();
        clickAirlineView.click();
        clickXtoClose.click();
    }

    /**
     * >>>Test Case 15 - Airlines Options<<<
     * Click Alaska Airlines
     * Click American Airlines
     */
    public void validateAirlineOptions() {
        clickAlaskaAirlines.click();
        clickAmericanAirlines.click();
    }

    /**
     * >>>Test Case 16 - Click Amenities<<<
     * Click Wifi
     * Click Power available
     */
    public void validateAmenitiesBox() {
        clickWifi.click();
        clickPowerAvailable.click();
    }

    /**
     * >>>Test Case 17 - Choose one way option<<<
     * Click one-way
     * Click Travelers
     * Click First Class
     * Click close button to close tab
     * Click Search
     */
    public void validateOneWayOption() {
        clickOneWay.click();
        clickTravelers.click();
        clickFirstClassButton.click();
        clickCloseButton2.click();
        clickSearch.click();
    }

    /**
     * >>>Test Case 18 - Choose Multi City<<<
     * Click Multi City
     * Click SecondFrom box
     * Type >>Los Angeles (LAX)<<
     * Click Second >>To<< box
     * Type San Francisco (SFO)
     * Click Depart
     * Click 30 August
     * Click Search
     */
    public void validateMultiCityOption() {
        clickMultiCity.click();
        clickSecondFromBox.sendKeys("Los Angeles");
        clickSecondToTox.sendKeys("San Francisco");
        clickDepart.click();
        click30August.click();
        clickSearchButton.click();
    }

    /**
     * >>>Test Case 19 - Clear filter<<<
     * Click Non Stop
     * Click American
     * Click Clear All Filters
     */
    public void clearFilter() {
        clickAmerican.click();
        clickClearAllFilters.click();
    }

    /**
     * >>>Test Case 20 - Minimize Side Bars<<<
     * Minimize Stops Bar
     * Minimize Covid 19 Bar
     * Minimize Flight Times
     */
    public void minimizeSideBar() {
        clickMinimizeStopsBar.click();
        clickMinimizeCovid19Bar.click();
        clickMinimizeFlightTimes.click();
    }

}
