package securitypage;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;
import utilities.DataReader;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import static securitypage.SecuritypageElements.*;

public class Securitypage extends WebAPI{

    WebDriverWait wait = new WebDriverWait(driver, 10);
    Wait fluentWait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);
    String path = System.getProperty("user.dir") + "\\src\\main\\resources\\" +
            "Bank_Of_America_Securitypage.xlsx";
    DataReader dataReader = new DataReader();

    @FindBy(xpath = webElementSecurityTabButton)
    public WebElement securityTabButton;
    @FindBy(xpath = webElementSlideNextArrow)
    public WebElement slideNextArrow;
    @FindBy(xpath = webElementReadMoreAboutThisTopicButton)
    public WebElement readMoreAboutThisTopicButton;
    @FindBy(xpath = webElementSlidePreviousArrow)
    public WebElement slidePreviousArrow;
    @FindBy(xpath = webElementMenuDropDownButton)
    public WebElement menuDropDownButton;
    @FindBy(xpath = webElementMenuOtherPrivacyList)
    public WebElement menuOtherPrivacyList;
    @FindBy(xpath = webElementMenuTopPrivacyList)
    public WebElement menuTopPrivacyList;
    @FindBy(xpath = webElementAdditionalFraudButton)
    public WebElement additionalFraudButton;
    @FindBy(xpath = webElementDropDownIsVisable)
    public WebElement dropDownIsVisable;
    @FindBy(xpath = webElementFreeProductsButton)
    public WebElement freeProductsButton;
    @FindBy(xpath = webElementFreeProductsIsVisable)
    public WebElement freeProductsIsVisable;
    @FindBy(xpath = webElementMenuTopLinks1)
    public WebElement menuTopLinks1;
    @FindBy(xpath = webElementMenuTopLinks2)
    public WebElement menuTopLinks2;
    @FindBy(xpath = webElementMenuTopLinks3)
    public WebElement menuTopLinks3;
    @FindBy(xpath = webElementMenuTopLinks4)
    public WebElement menuTopLinks4;
    @FindBy(xpath = webElementKnowFraudPage)
    public WebElement knowFraudPage;
    @FindBy(xpath = webElementAvoidBankScamsPage)
    public WebElement avoidBankScamsPage;
    @FindBy(xpath = webElementReportActivityPage)
    public WebElement reportActivityPage;
    @FindBy(xpath = webElementProtectYourSelf)
    public WebElement protectYourSelf;
    @FindBy(xpath = webElementFullPageVersionLink)
    public WebElement fullPageVersionLink;
    @FindBy(xpath = webElementSignInButton)
    public WebElement signInButton;
    @FindBy(xpath = webElementLocationsButton)
    public WebElement locationsButton;

    public void getSecuritypage() {
        wait.until(ExpectedConditions.elementToBeClickable(securityTabButton));
        clickOnElement(securityTabButton);
    }

    public boolean validateSecuritypage() throws Exception {
        getSecuritypage();
        String url = getCurrentPageUrl();
        return compareTextToExpectedString(url,path,"SecuritypageURL");
    }

    public boolean validateNextArrow() throws Exception{
        getSecuritypage();
        wait.until(ExpectedConditions.elementToBeClickable(slideNextArrow));
        clickOnElement(slideNextArrow);
        wait.until(ExpectedConditions.visibilityOf(readMoreAboutThisTopicButton));
        boolean arrowWorks = false;
        if(readMoreAboutThisTopicButton.isDisplayed()){
            System.out.println("Next Arrow was Clicked");
            arrowWorks = true;
        }
        return arrowWorks;

    }
    public boolean validatePreviousArrow() throws Exception{
        getSecuritypage();
        wait.until(ExpectedConditions.elementToBeClickable(slidePreviousArrow));
        clickOnElement(slidePreviousArrow);
        boolean arrowWorks = false;
        wait.until(ExpectedConditions.visibilityOf(readMoreAboutThisTopicButton));
        if(readMoreAboutThisTopicButton.isDisplayed()) {
            System.out.println("Previous Arrow was Clicked");
            arrowWorks = true;
        }
        return arrowWorks;

    }
    public boolean getMenuOtherPrivacyText() throws Exception{
        getSecuritypage();
        wait.until(ExpectedConditions.elementToBeClickable(menuDropDownButton));
        clickOnElement(menuDropDownButton);
        List<WebElement> textListArray = menuOtherPrivacyList.findElements(By.xpath(webElementMenuOtherPrivacyList));
        String[] actualText = new String[textListArray.size()];
        int i = 0;
        for (WebElement a : textListArray) {
            actualText[i] = a.getText();
            i++;
        }

        return compareTextListToExpectedStringArray(actualText, path, "OtherPrivacyText");

    }public boolean getMenuOtherPrivacyURL() throws Exception {
        getSecuritypage();
        try {
            wait.until(ExpectedConditions.elementToBeClickable(menuDropDownButton));
            clickOnElement(menuDropDownButton);
        }catch(Exception e) {
            clickOnElement(menuDropDownButton);
        }
        wait.until(ExpectedConditions.visibilityOf(menuOtherPrivacyList));
        return (clickLinksSwitchTabsCompareURLs(By.xpath(webElementMenuOtherPrivacyList), path, "OtherPrivacyURLS") == true);
    }
    public boolean getMenuTopPrivacyText() throws Exception{
        getSecuritypage();
        try {
            wait.until(ExpectedConditions.elementToBeClickable(menuDropDownButton));
            clickOnElement(menuDropDownButton);
            List<WebElement> textListArray = menuTopPrivacyList.findElements(By.xpath(webElementMenuTopPrivacyList));
            String[] actualText = new String[textListArray.size()];
            int i = 0;
            for (WebElement a : textListArray) {
                actualText[i] = a.getText();
                i++;
            }
            return compareTextListToExpectedStringArray(actualText, path, "TopPrivacyText");
        } catch (Exception e){
            clickOnElement(menuDropDownButton);
            List<WebElement> textListArray = menuTopPrivacyList.findElements(By.xpath(webElementMenuTopPrivacyList));
            String[] actualText = new String[textListArray.size()];
            int i = 0;
            for (WebElement a : textListArray) {
                actualText[i] = a.getText();
                i++;
            }
            return compareTextListToExpectedStringArray(actualText, path, "TopPrivacyText");
        }
    }
    public boolean getMenuTopPrivacyURL() throws Exception {
        getSecuritypage();
        try {
            wait.until(ExpectedConditions.elementToBeClickable(menuDropDownButton));
            clickOnElement(menuDropDownButton);
        }catch(Exception e) {
            clickOnElement(menuDropDownButton);
        }
        wait.until(ExpectedConditions.visibilityOf(menuTopPrivacyList));
        return (clickLinksSwitchTabsCompareURLs(By.xpath(webElementMenuTopPrivacyList), path, "TopPrivacyURL") == true);
    }
    public boolean validateAdditionalFraudButton() throws Exception {
        getSecuritypage();
        scrollToElementJScript(additionalFraudButton);
        clickOnElement(webElementAdditionalFraudButton);
        boolean isVisable = false;
        if(dropDownIsVisable.isDisplayed())
            isVisable = true;
        return isVisable;

    }
    public boolean validateFreeProductsButton() throws Exception {
        getSecuritypage();
        scrollToElementJScript(freeProductsButton);
        clickOnElement(webElementFreeProductsButton);
        boolean isVisable = false;
        if(freeProductsIsVisable.isDisplayed())
            isVisable = true;
        return isVisable;

    }
    public boolean getMenuTopLinks1URL() throws Exception {
        getSecuritypage();
        try {
            wait.until(ExpectedConditions.elementToBeClickable(menuDropDownButton));
            clickOnElement(menuDropDownButton);
        }catch(Exception e) {
            clickOnElement(menuDropDownButton);
        }
        wait.until(ExpectedConditions.visibilityOf(menuTopLinks1));
        return clickLinksSwitchTabsCompareURLs(By.xpath(webElementMenuTopLinks1), path, "MenuTopLinks1");
    }
    public boolean getMenuTopLinks2URL() throws Exception {
        getSecuritypage();
        try {
            wait.until(ExpectedConditions.elementToBeClickable(menuDropDownButton));
            clickOnElement(menuDropDownButton);
        }catch(Exception e) {
            clickOnElement(menuDropDownButton);
        }
        wait.until(ExpectedConditions.visibilityOf(menuTopLinks2));
        return clickLinksSwitchTabsCompareURLs(By.xpath(webElementMenuTopLinks2), path, "MenuTopLinks2");
    }
    public boolean getMenuTopLinks3URL() throws Exception {
        getSecuritypage();
        try {
            wait.until(ExpectedConditions.elementToBeClickable(menuDropDownButton));
            clickOnElement(menuDropDownButton);
        }catch(Exception e) {
            clickOnElement(menuDropDownButton);
        }
        wait.until(ExpectedConditions.visibilityOf(menuTopLinks3));
        return clickLinksSwitchTabsCompareURLs(By.xpath(webElementMenuTopLinks3), path, "MenuTopLinks3");
    }
    public boolean getMenuTopLinks4URL() throws Exception {
        getSecuritypage();
        try {
            wait.until(ExpectedConditions.elementToBeClickable(menuDropDownButton));
            clickOnElement(menuDropDownButton);
        }catch(Exception e) {
            clickOnElement(menuDropDownButton);
        }
        wait.until(ExpectedConditions.visibilityOf(menuTopLinks4));
        return clickLinksSwitchTabsCompareURLs(By.xpath(webElementMenuTopLinks4), path, "MenuTopLinks4");
    }
    public boolean getKnowFraudPage()throws Exception{
        getSecuritypage();
        scrollToElementJScript(knowFraudPage);
        return clickLinksSwitchTabsCompareURLs(By.xpath(webElementKnowFraudPage),path,"KnowFraudPageURL");
    }
    public boolean getAvoidBankScamsPage()throws Exception{
        getSecuritypage();
        scrollToElementJScript(avoidBankScamsPage);
        return clickLinksSwitchTabsCompareURLs(By.xpath(webElementAvoidBankScamsPage),path,"AvoidBankScamsPageURL");
    }
    public boolean getReportActivityPage()throws Exception{
        getSecuritypage();
        scrollToElementJScript(reportActivityPage);
        return clickLinksSwitchTabsCompareURLs(By.xpath(webElementReportActivityPage),path,"ReportActivityPageURL");
    }
    public boolean getProtectYourSelf()throws Exception{
        getSecuritypage();
        scrollToElementJScript(protectYourSelf);
        return clickLinksSwitchTabsCompareURLs(By.xpath(webElementProtectYourSelf),path,"ProtectYourSelfURL");
    }
    public boolean getFullPageVersionLink()throws Exception{
        getSecuritypage();
        scrollToElementJScript(fullPageVersionLink);
        return clickLinksSwitchTabsCompareURLs(By.xpath(webElementFullPageVersionLink),path,"FullPageVersionURL");
    }
    public boolean getSignInButton()throws Exception{
        getSecuritypage();
        waitUntilClickAble(By.xpath(webElementSignInButton));
        return clickLinksSwitchTabsCompareURLs(By.xpath(webElementProtectYourSelf),path,"ProtectYourSelfURL");
    }
    public boolean getLocationsButton()throws Exception{
        getSecuritypage();
        waitUntilClickAble(By.xpath(webElementLocationsButton));
        return clickLinksSwitchTabsCompareURLs(By.xpath(webElementFullPageVersionLink),path,"FullPageVersionURL");
    }


}
