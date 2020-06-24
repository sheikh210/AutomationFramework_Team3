package soccerpage;

import static soccerpage.ESPNSoccerPageElements.*;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.DataReader;

import java.util.List;

public class ESPNSoccerPage extends WebAPI {
    WebDriverWait wait = new WebDriverWait(driver, 10);

    //Case 2 Elements
    @FindBy(xpath = webElementClickSoccerMenuButton)
    public WebElement clickSoccerMenuButton;
    //-----------------------------------------------------------------------
    //Case 3 Elements
    //-----------------------------------------------------------------------
    //Case 4 Elements
    @FindBy(xpath = webElementClickTeamsDropDownButton)
    public WebElement clickTeamsDropDownButton;
    //-----------------------------------------------------------------------
    //Case 5 Elements
    @FindBy(xpath = webElementClickLeaguesAndCupsButton)
    public WebElement clickLeaguesAndCupsButton;
    //-----------------------------------------------------------------------
    //Case 6 Elements
    @FindBy(xpath = webElementClickTablesButton)
    public WebElement clickTablesButton;
    //-----------------------------------------------------------------------
    //Case 7 Elements
    @FindBy(xpath = webElementClickMoreButton)
    public WebElement clickMoreButton;
    //-----------------------------------------------------------------------
    //Case 8 Elements
    @FindBy(xpath = webElementClickESPNPlusLogo)
    public WebElement clickESPNPlusLogo;
    //-----------------------------------------------------------------------
    //Case 9 Elements
    @FindBy(xpath = webElementClickWatchButton)
    public WebElement clickWatchButton;
    //-----------------------------------------------------------------------
    //Case 10 Elements
    @FindBy(xpath = webElementClickListenButton)
    public WebElement clickListenButton;
    //-----------------------------------------------------------------------
    //Case 11 Elements

    //-----------------------------------------------------------------------
    //Case 12 Elements
    @FindBy(xpath = webElementClickFantasyButton)
    public WebElement clickFantasyButton;
    //-----------------------------------------------------------------------
    //Case 13 Elements
    @FindBy(xpath = webElementClickTopSoccerButton)
    public WebElement clickTopSoccerButton;
    //-----------------------------------------------------------------------
    //Case 14 Elements
    @FindBy(xpath = webElementClickEllipseMenuButton)
    public WebElement clickEllipseMenuButton;
    //-----------------------------------------------------------------------
    //Case 15 Elements
    @FindBy(xpath = webElementClickScoreButton)
    public WebElement clickScoreButton;
    //-----------------------------------------------------------------------
    //Case 16 Elements
    @FindBy(xpath = webElementClickCalendar)
    public WebElement clickCalendar;

    @FindBy(xpath = webElementClickDate)
    public WebElement clickDate;
    //-----------------------------------------------------------------------
    //Case 17 Elements
    @FindBy(xpath = webElementClickRightArrow)
    public WebElement clickRightArrow;
    //-----------------------------------------------------------------------
    //Case 18 Elements
    @FindBy(xpath = webElementClickTransfer)
    public WebElement clickTransfer;

    @FindBy(xpath = webElementClickAllLeague)
    public WebElement clickAllLeague;
    //-----------------------------------------------------------------------
    //Case 19 Elements
    @FindBy(xpath = webElementClickUSMNTbutton)
    public WebElement clickUSMNTbutton;
    //-----------------------------------------------------------------------
    //Case 20 Elements
    @FindBy(xpath = webElementClickUSWNTbutton)
    public WebElement clickUSWNTbutton;

    DataReader dataReader = new DataReader();

    /**
     * >>>Test Case 1 - Go to Home Page<<<
     * Open Chrome Browser
     * Type Url >>https://www.espn.com/<<
     * Wait until home page is landing
     * Get Home Page Title
     */
    public void goToHomePage() throws InterruptedException {
        sleepFor(3);
        String actualURL = getCurrentPageUrl();
        System.out.println("URL:" + actualURL);

        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title:" + actualTitle);
    }

    /**
     * >>>Test Case 2 - Go To Soccer Page<<<
     * Wait Home Page is landing
     * Click Soccer Menu Button
     * Get Soccer Page Title
     */
    public String goToSoccerPage() throws InterruptedException {
        clickSoccerMenuButton.click();
        sleepFor(3);
        String actualURL = getCurrentPageUrl();
        System.out.println("URL:" + actualURL);

        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title:" + actualTitle);

        return actualTitle;
    }

    /**
     * >>>Test Case 3 - Validate Soccer Drop Down List<<<
     * Click Soccer Menu Button
     * Expand it
     * Validate 9 Subcategories are there
     */

    public List<WebElement> soccerDropDown() throws InterruptedException {
        goToSoccerPage();
        sleepFor(3);
        mouseHover(clickSoccerMenuButton);
        List<WebElement> elementsList = getListOfWebElementsByXpath(clickSoccerMenuButton, webElementClickSoccerMenuButton);

        return elementsList;
    }

    /**
     * >>>Test Case 4 -Validate Teams Drop Down List <<<
     * Click Teams Drop Down Button
     * Validate 13 Elements are visible under drop down
     */
    public int teamsDropDownList() throws InterruptedException {
        goToSoccerPage();
        sleepFor(3);

        mouseHover(clickTeamsDropDownButton);
        List<WebElement> teamsDropDownList = driver.findElements(By.xpath(webElementClickTeamsDropDownButton));
        return teamsDropDownList.size();
    }

    /**
     * >>>Test Case 5 - Validate Leagues and Cups Drop Down List<<<
     * Click Leagues And Cups Button
     * Validate 11 Elements are visible under drop down
     */
    public int leaguesAndCups() throws InterruptedException {
        goToSoccerPage();
        sleepFor(3);

        mouseHover(clickLeaguesAndCupsButton);
        List<WebElement> teamsDropDownList = driver.findElements(By.xpath(webElementClickLeaguesAndCupsButton));
        return teamsDropDownList.size();

    }

    /**
     * >>>Test Case 6 - Validate Tables drop down list<<<
     * Click Tables Button
     * Validate 10 elements are visible under drop down
     */
    public int tablesDropDown() throws InterruptedException {
        goToSoccerPage();
        sleepFor(3);

        mouseHover(clickTablesButton);
        List<WebElement> dropDownList = driver.findElements(By.xpath(webElementClickTablesButton));
        return dropDownList.size();
    }

    /**
     * >>>Test Case 7 - Validate More Button<<<
     * Click More Button
     * Validate Tickets submenu is under more button
     */
    public int moreButton() throws InterruptedException {
        goToSoccerPage();
        sleepFor(3);

        mouseHover(clickMoreButton);
        List<WebElement> dropDownList = driver.findElements(By.xpath(webElementClickMoreButton));
        return dropDownList.size();
    }

    /**
     * >>>Test Case 8 - ESPN Plus Logo<<<
     * Click ESPN Plus Logo
     * Validate 11 elements displayed there
     */
    public int plusLogo() throws InterruptedException {
        goToSoccerPage();
        sleepFor(3);

        mouseHover(clickESPNPlusLogo);
        List<WebElement> dropDownList = driver.findElements(By.xpath(webElementClickESPNPlusLogo));
        return dropDownList.size();
    }

    /**
     * >>>Test Case 9 - Watch Button<<<
     * Click Watch Button
     * Validate 7 Elements are there
     */
    public int watchButton() throws InterruptedException {
        goToSoccerPage();
        sleepFor(3);

        mouseHover(clickWatchButton);
        List<WebElement> dropDownList = driver.findElements(By.xpath(webElementClickWatchButton));
        return dropDownList.size();
    }

    /**
     * >>>Test Case 10 - Listen Button<<<
     * Click Listen Button
     * Validate 4  elements are displayed
     */
    public int listenButton() throws InterruptedException {
        goToSoccerPage();
        sleepFor(3);

        mouseHover(clickListenButton);
        List<WebElement> dropDownList = driver.findElements(By.xpath(webElementClickListenButton));
        return dropDownList.size();
    }

    /**
     * >>>Test Case 11 - Listen Button<<<
     * Click Listen Button
     * Validate 4 Elements are displayed
     */


    /**
     * >>>Test Case 12 - Fantasy Drop Down<<<
     * Click Fantasy button
     * Validate 7 Elements are displayed
     */
    public int fantasyDropDown() throws InterruptedException {
        goToSoccerPage();
        sleepFor(3);

        mouseHover(clickFantasyButton);
        List<WebElement> dropDownList = driver.findElements(By.xpath(webElementClickFantasyButton));
        return dropDownList.size();
    }

    /**
     * >>>Test Case 13 - Top Soccer<<<
     * Click Top Soccer Button
     * Validate 11 Elements are displayed
     */
    public int topSoccer() throws InterruptedException {
        goToSoccerPage();
        sleepFor(3);

        mouseHover(clickTopSoccerButton);
        List<WebElement> dropDownList = driver.findElements(By.xpath(webElementClickTopSoccerButton));
        return dropDownList.size();
    }

    /**
     * >>>Test Case 14 - Header Ellipse Menu<<<
     * Click Ellipse Menu Button
     * Validate 24 Elements are displayed
     */
    public int ellipseMenu() throws InterruptedException {
        goToSoccerPage();
        sleepFor(3);

        mouseHover(clickEllipseMenuButton);
        List<WebElement> dropDownList = driver.findElements(By.xpath(webElementClickEllipseMenuButton));
        return dropDownList.size();
    }

    /**
     * >>>Test Case 15 - Open Score Sub Menu<<<
     * Click Score Button
     * Wait Page until landing
     * Get Title
     * Validate Page Title is as Expected
     */
    public String scoreSubMenu() throws InterruptedException {
        goToSoccerPage();
        sleepFor(3);

        clickScoreButton.click();
        sleepFor(3);

        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title:" + actualTitle);

        return actualTitle;
    }

    /**
     * >>>Test Case 16 - Check Calendar Box<<<
     * Open Score Sub Menu
     * open Calendar
     * Choose Date
     */
    public void calendarBox() throws InterruptedException {
        scoreSubMenu();
        sleepFor(3);

        clickCalendar.click();
        sleepFor(3);
        clickDate.click();
        sleepFor(3);
    }

    /**
     * >>>Test Case 17 - Check Swipe Button<<<
     * Go To Soccer Page
     * Find Match Slide Bar
     * Click Right Arrow
     */
    public void checkSwipeButton() throws InterruptedException {
        goToSoccerPage();
        sleepFor(3);

        clickRightArrow.click();
    }

    /**
     * >>>Test Case 18 - Open Transfer Menu<<<
     * Click All League
     * Verify 14 Elements Are Displayed
     */
    public int transferMenu() throws InterruptedException {
        goToSoccerPage();
        sleepFor(3);
        clickTransfer.click();
        sleepFor(4);
        clickAllLeague.click();

        List<WebElement> dropDownList = driver.findElements(By.xpath(webElementClickAllLeague));
        return dropDownList.size();
    }

    /**
     * >>>Test Case 19 - Open USMNT<<<
     * Click USMNT submenu
     * Get Title
     * validate title is as expected
     */
    public String usmntPage() throws InterruptedException {
        goToSoccerPage();
        sleepFor(3);
        clickUSMNTbutton.click();
        sleepFor(3);

        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title:" + actualTitle);

        return actualTitle;
    }

    /**
     * >>>Test Case 20 - Open USWNT<<<
     * Click USWNT
     * Get Title
     * Validate title is as expected
     */
    public String uswntPage() throws InterruptedException {
        goToSoccerPage();
        sleepFor(3);
        clickUSWNTbutton.click();
        sleepFor(3);

        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title:" + actualTitle);

        return actualTitle;
    }
}
