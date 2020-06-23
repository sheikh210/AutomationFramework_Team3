package golf;

import commonAPI.WebAPI;
import io.cucumber.java.bs.A;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static golf.GolfElements.*;



public class GolfPage extends WebAPI {


    @FindBy(how = How.XPATH,using = webElementGolfMenu)
    public WebElement golfMenu;
    @FindBy(how = How.XPATH,using = webElementNBAMenu)
    public WebElement nbaMenu;

    @FindBy(how = How.XPATH,using = webElementScores)
    public WebElement scores;

    @FindBy(how = How.XPATH,using = webElementSchedule)
    public WebElement schedule;

    @FindBy(how = How.XPATH,using = webElementHomes)
    public WebElement homes;

    @FindBy(how = How.XPATH,using = webElementRanking)
    public WebElement ranking;

    @FindBy(how = How.XPATH,using = webElementStandings)
    public WebElement standings;

    @FindBy(how = How.XPATH,using = webElementStats)
    public WebElement stats;

    @FindBy(how = How.XPATH,using = webElementPlayers)
    public WebElement players;

    @FindBy(how = How.XPATH,using = webElementMasterCom)
    public WebElement masterCom;

    @FindBy(how = How.XPATH,using = webElementFedExCup)
    public WebElement fedExCup;

    @FindBy(how = How.XPATH,using = webElementOfficialWorldGoldRanking)
    public WebElement officialWorldGoldRanking;

    @FindBy(how = How.XPATH,using = webElementStreak)
    public WebElement streak;

    @FindBy(how = How.XPATH,using = webElementFootball)
    public WebElement football;

    @FindBy(how = How.XPATH,using = webElementBasketball)
    public WebElement basketball;

    @FindBy(how = How.XPATH,using = webElementBaseball)
    public WebElement baseball;

    @FindBy(how = How.XPATH,using = webElementHockey)
    public WebElement hockey;


    public void navigateToGolfPage(){
        driver.get("https://www.espn.com/golf/");
      //driver.manage().deleteAllCookies();
      //driver.navigate().refresh();
    }
    //Test Case 1
    public String validateGolfPageUrl(){
        navigateToGolfPage();
        String url = super.getCurrentPageUrl();
        System.out.println("Golf page Url is " + url);
        return  url;
    }
    //Test 2
    public boolean validateScoresSubMenuIsAvailable(){
        navigateToGolfPage();
        Actions actions = new Actions(driver);
        actions.moveToElement(golfMenu).build().perform();
        boolean scoresSubMenuIsAvailable = scores.isDisplayed();
        return scoresSubMenuIsAvailable;
    }
    //Test 3
    public boolean validateScheduleSubMenuIsAvailable(){
        navigateToGolfPage();
        Actions actions = new Actions(driver);
        actions.moveToElement(golfMenu).build().perform();
        boolean scheduleSubMenuIsAvailable = schedule.isDisplayed();
        return scheduleSubMenuIsAvailable;
    }
    //Test 4
    public boolean validateHomeSubMenuIsAvailable(){
        navigateToGolfPage();
        Actions actions = new Actions(driver);
        actions.moveToElement(golfMenu).build().perform();
        boolean homesSubMenuIsAvailable = homes.isDisplayed();
        return homesSubMenuIsAvailable;
    }
    //Test 5
    public boolean validateRankingSubMenuIsAvailable(){
        navigateToGolfPage();
        Actions actions = new Actions(driver);
        actions.moveToElement(golfMenu).build().perform();
        boolean rankingSubMenuIsAvailable = ranking.isDisplayed();
        return rankingSubMenuIsAvailable;
    }
    //Test 6
    public boolean validateStandingsSubMenuIsAvailable(){
        navigateToGolfPage();
        Actions actions = new Actions(driver);
        actions.moveToElement(golfMenu).build().perform();
        boolean standingsSubMenuIsAvailable = standings.isDisplayed();
        return standingsSubMenuIsAvailable;
    }
    //Test 7
    public boolean validateStatsSubMenuIsAvailable(){
        navigateToGolfPage();
        Actions actions = new Actions(driver);
        actions.moveToElement(golfMenu).build().perform();
        boolean statsSubMneuIsAvailable = stats.isDisplayed();
        return statsSubMneuIsAvailable;
    }
    //Test 8
    public boolean validatePlayersSubMenuIsAvailable(){
        navigateToGolfPage();
        Actions actions = new Actions(driver);
        actions.moveToElement(golfMenu).build().perform();;
        boolean playersSubMenuIsAvailable = players.isDisplayed();
        return playersSubMenuIsAvailable;
    }
    //Test 9
    public boolean validateMasterComSubMenuIsAvailable(){
        navigateToGolfPage();
        Actions actions = new Actions(driver);
        actions.moveToElement(golfMenu).build().perform();
        boolean masterComSubMenuIsAvailable = masterCom.isDisplayed();
        return masterComSubMenuIsAvailable;
    }
    //Test 10
    public boolean validateFedExCupSubMenuIsAvaialble(){
        navigateToGolfPage();
        Actions actions = new Actions(driver);
        actions.moveToElement(golfMenu).build().perform();
        boolean fedExCupSubMenuIsAvailable = fedExCup.isDisplayed();
        return fedExCupSubMenuIsAvailable;
    }
    //Test 11
    public String validateGolfPageTitle(){
        navigateToGolfPage();
        String title = super.getCurrentPageTitle();
        System.out.println("Golf page title is" + title);
        return title;
    }
    //Test 12
    public String validateStreakPage(){
        navigateToGolfPage();
        streak.click();
        String streakPageUrl=super.getCurrentPageUrl();
        return streakPageUrl;
    }
    //Test 13
    public String validateStreakPageTitle(){
        navigateToGolfPage();
        streak.click();
        String streakPageTitle= super.getCurrentPageTitle();
        return streakPageTitle;
    }
    //Test14
    public String validateFootballPageUrl(){
        navigateToGolfPage();
        football.click();
        String footballPageUrl = super.getCurrentPageUrl();
        return footballPageUrl;
    }
    //Test 15
    public String validateFootballPageTitle(){
        navigateToGolfPage();
        football.click();
        String footballPageTitle = super.getCurrentPageTitle();
        return footballPageTitle;
    }
    //Test 16
    public String validateBasketballPageUrl(){
        navigateToGolfPage();
        basketball.click();
        String basketballPageUrl= super.getCurrentPageUrl();
        return basketballPageUrl;
    }
    //Test 17
    public String validateBasketballPageTitle(){
        navigateToGolfPage();
        basketball.click();
        String basketballPageTitle = super.getCurrentPageTitle();
        return basketballPageTitle;
    }
    //Test 18
    public String validateBaseballPageUrl(){
        navigateToGolfPage();
        baseball.click();
        String baseballPageUrl = super.getCurrentPageUrl();
        return baseballPageUrl;
    }
    //Test 19
    public String validateBaseballPageTitle(){
        navigateToGolfPage();
        baseball.click();
        String baseballPageTitle = super.getCurrentPageTitle();
        return baseballPageTitle;
    }
    //Test 20
    public String validateHockeyPageUrl(){
        navigateToGolfPage();
        hockey.click();
        String hockeyPageUrl = super.getCurrentPageUrl();
        return hockeyPageUrl;
    }


















}
