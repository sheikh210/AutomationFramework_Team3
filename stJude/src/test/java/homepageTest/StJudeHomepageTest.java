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


     @Test
     public static void testDoSearchText() throws InterruptedException {
         getInItElements();
         stJudeHomepage.doSearchText();
         stJudeHomepage.validateSearchText();
     }


     @Test

    public static void testDoSearchBar() throws InterruptedException {
         getInItElements();
         stJudeHomepage.doSearchBar();
         stJudeHomepage.validateDoSearchBar();

     }

     @Test
    public static void testDoSearchTopic(){
         getInItElements();
         stJudeHomepage.doSearchTopic();
         stJudeHomepage.validateDoSearchTopic();
     }

    @Test
    public static void testSearchTrainingTopic(){
        getInItElements();
        stJudeHomepage.searchTraining();
        stJudeHomepage.validateSearchTrainingTopic();
    }

    @Test
    public static void testDoSearchUrl(){
         getInItElements();
         stJudeHomepage.doSearchTitle();
         stJudeHomepage.validateDoSearchTitle();

    }

    @Test
    public static void testDoSearchElement(){
         getInItElements();
         stJudeHomepage.doSearchElement();
         stJudeHomepage.validateDoSearchElement();
    }

    @Test

    public static void testDoSearchButton(){
         getInItElements();
         stJudeHomepage.doSearchButton();
         stJudeHomepage.validateDoSearchButton();
    }

    @Test

    public static void testDoSearchingButton(){
         getInItElements();
         stJudeHomepage.doSearchingButton();
         stJudeHomepage.validateDoSearchingButton();
    }

    @Test

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

    @Test
    public static void testDoSearchUrl1(){
         getInItElements();
         stJudeHomepage.doSearchUrl1();
         stJudeHomepage.validateDoSearchUrl1();

    }
    @Test
    public static void testHomePageTitle(){
         getInItElements();
         stJudeHomepage.validateHomePageTitle();

    }
    @Test
    public static void testHomePageLinkNumber(){
         getInItElements();
         stJudeHomepage.validateHomePageLinkNumber();
    }
    @Test
    public static void testDoSearchUrl2(){
         getInItElements();
         stJudeHomepage.doSearchUrl2();
         stJudeHomepage.validateDoSearchUrl2();
     }
     @Test
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
     @Test
     public static void testSearchUrl5(){
         getInItElements();
         stJudeHomepage.validateSearchUrl5();
     }
     @Test
    public static void testHandleDropDownMenu() throws InterruptedException {
         getInItElements();
         stJudeHomepage.doHandleDropDownMenu();
         //stJudeHomepage.validateHandleDropDownMenu();

     }
     @Test
    public static void testDropDownMenu1() throws InterruptedException {
         getInItElements();
         stJudeHomepage.doHandleDropDownSubMenu1();


     }
     @Test
    public static void testSearchUrl4(){
         getInItElements();
         stJudeHomepage.validateSearchUrl4();
     }



}
