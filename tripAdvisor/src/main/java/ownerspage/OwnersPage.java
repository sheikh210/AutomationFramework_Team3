package ownerspage;

import commonAPI.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
     *
     * Test Case 3 - Validate Navigation to Each Link Under "Products" Dropdown
     */
    public void hoverOverProductsDropdown() {
        navigateToOwnersPage();
        hoverOverDropdown(hoverDropdownProducts, dropdownBoxProducts);
    }

    /**
     * Test Case 4 - Validate "Reviews" Dropdown List Items
     *
     * Test Case 5 - Validate Navigation to Each Link Under "Reviews" Dropdown
     */
    public void hoverOverReviewsDropdown() {
        navigateToOwnersPage();
        hoverOverDropdown(hoverDropdownReviews, dropdownBoxReviews);
    }


    /**
     * Test Case 6 - Validate "Marketing Tools" Dropdown List Items
     *
     * Test Case 7 - Validate Navigation to Each Link Under "Marketing Tools" Dropdown
     */
    public void hoverOverMarketingToolsDropdown() {
        navigateToOwnersPage();
        hoverOverDropdown(hoverDropdownMarketingTools, dropdownBoxMarketingTools);
    }

    /**
     * Test Case 8 - Validate "Help" Dropdown List Items
     *
     * Test Case 9 - Validate Navigation to Each Link Under "Help" Dropdown
     */
    public void hoverOverHelpDropdown() {
        navigateToOwnersPage();
        hoverOverDropdown(hoverDropdownHelp, dropdownBoxHelp);
    }





    /**
     * HELPER METHODS
     */

    // Hover over dropdown and make sure it is visible
    public void hoverOverDropdown(WebElement elementToHover, WebElement visibleElement){
        wait.until(ExpectedConditions.visibilityOf(elementToHover));

        try {
            mouseHover(elementToHover);
            isElementPresent(visibleElement);
            System.out.println("Hovered over dropdown\n");
        } catch (Exception e) {
            e.getMessage();
            try {
                driver.navigate().refresh();
                System.out.println("Couldn't hover over dropdown --- Refreshing page\n");
                wait.until(ExpectedConditions.visibilityOf(elementToHover));
                mouseHoverJScript(elementToHover);
                isElementPresent(visibleElement);
            } catch (Exception e1) {
                e.getMessage();
            }
        }
    }
}
