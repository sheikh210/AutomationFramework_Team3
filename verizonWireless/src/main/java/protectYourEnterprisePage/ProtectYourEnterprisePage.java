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
import java.io.IOException;
import java.time.Duration;

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

    public WebElement getDropdownProtectEnterprise() {
        return dropdownProtectEnterprise;
    }


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
     *
     * TEST CASE 6 - Validate titles of first section (below nav bar)
     *
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
        String url = null;
        wait.until(ExpectedConditions.visibilityOf(textPageConfirmContactUs));
        if (textPageConfirmContactUs.isDisplayed()) {
            System.out.println("Navigated to \"Contact Us\" page\n");
            url = driver.getCurrentUrl();
            return url;
        } else {
            System.out.println("COULD NOT NAVIGATE TO \"CONTACT US\" PAGE");
        }
        return url;
    }

    public void clickYouTubePlayer() throws InterruptedException {
        navigateToProtectYourEnterprisePage();

        try {
            clickJScript(buttonYouTubePlayerPlay);
            System.out.println("Clicked \"Play\" on embedded YouTube player");
        } catch (Exception e) {
            e.getMessage();
            clickOnElement(buttonYouTubePlayerPlay);
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
