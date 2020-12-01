package protectYourEnterprisePage;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;
import static protectYourEnterprisePage.ProtectYourEnterprisePageElements.*;

public class ProtectYourEnterprisePage extends WebAPI {

    WebDriverWait wait = new WebDriverWait(driver, 10);
    Wait fluentWait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);
    String path = System.getProperty("user.dir") + "\\src\\main\\resources\\" +
            "VerizonWireless_ProtectYourEnterprisePage_ExpectedElements.xlsx";

    @FindBy(xpath = webElementButtonBusiness)
    private WebElement buttonBusiness;

    @FindBy(xpath = webElementButtonEnterprise)
    private WebElement buttonEnterprise;

    @FindBy (xpath = webElementPopup)
    private WebElement popup;

    @FindBy (css = webElementButtonPopupClose)
    private WebElement buttonPopupClose;

    @FindBy(css = webElementButtonThreats)
    private WebElement buttonThreats;

    @FindBy(css = webElementTextPageConfirm)
    private WebElement textPageConfirm;

    @FindBy (css = webElementDropdownProtectEnterprise)
    private WebElement dropdownProtectEnterprise;

    @FindBy (css = webElementIFrameYouTubePlayer)
    private WebElement iFrameYouTubePlayer;

    @FindBy (css = webElementButtonYouTubePlayerPlay)
    private WebElement buttonYouTubePlayerPlay;

    @FindBy (css = webElementButtonContactUs)
    private WebElement buttonContactUs;

    @FindBy (css = webElementTextPageConfirmContactUs)
    private WebElement textPageConfirmContactUs;

    @FindBy (css = webElementFirstExpandStackContainer)
    private WebElement firstExpandStackContainer;

    @FindBy (css = webElementSecondExpandStackContainer)
    private WebElement secondExpandStackContainer;

    @FindBy (css = webElementThirdExpandStackContainer)
    private WebElement thirdExpandStackContainer;

    @FindBy (css = webElementFourthExpandStackContainer)
    private WebElement fourthExpandStackContainer;

    @FindBy (css = webElementTitleFirstExpandStackContainer)
    private WebElement titleFirstExpandStackContainer;

    @FindBy (css = webElementTitleSecondExpandStackContainer)
    private WebElement titleSecondExpandStackContainer;

    @FindBy (css = webElementTitleThirdExpandStackContainer)
    private WebElement titleThirdExpandStackContainer;

    @FindBy (css = webElementTitleFourthExpandStackContainer)
    private WebElement titleFourthExpandStackContainer;

    @FindBy (css = webElementTextTitleFirstExpandStackContainer)
    private WebElement textTitleFirstExpandStackContainer;

    @FindBy (css = webElementTextTitleSecondExpandStackContainer)
    private WebElement textTitleSecondExpandStackContainer;

    @FindBy (css = webElementTextTitleThirdExpandStackContainer)
    private WebElement textTitleThirdExpandStackContainer;

    @FindBy (css = webElementTextTitleFourthExpandStackContainer)
    private WebElement textTitleFourthExpandStackContainer;

    public WebElement getDropdownProtectEnterprise() {
        return dropdownProtectEnterprise;
    }
    public WebElement getFirstExpandStackContainer() { return firstExpandStackContainer; }
    public WebElement getSecondExpandStackContainer() { return secondExpandStackContainer; }
    public WebElement getThirdExpandStackContainer() { return thirdExpandStackContainer; }
    public WebElement getFourthExpandStackContainer() { return fourthExpandStackContainer; }
    public WebElement getTitleFirstExpandStackContainer() { return titleFirstExpandStackContainer; }
    public WebElement getTitleSecondExpandStackContainer() { return titleSecondExpandStackContainer; }
    public WebElement getTitleThirdExpandStackContainer() { return titleThirdExpandStackContainer; }
    public WebElement getTitleFourthExpandStackContainer() { return titleFourthExpandStackContainer; }


    /**
     * TEST CASE 1 - Validate navigation to "Protect Your Enterprise From Threats" Page
     */
    public String navigateToProtectYourEnterprisePage() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonBusiness));
        clickOnElement(buttonBusiness);
        System.out.println("Clicked \"Business\" button\n");

        wait.until(ExpectedConditions.elementToBeClickable(buttonEnterprise));
        clickOnElement(buttonEnterprise);
        System.out.println("Clicked \"Enterprise\" button\n");

        if (killPopup() == true) {
            try {
                wait.until(ExpectedConditions.elementToBeClickable(buttonThreats));
                Thread.sleep(1000);
                clickJScript(buttonThreats);
                System.out.println("Clicked \"Enterprise Threats\" button\n");
            } catch (Exception e) {
                clickJScript(buttonThreats);
            }
        } else {
            try {
                wait.until(ExpectedConditions.elementToBeClickable(buttonThreats));
                clickJScript(buttonThreats);
                System.out.println("Clicked \"Enterprise Threats\" button\n");
            } catch (Exception e1) {
                clickJScript(buttonThreats);
            }
        }
        wait.until(ExpectedConditions.visibilityOf(textPageConfirm));
        String pageConfirmText = textPageConfirm.getText();
        System.out.println("Navigated to \"Protect Your Enterprise\" page\n");

        return pageConfirmText;
    }

    /**
     * TEST CASE 2 - Validate number of list items contained in "Protect your enterprise from threats" dropdown
     * TEST CASE 3 - Validate name of each list item contained in "Protect your enterprise from threats" dropdown
     * TEST CASE 4 - Validate navigation to URL of each list item contained in "Protect your enterprise from threats" dropdown
     */
    public void hoverProtectEnterpriseDropdown() {
        navigateToProtectYourEnterprisePage();

        try{
            wait.until(ExpectedConditions.visibilityOf(dropdownProtectEnterprise));
        } catch (ElementNotVisibleException e) {
            e.getMessage();
        }

        try {
            mouseHover(dropdownProtectEnterprise);
            System.out.println("Hovered over \"Protect your enterprise from threats\" dropdown\n");
        } catch (ElementNotInteractableException e) {
            e.getMessage();
            try {
                mouseHoverJScript(dropdownProtectEnterprise);
            } catch (Exception e1) {
                e1.getMessage();
            }
        }
    }

    /**
     * TEST CASE 5 - Validate the name of each item on the sticky Navigation Bar (located under page image)
     * TEST CASE 6 - Validate titles of first section (below nav bar)
     * TEST CASE 7 - Validate body text of first grid container section (below nav bar)
     */

    /**
     * TEST CASE 8 - Validate "Contact Us" button
     */

    public String validateURLButtonContactUs() {
        navigateToProtectYourEnterprisePage();

        try {
            clickJScript(buttonContactUs);
            System.out.println("Clicked on \"Contact Us\" button\n");
        } catch (Exception e) {
            try {
                clickOnElement(buttonContactUs);
            } catch (Exception e1) {
                e.getMessage();
                e1.getMessage();
            }
        }
        String url;
        wait.until(ExpectedConditions.visibilityOf(textPageConfirmContactUs));
        if (textPageConfirmContactUs.isDisplayed()) {
            System.out.println("Navigated to \"Contact Us\" page\n");
            url = driver.getCurrentUrl();
            return url;
        } else {
            System.out.println("COULD NOT NAVIGATE TO \"CONTACT US\" PAGE");
        }
        return null;
    }

    /**
     * TEST CASE 9 -Validate YouTube Player
     */
    public void clickYouTubePlayer() throws InterruptedException {
        navigateToProtectYourEnterprisePage();

        try {
            clickJScript(buttonYouTubePlayerPlay);
            Thread.sleep(10000);
            System.out.println("Clicked \"Play\" on embedded YouTube player");
        } catch (Exception e) {
            e.getMessage();
            clickOnElement(buttonYouTubePlayerPlay);
        }
    }

    /**
     * TEST CASE 10 - Validate titles of each expandable stack container (under YouTube iFrame)
     * TEST CASE 11 - Validate text titles of each expandable stack container (under YouTube iFrame)
     * TEST CASE 12 - Validate text body of each expandable stack container (under YouTube iFrame)
     * TEST CASE 13 - Validate title of fourth expandable stack container (under YouTube iFrame)
     * TEST CASE 14 - Validate text title of first expandable stack container (under YouTube iFrame)
     * TEST CASE 15 - Validate text title of second expandable stack container (under YouTube iFrame)
     * TEST CASE 16 - Validate text title of third expandable stack container (under YouTube iFrame)
     * TEST CASE 17 - Validate text title of fourth expandable stack container (under YouTube iFrame)
     * TEST CASE 18 - Validate text body of first expandable stack container (under YouTube iFrame)
     * TEST CASE 19 - Validate text body of second expandable stack container (under YouTube iFrame)
     * TEST CASE 20 - Validate text body of third expandable stack container (under YouTube iFrame)
     * TEST CASE 21 - Validate text body of fourth expandable stack container (under YouTube iFrame)
     */

    public void hoverExpandStackContainerAndWait(WebElement element, WebElement elementToWaitFor) {
        navigateToProtectYourEnterprisePage();

        wait.until(ExpectedConditions.visibilityOf(element));
        try {
            scrollToElementJScript(element);
            mouseHoverJScript(element);
        } catch (Exception e) {
            driver.navigate().refresh();
            wait.until(ExpectedConditions.visibilityOf(element));
            mouseHoverJScript(element);
        }

        wait.until(ExpectedConditions.visibilityOf(elementToWaitFor));

    }

    public void hoverExpandStackContainer(WebElement element) {
        navigateToProtectYourEnterprisePage();

        wait.until(ExpectedConditions.visibilityOf(element));
        try {
            scrollToElementJScript(element);
            mouseHoverJScript(element);
        } catch (Exception e) {
            driver.navigate().refresh();
            wait.until(ExpectedConditions.visibilityOf(element));
            mouseHoverJScript(element);
        }
    }

    /**
     * HELPER METHOD TO KILL POP-UP
     */
    public boolean killPopup() {
        boolean flag = false;

        try {
            wait.until(ExpectedConditions.visibilityOf(popup));
            if (popup.isDisplayed()) {
                System.out.println("POP-UP DISPLAYED\n");
                buttonPopupClose.click();
                System.out.println("POP-UP CLOSED\n");
                driver.switchTo().defaultContent();
                flag = true;
            } else {
                System.out.println("Pop-up was not displayed\n");
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return flag;
    }
}
