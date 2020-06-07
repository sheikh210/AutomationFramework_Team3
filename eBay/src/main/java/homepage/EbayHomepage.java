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
    public WebElement ShopByCategoryDropdown;

    @FindBy(css = webElementShopByCategoryDropdownMenu)
    public WebElement shopByCategoryDropdownMenu;

    @FindBy(css = webElementShopByCategoryDropdownMenuItems)
    public WebElement shopByCategoryDropdownMenuItems;

    @FindBy(xpath = webElementsSearchCategoryDropDown)
    public WebElement SearchCategoryDropdown;


    @FindBy(xpath = webElementSignIn)
    public WebElement signIn;

    @FindBy(xpath = webElementDailyDeals)
    public WebElement dailyDeals;

    @FindBy(xpath = webElementShoppingCart)
    public WebElement ShoppingCart;

    @FindBy(xpath = webElementMyEbay)
    public WebElement MyEbay;

    @FindBy(xpath = webElementHelpAndContact)
    public WebElement HelpAndContact;

    @FindBy(xpath = webElementCarouselNextSlide)
    public WebElement CarouselNextSlide;

    @FindBy(xpath = webElementCarouselPrevSlide)
    public WebElement CarouselPrevSlide;




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
     * Test Case 2 - Shop by category Drop down menu
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
   /** public void dailyDeals() {
        WebDriverWait expWait = new WebDriverWait(driver, 10);

        expWait.until(ExpectedConditions.elementToBeClickable(dailyDeals));
        dailyDeals.click();
    }
*/

   /**Test Case 4 - Search bar All Category Drop down menu
    1: Launch chrome browser
    2: Direct chrome to ebay "https://www.ebay.com/"
    3: click on All Categories Drop down menu
    4: Ensure that there are 36 categories and capture text
    */
   public int getSearchCategoryDropDownNum(){
       List<WebElement> dropDownItemsList = SearchCategoryDropdown.findElements(By.xpath(webElementsSearchCategoryDropDownItems));
       int dropDownNum = dropDownItemsList.size();
return dropDownNum;

   }
   public String[] getSearchCategoryText(){
       List<WebElement> dropDownItemsList = SearchCategoryDropdown.findElements(By.xpath(webElementsSearchCategoryDropDownItems));
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
   }

