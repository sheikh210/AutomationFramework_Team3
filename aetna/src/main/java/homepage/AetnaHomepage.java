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

    @FindBy (css = webElementButtonHealthCoverage)
    public WebElement buttonHealthCoverage;

    @FindBy (css = webElementSubmenuHealthCoverage)
    public WebElement submenuHealthCoverage;

    @FindBy (css = webElementButtonDentalVisionSupplemental)
    public WebElement buttonDentalVisionSupplemental;

    @FindBy (css = webElementSubmenuDentalVisionSupplemental)
    public WebElement submenuDentalVisionSupplemental;

    @FindBy (css = webElementButtonPharmacy)
    public WebElement buttonPharmacy;

    @FindBy (css = webElementSubmenuPharmacy)
    public WebElement submenuPharmacy;

    @FindBy (css = webElementButtonMedicaid)
    public WebElement buttonMedicaid;

    @FindBy (css = webElementSubmenuMedicaid)
    public WebElement submenuMedicaid;

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
     * 2 - Click on "Shop for a plan" in header
     * 3 - Verify count & names of items listed on left side of dropdown menu
     */
    public void validateShopForAPlanMenuItemCountAndNames(){
        WebDriverWait wait = new WebDriverWait(driver,10);

        try {
            Thread.sleep(2000);
            clickOnElement(buttonShopForAPlan);
        } catch (Exception e){
            System.out.println("COULD NOT CLICK ON 'SHOP FOR A PLAN BUTTON --- TRYING AGAIN");
        }
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
     * 2 - Click on "Shop for a plan" in header
     * 3 - Under 'Medicare' option, verify the count of submenu items & their names
     */
    public void validateMedicareSubmenuItemCountAndNames(){
        WebDriverWait wait = new WebDriverWait(driver,10);

        try {
            Thread.sleep(2000);
            clickOnElement(buttonShopForAPlan);
        } catch (Exception e){
            System.out.println("COULD NOT CLICK ON 'SHOP FOR A PLAN BUTTON --- TRYING AGAIN");
        }
        wait.until(ExpectedConditions.elementToBeClickable(buttonMedicare));
        clickOnElement(buttonMedicare);
        System.out.println("Clicked "+buttonMedicare.getText()+" Submenu Button");
        wait.until(ExpectedConditions.visibilityOfAllElements(submenuMedicare.findElements(By.cssSelector(webElementsSubmenuMedicareItems))));

        List<WebElement> submenuItems = submenuMedicare.findElements(By.cssSelector(webElementsSubmenuMedicareItems));
        int actualSubmenuItemCount = submenuItems.size();
        System.out.println("Counted items within 'Medicare' submenu: "+actualSubmenuItemCount);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualSubmenuItemCount, expectedElementSubmenuMedicareItemCount, "'MEDICARE' SUBMENU ITEM COUNT DOES NOT MATCH");

        for (int i=0; i<submenuItems.size(); i++){
            System.out.println(submenuItems.get(i).getText());
            softAssert.assertEquals(submenuItems.get(i).getText(), expectedElementsSubmenuMedicareItemNames[i], "LIST ITEM AT INDEX "+i+" IN 'MEDICARE' SUBMENU DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 7 - Validate "Shop for a plan" header dropdown - 'Medicare' submenu URLs
     * 1 - Navigate to http://aetna.com
     * 2 - Click on "Shop for a plan" in header
     * 3 - Under 'Medicare' option, verify the URLs of submenu items
     */
    public void validateMedicareSubmenuItemURLs(){
        WebDriverWait wait = new WebDriverWait(driver,10);

        try {
            Thread.sleep(2000);
            clickOnElement(buttonShopForAPlan);
        } catch (Exception e){
            System.out.println("COULD NOT CLICK ON 'SHOP FOR A PLAN BUTTON --- TRYING AGAIN");
        }
        wait.until(ExpectedConditions.elementToBeClickable(buttonMedicare));
        clickOnElement(buttonMedicare);
        System.out.println("Clicked "+buttonMedicare.getText()+" Submenu Button");
        wait.until(ExpectedConditions.visibilityOfAllElements(submenuMedicare.findElements(By.cssSelector(webElementsSubmenuMedicareItems))));

        List<WebElement> submenuItems = submenuMedicare.findElements(By.cssSelector(webElementsSubmenuMedicareItems));

        SoftAssert softAssert = new SoftAssert();
        for (int i=0; i<submenuItems.size(); i++) {
            String actualURL = submenuItems.get(i).getAttribute("href");
            System.out.println(actualURL);
            softAssert.assertEquals(actualURL, expectedElementsSubmenuMedicareItemURLs[i], "URL FOR LIST ITEM IN 'MEDICARE' SUBMENU AT INDEX "+i+" DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 8 - Validate "Shop for a plan" header dropdown - 'Health Coverage' submenu count & names
     * 1 - Navigate to http://aetna.com
     * 2 - Click on "Shop for a plan" in header
     * 3 - Under 'Health Coverage' option, verify the count of submenu items & their names
     */
    public void validateHealthCoverageSubmenuItemCountAndNames(){
        WebDriverWait wait = new WebDriverWait(driver,10);

        try {
            Thread.sleep(2000);
            clickOnElement(buttonShopForAPlan);
        } catch (Exception e){
            System.out.println("COULD NOT CLICK ON 'SHOP FOR A PLAN BUTTON --- TRYING AGAIN");
        }
        wait.until(ExpectedConditions.elementToBeClickable(buttonHealthCoverage));
        clickOnElement(buttonHealthCoverage);
        System.out.println("Clicked "+buttonHealthCoverage.getText()+" Submenu Button");

        List<WebElement> submenuItems = submenuHealthCoverage.findElements(By.cssSelector(webElementsSubmenuHealthCoverageItems));
        int actualSubmenuItemCount = submenuItems.size();
        System.out.println("Counted items within 'Health Coverage' submenu: "+actualSubmenuItemCount);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualSubmenuItemCount, expectedElementSubmenuHealthCoverageItemCount, "'HEALTH COVERAGE' SUBMENU ITEM COUNT DOES NOT MATCH");

        for (int i=0; i<submenuItems.size(); i++){
            System.out.println(submenuItems.get(i).getText());
            softAssert.assertEquals(submenuItems.get(i).getText(), expectedElementsSubmenuHealthCoverageItemNames[i], "LIST ITEM AT INDEX "+i+" IN 'HEALTH COVERAGE' SUBMENU DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 9 - Validate "Shop for a plan" header dropdown - 'Health Coverage' submenu URLs
     * 1 - Navigate to http://aetna.com
     * 2 - Click on "Shop for a plan" in header
     * 3 - Under 'Health Coverage' option, verify the URLs of submenu items
     */
    public void validateHealthCoverageSubmenuItemURLs(){
        WebDriverWait wait = new WebDriverWait(driver,10);

        try {
            Thread.sleep(2000);
            clickOnElement(buttonShopForAPlan);
        } catch (Exception e){
            System.out.println("COULD NOT CLICK ON 'SHOP FOR A PLAN BUTTON --- TRYING AGAIN");
        }
        wait.until(ExpectedConditions.elementToBeClickable(buttonHealthCoverage));
        clickOnElement(buttonHealthCoverage);
        System.out.println("Clicked "+buttonHealthCoverage.getText()+" Submenu Button");

        List<WebElement> submenuItems = submenuHealthCoverage.findElements(By.cssSelector(webElementsSubmenuHealthCoverageItems));

        SoftAssert softAssert = new SoftAssert();
        for (int i=0; i<submenuItems.size(); i++) {
            String actualURL = submenuItems.get(i).getAttribute("href");
            System.out.println(actualURL);
            softAssert.assertEquals(actualURL, expectedElementsSubmenuHealthCoverageItemURLs[i], "URL FOR LIST ITEM IN 'HEALTH COVERAGE' SUBMENU AT INDEX "+i+" DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 10 - Validate "Shop for a plan" header dropdown - 'Dental, vision and supplemental' submenu count & names
     * 1 - Navigate to http://aetna.com
     * 2 - Click on "Shop for a plan" in header
     * 3 - Under 'Dental, vision and supplemental' option, verify the count of submenu items & their names
     */
    public void validateDentalVisionSupplementalSubmenuItemCountAndNames(){
        WebDriverWait wait = new WebDriverWait(driver,10);

        try {
            Thread.sleep(2000);
            clickOnElement(buttonShopForAPlan);
        } catch (Exception e){
            System.out.println("COULD NOT CLICK ON 'SHOP FOR A PLAN BUTTON --- TRYING AGAIN");
        }
        wait.until(ExpectedConditions.elementToBeClickable(buttonDentalVisionSupplemental));
        clickOnElement(buttonDentalVisionSupplemental);
        System.out.println("Clicked "+buttonDentalVisionSupplemental.getText()+" Submenu Button");

        List<WebElement> submenuItems = submenuDentalVisionSupplemental.findElements(By.cssSelector(webElementsSubmenuDentalVisionSupplementalItems));
        int actualSubmenuItemCount = submenuItems.size();
        System.out.println("Counted items within 'Dental, Vision and supplemental' submenu: "+actualSubmenuItemCount);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualSubmenuItemCount, expectedElementSubmenuDentalVisionSupplementalItemCount, "'DENTAL, VISION AND SUPPLEMENTAL' SUBMENU ITEM COUNT DOES NOT MATCH");

        for (int i=0; i<submenuItems.size(); i++){
            System.out.println(submenuItems.get(i).getText());
            softAssert.assertEquals(submenuItems.get(i).getText(), expectedElementsSubmenuDentalVisionSupplementalItemNames[i], "LIST ITEM AT INDEX "+i+" IN 'DENTAL, VISION AND SUPPLEMENTAL' SUBMENU DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 11 - Validate "Shop for a plan" header dropdown - 'Dental, vision and supplemental' submenu URLs
     * 1 - Navigate to http://aetna.com
     * 2 - Click on "Shop for a plan" in header
     * 3 - Under 'Dental, vision and supplemental' option, verify the URLs of submenu items
     */
    public void validateDentalVisionSupplementalSubmenuItemURLs(){
        WebDriverWait wait = new WebDriverWait(driver,10);

        try {
            Thread.sleep(2000);
            clickOnElement(buttonShopForAPlan);
        } catch (Exception e){
            System.out.println("COULD NOT CLICK ON 'SHOP FOR A PLAN BUTTON --- TRYING AGAIN");
        }
        wait.until(ExpectedConditions.elementToBeClickable(buttonDentalVisionSupplemental));
        clickOnElement(buttonDentalVisionSupplemental);
        System.out.println("Clicked "+buttonDentalVisionSupplemental.getText()+" Submenu Button");

        List<WebElement> submenuItems = submenuDentalVisionSupplemental.findElements(By.cssSelector(webElementsSubmenuDentalVisionSupplementalItems));

        SoftAssert softAssert = new SoftAssert();
        for (int i=0; i<submenuItems.size(); i++) {
            String actualURL = submenuItems.get(i).getAttribute("href");
            System.out.println(actualURL);
            softAssert.assertEquals(actualURL, expectedElementsSubmenuDentalVisionSupplementalItemURLs[i], "URL FOR LIST ITEM IN 'DENTAL, VISION AND SUPPLEMENTAL' SUBMENU AT INDEX "+i+" DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 12 - Validate "Shop for a plan" header dropdown - 'Pharmacy' submenu count & names
     * 1 - Navigate to http://aetna.com
     * 2 - Click on "Shop for a plan" in header
     * 3 - Under 'Pharmacy' option, verify the count of submenu items & their names
     */
    public void validatePharmacySubmenuItemCountAndNames(){
        WebDriverWait wait = new WebDriverWait(driver,10);

        try {
            Thread.sleep(2000);
            clickOnElement(buttonShopForAPlan);
        } catch (Exception e){
            System.out.println("COULD NOT CLICK ON 'SHOP FOR A PLAN BUTTON --- TRYING AGAIN");
        }
        wait.until(ExpectedConditions.elementToBeClickable(buttonPharmacy));
        clickOnElement(buttonPharmacy);
        System.out.println("Clicked "+buttonPharmacy.getText()+" Submenu Button");

        List<WebElement> submenuItems = submenuPharmacy.findElements(By.cssSelector(webElementsSubmenuPharmacyItems));
        int actualSubmenuItemCount = submenuItems.size();
        System.out.println("Counted items within 'Pharmacy' submenu: "+actualSubmenuItemCount);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualSubmenuItemCount, expectedElementSubmenuPharmacyItemCount, "'PHARMACY' SUBMENU ITEM COUNT DOES NOT MATCH");

        for (int i=0; i<submenuItems.size(); i++){
            System.out.println(submenuItems.get(i).getText());
            softAssert.assertEquals(submenuItems.get(i).getText(), expectedElementsSubmenuPharmacyItemNames[i], "LIST ITEM AT INDEX "+i+" IN 'PHARMACY' SUBMENU DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 13 - Validate "Shop for a plan" header dropdown - 'Pharmacy' submenu URLs
     * 1 - Navigate to http://aetna.com
     * 2 - Click on "Shop for a plan" in header
     * 3 - Under 'Pharmacy' option, verify the URLs of submenu items
     */
    public void validatePharmacySubmenuItemURLs(){
        WebDriverWait wait = new WebDriverWait(driver,10);

        try {
            Thread.sleep(2000);
            clickOnElement(buttonShopForAPlan);
        } catch (Exception e){
            System.out.println("COULD NOT CLICK ON 'SHOP FOR A PLAN BUTTON --- TRYING AGAIN");
        }
        wait.until(ExpectedConditions.elementToBeClickable(buttonPharmacy));
        clickOnElement(buttonPharmacy);
        System.out.println("Clicked "+buttonPharmacy.getText()+" Submenu Button");

        List<WebElement> submenuItems = submenuPharmacy.findElements(By.cssSelector(webElementsSubmenuPharmacyItems));

        SoftAssert softAssert = new SoftAssert();
        for (int i=0; i<submenuItems.size(); i++) {
            String actualURL = submenuItems.get(i).getAttribute("href");
            System.out.println(actualURL);
            softAssert.assertEquals(actualURL, expectedElementsSubmenuPharmacyItemURLs[i], "URL FOR LIST ITEM IN 'PHARMACY' SUBMENU AT INDEX "+i+" DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 14 - Validate "Shop for a plan" header dropdown - 'Medicaid' submenu count & names
     * 1 - Navigate to http://aetna.com
     * 2 - Click on "Shop for a plan" in header
     * 3 - Under 'Medicaid' option, verify the count of submenu items & their names
     */
    public void validateMedicaidSubmenuItemCountAndNames(){
        WebDriverWait wait = new WebDriverWait(driver,10);

        try {
            Thread.sleep(2000);
            clickOnElement(buttonShopForAPlan);
        } catch (Exception e){
            System.out.println("COULD NOT CLICK ON 'SHOP FOR A PLAN BUTTON --- TRYING AGAIN");
        }
        wait.until(ExpectedConditions.elementToBeClickable(buttonMedicaid));
        clickOnElement(buttonMedicaid);
        System.out.println("Clicked "+buttonMedicaid.getText()+" Submenu Button");

        List<WebElement> submenuItems = submenuMedicaid.findElements(By.cssSelector(webElementsSubmenuMedicaidItems));
        int actualSubmenuItemCount = submenuItems.size();
        System.out.println("Counted items within 'Medicaid' submenu: "+actualSubmenuItemCount);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualSubmenuItemCount, expectedElementSubmenuMedicaidItemCount, "'MEDICAID' SUBMENU ITEM COUNT DOES NOT MATCH");

        for (int i=0; i<submenuItems.size(); i++){
            System.out.println(submenuItems.get(i).getText());
            softAssert.assertEquals(submenuItems.get(i).getText(), expectedElementsSubmenuMedicaidItemNames[i], "LIST ITEM AT INDEX "+i+" IN 'MEDICAID' SUBMENU DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 15 - Validate "Shop for a plan" header dropdown - 'Medicaid' submenu URLs
     * 1 - Navigate to http://aetna.com
     * 2 - Click on "Shop for a plan" in header
     * 3 - Under 'Medicaid' option, verify the URLs of submenu items
     */
    public void validateMedicaidSubmenuItemURLs(){
        WebDriverWait wait = new WebDriverWait(driver,10);

        try {
            Thread.sleep(2000);
            clickOnElement(buttonShopForAPlan);
        } catch (Exception e){
            System.out.println("COULD NOT CLICK ON 'SHOP FOR A PLAN BUTTON --- TRYING AGAIN");
        }
        wait.until(ExpectedConditions.elementToBeClickable(buttonMedicaid));
        clickOnElement(buttonMedicaid);
        System.out.println("Clicked "+buttonMedicaid.getText()+" Submenu Button");

        List<WebElement> submenuItems = submenuMedicaid.findElements(By.cssSelector(webElementsSubmenuMedicaidItems));

        SoftAssert softAssert = new SoftAssert();
        for (int i=0; i<submenuItems.size(); i++) {
            String actualURL = submenuItems.get(i).getAttribute("href");
            System.out.println(actualURL);
            softAssert.assertEquals(actualURL, expectedElementsSubmenuMedicaidItemURLs[i], "URL FOR LIST ITEM IN 'MEDICAID' SUBMENU AT INDEX "+i+" DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 16 - Validate "Login" button navigates us to Login page
     * 1 - Navigate to http://aetna.com
     * 2 - Click "Login" button in header
     * 3 - Verify user is navigated to Login page
     */
    public void validateLogin(){

    }
}
