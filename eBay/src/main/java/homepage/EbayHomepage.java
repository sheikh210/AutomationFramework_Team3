package homepage;

import commonAPI.WebAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static homepage.EbayHomepageElements.*;

public class EbayHomepage extends WebAPI {

    @FindBy(xpath = webElementShopByCategoryDropdown)
    public WebElement shopByCategoryDropdown;

    @FindBy(css = webElementShopByCategoryDropdownMenu)
    public WebElement shopByCategoryDropdownMenu;

    @FindBy(css = webElementShopByCategoryDropdownMenuItems)
    public WebElement shopByCategoryDropdownMenuItems;

    @FindBy(xpath = webElementsSearchCategoryDropDown)
    public WebElement searchCategoryDropdown;

    @FindBy(xpath = webElementSignIn)
    public WebElement signIn;

    @FindBy(xpath = webElementDailyDeals)
    public WebElement dailyDeals;

    @FindBy(xpath = webElementShoppingCart)
    public WebElement shoppingCart;

    @FindBy(xpath = webElementSellPage)
    public WebElement sellPage;

    @FindBy(xpath = webElementHelpAndContact)
    public WebElement helpAndContact;

    @FindBy(xpath = webElementMotorsPage)
    public WebElement motorsPage;

    @FindBy(xpath = webElementFashionPage)
    public WebElement fashionPage;

    @FindBy(xpath = webElementElectronicsPage)
    public WebElement electronicsPage;

    @FindBy(xpath = webElementCollectiblesAndArtPage)
    public WebElement collectiblesAndArtPage;

    @FindBy(xpath = webElementCarouselNextSlide)
    public WebElement carouselNextSlide;

    @FindBy(xpath = webElementCarouselPrevSlide)
    public WebElement carouselPrevSlide;




    /**
     * Test Case 1 - Validate Navigation to Homepage
     * 1: Launch chrome browser
     * 2: Direct chrome to ebay "https://www.ebay.com/"
     * 3: Verify page title and match with expected page
     * titleCapture page title and match with expected page title
     */
    @Override
    public String getCurrentPageTitle() {
        return super.getCurrentPageTitle();
    }
    public void validateCurrentPage() {
        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title: " + actualTitle);

        Assert.assertEquals(actualTitle, expectedElementHomepageTitle, "HOMEPAGE TITLE DOES NOT MATCH");
    }


    /**
     * Test Case 2 - Validate navigation to login page
     * 1: Launch chrome browser
     * 2: Direct chrome to ebay "https://www.ebay.com/"
     * 3: Click on Sign in at the top left corner of webpage
     * 4: Verify sign in page title and match with expected page title
     */
    public void getSignInPage(){
        WebDriverWait expWait = new WebDriverWait(driver, 10);

        expWait.until(ExpectedConditions.elementToBeClickable(signIn));
        signIn.click();

    }

    public void validateSignInPage(){
        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title: " + actualTitle);

        Assert.assertEquals(actualTitle,expectedSignInPageTitle);

    }

    /**
     * Test Case 3 - Daily Deals
     * 1: Launch chrome browser
     * 2: Direct chrome to ebay "https://www.ebay.com/"
     * 3: click on Daily Deals in header on the top left corner
     * 4: Verify sign in page title and match with expected page title
     *
     */
    public void getDailyDeals() {
        WebDriverWait expWait = new WebDriverWait(driver, 10);

        expWait.until(ExpectedConditions.elementToBeClickable(dailyDeals));
        dailyDeals.click();
    }

    public void validateDailyDeals(){
        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title: " + actualTitle);

        Assert.assertEquals(actualTitle,expectedDailyDealsTitle);

    }

    /**
     * Test Case 4 -  Navigate to Shopping Cart
     * 1: Launch chrome browser
     * 2: Direct chrome to ebay "https://www.ebay.com/"
     * 3:Click on Shopping cart icon in top right corner
     * 4: Verify sign in page title and match with expected page title
     */

public void getShoppingCart(){
    WebDriverWait expWait = new WebDriverWait(driver, 10);

    expWait.until(ExpectedConditions.elementToBeClickable(shoppingCart));
    shoppingCart.click();

}

public void validateShoppingCart(){
    String actualTitle = getCurrentPageTitle();
    System.out.println("Page Title: " + actualTitle);

    Assert.assertEquals(actualTitle,expectedShoppingCartTitle);

}
/**
 * Test Case 5 - Sell Page
 * 1: Launch chrome browser
 * 2: Direct chrome to ebay "https://www.ebay.com/"
 * 3: click on Sell in header on the top right
 * 4: Verify sign in page title and match with expected page title
 */
public void getSellPage(){
    WebDriverWait expWait = new WebDriverWait(driver, 10);

    expWait.until(ExpectedConditions.elementToBeClickable(sellPage));
    sellPage.click();

}
public void validateSellPage(){
    String actualTitle = getCurrentPageTitle();
    System.out.println("Page Title: " + actualTitle);

    Assert.assertEquals(actualTitle,expectedSellPageTitle);

}
/**
 * Test Case 6 - Help & Contact
 * 1: Launch chrome browser
 * 2: Direct chrome to ebay "https://www.ebay.com/"
 * 3: click on Help & Contact in header on the top left corner
 * 4: Verify sign in page title and match with expected page title
 */
public void getHelpAndContact(){
    WebDriverWait expWait = new WebDriverWait(driver, 10);

    expWait.until(ExpectedConditions.elementToBeClickable(helpAndContact));
    helpAndContact.click();

}

public void validateHelpAndContact(){
    String actualTitle = getCurrentPageTitle();
    System.out.println("Page Title: " + actualTitle);

    Assert.assertEquals(actualTitle,expectedHelpAndContactTitle);

}



public void getMotorsPage(){
    WebDriverWait expWait = new WebDriverWait(driver, 10);
    expWait.until(ExpectedConditions.elementToBeClickable(motorsPage));
    motorsPage.click();
    }

public void validateMotorsPage(){
    String actualTitle = getCurrentPageTitle();
    System.out.println("Page Title: " + actualTitle);

    Assert.assertEquals(actualTitle,expectedMotorsPageTitle);
    }

public void getFashionPage(){
    WebDriverWait expWait = new WebDriverWait(driver, 10);
    expWait.until(ExpectedConditions.elementToBeClickable(fashionPage));
    fashionPage.click();

}

public void validateFashionPage(){
    String actualTitle = getCurrentPageTitle();
    System.out.println("Page Title: " + actualTitle);

    Assert.assertEquals(actualTitle,expectedFashionPageTitle);

}
    public void getElectronicsPage(){
        WebDriverWait expWait = new WebDriverWait(driver, 10);
        expWait.until(ExpectedConditions.elementToBeClickable(electronicsPage));
        electronicsPage.click();

    }

    public void validateElectronicsPage(){
        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title: " + actualTitle);

        Assert.assertEquals(actualTitle,expectedElectronicsPageTitle);

    }
    public void getCollectiblesAndArtPage(){
        WebDriverWait expWait = new WebDriverWait(driver, 10);
        expWait.until(ExpectedConditions.elementToBeClickable(collectiblesAndArtPage));
        collectiblesAndArtPage.click();

    }

    public void validateCollectiblesAndArtPage(){
        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title: " + actualTitle);

        Assert.assertEquals(actualTitle,expectedCollectiblesAndArtPageTitle);

    }

   /**Test Case 7 - Search bar All Category Drop down menu
    1: Launch chrome browser
    2: Direct chrome to ebay "https://www.ebay.com/"
    3: click on All Categories Drop down menu
    4: Ensure that there are 36 categories and capture text
    */
   public int getSearchCategoryDropDownNum(){
       List<WebElement> dropDownItemsList = searchCategoryDropdown.findElements(By.xpath(webElementsSearchCategoryDropDownItems));
       int dropDownNum = dropDownItemsList.size();
return dropDownNum;

   }
   public String[] getSearchCategoryText(){
       List<WebElement> dropDownItemsList = searchCategoryDropdown.findElements(By.xpath(webElementsSearchCategoryDropDownItems));
       String[] items = new String[dropDownItemsList.size()];
       int i=0;
       for(WebElement x: dropDownItemsList){
        items[i]= x.getText();
        i++;
        }
    return items;
   }

   public void validateSearchCategoryDropDownNum(){

Assert.assertEquals(getSearchCategoryDropDownNum(),36,"List Size does not match");
   }

   public void validateSearchCategoryText() {
       String[] array = getSearchCategoryText();
      for(int i = 0; i < 35; i++){
           Assert.assertEquals(array[i],expectedSearchCategoryDropDownItems[i]);
           System.out.println(array[i]);
        }

      /** SoftAssert softAssert = new SoftAssert();
       for (int i=0; i<3; i++){
           softAssert.assertEquals(array[i], expectedSearchCategoryDropDownItems[i]);
       }
       softAssert.assertAll();
       */
   }






    /**
     * Test Case 10 - Shop by category Drop down menu
     * 1: Launch chrome browser
     * 2: Direct chrome to ebay "https://www.ebay.com/"
     * 3: click on Shop by category Drop down menu
     * 4: Ensure that there are 9 categories and 2 options at bottom of menu for
     * all categories  and all brands within the menu and capture links
     */
    /**public int shopByCategoryList() {
     mouseHover(webElementshopByCategoryDropdown);
     List<WebElement> topEventsDropDownList = getListOfWebElementsByXpath(webElementshopByCategoryDropdownMenu, webElementshopByCategoryDropdownMenuItems);
     int listSize = topEventsDropDownList.size();

     return listSize;
     }

     public void validateTopEventsDropdownListSizeAndLinks() {
     int actualListSize = shopByCategoryList();

     System.out.println("Size of 'Shop by Category' Dropdown List: " + actualListSize);
     Assert.assertEquals(actualListSize, expectedElementshopByCategoryDropdownCount, "LIST SIZE DOES NOT MATCH");
     }
     */
   }

