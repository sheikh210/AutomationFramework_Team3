package forum_page;

import commonAPI.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static forum_page.ForumPageElements.*;

public class ForumPage extends WebAPI {

    @FindBy(how = How.XPATH, using = webElementForumButton)
    public WebElement forumButton;
    @FindBy(how = How.XPATH, using = webElementForumPageMouseHover)
    public WebElement forumPageMouseHover;
    @FindBy(how = How.XPATH, using = webElementAirlinesLink)
    public WebElement airlinesLink;
    @FindBy(how = How.XPATH, using = webElementTravelForumLink)
    public WebElement travelForumLink;
    @FindBy(how = How.XPATH, using = webElementBestOf2020)
    public WebElement bestOf2020;
    @FindBy(how = How.XPATH, using = webElementRoadTripsLInk)
    public WebElement roadTripsLink;
    @FindBy(how = How.XPATH, using = webElementHelpCenterLink)
    public WebElement helpCenterLink;


    public void navigateToForumPage() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(forumButton));
        forumButton.click();

    }

    /**
     * Test Case: 1
     * Navigate to HomePage WWW.TRIPADVISOR.COM
     * Click on "Forum page" Button
     * Verify the forum page URL
     */
    public String validateForumPageUrl() throws InterruptedException {
        navigateToForumPage();
        Thread.sleep(2000);
        String forumPageUrl = driver.getCurrentUrl();
        System.out.println("Forum Page URL is " + forumPageUrl);

        return forumPageUrl;
    }

    /**
     * Test Case: 2
     * Navigate to HomePage WWW.TRIPADVISOR.COM
     * Click on "Forum page" Button
     * Verify the forum page Title
     */

    public String validateForumPageTitle() {
        navigateToForumPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String forumPageTitle = driver.getTitle();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return forumPageTitle;
    }

    /**
     * Test Case: 3
     * Navigate to HomePage WWW.TRIPADVISOR.COM
     * Click on "Forum page" Button
     * Mouse Hove on DropDown button
     * Verify the Airlines link is Displayed
     */
    public boolean validateAirlinesLinkIsDisplayed() {
        navigateToForumPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        action.moveToElement(forumPageMouseHover).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        boolean airlinesLinkIsDisplayed = airlinesLink.isDisplayed();
        return airlinesLinkIsDisplayed;

    }

    /**
     * Test Case: 4
     * Navigate to HomePage WWW.TRIPADVISOR.COM
     * Click on "Forum page" Button
     * Mouse Hove on DropDown button
     * Click on "airlines" link
     * Verify the Airlines link page title
     */
    public String validateAirlinesLinkPageTitle() {
        navigateToForumPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        action.moveToElement(forumPageMouseHover).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        airlinesLink.click();
        String airlinesLinkPageTitle = driver.getTitle();
        return airlinesLinkPageTitle;

    }

    /**
     * Test Case: 5
     * Navigate to HomePage WWW.TRIPADVISOR.COM
     * Click on "Forum page" Button
     * Mouse Hove on DropDown button
     * Verify the Travel Forum link is Displayed
     */
    public boolean validateTravelForumLinkIsDisplayed() {
        navigateToForumPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        action.moveToElement(forumPageMouseHover).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        boolean travelForumLinkIsDisplayed = travelForumLink.isDisplayed();
        return travelForumLinkIsDisplayed;

    }

    /**
     * Test Case: 6
     * Navigate to HomePage WWW.TRIPADVISOR.COM
     * Click on "Forum page" Button
     * Mouse Hove on DropDown button
     * Click on "Travel forum" link
     * Verify the Travel Forum link page title
     */
    public String validateTravelForumLinkPageTitle() {
        navigateToForumPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        action.moveToElement(forumPageMouseHover).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        travelForumLink.click();
        String airlinesLinkPageTitle = driver.getTitle();
        return airlinesLinkPageTitle;

    }

    /**
     * Test Case: 7
     * Navigate to HomePage WWW.TRIPADVISOR.COM
     * Click on "Forum page" Button
     * Mouse Hove on DropDown button
     * Verify the Best of 2020 link is Displayed
     */
    public boolean validateBestOf2020LinkIsDisplayed() {
        navigateToForumPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        action.moveToElement(forumPageMouseHover).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        boolean bestOf2020IsDisplayed = bestOf2020.isDisplayed();
        return bestOf2020IsDisplayed;

    }


    /**
     * Test Case: 8
     * Navigate to HomePage WWW.TRIPADVISOR.COM
     * Click on "Forum page" Button
     * Mouse Hove on DropDown button
     * Click on "Best of 2020" link
     * Verify the Best of 2020 link page URL
     */
    public String validateBestOfLinkPageTitle() {
        navigateToForumPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        action.moveToElement(forumPageMouseHover).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        bestOf2020.click();
        String bestOf2020LinkPageTitle = driver.getTitle();
        return bestOf2020LinkPageTitle;


    }

    /**
     * Test Case: 9
     * Navigate to HomePage WWW.TRIPADVISOR.COM
     * Click on "Forum page" Button
     * Mouse Hove on DropDown button
     * Verify the Road trips link is Displayed
     */
    public boolean validateRoadTripsLinkIsDisplayed() {
        navigateToForumPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        action.moveToElement(forumPageMouseHover).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        boolean roadTripsLinkIsDisplayed = roadTripsLink.isDisplayed();
        return roadTripsLinkIsDisplayed;

    }


    /**
     * Test Case: 10
     * Navigate to HomePage WWW.TRIPADVISOR.COM
     * Click on "Forum page" Button
     * Mouse Hove on DropDown button
     * Click on "Road trips" link
     * Verify the Road trips link page title
     */
    public String validateRoadTripsLinkPageTitle() {
        navigateToForumPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        action.moveToElement(forumPageMouseHover).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        roadTripsLink.click();
        String roadTripsLinkPageTitle = driver.getTitle();
        return roadTripsLinkPageTitle;
    }

    /**
     * Test Case: 11
     * Navigate to HomePage WWW.TRIPADVISOR.COM
     * Click on "Forum page" Button
     * Mouse Hove on DropDown button
     * Verify the Help Center link is Displayed
     */
    public boolean validateHelpCenterLinkIsDisplayed() {
        navigateToForumPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        action.moveToElement(forumPageMouseHover).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        boolean helpCenterLinkIsDisplayed = helpCenterLink.isDisplayed();
        return helpCenterLinkIsDisplayed;

    }

    /**
     * Test Case: 12
     * Navigate to HomePage WWW.TRIPADVISOR.COM
     * Click on "Forum page" Button
     * Mouse Hove on DropDown button
     * Click on "airlines" link
     * Verify the Airlines link page URL
     */
    public String validateAirlinesLinkPageUrl() {
        navigateToForumPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        action.moveToElement(forumPageMouseHover).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        airlinesLink.click();
        String airlinesLinkPageUrl = driver.getCurrentUrl();
        return airlinesLinkPageUrl;

    }

    /**
     * Test Case: 13
     * Navigate to HomePage WWW.TRIPADVISOR.COM
     * Click on "Forum page" Button
     * Mouse Hove on DropDown button
     * Click on "Travel forum" link
     * Verify the Travel Forum link page Source
     */
    public String validateTravelForumLinkPageSource() {
        navigateToForumPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        action.moveToElement(forumPageMouseHover).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        travelForumLink.click();
        String airlinesLinkPageSource = driver.getPageSource();
        return airlinesLinkPageSource;
    }

    /**
     * Test Case: 14
     * Navigate to HomePage WWW.TRIPADVISOR.COM
     * Click on "Forum page" Button
     * Mouse Hove on DropDown button
     * Click on "Travel forum" link
     * Verify the Travel Forum link page URL
     */
    public String validateTravelForumLinkPageUrl() {
        navigateToForumPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        action.moveToElement(forumPageMouseHover).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        travelForumLink.click();
        String airlinesLinkPageUrl = driver.getCurrentUrl();
        return airlinesLinkPageUrl;
    }
    /**
     * Test Case: 15
     * Navigate to HomePage WWW.TRIPADVISOR.COM
     * Click on "Forum page" Button
     * Mouse Hove on DropDown button
     * Click on "Best of 2020" link
     * Verify the Best of 2020 link page Source
     */
    public String validateBestOfLinkPageSource() {
        navigateToForumPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        action.moveToElement(forumPageMouseHover).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        bestOf2020.click();
        String bestOf2020LinkPageSource = driver.getPageSource();
        return bestOf2020LinkPageSource;


    }
    /**
     * Test Case: 16
     * Navigate to HomePage WWW.TRIPADVISOR.COM
     * Click on "Forum page" Button
     * Mouse Hove on DropDown button
     * Click on "Road trips" link
     * Verify the Road trips link page title
     */
    public String validateRoadTripsLinkPageUrl() {
        navigateToForumPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        action.moveToElement(forumPageMouseHover).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        roadTripsLink.click();
        String roadTripsLinkPageUrl = driver.getCurrentUrl();
        return roadTripsLinkPageUrl;
    }


}
