package homepage;


import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


import java.util.concurrent.TimeUnit;

import static homepage.DeltaHomePageElements.*;


public class DeltaAirlinesHomepage extends WebAPI {
    @FindBy (xpath = WebElementSearchBar)
    public WebElement searchBar;
    @FindBy(xpath = WebElementSearchForTopicBar)
    public WebElement searchForTopicBar;
    @FindBy(xpath = WebElementSearchForTopicButton)
    public WebElement searchForTopicButton;
    @FindBy(xpath = WebElementSignUpButton)
    public WebElement signUpButton;
    @FindBy(xpath = WebElementLogInButton)
    public WebElement logInButton;
    @FindBy(xpath = WebElementHomePageLogo)
    public WebElement homePageLogo;
    @FindBy(xpath = WebElementDepartureAirportButton)
    public WebElement departureAirportButton;
    @FindBy(xpath = WebElementDepartureAirportSearchBox)
    public WebElement getDepartureAirportSearchBox;
    @FindBy(xpath = WebElementDepartureAirportCode)
    public WebElement departureAirportCode;
    @FindBy(xpath = WebElementContinueButton)
    public WebElement continueButton;
    @FindBy(xpath = WebElementCorrectionMessage)
    public WebElement correctionMessage;
    @FindBy(xpath = WebElementArrivalAirportButton)
    public WebElement arrivalAirportButton;
    @FindBy(xpath = WebElementArrivalAirportSearchBox)
    public WebElement arrivalAirportSearchBox;
    @FindBy(xpath = WebElementArrivalAirportCode)
    public WebElement arrivalAirportCode;
    @FindBy(xpath = WebElementDepartureReturnDateButton)
    public WebElement departureReturnDateButton;
    @FindBy(xpath = WebElementDepartureDate)
    public WebElement departureDate;
    @FindBy(xpath = WebElementReturnDate)
    public WebElement returnDate;
    @FindBy(xpath = WebElementDateDoneButton)
    public WebElement dateDoneButton;
    @FindBy(xpath = WebElementCheckInButton)
    public WebElement checkInButton;
    @FindBy(xpath = WebElementFidYourTripButton)
    public WebElement findYourTripByButton;
    @FindBy (xpath = WebElementTicketNumberOption)
    public WebElement ticketNumberOption;
    @FindBy (xpath = WebElementCheckInContinueButton)
    public WebElement checkInContinueButton;
    @FindBy(xpath = WebElementCheckInErrorMessage)
    public WebElement checkInErrorMessage;
    @FindBy(xpath = WebElementTicketNumberBox)
    public WebElement ticketNumberBox;
    @FindBy(xpath = WebElementTicketNumberError)
    public WebElement ticketNumberError;
    /**
     * Footer
     */
    @FindBy(xpath = WebElementAboutUsLink)
    WebElement aboutUsLink;


    /**
     * Test case 1: "Validate Home Page"
     * 1)Navigate to url "www.delta.com"
     * 2)get the title of the page
     */
    @Override
    public String getCurrentPageTitle(){
        return super.getCurrentPageTitle();
    }
    public void validateCurrentPage(){
        String actualTitle=getCurrentPageTitle();
        String expectedTitle="Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site";
        Assert.assertEquals(actualTitle,expectedTitle,"Home page title does not match");
    }
    /**
     * Test case 2: "Search pet in search button"
     * 1)Navigate to url "www.delta.com"
     * 2)click on search bar
     * 3)Type "Flying with Service Animals"
     * 4)Get the first link title
     * 5)Close browser
     */
    public void doSearch() throws InterruptedException {
       searchBar.click();
       searchForTopicBar.sendKeys("Flying with Service Animals");
       searchForTopicButton.click();
       String actualTitle=getCurrentPageTitle();
       String expectedTitle="Search Results:";
       Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }
    /**
     * Test case 3: "Validating SignUp button"
     * 1)Navigate to url "www.delta.com"
     * 2)Click on SignUp button
     * 3)Get the title of the page
     * 4)Navigate back to home page
     * 5)get the title of the page
     * 6)Close browser
     */
    public void signUp(){
        signUpButton.click();
        String actualTitle=getCurrentPageTitle();
        String expectedTitle="Join SkyMiles® Loyalty Program : Delta Air Lines";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
        navigateBack();
        String actualTitle1 =getCurrentPageTitle();
        String expectedTitle1="Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site";
        Assert.assertEquals(actualTitle1,expectedTitle1,"Title does not match");

    }
    /**
     *Test case 4: "Validating the Login button"
     * 1)Navigate to url "www.delta.com"
     * 2)Click on LogIn button
     * 3)get the title of the page
     * 3)Go back to home page by clicking logo using mouse
     * 4)Close browser
     */
    public void logIn(){
        logInButton.click();
        String actualTitle=getCurrentPageTitle();
        String expectedTitle="Login";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
        mouseHoverByXpath(WebElementHomePageLogo);

        String actualTitle1=getCurrentPageTitle();
        String expectedTitle1="Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site";
        Assert.assertEquals(actualTitle1,expectedTitle1,"Title does not match");

    }
    /**
     *Test case 5: "Validate departure airport selection"
     * 1)Navigate to url "www.delta.com"
     * 2)Click on "From" and make sure a search box is displayed
     * 3)Select "EWR" as origin
     * 4)Click search
     * 5)Ensure that an error message is displayed
     * "To continue, please correct the 2 items indicated"
     * 6)Close browser
     */

    public void selectDepartureAirport(){

        departureAirportButton.click();
        getDepartureAirportSearchBox.sendKeys("EWR");
        departureAirportCode.click();
        continueButton.click();
        String actualMessage=correctionMessage.getText();
        String expectedMessage="To continue, please correct the 2 items indicated";
        Assert.assertEquals(actualMessage,expectedMessage,"Message does not match");

    }

    /**
     * Test case 6: "Validate destination airport selection"
     * 1)Navigate to url "www.delta.com"
     * 2)Click on "From" and make sure a search box is displayed
     * 3)Click on "To" and ensure search box is displayed
     * 4)Select "TPA" as destination
     * 5)Click search
     * 6)Ensure that an error message is displayed
     * "To continue, please correct the 1 items indicated"
     * 7)Close browser
     */
    public void selectDestinationAirport() throws InterruptedException {
        selectDepartureAirport();
        arrivalAirportButton.click();
        arrivalAirportSearchBox.sendKeys("SFO");
        arrivalAirportCode.click();
        Thread.sleep(3000);
        continueButton.click();
        String actualMessage=correctionMessage.getText();
        String expectedMessage="To continue, please correct the 1 item indicated";
        Assert.assertEquals(actualMessage,expectedMessage,"Message does not match");


    }
    /**
     * Test case 7: "Validate dates selection"
     * 1)Navigate to url "www.delta.com"
     * 2)Click on "From" and make sure a search box is displayed
     * 3)Click on "To" and ensure search box is displayed
     * 4)Select "SFO" as destination
     * 5)Select departure date "June 11 2020"
     * 6)Select return date "June 18 2020 "
     * 7)Click Done on the calender menu
     * 8)Click Search
     * 9)Get the title and compare to Expected title "Flight Results : Find & Book Airline Tickets : Delta Air Lines"
     * 10)Close browser
     */
    public  void selectDepartureReturnDate() throws InterruptedException {
        selectDepartureAirport();
        selectDestinationAirport();
        departureReturnDateButton.click();
        departureDate.click();
        returnDate.click();
        dateDoneButton.click();
        sleepFor(3);
        continueButton.click();
        sleepFor(3);
        String actualTitle=getCurrentPageTitle();
        String expectedTitle="Flight Results : Find & Book Airline Tickets : Delta Air Lines";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");

    }
    /**
     * Test case 8:"Validate Check in Button"
     * 1)Navigate to url "www.delta.com"
     * 2)Click on "Check in"
     * 3)Open "Find your trip by drop menu"
     * 4)Select "Ticket Number" as an option
     * 5)Click search button
     * 6)Get the error message and compare it to "To continue, please correct the 2 items indicated"
     * 7)Close browser
     */
    public void findYourTripBy(){
        checkInButton.click();
        findYourTripByButton.click();
        ticketNumberOption.click();
        checkInContinueButton.click();
       String  actualMessage=checkInErrorMessage.getText();
       String expectedMessage="To continue, please correct the 2 items indicated";
       Assert.assertEquals(actualMessage,expectedMessage,"Message does not match");


    }
    /**
     * Test case 9:"Test search with wrong ticket number"
     * 1)Navigate to url "www.delta.com"
     * 2)Click on "Check in"
     * 3)Open "Find your trip by drop menu"
     * 4)Select "Ticket Number" as an option
     * 5)Enter Wrong ticket number"123456"
     * 6)Click search
     * 7)Get the error message
     */
    public void findYourTripByTicketNumber(){
        findYourTripBy();
        ticketNumberBox.sendKeys("123456");
        checkInContinueButton.click();
        String actualMessage= ticketNumberError.getText();
        String expectedMessage="Please enter a valid Ticket Number";
        Assert.assertEquals(actualMessage,expectedMessage,"Message does not match");

    }
    /**
     * Test case 10:"Validate about us link"
     * 1)Navigate to url "www.delta.com"
     * 2)Click on "about us"
     * 3)Get title page
     * 7)Close Browser
     */
    public void validateAboutUs() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement aboutUS= driver.findElement(By.xpath(WebElementAboutUsLink));
        js.executeScript("arguments[0].scrollIntoView();",aboutUS);
        aboutUsLink.click();
        sleepFor(3);
        String actualTitle=getCurrentPageTitle();
        String expectedTitle="About Delta : Delta Air Lines";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");

    }
}

