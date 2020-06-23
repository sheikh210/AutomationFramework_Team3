package motorsPageTest;
import commonAPI.WebAPI;
import motorsPage.MotorsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.io.IOException;

public class MotorsPageTest extends WebAPI{

    static MotorsPage motorsPage;
    public static void getInItElements() {

        motorsPage = PageFactory.initElements(driver,MotorsPage.class);
    }
    //1
    @Test (priority = 1, enabled = false)
    public static void testMotorsButton(){
        getInItElements();
        motorsPage.navigateToMotorsButton();
    }
    //2
    @Test(priority = 2,enabled = false)
    public static void testMotorButtonPageUrl(){
        getInItElements();
        String actualUrl = motorsPage.validateSmallBusinessPageUrl();
        Assert.assertEquals(actualUrl,"https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334");
    }
    //3
    @Test (priority = 3,enabled = false)
    public static void testMotorPageTitle(){
        getInItElements();
        String actualTitle = motorsPage.validateMotorPageTitle();
        Assert.assertEquals(actualTitle,"eBay Motors: Auto Parts and Vehicles | eBay");
    }
    //4
    @Test(enabled = false)
    public static void testMotorLinkNumber() {
        getInItElements();
        motorsPage.validateMotorLinkNumber();
    }
//5
    @Test (priority = 5, enabled = false)
    public static void testOtherVehicleLink(){
    getInItElements();
    motorsPage.validateOtherVehicleLink();
    }
    //6
    @Test(priority = 6, enabled = false)
    public void testDoMoveBackward() {
        getInItElements();
        motorsPage.validateDoMoveBackward();
    }
    //7
    @Test(priority = 7, enabled = false)
    public static void testReturnToMotorButtonPage() {
        getInItElements();
        motorsPage.validateReturnToMotorButtonPage();
    }
    //8
    @Test(priority = 8, enabled = false)
    public static void testNavigateToOwnerPage() {
        getInItElements();
        String actualURL = motorsPage.validateNavigateToOwnerPage();
        String expectedURL = "https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334";
        Assert.assertEquals(actualURL, expectedURL, "NAVIGATE TO OWNER PAGE");
    }
    //9
    @Test(priority = 9, enabled = false)
    public void testIsHomePageLookingMenuDisplayed(){
        getInItElements();
        motorsPage.isHomePageLookingMenuDisplayed();
        Assert.assertEquals(motorsPage.isHomePageLookingMenuDisplayed(),true,"not displayed");
    }
    //10
    @Test(priority = 10, enabled = false)
    public static void testPartAndAccessories() {
        getInItElements();
        motorsPage.clickPartAndAccessories();
    }
    //11
    @Test(priority = 11, enabled = false)
    public static void testCarAndTruck() {
        getInItElements();
        motorsPage.clickCarAndTruck();
    }
    //12
    @Test(priority = 12, enabled = false)
    public static void testWheelMenu() {
        getInItElements();
        motorsPage.clickWheelMenu();
    }
    //13
    @Test(priority = 13, enabled = false)
    public static void testMotorCycleMenu() {
        getInItElements();
        motorsPage.clickMotorCycleMenu();
    }
    //14
    @Test (priority = 14, enabled = false)
    public void testIsHomePageLogoDisplayed(){
        getInItElements();
        motorsPage.isHomePageLogoDisplayed();
        Assert.assertEquals(motorsPage.isHomePageLogoDisplayed(),true,"Home Page Logo is not displayed");
    }
    //15
    @Test(priority = 15, enabled = false)
    public static void testPowerSports() throws InterruptedException {
        getInItElements();
        motorsPage.validatePowerSports();
    }
    //16
    @Test(priority = 16, enabled = false)
    public static void testBatteryCharger() throws InterruptedException {
        getInItElements();
        motorsPage.validateBatteryCharger();
    }
    //17
    @Test(priority = 17, enabled = false)
    public static void testAntiqueBoats() throws InterruptedException {
        getInItElements();
        motorsPage.validateAntiqueBoats();
    }
    //18
    @Test (priority = 18, enabled = false)
    public static void testExoticsMenu() throws InterruptedException {
        getInItElements();
        motorsPage.validateExoticsMenu();
    }
    //19
    @Test(priority = 19, enabled = false)
    public static void testEBayButton() {
        getInItElements();
        motorsPage.clickEBayButton();
    }
    //20
    @Test(priority =20, enabled = false)
    public static void testCollectorCar() {
        getInItElements();
        motorsPage.clickCollectorCar();
    }



}
