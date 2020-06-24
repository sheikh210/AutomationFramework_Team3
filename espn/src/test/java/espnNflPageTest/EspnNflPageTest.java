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
        Assert.assertEquals("171", "171");
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
@Test (priority = 13,enabled = false)
public static void testSearchFollowButtonIsAvailable() {
    getInItElements();
    boolean actualValue = espnNflPage.validateSearchFollowButtonIsAvailable();
    Assert.assertEquals(actualValue, true);
}

//14
@Test (priority = 14,enabled = false)
public static void testReturnToSearchButtonPage2() {
    getInItElements();
    espnNflPage.validateReturnToSearchButtonPage2();
}
//15
@Test (enabled = false)
public static void testMiamiDolphinsIsAvailable() {
    getInItElements();
    boolean actualValue = espnNflPage.validateMiamiDolphinsIsAvailable();
    Assert.assertEquals(actualValue, true);
}
//16
@Test(priority = 16, enabled = false)
public static void testDropdownSeasonListSize() {
    getInItElements();
    espnNflPage.validateDropdownSeasonListSizeAndLinks();
}

//17
@Test(priority = 17,enabled = false)
public static void testIndianaPolesIsAvailable() {
    getInItElements();
    boolean actualValue = espnNflPage.validateIndianaPolesIsAvailable();
    Assert.assertEquals(actualValue, true);
}

//18
@Test(priority = 18,enabled = false)
public static void testNavigateToBaltimore() {
    getInItElements();
    String actualURL = espnNflPage.validateNavigateToBaltimore();
    String expectedURL = "https://www.espn.com/";
    Assert.assertEquals(actualURL, expectedURL, "NAVIGATE TO OWNER PAGE");
}

//19
    @Test (priority = 19,enabled = false)
    public static void testTopHeadingIsAvailable() {
    getInItElements();
    boolean actualValue = espnNflPage.validateTopHeadingIsAvailable();
    Assert.assertEquals(actualValue, true);
}
//20
@Test(priority = 20,enabled = false)
public static void testNavigateToBuffaloBill() {
    getInItElements();
    String actualURL = espnNflPage.validateNavigateToBuffaloBill();
    String expectedURL = "https://www.espn.com/";
    Assert.assertEquals(actualURL, expectedURL, "NAVIGATE TO OWNER PAGE");
}

}
