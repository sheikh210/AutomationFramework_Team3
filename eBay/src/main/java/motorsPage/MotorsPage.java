package motorsPage;
import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.util.List;

import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import static motorsPage.MotorsElementsPage.*;


public class MotorsPage extends WebAPI {
    @FindBy(how = How.XPATH, using = webElementMotorsButton)
    public WebElement motorsButton;
    @FindBy(how = How.XPATH, using = webElementOpenEBay)
    public WebElement openEBay;
    @FindBy(how = How.XPATH, using =  webElementOtherVehicleLink)
    public WebElement chanelLink;
    @FindBy(xpath = WebElementLookingMenu)
    public WebElement lookingButton;
    @FindBy(xpath = WebElementLoGoButton)
    public WebElement logoButton;
    @FindBy(how = How.XPATH, using = webElementPartAndAccessories)
    public WebElement partsAndAccessoriesButton;
    @FindBy(how = How.XPATH, using =  webElementLighterMenu )
    public WebElement lighterMenu;
    @FindBy(how = How.XPATH, using = webElementCarAndTruck)
    public WebElement carAndTruckButton;
    @FindBy(how = How.XPATH, using = webElementBlueToothHeadset)
    public WebElement blueToothMenu;
    @FindBy(how = How.XPATH, using = webElementWheelMenu)
    public WebElement wheelMenuButton;
    @FindBy(how = How.XPATH, using = webElementPulseOxiMeter)
    public WebElement pulseOxiMeter;
    @FindBy(how = How.XPATH, using = webElementMotorCycleMenu)
    public WebElement oilDiffuserMenu;
    @FindBy(how = How.XPATH, using = webElementOilDiffuser)
    public WebElement oilDiffuserButton;
    @FindBy(how = How.XPATH, using = webElementCollectorCar)
    public WebElement collectorCarMenu;
    @FindBy(how = How.XPATH, using = webElementEBayButton)
    public WebElement eBayButtonMenu;
    @FindBy(how = How.XPATH, using =webElementAntiqueCar)
    public WebElement antiqueCar;
    @FindBy(how = How.XPATH, using = webElementPowerSports)
    public WebElement powerSports;
    @FindBy(how = How.XPATH, using = webElementBatteryCharger)
    public WebElement batteryCharger;

    @FindBy(how = How.XPATH, using = webElementAntiqueBoats)
    public WebElement antiqueBoats;
    @FindBy(how = How.XPATH, using = webElementFishingBoats)
    public WebElement fishingBoats;
    @FindBy(how = How.XPATH, using = webElementExoticsMenu)
    public WebElement exoticsMenu;
    @FindBy(how = How.XPATH, using = webElementJaguar)
    public WebElement jaguarMenu;

//1
public void navigateToMotorsButton(){
    WebDriverWait wait = new WebDriverWait(driver,15);
    wait.until(ExpectedConditions.elementToBeClickable(motorsButton));
    motorsButton.click();
}
    public void validateNavigateToMotorsButton(){
        boolean actualText_Is_Available = motorsButton.isDisplayed();
        boolean expectedText_Is_Available = true;
        Assert.assertEquals(actualText_Is_Available, expectedText_Is_Available, "Display not found");
    }
//2
    public String validateSmallBusinessPageUrl() {
   navigateToMotorsButton();
    String motorButtonPageUrl = super.getCurrentPageUrl();
    driver.navigate().refresh();
    System.out.println("Motors Button: "+motorButtonPageUrl);
    return motorButtonPageUrl;
    }
//3
    public String validateMotorPageTitle() {
    navigateToMotorsButton();
    String motorPageTitle = super.getCurrentPageTitle();
    driver.navigate().refresh();
    System.out.println("motor page: "+motorPageTitle);
    return motorPageTitle;
    }
    //4
    public void validateMotorLinkNumber() {
        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println(list.size());
        int linkNumber = list.size();
        Assert.assertEquals(linkNumber, "384", "Expected Link Number Not Found");
    }
    //5
    public void validateOtherVehicleLink(){
   navigateToMotorsButton();
    String actualLink = chanelLink.getAttribute("a");
    System.out.println(actualLink);
    Assert.assertEquals(actualLink,null);
    }
    //6
    public void validateDoMoveBackward() {
        navigateToMotorsButton();
        driver.navigate().back();
        String actualUrl = super.getCurrentPageUrl();
        System.out.println(actualUrl);
        String expectedUrl = "https://www.ebay.com/";
        Assert.assertEquals(actualUrl, expectedUrl);
    }
//7
    public void validateReturnToMotorButtonPage() {
    navigateToMotorsButton();
    driver.navigate().back();
    System.out.println(super.getCurrentPageUrl());
    driver.navigate().forward();
    driver.navigate().refresh();
    String actualUrl = super.getCurrentPageUrl();
    String motorButtonPageUrl = "https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334";
    Assert.assertEquals(actualUrl, motorButtonPageUrl);
    }
//8
    public String validateNavigateToOwnerPage() {
    navigateToMotorsButton();
    String url = driver.getCurrentUrl();
    System.out.println("Page URL - " + url);
    return url;
    }
    //9
    public boolean isHomePageLookingMenuDisplayed(){
    navigateToMotorsButton();
    waitUntilVisible(By.xpath(WebElementLookingMenu));
    boolean isElementDisplayed= lookingButton.isDisplayed();
    return isElementDisplayed;
    }
    //10
    public void clickPartAndAccessories(){
    navigateToMotorsButton();
    WebDriverWait wait = new WebDriverWait(driver,10);
    wait.until(ExpectedConditions.elementToBeClickable(partsAndAccessoriesButton));
    try {
        clickOnElement(partsAndAccessoriesButton);
        System.out.println("lighter");
    } catch (Exception e) {
        System.out.println("lighter-try again");
        clickJScript(partsAndAccessoriesButton);
    }
    }
    //11
    public void clickCarAndTruck(){
        navigateToMotorsButton();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(carAndTruckButton));
        try {
            clickOnElement(carAndTruckButton);
            System.out.println("BlueTooth Headset");
        } catch (Exception e) {
            System.out.println("BlueTooth Headset-try again");
            clickJScript(carAndTruckButton);
        }
    }
    //12
    public void clickWheelMenu(){
        navigateToMotorsButton();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(wheelMenuButton));
        try {
            clickOnElement(wheelMenuButton);
            System.out.println("pulse oximeter");
        } catch (Exception e) {
            System.out.println("pulse oximeter -try again");
            clickJScript(wheelMenuButton);
        }
    }
//13
    public void clickMotorCycleMenu(){
    navigateToMotorsButton();
    WebDriverWait wait = new WebDriverWait(driver,10);
    wait.until(ExpectedConditions.elementToBeClickable(oilDiffuserMenu));
    try {
        clickOnElement(oilDiffuserMenu);
        System.out.println("oil diffuser");
    } catch (Exception e) {
        System.out.println("oil diffuser -try again");
        clickJScript(oilDiffuserMenu);
    }
    }
    //14
    public boolean isHomePageLogoDisplayed(){
       navigateToMotorsButton();
        waitUntilVisible(By.xpath(WebElementLoGoButton));
        boolean isElementDisplayed= logoButton.isDisplayed();
        return isElementDisplayed;
    }
    //15
    public void validatePowerSports() {
        navigateToMotorsButton();
        powerSports.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<WebElement> list = powerSports.findElements(By.xpath(webElementPowerSports));
        int powerSports= list.size();
        System.out.println("Link Number " +powerSports);
        Assert.assertEquals(powerSports, 1, "Number doesnot found");
    }
    //16
    public void validateBatteryCharger() {
        navigateToMotorsButton();
        batteryCharger.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<WebElement> list = batteryCharger.findElements(By.xpath(webElementBatteryCharger));
        int batteryCharger= list.size();
        System.out.println("Link Number " + batteryCharger);
        Assert.assertEquals(batteryCharger, 1, "Number doesnot found");
    }
    //17
    public void validateAntiqueBoats() {
        navigateToMotorsButton();
        antiqueBoats.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<WebElement> list = antiqueBoats.findElements(By.xpath(webElementAntiqueBoats));
        int antiqueBoats= list.size();
        System.out.println("Link Number " + antiqueBoats);
        Assert.assertEquals(antiqueBoats, 1, "Number doesnot found");
    }
    //18
    public void validateExoticsMenu() {
        navigateToMotorsButton();
        exoticsMenu.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<WebElement> list = exoticsMenu.findElements(By.xpath(webElementExoticsMenu));
        int exoticsMenu= list.size();
        System.out.println("Link Number " + exoticsMenu);
        Assert.assertEquals(exoticsMenu, 1, "Number doesnot found");
    }
    //19
    public void clickEBayButton(){
        navigateToMotorsButton();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(eBayButtonMenu));
        try {
            clickOnElement(eBayButtonMenu);
            System.out.println("Antique Car");
        } catch (Exception e) {
            System.out.println("Antique Car -try again");
            clickJScript(eBayButtonMenu);
        }
    }
//20
    public void clickCollectorCar(){
    navigateToMotorsButton();
    WebDriverWait wait = new WebDriverWait(driver,10);
    wait.until(ExpectedConditions.elementToBeClickable(collectorCarMenu));
    try {
        clickOnElement(collectorCarMenu);
        System.out.println("Popular Models");
    } catch (Exception e) {
        System.out.println("Popular Models -try again");
        clickJScript(collectorCarMenu);
    }
    }



}
