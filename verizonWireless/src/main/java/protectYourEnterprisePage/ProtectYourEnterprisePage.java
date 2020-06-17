package protectYourEnterprisePage;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;

import static protectYourEnterprisePage.ProtectYourEnterprisePageElements.*;

public class ProtectYourEnterprisePage extends WebAPI {

    WebDriverWait wait = new WebDriverWait(driver, 10);
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
                clickOnElement(buttonThreats);
                System.out.println("Clicked \"Enterprise Threats\" button\n");
            } catch (Exception e1) {
                clickJScript(buttonThreats);
            }
        }
        wait.until(ExpectedConditions.visibilityOf(textPageConfirm));
        String pageConfirmText = textPageConfirm.getText();
        System.out.println(pageConfirmText + "\n");
        System.out.println("Navigated to \"Protect Your Enterprise\" page\n");

        return pageConfirmText;
    }

    /**
     * TEST CASE 2 - Validate number of list items contained in "Protect your enterprise from threats" dropdown
     */
    public boolean validateProtectEnterpriseDropdownListSize() throws IOException {
        navigateToProtectYourEnterprisePage();

        try{
            wait.until(ExpectedConditions.visibilityOf(dropdownProtectEnterprise));
        } catch (ElementNotVisibleException e) {
            e.getMessage();
        }

        try {
            mouseHover(dropdownProtectEnterprise);
        } catch (ElementNotInteractableException e) {
            e.getMessage();
            try {
                mouseHoverJScript(dropdownProtectEnterprise);
            } catch (Exception e1) {
                e1.getMessage();
            }
        }
        boolean flag = compareListSizeToExpectedCount(By.xpath(webElementsListDropdownProtectEnterprise),
                path,"DropdownProtectEnt Count");

        return flag;
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
