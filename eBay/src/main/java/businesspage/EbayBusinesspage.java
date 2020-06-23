package businesspage;

import static businesspage.EbayBusinesspageElements.*;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DataReader;

import java.io.IOException;
import java.util.List;

public class EbayBusinesspage extends WebAPI {
    WebDriverWait wait = new WebDriverWait(driver, 10);

    //Case 2 Elements
    @FindBy(xpath = webElementClickBusinessAndIndustrial)
    public WebElement clickBusinessAndIndustrial;

    //-----------------------------------------------------------------------
    //Case 3 Elements
    @FindBy(xpath = webElementClickMyEbayButton)
    public WebElement clickMyEbayButton;

    //-----------------------------------------------------------------------
    //Case 4 Elements
    @FindBy(xpath = webElementClickCategoryDropDownButton)
    public WebElement clickCategoryDropDownButton;

    //-----------------------------------------------------------------------
    //Case 5 Elements
    @FindBy(xpath = webElementClickAgricultureDropDownButton)
    public WebElement clickAgricultureDropDownButton;

    @FindBy(xpath = webElementClickBuildingMaterialDropDownButton)
    public WebElement clickBuildingMaterialDropDownButton;

    //-----------------------------------------------------------------------
    //Case 6 Elements
    @FindBy(xpath = webElementClickBuildingMaterialsAndSuppliesPageButton)
    public WebElement clickBuildingMaterialsAndSuppliesPageButton;

    //-----------------------------------------------------------------------
    //Case 7 Elements
    @FindBy(xpath = webElementClickRightSwipeButton)
    public WebElement clickRightSwipeButton;

    //-----------------------------------------------------------------------
    //Case 8 Elements
    @FindBy(xpath = webElementClickSeeAllButton)
    public WebElement clickSeeAllButton;

    @FindBy(xpath = webElementClickAgilentButton)
    public WebElement clickAgilentButton;

    @FindBy(xpath = webElementClickDaytonButton)
    public WebElement clickDaytonButton;

    @FindBy(xpath = webElementClickQuantumButton)
    public WebElement clickQuantumButton;

    @FindBy(xpath = webElementClickApplyButton)
    public WebElement clickApplyButton;

    //-----------------------------------------------------------------------
    //Case 9 Elements
    @FindBy(xpath = webElementClickDeliverySeeAllButton)
    public WebElement clickDeliverySeeAllButton;

    @FindBy(xpath = webElementClick3DayShipping)
    public WebElement click3DayShipping;

    @FindBy(xpath = webElementClickApply)
    public WebElement clickApply;
    //-----------------------------------------------------------------------
    //Case 10 Elements
    @FindBy(xpath = webElementClickMinimumPriceField)
    public WebElement clickMinimumPriceField;

    @FindBy(xpath = webElementClickMaximumPriceField)
    public WebElement clickMaximumPriceField;

    @FindBy(xpath = webElementClickSubmitPriceRangeButton)
    public WebElement clickSubmitPriceRangeButton;
    //-----------------------------------------------------------------------
    //Case 11 Elements
    @FindBy(xpath = webElementClickWithinButton)
    public WebElement clickWithinButton;

    @FindBy(xpath = webElementClickMilesButton)
    public WebElement clickMilesButton;

    @FindBy(xpath = webElementClick100MilesButton)
    public WebElement click100MilesButton;

    @FindBy(xpath = webElementClickZipCodeBar)
    public WebElement clickZipCodeBar;

    @FindBy(xpath = webElementClickSubmitPriceRangeButton2)
    public WebElement clickSubmitPriceRangeButton2;
    //-----------------------------------------------------------------------
    //Case 12 Elements
    @FindBy(xpath = webElementClickSeeAllButton2)
    public WebElement clickSeeAllButton2;

    @FindBy(xpath = webElementClickReturnsAccepted)
    public WebElement clickReturnsAccepted;

    @FindBy(xpath = webElementClickApply2)
    public WebElement clickApply2;
    //-----------------------------------------------------------------------
    //Case 13 Elements
    @FindBy(xpath = webElementClickSearchBar)
    public WebElement clickSearchBar;

    @FindBy(xpath = webElementClickSearchButton)
    public WebElement clickSearchButton;

    //-----------------------------------------------------------------------
    //Case 14 Elements
    @FindBy(xpath = webElementClickEllipseMenuButton)
    public WebElement clickEllipseMenuButton;

    @FindBy(xpath = webElementClickGalleryView)
    public WebElement clickGalleryView;
    //-----------------------------------------------------------------------
    //Case 15 Elements
    @FindBy(xpath = webElementClickBestMatchButton)
    public WebElement clickBestMatchButton;

    //-----------------------------------------------------------------------
    //Case 16 Elements
    @FindBy(xpath = webElementClickConditionBox)
    public WebElement clickConditionBox;

    @FindBy(xpath = webElementClickNewButton)
    public WebElement clickNewButton;
    //-----------------------------------------------------------------------
    //Case 17 Elements
    @FindBy(xpath = webElementClickAllListings)
    public WebElement clickAllListings;

    @FindBy(xpath = webElementClickAcceptsOffers)
    public WebElement clickAcceptsOffers;

    @FindBy(xpath = webElementClickAuction)
    public WebElement clickAuction;

    @FindBy(xpath = webElementClickBuyItNow)
    public WebElement clickBuyItNow;
    //-----------------------------------------------------------------------
    //Case 18 Elements
    @FindBy(xpath = webElementClickRightArrow)
    public WebElement clickRightArrow;

    //-----------------------------------------------------------------------
    //Case 19 Elements
    @FindBy(xpath = webElementClickItemsPerPageButton)
    public WebElement clickItemsPerPageButton;

    @FindBy(xpath = webElementClick96)
    public WebElement click96;
    //-----------------------------------------------------------------------
    //Case 20 Elements
    @FindBy(xpath = webElementClickXButton)
    public WebElement clickXButton;

    DataReader dataReader = new DataReader();

    /**
     * >>>Test Case 1 - Go to Home Page<<<
     * Open Chrome Browser
     * Type Url >>https://www.ebay.com/<<
     * Wait until home page is landing
     * Get Home Page Title
     */
    public void goHomePage() throws InterruptedException {
        sleepFor(3);
        String actualURL = getCurrentPageUrl();
        System.out.println("URL:" + actualURL);

        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title:" + actualTitle);
    }

    /**
     * >>>Test Case 2 - Go to Business Page<<<
     * Click Business And Industrial
     * Wait until page is landing
     * Get Page Title
     */

    public String goToBusinessPage() throws InterruptedException, IOException {
        sleepFor(3);
        clickBusinessAndIndustrial.click();
        sleepFor(4);

        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title:" + actualTitle);

        return actualTitle;
    }

    /**
     * >>>Test Case 3 - Check My Ebay Button<<<
     * Click My Ebay Button
     * Expand it
     * Validate 9 subcategories are visible
     */
    public int myEbayDropDownMenu() throws InterruptedException, IOException {
        goToBusinessPage();
        waitUntilClickAble(By.xpath(webElementClickMyEbayButton));
        clickMyEbayButton.click();
        sleepFor(3);

        List<WebElement> myEbayDropDown = driver.findElements(By.xpath(webElementClickMyEbayButton));
        return myEbayDropDown.size();
    }

    /**
     * >>>Test Case 4 - Check Business & Industrial Button<<<
     * Click Category DropDown Button on search bar
     * Expand it
     * Validate 34 subcategories are visible
     */
    public int checkIndustrial() throws IOException, InterruptedException {
        goToBusinessPage();
        waitUntilClickAble(By.xpath(webElementClickCategoryDropDownButton));
        clickCategoryDropDownButton.click();

        List<WebElement> categoryDropDownButton = driver.findElements(By.xpath(webElementClickCategoryDropDownButton));
        return categoryDropDownButton.size();
    }

    /**
     * >>>Test Case 5 - SideBar DropDown button<<<
     * Click Agriculture DropDown Button
     * Expand it
     * Click Building Material DropDown Button
     * Validate 17 Subcategories are visible
     */
    public int sideBar() throws IOException, InterruptedException {
        goToBusinessPage();
        waitUntilClickAble(By.xpath(webElementClickAgricultureDropDownButton));
        clickAgricultureDropDownButton.click();

        waitUntilClickAble(By.xpath(webElementClickBuildingMaterialDropDownButton));
        clickBuildingMaterialDropDownButton.click();

        List<WebElement> materialDropDownButton = driver.findElements(By.xpath(webElementClickBuildingMaterialDropDownButton));
        return materialDropDownButton.size();
    }

    /**
     * >>>Test Case 6 - Go To "Building Materials & Supplies Page"<<<
     * Click Building Material DropDown Button
     * Expand it
     * Click Building Materials And Supplies Page Button
     */
    public String goToBuildingMaterialsPage() throws IOException, InterruptedException {
        goToBusinessPage();
        waitUntilClickAble(By.xpath(webElementClickBuildingMaterialDropDownButton));
        clickBuildingMaterialDropDownButton.click();
        sleepFor(3);

        clickBuildingMaterialsAndSuppliesPageButton.click();

        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title:" + actualTitle);

        return actualTitle;
    }

    /**
     * >>>Test Case 7 - Check Swipe Button<<<
     * Scroll down
     * Find "Save on Building Materials & Supplies"
     * Click Right Swipe Button
     * Wait until expected item visible
     */
    public void checkSwipeButton() throws IOException, InterruptedException {
        goToBuildingMaterialsPage();
        sleepFor(3);
        clickRightSwipeButton.click();
    }

    /**
     * >>>Test Case 8 - Check Brand Box<<<
     * Find Brand Box on the left side bar
     * Click See All Button
     * Click Agilent Button
     * Click Dayton Button
     * Click Quantum Button
     * Click Apply Button
     */
    public void checkBrandBox() throws IOException, InterruptedException {
        goToBuildingMaterialsPage();
        sleepFor(4);
        clickSeeAllButton.click();
        sleepFor(2);
        clickAgilentButton.click();
        sleepFor(2);
        clickDaytonButton.click();
        sleepFor(2);
        clickQuantumButton.click();
        sleepFor(2);
        clickApplyButton.click();
    }

    /**
     * >>>Test Case 9 - Check Guaranteed Delivery Box<<<
     * Find Guaranteed Delivery Box on the left side bar
     * Click Delivery See All Button
     * Click 3 Day Shipping
     * Click Apply
     */
    public void checkDeliveryBox() throws IOException, InterruptedException {
        checkBrandBox();
        sleepFor(2);
        clickDeliverySeeAllButton.click();
        sleepFor(2);
        click3DayShipping.click();
        sleepFor(2);
        clickApply.click();
    }

    /**
     * >>>Test Case 10 - Check Price Box<<<
     * Find Price Box on the left side bar
     * Click Minimum Price Field
     * Type 15$
     * Click Maximum Price Field
     * Type 50$
     * Click Submit Price Range Button
     */
    public void checkPriceBox() throws IOException, InterruptedException {
        checkDeliveryBox();
        sleepFor(3);
        clickMinimumPriceField.sendKeys("15");
        sleepFor(3);
        clickMaximumPriceField.sendKeys("50");
        sleepFor(3);
        clickSubmitPriceRangeButton.click();
    }

    /**
     * >>>Test Case 11 - Check Item Location Box<<<
     * Click Within Button
     * Click Miles Button
     * Click 100 Miles Button
     * Click Zip Code Bar
     * Type 11223
     * Click Submit Price Range Button
     */

    public void checkItemLocation() throws IOException, InterruptedException {
        checkPriceBox();
        sleepFor(3);
        clickWithinButton.click();
        sleepFor(2);
        clickMilesButton.click();
        sleepFor(2);
        click100MilesButton.click();
        sleepFor(2);
        clickZipCodeBar.sendKeys("11223");
        sleepFor(2);
        clickSubmitPriceRangeButton2.click();
    }

    /**
     * >>>Test Case 12 - Check Show Only Box<<<
     * Click See All Button 2
     * Click Returns Accepted
     * Wait Until Page is Landing
     */
    public void checkShowOnlyBox() throws IOException, InterruptedException {
        checkItemLocation();
        sleepFor(2);
        clickSeeAllButton2.click();
        sleepFor(2);
        clickReturnsAccepted.click();
        sleepFor(2);
        clickApply2.click();
        sleepFor(2);
    }

    /**
     * >>>Test Case 13 - Check Search Bar<<<
     * Click Search Bar On Header
     * Type Wood
     * Click Search
     */

    public void checkSearchBar() throws IOException, InterruptedException {
        goToBuildingMaterialsPage();
        sleepFor(4);
        clickSearchBar.sendKeys("Wood");
        sleepFor(2);
        clickSearchButton.click();
    }

    /**
     * >>>Test Case 14 - Change View Of Page<<<
     * Click Ellipse Menu Button
     * Expand It
     * Click Gallery View
     */
    public void pageView() throws IOException, InterruptedException {
        checkSearchBar();
        sleepFor(4);
        clickEllipseMenuButton.click();
        sleepFor(2);
        clickGalleryView.click();
    }

    /**
     * >>>Test Case 15 - Best Match Bar<<<
     * Click Best Match Button
     * Verify 6 Options Are Available
     */
    public int bestMatchBar() throws IOException, InterruptedException {
        checkSearchBar();
        waitUntilClickAble(By.xpath(webElementClickBestMatchButton));
        clickBestMatchButton.click();

        List<WebElement> bestMatchBar = driver.findElements(By.xpath(webElementClickBestMatchButton));
        return bestMatchBar.size();

    }

    /**
     * >>>Test Case 16 - Condition Box<<<
     * Click Condition Box
     * Verify 3 options are available
     * Click New Button
     */
    public int conditionBox() throws IOException, InterruptedException {
        checkSearchBar();
        sleepFor(4);
        clickConditionBox.click();
        sleepFor(3);
        clickNewButton.click();
        sleepFor(2);

        List<WebElement> conditionBarList = driver.findElements(By.xpath(webElementClickConditionBox));

        return conditionBarList.size();
    }

    /**
     * >>>Test Case 17 - Buy It Now Option<<<
     * Verify 4 Sales Options are available
     * Print All names of Sales Options
     * Click Buy It Now
     */
    public int buyItNowOption() throws IOException, InterruptedException {
        conditionBox();
        sleepFor(4);
        clickAllListings.getText();
        sleepFor(2);
        clickAcceptsOffers.getText();
        sleepFor(2);
        clickAuction.getText();
        sleepFor(2);
        clickBuyItNow.getText();
        sleepFor(3);
        clickBuyItNow.click();

        String [] optionArrayList = {clickAllListings.getText(),clickAcceptsOffers.getText(),
                clickAuction.getText(),clickBuyItNow.getText()};
        int optionArrayListSize = optionArrayList.length;

        return optionArrayListSize;
    }

    /**
     * >>>Test Case 18 - Page Swipe Button<<<
     * Scroll down
     * Verify Right Arrow is visible
     * Click Right Arrow 2 times
     */
    public void swipeButton() throws IOException, InterruptedException {
        buyItNowOption();
        waitUntilClickAble(By.xpath(webElementClickRightArrow));

        for(int i=0;i<2;i++) {
            clickRightArrow.click();
        }
    }

    /**
     * >>>Test Case 19 - Verify Items Per Page Options<<<
     * Scroll Down
     * Click Items Per Page
     * Verify 4 Options Available
     * Click 96
     */
    public int itemsPerPage() throws IOException, InterruptedException {
        conditionBox();
        sleepFor(3);
        clickItemsPerPageButton.click();

        List<WebElement> itemsPerPageList = driver.findElements(By.xpath(webElementClickItemsPerPageButton));

        return itemsPerPageList.size();
    }

    /**
     * >>>Test Case 20 - Remove Filter<<<
     * Find Chosen Filter Top side of the Item List
     * Click X button
     */
    public void removeFilter() throws IOException, InterruptedException {
        conditionBox();
        sleepFor(4);
        clickXButton.click();

    }
}
