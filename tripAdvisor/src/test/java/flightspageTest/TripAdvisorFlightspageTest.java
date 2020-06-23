package flightspageTest;

import commonAPI.WebAPI;
import flightspage.TripAdvisorFlightspage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
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
    public static void testMoreCategories() throws Exception {
        getInitElements();
        Assert.assertEquals(testFlightsPage.getMoreCategories(), testFlightsPage.validateCategoryList());
    }
//    @Test (priority = 2)
//    public static void TestGoToFlightsPage() {
//        getInitElements();
//        testFlightsPage.goToFlightsPage();
//    }
//    @Test (priority = 3)
//    public static void testDropDownMenu() throws IOException {
//        getInitElements();
//        testFlightsPage.getEllipsMenu();
//        testFlightsPage.validateEllipsMenu();
//    }
//    @Test (priority = 4)
//    public static void testRoundTripBox() {
//        getInitElements();
//        testFlightsPage.roundTripBox();
//    }
//    @Test (priority = 5)
//    public static void testCalendarBox() {
//        getInitElements();
//        testFlightsPage.goToCalendarBox();
//    }
//    @Test (priority = 6)
//    public static void testClasType() throws IOException {
//        getInitElements();
//        testFlightsPage.getClassType();
//        testFlightsPage.validateClassTypelist();
//    }
//    @Test (priority = 7)
//    public static void testExtraFlightOptions() {
//        getInitElements();
//        testFlightsPage.chooseExtraFlightOptions();
//    }
//    @Test (priority = 8)
//    public static void testpriceAlert() {
//        getInitElements();
//        testFlightsPage.priceAlert();
//    }
//    @Test (priority = 9)
//    public static void testCurrencyBox() throws IOException {
//        getInitElements();
//        testFlightsPage.getCurrencyBox();
//        testFlightsPage.validateCurrencyBox();
//    }
//    @Test (priority = 10)
//    public static void testCountryBox() {
//        getInitElements();
//        testFlightsPage.getCountryBox();
//    }
//    @Test (priority = 11)
//    public static void testFlightSearch() {
//        getInitElements();
//        testFlightsPage.doFlightSearch();
//    }
//    @Test (priority = 12)
//    public static void testCheckSortByBox() throws IOException {
//        getInitElements();
//        testFlightsPage.getCheckSortByBox();
//        testFlightsPage.validateCheckSortBybox();
//    }
//    @Test (priority = 13)
//    public static void testCheckDealsBox() {
//        getInitElements();
//        testFlightsPage.validateCheckDealsBox();
//    }
//
//    @Test (priority = 14)
//    public static void testAirlineOptionS() {
//        getInitElements();
//        testFlightsPage.validateAirlineOptions();
//    }
//    @Test (priority = 15)
//    public static void testAmenitiesBox() {
//        getInitElements();
//        testFlightsPage.validateAmenitiesBox();
//    }
//    @Test (priority = 16)
//    public static void testOneWayOption() {
//        getInitElements();
//        testFlightsPage.validateOneWayOption();
//    }
//    @Test (priority = 17)
//    public static void testMultiCityOptions() {
//        getInitElements();
//        testFlightsPage.validateMultiCityOption() ;
//    }
//    @Test (priority = 18)
//    public static void testSideFilter() {
//        getInitElements();
//        testFlightsPage.clearFilter();
//    }
//    @Test (priority = 19)
//    public static void testSideBAr() {
//        getInitElements();
//        testFlightsPage.minimizeSideBar();
//    }

}
