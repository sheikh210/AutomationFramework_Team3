package homepageTest;

import commonAPI.WebAPI;
import homepage.TripAdvisorHomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TripAdvisorHomepageTest extends WebAPI {

    static TripAdvisorHomepage tripAdvisorHomepage;
    public static void getInItElements(){
        tripAdvisorHomepage = PageFactory.initElements(driver,TripAdvisorHomepage.class);
    }
    @Test
    public static void testDoSearchElement() throws InterruptedException {
        getInItElements();
        tripAdvisorHomepage.doSearchElement();
    }
}
