package homepageTest;

import commonAPI.WebAPI;
import homepage.TripAdvisorHomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

    public class TripAdvisorHomepageTest extends WebAPI {
    static TripAdvisorHomepage tripAdvisorHomepage;

    public static void getInItElements() {
        tripAdvisorHomepage = PageFactory.initElements(driver, TripAdvisorHomepage.class);
    }
    //1
    @Test(enabled = false)
    public void testDoHotelMenu() {
        getInItElements();
        tripAdvisorHomepage.doSearchingText();
        tripAdvisorHomepage.validateDoSearchingText();
    }
    //2
    @Test(enabled = false)
    public void testDoSearchElements() throws InterruptedException {
        getInItElements();
       tripAdvisorHomepage.doSearchElement();
       tripAdvisorHomepage.validateDoSearchSelectTextZero();
    }

    //3
    @Test(enabled = false)
    public void testDoSearchTitle() {
        getInItElements();
        tripAdvisorHomepage.doSearchTitle();
        tripAdvisorHomepage.validateDoSearchTitle();
    }

    //4
    @Test(enabled = false)
    public void testDoThingsToDo() {
    getInItElements();
    tripAdvisorHomepage.doSearchThingsToDo();
    tripAdvisorHomepage.validateDoThingsToDo();
    }
    //5
    @Test(enabled = false)
    public void testDoSearchInsuranceTitle() {
    getInItElements();
    tripAdvisorHomepage.doSearchInsuranceTitle();
    tripAdvisorHomepage. validateDoSearchInsuranceMenu();
    }
    //6
    @Test(enabled = false)
    public void testDoSearchMoreButton() {
        getInItElements();
        tripAdvisorHomepage.doSearchMoreButton();
        tripAdvisorHomepage.validateDoSearchMoreMenu();
    }
    //7
    @Test(enabled = false)
    public void testDoSearchBar() {
        getInItElements();
        tripAdvisorHomepage.doSearchBar();
        tripAdvisorHomepage.validateDoSearchFlightsMenu();
    }
    //8
    @Test(enabled = false)
    public void testDoSearchTopic() {
        getInItElements();
        tripAdvisorHomepage.doSearchTopic();
        tripAdvisorHomepage.validateDoSearchInformation();
    }
    //9
    @Test(enabled = false)
    public void testDoSearchTravelTopic() {
        getInItElements();
        tripAdvisorHomepage.doSearchTravelTopic();
        tripAdvisorHomepage.validateDoTravelForumsMenu();
    }
    //10
    @Test(enabled = false)
    public static void testDoSearchReviewMenu() {
        getInItElements();
        tripAdvisorHomepage.doSearchReviewMenu();
        tripAdvisorHomepage.validateDoReviewMenuButton();
    }
    //11
        @Test(enabled = false)
        public static void testDoSearchUrl(){
        getInItElements();
        tripAdvisorHomepage.doSearchUrl();
        tripAdvisorHomepage.validateDoSearchUrl();
        }
    //12
        @Test(enabled = false)
        public static void testDoSearchUrlTwo(){
        getInItElements();
        tripAdvisorHomepage.doSearchUrlTwo();
        tripAdvisorHomepage.validateDoSearchUrlTwo();
        }
        //13
        @Test(enabled = false)
        public static void testDoSearchUrlThree(){
            getInItElements();
            tripAdvisorHomepage.doSearchUrlThree();
            tripAdvisorHomepage.validateDOSearchUrlThree();
        }
        //14
        @Test(enabled = false)
        public static void testDoSearchUrlFour(){
        getInItElements();
        tripAdvisorHomepage.doSearchUrlFour();
        tripAdvisorHomepage.validateDoSearchUrlFour();
        }
        //15
        @Test(enabled = false)
        public static void testDoSearchElementDestinationNewYork(){
        getInItElements();
        tripAdvisorHomepage.doSearchDestinationNewYork();
        tripAdvisorHomepage.validateNeverSleepCity();
        }

        //16
        @Test(enabled = false)
        public static void testHomePageTitle(){
        getInItElements();
        tripAdvisorHomepage.validateHomePageTitle();
        }
        //17
        @Test(enabled = false)
        public static void testHomePageLinkNumber(){
        getInItElements();
        tripAdvisorHomepage.validateHomepageLinkNumber();
        }
        //18
        @Test(enabled = false)
        public static void testDoSearchInsuranceTwo(){
        getInItElements();
        tripAdvisorHomepage.doSearchInsuranceTwo();
        tripAdvisorHomepage.validateElementPlanTwo();
        }
        //19
        @Test(enabled = false)
        public void testDoSearchAlertMenuTwo() {
            getInItElements();
            tripAdvisorHomepage.doSearchAlertMenuTwo();
            tripAdvisorHomepage.validateDoFindAlertMenuTwo();
        }
        //20
        @Test(enabled = false)
        public void testDoSearchPostReviewTwo(){
        getInItElements();
        tripAdvisorHomepage.doSearchPostReviewTwo();
        tripAdvisorHomepage.validateDoFindPostTwo();
        }

}