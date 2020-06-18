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

    @FindBy(xpath = webElementCarouselSlideText)
    public WebElement carouselSlideText;

    @FindBy(xpath = webElementEbaySitesBox)
    public WebElement ebaySiteBox;

    @FindBy(xpath = webElementEbaySitesList)
    public WebElement ebaySiteList;

    @FindBy(xpath = webElementAboutEbay)
    public WebElement aboutEbay;

    @FindBy(xpath = webElementSearchButton)
    public WebElement searchButton;

    @FindBy(xpath = webElementItemToAdd)
    public WebElement itemToAdd;

    @FindBy(xpath = webElementAddToCartButton)
    public WebElement addToCartButton;

    @FindBy(xpath = webElementGoToCartButton)
    public WebElement goToCartButton;

    @FindBy(xpath = webElementItemText)
    public WebElement itemText;

    @FindBy(xpath = webElementEbayLogo)
    public WebElement ebayLogo;

    @FindBy(xpath = webElementMiniCart)
    public WebElement miniCart;

    @FindBy(xpath = webElementDeleteIcon)
    public WebElement deleteIcon;

    @FindBy(xpath = webElementMiniCartEmpty)
    public WebElement miniCartEmpty;

    @FindBy(xpath = webElementHelpButton)
    public WebElement helpButton;

    @FindBy(xpath = webElementFAQText)
    public WebElement fAQText;


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
    public void getSignInPage() {
        WebDriverWait expWait = new WebDriverWait(driver, 10);

        expWait.until(ExpectedConditions.elementToBeClickable(signIn));
        signIn.click();

    }

    public void validateSignInPage() {
        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title: " + actualTitle);

        Assert.assertEquals(actualTitle, expectedSignInPageTitle);

    }

    /**
     * Test Case 3 - Daily Deals
     * 1: Launch chrome browser
     * 2: Direct chrome to ebay "https://www.ebay.com/"
     * 3: click on Daily Deals in header on the top left corner
     * 4: Verify sign in page title and match with expected page title
     */
    public void getDailyDeals() {
        WebDriverWait expWait = new WebDriverWait(driver, 10);

        expWait.until(ExpectedConditions.elementToBeClickable(dailyDeals));
        dailyDeals.click();
    }

    public void validateDailyDeals() {
        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title: " + actualTitle);

        Assert.assertEquals(actualTitle, expectedDailyDealsTitle);

    }

    /**
     * Test Case 4 -  Navigate to Shopping Cart
     * 1: Launch chrome browser
     * 2: Direct chrome to ebay "https://www.ebay.com/"
     * 3:Click on Shopping cart icon in top right corner
     * 4: Verify sign in page title and match with expected page title
     */

    public void getShoppingCart() {
        WebDriverWait expWait = new WebDriverWait(driver, 10);

        expWait.until(ExpectedConditions.elementToBeClickable(shoppingCart));
        shoppingCart.click();

    }

    public void validateShoppingCart() {
        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title: " + actualTitle);

        Assert.assertEquals(actualTitle, expectedShoppingCartTitle);

    }

    /**
     * Test Case 5 - Sell Page
     * 1: Launch chrome browser
     * 2: Direct chrome to ebay "https://www.ebay.com/"
     * 3: click on Sell in header on the top right
     * 4: Verify sign in page title and match with expected page title
     */
    public void getSellPage() {
        WebDriverWait expWait = new WebDriverWait(driver, 10);

        expWait.until(ExpectedConditions.elementToBeClickable(sellPage));
        sellPage.click();

    }

    public void validateSellPage() {
        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title: " + actualTitle);

        Assert.assertEquals(actualTitle, expectedSellPageTitle);

    }

    /**
     * Test Case 6 - Help & Contact
     * 1: Launch chrome browser
     * 2: Direct chrome to ebay "https://www.ebay.com/"
     * 3: click on Help & Contact in header on the top left corner
     * 4: Verify sign in page title and match with expected page title
     */
    public void getHelpAndContact() {
        WebDriverWait expWait = new WebDriverWait(driver, 10);

        expWait.until(ExpectedConditions.elementToBeClickable(helpAndContact));
        helpAndContact.click();

    }

    public void validateHelpAndContact() {
        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title: " + actualTitle);

        Assert.assertEquals(actualTitle, expectedHelpAndContactTitle);

    }

    /**
     * Test Case 11 - Navigate to Motors
     * 1: Launch chrome browser
     * 2: Direct chrome to ebay "https://www.ebay.com/"
     * 3: Click on Motors in SubHeader
     * 4: Verify Motors page title and match with expected page title
     */
    public void getMotorsPage() {
        WebDriverWait expWait = new WebDriverWait(driver, 10);
        expWait.until(ExpectedConditions.elementToBeClickable(motorsPage));
        motorsPage.click();
    }

    public void validateMotorsPage() {
        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title: " + actualTitle);

        Assert.assertEquals(actualTitle, expectedMotorsPageTitle);
    }

    /**
     * Test Case 12 - Navigate to Fashion
     * 1: Launch chrome browser
     * 2: Direct chrome to ebay "https://www.ebay.com/"
     * 3: Click on Fashion in SubHeader
     * 4: Verify Fashion page title and match with expected page title
     */
    public void getFashionPage() {
        WebDriverWait expWait = new WebDriverWait(driver, 10);
        expWait.until(ExpectedConditions.elementToBeClickable(fashionPage));
        fashionPage.click();

    }

    public void validateFashionPage() {
        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title: " + actualTitle);

        Assert.assertEquals(actualTitle, expectedFashionPageTitle);

    }

    /**
     * Test Case 13 - Navigate to Electronics
     * 1: Launch chrome browser
     * 2: Direct chrome to ebay "https://www.ebay.com/"
     * 3: Click on Electronics in SubHeader
     * 4: Verify Electronics page title and match with expected page title
     */
    public void getElectronicsPage() {
        WebDriverWait expWait = new WebDriverWait(driver, 10);
        expWait.until(ExpectedConditions.elementToBeClickable(electronicsPage));
        electronicsPage.click();

    }

    public void validateElectronicsPage() {
        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title: " + actualTitle);

        Assert.assertEquals(actualTitle, expectedElectronicsPageTitle);

    }

    /**
     * Test Case 14 - Navigate to Collectibles & Art
     * 1: Launch chrome browser
     * 2: Direct chrome to ebay "https://www.ebay.com/"
     * 3: Click on Collectibles & Art in SubHeader
     * 4: Verify Collectibles & Art page title and match with expected page title
     */
    public void getCollectiblesAndArtPage() {
        WebDriverWait expWait = new WebDriverWait(driver, 10);
        expWait.until(ExpectedConditions.elementToBeClickable(collectiblesAndArtPage));
        collectiblesAndArtPage.click();

    }

    public void validateCollectiblesAndArtPage() {
        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title: " + actualTitle);

        Assert.assertEquals(actualTitle, expectedCollectiblesAndArtPageTitle);

    }

    /**
     * Test Case 7 - Search bar All Category Drop down menu
     * 1: Launch chrome browser
     * 2: Direct chrome to ebay "https://www.ebay.com/"
     * 3: click on All Categories Drop down menu
     * 4: Ensure that there are 36 categories and capture text
     */
    public int getSearchCategoryDropDownNum() {
        List<WebElement> dropDownItemsList = searchCategoryDropdown.findElements(By.xpath(webElementsSearchCategoryDropDownItems));
        int dropDownNum = dropDownItemsList.size();
        return dropDownNum;

    }

    public String[] getSearchByCategoryText() {
        List<WebElement> dropDownItemsList = searchCategoryDropdown.findElements(By.xpath(webElementsSearchCategoryDropDownItems));
        String[] items = new String[dropDownItemsList.size()];
        int i = 0;
        for (WebElement x : dropDownItemsList) {
            items[i] = x.getText();
            i++;
        }
        return items;
    }

    public void validateSearchCategoryDropDownNum() {

        Assert.assertEquals(getSearchCategoryDropDownNum(), 36, "List Size does not match");
    }

    public void validateSearchCategoryText() {
        String[] array = getSearchByCategoryText();
        for (int i = 0; i < 35; i++) {
            Assert.assertEquals(array[i], expectedSearchCategoryDropDownItems[i]);
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
     * 4: Ensure that there are 11 categories and return categories
     */
    public void validateShopByCategoryListNum() {
        shopByCategoryDropdown.click();
        List<WebElement> dropDownTableList = shopByCategoryDropdown.findElements(By.xpath(webElementsShopByCategoryDropdownItems));
        int dropDownNum = dropDownTableList.size();
        System.out.println("Size of 'Shop by Category' Dropdown List: " + dropDownNum);
        Assert.assertEquals(dropDownNum, expectedElementShopByCategoryDropdownCount, "LIST SIZE DOES NOT MATCH");

    }

    public String[] getShopByCategoryListText() {
        List<WebElement> dropDownTableList = driver.findElements(By.xpath(webElementsShopByCategoryDropdownItems));
        String[] items = new String[dropDownTableList.size()];
        int i = 0;
        for (WebElement x : dropDownTableList) {
            items[i] = x.getText();
            i++;
        }
        return items;
    }

    public void validateShopByCategoryListText() {
        String[] array = getShopByCategoryListText();
        for (int i = 0; i < 11; i++) {
            Assert.assertEquals(array[i], expectedShopByCategoryItems[i]);
            System.out.println(array[i]);

              }
        }

    /**
     *  Test Case 8 - Carousel slides right arrow
     * 1: Launch chrome browser
     * 2: Direct chrome to ebay "https://www.ebay.com/"
     * 3: Hover over carousel slides
     * 4: Click on the right arrow on the carousel slides
     * 5: Verify that carousel slides moves to the slide on the right
     */
    public void validateClickCarouselRight(){
        String text = carouselSlideText.getText();
        carouselNextSlide.click();
        while(carouselSlideText.isDisplayed()){
            carouselNextSlide.click();
        }

        Assert.assertEquals(text,expectedCarouselText);
        System.out.println("Carousel moved to the Right");
    }

    /**Test Case 9 - Carousel slides Left arrow
     1: Launch chrome browser
     2: Direct chrome to ebay "https://www.ebay.com/"
     3: Hover over carousel slides
     4: Click on the Left arrow on the carousel slides
     5: Verify that carousel slides moves to the slide on the Left
     */
    public void validateCarouselLeft() {
        String text = carouselSlideText.getText();
        carouselPrevSlide.click();
        while(carouselSlideText.isDisplayed()){
            carouselPrevSlide.click();

        }
        Assert.assertEquals(text,expectedCarouselText);
        System.out.println("Carousel moved to the left");


    }

    /**
     * Test Case 19 - Ebay Sites List
     * 1: Launch chrome browser
     * 2: Direct chrome to ebay "https://www.ebay.com/"
     * 3: Hover over Ebay Sites to see list of all Countries
     * 4: Get all Countries and store in array list
     * 5: Verify all Countries are present in list
     */
    public void validateEbaySitesListNum() {
        scrollToElementJScript(ebaySiteBox);
        ebaySiteBox.click();
        List<WebElement> ebaySiteCountriesList = ebaySiteList.findElements(By.xpath(webElementEbaySitesList));
        int numOfCountries = ebaySiteCountriesList.size();
        System.out.println("Number of Ebay sites: " + numOfCountries);
        Assert.assertEquals(numOfCountries, expectedEbaySitesListNum, "LIST SIZE DOES NOT MATCH");


    }
    public String[] getEbaySitesList() {
        List<WebElement> ebaySiteCountriesList = driver.findElements(By.xpath(webElementEbaySitesList));
        String[] items = new String[ebaySiteCountriesList.size()];
        int i = 0;
        for (WebElement x : ebaySiteCountriesList) {
            items[i] = x.getText();
            i++;
        }
        return items;
    }

    public void validateEbaySitesList() {
        String[] array = getEbaySitesList();
        for (int i = 0; i < 49; i++) {
            Assert.assertEquals(array[i], expectedEbaySitesList[i]);
            System.out.println(array[i]);

        }
    }

    /**
     * Test Case 15 - Get list under About Ebay
     * 1: Launch chrome browser
     * 2: Direct chrome to ebay "https://www.ebay.com/"
     * 3: locate all text under About Ebay at the bottom of ebay homepage
     * 4: Verify that there are 12 links and capture titles
     */
    public void validateAboutEbayListNum(){
        scrollToElementJScript(aboutEbay);
        List<WebElement> aboutEbayList = aboutEbay.findElements(By.xpath(webElementAboutEbay));
        int numAboutEbay = aboutEbayList.size();
        System.out.println("Number of links for About eBay " + numAboutEbay);
        Assert.assertEquals(numAboutEbay, expectedAboutEbayNum, "LIST SIZE DOES NOT MATCH");
    }

    public String[] getAboutEbayList(){
        List<WebElement> aboutEbayList = driver.findElements(By.xpath(webElementAboutEbay));
        String[] items = new String[aboutEbayList.size()];
        int i = 0;
        for (WebElement x : aboutEbayList) {
            items[i] = x.getText();
            i++;
        }
        return items;

    }

    public void validateAboutEbayList() {
        String[] array = getAboutEbayList();
        for (int i = 0; i < 12; i++) {
            Assert.assertEquals(array[i], expectedAboutEbayList[i]);
            System.out.println(array[i]);

        }

    }

    /**
     * Test Case 16 - Test Search bar
     * 1: Launch chrome browser
     * 2: Direct chrome to ebay "https://www.ebay.com/"
     * 3: Put a line of text in the search bar
     * 4: Click on the search button
     * 5: Verify that that item was searched
     */
    public void getSearchItem(){
        driver.findElement(By.xpath(webElementSearchBar)).sendKeys("Hand Sanitizer");
        searchButton.click();
        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title: " + actualTitle);

        Assert.assertEquals(actualTitle, expectedHandSanitizerTitle);

    }

    /**
     * Test Case 17- Add item to shopping cart from homepage
     * 1: Launch chrome browser
     * 2: Direct chrome to ebay "https://www.ebay.com/"
    * 3: Click on item on carousel list to direct to item page
    * 4: Click on add to cart
    * 5: verify that item is in your shopping cart
    */
    public void addItemToCart(){
        driver.findElement(By.xpath(webElementSearchBar)).sendKeys("Hand Sanitizer");
        searchButton.click();
        scrollToElementJScript(itemToAdd);
        itemToAdd.click();
        addToCartButton.click();
        goToCartButton.click();
    String item = itemText.getText();
    Assert.assertEquals(item,expectedItemText);
    System.out.println("Item was Added to cart");
    }

    /**
     * Test Case 18 - Delete Item from Cart from hover menu (dependent on case 17)
     * 1: Launch chrome browser
     * 2: Direct chrome to ebay "https://www.ebay.com/"
     * 3: Click on item on carousel list to direct to item page
     * 4: Click on add to cart
     * 5: Go back to Ebay home Page
     * 6: Hover over Shopping cart till menu appears
     * 7: Click on Delete icon to remove item
     * 8: Verify that there are no items in your shopping cart
     */
    public void deleteItemMiniCart(){
        addItemToCart();
        WebDriverWait expWait = new WebDriverWait(driver, 10);
        expWait.until(ExpectedConditions.elementToBeClickable(ebayLogo));
        ebayLogo.click();
        mouseHover(miniCart);
        deleteIcon.click();
        String emptyCart = miniCartEmpty.getText();
        Assert.assertEquals(emptyCart,expectedMiniCartEmptyText);
        System.out.println("Item was Deleted");


    }

    /**
     * Test Case 20 - Help button
     * 1: Launch chrome browser
     * 2: Direct chrome to ebay "https://www.ebay.com/"
     * 3: Click on '?' to open FAQs popup box
     * 4: Verify there the Text inside popup
     */
    public void getHelpButton(){
    helpButton.click();
        String faqText = fAQText.getText();
        Assert.assertEquals(faqText,expectedFAQText);
        System.out.println("FAQ Text is visible");

    }

}

