package flightspageTest;

import commonAPI.WebAPI;
import flightspage.TripAdvisorFlightspage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TripAdvisorFlightspageTest extends WebAPI {

    static TripAdvisorFlightspage testFlightsPage;

    public static void getInitElements() {
        testFlightsPage = PageFactory.initElements(driver, TripAdvisorFlightspage.class);
    }


    @Test (priority = 0)
    public static void doTestFlightsPage() {
        getInitElements();
        testFlightsPage.goToFlightsPage();
    }
}
