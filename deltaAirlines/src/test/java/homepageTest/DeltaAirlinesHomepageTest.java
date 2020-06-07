package homepageTest;


import commonAPI.WebAPI;
import homepage.DeltaAirlinesHomepage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DeltaAirlinesHomepageTest extends WebAPI {
    static DeltaAirlinesHomepage deltaAirlinesHomepage;

    public static void getInItElement(){
        deltaAirlinesHomepage= PageFactory.initElements(driver,DeltaAirlinesHomepage.class);

    }

    @Test()
    public static void testHomePage(){
        getInItElement();
        deltaAirlinesHomepage.getCurrentPageTitle();
        deltaAirlinesHomepage.validateCurrentPage();
    }
    @Test
    public static void testSearchBar() throws InterruptedException {
        getInItElement();
        deltaAirlinesHomepage.doSearch();
    }

    @Test
    public static void testSignUpButton(){
        getInItElement();
        deltaAirlinesHomepage.signUp();
    }
    @Test(priority = 1)
    public static void testLogInButton(){
        getInItElement();
        deltaAirlinesHomepage.logIn();
    }
    @Test(priority = 0)
    public static void testDepartureAirportSelection(){
        getInItElement();
        deltaAirlinesHomepage.selectDepartureAirport();

    }
    @Test(priority = 1)
    public static void testArrivalAirportSelection() throws InterruptedException {
        getInItElement();
        deltaAirlinesHomepage.selectDestinationAirport();
    }
    @Test(priority = 2)
    public static void testSelectDepartureReturnDate() throws InterruptedException {
        getInItElement();
        deltaAirlinesHomepage.selectDepartureReturnDate();

    }
    @Test(priority = 0)
    public static void testFindYourTripBy(){
        getInItElement();
        deltaAirlinesHomepage.findYourTripBy();

    }
    @Test
    public static void testFindYourTripByTicketNumber(){
        getInItElement();
        deltaAirlinesHomepage.findYourTripByTicketNumber();
   }
    @Test
    public static void testValidateAboutUs() throws InterruptedException {
        getInItElement();
        deltaAirlinesHomepage.validateAboutUs();
    }



}
