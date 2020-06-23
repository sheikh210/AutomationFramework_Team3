package changeMyFlightTest;

import changeMyFlight.ChangeMyFlightPage;
import commonAPI.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeMyFlightTest extends WebAPI {
    static ChangeMyFlightPage changeMyFlight;

    public static void getInItElements() {
        changeMyFlight = PageFactory.initElements(driver, ChangeMyFlightPage.class);

    }

    @Test
    public static void testNavigateToChangeMyFlightPage() throws InterruptedException {
        getInItElements();
        changeMyFlight.navigateToChangeMyFlightPage();
        changeMyFlight.validateNavigateToChangeMyFlightPage();
    }

    @Test
    public static void testCoronaVirusPageUpdate() {
        getInItElements();
        String actualUrl = changeMyFlight.validateCoronaVirusPageUpdate();
        String expectedUrl = "https://www.delta.com/us/en/travel-update-center/overview";
        Assert.assertEquals(actualUrl, expectedUrl, "Expected url not found");

    }

    @Test
    public static void testCoronaVirusPageTitle() {
        getInItElements();
        String actualTitle = changeMyFlight.validateCoronaVirusPageTitle();
        String expectedTitle = "Travel Update Center: Safety & Flexibility | Delta Air Lines";
        Assert.assertEquals(actualTitle, expectedTitle, "Expected title not found");
    }
    @Test
    public static void validateArrowMenu(){
        getInItElements();
        changeMyFlight.validateArrowMenu();
    }
    @Test
    public static void testMoveBackward(){
        getInItElements();
        changeMyFlight.validateMoveBackward();
    }
    @Test
    public static void testReturnToTravelUpdatePage(){
        getInItElements();
        changeMyFlight.validateReturnToTravelUpdatePage();
    }
    @Test
    public static void testWebElementIsAvailabe() throws InterruptedException {
        getInItElements();
        boolean actulaValue = changeMyFlight.validateWebElementIsAvailabe();
        Assert.assertEquals(actulaValue,true);
    }
    @Test
    public static void testExpectedPage() throws InterruptedException {
        getInItElements();
        changeMyFlight.expectedPage();
        changeMyFlight.validateExpectedPage();

    }
    @Test
    public static void testFromDeltaToOurCustomer(){
        getInItElements();
        changeMyFlight.validateFromDeltaToOurCustomer();
    }
    @Test
    public static void testFlying(){
        getInItElements();
        changeMyFlight.validateFlying();
    }
}
