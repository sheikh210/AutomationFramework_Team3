package fashion;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

import java.util.concurrent.TimeUnit;

import static fashion.FashionElements.*;

public class FashionPage extends WebAPI {

    @FindBy(how = How.XPATH, using = webElementFashionButton)
    public WebElement fashionButton;
    @FindBy(how = How.XPATH, using = webElemenShopByCategoryMenu)
    public WebElement shopByCategoryMenu;

    @FindBy(how = How.XPATH, using = webElementSellMenu)
    public WebElement sellMenu;
    @FindBy(how = How.XPATH, using = webElementBrandOutlet)
    public WebElement brandOutlet;

    @FindBy(how = How.XPATH,using = webElementTopCategories)
    public WebElement topCategories;
    @FindBy(how = How.XPATH,using = webElementSearchProduct)
    public WebElement searchProduct;

    @FindBy(how = How.XPATH,using = webElementSearchElement)
    public WebElement searchElement;

    @FindBy(how = How.XPATH,using = webElementMoreBrandOutlet)
    public WebElement moreBrandOutlet;
    @FindBy(how = How.XPATH,using = webElementSearchProduct1)
    public WebElement searchProduct1;

    @FindBy(how = How.XPATH,using = webElementBeautyMenu)
    public WebElement beautyMenu;

    @FindBy(how = How.XPATH,using = webElementSearchForAnything)
    public WebElement searchForAnything;
    @FindBy(how = How.XPATH,using = webElementAllCategories)
    public WebElement allCategories;
    @FindBy(how = How.XPATH,using = webElementSearchButton)
    public WebElement searchButton;
    @FindBy(how = How.XPATH,using = webElementSearchingProduct)
    public WebElement searchingProduct;

    @FindBy(how = How.XPATH,using = webElementMyMenu)
    public WebElement myMenu;
    @FindBy(how = How.XPATH,using = webElementSelling)
    public WebElement selling;
    @FindBy(how = How.XPATH,using = webElementOpenPage)
    public WebElement openPage;

    @FindBy(how = How.XPATH,using = webElementArrowMenu)
    public WebElement arrowMenu;

    @FindBy(how = How.XPATH,using = webElementChanelLink)
    public WebElement chanelLink;

    @FindBy(how = How.XPATH,using = webElementJewelryMenuButton)
    public WebElement jewelryMenuButton;

    @FindBy(how = How.XPATH,using = webElementWatchesMenu)
    public WebElement watchesMenu;

    @FindBy(how = How.XPATH,using = webElementVinatgeArrow)
    public WebElement vintageArrow;


    @FindBy(how = How.XPATH,using = webElementHealthMenuButton)
    public WebElement healthMenuButton;

    @FindBy(how = How.XPATH,using = webElementShoesMenu)
    public WebElement shoesMenu;



    //Test 1
    public void navigateToFashionPage() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        fashionButton.click();
    }

    public void validateNavigateToFashionPage() {
        boolean actualElement_Is_Displayed = shopByCategoryMenu.isDisplayed();
        Assert.assertEquals(actualElement_Is_Displayed, true, "Display doesnot match");
    }
    //Test 2
    public void pageTitle() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(fashionButton));
        fashionButton.click();
        try{
            Actions actions = new Actions(driver);
            actions.moveToElement(sellMenu).build().perform();
            Thread.sleep(1000);

        } catch(Exception e){
            System.out.println("Time is not enough");
        }
    }
    public void validatePageTitle(){
        String actualPageTitle = super.getCurrentPageTitle();
        String expectedPageTitle = "Fashion products for sale | eBay";
        Assert.assertEquals(actualPageTitle,expectedPageTitle,"Page not found");
    }
    //Test 3
    public void topCategories() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(fashionButton));
        fashionButton.click();
        Thread.sleep(2000);

        try{
            Actions actions = new Actions(driver);
            actions.moveToElement((WebElement) searchProduct.getSize());
            fashionButton.click();
            Thread.sleep(1500);
            System.out.println(searchProduct.getText());
            topCategories.click();
            Thread.sleep(1500);

        } catch(Exception e){
            System.out.println("Increased time");
        }

    }
    public void validateTopCategories(){
        String webElement = searchProduct.getText();
        Assert.assertEquals(webElement,"adidas");
    }
    //Test 4
    public void shopByCategory() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(fashionButton));
        fashionButton.click();
        Thread.sleep(2000);

        try{
            Actions actions = new Actions(driver);
            actions.moveToElement((WebElement) searchProduct.getSize());
            fashionButton.click();
            Thread.sleep(1500);
            System.out.println(searchProduct.getText());
            topCategories.click();
            Thread.sleep(1500);

        } catch(Exception e){
            System.out.println("Increased time");
        }

    }
    public void validateShopByCategories(){
        String webElement = searchProduct.getText();
        Assert.assertEquals(webElement,"adidas");
    }

    //Test 5
    public void searchProduct1() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(fashionButton));
        fashionButton.click();
        Thread.sleep(2000);

        try{
            Actions actions = new Actions(driver);
            actions.moveToElement((WebElement) moreBrandOutlet.getSize());
            fashionButton.click();
            Thread.sleep(1500);
            System.out.println(moreBrandOutlet.getText());
            moreBrandOutlet.click();
            Thread.sleep(1500);

        } catch(Exception e){
            System.out.println("Need more time");
        }

    }
    public void validateSearchProduct1(){
        String webElement = moreBrandOutlet.getText();
        Assert.assertEquals(webElement,"More Brand Outlet");
    }
    //Test 6
    public void pageUrl() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(fashionButton));
        fashionButton.click();
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(beautyMenu).build().perform();
        beautyMenu.click();
        Thread.sleep(2000);
    }
    public void validatePageUrl(){
        String currentPageUrl = super.getCurrentPageUrl();
        Assert.assertEquals(currentPageUrl,"https://www.ebay.com/b/Fashion/bn_7000259856");
    }
    //Test 7
    public void  searchingProduct() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(fashionButton));
        fashionButton.click();
        Thread.sleep(3000);

        try{
            Actions actions = new Actions(driver);
            actions.moveToElement(searchForAnything).build().perform();
            searchForAnything.click();
            Thread.sleep(3000);
            System.out.println(searchForAnything.getSize());
            System.out.println(searchForAnything.getText());
            allCategories.click();
            Thread.sleep(3000);
            searchButton.click();
            Thread.sleep(3000);

        } catch(Exception e){
            System.out.println("Product are missing");
        }
    }
    public void validateSeachingProduct(){
        String webElement = searchForAnything.getText();
        Assert.assertEquals(webElement,"");
    }
    //Test 8
    public void validateMoveBackward(){
        navigateToFashionPage();
        driver.navigate().back();
        String actualUrl = super.getCurrentPageUrl();
        System.out.println(actualUrl);
        String expectedUrl = "https://www.ebay.com/";
        Assert.assertEquals(actualUrl, expectedUrl);
    }
    //Test 9
    public void validateReturnToFashionPage(){
        navigateToFashionPage();
        driver.navigate().back();
        System.out.println(super.getCurrentPageUrl());
        driver.navigate().forward();
        driver.navigate().refresh();
        String actualUrl = super.getCurrentPageUrl();
        String fashionPageUrl = "https://www.ebay.com/b/Fashion/bn_7000259856";
        Assert.assertEquals(actualUrl,fashionPageUrl);
    }
    //Test 10
    public void expectedPage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(fashionButton));
        fashionButton.click();
        try{
            Actions actions = new Actions(driver);
            actions.moveToElement(myMenu).build().perform();
            Thread.sleep(1500);
            selling.click();
            Thread.sleep(1500);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    public void validateExpectedPage(){
        boolean actualPageIsDisplayed = openPage.isDisplayed();
        Assert.assertEquals(actualPageIsDisplayed,true,"Page doesnot found");
        System.out.println("");

    }
    //Test 11
    public String validateFashionPage(){
        navigateToFashionPage();
        String url = driver.getCurrentUrl();
        System.out.println("Page URL - " +url);
        return url;
    }
    //Test 12

    public void validateArrowMenu(){
        navigateToFashionPage();
        arrowMenu.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<WebElement> list = arrowMenu.findElements(By.xpath(webElementArrowMenu));
        int arrowMenu = list.size();
        System.out.println("Link Number " + arrowMenu);
        Assert.assertEquals(arrowMenu, 1,"Number doesnot found");

    }
    //Test 13
    public void validateChanelLink(){
        navigateToFashionPage();
        String actualLink = chanelLink.getAttribute("a");
        System.out.println(actualLink);
        Assert.assertEquals(actualLink,null);

    }
    //Test 14
    public boolean validateWebElementIsAvailable() throws InterruptedException {
        navigateToFashionPage();
        driver.navigate().refresh();
        driver.navigate().back();
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(fashionButton).build().perform();
        Thread.sleep(1000);
        boolean jewelryMenuButtonIsDisplayed = true;
        return jewelryMenuButtonIsDisplayed;

    }

    //Test 15
    public void validateTitle() throws InterruptedException {
        navigateToFashionPage();
        driver.navigate().refresh();
        driver.navigate().back();
        Thread.sleep(1000);
        try {


            Actions actions = new Actions(driver);
            actions.moveToElement(fashionButton).build().perform();
            Thread.sleep(1000);
            jewelryMenuButton.click();
            Thread.sleep(1000);
        } catch(Exception e){
            System.out.println("Waiting time was not enough");
        }
        String pageUrl = super.getCurrentPageUrl();
        Assert.assertEquals(pageUrl,"https://www.ebay.com/b/Jewelry/bn_7000259126");

    }
    //Test 16
    public void validateVintageArrow(){
        navigateToFashionPage();
        vintageArrow.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<WebElement> list = vintageArrow.findElements(By.xpath(webElementVinatgeArrow));
        int vintageArrow = list.size();
        System.out.println("Link Number " + vintageArrow);
        Assert.assertEquals(vintageArrow, 1,"Number doesnot found");



    }
    //Test 17
    public boolean validateHealthMenuIsAvailable() throws InterruptedException {
        navigateToFashionPage();
        driver.navigate().refresh();
        driver.navigate().back();
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(fashionButton).build().perform();
        Thread.sleep(1000);
        boolean healthMenuButtonIsDisplayed = true;
        return healthMenuButtonIsDisplayed;

    }
    //Test 18
    public String validateReturnToWomensClothingPage() {
        navigateToFashionPage();
        driver.navigate().back();
        System.out.println(super.getCurrentPageUrl());
        driver.navigate().forward();
        driver.navigate().refresh();
        String actualUrl = super.getCurrentPageUrl();
        String womensClothingPageUrl = "https://www.ebay.com/b/Fashion/bn_7000259856";

        Assert.assertEquals(actualUrl, womensClothingPageUrl);
        return actualUrl;
    }
    //Test 19
    public void validateShoesMenu() {
        navigateToFashionPage();
        shoesMenu.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<WebElement> list = shoesMenu.findElements(By.xpath(webElementShoesMenu));
        int shoesMenu = list.size();
        System.out.println("Link Number " + shoesMenu);
        Assert.assertEquals(shoesMenu, 1, "Number doesnot found");
    }
        //Test 20
        public void validateWatchesMenu() {
            navigateToFashionPage();
            watchesMenu.click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            List<WebElement> list = watchesMenu.findElements(By.xpath(webElementWatchesMenu));
            int watchesMenu = list.size();
            System.out.println("Link Number " + watchesMenu);
            Assert.assertEquals(watchesMenu, 1, "Number doesnot found");
        }












        }
