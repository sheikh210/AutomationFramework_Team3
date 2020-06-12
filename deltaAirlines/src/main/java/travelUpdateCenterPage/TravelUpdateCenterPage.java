package travelUpdateCenterPage;

import commonAPI.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static travelUpdateCenterPage.TravelUpdateCenterPageElements.*;

public class TravelUpdateCenterPage extends WebAPI {

    @FindBy (css = webElementButtonTravelUpdate)
    public WebElement buttonTravelUpdate;

    public void navigateToTravelUpdateCenterPage(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        scrollToElementJScript(buttonTravelUpdate);
        wait.until(ExpectedConditions.elementToBeClickable(buttonTravelUpdate));
        clickOnElement(buttonTravelUpdate);
    }

    public void validatePageTitle(){
        navigateToTravelUpdateCenterPage();
        driver.getTitle();
    }






}
