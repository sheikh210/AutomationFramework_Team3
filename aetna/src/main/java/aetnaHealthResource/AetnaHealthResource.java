package aetnaHealthResource;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.server.HttpChannelState;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static aetnaHealthResource.AetnaHealthResourceElements.*;


public class AetnaHealthResource extends WebAPI {
    //1
    @FindBy(how = How.XPATH, using = webElementCareerButton)
    public WebElement careerButton;
    //2
    //3
    //4
    //5
    @FindBy(how = How.XPATH, using = webElementMemberSupport)
    public WebElement memberSupportMenu;
    @FindBy(how = How.XPATH, using = webElementAccountManagementMenu)
    public WebElement accountManagementMenu;
    //6
    @FindBy(how = How.XPATH, using = webElementSupportMenu)
    public WebElement supportMenu;
    @FindBy(how = How.XPATH, using = webElementInsuranceRightButton)
    public WebElement insuranceRightButton;
    //7
    @FindBy(how = How.XPATH, using = webElementSearchDropDownExploreAetnaSite)
    public WebElement dropDownExplore;
    @FindBy(how = How.XPATH, using = webElementAetnaDotCom)
    public WebElement aetnaDotCom;
    //8
    @FindBy(how = How.XPATH, using = webElementExploreButton)
    public WebElement exploreButton;
    @FindBy(how = How.XPATH, using =  webElementProvidersMenu)
    public WebElement providersMenu;
    //9
    @FindBy(how = How.XPATH, using = webElementMemberSupportTwo)
    public WebElement memberSupport;
    @FindBy(how = How.XPATH, using = webElementsManagingHealth)
    public WebElement managingHealth;
    //10
    //11
    //12
    //13
    //14
    @FindBy(how =How.XPATH, using = webElementMyAetnaMenuNumber)
    public WebElement myAetnaMenuNumber;

    //15
    @FindBy(how = How.XPATH,using = webElementClinicalCareerMenu)
    public WebElement clinicalCareerMenu;
    @FindBy(how = How.XPATH,using = webElementNursing)
    public WebElement nursingMenu;


    //16
    //17
    //18
    //19
    //20



    //1
    public void navigateToCareerPage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(careerButton));
        careerButton.click();
    }
    //2
    public String validateHealthResourcePageUrl() {
        navigateToCareerPage();
        String healthResourcePageUrl = super.getCurrentPageUrl();
        driver.navigate().refresh();
        System.out.println("Health Resource Page Url: " + healthResourcePageUrl);
        return healthResourcePageUrl;
    }
    //3
    public String validateHealthResourcePageTitle() {
        navigateToCareerPage();
        String healthResourcePageTitle = super.getCurrentPageTitle();
        driver.navigate().refresh();
        System.out.println("Health Resource Page Title: " + healthResourcePageTitle);
        return healthResourcePageTitle;
    }
    //4
    public void validateHealthResourceLinkNumber() {
        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println(list.size());
        int linkNumber = list.size();
        Assert.assertEquals(linkNumber, "199", "expected link number not found");
    }
    //5
    public void findOutPageUrlTwo() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(careerButton));
        careerButton.click();
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(accountManagementMenu).build().perform();
        accountManagementMenu.click();
        Thread.sleep(1000);
    }
    public void validatePageUrlTwo() {
        String currentPageUrlTwo = super.getCurrentPageUrl();
        Assert.assertEquals(currentPageUrlTwo, "https://www.aetna.com/");
    }
    //6
    public void PageUrlThree() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(careerButton));
        careerButton.click();
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(insuranceRightButton).build().perform();
        insuranceRightButton.click();
        Thread.sleep(1000);
    }
    public void validatePageUrlThree() {
        String currentPageUrlThree = super.getCurrentPageUrl();
        Assert.assertEquals(currentPageUrlThree, "https://www.aetna.com/");
    }
    //7
    public void doSearchDropDownExploreAetnaSite() {
        dropDownExplore.click();
    }
    public void validateDoAetnaDotCom(){
        String actualText = aetnaDotCom.getText();
        Assert.assertEquals(actualText,"Aetna.com");
    }
    //8
    public void doSearchExploreButton() {
        exploreButton.click();
    }
    public void validateDoProvidersMenu() {
        String actualText = providersMenu.getText();
        Assert.assertEquals(actualText,"Aetna.com");
    }
    //9
    public void doSearchElementMemberSupportTwo() {
        memberSupport.click();
    }
    public void validateDoElementsManagingHealth() {
        String actualText = managingHealth.getText();
        Assert.assertEquals(actualText, "");
    }
    //10
    public void validateDoMoveBackward(){
        navigateToCareerPage();
        driver.navigate().back();
        String actualUrl = super.getCurrentPageUrl();
        System.out.println(actualUrl);
        String expectedUrl = "https://www.aetna.com/";
        Assert.assertEquals(actualUrl,expectedUrl);
    }
    //11
    public void validateReturnToAetnaHealthResource(){
        navigateToCareerPage();
        driver.navigate().back();
        System.out.println(super.getCurrentPageUrl());
        driver.navigate().forward();
        driver.navigate().refresh();
        String actualUrl = super.getCurrentPageUrl();
        String aetnaHealthResourceUrl = "https://www.aetnacareers.com/";
        Assert.assertEquals(actualUrl,aetnaHealthResourceUrl);
    }
    //12
    public void validateHealthResourceIdNumber() {
        List<WebElement> list = driver.findElements(By.tagName("id"));
        System.out.println(list.size());
        int linkNumber = list.size();
        Assert.assertEquals(linkNumber, "123", "expected id number not found");
    }
    //13
    public String validateNavigateToAetnaHealthResourceOwner(){
        navigateToCareerPage();
        String url = driver.getCurrentUrl();
        System.out.println("Page URL - "+url);
        return url;
    }
    //14
   public String validateLink(String a){
        navigateToCareerPage();
        String actualLink = validateLink("a");
       System.out.println(actualLink);
       Assert.assertEquals(actualLink,null);
       return actualLink;
   }
    //15
    public boolean validateNursingIsDisplayed(){
        navigateToCareerPage();
        Actions actions = new Actions(driver);
        actions.moveToElement(clinicalCareerMenu).build().perform();
        clinicalCareerMenu.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        boolean elementDisplayed = nursingMenu.isDisplayed();
        System.out.println("nursing menu is displayed:"+elementDisplayed);
        return true;
    }


    }
