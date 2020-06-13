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
         stJudeHomepage.validateSearchText();
     }


     @Test(enabled = false)

    public static void testDoSearchBar() throws InterruptedException {
         getInItElements();
         stJudeHomepage.doSearchBar();
         stJudeHomepage.validateSearchBar();

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

    @Test(enabled = false)

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

    @Test(enabled = false)

    public static void testDoSearchingTopic(){
         getInItElements();
         stJudeHomepage.doSearchingTopic();
         stJudeHomepage.validateDoSearchingTopic();
    }

    @Test(enabled = false)
    public static void testDoSearchUrl1(){
         getInItElements();
         stJudeHomepage.doSearchUrl1();
         stJudeHomepage.validateDoSearchUrl1();

    }
    @Test(enabled = false)
    public static void testHomePageTitle(){
         getInItElements();
         stJudeHomepage.validateHomePageTitle();

    }
    @Test(enabled = false)
    public static void testHomePageLinkNumber(){
         getInItElements();
         stJudeHomepage.validateHomePageLinkNumber();
    }
    @Test(enabled = false)
    public static void testDoSearchUrl2(){
         getInItElements();
         stJudeHomepage.doSearchUrl2();
         stJudeHomepage.validateDoSearchUrl2();
     }
     @Test(enabled = false)
    public static void testDoSearchDisplayText(){
         getInItElements();
         stJudeHomepage.doSearchDisplayText();
         //stJudeHomepage.validateSearchDisplayText();
     }

     @Test
     public static void testSearchUrl3(){
         getInItElements();
         stJudeHomepage.validateSearchUrl3();
     }



}
