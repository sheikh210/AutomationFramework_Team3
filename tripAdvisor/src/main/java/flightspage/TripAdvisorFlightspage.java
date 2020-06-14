package flightspage;
import static flightspage.TripAdvisorFlightspageElements.*;
import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class TripAdvisorFlightspage extends WebAPI {

    //Case 2 Elements
    @FindBy (xpath = clickMoreButton)
    public WebElement webclickMoreButton;

    @FindBy (xpath = clickFlightsButton)
    public WebElement webclickFlightsButton;

    //-----------------------------------------------------------------------
    //Case 3 Elements
    @FindBy (xpath = clickEllipsMenuButton)
    public WebElement webclickEllipsMenuButton;

    //-----------------------------------------------------------------------
    //Case 4 Elements
    @FindBy (xpath = clickFrombox)
    public WebElement webclickFrombox;

    @FindBy (xpath = clickToWhereBox)
    public WebElement webclickToWhereBox;

    //-----------------------------------------------------------------------
    //Case 5 Elements
    @FindBy (xpath = clickCalendarbox)
    public WebElement webclickCalendarbox;

    @FindBy (xpath = clickRightswipe)
    public WebElement webclickRightswipe;

    @FindBy (xpath = click18July)
    public WebElement webclick18July;

    @FindBy (xpath = click15August)
    public WebElement webclick15August;

    //-----------------------------------------------------------------------
    //Case 6 Elements
    @FindBy (xpath = clickClassBox)
    public WebElement webclickClassBox;

    @FindBy (xpath = clickEconomyButton)
    public WebElement webclickEconomyButton;

    @FindBy (xpath = clickFirstClass)
    public WebElement webclickFirstClass;

    @FindBy (xpath = clickCloseButton)
    public WebElement webclickCloseButton;

    //-----------------------------------------------------------------------
    //case 7 elements
    @FindBy (xpath = clickPreferNonstopButton)
    public WebElement webclickPreferNonstopButton;

    @FindBy (xpath = clickNearbyAirportsButton)
    public WebElement webclickNearbyAirportsButton;

    //-----------------------------------------------------------------------
    //case 8 elements
    @FindBy (xpath = clickEmailBar)
    public WebElement webclickEmailBar;

    //-----------------------------------------------------------------------
    //case 9 elements
    @FindBy (xpath = clickCurrencyBox)
    public WebElement webclickCurrencyBox;

    //-----------------------------------------------------------------------
    //case 10 elements
    @FindBy (xpath = clickCountryBox)
    public WebElement webclickCountryBox;

    //-----------------------------------------------------------------------
    //case 11 elements
    @FindBy (xpath = clickGreenSearch)
    public WebElement webclickGreenSearch;


    /**
     * >>>Test Case 1 - Go to Home Page<<<
     * Open Chrome Browser
     * Type Url >>https://www.tripadvisor.com/<<
     * Wait until home page is landing
     * Get Home Page Title
     */
    public void goToHomePage() {

    }
    public void validateHomePage() {
        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title:"+actualTitle);

        Assert.assertEquals(actualTitle,expectedHomePageTitle);
    }

    /**
     * >>>Test Case 2 - Go to Flights page <<<
     * Click >>More<< button on header
     * Expand it
     * Validate 9 Category are there
     * Click Flights button
     * Wait until home page is landing
     * Get Title
     */

    public void goToFlightsPage() {
        webclickMoreButton.click();
        webclickFlightsButton.click();
    }

    /**
     * >>>Test Case 3 - Drop Down Menu<<<
     * Click ellipsis button
     * Validate 5 Category are visible
     */
    public int getEllipsMenu() {
        List<WebElement> ellipsMenuList = webclickEllipsMenuButton.findElements(By.xpath(clickEllipsMenuButton));
        int ellipsMenuSize = ellipsMenuList.size();
        return ellipsMenuSize;

    }
    public void validateEllipsMenu() {
        Assert.assertEquals(getEllipsMenu(),5,"List Size does not match");
    }

    /**
     * >>>Test Case 4 - Round Trip<<<
     * Click From box
     * Type New York City (NYC)
     * Click To Where Box
     * Type Los Angeles (LAX)
     */
    public void roundTripBox() {
        webclickFrombox.sendKeys("New York City (NYC)");
        webclickToWhereBox.sendKeys("Los Angeles (LAX)");
    }
    /**
     * >>>Test Case 5 - Calendar Box<<<
     * Click Calendar box
     * Click right swipe
     * Click 18 July
     * Click 15 August
     */
    public void goToCalendarBox() {
        webclickCalendarbox.click();
        webclickRightswipe.click();
        webclick18July.click();
        webclick15August.click();
    }
    /**
     * >>>Test Case 6 - Check class type<<<
     * Click Class box
     * Expand it
     * Click Economy button
     * Validate 4 type of class
     * Click First Class
     * Click Close
     */
    public void chooseClasType() {
        webclickClassBox.click();
        webclickEconomyButton.click();
        webclickFirstClass.click();
        webclickCloseButton.click();
    }

    /**
     * >>>Test Case 7 - Extra options<<<
     * Click >>Prefer nonstop<< button
     * Click >>Include nearby airports<< button
     */
    public void chooseExtraFlightOptions() {
        webclickPreferNonstopButton.click();
        webclickNearbyAirportsButton.click();
    }

    /**
     * >>>Test Case 8 - Price Alert<<<
     * Click Email Bar
     * Type >>pnttest@gmail.com<<
     */
    public void priceAlert() {
        webclickEmailBar.sendKeys("pnttest@gmail.com");
    }

    /**
     * >>>Test Case 9 - Currency box<<<
     * Click Currency box
     * Validate 8 currency type are displayed
     */
    public void checkCurrencyBox() {
        webclickCurrencyBox.click();
    }

    /**
     * >>>Test Case 10 - Country box<<<
     * Click Country box
     * Validate how many country names are there
     */
    public void checkCountryBox() {
        webclickCountryBox.click();
    }

    /**
     * >>>Test Case 11 - Do flight search<<<
     * Click green search bar on the right side of the header
     */
    public void doFlightSearch() {
        webclickGreenSearch.click();
    }

}
