package homepageTest;

import commonAPI.WebAPI;
import homepage.StJudeHomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class StJudeHomepageTest extends WebAPI {


     static StJudeHomepage stJudeHomepage;
     public static void getInItElements(){
         stJudeHomepage= PageFactory.initElements(driver,StJudeHomepage.class);

     }


     @Test(enabled = false)
     public static void testDoSearchText(){
         getInItElements();
         stJudeHomepage.doSearchText();
         stJudeHomepage.validateDoSearchText();
     }


     @Test(enabled = false)

    public static void testDoSearchBar() throws InterruptedException {
         getInItElements();
         stJudeHomepage.doSearchBar();
         stJudeHomepage.validateDoSearchBar();

     }

     @Test(enabled = false)
    public static void testDoSearchTopic(){
         getInItElements();
         stJudeHomepage.doSearchTopic();
         stJudeHomepage.validateDoSearchTopic();
     }

    @Test(enabled = false)
    public static void testSearchTrainingTopic(){
        getInItElements();
        stJudeHomepage.searchTraining();
        stJudeHomepage.validateSearchTrainingTopic();
    }

    @Test(enabled = false)
    public static void testDoSearchUrl(){
         getInItElements();
         stJudeHomepage.doSearchTitle();
         stJudeHomepage.validateDoSearchTitle();

    }

    @Test(enabled = false)
    public static void testDoSearchElement(){
         getInItElements();
         stJudeHomepage.doSearchElement();
         stJudeHomepage.validateDoSearchElement();
    }

    @Test(enabled = false )

    public static void testDoSearchButton(){
         getInItElements();
         stJudeHomepage.doSearchButton();
         stJudeHomepage.validateDoSearchButton();
    }

    @Test(enabled = false)

    public static void testDoSearchingButton(){
         getInItElements();
         stJudeHomepage.doSearchingButton();
         stJudeHomepage.validateDoSearchingButton();
    }

    @Test(enabled = false)

    public static void testDoSearchingElement(){
         getInItElements();
         stJudeHomepage.doSearchingElement();
         stJudeHomepage.validateDoSearchingElement();
    }

    @Test

    public static void testDoSearchingTopic(){
         getInItElements();
         stJudeHomepage.doSearchingTopic();
         stJudeHomepage.validateDoSearchingTopic();
    }

}
