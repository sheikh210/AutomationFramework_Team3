package flightspageTest;

import commonAPI.WebAPI;
import flightspage.TripAdvisorFlightspage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TripAdvisorFlightspageTest extends WebAPI {

    static TripAdvisorFlightspage testFlightsPage;

    public static void getInitElements() {
        testFlightsPage = PageFactory.initElements(driver, TripAdvisorFlightspage.class);
    }

    @Test (priority = 0)
    public static void testHomePage() throws IOException {
        getInitElements();
        testFlightsPage.validateHomePage();
    }
    @Test (priority = 1)
    public static void testMoreCategories() throws IOException {
        getInitElements();
        testFlightsPage.getMoreCategories();
        testFlightsPage.validateCategoryList();
        testFlightsPage.goToFlightsPage();
    }
    @Test (priority = 2)
    public static void testDropDownMenu() {
        getInitElements();
        testFlightsPage.getEllipsMenu();
        testFlightsPage.validateEllipsMenu();
    }
    @Test (priority = 3)
    public static void testroundTripBox() {
        getInitElements();
        testFlightsPage.roundTripBox();
    }
    @Test (priority = 4)
    public static void testCalendarBox() {
        getInitElements();
        testFlightsPage.goToCalendarBox();
    }
    @Test (priority = 5)
    public static void testClasType() {
        getInitElements();
        testFlightsPage.getClasType();
        testFlightsPage.validateClassTypelist();
    }
    @Test (priority = 6)
    public static void testExtraFlightOptions() {
        getInitElements();
        testFlightsPage.chooseExtraFlightOptions();
    }
    @Test (priority = 7)
    public static void testpriceAlert() {
        getInitElements();
        testFlightsPage.priceAlert();
    }
    @Test (priority = 8)
    public static void testCurrencyBox() {
        getInitElements();
        testFlightsPage.getCurrencyBox();
        testFlightsPage.validateCurrencyBox();
    }
    @Test (priority = 9)
    public static void testCountryBox() {
        getInitElements();
        testFlightsPage.getCountryBox();
    }
    @Test (priority = 10)
    public static void testFlightSearch() {
        getInitElements();
        testFlightsPage.doFlightSearch();
    }
    @Test (priority = 11)
    public static void testCheckSortByBox() {
        getInitElements();
        testFlightsPage.getCheckSortByBox();
        testFlightsPage.validateCheckSortBybox();
    }
    @Test (priority = 12)
    public static void testCheckDealsBox() {
        getInitElements();
        testFlightsPage.validateCheckDealsBox();
    }
    @Test (priority = 13)
    public static void testAirlineOptions() {
        getInitElements();
        testFlightsPage.validateAirlineOptions();
    }
    @Test (priority = 14)
    public static void testAmenitiesBox() {
        getInitElements();
        testFlightsPage.validateOneWayOption();
    }
//    @Test (priority = 15)
//    public static void testroundTripBox() {
//        getInitElements();
//        testFlightsPage.roundTripBox();
//    }
//    @Test (priority = 16)
//    public static void testroundTripBox() {
//        getInitElements();
//        testFlightsPage.roundTripBox();
//    }
//    @Test (priority = 17)
//    public static void testroundTripBox() {
//        getInitElements();
//        testFlightsPage.roundTripBox();
//    }
//    @Test (priority = 18)
//    public static void testroundTripBox() {
//        getInitElements();
//        testFlightsPage.roundTripBox();
//    }
//    @Test (priority = 19)
//    public static void testroundTripBox() {
//        getInitElements();
//        testFlightsPage.roundTripBox();
//    }


}
