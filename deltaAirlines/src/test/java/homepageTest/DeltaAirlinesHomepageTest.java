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

    @Test(priority = 0)
    public static void testHomePage(){
        getInItElement();
        deltaAirlinesHomepage.getCurrentPageTitle();
        deltaAirlinesHomepage.validateCurrentPage();
    }

   @Test(priority = 9)
    public static void testSearchBar() throws InterruptedException {
        getInItElement();
        deltaAirlinesHomepage.doSearch();
        deltaAirlinesHomepage.validateDoSearch();
    }

    @Test(priority=8)
    public static void testSignUpButton(){
        getInItElement();
        deltaAirlinesHomepage.signUp();
        deltaAirlinesHomepage.validateSignUp();
    }
    @Test(priority = 7)
    public static void testLogInButton() throws InterruptedException {
        getInItElement();
        deltaAirlinesHomepage.logIn();
        deltaAirlinesHomepage.validateLogIn();
    }
    @Test(priority = 10)
    public static void testDepartureAirportSelection(){
        getInItElement();
        deltaAirlinesHomepage.selectDepartureAirport();
        deltaAirlinesHomepage.validateDepartureAirport();

    }
    @Test(priority = 11)
    public static void testArrivalAirportSelection() throws InterruptedException {
        getInItElement();
        deltaAirlinesHomepage.selectDestinationAirport();
        deltaAirlinesHomepage.validateDestinationAirport();
    }
    @Test(priority = 12)
    public static void testSelectDepartureReturnDate() throws InterruptedException {
        getInItElement();
        deltaAirlinesHomepage.selectDepartureReturnDate();
        deltaAirlinesHomepage.validateDepartureReturnDate();

    }
    @Test(priority = 3)
    public static void testFindYourTripBy() throws InterruptedException {
        getInItElement();
        deltaAirlinesHomepage.findYourTripBy();
        deltaAirlinesHomepage.validateYourTripBy();

    }
    @Test(priority = 4)
    public static void testFindYourTripByTicketNumber() throws InterruptedException {
        getInItElement();
        deltaAirlinesHomepage.findYourTripByTicketNumber();
        deltaAirlinesHomepage.validateYourTripByTicketNumber();
   }
    @Test(priority = 18)
    public static void testValidateAboutUs() throws InterruptedException {
        getInItElement();
        deltaAirlinesHomepage.clickAboutUs();
        deltaAirlinesHomepage.validateAboutUs();
    }
    @Test(priority = 2)
    public static void testBookButton(){
        getInItElement();
        deltaAirlinesHomepage.clickBookButton();
        deltaAirlinesHomepage.validateClickBookButton();
    }
    @Test(priority = 5)
    public static void testFlightStatus() throws InterruptedException {
        getInItElement();
        deltaAirlinesHomepage.confirmFlightStatus();
        deltaAirlinesHomepage.validateFlightStatus();

    }
   @Test(priority = 17)
   public static void testGetSubLinksFlightInfo() throws InterruptedException {
       getInItElement();
    deltaAirlinesHomepage.getSubLinksFlightInfo();
    }
  @Test(priority = 9)
    public static void testCountSearchSubLinks(){
      getInItElement();
      deltaAirlinesHomepage.countSearchSubLinks();
  }
  @Test(priority = 16)
    public static void testClickNeedHelpLink(){
      getInItElement();
      deltaAirlinesHomepage.clickNeedHelpLink();
      deltaAirlinesHomepage.validateNeedHelpLink();
  }
  @Test(priority = 15)
    public static void testClickCoronaVirusLink()  {
      getInItElement();
      deltaAirlinesHomepage.clickCoronaVirusLink();
      deltaAirlinesHomepage.validateClickCoronaVirusLink();
  }


    @Test(priority = 14)
    public static void testCountFooterSectionLinks(){
        getInItElement();
        deltaAirlinesHomepage.countFooterSectionLinks();
        deltaAirlinesHomepage.validateNumberOfLinks();

    }
    @Test(priority = 13)
    public static void testClickDownloadApp(){
        getInItElement();
        deltaAirlinesHomepage.clickDownloadAppLink();
        deltaAirlinesHomepage.validateDownloadAppLink();
    }
}


