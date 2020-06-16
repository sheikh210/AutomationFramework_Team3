package protectYourEnterprisePage;

import commonAPI.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;

import static protectYourEnterprisePage.ProtectYourEnterprisePageElements.*;

public class ProtectYourEnterprisePage extends WebAPI {

    WebDriverWait wait = new WebDriverWait(driver, 10);
    String path = System.getProperty("user.dir") + "src\\main\\resources\\" +
            "VerizonWireless_ProtectYourEnterprisePage_ExpectedElements.xlsx";

    @FindBy(xpath = webElementButtonBusiness)
    private WebElement buttonBusiness;

    @FindBy(xpath = webElementButtonEnterprise)
    private WebElement buttonEnterprise;

    @FindBy(xpath = webElementButtonThreats)
    private WebElement buttonThreats;

    @FindBy(css = webElementTextPageConfirm)
    private WebElement textPageConfirm;

    public void navigateToProtectYourEnterprisePage() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonBusiness));
        clickOnElement(buttonBusiness);

        wait.until(ExpectedConditions.elementToBeClickable(buttonEnterprise));
        clickOnElement(buttonEnterprise);

        wait.until(ExpectedConditions.elementToBeClickable(buttonThreats));
        clickOnElement(buttonThreats);

        wait.until(ExpectedConditions.visibilityOf(textPageConfirm));

        try {
            String pageConfirmText = textPageConfirm.getText();
            if ((compareTextToExpectedString(pageConfirmText, path, "PageConfirmText") == true)) {
                System.out.println("Navigated to \"Protect Your Enterprise\" page\n");
            } else {
                System.out.println("COULD NOT NAVIGATE TO \"PROTECT YOUR ENTERPRISE\" PAGE\n");
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }

}
