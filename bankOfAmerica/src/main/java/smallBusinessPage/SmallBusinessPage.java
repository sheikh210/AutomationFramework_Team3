
package smallBusinessPage;

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

import java.util.stream.Collectors;
import static smallBusinessPage.SmallBusinessPageElement.*;

public class SmallBusinessPage extends WebAPI {
    @FindBy(how = How.XPATH, using = webElementSmallBusinessButton)
    public WebElement smallBusiness;
    @FindBy(how = How.XPATH, using = webElementOpenAccountButton)
    public WebElement openAccountButton;
    @FindBy(how = How.XPATH, using = webElementCreditCard)
    public WebElement creditCard;
    @FindBy(how = How.XPATH, using = webElementPopularCards)
    public WebElement popularCards;
    @FindBy(how = How.XPATH, using = webElementCheckingAccount)
    public WebElement checkingAccount;
    @FindBy(how = How.XPATH, using = webElementEnrollButton)
    public WebElement enrollButton;
    @FindBy(how = How.XPATH, using = webElementSavingAccount)
    public WebElement savingAccount;
    @FindBy(how = How.XPATH, using = webElementInvestmentAccount)
    public WebElement investmentAccount;
    @FindBy(how = How.XPATH, using = webElementBusinessService)
    public WebElement businessService;
    @FindBy(how = How.XPATH, using = webElementAdvantages)
    public WebElement advantagesButton;

    @FindBy(xpath =WebElementHomePageLogo )
    public WebElement homePageLogo;
    @FindBy(xpath = WebElementHeaderSearchBox)
    public WebElement searchHeaderBox;
    @FindBy(xpath = WebElementInvestingMenu)
    public WebElement searchInvestingMenu;
    @FindBy(xpath = WebElementLending)
    public WebElement searchLanding;
    @FindBy(xpath = WebElementExploreAppButton)
    public WebElement searchExploreApp;


    @FindBy(how = How.XPATH, using = webElementSmallBusinessService2)
    public WebElement businessService2;
    @FindBy(how = How.XPATH, using = webElementTaxService)
    public WebElement taxServiceButton;

    @FindBy(xpath = WebElementSignInMenu )
    public WebElement signInMenu;
    @FindBy(xpath = WebElementForgotPasswordButton)
    public WebElement forgotPasswordButton ;
    @FindBy(xpath = WebElementOnlineBanking)
    public WebElement onlineBenefitMenu;


    //1
    public void navigateToSmallBusinessPage(){
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(smallBusiness));
        smallBusiness.click();
    }
    public void validateNavigateToSmallBusinessPage(){
        boolean actualText_Is_Available = smallBusiness.isDisplayed();
        boolean expectedText_Is_Available = true;
        Assert.assertEquals(actualText_Is_Available, expectedText_Is_Available, "Display not found");
    }
    //2
    public String validateSmallBusinessPageUrl() {
        navigateToSmallBusinessPage();
        String smallBusinessPageUrl = super.getCurrentPageUrl();
        driver.navigate().refresh();
        System.out.println("Small Business: "+smallBusinessPageUrl);
        return smallBusinessPageUrl;
    }
    //3
    public String validateSmallBusinessPageTitle() {
        navigateToSmallBusinessPage();
        String smallBusinessPageTitle = super.getCurrentPageTitle();
        driver.navigate().refresh();
        System.out.println("Small Business: "+smallBusinessPageTitle);
        return smallBusinessPageTitle;
    }
    //4
    public void validateSmallBusinessLinkNumber() {
        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println(list.size());
        int linkNumber = list.size();
        Assert.assertEquals(linkNumber, "208", "Expected Link Number Not Found");

    }
    //5
    public void validateDoMoveBackward() {
        navigateToSmallBusinessPage();
        driver.navigate().back();
        String actualUrl = super.getCurrentPageUrl();
        System.out.println(actualUrl);
        String expectedUrl = "https://www.bankofamerica.com/";
        Assert.assertEquals(actualUrl, expectedUrl);
    }
    //6
    public void validateReturnToSmallBusiness() {
        navigateToSmallBusinessPage();
        driver.navigate().back();
        System.out.println(super.getCurrentPageUrl());
        driver.navigate().forward();
        driver.navigate().refresh();
        String actualUrl = super.getCurrentPageUrl();
        String smallBusinessPageUrl = "https://www.bankofamerica.com/smallbusiness/";
        Assert.assertEquals(actualUrl, smallBusinessPageUrl);
    }
    //7
    public String validateNavigateToSmallBusinessOwnerPage() {
        navigateToSmallBusinessPage();
        String url = driver.getCurrentUrl();
        System.out.println("Page URL - " + url);
        return url;
    }
    //8
    public void CreditCard () throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(smallBusiness));
        smallBusiness.click();
        Thread.sleep(2000);
        creditCard.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(popularCards).build().perform();
        popularCards.click();
        Thread.sleep(2000);
    }
    public void validatePageUrl2() {
        String currentPageUrl2 = super.getCurrentPageUrl();
        Assert.assertEquals(currentPageUrl2, "https://www.bankofamerica.com/");
    }
    //9
    public void CheckingAccount () throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(smallBusiness));
        smallBusiness.click();
        Thread.sleep(3000);
        checkingAccount.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(enrollButton).build().perform();
        enrollButton.click();
        Thread.sleep(3000);
    }
    public void validatePageUrl3(){
        String currentPageUrl3 = super.getCurrentPageUrl();
        Assert.assertEquals(currentPageUrl3,"https://www.bankofamerica.com/");
    }
    //10
    public void SavingAccount () throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(smallBusiness));
        smallBusiness.click();
        Thread.sleep(3000);
        savingAccount.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(investmentAccount).build().perform();
        investmentAccount.click();
        Thread.sleep(3000);
    }
    public void validatePageUrl4(){
        String currentPageUrl4 = super.getCurrentPageUrl();
        Assert.assertEquals(currentPageUrl4,"https://www.bankofamerica.com/");
    }
    //11
    public void BusinessService () throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(smallBusiness));
        smallBusiness.click();
        Thread.sleep(3000);
        businessService.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(advantagesButton).build().perform();
        advantagesButton.click();
        Thread.sleep(3000);
    }
    public void validatePageUrl5(){
        String currentPageUrl5 = super.getCurrentPageUrl();
        Assert.assertEquals(currentPageUrl5,"https://www.bankofamerica.com/");
    }
    //12
    public boolean isHomePageLogoDisplayed(){
        navigateToSmallBusinessPage();
        waitUntilVisible(By.xpath(WebElementHomePageLogo));
        boolean isElementDisplayed=homePageLogo.isDisplayed();
        return isElementDisplayed;
    }
    //13
    public boolean isHomePageHeaderDisplayed(){
        navigateToSmallBusinessPage();
        waitUntilVisible(By.xpath(WebElementHeaderSearchBox));
        boolean isElementDisplayed= searchHeaderBox.isDisplayed();
        return isElementDisplayed;
    }
    //14
    public boolean isHomePageInvestingDisplayed(){
        navigateToSmallBusinessPage();
        waitUntilVisible(By.xpath(WebElementInvestingMenu));
        boolean isElementDisplayed=searchInvestingMenu.isDisplayed();
        return isElementDisplayed;
    }
    //15
    public boolean isHomePageLendingDisplayed(){
        navigateToSmallBusinessPage();
        waitUntilVisible(By.xpath(WebElementLending));
        boolean isElementDisplayed=searchLanding.isDisplayed();
        return isElementDisplayed;
    }
    //16
    public boolean isHomePageExploreAppButtonDisplayed(){
        navigateToSmallBusinessPage();
        waitUntilVisible(By.xpath(WebElementExploreAppButton));
        boolean isElementDisplayed=searchExploreApp.isDisplayed();
        return isElementDisplayed;
    }
    //17
    public void clickBusinessService2() {
        navigateToSmallBusinessPage();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(taxServiceButton));
        try {
            clickOnElement(taxServiceButton);
            System.out.println("Tax Services");

        } catch (Exception e) {
            System.out.println("Tax Services-Try Again");
            clickJScript(taxServiceButton);
        }
    }
    //18
    public boolean isHomePageForgotPasswordButtonDisplayed(){
        navigateToSmallBusinessPage();
        waitUntilVisible(By.xpath(WebElementForgotPasswordButton));
        boolean isElementDisplayed=forgotPasswordButton.isDisplayed();
        return isElementDisplayed;
    }
    //19
    public boolean isHomePageSignInDisplayed(){
        navigateToSmallBusinessPage();
        waitUntilVisible(By.xpath(WebElementSignInMenu));
        boolean isElementDisplayed=signInMenu.isDisplayed();
        return isElementDisplayed;
    }
    //20
    public boolean isHomePageOnlineBankingDisplayed(){
        navigateToSmallBusinessPage();
        waitUntilVisible(By.xpath(WebElementOnlineBanking));
        boolean isElementDisplayed=onlineBenefitMenu.isDisplayed();
        return isElementDisplayed;
    }


}











