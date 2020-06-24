package homepageTest;
import commonAPI.WebAPI;
import homepage.BankOfAmericaHomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class BankOfAmericaHomepageTest extends WebAPI {

    static BankOfAmericaHomepage bankOfAmericaHomepage;

    public static void getInItElements() {
        bankOfAmericaHomepage = PageFactory.initElements(driver, BankOfAmericaHomepage.class);
    }
    @Test(priority = 0)
    public static void testDoLogin() {
        getInItElements();
        bankOfAmericaHomepage.doLogin();
        bankOfAmericaHomepage.validateDoLogin();
    }
    @Test(priority = 1)

    public static void testCheckMenuOptions() throws InterruptedException {
        getInItElements();
        bankOfAmericaHomepage.checkMenuOptions();
        bankOfAmericaHomepage.validateOptions();
    }
    @Test(priority = 2)
    public static void testGetCurrentPageTitle() {

        getInItElements();
        bankOfAmericaHomepage.getCurrentPageTittle();
        bankOfAmericaHomepage.validateGetCurrentPageTittle();

    }
    @Test(priority = 3)
    public static void testFigureOutWebLinksNum() throws IOException {
        getInItElements();
        bankOfAmericaHomepage.figureOutWebLinksNum();
        bankOfAmericaHomepage.validateFigureOutWebLinksNum();
    }
    @Test(priority = 4)
    public static void testDoSearch(){
        getInItElements();
        bankOfAmericaHomepage.doSearch();
        bankOfAmericaHomepage.validateDoSearch();
    }
    @Test(priority = 5)
    public static void testDoSearchATM(){
        getInItElements();
        bankOfAmericaHomepage.doSearchATM();
        bankOfAmericaHomepage.validateDoSearchATM();
    }

    @Test(priority = 6)
    public static void testDoAvailable(){
        getInItElements();
        bankOfAmericaHomepage.doAvailable();
        bankOfAmericaHomepage.validateDoAvailable();
    }
    @Test(priority = 7)
    public static void testDoSearchText(){
        getInItElements();
        bankOfAmericaHomepage.doSearchText();
        bankOfAmericaHomepage.validateDoSearchText();
    }
    @Test(priority = 8)
    public static void testDoSearchElements() throws InterruptedException {
        getInItElements();
        bankOfAmericaHomepage.doSearchElements();
        bankOfAmericaHomepage.validateDoSearchElements();

    }
    @Test(priority = 9 )
    public static void testGetText(){
        getInItElements();
        bankOfAmericaHomepage.getText();
        bankOfAmericaHomepage.validateGetText();

    }
    @Test(priority = 10)
    public static void testCheckLinks(){
        getInItElements();
        bankOfAmericaHomepage.doGetCurrentUrl();
        bankOfAmericaHomepage.validateCurrentUrl();
    }
    @Test(priority = 11)
    public static void testDoCountWebLink(){
        getInItElements();
        bankOfAmericaHomepage.doCountWebLink();
        bankOfAmericaHomepage.validateDoCountWebLink();
    }
    @Test(priority = 12)
    public static void testDoCheckUrl(){
        getInItElements();
        bankOfAmericaHomepage.doCheckUrl();
        bankOfAmericaHomepage.validateDoCheckUrl();
    }
    @Test(priority = 13)
    public static void testDoBrowse() throws InterruptedException {
        getInItElements();
        bankOfAmericaHomepage.doBrowsingForText();
        bankOfAmericaHomepage.validateBrowsingForText();
    }
    @Test(priority = 14)
    public static void testDoSecureLogIn(){
        getInItElements();
        bankOfAmericaHomepage.doSecureLogIn();
        bankOfAmericaHomepage.validateSecureLogIn();
    }
    @Test(priority = 15)
    public static void testDoCheckWebPage(){
        getInItElements();
        bankOfAmericaHomepage.doCheckWebPage();
        bankOfAmericaHomepage.validateCheckWebPage();
    }
    @ Test(priority = 16 )
    public static void TesHomepageLinksNum(){
        getInItElements();
        bankOfAmericaHomepage.validateHomepageLinksNum();
    }
    @Test(priority = 17)
    public static void testHomePageTitle(){
        getInItElements();
        bankOfAmericaHomepage.validateHomePageTitle();
    }
    @Test(priority = 18)
    public static void testSearchDisplayedElement(){
        getInItElements();
        bankOfAmericaHomepage.doSearchDisplayedElement();
        bankOfAmericaHomepage.validateSearchDisplayedElement();
    }
    @Test(priority = 19)
    public static void testSearchDisplayedText(){
        getInItElements();
        bankOfAmericaHomepage.doSearchDisplayedText();
        bankOfAmericaHomepage.validateSearchDisplayedText();
    }
}


