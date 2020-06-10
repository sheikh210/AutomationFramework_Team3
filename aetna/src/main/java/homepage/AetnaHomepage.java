package homepage;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static homepage.AetnaHomepageElements.*;

public class AetnaHomepage extends WebAPI {

    @FindBy (xpath = webElementButtonSearchHeader)
    public WebElement buttonSearchHeader;

    @FindBy (xpath = webElementInputSearchFieldHeader)
    public WebElement inputSearchFieldHeader;

    @FindBy (css = webElementExploreAetnaSitesButton)
    public WebElement buttonExploreAetnaSites;

    @FindBy (css = webElementDropdownMenuExploreAetnaSites)
    public WebElement dropdownMenuExploreAetnaSites;

    @FindBy (xpath = webElementButtonShopForAPlan)
    public WebElement buttonShopForAPlan;

    @FindBy (css = webElementDropdownMenuShopForAPlan)
    public WebElement dropdownMenuShopForAPlan;

    @FindBy (css = webElementButtonMedicare)
    public WebElement buttonMedicare;

    @FindBy (css = webElementSubmenuMedicare)
    public WebElement submenuMedicare;

    /**
     * Test Case 1 - Validate Navigation to Homepage
     * 1 - Navigate to http://aetna.com
     * 2 - Verify we're on the homepage by capturing page title
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
     * Test Case 2 - Validate that clicking on the 'Search' icon will expand search field and allow user to enter keys
     * 1 - Navigate to http://aetna.com
     * 2 - Click on 'Search' icon (magnifying glass) on header (top right)
     * 3 - Enter the phrase "Insurance Plans"
     * 4 - Press "Enter" on keyboard
     * 5 - Verify that the page you are navigated to is search results page
     */
    public void doSearch(){
        buttonSearchHeader.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(inputSearchFieldHeader));

        inputSearchFieldHeader.sendKeys(searchTerm);
        inputSearchFieldHeader.sendKeys(Keys.ENTER);
    }

    public void validateDoSearch(){
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.titleIs("Search Results"));
        String title = driver.getTitle();

        Assert.assertEquals(title, expectedElementSearchResultsTitle, "NOT NAVIGATED TO SEARCH RESULTS PAGE");
    }


    /**
     * Test Case 3 - Validate "Explore Aetna sites" button in header & elements contained within it
     * 1 - Navigate to http://aetna.com
     * 2 - Click on "Explore Aetna sites" button on top right of header
     * 3 - Verify the number of items contained within the dropdown
     * 4 - Verify the name of each of the items
     */
    public void validateExploreAetnaSitesDropdownItemCountAndNames(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(buttonExploreAetnaSites));

        clickOnElement(buttonExploreAetnaSites);
        List<WebElement> exploreAetnaSitesItems = dropdownMenuExploreAetnaSites.findElements(By.cssSelector(webElementItemsDropdownMenuExploreAetnaSites1));
        int itemCount=exploreAetnaSitesItems.size();
        System.out.println("Number of items counted in 'Explore Aetna sites' dropdown: "+itemCount+"\n");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(itemCount, expectedElementExploreAetnaSitesItemCount, "NUMBER OF ITEMS IN 'EXPLORE AETNA SITES' DROPDOWN DO NOT MATCH");

        int i=0;
        for (WebElement e:exploreAetnaSitesItems){
            softAssert.assertEquals(e.getText(), expectedElementExploreAetnaSitesItemNames[i], "ITEM NAME AT INDEX "+i+" IN 'EXPLORE AETNA SITES' DROPDOWN DOES NOT MATCH");
            System.out.println(e.getText());
            i++;
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 4 - Validate "Explore Aetna sites" element URLs
     * 1 - Navigate to http://aetna.com
     * 2 - Click on "Explore Aetna sites" button on top right of header
     * 3 - Click on each item in the list
     * 4 - Verify each item in the list takes us to the expected pages
     */
    public void validateExploreAetnaSitesDropdownItemURL(){
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(buttonExploreAetnaSites));
        clickOnElement(buttonExploreAetnaSites);

        List<WebElement> exploreAetnaSitesItems = dropdownMenuExploreAetnaSites.findElements(By.cssSelector(webElementItemsDropdownMenuExploreAetnaSites2));
        String [] exploreAetnaSitesItemURL = new String[exploreAetnaSitesItems.size()];

        SoftAssert softAssert = new SoftAssert();

        for (int i=0; i<exploreAetnaSitesItems.size(); i++){
            exploreAetnaSitesItemURL[i] = exploreAetnaSitesItems.get(i).getAttribute("href");

            System.out.println(exploreAetnaSitesItemURL[i]);
            softAssert.assertEquals(exploreAetnaSitesItemURL[i], expectedElementExploreAetnaSitesItemURL[i], "ITEM URL AT INDEX "+i+" IN 'EXPLORE AETNA SITES' DROPDOWN DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 5 - Validate "Shop for a plan" header dropdown (Left Menu)
     * 1 - Navigate to http://aetna.com
     * 2 - Click on "Products & Services" in header
     * 3 - Verify count & names of items listed on left side of dropdown menu
     */
    public void validateShopForAPlanMenuItemCountAndNames(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(buttonShopForAPlan));

        clickOnElement(buttonShopForAPlan);

        List<WebElement> shopForAPlanItemsList = dropdownMenuShopForAPlan.findElements(By.cssSelector(webElementDropdownMenuShopForAPlanItemsLeft));
        int actualCount = shopForAPlanItemsList.size();
        System.out.println("Number of counted items in 'Shop for a plan' dropdown menu: "+actualCount+"\n");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualCount, expectedElementShopForAPlanItemsListCount, "NUMBER OF COUNTED ITEMS ('SHOP FOR A PLAN' DROPDOWN) & NUMBER OF EXPECTED ITEMS DO NOT MATCH");

        for (int i=0;i<actualCount; i++){
            System.out.println(shopForAPlanItemsList.get(i).getText().toString());
            softAssert.assertEquals(shopForAPlanItemsList.get(i).getText(), expectedElementShopForAPlanItemsListNames[i], "ITEM AT INDEX "+i+" ('SHOP FOR A PLAN' DROPDOWN) DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 6 - Validate "Shop for a plan" header dropdown - 'Medicare' submenu count & names
     * 1 - Navigate to http://aetna.com
     * 2 - Click on "Products & Services" in header
     * 3 - Under 'Medicare' option, verify the count of submenu items & their names
     */
    public void validateMedicareSubmenuItemCountAndNames(){

    }

}
