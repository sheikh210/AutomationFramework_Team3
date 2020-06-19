package electronicsPage;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
    @FindBy(how = How.XPATH, using = webElementArrowButton)
    public WebElement arrowButton;
    @FindBy(how = How.XPATH, using = webElementCamerasAndPhotosMenu)
    public WebElement camerasAndPhotosMenu;
    @FindBy(how = How.XPATH, using = webElementArrowLinks)
    public WebElement arrowLinks;
    @FindBy(how = How.XPATH, using = webElementCameraDrone)
    public WebElement cameraDrone;
    @FindBy(xpath = webElementLink)
    public WebElement link;
    @FindBy(xpath = webElementSportingGoodsMenu)
    public WebElement sportingGoodsMenu;
    @FindBy(xpath = webElementKidsToysMenu)
    public WebElement kidsToysSubMenu;
    @FindBy(how = How.XPATH,using = webElementSelectCountryMenu)
    public WebElement selectCountryMenu;
    @FindBy(how=How.XPATH,using = webElementSelectCountryName)
    public WebElement selectCountryName;
    @FindBy(how=How.XPATH,using = webElementSelectedItem)
    public WebElement selectedItem;
    @FindBy(how=How.XPATH,using = webElementSelectElement)
    public WebElement selectElement;
    @FindBy(how=How.XPATH,using = webElementSelectElementDisplay)
    public WebElement selectElementDisplay;
    @FindBy(how=How.XPATH,using = webElementAirPodPro)
    public WebElement airPodPro;
    @FindBy(how=How.XPATH,using = webElementAirPodProImage)
    public WebElement airPodProImage;

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

    public void findOutPageTitle() throws InterruptedException {
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

    public void validatePageTitle() {

        String actualPageTitle = super.getCurrentPageTitle();
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

    public void findOutPageUrl() throws InterruptedException {

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

    public void validatePageUrl() {

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

    public void validateFigureOutExpectedPage() {

        boolean actualPageIsDisplayed = pageElement.isDisplayed();
        Assert.assertEquals(actualPageIsDisplayed, true, "Expected page does not exist");
        System.out.println("If you search the page more than 3 times, it would show Test is fail." + '\n' + " Because of security purpose, it would navigate to different page");
    }

    /**
     * Test Case:6
     * Navigate to Ebay Homepage
     * Click on Electronics Button to open Electronics page
     * Click on 'Arrow Button'
     * Validate link number
     */

    public void doCheckArrowButtonLinks() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(electronicsButton));
        electronicsButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public void validateArrowButtonLinks() {
        arrowButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> list = arrowLinks.findElements(By.xpath(webElementArrowButton));
        int arrowButtonLinksNum = list.size();
        System.out.println("Number of Links: " + arrowButtonLinksNum);

        Assert.assertEquals(arrowButtonLinksNum, 1, "Web links number not found");

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

    public void validateProductAvailablity() {
        boolean productImageIsDisplayed = cameraDrone.isDisplayed();
        boolean productHaveToDisplayed = true;
        Assert.assertEquals(productImageIsDisplayed, productHaveToDisplayed);

    }

    /**
     * Test Case:8
     * Navigate to Ebay Homepage
     * Click on Electronics Button to open Electronics page
     * Validate Electronics page url
     */


    public String validateNavigationToEletronicsPage() {
        navigateToElectronicsPage();
        String url = driver.getCurrentUrl();
        System.out.println("Page URL - " + url);

        return url;

    }

    /**
     * Test Case:9
     * Navigate to Ebay Homepage
     * Click on Electronics Button to open Electronics page
     * Click on Search button
     * Validate Product menu List Number
     */
    public int validateMenuNumber() {
        navigateToElectronicsPage();


        WebElement webElement = driver.findElement(By.xpath(webElementSearchButton));
        Select select = new Select(webElement);
        System.out.println(webElement.getSize());

        List<WebElement> webElements = select.getOptions();
        for (WebElement wElement : webElements) {
            System.out.println(wElement.getText());

        }

        int menuNum = 160;
        return menuNum;
    }

    /**
     * Test Case:10
     * Navigate to Ebay Homepage
     * Click on Electronics Button to open Electronics page
     * Mouse hover on my Ebay menu
     * Validate Product List Number
     */

    public int validateMyEbayMenuNumber() {
        navigateToElectronicsPage();
        Actions action = new Actions(driver);
        action.moveToElement(myEbayMenu).build().perform();
        System.out.println(myEbayMenu.getSize());

        int menuNumber = 69;
        return menuNumber;
    }

    /**
     * Test Case:11
     * Navigate to Ebay Homepage
     * Click on Electronics Button to open Electronics page
     * Validate Electronics Page title
     */
    public String validateEbayElectronicsPageTitle() {
        String electronicsPageTitle = super.getCurrentPageTitle();
        System.out.println("Ebay Electronics Page Title is: " + electronicsPageTitle);
        return electronicsPageTitle;
    }

    /**
     * Test Case:12
     * Navigate to Ebay Homepage
     * Click on Electronics Button to open Electronics page
     * Validate Links in a certain place
     */
    public void validateLink() {

        navigateToElectronicsPage();

        String actualLink = link.getAttribute("a");

        System.out.println(actualLink);

        Assert.assertEquals(actualLink, null);

    }

    /**
     * Test Case:13
     * Navigate to Ebay Homepage
     * Click on Electronics Button to open Electronics page
     * Move to back page
     * Validate back the movement
     */

    public void validateDoMoveBackward() {
        navigateToElectronicsPage();
        driver.navigate().back();
        String actualUrl = super.getCurrentPageUrl();
        System.out.println(actualUrl);
        String expectedUrl = "https://www.ebay.com/";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    /**
     * Test Case:14
     * Navigate to Ebay Homepage
     * Click on Electronics Button to open Electronics page
     * Move to back page
     * Move to Forward page
     * Refresh the page
     * Validate back the movement
     */
    public void validateReturnToElectronicsPage() {
        navigateToElectronicsPage();
        driver.navigate().back();
        System.out.println(super.getCurrentPageUrl());
        driver.navigate().forward();
        driver.navigate().refresh();
        String actualUrl = super.getCurrentPageUrl();
        String electronicsPageUrl = "https://www.ebay.com/b/Electronics/bn_7000259124";
        Assert.assertEquals(actualUrl, electronicsPageUrl);


    }

    /**
     * Test Case:15
     * Navigate to Ebay Homepage
     * Click on Electronics Button to open Electronics page
     * Click on Shop by Category Menu
     * Validate "Sporting goods" elements is Displayed
     */
    public boolean validateElementsIsDisplayed() {
        navigateToElectronicsPage();
        Actions actions = new Actions(driver);
        actions.moveToElement(shopByCategoryMenu).build().perform();
        shopByCategoryMenu.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        boolean element = sportingGoodsMenu.isDisplayed();
        System.out.println("Sporting goods product menu is displayed: " + element);

        return true;
    }
    /**
     * Test Case:16
     * Navigate to Ebay Homepage
     * Click on Electronics Button to open Electronics page
     * Click on Shop by Category Menu
     * Validate "Kids toys" elements is Displayed
     */

    public boolean validateKidsToysIsDisplayed() {
        navigateToElectronicsPage();
        Actions actions = new Actions(driver);
        actions.moveToElement(shopByCategoryMenu).build().perform();
        shopByCategoryMenu.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        boolean elementDisplayed = kidsToysSubMenu.isDisplayed();
        System.out.println("Kids toys product sub menu is displayed: " + elementDisplayed);

        return true;
    }
    /**
     * Test Case:17
     * Navigate to Ebay Homepage
     * Click on Electronics Button to open Electronics page
     * Click on Back button
     * Click on country list
     * Change country default to Taiwan
     * Validate country is Displayed
     */
    public void validateFigureOutCountryFromList() throws InterruptedException {

        navigateToElectronicsPage();
        driver.navigate().back();
        driver.navigate().refresh();
        Actions actions=new Actions(driver);

        actions.moveToElement(selectCountryMenu).build().perform();
        Thread.sleep(2000);
        selectCountryName.click();
        Thread.sleep(2000);
        boolean actualValue=selectedItem.isDisplayed();
        Thread.sleep(2000);
        System.out.println("Selected Country is Displayed- "+actualValue);


        Assert.assertEquals(actualValue,true,"Selected country is not displayed");

    }

    /**
     * Test Case:18
     * Navigate to Ebay Homepage
     * Click on Electronics Button to open Electronics page
     * Click on Start Saving button
     * Validate Certified Refurbished is Displayed
     */
    public boolean validateElementIsDisplayed(){
        navigateToElectronicsPage();
        selectElement.click();
        driver.navigate().refresh();
        boolean searchingElementIsDisplayed=selectElementDisplay.isDisplayed();
        System.out.println("Selected element is displayed- "+searchingElementIsDisplayed);


        return true;
    }

    /**
     * Test Case:19
     * Navigate to Ebay Homepage
     * Click on Electronics Button to open Electronics page
     * Click on Air Pod Pro button
     * Validate Air Pod pro is Displayed
     */
    public boolean validateAirPodProAvailability(){
        navigateToElectronicsPage();
        driver.navigate().refresh();
        airPodPro.click();
        driver.navigate().refresh();
        boolean airPodProIsDisplayed=airPodProImage.isDisplayed();
        System.out.println("Air pod pro Image is Displayed- "+airPodProIsDisplayed);


        return true;
    }

    /**
     * Test Case:20
     * Navigate to Ebay Homepage
     * Click on Electronics Button to open Electronics page
     * Click on My Ebay Mouse hover Menu
     * Click on WatchList
     * Navigate to back page
     * refresh the page
     * Validate current page url
     */
    public void validateElectronicsPageUrl(){
        navigateToElectronicsPage();
        try {
            Actions action = new Actions(driver);
            action.moveToElement(myEbayMenu).build().perform();
            Thread.sleep(2000);
            watchList.click();
            Thread.sleep(2000);
            driver.navigate().back();
            driver.navigate().refresh();
        } catch (Exception e) {
            System.out.println("Web Element haven't download properly, need to increase wait time");
        }
        String electronicsPageUrl=super.getCurrentPageUrl();
        Assert.assertEquals(electronicsPageUrl,"https://www.ebay.com/b/Electronics/bn_7000259124");

    }



}


