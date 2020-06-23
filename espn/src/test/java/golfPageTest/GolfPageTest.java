package golfPageTest;

import commonAPI.WebAPI;
import golf.GolfPage;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GolfPageTest extends WebAPI {
    static GolfPage golfPage;
    public static void getInItElements(){
        golfPage = PageFactory.initElements(driver,GolfPage.class);

    }
    @Test
    public static void testGolfPageUrl(){
        getInItElements();
        String actualUrl = golfPage.validateGolfPageUrl();
        String expectedUrl = "https://www.espn.com/golf/";
        Assert.assertEquals(actualUrl,expectedUrl,"Expected url does not match");
    }
    @Test
    public static void testScoresSubMenuIsAvailable(){
        getInItElements();
        boolean actualValue = golfPage.validateScoresSubMenuIsAvailable();
        Assert.assertEquals(actualValue,true,"Expected value not found");
    }
    @Test
    public static void testScheduleSubMenuIsAvailable(){
        getInItElements();
        boolean actualValue = golfPage.validateScheduleSubMenuIsAvailable();
        Assert.assertEquals(actualValue,true);
    }
    @Test
    public static void testHomeSubMenuIsAvailable(){
        getInItElements();
        boolean actualValue = golfPage.validateHomeSubMenuIsAvailable();
        Assert.assertEquals(actualValue,true);
    }
    @Test
    public static void testRankingSubMenuIsAvailable(){
        getInItElements();
        boolean actualValue = golfPage.validateRankingSubMenuIsAvailable();
        Assert.assertEquals(actualValue,true);
    }
    @Test
    public static void testStandingsSubMenuIsAvailabel(){
        getInItElements();
        boolean actualValue = golfPage.validateStandingsSubMenuIsAvailable();
        Assert.assertEquals(actualValue,true);
    }
    @Test
    public static void testStatsSubMenuIsAvailable(){
        getInItElements();
        boolean actualValue = golfPage.validateStatsSubMenuIsAvailable();
        Assert.assertEquals(actualValue,true);
    }
    @Test
    public static  void testPlayersSubMenuIsAvailable(){
        getInItElements();
        boolean actualValue = golfPage.validatePlayersSubMenuIsAvailable();
        Assert.assertEquals(actualValue,true);
    }
    @Test
    public static void testMasterComSubMenuIsAvailable(){
        getInItElements();
        boolean actualValue = golfPage.validateMasterComSubMenuIsAvailable();
        Assert.assertEquals(actualValue,true);
    }
    @Test
    public static void testFedExCupSubMenuIsAvailable(){
        getInItElements();
        boolean actualValue = golfPage.validateFedExCupSubMenuIsAvaialble();
        Assert.assertEquals(actualValue,true);
    }
    @Test
    public static void testGolfPageTitle(){
        getInItElements();
        String actualTitle = golfPage.validateGolfPageTitle();
        String expectedTitle="Golf News, Scores, Players, Schedule and Courses - Golf - ESPN";
        Assert.assertEquals(actualTitle,expectedTitle,"Does not match");
    }
    @Test
    public static void testStreakPage(){
        getInItElements();
        String actualUrl = golfPage.validateStreakPage();
        String expectedUrl = "http://fantasy.espn.com/streak/en/";
        Assert.assertEquals(actualUrl,expectedUrl,"Expected url not found");
    }
    @Test
    public static void testStreakPageTitle(){
        getInItElements();
        String actualTitle = golfPage.validateStreakPageTitle();
        String expectedTitle = "ESPN Streak - predict winners, build streaks, win prizes";
        Assert.assertEquals(actualTitle,expectedTitle,"Title doesnot match");
    }
    @Test
    public static void testFootballPageUrl(){
        getInItElements();
        String actualUrl = golfPage.validateFootballPageUrl();
        String expectedUrl ="https://www.espn.com/fantasy/football/";
        Assert.assertEquals(actualUrl,expectedUrl,"Expected Url doesnot match");

    }
    @Test
    public static void testFootballPageTitle(){
        getInItElements();
        String actualTitle = golfPage.validateFootballPageTitle();
        String expectedTitle = "Fantasy Football - Leagues, Rankings, News, Picks & More - ESPN";
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    @Test
    public static void testBasketballPageUrl(){
        getInItElements();
        String actualUrl = golfPage.validateBasketballPageUrl();
        String expectedUrl = "https://www.espn.com/fantasy/basketball/";
        Assert.assertEquals(actualUrl,expectedUrl);
    }
    @Test
    public static void testBasketballPageTitle(){
        getInItElements();
        String actualTitle = golfPage.validateBasketballPageTitle();
        String expectedTitle ="Fantasy Basketball - Leagues, Rankings, News, Picks & More - ESPN";
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    @Test
    public static void testBaseballPageUrl(){
        getInItElements();
        String actualUrl = golfPage.validateBaseballPageUrl();
        String expectedUrl = "https://www.espn.com/fantasy/baseball/";
        Assert.assertEquals(actualUrl,expectedUrl);
    }
    @Test
    public static void testBaseballPageTitle(){
        getInItElements();
        String actualTitle = golfPage.validateBaseballPageTitle();
        String expectedTitle ="Fantasy Baseball - Leagues, Rankings, News, Picks & More - ESPN";
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    @Test
    public static void testHockeyPageUrl(){
        getInItElements();
        String actualUrl = golfPage.validateHockeyPageUrl();
        String expectedUrl = "https://www.espn.com/fantasy/hockey/";
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    }
