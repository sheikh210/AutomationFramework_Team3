package businessandinstitutions;

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

import static businessandinstitutions.BusinessAndInstitutionsElements.*;

public class BusinessAndInstitutionsPage extends WebAPI {

    @FindBy(how = How.XPATH, using = webElementBusinessAndInstitutionsButton)
    public WebElement businessAndInstitutions;
    @FindBy(how = How.XPATH, using = webElementLearnMoreButton)
    public WebElement learnMoreButton;

    @FindBy(how = How.XPATH, using = webElementHamburgerMenu)
    public WebElement hamburgerMenu;

    @FindBy(how = How.XPATH, using = webElementFraudAndCyberSecurity)
    public WebElement fraudAndCyberSecurity;
    @FindBy(how = How.XPATH, using = webElementBusinessEmailCompromise)
    public WebElement businessEmailCompromise;

    @FindBy(how = How.XPATH, using = webElementFeaturedContentMenu)
    public WebElement featuredContentMenu;
    @FindBy(how = How.XPATH, using = webElementMustReadResearch)
    public WebElement mustReadResearch;

    @FindBy(how = How.XPATH, using = webElementTranscationServices)
    public WebElement transactionServices;
    @FindBy(how = How.XPATH, using = webElementGlobalTransactionServices)
    public WebElement globalTransactionServices;

    @FindBy(how = How.XPATH,using = webElementAccessingResearchInsights)
    public WebElement accessingResearchInsights;
    @FindBy(how = How.XPATH,using = webElementGlobalResearchAndMarketInsights)
    public WebElement globalResearchAndMarketInsights;

    @FindBy(how = How.XPATH,using = webelementBusinessBankingSolutions)
    public WebElement businessBankingSolutions;
    @FindBy(how = How.XPATH,using = webElementHelpingYouAndYourBusinessManageThroughChange)
    public WebElement helpingYouAndYourBusinessManageThroughChange;

    @FindBy(how = How.XPATH,using = webElementFundingGrowth)
    public WebElement fundingGrowth;
    @FindBy(how = How.XPATH,using = webElementFuelingYourOperationsWithCostEfficientCapital)
    public WebElement fuelingYourOperationsWithCostEfficientCapital;

    @FindBy(how = How.XPATH,using = webElementGrowingGlobally)
    public WebElement growingGlobally;
    @FindBy(how = How.XPATH,using = webElementGrowingAndManagingGlobalEmergingMarkets)
    public WebElement growingAndManagingGlobalEmergingMarkets;

    @FindBy(how = How.XPATH,using = webElementFraudAndCybersecurity)
    public WebElement fraudAndCybersecurity;
    @FindBy(how = How.XPATH,using = webElementDigitalSecurityForAConnectedWorld)
    public WebElement digitalSecurityForAConnectedWorld;

    @FindBy(how = How.XPATH,using = webElementAttractingAndRetainingTalent)
    public WebElement attractingAndRetainingTalent;
    @FindBy(how = How.XPATH,using = webElementAttractingAndRetainingValuableTalent)
    public WebElement attractingAndRetainingValuableTalent;

    @FindBy(how = How.XPATH,using = webElementOptimizingTradingPerformance)
    public WebElement optimizingTradingPerformance;
    @FindBy(how = How.XPATH,using = webElementOptimizingYourTradingPerformanceStrategy)
    public WebElement optimizingTradingPerformanceStrategy;

    @FindBy(how = How.XPATH,using = webElementOurBusiness)
    public WebElement ourBusiness;
    @FindBy(how = How.XPATH,using = webElementGlobalMarkets)
    public WebElement globalMarkets;

    @FindBy(how = How.XPATH,using = webElementOurRegions)
    public WebElement ourRegions;
    @FindBy(how = How.XPATH,using = webElementAsiaPacific)
    public WebElement asiaPacific;



    //Test Case 1
    public void navigateToBusinessAndInstitutionsPage() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(businessAndInstitutions));
        businessAndInstitutions.click();
    }

    public void validateNavigateToBusinessAndInstitutionsPage() {
        boolean actualText_Is_Available = businessAndInstitutions.isDisplayed();
        boolean expectedText_Is_Available = true;
        Assert.assertEquals(actualText_Is_Available, expectedText_Is_Available, "Display not found");
    }

    //Test Case 2
    public void clickHamburgerMenu() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(hamburgerMenu));
        hamburgerMenu.click();

    }

    public String validateBusinessAndInstitutionsUrl() {
        navigateToBusinessAndInstitutionsPage();
        String businessAndInstitutionsPageUrl = super.getCurrentPageUrl();
        driver.navigate().refresh();
        System.out.println("BusinessAndInstitutions");
        return businessAndInstitutionsPageUrl;
    }

    //Test 3
    public String validateBusinessAndInstitutionsPageTitle() {
        navigateToBusinessAndInstitutionsPage();
        String businessAndInstitutionsPageTitle = super.getCurrentPageTitle();
        driver.navigate().refresh();
        System.out.println("Business and Instutions Page Title: " + businessAndInstitutionsPageTitle);
        return businessAndInstitutionsPageTitle;

    }

    //Test 4
    public void validateBusinessAndInstitutionsLinkNumber() {
        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println(list.size());
        int linkNumber = list.size();
        Assert.assertEquals(linkNumber, "208");
    }

    //Test 5
    public void FraudAndCyberSecurity() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(businessAndInstitutions));
        businessAndInstitutions.click();
        Thread.sleep(2000);
        fraudAndCyberSecurity.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(businessEmailCompromise).build().perform();
        businessEmailCompromise.click();
        Thread.sleep(2000);
    }

    public void validatePageUrl2() {
        String currentPageUrl2 = super.getCurrentPageUrl();
        Assert.assertEquals(currentPageUrl2, "https://www.bankofamerica.com/");
    }
    //Test 6
    public void FundingGrowth() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(businessAndInstitutions));
        businessAndInstitutions.click();
        Thread.sleep(3000);
        fundingGrowth.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(fuelingYourOperationsWithCostEfficientCapital).build().perform();
        fuelingYourOperationsWithCostEfficientCapital.click();
        Thread.sleep(3000);

    }
    public void validatePageUrl3(){
        String currentPageUrl3 = super.getCurrentPageUrl();
        Assert.assertEquals(currentPageUrl3,"https://www.bankofamerica.com/");
    }
    //Test 7
    public void GrowingGlobally() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(growingGlobally));
        growingGlobally.click();
        Thread.sleep(1000);
        growingAndManagingGlobalEmergingMarkets.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(growingAndManagingGlobalEmergingMarkets).build().perform();
        Thread.sleep(1000);
    }
    public void validatePageUrl1(){
        String currentPageUrl1 = super.getCurrentPageUrl();
        Assert.assertEquals(currentPageUrl1,"https://www.bankofamerica.com/");
    }
    //Test 8
    public void FraudAndCybersecurity() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(fraudAndCyberSecurity));
        fraudAndCyberSecurity.click();
        Thread.sleep(1000);
        digitalSecurityForAConnectedWorld.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(digitalSecurityForAConnectedWorld).build().perform();
        Thread.sleep(1000);
    }
    public void validatePageUrl4(){
        String currentPageUrl1 = super.getCurrentPageUrl();
        Assert.assertEquals(currentPageUrl1,"https://www.bankofamerica.com/");
    }
    //Test 9
    public void AttractingAndRetainingTalent() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(attractingAndRetainingTalent));
        attractingAndRetainingTalent.click();
        Thread.sleep(1000);
        attractingAndRetainingValuableTalent.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(attractingAndRetainingValuableTalent).build().perform();
        Thread.sleep(1000);
    }
    public void validatePageUrl5(){
        String currentPageUrl1 = super.getCurrentPageUrl();
        Assert.assertEquals(currentPageUrl1,"https://www.bankofamerica.com/");
    }
    //Test 10
    public void OptimizingTradingPerformance() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(optimizingTradingPerformance));
        optimizingTradingPerformance.click();
        Thread.sleep(1000);
        optimizingTradingPerformanceStrategy.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(optimizingTradingPerformanceStrategy).build().perform();
        Thread.sleep(1000);
    }
    public void validatePageUrl6(){
        String currentPageUrl1 = super.getCurrentPageUrl();
        Assert.assertEquals(currentPageUrl1,"https://www.bankofamerica.com/");
    }
    //Test 11
    public void OurBusiness() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(ourBusiness));
        ourBusiness.click();
        Thread.sleep(1000);
        globalMarkets.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(globalMarkets).build().perform();
        Thread.sleep(1000);
    }
    public void validatePageUrl7(){
        String currentPageUrl1 = super.getCurrentPageUrl();
        Assert.assertEquals(currentPageUrl1,"https://www.bankofamerica.com/");
    }
    //Test 12
    public void OurRegions() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(ourRegions));
        ourRegions.click();
        Thread.sleep(1000);
        asiaPacific.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(asiaPacific).build().perform();
        Thread.sleep(1000);
    }
    public void validatePageUrl8(){
        String currentPageUrl1 = super.getCurrentPageUrl();
        Assert.assertEquals(currentPageUrl1,"https://www.bankofamerica.com/");
    }


    //Test 13
    public void clickAccessingResearchInsights(){
        navigateToBusinessAndInstitutionsPage();
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(globalResearchAndMarketInsights));
        try{
            clickOnElement(globalResearchAndMarketInsights);
            System.out.println("Bofa Merkury");
        } catch (Exception e){
            System.out.println("Bofa Merkury does not match");
            clickJScript(globalResearchAndMarketInsights);
        }
    }
    //Test 14
    public void clickBusinessBankingSolutions(){
        navigateToBusinessAndInstitutionsPage();
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(helpingYouAndYourBusinessManageThroughChange));
    try{
        clickOnElement(helpingYouAndYourBusinessManageThroughChange);
        System.out.println("latest Insights");
    } catch (Exception e){
        System.out.println("latest Insights does not match");
        clickJScript(helpingYouAndYourBusinessManageThroughChange);
    }
    }

    //Test 15
    public void clickFeaturedContentMenu() {
        navigateToBusinessAndInstitutionsPage();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(mustReadResearch));
        try {
            clickOnElement(mustReadResearch);
            System.out.println("Bofa Securities");

        } catch (Exception e) {
            System.out.println("Bofa securities-Try Again");
            clickJScript(mustReadResearch);
        }
    }
    //Test 16
    public void clickFundingGrowth() {
        navigateToBusinessAndInstitutionsPage();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(fuelingYourOperationsWithCostEfficientCapital));
        try {
            clickOnElement(fuelingYourOperationsWithCostEfficientCapital);
            System.out.println("Strategies and idea");

        } catch (Exception e) {
            System.out.println("Strategies and idea-Try Again");
            clickJScript(fuelingYourOperationsWithCostEfficientCapital);
        }
    }
    //Test 17
    public void clickGrowingGlobally() {
        navigateToBusinessAndInstitutionsPage();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(growingAndManagingGlobalEmergingMarkets));
        try {
            clickOnElement(growingAndManagingGlobalEmergingMarkets);
            System.out.println("latest insights");

        } catch (Exception e) {
            System.out.println("Latest insights-Try Again");
            clickJScript(growingAndManagingGlobalEmergingMarkets);
        }
    }
    //Test 18
    public void clickFraudAndCybersecurity() {
        navigateToBusinessAndInstitutionsPage();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(digitalSecurityForAConnectedWorld));
        try {
            clickOnElement(digitalSecurityForAConnectedWorld);
            System.out.println("latest insights");

        } catch (Exception e) {
            System.out.println("Latest insights-Try Again");
            clickJScript(digitalSecurityForAConnectedWorld);
        }
    }
    //Test 19
    public void clickOurBusiness() {
        navigateToBusinessAndInstitutionsPage();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(globalMarkets));
        try {
            clickOnElement(globalMarkets);
            System.out.println("latest insights");

        } catch (Exception e) {
            System.out.println("Latest insights-Try Again");
            clickJScript(globalMarkets);
        }
    }

    //Test 20

        public void clickTransactionServices () {
            navigateToBusinessAndInstitutionsPage();
            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(globalTransactionServices));
            try {
                clickOnElement(globalTransactionServices);
                System.out.println("Global Banking & Markets");
            } catch (Exception e) {
                System.out.println("Global Banking & markets -try again");
                clickJScript(globalTransactionServices);
            }
        }

    }















