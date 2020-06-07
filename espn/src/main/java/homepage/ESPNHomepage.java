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

    @FindBy(xpath = webElementFeaturedHoverBox)
    public WebElement featuredHoverBox;

    @FindBy(xpath = webElementFeaturedHoverHidden)
    public WebElement featuredHoverHidden;

    @FindBy(how = How.CSS, using = webElementHeaderScrollRight)
    public WebElement headerScrollRight;

    @FindBy(css = webElementHeaderScrollLeft)
    public WebElement headerScrollLeft;

    @FindBy(css = webElementNFLDropdown)
    public WebElement nflDropdown;

    @FindBy(xpath = webElementNFLDropdownMenuLeft)
    public WebElement nflDropdownMenuLeft;

    @FindBy(css = webElementNFLDropdownMenuRight)
    public WebElement nflDropdownMenuRight;

    @FindBy(xpath = webElementNBADropdown)
    public WebElement nbaDropdown;

    @FindBy(xpath = webElementMLBDropdown)
    public WebElement mlbDropdown;

    @FindBy(xpath = webElementNCAAFDropdown)
    public WebElement ncaafDropdown;

    @FindBy(xpath = webElementSoccerDropdown)
    public WebElement soccerDropdown;

    @FindBy(xpath = webElementMMADropdown)
    public WebElement mmaDropdown;


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
     * Test Case 3 - Validate mouse-over changes "Featured" box and links to appropriate page
     * 1 - Navigate to http://espn.com
     * 2 - Hover over "Featured" hover box (located directly to the right)
     * 3 - Verify box changes to display text "Full Coverage"
     * 4 - Verify box links to appropriate page when clicked
     */
    public String featuredBoxHoverTextAndLink() {
        String hiddenText;
        String featuredBoxURL;
        mouseHover(featuredHoverBox);
        hiddenText = featuredHoverHidden.getAttribute("innerHTML").trim();
        featuredBoxURL = featuredHoverHidden.getAttribute("href");

        return hiddenText + "\n" + featuredBoxURL;
    }

    public void validateFeaturedBox() {
        System.out.println(featuredBoxHoverTextAndLink());
        Assert.assertEquals(featuredBoxHoverTextAndLink(), expectedElementFeaturedHoverBoxLink);
    }


    /**
     * Test Case 4 - Validate header scroll
     * 1 - Navigate to http://espn.com
     * 2 - Click on arrow (right) to scroll header
     * 3 - Click on arrow (left) to scroll header back
     * 4 - Verify functionality of header scroll
     */
    public boolean scrollHeader() throws Exception {
        WebDriverWait expWait = new WebDriverWait(driver, 10);

        expWait.until(ExpectedConditions.elementToBeClickable(headerScrollRight));
        headerScrollRight.click();

        expWait.until(ExpectedConditions.elementToBeClickable(headerScrollLeft));
        headerScrollLeft.click();

        expWait.until(ExpectedConditions.elementToBeClickable(headerScrollRight));
        boolean isPresent = false;

        if (headerScrollRight.isDisplayed()) {
            isPresent = true;
            return isPresent;
        } else if (!(headerScrollRight.isDisplayed())) {
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
     * Test Case 5 - NFL Dropdown Menu (Left Div)
     * 1 - Navigate to http://espn.com
     * 2 - Hover over NFL Dropdown on header bar
     * 3 - Verify there are 9 elements located on left menu of NFL Dropdown menu
     * 4 - Verify all expected names
     */
    public List<WebElement> dropdownNFLMenuLeft() {
        mouseHover(nflDropdown);
        List<WebElement> nflDropdownElementsLeftList = getListOfWebElementsByCss(nflDropdownMenuLeft, webElementNFLDropdownMenuItemsLeft);

        return nflDropdownElementsLeftList;
    }

    public void validateNFLMenuLeftSize() {
        int actualSize = dropdownNFLMenuLeft().size();
        int expectedSize = 9;
        System.out.println("Number of elements in NFL Menu (Left Side): " + actualSize);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualSize, expectedSize, "SIZE OF LIST (NFL MENU LEFT) DOES NOT MATCH");
        softAssert.assertAll();
    }

    public void validateNFLMenuLeftItemsText() {
        List<WebElement> nflDropdownElementsLeftList = dropdownNFLMenuLeft();
        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < nflDropdownElementsLeftList.size(); i++) {
            String actualText = nflDropdownElementsLeftList.get(i).getAttribute("innerHTML");
            System.out.println(nflDropdownElementsLeftList.get(i).getAttribute("innerHTML"));
            softAssert.assertEquals(expectedElementNFLDropdownMenuItemsLeft[i], actualText, "ELEMENT OF LIST AT POSITION " + i + " (NFL MENU LEFT) DOES NOT MATCH");
        }
        softAssert.assertAll();
    }

    /**
     * Test Case 6 - NFL Dropdown Menu 2 (Left Div)
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
////                js.executeScript("arguments[0].click();", nflMenuListLeft.get(i));
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
//    public void validateDropdownNFLMenuLeftTitles() throws Exception {
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
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Actions hover = new Actions(driver);

        hover.moveToElement(nflDropdown).perform();

        List<WebElement> nflMenuListLeft = getListOfWebElementsByCss(nflDropdownMenuLeft, webElementNFLDropdownMenuLinksLeft);
        String[] nflMenuListLeftLinks = new String[nflMenuListLeft.size()];

        for (int i = 0; i < nflMenuListLeft.size(); i++) {
            nflMenuListLeftLinks[i] = nflMenuListLeft.get(i).getAttribute("href");
        }
        return nflMenuListLeftLinks;
    }

    public void validateDropdownNFLMenuLeftLinks() {
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
     * Test Case 7 - NFL Dropdown Menu (NFL Divisions)
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

    public void validateNFLDropdownMenuRightNFLDivisionNames(){
        SoftAssert softAssert = new SoftAssert();

        for (int i=0; i<getNFLDropdownMenuRightNFLDivisionNames().length; i++){
            System.out.println(getNFLDropdownMenuRightNFLDivisionNames()[i]);
            softAssert.assertEquals(getNFLDropdownMenuRightNFLDivisionNames()[i], expectedElementNFLDivisions[i], "NFL DIVISION AT POSITION" + i + " (NFL MENU RIGHT) DOES NOT MATCH");
        }
    }


    /**
     * Test Case 8 - NFL Dropdown Menu (NFL Teams)
     * 1 - Navigate to http://espn.com
     * 2 - Hover over NFL Dropdown on header bar
     * 3 - Verify there are 32 NFL teams
     * 4 - Verify each team name
     */

    // nflDropdownMenuRight
    // webElementNFLDropdownMenuTeams

    public String[] getNFLDropdownMenuRightNFLTeams(){
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

        for (int i=0;i<nflTeamsList.size();i++){
            nflTeams[i]=nflTeamsList.get(i).getAttribute("innerHTML");
        }
        return nflTeams;
    }

    public void validateNFLDropdownMenuRightNFLTeamsCount(){
        int actualNFLTeamsCount = getNFLDropdownMenuRightNFLTeams().length;
        System.out.println("Number of NFL Teams counted: "+actualNFLTeamsCount);
        Assert.assertEquals(actualNFLTeamsCount,expectedNFLTeamsCount, "NUMBER OF NFL TEAMS & NUMBER OF COUNTED NFL TEAMS DO NOT MATCH");
    }

    public void validateNFLDropdownMenuRightNFLTeams(){
        SoftAssert softAssert = new SoftAssert();
        String [] actualNFLTeams = getNFLDropdownMenuRightNFLTeams();

        for (int i=0; i<actualNFLTeams.length; i++){
            System.out.println(actualNFLTeams[i]);
            softAssert.assertEquals(actualNFLTeams[i], expectedNFLTeamNames[i], "TEAM NAME AT INDEX "+i+" DOES NOT MATCH");
        }

    }


    /**
     *
     */


}
