package mmaPage;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConnectToSqlDB;
import utilities.DataReader;

import javax.xml.xpath.XPath;
import java.io.IOException;

import static mmaPage.ESPNMMAPageElements.*;

public class ESPNMMAPage extends WebAPI {
    String path = System.getProperty("user.dir") +"\\src\\main\\resources\\ESPNMMAPage_ExpectedWebElements.xlsx" ;
    WebDriverWait wait = new WebDriverWait(driver, 10);
    DataReader dataReader = new DataReader();
    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    /**
     * Navigate to MMA page elements
     */
    @FindBy(xpath = WebElementMMAButton)
    public WebElement mmaButton;
    @FindBy(xpath = WebElementMMAHomeButton)
    public WebElement mmaHomeButton;

    /**
     * Header
     * @throws InterruptedException
     */
    @FindBy(xpath = WebElementMMAScheduleButton)
    public WebElement scheduleButton;
    @FindBy(xpath = WebElementPlayUFCFightButton)
    public WebElement playUFCFightButton;
    @FindBy(xpath = WebElementFightCenterButton)
    public WebElement fightCenterButton;
    @FindBy(xpath = WebElementESPNBestFightsButton)
    public WebElement eSPNBestFightsButton;
    @FindBy(xpath = WebElementESPNBestMenu)
    public WebElement espnBestMenu;
    @FindBy(xpath = webElementMoreButton)
    public WebElement moreButton;
    @FindBy(xpath = webElementSubscribeNow)
    public WebElement subscribeNow;


    public void navigateToMMAPage() throws InterruptedException {
        clickOnElement(mmaButton);
        waitUntilVisible(By.xpath("//*[@id=\"global-nav\"]/ul/li[5]/div"));
        try {
            clickJScript(mmaHomeButton);

            System.out.println("Clicked");

        }catch(Exception e){
            clickJScript(mmaHomeButton);
            System.out.println("Clicked 2");
        }

        if (getCurrentPageTitle().equalsIgnoreCase("Mixed Martial Arts News, Video, Rankings, Results, and History - MMA - ESPN"))
        System.out.println("Navigated to MMA Home Page Successfully");
        else
            System.out.println("Failed to navigate");
    }

    /**
     * Test case1
     * @return
     * @throws IOException
     * @throws InterruptedException
     */

    public boolean validateMMAPageTitle() throws IOException, InterruptedException {
        navigateToMMAPage();
        String title=getCurrentPageTitle();
        wait.until(ExpectedConditions.titleIs(title));
        boolean flag=compareTextToExpectedString(title,path,"MMAPageTitle");
        return flag;

    }
    /**
     * Test case2
     */
    public boolean  validateScheduleTitle() throws InterruptedException, IOException {
        navigateToMMAPage();
        clickOnElement(scheduleButton);
        boolean flag=compareTextToExpectedString(getCurrentPageTitle(),path,"scheduletItle");
        return flag;

    }
    /**
     * Test case 3
     */
    public boolean validatePlayUfcLink() throws InterruptedException, IOException {
        navigateToMMAPage();
        clickOnElement(playUFCFightButton);
        boolean flag=compareTextToExpectedString(getCurrentPageTitle(),path,"PlayUfcTitle");
        return flag;
    }
    public boolean validateFlightCenterButton() throws InterruptedException, IOException {
        navigateToMMAPage();
        clickOnElement(fightCenterButton);
        boolean flag=compareTextToExpectedString(getCurrentPageTitle(),path,"FightCenterTitle");
        return flag;
    }
    public boolean validateEspnBestFightLink() throws InterruptedException, IOException {
        navigateToMMAPage();
        clickOnElement(eSPNBestFightsButton);
        boolean flag=compareTextToExpectedString(getCurrentPageTitle(),path,"espnBestFight");
        return flag;
    }
    public boolean validateESPNPlusMenu() throws InterruptedException, IOException {
        navigateToMMAPage();
        mouseHover(eSPNBestFightsButton);
        waitUntilVisible(By.xpath(WebElementESPNBestMenu));
        boolean flag=compareListSizeToExpectedCount(By.xpath(WebElementESPNBestMenu),path,"espn+MenuCount");
        return flag;
    }
    public boolean validateMoreButton() throws InterruptedException, IOException {
        navigateToMMAPage();
        clickOnElement(moreButton);
        boolean flag=compareListSizeToExpectedCount(By.xpath(webElementMoreMenuLinks),path,"moreMenuLinksount");
        return flag;

    }
    public boolean validateSubscribeNowButton() throws InterruptedException, IOException {
        navigateToMMAPage();
        waitUntilClickAble(By.xpath(webElementSubscribeNow));
        clickOnElement(subscribeNow);
        boolean flag=compareTextToExpectedString(getCurrentPageTitle(),path,"subscribeNowTitle");
        return flag;
    }
    public boolean validateQuickLinksSection() throws IOException, InterruptedException {
        navigateToMMAPage();
        //waitUntilClickAble(By.xpath("webElementQuickLinks"));
        boolean flag= clickLinksSwitchTabsCompareURLs(By.xpath(webElementQuickLinks),path,"quickLinksSection");
        return flag;
    }
    public boolean validateFantasySection() throws InterruptedException, IOException {
        navigateToMMAPage();
        boolean flag=compareListSizeToExpectedCount(By.xpath(webElementFantasySection),path,"fantasySection");
        return flag;
    }
    public boolean validateFantasySectionLinks() throws InterruptedException, IOException {
        navigateToMMAPage();
        boolean flag=clickLinksSwitchTabsCompareURLs(By.xpath(webElementFantasySection),path,"FantasySectionLinks");
        return flag;

    }
    public boolean validateESPNSites() throws InterruptedException, IOException {
        navigateToMMAPage();
        boolean flag=compareListSizeToExpectedCount(By.xpath(webElementESPNSites),path,"espnSites");
        return flag;
    }
    public boolean validateESPNSitesLinks() throws InterruptedException, IOException {
        navigateToMMAPage();
        boolean flag=clickLinksSwitchTabsCompareURLs(By.xpath(webElementESPNSites),path,"espnSitesLinks");
        return flag;
    }
    public boolean validateESPNAppsCount() throws InterruptedException, IOException {
        navigateToMMAPage();
        boolean flag=compareListSizeToExpectedCount(By.xpath(webElementESPNApps),path,"espnAppsCount");
        return flag;
    }
    public boolean validateESPNAppsLinks() throws IOException, InterruptedException {
        navigateToMMAPage();
        boolean flag=clickLinksSwitchTabsCompareURLs(By.xpath(webElementESPNApps),path,"espnAppsLinks");
        return flag;
    }


}
