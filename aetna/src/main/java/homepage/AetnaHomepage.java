package homepage;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utilities.ConnectToSqlDB;
import utilities.DataReader;

import java.io.IOException;
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

    @FindBy (css = webElementButtonLogin)
    public WebElement buttonLogin;

    @FindBy (css = webElementCustomerIdentifierSection)
    public WebElement sectionCustomerIdentifier;

    @FindBy (css = webElementMiscellaneousGridSection)
    public WebElement sectionMiscellaneousGrid;

    @FindBy (css = webElementWrapperSocialMedia)
    public WebElement wrapperSocialMedia;

    @FindBy (id = webElementButtonTravelInfo)
    public WebElement buttonTravelInfo;

    DataReader dataReader = new DataReader();
    ConnectToSqlDB connectToSQL = new ConnectToSqlDB();

    /**
     * Test Case 1 - Validate Navigation to Homepage
     * 1 - Navigate to http://aetna.com
     * 2 - Verify we're on the homepage by capturing page title
     */
    @Override
    public String getCurrentPageTitle() {
        return super.getCurrentPageTitle();
    }

    public void validateCurrentPage() throws Exception {
        String actualTitle = getCurrentPageTitle();
        System.out.println("ACTUAL Page Title: " + actualTitle);

        String [] expectedHomepageTitleArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") +
                "\\src\\main\\resources\\AetnaHomepage_ExpectedElements.xlsx", "Homepage Title");
        String expectedHomepageTitle = expectedHomepageTitleArray[0];
        System.out.println("EXPECTED Page Title: "+expectedHomepageTitle);

        Assert.assertEquals(actualTitle, expectedHomepageTitle, "HOMEPAGE TITLE DOES NOT MATCH");
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

    public void validateDoSearch() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.titleIs("Search Results"));
        String actualTitle = driver.getTitle();
        System.out.println("ACTUAL Page Title: "+actualTitle);

        String [] expectedSearchResultsPageTitleArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") +
                "\\src\\main\\resources\\AetnaHomepage_ExpectedElements.xlsx", "Search Results Page Title");
        String expectedSearchResultsPageTitle = expectedSearchResultsPageTitleArray[0];
        System.out.println("EXPECTED Page Title: "+expectedSearchResultsPageTitle);

        Assert.assertEquals(actualTitle, expectedSearchResultsPageTitle, "NOT NAVIGATED TO SEARCH RESULTS PAGE");
    }


    /**
     * Test Case 3 - Validate "Explore Aetna sites" button in header & elements contained within it
     * 1 - Navigate to http://aetna.com
     * 2 - Click on "Explore Aetna sites" button on top right of header
     * 3 - Verify the number of items contained within the dropdown
     * 4 - Verify the name of each of the items
     */
    public void validateExploreAetnaSitesDropdownItemCount() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(buttonExploreAetnaSites));
        clickOnElement(buttonExploreAetnaSites);

        List<WebElement> exploreAetnaSitesItems = dropdownMenuExploreAetnaSites.findElements(By.cssSelector(webElementItemsDropdownMenuExploreAetnaSites1));
        int actualItemCount = exploreAetnaSitesItems.size();
        System.out.println("ACTUAL number of items in 'Explore Aetna sites' dropdown: "+actualItemCount+"\n");

        int [] expectedCountExploreAetnaSitesDropdownItemsArray = dataReader.fileReaderIntegerXSSF(System.getProperty(
                "user.dir") + "\\src\\main\\resources\\AetnaHomepage_ExpectedElements.xlsx", "Explore Aetna Sites Count");
        int expectedCountExploreAetnaSitesItems = expectedCountExploreAetnaSitesDropdownItemsArray[0];
        System.out.println("EXPECTED number of items in 'Explore Aetna sites' dropdown: "+expectedCountExploreAetnaSitesItems);

        Assert.assertEquals(actualItemCount, expectedCountExploreAetnaSitesItems, "NUMBER OF ITEMS IN 'EXPLORE AETNA " +
                "SITES' DROPDOWN DO NOT MATCH");
    }


    /**
     * Test Case 4 - Validate "Explore Aetna sites" element URLs
     * 1 - Navigate to http://aetna.com
     * 2 - Click on "Explore Aetna sites" button on top right of header
     * 3 - Click on each item in the list
     * 4 - Verify each item in the list takes us to the expected pages
     */
    public void validateExploreAetnaSitesDropdownItemNamesAndURL() throws Exception{
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(buttonExploreAetnaSites));
        clickOnElement(buttonExploreAetnaSites);

        List<WebElement> exploreAetnaSitesItems = dropdownMenuExploreAetnaSites.findElements(By.cssSelector(webElementItemsDropdownMenuExploreAetnaSites2));

        connectToSQL.insertWebElementTextArrayListToSqlTable(exploreAetnaSitesItems, "explore_aetna_sites_dropdown_names", "dropdown_names");
        connectToSQL.insertWebElementLinksArrayListToSqlTable(exploreAetnaSitesItems, "explore_aetna_sites_dropdown_urls", "dropdown_urls");

        String [] expectedNamesExploreAetnaSitesDropdownItemsArray = dataReader.fileReaderStringXSSF(System.getProperty(
                "user.dir") + "\\src\\main\\resources\\AetnaHomepage_ExpectedElements.xlsx", "Explore Aetna Sites Name");
        String [] expectedURLExploreAetnaSitesDropdownItemsArray = dataReader.fileReaderStringXSSF(System.getProperty(
                "user.dir") + "\\src\\main\\resources\\AetnaHomepage_ExpectedElements.xlsx", "Explore Aetna Sites URL");

        List<String> actualNames = connectToSQL.readDataBase("explore_aetna_sites_dropdown_names",
                "dropdown_names");
        List<String> actualURLs = connectToSQL.readDataBase("explore_aetna_sites_dropdown_urls",
                "dropdown_urls");

        SoftAssert softAssert = new SoftAssert();
        int i=0;
        for (WebElement e:exploreAetnaSitesItems){
            System.out.println("ACTUAL 'Explore Aetna sites' dropdown item name ("+i+"): "+actualNames.get(i));
            System.out.println("ACTUAL 'Explore Aetna sites' dropdown item URL ("+i+"): "+actualURLs.get(i));
            System.out.println("EXPECTED 'Explore Aetna sites' dropdown item name ("+i+"): "+expectedNamesExploreAetnaSitesDropdownItemsArray[i]);
            System.out.println("EXPECTED 'Explore Aetna sites' dropdown item URL ("+i+"): "+expectedURLExploreAetnaSitesDropdownItemsArray[i]);

            softAssert.assertEquals(actualNames.get(i), expectedNamesExploreAetnaSitesDropdownItemsArray[i], "ITEM " +
                    "NAME AT INDEX "+i+" IN 'EXPLORE AETNA SITES' DROPDOWN DOES NOT MATCH");
            softAssert.assertEquals(actualURLs.get(i), expectedURLExploreAetnaSitesDropdownItemsArray[i],
                    "ITEM URL AT INDEX \"+i+\" IN 'EXPLORE AETNA SITES' DROPDOWN DOES NOT MATCH");
            i++;
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 5 - Validate "Shop for a plan" header dropdown (Left Menu)
     * 1 - Navigate to http://aetna.com
     * 2 - Click on "Shop for a plan" in header
     * 3 - Verify count & names of items listed on left side of dropdown menu
     */
    public void validateShopForAPlanMenuItemCountAndNames() throws Exception{
        WebDriverWait wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(buttonShopForAPlan));
        clickOnElement(buttonShopForAPlan);

        List<WebElement> shopForAPlanItemsList = dropdownMenuShopForAPlan.findElements(By.cssSelector(webElementDropdownMenuShopForAPlanItemsLeft));
        int actualCount = shopForAPlanItemsList.size();
        System.out.println("Number of counted items in 'Shop for a plan' dropdown menu: "+actualCount+"\n");

        int [] expectedCountShopForAPlanItemsArray = dataReader.fileReaderIntegerXSSF(System.getProperty(
                "user.dir") + "\\src\\main\\resources\\AetnaHomepage_ExpectedElements.xlsx", "ShopForAPlan Dropdown Count");
        int expectedCountShopForAPlan = expectedCountShopForAPlanItemsArray[0];

        String [] expectedNameShopForAPlanItemsArray = dataReader.fileReaderStringXSSF(System.getProperty(
                "user.dir") + "\\src\\main\\resources\\AetnaHomepage_ExpectedElements.xlsx", "ShopForAPlan Dropdown Names");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualCount, expectedCountShopForAPlan, "NUMBER OF COUNTED ITEMS ('SHOP FOR A PLAN' DROPDOWN) & NUMBER " +
                "OF EXPECTED ITEMS DO NOT MATCH");

        for (int i=0;i<actualCount; i++){
            System.out.println(shopForAPlanItemsList.get(i).getText().toString());
            softAssert.assertEquals(shopForAPlanItemsList.get(i).getText(), expectedNameShopForAPlanItemsArray[i], "ITEM AT INDEX "+i+" " +
                    "('SHOP FOR A PLAN' DROPDOWN) DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 6 - Validate "Shop for a plan" header dropdown - 'Medicare' submenu count & names
     * 1 - Navigate to http://aetna.com
     * 2 - Click on "Shop for a plan" in header
     * 3 - Under 'Medicare' option, verify the count of submenu items & their names
     */
    public void validateMedicareSubmenuItemCountAndNames() throws Exception{
        WebDriverWait wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(buttonShopForAPlan));
        clickOnElement(buttonShopForAPlan);
        wait.until(ExpectedConditions.elementToBeClickable(buttonMedicare));
        clickOnElement(buttonMedicare);

        wait.until(ExpectedConditions.visibilityOfAllElements(submenuMedicare.findElements(By.cssSelector(webElementsSubmenuMedicareItems))));
        List<WebElement> submenuItems = submenuMedicare.findElements(By.cssSelector(webElementsSubmenuMedicareItems));
        int actualSubmenuItemCount = submenuItems.size();
        System.out.println("Counted items within 'Medicare' submenu: "+actualSubmenuItemCount);

        int [] expectedCountMedicareSubmenuArray = dataReader.fileReaderIntegerXSSF(System.getProperty(
                "user.dir") + "\\src\\main\\resources\\AetnaHomepage_ExpectedElements.xlsx", "Medicare Submenu Count");
        int expectedCountMedicareSubmenu = expectedCountMedicareSubmenuArray[0];

        String [] expectedNamesMedicareSubmenuArray = dataReader.fileReaderStringXSSF(System.getProperty(
                "user.dir") + "\\src\\main\\resources\\AetnaHomepage_ExpectedElements.xlsx", "Medicare Submenu Names");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualSubmenuItemCount, expectedCountMedicareSubmenu, "'MEDICARE' SUBMENU ITEM COUNT DOES NOT MATCH");

        for (int i=0; i<submenuItems.size(); i++){
            System.out.println(submenuItems.get(i).getText());
            softAssert.assertEquals(submenuItems.get(i).getText(), expectedNamesMedicareSubmenuArray[i], "LIST ITEM AT INDEX "+i+" IN 'MEDICARE' SUBMENU DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 7 - Validate "Shop for a plan" header dropdown - 'Medicare' submenu URLs
     * 1 - Navigate to http://aetna.com
     * 2 - Click on "Shop for a plan" in header
     * 3 - Under 'Medicare' option, verify the URLs of submenu items
     */
    public void validateMedicareSubmenuItemURLs() throws Exception{
        WebDriverWait wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(buttonShopForAPlan));
        clickOnElement(buttonShopForAPlan);
        wait.until(ExpectedConditions.elementToBeClickable(buttonMedicare));
        clickOnElement(buttonMedicare);
        System.out.println("Clicked "+buttonMedicare.getText()+" Submenu Button");

        wait.until(ExpectedConditions.visibilityOfAllElements(submenuMedicare.findElements(By.cssSelector(webElementsSubmenuMedicareItems))));
        List<WebElement> submenuItems = submenuMedicare.findElements(By.cssSelector(webElementsSubmenuMedicareItems));

        String [] expectedURLMedicareSubmenuArray = dataReader.fileReaderStringXSSF(System.getProperty(
                "user.dir") + "\\src\\main\\resources\\AetnaHomepage_ExpectedElements.xlsx", "Medicare Submenu URL");

        SoftAssert softAssert = new SoftAssert();

        for (int i=0; i<submenuItems.size(); i++) {
            String actualURL = submenuItems.get(i).getAttribute("href");
            System.out.println(actualURL);
            softAssert.assertEquals(actualURL, expectedURLMedicareSubmenuArray[i], "URL FOR LIST ITEM IN 'MEDICARE' SUBMENU AT INDEX "+i
                    +" " + "DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 8 - Validate "Shop for a plan" header dropdown - 'Health Coverage' submenu count & names
     * 1 - Navigate to http://aetna.com
     * 2 - Click on "Shop for a plan" in header
     * 3 - Under 'Health Coverage' option, verify the count of submenu items & their names
     */
    public void validateHealthCoverageSubmenuItemCountAndNames() throws Exception{
        WebDriverWait wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(buttonShopForAPlan));
        clickOnElement(buttonShopForAPlan);

        wait.until(ExpectedConditions.elementToBeClickable(buttonHealthCoverage));
        clickOnElement(buttonHealthCoverage);

        List<WebElement> submenuItems = submenuHealthCoverage.findElements(By.cssSelector(webElementsSubmenuHealthCoverageItems));
        int actualSubmenuItemCount = submenuItems.size();
        System.out.println("Counted items within 'Health Coverage' submenu: "+actualSubmenuItemCount);

        int [] expectedCountHealthCoverageSubmenuArray = dataReader.fileReaderIntegerXSSF(System.getProperty(
                "user.dir") + "\\src\\main\\resources\\AetnaHomepage_ExpectedElements.xlsx", "Health Coverage Submenu" +
                " Count");
        int expectedCountHealthCoverageSubmenu = expectedCountHealthCoverageSubmenuArray[0];

        String [] expectedNamesHealthCoverageSubmenuArray = dataReader.fileReaderStringXSSF(System.getProperty(
                "user.dir") + "\\src\\main\\resources\\AetnaHomepage_ExpectedElements.xlsx", "Health Coverage Submenu Names");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualSubmenuItemCount, expectedCountHealthCoverageSubmenu, "'HEALTH COVERAGE' SUBMENU ITEM COUNT DOES NOT MATCH");

        for (int i=0; i<submenuItems.size(); i++){
            System.out.println(submenuItems.get(i).getText());
            softAssert.assertEquals(submenuItems.get(i).getText(), expectedNamesHealthCoverageSubmenuArray[i], "LIST ITEM AT INDEX "+i+" IN 'HEALTH COVERAGE' SUBMENU DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 9 - Validate "Shop for a plan" header dropdown - 'Health Coverage' submenu URLs
     * 1 - Navigate to http://aetna.com
     * 2 - Click on "Shop for a plan" in header
     * 3 - Under 'Health Coverage' option, verify the URLs of submenu items
     */
    public void validateHealthCoverageSubmenuItemURLs() throws Exception{
        WebDriverWait wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(buttonShopForAPlan));
        clickOnElement(buttonShopForAPlan);

        wait.until(ExpectedConditions.elementToBeClickable(buttonHealthCoverage));
        clickOnElement(buttonHealthCoverage);
        System.out.println("Clicked "+buttonHealthCoverage.getText()+" Submenu Button");

        List<WebElement> submenuItems = submenuHealthCoverage.findElements(By.cssSelector(webElementsSubmenuHealthCoverageItems));

        String [] expectedURLHealthCoverageSubmenuArray = dataReader.fileReaderStringXSSF(System.getProperty(
                "user.dir") + "\\src\\main\\resources\\AetnaHomepage_ExpectedElements.xlsx", "Health Coverage Submenu URL");

        SoftAssert softAssert = new SoftAssert();
        for (int i=0; i<submenuItems.size(); i++) {
            String actualURL = submenuItems.get(i).getAttribute("href");
            System.out.println(actualURL);
            softAssert.assertEquals(actualURL, expectedURLHealthCoverageSubmenuArray[i], "URL FOR LIST ITEM IN 'HEALTH COVERAGE' SUBMENU AT INDEX "+i+
                    " DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 10 - Validate "Shop for a plan" header dropdown - 'Dental, vision and supplemental' submenu count & names
     * 1 - Navigate to http://aetna.com
     * 2 - Click on "Shop for a plan" in header
     * 3 - Under 'Dental, vision and supplemental' option, verify the count of submenu items & their names
     */
    public void validateDentalVisionSupplementalSubmenuItemCountAndNames() throws Exception{
        WebDriverWait wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(buttonShopForAPlan));
        clickOnElement(buttonShopForAPlan);

        wait.until(ExpectedConditions.elementToBeClickable(buttonDentalVisionSupplemental));
        clickOnElement(buttonDentalVisionSupplemental);

        List<WebElement> submenuItems = submenuDentalVisionSupplemental.findElements(By.cssSelector(webElementsSubmenuDentalVisionSupplementalItems));
        int actualSubmenuItemCount = submenuItems.size();
        System.out.println("Counted items within 'Dental, Vision and supplemental' submenu: "+actualSubmenuItemCount);

        int [] expectedSubmenuCountArray = dataReader.fileReaderIntegerXSSF(System.getProperty("user.dir")+"\\src" +
                "\\main\\resources\\AetnaHomepage_ExpectedElements.xlsx", "DVS Submenu Count");
        int expectedSubmenuCount = expectedSubmenuCountArray[0];

        String [] expectedSubmenuNamesArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir")+"\\src" +
                "\\main\\resources\\AetnaHomepage_ExpectedElements.xlsx", "DVS Submenu Names");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualSubmenuItemCount, expectedSubmenuCount, "'DENTAL, VISION AND SUPPLEMENTAL' SUBMENU ITEM COUNT " +
                "DOES NOT MATCH");

        for (int i=0; i<submenuItems.size(); i++){
            System.out.println(expectedSubmenuNamesArray[i]);
            softAssert.assertEquals(submenuItems.get(i).getText(), expectedSubmenuNamesArray[i], "LIST ITEM AT INDEX "+i+" IN 'DENTAL, " +
                    "VISION AND SUPPLEMENTAL' SUBMENU DOES NOT MATCH");
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
    public void validateLoginButton() throws IOException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(buttonLogin));
        clickOnElement(buttonLogin);
        String actualLoginPageURL = driver.getCurrentUrl();
        System.out.println("Login Page URL: "+actualLoginPageURL);

        String[] expectedLoginPageURLArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir")+"\\src" +
                "\\main\\resources\\AetnaHomepage_ExpectedElements.xlsx", "Login Page URL");
        String expectedLoginPageURL = expectedLoginPageURLArray[0];
        System.out.println("EXPECTED URL: "+expectedLoginPageURL);

        Assert.assertEquals(actualLoginPageURL, expectedLoginPageURL, "WAS NOT NAVIGATED TO LOGIN PAGE (URL DOES NOT MATCH)");
    }


    /**
     * BODY
     */
    /**
     * Test Case 17 - Validate 'Download Attain' button navigates us to Download Attain page
     * 1 - Navigate to http://aetna.com
     * 2 - Verify the name of each customer identifier within the customer identifier boxes
     * 3 - Verify URL for each customer identifier box
     */
    public void validateCustomerIdentifierSectionNamesAndURLs(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(sectionCustomerIdentifier.findElements(By.cssSelector(webElementsCustomerIdentifierBoxes))));

        List<WebElement> customerIdentifierBoxes = sectionCustomerIdentifier.findElements(By.cssSelector(webElementsCustomerIdentifierBoxes));
        String [] actualCustomerIdentifierNames = new String[customerIdentifierBoxes.size()];
        String [] actualCustomerIdentifierURLs = new String[customerIdentifierBoxes.size()];

        SoftAssert softAssert = new SoftAssert();
        for (int i=0; i<customerIdentifierBoxes.size(); i++){
            actualCustomerIdentifierNames[i] = customerIdentifierBoxes.get(i).getAttribute("data-analytics-name");
            System.out.println(actualCustomerIdentifierNames[i]);
            softAssert.assertEquals(actualCustomerIdentifierNames[i], expectedElementsCustomerIdentifierNames[i], "CUSTOMER IDENTIFIER NAME IN BOX "+i+" DOES NOT MATCH");

            actualCustomerIdentifierURLs[i] = customerIdentifierBoxes.get(i).getAttribute("href");
            System.out.println(actualCustomerIdentifierURLs[i]);
            softAssert.assertEquals(actualCustomerIdentifierURLs[i], expectedElementsCustomerIdentifierURLs[i], "CUSTOMER IDENTIFIER URL IN BOX "+i+" DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 18 - Validate Miscellaneous Grid Boxes
     * 1 - Navigate to http://aetna.com
     * 2 - Verify the name of each miscellaneous grid item (Health News, About Us, Careers)
     * 3 - Verify the URL of each miscellaneous grid item
     */
    public void validateMiscellaneousGridBoxNamesAndURLs(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(sectionMiscellaneousGrid.findElements(By.cssSelector(webElementsMiscellaneousGridBoxesNames))));

        List<WebElement> miscellaneousGridBoxesNames = sectionMiscellaneousGrid.findElements(By.cssSelector(webElementsMiscellaneousGridBoxesNames));
        String [] actualMiscellaneousGridBoxNames = new String[miscellaneousGridBoxesNames.size()];

        List<WebElement> miscellaneousGridBoxesURLs = sectionMiscellaneousGrid.findElements(By.cssSelector(webElementsMiscellaneousGridBoxesURLs));
        String [] actualMiscellaneousGridBoxURLs = new String[miscellaneousGridBoxesURLs.size()];

        SoftAssert softAssert = new SoftAssert();
        for (int i=0; i<miscellaneousGridBoxesNames.size(); i++){
            actualMiscellaneousGridBoxNames[i] = miscellaneousGridBoxesNames.get(i).getText();
            System.out.println(actualMiscellaneousGridBoxNames[i]);
            softAssert.assertEquals(actualMiscellaneousGridBoxNames[i], expectedElementsMiscellaneousGridBoxesNames[i], "MISCELLANEOUS GRID BOX NAME IN BOX "+i+" DOES NOT MATCH");

            actualMiscellaneousGridBoxURLs[i] = miscellaneousGridBoxesURLs.get(i).getAttribute("href");
            System.out.println(actualMiscellaneousGridBoxURLs[i]);
            softAssert.assertEquals(actualMiscellaneousGridBoxURLs[i], expectedElementsMiscellaneousGridBoxesURLs[i], "MISCELLANEOUS GRID BOX URL IN BOX "+i+" DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 19 - Validate Social Media Wrapper - Count
     * 1 - Navigate to http://aetna.com
     * 2 - Verify there are 5 social media icons in the footer
     */
    public void validateSocialMediaIconCount(){
//        WebDriverWait wait = new WebDriverWait(driver, 10);
        scrollToElementJScript(wrapperSocialMedia);

        List<WebElement> socialMediaList = wrapperSocialMedia.findElements(By.cssSelector(webElementsIconsSocialMedia));
        int actualSocialMediaIconCount = socialMediaList.size();
        System.out.println("Number of Social Media icons counted: "+actualSocialMediaIconCount);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualSocialMediaIconCount, expectedElementIconSocialMediaCount, "NUMBER OF SOCIAL MEDIA ICONS DO NOT MATCH");
        softAssert.assertAll();
    }


    /**
     * Test Case 20 - Validate Social Media Wrapper - Names & URLs
     * 1 - Navigate to http://aetna.com
     * 2 - Verify each social media icon's name & URL
     */
    public void validateSocialMediaIconNamesAndURLs(){
        scrollToElementJScript(wrapperSocialMedia);

        List<WebElement> socialMediaList = wrapperSocialMedia.findElements(By.cssSelector(webElementsIconsSocialMedia));
        String[] actualSocialMediaIconNames = new String[socialMediaList.size()];
        String[] actualSocialMediaIconURLs = new String[socialMediaList.size()];

        SoftAssert softAssert = new SoftAssert();
        for (int i=0; i<socialMediaList.size(); i++){
            actualSocialMediaIconNames[i] = socialMediaList.get(i).getAttribute("aria-label");
            System.out.println(actualSocialMediaIconNames[i]);

            actualSocialMediaIconURLs[i] = socialMediaList.get(i).getAttribute("href");
            System.out.println(actualSocialMediaIconURLs[i]);

            softAssert.assertEquals(actualSocialMediaIconNames[i], expectedElementsIconSocialMediaNames[i], "SOCIAL MEDIA ICON NAME AT INDEX "+i+" DOES NOT MATCH");
            softAssert.assertEquals(actualSocialMediaIconURLs[i], expectedElementsIconSocialMediaURLs[i], "SOCIAL MEDIA ICON URL AT INDEX "+i+" DOES NOT MATCH");
        }
        softAssert.assertAll();
    }
}
