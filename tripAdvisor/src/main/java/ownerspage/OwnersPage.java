package ownerspage;

import commonAPI.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static ownerspage.OwnersPageElements.*;

public class OwnersPage extends WebAPI {

    WebDriverWait wait = new WebDriverWait(driver, 10);

    @FindBy (css = webElementButtonOwnersPageButton)
    public WebElement buttonOwnersPage;

    @FindBy (css = webElementImageOwnersPageBackground)
    public WebElement imageOwnersPageBackground;


    public void navigateToOwnersPage() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonOwnersPage));
        clickOnElement(buttonOwnersPage);
        wait.until(ExpectedConditions.visibilityOf(imageOwnersPageBackground));
    }

    /**
     * Test Case 1 - Validate Navigation to "Owners" page
     * 1 - Navigate to http://tripadvisor.com
     * 2 - In footer, under "Do Business With Us", click "Owners"
     * 3 - Verify user is on the correct page (http://tripadvisor.com/Owners)
     */
    public String validateNavigationToOwnersPage() {
        navigateToOwnersPage();
        String url = driver.getCurrentUrl();
        System.out.println("Page URL - " + url);

        return url;
    }

}
