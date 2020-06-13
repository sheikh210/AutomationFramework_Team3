package homepage;

import commonAPI.WebAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static homepage.ESPNHomepageElements.*;

public class ESPNHomepage extends WebAPI {

    @FindBy(xpath = webElementTopEventsDropdown)
    public WebElement topEventsDropdown;

    @FindBy(css = webElementTopEventsDropdownMenu)
    public WebElement topEventsDropdownMenu;

    @FindBy(css = webElementUFCHeaderTile)
    public WebElement ufcHeaderTile;

    @FindBy(css = webElementHeaderScrollRight)
    public WebElement headerScrollRight;

    @FindBy(css = webElementHeaderScrollLeft)
    public WebElement headerScrollLeft;

    @FindBy(css = webElementNFLDropdown)
    public WebElement nflDropdown;

    @FindBy(xpath = webElementNFLDropdownMenuLeft)
    public WebElement nflDropdownMenuLeft;

    @FindBy(css = webElementNFLDropdownMenuRight)
    public WebElement nflDropdownMenuRight;

    @FindBy(css = webElementNBADropdown)
    public WebElement nbaDropdown;

    @FindBy(css = webElementNBADropdownMenuLeft)
    public WebElement nbaDropdownMenuLeft;

    @FindBy(css = webElementNBADropdownMenuRight)
    public WebElement nbaDropdownMenuRight;

    @FindBy(css = webElementMLBDropdown)
    public WebElement mlbDropdown;

    @FindBy(css = webElementMLBDropdownMenuLeft)
    public WebElement mlbDropdownMenuLeft;

    @FindBy(css = webElementMLBDropdownMenuRight)
    public WebElement mlbDropdownMenuRight;

    @FindBy(xpath = webElementIFrame)
    public WebElement iFrame;

    @FindBy(xpath = webElementButtonLogin)
    public WebElement buttonLogin;

    @FindBy(xpath = webElementInputUsernameEmailAddress)
    public WebElement inputUsernameEmailAddress;

    @FindBy(xpath = webElementInputPassword)
    public WebElement inputPassword;

    @FindBy(xpath = webElementButtonLoginFormLogin)
    public WebElement buttonLoginFormLogin;

    @FindBy(xpath = webElementErrorLoginMessage)
    public WebElement errorLoginMessage;

    @FindBy(css = webElementContainerESPNSitesHeader)
    public WebElement containerESPNSitesHeader;

    @FindBy(css = webElementContainerESPNSitesList)
    public WebElement containerESPNSitesList;

    @FindBy(css = webElementContainerFollowESPNHeader)
    public WebElement containerFollowESPNHeader;

    @FindBy(css = webElementContainerFollowESPNList)
    public WebElement containerFollowESPNList;

    /**
     * HEADER
     */

    /**
     * Test Case 1 - Validate Navigation to Homepage
     * 1 - Navigate to http://espn.com
     * 2 - Verify we're on the homepage by capturing page title
     */
    @Override
    public String getCurrentPageTitle() {
        return super.getCurrentPageTitle();
    }

    public void validateCurrentPage() {
        String actualTitle = getCurrentPageTitle();
        System.out.println("Page Title: " + actualTitle);

        Assert.assertEquals(actualTitle, expectedElementHomepageTitle, "HOMEPAGE TITLE DOES NOT MATCH");
    }

    /**
     * Test Case 2 - Validate number of elements in "Top Events" dropdown menu list
     * 1 - Navigate to http://espn.com
     * 2 - Click on "Top Events" dropdown menu
     * 3 - Verify number of links present in "Top Events" dropdown menu
     */
    public int topEventsDropdownList() {
        mouseHover(topEventsDropdown);
        List<WebElement> topEventsDropDownList = getListOfWebElementsByXpath(topEventsDropdownMenu, webElementTopEventsDropdownMenuItems);
        int listSize = topEventsDropDownList.size();

        return listSize;
    }

    public void validateTopEventsDropdownListSizeAndLinks() {
        int actualListSize = topEventsDropdownList();

        System.out.println("Size of 'Top Events' Dropdown List: " + actualListSize);
        Assert.assertEquals(actualListSize, expectedElementTopEventsDropdownCount, "LIST SIZE DOES NOT MATCH");
    }


    /**
     * Test Case 3 - Validate header scroll
     * 1 - Navigate to http://espn.com
     * 2 - Click on arrow (right) to scroll header
     * 3 - Click on arrow (left) to scroll header back
     * 4 - Verify functionality of header scroll
     */
    public boolean scrollHeader() throws Exception {
        WebDriverWait expWait = new WebDriverWait(driver, 10);

        try {
            expWait.until(ExpectedConditions.elementToBeClickable(headerScrollRight));
            headerScrollRight.click();
        } catch (Exception e) {
            System.out.println("COULD NOT CLICK ON RIGHT SCROLL ON 1st ATTEMPT --- TRYING AGAIN");
            expWait.until(ExpectedConditions.elementToBeClickable(headerScrollRight));
            headerScrollRight.click();
        }

        try {
            expWait.until(ExpectedConditions.elementToBeClickable(headerScrollLeft));
            headerScrollLeft.click();
        } catch (Exception e1) {
            expWait.until(ExpectedConditions.elementToBeClickable(headerScrollLeft));
            headerScrollLeft.click();
        }

        boolean isPresent = false;

        if (ufcHeaderTile.isDisplayed()) {
            isPresent = true;
            return isPresent;
        } else if (!(ufcHeaderTile.isDisplayed())) {
            isPresent = false;
            return isPresent;
        }
        return isPresent;
    }

    public void validateScrollHeader() throws Exception {
        boolean actualScroll = scrollHeader();
        System.out.println("Header Scroll: " + actualScroll);
        Assert.assertEquals(actualScroll, true, "COULD NOT SCROLL ON HEADER");
    }


    /**
     * Test Case 4 - NFL Dropdown Menu (Left Div)
     * 1 - Navigate to http://espn.com
     * 2 - Hover over NFL Dropdown on header bar
     * 3 - Verify there are 9 elements located on left menu of NFL Dropdown menu
     * 4 - Verify all expected names
     */
    public List<WebElement> getNFLDropdownMenuLeft() {
        mouseHover(nflDropdown);
//        List<WebElement> nflDropdownElementsLeftList = getListOfWebElementsByCss(nflDropdownMenuLeft, webElementNFLDropdownMenuItemsLeft);

        List<WebElement> nflDropdownElementsLeftList = nflDropdownMenuLeft.findElements(By.cssSelector(webElementNFLDropdownMenuItemsLeft));

        return nflDropdownElementsLeftList;
    }

    public void validateNFLDropdownMenuLeftSize() {
        int actualSize = getNFLDropdownMenuLeft().size();
        System.out.println("Number of elements in NFL Menu (Left Side): " + actualSize);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualSize, expectedHeaderDropdownListSize, "SIZE OF LIST (NFL MENU LEFT) DOES NOT MATCH");
        softAssert.assertAll();
    }

    public void validateNFLDropdownMenuLeftItemsText() {
        List<WebElement> nflDropdownElementsLeftList = getNFLDropdownMenuLeft();
        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < nflDropdownElementsLeftList.size(); i++) {
            String actualText = nflDropdownElementsLeftList.get(i).getAttribute("innerHTML");
            System.out.println(nflDropdownElementsLeftList.get(i).getAttribute("innerHTML"));
            softAssert.assertEquals(actualText, expectedElementNFLDropdownMenuItemsLeft[i], "ELEMENT OF LIST AT POSITION " + i + " (NFL MENU LEFT) DOES NOT MATCH");
        }
        softAssert.assertAll();
    }

    /**
     * Test Case 5 - NFL Dropdown Menu 2 (Left Div)
     * 1 - Navigate to http://espn.com
     * 2 - Hover over NFL Dropdown on header bar
     * 3 - Navigate to the 9 links located on left side of dropdown menu (Home, Scores, Schedule, Teams, Standings,
     * Stats, Draft, Depth Charts, Free Agency)
     * 4 - Verify all links
     * 5 - COULD NOT PERFORM ----> (Verify page titles for each link)
     */
//    public String[] getNFLDropdownMenuLeftPageTitles() {
//        Actions hover = new Actions(driver);
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//
//        List<WebElement> nflMenuListLeft = getListOfWebElementsByCss(nflDropdownMenuLeft, webElementNFLDropdownMenuLinksLeft);
//        String[] nflMenuListLeftTitles = new String[nflMenuListLeft.size()];
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        for (int i = 0; i < nflMenuListLeft.size(); i++) {
//            try {
//                wait.until(ExpectedConditions.elementToBeClickable(nflDropdown));
//                hover.moveToElement(nflDropdown).perform();
//
//            } catch (Exception exception) {
//                System.out.println("COULD NOT HOVER ON ELEMENT " + i + " --- TRYING AGAIN");
//                exception.getMessage();
//                hover.moveToElement(nflDropdown).perform();
//            }
//
//            try {
//                wait.until(ExpectedConditions.elementToBeClickable(nflMenuListLeft.get(i)));
//                nflMenuListLeft.get(i).click();
//
//            } catch (Exception exception2) {
//                System.out.println("UNABLE TO CLICK ON ELEMENT " + i + " --- TRYING AGAIN");
//                exception2.getMessage();
//
//                wait.until(ExpectedConditions.elementToBeClickable(nflMenuListLeft.get(i)));
//                js.executeScript("arguments[0].click();", nflMenuListLeft.get(i));
//                nflMenuListLeft.get(i).click();
//            }
//
//            try {
//                wait.until(ExpectedConditions.titleIs(expectedElementNFLDropdownMenuLeftPageTitles[i]));
//                nflMenuListLeftTitles[i] = driver.getTitle();
//                navigateBack();
//
//            } catch (Exception exception3) {
//                System.out.println("COULD NOT GET TITLE FOR ELEMENT " + i + " --- TRYING AGAIN");
//                wait.until(ExpectedConditions.titleIs(expectedElementNFLDropdownMenuLeftPageTitles[i]));
//                nflMenuListLeftTitles[i] = js.executeScript("return document.title;").toString();
//                navigateBack();
//            }
//            wait.until(ExpectedConditions.titleIs(expectedElementHomepageTitle));
//        }
//        return nflMenuListLeftTitles;
//    }
//
//    public void validateNFLDropdownMenuLeftTitles() throws Exception {
//        String[] actualNFLDropdownMenuLeftPageTitles = getNFLDropdownMenuLeftPageTitles();
//        SoftAssert softAssert = new SoftAssert();
//
//        for (int i = 0; i < actualNFLDropdownMenuLeftPageTitles.length; i++) {
//            System.out.println(actualNFLDropdownMenuLeftPageTitles[i]);
//            softAssert.assertEquals(actualNFLDropdownMenuLeftPageTitles[i], expectedElementNFLDropdownMenuLeftPageTitles[i], "LINK AT POSITION " + i + " (NFL MENU LEFT) DOES NOT MATCH");
//        }
//        softAssert.assertAll();
//    }
    public String[] getNFLDropdownMenuLeftLinks() {
        Actions hover = new Actions(driver);
        hover.moveToElement(nflDropdown).perform();

        List<WebElement> nflMenuListLeft = getListOfWebElementsByCss(nflDropdownMenuLeft, webElementNFLDropdownMenuLinksLeft);
        String[] nflMenuListLeftLinks = new String[nflMenuListLeft.size()];

        for (int i = 0; i < nflMenuListLeft.size(); i++) {
            nflMenuListLeftLinks[i] = nflMenuListLeft.get(i).getAttribute("href");
        }
        return nflMenuListLeftLinks;
    }

    public void validateNFLDropdownMenuLeftLinks() {
        String[] actualNFLDropdownMenuLeftPageLinks = getNFLDropdownMenuLeftLinks();
        SoftAssert softAssert = new SoftAssert();

        System.out.println("Total Number of Links (NFL Menu Dropdown - LEFT): " + actualNFLDropdownMenuLeftPageLinks.length);
        for (int i = 0; i < actualNFLDropdownMenuLeftPageLinks.length; i++) {
            System.out.println(actualNFLDropdownMenuLeftPageLinks[i]);
            softAssert.assertEquals(actualNFLDropdownMenuLeftPageLinks[i], expectedElementNFLDropdownMenuLeftLinks[i], "LINK AT POSITION " + i + " (NFL MENU LEFT) DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 6 - NFL Dropdown Menu (NFL Divisions)
     * 1 - Navigate to http://espn.com
     * 2 - Hover over NFL Dropdown on header bar
     * 3 - Verify each NFL division by name
     */
    public String[] getNFLDropdownMenuRightNFLDivisionNames() {
        Actions hover = new Actions(driver);
        try {
            hover.moveToElement(nflDropdown).perform();
        } catch (StaleElementReferenceException exception) {
            exception.getMessage();
            System.out.println("COULD NOT HOVER - TRYING AGAIN");
            hover.moveToElement(nflDropdown).perform();
        }

        List<WebElement> nflDivisions = nflDropdownMenuRight.findElements(By.cssSelector(webElementNFLDropdownMenuDivisions));
        String[] nflDivision = new String[nflDivisions.size()];

        for (int i = 0; i < nflDivisions.size(); i++) {
            nflDivision[i] = nflDivisions.get(i).getAttribute("innerHTML");
        }
        return nflDivision;
    }

    public void validateNFLDropdownMenuRightNFLDivisionNames() {
        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < getNFLDropdownMenuRightNFLDivisionNames().length; i++) {
            System.out.println(getNFLDropdownMenuRightNFLDivisionNames()[i]);
            softAssert.assertEquals(getNFLDropdownMenuRightNFLDivisionNames()[i], expectedElementNFLDivisions[i], "NFL DIVISION AT POSITION" + i + " (NFL MENU RIGHT) DOES NOT MATCH");
        }
    }


    /**
     * Test Case 7 - NFL Dropdown Menu (NFL Teams)
     * 1 - Navigate to http://espn.com
     * 2 - Hover over NFL Dropdown on header bar
     * 3 - Verify there are 32 NFL teams
     * 4 - Verify each team name
     */
    public String[] getNFLDropdownMenuRightNFLTeams() {
        Actions hover = new Actions(driver);
        try {
            hover.moveToElement(nflDropdown).perform();
        } catch (StaleElementReferenceException exception) {
            exception.getMessage();
            System.out.println("COULD NOT HOVER - TRYING AGAIN");
            hover.moveToElement(nflDropdown).perform();
        }

        List<WebElement> nflTeamsList = nflDropdownMenuRight.findElements(By.cssSelector(webElementNFLDropdownMenuTeams));
        String[] nflTeams = new String[nflTeamsList.size()];

        for (int i = 0; i < nflTeamsList.size(); i++) {
            nflTeams[i] = nflTeamsList.get(i).getAttribute("innerHTML");
        }
        return nflTeams;
    }

    public void validateNFLDropdownMenuRightNFLTeamsCount() {
        int actualNFLTeamsCount = getNFLDropdownMenuRightNFLTeams().length;
        System.out.println("Number of NFL Teams counted: " + actualNFLTeamsCount);
        Assert.assertEquals(actualNFLTeamsCount, expectedNFLTeamsCount, "NUMBER OF EXPECTED NFL TEAMS & NUMBER OF COUNTED NFL TEAMS DO NOT MATCH");
    }

    public void validateNFLDropdownMenuRightNFLTeams() {
        SoftAssert softAssert = new SoftAssert();
        String[] actualNFLTeams = getNFLDropdownMenuRightNFLTeams();

        for (int i = 0; i < actualNFLTeams.length; i++) {
            System.out.println(actualNFLTeams[i]);
            softAssert.assertEquals(actualNFLTeams[i], expectedNFLTeamNames[i], "TEAM NAME AT INDEX " + i + " DOES NOT MATCH");
        }
    }


    /**
     * Test Case 8 - NBA Dropdown Menu (Left Div)
     * 1 - Navigate to http://espn.com
     * 2 - Hover over NBA Dropdown on header bar
     * 3 - Verify there are 9 elements located on left menu of NBA Dropdown menu
     * 4 - Verify all expected names
     */
    public List<WebElement> getNBADropdownMenuLeft() {
        mouseHover(nbaDropdown);
        List<WebElement> nbaDropdownElementsLeftList = getListOfWebElementsByCss(nbaDropdownMenuLeft, webElementNBADropdownMenuItemsLeft);

        return nbaDropdownElementsLeftList;
    }

    public void validateNBADropdownMenuLeftSize() {
        int actualSize = getNBADropdownMenuLeft().size();
        System.out.println("Number of elements in NBA Menu (Left Side): " + actualSize);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualSize, expectedHeaderDropdownListSize, "SIZE OF LIST (NBA MENU LEFT) DOES NOT MATCH");
        softAssert.assertAll();
    }

    public void validateNBADropdownMenuLeftItemsText() {
        List<WebElement> nbaDropdownElementsLeftList = getNBADropdownMenuLeft();
        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < nbaDropdownElementsLeftList.size(); i++) {
            String actualText = nbaDropdownElementsLeftList.get(i).getAttribute("innerHTML");
            System.out.println(nbaDropdownElementsLeftList.get(i).getAttribute("innerHTML"));
            softAssert.assertEquals(actualText, expectedElementNBADropdownMenuItemsLeft[i], "ELEMENT OF LIST AT POSITION " + i + " (NBA MENU LEFT) DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 9 - NBA Dropdown Menu 2 (Left Div)
     * 1 - Navigate to http://espn.com
     * 2 - Hover over NBA Dropdown on header bar
     * 3 - Navigate to the 9 links located on left side of dropdown menu (Home, Orlando Playoffs, The Last Dance, Scores,
     * Schedule, Standings, Stats, Teams, Draft)
     * 4 - Verify all links
     * 5 - COULD NOT PERFORM ----> (Verify page titles for each link)
     */
    public String[] getNBADropdownMenuLeftLinks() {
        mouseHover(nbaDropdown);

        List<WebElement> nbaMenuListLeft = getListOfWebElementsByCss(nbaDropdownMenuLeft, webElementNBADropdownMenuLinksLeft);
        String[] nbaMenuListLeftLinks = new String[nbaMenuListLeft.size()];

        for (int i = 0; i < nbaMenuListLeft.size(); i++) {
            nbaMenuListLeftLinks[i] = nbaMenuListLeft.get(i).getAttribute("href");
        }
        return nbaMenuListLeftLinks;
    }

    public void validateNBADropdownMenuLeftLinks() {
        String[] actualNBADropdownMenuLeftPageLinks = getNBADropdownMenuLeftLinks();
        SoftAssert softAssert = new SoftAssert();

        System.out.println("Total Number of Links (NBA Menu Dropdown - LEFT): " + actualNBADropdownMenuLeftPageLinks.length);
        for (int i = 0; i < actualNBADropdownMenuLeftPageLinks.length; i++) {
            System.out.println(actualNBADropdownMenuLeftPageLinks[i]);
            softAssert.assertEquals(actualNBADropdownMenuLeftPageLinks[i], expectedElementNBADropdownMenuLeftLinks[i], "LINK AT POSITION " + i + " (NBA MENU LEFT) DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 10 - NBA Dropdown Menu (Right Div) (NBA Divisions)
     * 1 - Navigate to http://espn.com
     * 2 - Hover over NBA Dropdown on header bar
     * 3 - Verify each NBA division by name
     */
    public String[] getNBADropdownMenuRightNBADivisionNames() {
        mouseHover(nbaDropdown);

        List<WebElement> nbaDivisions = nbaDropdownMenuRight.findElements(By.cssSelector(webElementNBADropdownMenuDivisions));
        String[] nflDivision = new String[nbaDivisions.size()];

        for (int i = 0; i < nbaDivisions.size(); i++) {
            nflDivision[i] = nbaDivisions.get(i).getAttribute("innerHTML");
        }
        return nflDivision;
    }

    public void validateNBADropdownMenuRightNBADivisionNames() {
        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < getNBADropdownMenuRightNBADivisionNames().length; i++) {
            System.out.println(getNBADropdownMenuRightNBADivisionNames()[i]);
            softAssert.assertEquals(getNBADropdownMenuRightNBADivisionNames()[i], expectedElementNBADivisions[i], "NBA DIVISION AT POSITION" + i + " (NBA MENU RIGHT) DOES NOT MATCH");
        }
    }


    /**
     * Test Case 11 - NBA Dropdown Menu (Right Div) (NBA Teams)
     * 1 - Navigate to http://espn.com
     * 2 - Hover over NBA Dropdown on header bar
     * 3 - Verify there are 30 NBA teams
     * 4 - Verify each team name
     */


    public String[] getNBADropdownMenuRightNBATeams() {
        mouseHover(nbaDropdown);

        List<WebElement> nbaTeamsList = nbaDropdownMenuRight.findElements(By.cssSelector(webElementNBADropdownMenuTeams));
        String[] nflTeams = new String[nbaTeamsList.size()];

        for (int i = 0; i < nbaTeamsList.size(); i++) {
            nflTeams[i] = nbaTeamsList.get(i).getAttribute("innerHTML");
        }
        return nflTeams;
    }

    public void validateNBADropdownMenuRightNBATeamsCount() {
        int actualNBATeamsCount = getNBADropdownMenuRightNBATeams().length;
        System.out.println("Number of NBA Teams counted: " + actualNBATeamsCount);
        Assert.assertEquals(actualNBATeamsCount, expectedNBATeamsCount, "NUMBER OF EXPECTED NBA TEAMS & NUMBER OF COUNTED NBA TEAMS DO NOT MATCH");
    }

    public void validateNBADropdownMenuRightNBATeams() {
        SoftAssert softAssert = new SoftAssert();
        String[] actualNBATeams = getNBADropdownMenuRightNBATeams();

        for (int i = 0; i < actualNBATeams.length; i++) {
            System.out.println(actualNBATeams[i]);
            softAssert.assertEquals(actualNBATeams[i], expectedNBATeamNames[i], "TEAM NAME AT INDEX " + i + " DOES NOT MATCH");
        }
    }


    /**
     * Test Case 12 - MLB Dropdown Menu (Left Div)
     * 1 - Navigate to http://espn.com
     * 2 - Hover over MLB Dropdown on header bar
     * 3 - Verify there are 9 elements located on left menu of MLB Dropdown menu
     * 4 - Verify all expected names
     */
    public List<WebElement> getMLBDropdownMenuLeft() {
        mouseHover(mlbDropdown);
        List<WebElement> mlbDropdownElementsLeftList = getListOfWebElementsByCss(mlbDropdownMenuLeft, webElementMLBDropdownMenuItemsLeft);

        return mlbDropdownElementsLeftList;
    }

    public void validateMLBDropdownMenuLeftSize() {
        int actualSize = getMLBDropdownMenuLeft().size();
        System.out.println("Number of elements in MLB Menu (Left Side): " + actualSize);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualSize, expectedHeaderDropdownListSize, "SIZE OF LIST (MLB MENU LEFT) DOES NOT MATCH");
        softAssert.assertAll();
    }

    public void validateMLBDropdownMenuLeftItemsText() {
        List<WebElement> mlbDropdownElementsLeftList = getMLBDropdownMenuLeft();
        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < mlbDropdownElementsLeftList.size(); i++) {
            String actualText = mlbDropdownElementsLeftList.get(i).getAttribute("innerHTML");
            System.out.println(mlbDropdownElementsLeftList.get(i).getAttribute("innerHTML"));
            softAssert.assertEquals(actualText, expectedElementMLBDropdownMenuItemsLeft[i], "ELEMENT OF LIST AT POSITION " + i + " (MLB MENU LEFT) DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 13 - MLB Dropdown Menu 2 (Left Div)
     * 1 - Navigate to http://espn.com
     * 2 - Hover over MLB Dropdown on header bar
     * 3 - Navigate to the 9 links located on left side of dropdown menu (Home, Draft, When could MLB return?,
     *     KBO League, Teams, Scores, Schedule, Standings, Stats)
     * 4 - Verify all links
     * 5 - COULD NOT PERFORM ----> (Verify page titles for each link)
     */

    public String[] getMLBDropdownMenuLeftLinks() {
        mouseHover(mlbDropdown);

        List<WebElement> mlbMenuListLeft = getListOfWebElementsByCss(mlbDropdownMenuLeft, webElementMLBDropdownMenuLinksLeft);
        String[] mlbMenuListLeftLinks = new String[mlbMenuListLeft.size()];

        for (int i = 0; i < mlbMenuListLeft.size(); i++) {
            mlbMenuListLeftLinks[i] = mlbMenuListLeft.get(i).getAttribute("href");
        }
        return mlbMenuListLeftLinks;
    }

    public void validateMLBDropdownMenuLeftLinks() {
        String[] actualMLBDropdownMenuLeftPageLinks = getMLBDropdownMenuLeftLinks();
        SoftAssert softAssert = new SoftAssert();

        System.out.println("Total Number of Links (MLB Menu Dropdown - LEFT): " + actualMLBDropdownMenuLeftPageLinks.length);
        for (int i = 0; i < actualMLBDropdownMenuLeftPageLinks.length; i++) {
            System.out.println(actualMLBDropdownMenuLeftPageLinks[i]);
            softAssert.assertEquals(actualMLBDropdownMenuLeftPageLinks[i], expectedElementMLBDropdownMenuLeftLinks[i], "LINK AT POSITION " + i + " (MLB MENU LEFT) DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


    /**
     * Test Case 14 - MLB Dropdown Menu (Right Div) (MLB Divisions)
     * 1 - Navigate to http://espn.com
     * 2 - Hover over MLB Dropdown on header bar
     * 3 - Verify each MLB division by name
     */
    public String[] getMLBDropdownMenuRightMLBDivisionNames() {
        mouseHover(mlbDropdown);

        List<WebElement> mlbDivisions = mlbDropdownMenuRight.findElements(By.cssSelector(webElementMLBDropdownMenuDivisions));
        String[] mlbDivision = new String[mlbDivisions.size()];

        for (int i = 0; i < mlbDivisions.size(); i++) {
            mlbDivision[i] = mlbDivisions.get(i).getAttribute("innerHTML");
        }
        return mlbDivision;
    }

    public void validateMLBDropdownMenuRightMLBDivisionNames() {
        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < getMLBDropdownMenuRightMLBDivisionNames().length; i++) {
            System.out.println(getMLBDropdownMenuRightMLBDivisionNames()[i]);
            softAssert.assertEquals(getMLBDropdownMenuRightMLBDivisionNames()[i], expectedElementMLBDivisions[i], "MLB DIVISION AT POSITION" + i + " (MLB MENU RIGHT) DOES NOT MATCH");
        }
    }


    /**
     * Test Case 15 - MLB Dropdown Menu (Right Div) (MLB Teams)
     * 1 - Navigate to http://espn.com
     * 2 - Hover over MLB Dropdown on header bar
     * 3 - Verify there are 30 MLB teams
     * 4 - Verify each team name
     */
    public String[] getMLBDropdownMenuRightMLBTeams() {
        mouseHover(mlbDropdown);

        List<WebElement> mlbTeamsList = mlbDropdownMenuRight.findElements(By.cssSelector(webElementMLBDropdownMenuTeams));
        String[] mlbTeams = new String[mlbTeamsList.size()];

        for (int i = 0; i < mlbTeamsList.size(); i++) {
            mlbTeams[i] = mlbTeamsList.get(i).getAttribute("innerHTML");
        }
        return mlbTeams;
    }

    public void validateMLBDropdownMenuRightMLBTeamsCount() {
        int actualMLBTeamsCount = getMLBDropdownMenuRightMLBTeams().length;
        System.out.println("Number of MLB Teams counted: " + actualMLBTeamsCount);
        Assert.assertEquals(actualMLBTeamsCount, expectedMLBTeamsCount, "NUMBER OF EXPECTED MLB TEAMS & NUMBER OF COUNTED MLB TEAMS DO NOT MATCH");
    }

    public void validateMLBDropdownMenuRightMLBTeams() {
        SoftAssert softAssert = new SoftAssert();
        String[] actualMLBTeams = getMLBDropdownMenuRightMLBTeams();

        for (int i = 0; i < actualMLBTeams.length; i++) {
            System.out.println(actualMLBTeams[i]);
            softAssert.assertEquals(actualMLBTeams[i], expectedMLBTeamNames[i], "TEAM NAME AT INDEX " + i + " DOES NOT MATCH");
        }
    }



    /**
     * BODY
     */

    /**
     * Test Case 16 - Login
     * 1 - Navigate to http://espn.com
     * 2 - Scroll down the page and click on "Login" button
     * 3 - Pop-up should appear, containing username/email input & password input - Enter username/password
     * 4 - Click 'Login' button
     * 5 - Verify Error message that is displayed with invalid credentials
     */
    public void validateLogin(){
        WebDriverWait wait = new WebDriverWait(driver, 10);

        clickOnElement(buttonLogin);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));

        inputUsernameEmailAddress.sendKeys("DemoAccount1");
        inputPassword.sendKeys("demoPassword");
        buttonLoginFormLogin.click();

        wait.until(ExpectedConditions.textToBePresentInElement(errorLoginMessage, expectedElementLoginErrorMessage));
        System.out.println("Error Message: "+errorLoginMessage.getText());
        Assert.assertEquals(errorLoginMessage.getText(), expectedElementLoginErrorMessage, "LOGIN ERROR DOES NOT MATCH");
    }


    /**
     * Test Case 17 - ESPN Sites Container Name & List Count
     * 1 - Navigate to http://espn.com
     * 2 - Verify title in header of container on left side of body (ESPN Sites)
     * 3 - Verify number of elements contained within container
     */

    public void validateESPNSitesContainerHeadingAndCount(){
        SoftAssert softAssert = new SoftAssert();

        String actualHeaderTitle = containerESPNSitesHeader.getText();
        System.out.println("Title of ESPN Sites container: "+actualHeaderTitle);

        List<WebElement> listESPNSitesList = containerESPNSitesList.findElements(By.cssSelector(webElementsContainerESPNSitesListItems));
        int actualESPNSitesListCount = listESPNSitesList.size();
        System.out.println("Count of items within ESPN Sites container: "+actualESPNSitesListCount);
        softAssert.assertEquals(actualHeaderTitle, expectedElementESPNSitesHeaderTitle, "'ESPN SITES' CONTAINER HEADER TITLE (LEFT BODY) DOES NOT MATCH");
        softAssert.assertEquals(actualESPNSitesListCount, expectedElementESPNSitesListCount, "'ESPN SITES' CONTAINER LIST COUNT (LEFT BODY) DOES NOT MATCH");
    }


    /**
     * Test Case 18 - ESPN Sites Container List Item Names
     * 1 - Navigate to http://espn.com
     * 2 - Verify the name of each item contained within container
     */
    public void validateESPNSitesContainerListItemNames(){
        SoftAssert softAssert = new SoftAssert();

        List<WebElement> listESPNSitesList = containerESPNSitesList.findElements(By.cssSelector(webElementsContainerESPNSitesListItems));
        int i=0;
        for(WebElement element : listESPNSitesList){
            System.out.println(element.getAttribute("innerHTML"));
            softAssert.assertEquals(element.getAttribute("innerHTML"), expectedElementsESPNSitesListItemNames[i], "LIST ITEM (ESPN SITES CONTAINER) AT INDEX "+i+" DOES NOT MATCH");
            i++;
        }
    }


    /**
     * Test Case 19 - Follow ESPN Container Name & List Count
     * 1 - Navigate to http://espn.com
     * 2 - Verify title in header of container on left side of body (Follow ESPN)
     * 3 - Verify number of elements contained within container
     */
    public void validateFollowESPNContainerHeadingAndCount(){
        SoftAssert softAssert = new SoftAssert();

        String actualHeaderTitle = containerFollowESPNHeader.getText();
        System.out.println("Title of Follow ESPN container: "+actualHeaderTitle);

        List<WebElement> listESPNSitesList = containerFollowESPNList.findElements(By.cssSelector(webElementsContainerFollowESPNListItems));
        int actualESPNSitesListCount = listESPNSitesList.size();
        System.out.println("Count of items within Follow ESPN container: "+actualESPNSitesListCount);
        softAssert.assertEquals(actualHeaderTitle, expectedElementFollowESPNHeaderTitle, "'FOLLOW ESPN' CONTAINER HEADER TITLE (LEFT BODY) DOES NOT MATCH");
        softAssert.assertEquals(actualESPNSitesListCount, expectedElementFollowESPNListCount, "'FOLLOW ESPN' CONTAINER LIST COUNT (LEFT BODY) DOES NOT MATCH");
    }


    /**
     * Test Case 20 - Follow ESPN Container List Item Names
     * 1 - Navigate to http://espn.com
     * 2 - Verify the name of each item contained within container (Follow ESPN)
     */
    public void validateFollowESPNContainerListItemNames(){
        SoftAssert softAssert = new SoftAssert();

        List<WebElement> listESPNSitesList = containerFollowESPNList.findElements(By.cssSelector(webElementsContainerFollowESPNListItems));
        int i=0;
        for(WebElement element : listESPNSitesList){
            System.out.println(element.getAttribute("innerHTML"));
            softAssert.assertEquals(element.getAttribute("innerHTML"), expectedElementsFollowESPNListItemNames[i], "LIST ITEM (FOLLOW ESPN) AT INDEX "+i+" DOES NOT MATCH");
            i++;
        }
    }
}