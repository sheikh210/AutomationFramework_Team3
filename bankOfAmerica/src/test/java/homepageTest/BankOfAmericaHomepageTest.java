package homepageTest;

import commonAPI.WebAPI;
import homepage.BankOfAmericaHomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BankOfAmericaHomepageTest extends WebAPI {

    static BankOfAmericaHomepage bankOfAmericaHomepage;

    public static void getInItElements() {
        bankOfAmericaHomepage = PageFactory.initElements(driver, BankOfAmericaHomepage.class);

    }

    @Test(priority = 0,enabled = false)
    public static void testDoLogin() {
        getInItElements();

        bankOfAmericaHomepage.doLogin();
        bankOfAmericaHomepage.validateDoLogin();


    }

    @Test(priority = 1, enabled = false)

    public static void testCheckMenuOptions() throws InterruptedException {

        getInItElements();
        bankOfAmericaHomepage.checkMenuOptions();
        bankOfAmericaHomepage.validateOptions();
    }

    @Test(priority = 2, enabled = false)
    public static void testGetCurrentPageTitle() {

        getInItElements();
        bankOfAmericaHomepage.getCurrentPageTittle();
        bankOfAmericaHomepage.validateGetCurrentPageTittle();

    }
    @Test(priority = 3, enabled = false)
    public static void testSelectLanguage(){
        getInItElements();
        bankOfAmericaHomepage.selectLanguage();
    }
    @Test(priority = 4, enabled = false)
    public static void testDoSearch(){
        getInItElements();
        bankOfAmericaHomepage.doSearch();
        bankOfAmericaHomepage.validateDoSearch();
    }
    @Test(priority = 5, enabled = false)
    public static void testDoSearchATM(){
        getInItElements();
        bankOfAmericaHomepage.doSearchATM();
        bankOfAmericaHomepage.validateDoSearchATM();
    }

    @Test(priority = 6, enabled = false)
    public static void testDoAvailable(){
        getInItElements();
        bankOfAmericaHomepage.doAvailable();
        bankOfAmericaHomepage.validateDoAvailable();
    }
    @Test(priority = 7, enabled = false)
    public static void testDoSearchText(){
        getInItElements();
        bankOfAmericaHomepage.doSearchText();
        bankOfAmericaHomepage.validateDoSearchText();
    }
    @Test(priority = 8, enabled = false)
    public static void testDoSearchElements() throws InterruptedException {
        getInItElements();
        bankOfAmericaHomepage.doSearchElements();
        bankOfAmericaHomepage.validateDoSearchElements();

    }
    @Test
    public static void testGetText(){
        getInItElements();
        bankOfAmericaHomepage.getText();
        bankOfAmericaHomepage.validateGetText();

    }




}
