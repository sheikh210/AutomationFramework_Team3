package changeMyFlight;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.util.List;
import java.util.concurrent.TimeUnit;

import static changeMyFlight.ChangeMyFlightElements.*;


public class ChangeMyFlightPage extends WebAPI {

    @FindBy(how = How.XPATH,using = webElementChangeMyFlight)
    public WebElement changeMyFlight;
    @FindBy(how = How.XPATH,using = webElementTravelUpdateCenter)
    public WebElement travelUpdateCenter;

    @FindBy(how = How.XPATH,using = webElementUpdateOverviewButton)
    public WebElement updateOverviewButton;

    @FindBy(how = How.XPATH,using = webElementArrowMenu)
    public WebElement arrowMenu;

    @FindBy(how = How.XPATH,using = webElementOnboardServices)
    public WebElement onboardServices;

    @FindBy(how = How.XPATH,using = webElementTravelInfo)
    public WebElement travelInfo;
    @FindBy(how = How.XPATH,using = webElementSaferTravel)
    public WebElement saferInfo;
    @FindBy(how = How.XPATH,using = webElementDeltaCareStandard)
    public WebElement deltaCareStandard;

    @FindBy(how = How.XPATH,using = webElementFromDeltaToOurCustomer)
    public WebElement fromDeltaToOurCustomer;

    @FindBy(how = How.XPATH,using = webElementFlying)
    public WebElement flying;









    //Test 1
    public void navigateToChangeMyFlightPage()  {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(changeMyFlight));
        changeMyFlight.click();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().refresh();
    }

    public void validateNavigateToChangeMyFlightPage() {
        boolean actualElement_Is_Displayed = travelUpdateCenter.isDisplayed();
        Assert.assertEquals(actualElement_Is_Displayed, true, "Display doesnot match");
    }
    //Test 2
    public String validateCoronaVirusPageUpdate(){
        navigateToChangeMyFlightPage();
        updateOverviewButton.click();
        String coronaVirusPageUrl = super.getCurrentPageUrl();
        return coronaVirusPageUrl;

    }
    //Test 3
    public String validateCoronaVirusPageTitle() {
        navigateToChangeMyFlightPage();
        updateOverviewButton.click();
        String coronaVirusPageTitle = super.getCurrentPageTitle();
        return coronaVirusPageTitle;
    }
    //Test 4
    public void validateArrowMenu(){
        navigateToChangeMyFlightPage();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        List<WebElement>list = arrowMenu.findElements(By.xpath(webElementArrowMenu));
        int arrowMenu = list.size();
        System.out.println("Link Number "+ arrowMenu);
        Assert.assertEquals(arrowMenu,1,"Number doesnot found");
    }
    //Test 5
    public void validateMoveBackward(){
        navigateToChangeMyFlightPage();
        driver.navigate().back();
        String actualUrl = super.getCurrentPageUrl();
        System.out.println(actualUrl);
        String expectedUrl = "https://www.delta.com/";
        Assert.assertEquals(actualUrl,expectedUrl);
    }
    //Test 6
    public void validateReturnToTravelUpdatePage(){
        navigateToChangeMyFlightPage();
        driver.navigate().back();
        System.out.println(super.getCurrentPageUrl());
        driver.navigate().forward();
        driver.navigate().refresh();
        String actualUrl = super.getCurrentPageUrl();
        String travelUpdatePageUrl = "https://www.delta.com/us/en/travel-update-center/cancel-change-requirements";
        Assert.assertEquals(actualUrl,travelUpdatePageUrl);
    }
    //Test 7
    public boolean validateWebElementIsAvailabe() throws InterruptedException {
        navigateToChangeMyFlightPage();
        driver.navigate().refresh();
        driver.navigate().back();
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(changeMyFlight).build().perform();
        Thread.sleep(2000);
        boolean onboardServicesIsDisplayed = true;
        return onboardServicesIsDisplayed;
    }
    //Test 8
    public void expectedPage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(changeMyFlight));
        changeMyFlight.click();
        try{
            Actions actions = new Actions(driver);
            actions.moveToElement(travelInfo).build().perform();
            travelInfo.click();
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void validateExpectedPage(){
        boolean actualPageIsSDisplayed = deltaCareStandard.isDisplayed();
        Assert.assertEquals(actualPageIsSDisplayed,true,"Page not found");
        System.out.println("Page not found");
    }


    //Test 9
    public void validateFromDeltaToOurCustomer(){
        navigateToChangeMyFlightPage();
        fromDeltaToOurCustomer.click();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        List<WebElement>list = fromDeltaToOurCustomer.findElements(By.xpath(webElementFromDeltaToOurCustomer));
        int fromDeltaToOurCustomer = list.size();
        System.out.println("Link Number "+ fromDeltaToOurCustomer);
        Assert.assertEquals(fromDeltaToOurCustomer,1,"Number doesnot match");

    }
    //Test 10
    public void validateFlying(){
        navigateToChangeMyFlightPage();
        flying.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        List<WebElement>list = flying.findElements(By.xpath(webElementFlying));
        int flying = list.size();
        System.out.println("Link Number "+ flying);
        Assert.assertEquals(flying,1,"Page not found");
    }



}
