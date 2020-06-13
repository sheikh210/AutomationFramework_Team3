package travelUpdateCenterPage;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static travelUpdateCenterPage.TravelUpdateCenterPageElements.*;

public class TravelUpdateCenterPage extends WebAPI {

    @FindBy (css = webElementButtonTravelUpdate)
    public WebElement buttonTravelUpdate;

    @FindBy (xpath = webElementButtonTravelUpdateCenter)
    public WebElement buttonTravelUpdateCenter;

    @FindBy (css = webElementMenuTravelUpdateCenterDropdown)
    public WebElement menuTravelUpdateCenterDropdown;

    @FindBy (css = webElementButtonAccordionWaysWereKeepingYouSafe)
    public WebElement buttonAccordionWaysWereKeepingYouSafe;

    @FindBy (css = webElementSubmenuWaysWereKeepingYouSafe)
    public WebElement submenuWaysWereKeepingYouSafe;

    @FindBy (css = webElementButtonAccordionFromDeltaToOurCustomers)
    public WebElement buttonAccordionFromDeltaToOurCustomers;

    @FindBy (css = webElementSubmenuFromDeltaToOurCustomers)
    public WebElement submenuFromDeltaToOurCustomers;

    @FindBy (css = webElementButtonAccordionFlyingWhatYouNeedToKnow)
    public WebElement buttonAccordionFlyingWhatYouNeedToKnow;

    @FindBy (css = webElementSubmenuFlyingWhatYouNeedToKnow)
    public WebElement submenuFlyingWhatYouNeedToKnow;

    WebDriverWait wait = new WebDriverWait(driver, 10);

    /**
     * Test Case 1 - Validate navigation to correct URL
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Verify we are at http://.delta.com/us/en/travel-update-center/ways-we-are-keeping-you-safe/setting-the-standard-for-safer-travel
     */
    public String validateNavigationToTravelUpdateCenterPage() {
        navigateToTravelUpdateCenterPage();
        String url = driver.getCurrentUrl();
        System.out.println("Navigated to: " + url);
        return url;
    }

    /**
     * Test Case 2 - Validate "Travel Update Center Dropdown" List Count
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Click on "Travel Update Center" dropdown (located on header - top left)
     * 5 - Verify dropdown functionality
     * 6 - Verify number of list items
     */
    public int validateTravelUpdateCenterDropdownListCount() {
        int listCount;

        navigateToTravelUpdateCenterPage();
        wait.until(ExpectedConditions.elementToBeClickable(buttonTravelUpdateCenter));
        clickButtonTravelUpdateCenterDropdown();

        boolean flag;
        if (menuTravelUpdateCenterDropdown.isDisplayed()) {
            flag = true;
        } else {
            flag = false;
        }

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(flag, true, "\"TRAVEL UPDATE CENTER\" DROPDOWN DID NOT EXPAND");

        List<WebElement> dropdownList = menuTravelUpdateCenterDropdown.findElements(By.cssSelector(webElementListTravelUpdateCenterDropdown));
        listCount = dropdownList.size();
        System.out.println("Counted " + listCount + " elements in \"Travel Update Center\" dropdown list");

        return listCount;
    }

    /**
     * Test Case 3 - Validate "Travel Update Center Dropdown" List Item Names
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Click on "Travel Update Center" dropdown (located on header - top left)
     * 5 - Verify name of each list item
     */
    public String[] validateTravelUpdateCenterDropdownListNames() {
        navigateToTravelUpdateCenterPage();
        wait.until(ExpectedConditions.elementToBeClickable(buttonTravelUpdateCenter));
        clickButtonTravelUpdateCenterDropdown();

        List<WebElement> dropdownList = menuTravelUpdateCenterDropdown.findElements(By.cssSelector(webElementListTravelUpdateCenterDropdown));
        String [] dropdownListNames = new String[dropdownList.size()];

        int i = 0;
        for (WebElement element : dropdownList) {
            dropdownListNames[i]=element.getText();
            System.out.println(i + " - " + dropdownListNames[i]);
            i++;
        }
        return dropdownListNames;
    }

    /**
     * Test Case 4 - Validate "Travel Update Center Dropdown" List - "Ways We're Keeping You Safe" submenu count
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Click on "Travel Update Center" dropdown (located on header - top left)
     * 5 - Click on "Ways We're Keeping You Safe"
     * 6 - Verify the name of each submenu list items
     */
    public String[] validateTUCDropdownWaysWereKeepingYouSafeSubmenuListNames() {
        navigateToTravelUpdateCenterPage();
        wait.until(ExpectedConditions.elementToBeClickable(buttonTravelUpdateCenter));

        clickButtonTravelUpdateCenterDropdown();
        wait.until(ExpectedConditions.elementToBeClickable(buttonAccordionWaysWereKeepingYouSafe));

        try {
            clickOnElement(buttonAccordionWaysWereKeepingYouSafe);
        } catch (Exception e) {
            System.out.println("COULD NOT CLICK ON \"WAYS WE'RE KEEPING YOU SAFE\" ACCORDION BUTTON --- TRYING AGAIN");
            clickJScript(buttonAccordionWaysWereKeepingYouSafe);
        }

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(webElementListWaysWereKeepingYouSafe)));
        List<WebElement> submenuItems = submenuWaysWereKeepingYouSafe.findElements(By.cssSelector(webElementListWaysWereKeepingYouSafe));
        String[] submenuItemNames = new String[submenuItems.size()];

        for (int i = 0; i < submenuItems.size(); i++) {
            submenuItemNames[i] = submenuItems.get(i).getText();
            System.out.println(i + " - " + submenuItemNames[i]);
        }
        return submenuItemNames;
    }

    /**
     * Test Case 5 - Validate "Travel Update Center Dropdown" List - "From Delta to Our Customers" submenu item names
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Click on "Travel Update Center" dropdown (located on header - top left)
     * 5 - Click on "From Delta to Our Customers"
     * 6 - Verify the name of each submenu list items
     */
    public String[] validateTUCDropdownFromDeltaToOurCustomersSubmenuListNames() {
        navigateToTravelUpdateCenterPage();
        wait.until(ExpectedConditions.elementToBeClickable(buttonTravelUpdateCenter));

        clickButtonTravelUpdateCenterDropdown();
        wait.until(ExpectedConditions.elementToBeClickable(buttonAccordionFromDeltaToOurCustomers));

        try {
            clickOnElement(buttonAccordionFromDeltaToOurCustomers);
        } catch (Exception e) {
            System.out.println("COULD NOT CLICK ON \"FROM DELTA TO OUR CUSTOMERS\" ACCORDION BUTTON --- TRYING AGAIN");
            clickJScript(buttonAccordionFromDeltaToOurCustomers);
        }

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(webElementListFromDeltaToOurCustomers)));
        List<WebElement> submenuItems = submenuFromDeltaToOurCustomers.findElements(By.cssSelector(webElementListFromDeltaToOurCustomers));
        String[] submenuItemNames = new String[submenuItems.size()];

        for (int i = 0; i < submenuItems.size(); i++) {
            submenuItemNames[i] = submenuItems.get(i).getText();
            System.out.println(i + " - " + submenuItemNames[i]);
        }
        return submenuItemNames;
    }

    /**
     * Test Case 6 - Validate "Travel Update Center Dropdown" List - "Flying? What You Need to Know" submenu item names
     * 1 - Navigate to http://delta.com
     * 2 - Scroll down to "The Delta Customer Experience" grid
     * 3 - Click on "What Are The Latest Travel Updates?"
     * 4 - Click on "Travel Update Center" dropdown (located on header - top left)
     * 5 - Click on "Flying? What You Need to Know"
     * 6 - Verify the name of each submenu list items
     */

    public String[] validateTUCDropdownFlyingWhatYouNeedToKnowSubmenuListNames() {
        navigateToTravelUpdateCenterPage();
        wait.until(ExpectedConditions.elementToBeClickable(buttonTravelUpdateCenter));

        clickButtonTravelUpdateCenterDropdown();
        wait.until(ExpectedConditions.elementToBeClickable(buttonAccordionFlyingWhatYouNeedToKnow));

        try {
            clickOnElement(buttonAccordionFlyingWhatYouNeedToKnow);
        } catch (Exception e) {
            System.out.println("COULD NOT CLICK ON \"FLYING? WHAT YOU NEED TO KNOW\" ACCORDION BUTTON --- TRYING AGAIN");
            clickJScript(buttonAccordionFlyingWhatYouNeedToKnow);
        }

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(webElementListFlyingWhatYouNeedToKnow)));
        List<WebElement> submenuItems = submenuFlyingWhatYouNeedToKnow.findElements(By.cssSelector(webElementListFlyingWhatYouNeedToKnow));
        String[] submenuItemNames = new String[submenuItems.size()];

        for (int i = 0; i < submenuItems.size(); i++) {
            submenuItemNames[i] = submenuItems.get(i).getText();
            System.out.println(i + " - " + submenuItemNames[i]);
        }
        return submenuItemNames;
    }













    /**
     * Helper methods used within this class
     */
    private void navigateToTravelUpdateCenterPage() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonTravelUpdate));
        clickOnElement(buttonTravelUpdate);
    }

    private void clickButtonTravelUpdateCenterDropdown(){
        try {
            clickOnElement(buttonTravelUpdateCenter);
            System.out.println("Clicked on \"Travel Update Center\" dropdown");
        } catch (Exception e) {
            System.out.println("COULD NOT CLICK ON \"TRAVEL UPDATE CENTER\" DROPDOWN - TRYING AGAIN");
            clickJScript(buttonTravelUpdateCenter);
        }
    }
}
