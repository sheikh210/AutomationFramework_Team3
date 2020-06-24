package espnMMAPageTest;

import commonAPI.WebAPI;
import mmaPage.ESPNMMAPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConnectToSqlDB;
import utilities.DataReader;
import java.io.IOException;

public class ESPNMMAPageTest extends WebAPI {
    static ESPNMMAPage espnMMAPage;
    String path = System.getProperty("user.dir") +"\\src\\main\\resources\\ESPNMMAPage_ExpectedWebElements.xlsx" ;
    DataReader dataReader = new DataReader();
    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    public static void getInItElements(){
        espnMMAPage = PageFactory.initElements(driver, ESPNMMAPage.class);
    }

    @Test(priority = 1)
    public void validatePageTitle() throws IOException, InterruptedException {
        getInItElements();
        Assert.assertTrue(espnMMAPage.validateMMAPageTitle());
    }

    @Test(priority = 2)
    public void validateSchedulePageTitle() throws IOException, InterruptedException {
        getInItElements();
        Assert.assertTrue(espnMMAPage.validateScheduleTitle());
    }

    @Test(priority = 3)
    public void validatePlayUfcPageTitle() throws IOException, InterruptedException {
        getInItElements();
        Assert.assertTrue(espnMMAPage.validatePlayUfcLink());
    }

    @Test(priority = 4)
    public void validateFlightCenterButton() throws IOException, InterruptedException {
        getInItElements();
        Assert.assertTrue(espnMMAPage.validateFlightCenterButton());
    }

    @Test(priority = 5)
    public void testValidateEspnBestFightLink() throws IOException, InterruptedException {
        getInItElements();
        Assert.assertTrue(espnMMAPage.validateEspnBestFightLink());
    }

    @Test(priority = 6)
    public void testValidateESPNPlusMenu() throws IOException, InterruptedException {
        getInItElements();
        Assert.assertTrue(espnMMAPage.validateESPNPlusMenu());
    }

    @Test(priority = 7)
    public void testValidateESPNMoreMenu() throws IOException, InterruptedException {
        getInItElements();
        Assert.assertTrue(espnMMAPage.validateMoreButton());
    }

    @Test(priority = 8)
    public void testValidateSubscribeLink() throws IOException, InterruptedException {
        getInItElements();
        Assert.assertTrue(espnMMAPage.validateSubscribeNowButton());
    }

    @Test(priority = 9)
    public void testValidateQuickLinks() throws IOException, InterruptedException {
        getInItElements();
        Assert.assertTrue(espnMMAPage.validateQuickLinksSection());
    }

    @Test(priority = 10)
    public void testValidateFantasySection() throws IOException, InterruptedException {
        getInItElements();
        Assert.assertTrue(espnMMAPage.validateFantasySection());
    }

    @Test(priority = 11)
    public void testValidateFantasySectionLinks() throws IOException, InterruptedException {
        getInItElements();
        Assert.assertTrue(espnMMAPage.validateFantasySectionLinks());
    }

    @Test(priority = 12)
    public void testValidateESPNSites() throws IOException, InterruptedException {
        getInItElements();
        Assert.assertTrue(espnMMAPage.validateESPNSites());
    }

    @Test(priority = 13)
    public void testValidateESPNSitesLinks() throws IOException, InterruptedException {
        getInItElements();
        Assert.assertTrue(espnMMAPage.validateESPNSitesLinks());
    }

    @Test(priority = 14)
    public void testValidateESPNAppsCount() throws IOException, InterruptedException {
        getInItElements();
        Assert.assertTrue(espnMMAPage.validateESPNAppsCount());
    }

    @Test(priority = 15)
    public void testValidateESPNAppsLinks() throws IOException, InterruptedException {
        getInItElements();
        Assert.assertTrue(espnMMAPage.validateESPNAppsLinks());
    }









}
