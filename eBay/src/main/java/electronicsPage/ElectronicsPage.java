package electronicsPage;

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

import static electronicsPage.ElectronicsPageElements.*;

public class ElectronicsPage extends WebAPI {

    @FindBy(how = How.XPATH, using = webElementElectronicsButton)
    public WebElement electronicsButton;
    @FindBy(how = How.XPATH, using = webElementShopByCategoryMenu)
    public WebElement shopByCategoryMenu;
    @FindBy(how = How.XPATH, using = webElementMyEbayMenu)
    public WebElement myEbayMenu;
    @FindBy(how = How.XPATH, using = webElementWatchList)
    public WebElement watchList;
    @FindBy(how = How.XPATH, using = webElementFashionMenu)
    public WebElement fashionMenu;
    @FindBy(how = How.XPATH, using = webElementSearchButton)
    public WebElement searchingButton;
    @FindBy(how = How.XPATH, using = webElementSearchingProductMenu)
    public WebElement searchingProductMenu;
    @FindBy(how = How.XPATH, using = webElementSearchingProductButton)
    public WebElement searchingProductButton;
    @FindBy(how = How.XPATH, using = webElementSearchingElement)
    public WebElement searchingElement;
    @FindBy(how = How.XPATH, using = webElementMessageMenu)
    public WebElement messageMenu;
    @FindBy(how = How.XPATH, using = webElementPageElement)
    public WebElement pageElement;
    @FindBy(how = How.XPATH,using = webElementArrowButton)
    public WebElement arrowButton;
    @FindBy(how = How.XPATH,using = webElementCamerasAndPhotosMenu)
    public WebElement camerasAndPhotosMenu;
    @FindBy(how = How.XPATH,using = webElementArrowLinks)
    public WebElement arrowLinks;
    @FindBy(how = How.XPATH,using = webElementCameraDrone)
    public WebElement cameraDrone;

    /**
     * Test case:1
     * Navigate to Ebay Homepage
     * Click on Electronics Button to open Electronics page
     * Validate the page is displayed or not
     */

    public void navigateToElectronicsPage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(electronicsButton));
        electronicsButton.click();


    }

    public void validateNavigateToElectronicsPage() {

        boolean actualElement_Is_Displayed = shopByCategoryMenu.isDisplayed();

        Assert.assertEquals(actualElement_Is_Displayed, true, "Expected Element not exist");

    }

    /**
     * Test Case:2
     * Navigate to Ebay Homepage
     * Click on Electronics Button to open Electronics page
     * Mouse hover on 'My Ebay Menu'
     * Click on 'Watch List'
     * Validate new page title
     */

    public void doMouseHover() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(electronicsButton));
        electronicsButton.click();

        try {
            Actions action = new Actions(driver);
            action.moveToElement(myEbayMenu).build().perform();
            Thread.sleep(2000);
            watchList.click();
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Web Element haven't download properly, need to increase sleep time");
        }
    }

    public void validateMouseHover() {

        String actualPageTitle = driver.getTitle();
        String expectedPageTitle = "Security Measure";
        Assert.assertEquals(actualPageTitle, expectedPageTitle, "Expected page not found");
    }
    /**
     * Test Case:3
     * Navigate to Ebay Homepage
     * Click on Electronics Button to open Electronics page
     * Click on 'Shop Category' menu
     * Click on 'Fashion' menu
     * Validate new page Url
     */

    public void doHandleDropDown() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(electronicsButton));
        electronicsButton.click();
        Thread.sleep(2000);
        shopByCategoryMenu.click();
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(fashionMenu).build().perform();
        fashionMenu.click();
        Thread.sleep(2000);

    }

    public void validateHandleDropDown() {

        String currentPageUrl = super.getCurrentPageUrl();

        Assert.assertEquals(currentPageUrl, "https://www.ebay.com/b/Fashion/bn_7000259856");
    }

    /**
     * Test Case:4
     * Navigate to Ebay Homepage
     * Click on Electronics Button to open Electronics page
     * Click on 'Searching Button' menu
     * Click on 'Searching Product' menu
     * Click on 'Searching Product Button' menu
     * Validate the product is there
     */

    public void doSearchProduct() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(electronicsButton));
        electronicsButton.click();
        Thread.sleep(2000);
        try {
            Actions actions = new Actions(driver);
            actions.moveToElement(searchingButton).build().perform();
            searchingButton.click();
            Thread.sleep(2000);
            System.out.println(searchingButton.getSize());
            System.out.println(searchingButton.getText());
            searchingProductMenu.click();
            Thread.sleep(2000);
            searchingProductButton.click();
            Thread.sleep(2000);

        } catch (Exception e) {
            System.out.println("Waiting time not enough");
        }
    }

    public void validateSearchProduct() {
        String webElement = searchingElement.getText();
        Assert.assertEquals(webElement, "Business & Industrial");

    }
    /**
     * Test Case:5
     * Navigate to Ebay Homepage
     * Click on Electronics Button to open Electronics page
     * Click on 'My Ebay' menu
     * Click on 'Message' menu
     * Validate the new page
     */

    public void doFigureOutExpectedPage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(electronicsButton));
        electronicsButton.click();

        try {
            Actions action = new Actions(driver);
            action.moveToElement(myEbayMenu).build().perform();
            Thread.sleep(2000);

            messageMenu.click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void validateFigureOutExpectedPage(){

        boolean actualPageIsDisplayed=pageElement.isDisplayed();
        Assert.assertEquals(actualPageIsDisplayed,true,"Expected page does not exist");
        System.out.println("If you search the page more than 3 times, it would show Test is fail."+ '\n' +" Because of security purpose, it would navigate to different page");
    }

    /**
     * Test Case:6
     * Navigate to Ebay Homepage
     * Click on Electronics Button to open Electronics page
     * Click on 'Arrow Button'
     * Validate link number
     */

    public void doCheckArrowButtonLinks(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(electronicsButton));
        electronicsButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    public void validateArrowButtonLinks(){
        arrowButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> list=arrowLinks.findElements(By.xpath(webElementArrowButton));
        int arrowButtonLinksNum=list.size();
        System.out.println("Number of Links: "+arrowButtonLinksNum);

        Assert.assertEquals(arrowButtonLinksNum,1,"Web links number not found");

    }
    /**
     * Test Case:7
     * Navigate to Ebay Homepage
     * Click on Electronics Button to open Electronics page
     * Click on 'Arrow Button'
     * Click on 'cameras & Photos' Menu
     * Validate Camera Drone is Available=True
     */

    public void checkProductAvailablity() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(electronicsButton));
        electronicsButton.click();
        arrowButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        camerasAndPhotosMenu.click();
        Thread.sleep(2000);

    }
    public void validateProductAvailablity(){
        boolean productImageIsDisplayed=cameraDrone.isDisplayed();
        boolean productHaveToDisplayed=true;
        Assert.assertEquals(productImageIsDisplayed,productHaveToDisplayed);

    }


}

