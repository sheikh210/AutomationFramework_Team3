package homepage;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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

    @FindBy(xpath = webElementNFLDropdown)
    public WebElement nflDropdown;

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
     * 2 - Capture page title and match with expected page title
     */
  //@Override
   public String getCurrentPageTitle() {
        return getCurrentPageTitle();
    }
    public void validateCurrentPage(){
        String actualTitle = getCurrentPageTitle();
        String expectedTitle = "ESPN: Serving sports fans. Anytime. Anywhere.";

        Assert.assertEquals(actualTitle, expectedTitle, "Homepage title does not match");
    }

    /**
     * Test Case 2 - Validate number of elements in "Top Events" dropdown menu list
     * 1 - Navigate to http://espn.com
     * 2 - Click on "Top Events" dropdown menu
     * 3 - Capture number of links present in "Top Events" dropdown menu
     */
//    public int topEventsDropdownList(){
//        mouseHover(topEventsDropdown);
//        List<WebElement> topEventsDropDownList = getListOfWebElementsByXpath(topEventsDropdownMenu,"//*[@id=\"global-scoreboard\"]/div/div/div[1]/div[2]/ul/li/a");
//        int listSize = topEventsDropDownList.size();
//
//        return listSize;
//    }
//    public void validateTopEventsDropdownListSizeAndLinks(){
//        int actualListSize = topEventsDropdownList();
//        int expectedListSize = 8;
//
//        Assert.assertEquals(actualListSize, expectedListSize, "List size does not match");
//    }

    /**
     * Test Case 3 - Validate mouse-over changes "Featured" box and links to appropriate page
     * 1 - Navigate to http://espn.com
     * 2 - Hover over "Featured" hover box (located directly to the right)
     * 3 - Validate box changes to display text "Full Coverage"
     * 4 - Validate box links to appropriate page when clicked
     */
//    public String featuredBoxHoverTextAndLink(){
//        String hiddenText;
//        String featuredBoxURL;
//        mouseHover(featuredHoverBox);
//        hiddenText=featuredHoverHidden.getText();
//        featuredBoxURL=featuredHoverHidden.getAttribute("innerHTML").trim();
//
//        return hiddenText+"\n"+featuredBoxURL;
//    }
//    public void validateFeaturedBox(){
//        Assert.assertEquals(featuredBoxHoverTextAndLink(), "Full Coverage\nhttps://fantasy.espn.com/games/ufc-250-pickem/make-picks?addata=ufc250pickem_ufc_web_headerscoreboard_p1");
//    }



    /**
     * Test Case  - NFL Dropdown Menu (Left Div)
     *      * 1 - Navigate to http://espn.com
     *      * 2 - Hover over NFL Dropdown on header bar
     *      * 3 - Ensure there are 9 links located on left side of dropdown menu (Home, Scores, Schedule, Teams, Standings,
     *      *     Stats, Draft, Depth Charts, Free Agency), and capture links
     */

}