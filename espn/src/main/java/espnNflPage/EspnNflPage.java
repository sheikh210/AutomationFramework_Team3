package espnNflPage;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.util.List;

import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import static espnNflPage.EspnNflElementsPage.*;

public class EspnNflPage extends WebAPI{
  @FindBy(how = How.XPATH, using = webElementNFLButton)
  public WebElement nFLButton;
  @FindBy(how = How.XPATH, using = webElementNflHome)
  public WebElement nFlHome;

  @FindBy(how = How.XPATH, using = webElementSubscribeButtonLink)
  public WebElement subscribeButtonLink;
  @FindBy(how = How.XPATH, using = webElementLogo)
  public WebElement logo;
  @FindBy(how = How.XPATH, using = webElementLogInButton)
  public WebElement logInButton;
  @FindBy(how = How.XPATH, using = webElementSearchBox)
  public WebElement searchButton;
  @FindBy(how = How.XPATH, using = webElementSignUp)
  public WebElement signUpButton;

    @FindBy(how = How.XPATH, using = webElementScoresButton)
    public WebElement scoresButton;
    @FindBy(how = How.XPATH, using = webElementSearchBear)
    public WebElement searchBear;
    @FindBy(how = How.XPATH, using = webElementFootBall)
    public WebElement searchFootball;
    @FindBy(how = How.XPATH, using = webElementImages)
    public WebElement searchImages;

    @FindBy(how = How.XPATH, using = webElementStarButton)
    public WebElement starButton;
    @FindBy(how = How.XPATH, using = webElementDropDownSeason)
    public WebElement dropDownSeasonButton;


  //1
  public void navigateToNFLButton(){
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(nFLButton));
        nFLButton.click();
  }
  public void validateNavigateToNFlHome(){
        boolean actualText_Is_Available = nFlHome.isDisplayed();
        boolean expectedText_Is_Available = true;
        Assert.assertEquals(actualText_Is_Available, expectedText_Is_Available, "Display not found");
  }
  //2
  public String validateNflHomePageUrl() {
        navigateToNFLButton();
        String NflPageUrl = super.getCurrentPageUrl();
        driver.navigate().refresh();
        System.out.println("NFL button: "+NflPageUrl);
        return NflPageUrl;
  }
//3
    public String validateNFLPageTitle() {
    navigateToNFLButton();
    String NFLPageTitle = super.getCurrentPageTitle();
    driver.navigate().refresh();
    System.out.println("NFL title: "+NFLPageTitle);
    return NFLPageTitle;
    }
//4
public void validateNFLLinkNumber() {
    List<WebElement> list = driver.findElements(By.tagName("a"));
    System.out.println(list.size());
    int linkNumber = list.size();
    Assert.assertEquals(linkNumber, "171", "Expected Link Number Not Found");
}
//5
public void validateSubscribeButtonLink(){
    navigateToNFLButton();
    String actualLink = subscribeButtonLink.getAttribute("a");
    System.out.println(actualLink);
    Assert.assertEquals(actualLink,null);
}
//6
public void validateDoMoveBackward() {
    navigateToNFLButton();
    driver.navigate().back();
    String actualUrl = super.getCurrentPageUrl();
    System.out.println(actualUrl);
    String expectedUrl = "data:,";
    Assert.assertEquals(actualUrl, expectedUrl);
}
//7
public void validateReturnToMotorButtonPage() {
  navigateToNFLButton();
    driver.navigate().back();
    System.out.println(super.getCurrentPageUrl());
    driver.navigate().forward();
    driver.navigate().refresh();
    String actualUrl = super.getCurrentPageUrl();
    String NFLPageUrl = "https://www.espn.com/";
    Assert.assertEquals(actualUrl,NFLPageUrl);
}
//8
public String validateNavigateToOwnerPage() {
    navigateToNFLButton();
    String url = driver.getCurrentUrl();
    System.out.println("Page URL - " + url);
    return url;
}
//9
public boolean isHomePageLogoDisplayed(){
    navigateToNFLButton();
    waitUntilVisible(By.xpath(webElementLogo));
    boolean isElementDisplayed= logo.isDisplayed();
    return isElementDisplayed;
}
//10
public void validateLogInButton() {
    navigateToNFLButton();
    logInButton.click();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    List<WebElement> list = logInButton.findElements(By.xpath(webElementLogInButton));
    int logInButton= list.size();
    System.out.println("Link Number " + logInButton);
    Assert.assertEquals(logInButton, 1, "Number doesnot found");
}
//11
public void validateSignUP() {
    navigateToNFLButton();
    signUpButton.click();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    List<WebElement> list = signUpButton.findElements(By.xpath(webElementSignUp));
    int signUpButton= list.size();
    System.out.println("Link Number " + signUpButton);
    Assert.assertEquals(signUpButton, 1, "Number doesnot found");
}
//12
public void clickScoresButton(){
    navigateToNFLButton();
    WebDriverWait wait = new WebDriverWait(driver,10);
    wait.until(ExpectedConditions.elementToBeClickable(scoresButton));
    try {
        clickOnElement(scoresButton);
        System.out.println("bear");
    } catch (Exception e) {
        System.out.println("bear-try again");
        clickJScript(scoresButton);
    }
}
//13
public void validateSearchBear() {
    navigateToNFLButton();
    searchBear.click();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    List<WebElement> list = searchBear.findElements(By.xpath(webElementSearchBear));
    int searchBear= list.size();
    System.out.println("Link Number " + searchBear);
    Assert.assertEquals(searchBear, 1, "Number doesnot found");
}

//14
public void validateReturnToSearchButtonPage2() {
    navigateToNFLButton();
    driver.navigate().back();
    System.out.println(super.getCurrentPageUrl());
    driver.navigate().forward();
    driver.navigate().refresh();
    String actualUrl = super.getCurrentPageUrl();
    String NFLPageUrl = "https://www.espn.com/";
    Assert.assertEquals(actualUrl,NFLPageUrl);
}
//15
public void validateSearchFootball() {
    navigateToNFLButton();
    searchFootball.click();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    List<WebElement> list = searchFootball.findElements(By.xpath(webElementFootBall));
    int searchFootball= list.size();
    System.out.println("Link Number " + searchFootball);
    Assert.assertEquals(searchFootball, 1, "Number doesnot found");
}
//16
public void validateDropdownSeasonListSizeAndLinks() {
    navigateToNFLButton();
    driver.navigate().back();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    mouseHover(starButton);
    List<WebElement> dropDownSeasonList = getListOfWebElementsByXpath(starButton,webElementDropDownSeason );

    int listSize = dropDownSeasonList.size();
    System.out.println("Size of 'starButtonList' Dropdown List: " + listSize);
    Assert.assertEquals(listSize, 14, "LIST SIZE DOES NOT MATCH");
}
//17
public void validateScore() {
    navigateToNFLButton();
    scoresButton.click();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    List<WebElement> list = scoresButton.findElements(By.xpath(webElementScore));
    int scoresButton= list.size();
    System.out.println("Link Number " + scoresButton);
    Assert.assertEquals(scoresButton, 1, "Number doesnot found");
}





}