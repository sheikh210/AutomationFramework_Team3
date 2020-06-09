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
    @Test
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
    }
//3
    @Test(enabled = false)
    public void testDoSearchTitle() {
        getInItElements();
        tripAdvisorHomepage.doSearchTitle();
        tripAdvisorHomepage.validateDoSearchTitle();

    }




}