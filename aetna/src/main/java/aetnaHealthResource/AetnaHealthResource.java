package aetnaHealthResource;
import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

import static aetnaHealthResource.AetnaHealthResourceElements.*;


public class AetnaHealthResource extends WebAPI{
    //1
    @FindBy(how = How.XPATH,using = webElementCareerButton)
    public WebElement careerButton;

    //5
    @FindBy(how = How.XPATH,using = webElementMemberSupport)
    public WebElement memberSupportMenu;
    @FindBy(how = How.XPATH,using = webElementAccountManagementMenu)
    public WebElement accountManagementMenu;
    //6
    @FindBy(how = How.XPATH,using = webElementSupportMenu)
    public WebElement supportMenu;
    @FindBy(how = How.XPATH,using = webElementInsuranceRightButton)
    public WebElement insuranceRightButton;



    //1
    public void navigateToCareerPage(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(careerButton));
        careerButton.click();
    }
    //2
    public String validateHealthResourcePageUrl(){
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
    public void validateHealthResourceLinkNumber(){
        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println(list.size());
        int linkNumber=list.size();
        Assert.assertEquals(linkNumber,"199","expected link number not found");
    }
    //5
    public void findOutPageUrlTwo() throws Exception{
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(careerButton));
        careerButton.click();
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(accountManagementMenu).build().perform();
        accountManagementMenu.click();
        Thread.sleep(1000);
    }
    public void validatePageUrlTwo(){
        String currentPageUrlTwo = super.getCurrentPageUrl();
        Assert.assertEquals(currentPageUrlTwo,"https://www.aetna.com/");
    }
    //6
    public void PageUrlThree() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(careerButton));
        careerButton.click();
        Thread.sleep(1000);
        Actions actions =new Actions(driver);
        actions.moveToElement(insuranceRightButton).build().perform();
        insuranceRightButton.click();
        Thread.sleep(1000);
    }
    public void validatePageUrlThree(){
        String currentPageUrlThree = super.getCurrentPageUrl();
        Assert.assertEquals(currentPageUrlThree,"https://www.aetna.com/");
    }

//7

    }
