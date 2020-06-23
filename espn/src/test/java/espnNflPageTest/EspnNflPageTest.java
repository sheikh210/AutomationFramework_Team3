package espnNflPageTest;

import commonAPI.WebAPI;

import espnNflPage.EspnNflPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.io.IOException;


public class EspnNflPageTest extends WebAPI{
    static EspnNflPage espnNflPage;
    public static void getInItElements() {
        espnNflPage = PageFactory.initElements(driver,EspnNflPage.class);
    }
    //1
    @Test (priority = 1,enabled = false)
    public static void testNflButton(){
        getInItElements();
        espnNflPage.navigateToNFLButton();
    }
    //2
    @Test(priority = 2,enabled = false)
    public static void testNflHomePageUrl(){
        getInItElements();
        String actualUrl = espnNflPage.validateNflHomePageUrl();
        Assert.assertEquals(actualUrl,"https://www.espn.com/");
    }
//3
    @Test(priority = 3,enabled = false)
    public static void testNFLPageTitle(){
    getInItElements();
    String actualTitle = espnNflPage.validateNFLPageTitle();
    Assert.assertEquals(actualTitle,"ESPN: Serving sports fans. Anytime. Anywhere.");
    }
    //4
    @Test(priority = 4,enabled = false)
    public static void testNFLLinkNumber() {
        getInItElements();
        espnNflPage.validateNFLLinkNumber();
    }
//5
@Test(priority = 5,enabled = false)
public static void testSubscribeButtonLink(){
    getInItElements();
    espnNflPage.validateSubscribeButtonLink();
}
//6
@Test(priority = 6,enabled = false)
public void testDoMoveBackward() {
    getInItElements();
    espnNflPage.validateDoMoveBackward();
}
//7
@Test(priority = 7,enabled = false)
public static void testReturnToMotorButtonPage() {
    getInItElements();
    espnNflPage.validateReturnToMotorButtonPage();
}
//8
@Test(priority = 8,enabled = false)
public static void testNavigateToOwnerPage() {
    getInItElements();
    String actualURL = espnNflPage.validateNavigateToOwnerPage();
    String expectedURL = "https://www.espn.com/";
    Assert.assertEquals(actualURL, expectedURL, "NAVIGATE TO OWNER PAGE");
}
//9
@Test (priority = 9,enabled = false)
public void testIsHomePageLogoDisplayed(){
    getInItElements();
    espnNflPage.isHomePageLogoDisplayed();
    Assert.assertEquals(espnNflPage.isHomePageLogoDisplayed(),true,"not displayed");
}
//10
@Test(priority = 10,enabled = false)
public static void testLogInButton() throws InterruptedException {
    getInItElements();
    espnNflPage.validateLogInButton();
}
//11
@Test(priority = 11,enabled = false)
public static void testSignUp () throws InterruptedException {
    getInItElements();
    espnNflPage.validateSignUP();
}
 //12
 @Test(priority = 12,enabled = false)
 public static void testScoresButton() {
     getInItElements();
    espnNflPage.clickScoresButton();
 }
//13
@Test(priority = 13,enabled = false)
public static void testSearchBear() throws InterruptedException {
    getInItElements();
    espnNflPage.validateSearchBear();
}
//14
@Test (priority = 14,enabled = false)
public static void testReturnToSearchButtonPage2() {
    getInItElements();
    espnNflPage.validateReturnToSearchButtonPage2();
}
//15
    @Test(priority = 15, enabled = false)
    public static void testFootball() throws InterruptedException {
        getInItElements();
        espnNflPage.validateSearchFootball();
    }
//16
@Test(priority = 16,enabled = false)
public static void testDropdownSeasonListSize() {
    getInItElements();

    espnNflPage.validateDropdownSeasonListSizeAndLinks();
}
//17
@Test(priority = 17,enabled = false)
public static void testScoreButton() throws InterruptedException {
    getInItElements();
    espnNflPage.validateScore();
}

}
