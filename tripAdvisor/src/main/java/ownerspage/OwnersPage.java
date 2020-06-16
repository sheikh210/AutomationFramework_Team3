package ownerspage;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DataReader;

import java.io.IOException;

import static ownerspage.OwnersPageElements.*;

public class OwnersPage extends WebAPI {

    WebDriverWait wait = new WebDriverWait(driver, 10);

    @FindBy(css = webElementButtonOwnersPageButton)
    private WebElement buttonOwnersPage;

    @FindBy(css = webElementImageOwnersPageBackground)
    private WebElement imageOwnersPageBackground;

    @FindBy(css = webElementHeaderBar)
    private WebElement headerBar;

    @FindBy(css = webElementHoverDropdownProducts)
    private WebElement hoverDropdownProducts;

    @FindBy(css = webElementDropdownBoxProducts)
    private WebElement dropdownBoxProducts;

    @FindBy(css = webElementHoverDropdownReviews)
    private WebElement hoverDropdownReviews;

    @FindBy(css = webElementDropdownBoxReviews)
    private WebElement dropdownBoxReviews;

    @FindBy(css = webElementHoverDropdownMarketingTools)
    private WebElement hoverDropdownMarketingTools;

    @FindBy(css = webElementDropdownBoxMarketingTools)
    private WebElement dropdownBoxMarketingTools;

    @FindBy(css = webElementHoverDropdownHelp)
    private WebElement hoverDropdownHelp;

    @FindBy(css = webElementDropdownBoxHelp)
    private WebElement dropdownBoxHelp;

    @FindBy(xpath = webElementInputBoxLocation)
    private WebElement inputBoxLocation;

    @FindBy(className = webElementResultsBoxLocation)
    private WebElement resultsBoxLocation;

    @FindBy(css = webElementButtonFirstResultLocation)
    private WebElement buttonFirstResultLocation;

    @FindBy(xpath = webElementInputBoxBusinessName)
    private WebElement inputBoxBusinessName;

    @FindBy (className = webElementResultsBoxBusinessName)
    private WebElement resultsBoxBusinessName;

    @FindBy (css = webElementButtonThirdResultBusinessName)
    private WebElement buttonThirdResultBusinessName;

    @FindBy(className = webElementButtonSearch)
    private WebElement buttonSearch;

    @FindBy (css = webElementClaimPropertyBox)
    private WebElement claimPropertyBox;


    private final String searchTermLocationBox = "New York";
    private final String searchTermBusinessNameBox = "Museum";


    /**
     * Test Case 1 - Validate Header Bar - Names
     */
    public void navigateToOwnersPage() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonOwnersPage));
        clickOnElement(buttonOwnersPage);
        wait.until(ExpectedConditions.visibilityOf(imageOwnersPageBackground));
        if (imageOwnersPageBackground.isDisplayed()) {
            System.out.println("Navigated to Trip Advisor Owners Page\n");
        } else {
            System.out.println("COULD NOT NAVIGATE TO TRIP ADVISOR OWNERS PAGE\n");
        }
    }

    /**
     * Test Case 2 - Validate "Products" Dropdown List Items
     * Test Case 3 - Validate Navigation to Each Link Under "Products" Dropdown
     */
    public void hoverOverProductsDropdown() {
        navigateToOwnersPage();
        hoverOverDropdown(hoverDropdownProducts);
    }

    /**
     * Test Case 4 - Validate "Reviews" Dropdown List Items
     * Test Case 5 - Validate Navigation to Each Link Under "Reviews" Dropdown
     */
    public void hoverOverReviewsDropdown() {
        navigateToOwnersPage();
        hoverOverDropdown(hoverDropdownReviews);
    }


    /**
     * Test Case 6 - Validate "Marketing Tools" Dropdown List Items
     * Test Case 7 - Validate Navigation to Each Link Under "Marketing Tools" Dropdown
     */
    public void hoverOverMarketingToolsDropdown() {
        navigateToOwnersPage();
        hoverOverDropdown(hoverDropdownMarketingTools);
    }

    /**
     * Test Case 8 - Validate "Help" Dropdown List Items
     * Test Case 9 - Validate Navigation to Each Link Under "Help" Dropdown
     */
    public void hoverOverHelpDropdown() {
        navigateToOwnersPage();
        hoverOverDropdown(hoverDropdownHelp);
    }

    /**
     * Test Case 10 - Validate "Location" Search Box Functionality
     * Test Case 11 - Validate "Location" Search Results
     */
    public void sendKeysToLocationSearchBox() {
        navigateToOwnersPage();
        wait.until(ExpectedConditions.elementToBeClickable(inputBoxLocation));
        try {
            Thread.sleep(1000);
            inputBoxLocation.sendKeys(searchTermLocationBox);
            System.out.println("Typed " + "\"" + searchTermLocationBox + "\" in Location input field\n");
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }

    /**
     * Test Case 12 - Validate "Location" Result Select
     */
    public String selectAndVerifySearchResultLocationSearchBox() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonFirstResultLocation));
        clickOnElement(buttonFirstResultLocation);
        System.out.println("Clicked search result (Location Input Field)\n");

        wait.until(ExpectedConditions.attributeContains(inputBoxLocation, "value", searchTermLocationBox));
        String actual = inputBoxLocation.getAttribute("value");
        System.out.println("Location input field contains text: "+ "\"" + actual + "\"\n");

        return actual;
    }

    /**
     * Test Case 13 - Validate "Business Name" Search Box Functionality
     * Test Case 14 - Validate "Business Name" Search Results
     */
    public void sendKeysToBusinessNameSearchBox() {
        sendKeysToLocationSearchBox();
        selectAndVerifySearchResultLocationSearchBox();
        inputBoxBusinessName.sendKeys(searchTermBusinessNameBox);
        System.out.println("Typed " + searchTermBusinessNameBox + "in Business Name input field");

        wait.until(ExpectedConditions.visibilityOf(resultsBoxBusinessName));
    }

    /**
     * Test Case 15 - Validate "Business Name" Result Select
     */
    public void selectSearchResultBusinessNameSearchBox() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonThirdResultBusinessName));
        clickOnElement(buttonThirdResultBusinessName);
        System.out.println("Clicked search result (Business Name Input Field)\n");

        wait.until(ExpectedConditions.visibilityOf(claimPropertyBox));
    }

    public String verifyNavigationToClaimListingPage() {
        String pageTitle = null;

        if (claimPropertyBox.isDisplayed()) {
            pageTitle = driver.getTitle();
            System.out.println("Navigated to: " + pageTitle + "\n");
        } else {
            pageTitle = driver.getTitle();
            System.out.println("NAVIGATED TO INCORRECT PAGE: " + pageTitle + "\n");
        }
        return pageTitle;
    }



    /**
     * HELPER METHODS
     */

    // Hover over dropdown and make sure it is visible
    public void hoverOverDropdown(WebElement elementToHover) {
        wait.until(ExpectedConditions.visibilityOf(elementToHover));

        try {
            Thread.sleep(1000);
            mouseHover(elementToHover);
            System.out.println("Hovered over dropdown\n");
        } catch (InterruptedException e) {
            try {
                driver.navigate().refresh();
                System.out.println("Couldn't hover over dropdown --- Refreshing page\n");

                wait.until(ExpectedConditions.visibilityOf(elementToHover));
                Thread.sleep(1000);

                mouseHoverJScript(elementToHover);
            } catch (Exception e1) {
                e.getMessage();
            }
        }
    }
}
