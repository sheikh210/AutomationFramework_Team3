package educationalTrainingpage;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;
import utilities.DataReader;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import static educationalTrainingpage.EducationalTrainingpageElements.*;

public class EducationalTrainingpage extends WebAPI{

    WebDriverWait wait = new WebDriverWait(driver, 10);
    Wait fluentWait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);
    String path = System.getProperty("user.dir") + "\\src\\main\\java\\resources\\" +
            "St.Judes_EducationalTraining.xlsx";
    DataReader dataReader = new DataReader();

    @FindBy(xpath = webElementTrainingButton)
    public WebElement trainingButton;
    @FindBy(xpath = webElementViewMoreButton)
    public WebElement viewMoreButton;
    @FindBy(xpath = webElementAdvancedTrainingList)
    public WebElement advancedTrainingList;
    @FindBy(xpath = webElementPredoctoralTrainingList)
    public WebElement predoctoralTrainingList;
    @FindBy(xpath = webElementCloseAlert)
    public WebElement closeAlert;
    @FindBy(xpath = webElementStJudesGlobalLearnMore)
    public WebElement stJudesGlobalLearnMore;
    @FindBy(xpath = webElementOnlineResourcesButton)
    public WebElement onlineResourcesButton;
    @FindBy(xpath = webElementCareerAtStJudesButton)
    public WebElement careerAtStJudesButton;
    @FindBy(xpath = webElementExploreTheGradSchoolButton)
    public WebElement exploreTheGradSchoolButton;
    @FindBy(xpath = webElementSignUpButton)
    public WebElement signUpButton;
    @FindBy(xpath = webElementFacebookButton)
    public WebElement facebookButton;
    @FindBy(xpath = webElementTwitterButton)
    public WebElement twitterButton;
    @FindBy(xpath = webElementInstagramButton)
    public WebElement instagramButton;
    @FindBy(xpath = webElementYoutubeButton)
    public WebElement youtubeButton;
    @FindBy(xpath = webElementConnectWithUsButton)
    public WebElement connectWithUsButton;
    @FindBy(xpath = webElementCareersButton)
    public WebElement careersButton;
    @FindBy(xpath = webElementMediaResourcesButton)
    public WebElement mediaResourcesButton;
    @FindBy(xpath = webElementVisitUsButton)
    public WebElement visitUsButton;

    /**
     * Test Case 1 - Navigate to Education & Training page
     * 1: Launch Chrome Browser
     * 2: Direct chrome to St.Judes homepage
     * 3: Click on Training on St. Judes header to reveal dropdown
     * 4: Click on For View More Education and Training link
     * 5: Validate the Education & Training page url with what is stored in Excel
     */
    public void getEducationAndTrainingpage() {
        wait.until(ExpectedConditions.elementToBeClickable(trainingButton));
        clickOnElement(trainingButton);
        wait.until(ExpectedConditions.elementToBeClickable(viewMoreButton));
        clickOnElement(viewMoreButton);

    }

    public boolean validateEducationAndTrainingpage() throws Exception {
        getEducationAndTrainingpage();
        String url = getCurrentPageUrl();
        return compareTextToExpectedString(url,path,"EducationalTrainingURL");


    }
    public boolean getAdvancedTrainingNum() throws Exception {
        getEducationAndTrainingpage();
        if (closeAlert.isDisplayed())
            closeAlert.click();
        try {
            scrollToElementJScript(advancedTrainingList);
            wait.until(ExpectedConditions.visibilityOf(advancedTrainingList));
            return compareListSizeToExpectedCount(By.xpath(webElementAdvancedTrainingList), path, "AdvancedTrainingSize");
        }
        catch (Exception e){
            scrollToElementJScript(advancedTrainingList);
            wait.until(ExpectedConditions.visibilityOf(advancedTrainingList));
            return compareListSizeToExpectedCount(By.xpath(webElementAdvancedTrainingList), path, "AdvancedTrainingSize");
        }

    }
    public boolean getAdvancedTrainingText() throws Exception{
        getEducationAndTrainingpage();
        if(closeAlert.isDisplayed())
            closeAlert.click();
        try {
            scrollToElementJScript(advancedTrainingList);
            wait.until(ExpectedConditions.visibilityOf(advancedTrainingList));
            if (closeAlert.isDisplayed())
                closeAlert.click();
            List<WebElement> textListArray = advancedTrainingList.findElements(By.xpath(webElementAdvancedTrainingList));
            String[] actualText = new String[textListArray.size()];
            int i = 0;
            for (WebElement a : textListArray) {
                actualText[i] = a.getText();
                i++;
            }

            return compareTextListToExpectedStringArray(actualText, path, "AdvancedTrainingText");
        } catch (Exception e){
            scrollToElementJScript(advancedTrainingList);
            wait.until(ExpectedConditions.visibilityOf(advancedTrainingList));
            if (closeAlert.isDisplayed())
                closeAlert.click();
            List<WebElement> textListArray = advancedTrainingList.findElements(By.xpath(webElementAdvancedTrainingList));
            String[] actualText = new String[textListArray.size()];
            int i = 0;
            for (WebElement a : textListArray) {
                actualText[i] = a.getText();
                i++;
            }

            return compareTextListToExpectedStringArray(actualText, path, "AdvancedTrainingText");
        }

    }
    public boolean getAdvancedTrainingURLS() throws Exception{
        getEducationAndTrainingpage();
        if(closeAlert.isDisplayed())
            closeAlert.click();
        try {
            scrollToElementJScript(advancedTrainingList);
            wait.until(ExpectedConditions.visibilityOf(advancedTrainingList));
            boolean urlsValid = false;
            if (clickLinksSwitchTabsCompareURLs(By.xpath(webElementAdvancedTrainingList), path, "AdvancedTrainingURLS") == true)
                urlsValid = true;
            return urlsValid;
        } catch (Exception e)
        {
            scrollToElementJScript(advancedTrainingList);
            wait.until(ExpectedConditions.visibilityOf(advancedTrainingList));
            boolean urlsValid = false;
            if (clickLinksSwitchTabsCompareURLs(By.xpath(webElementAdvancedTrainingList), path, "AdvancedTrainingURLS") == true)
                urlsValid = true;
            return urlsValid;
        }
    }
    public boolean getPredoctoralTrainingText() throws Exception{
        getEducationAndTrainingpage();
        if(closeAlert.isDisplayed())
            closeAlert.click();
        try {
            scrollToElementJScript(predoctoralTrainingList);
            wait.until(ExpectedConditions.visibilityOf(predoctoralTrainingList));
            List<WebElement> textListArray = predoctoralTrainingList.findElements(By.xpath(webElementPredoctoralTrainingList));
            String[] actualText = new String[textListArray.size()];
            int i = 0;
            for (WebElement a : textListArray) {
                actualText[i] = a.getText();
                i++;
            }

            return compareTextListToExpectedStringArray(actualText, path, "PredoctoralTrainingText");
        } catch (Exception e){
            scrollToElementJScript(predoctoralTrainingList);
            wait.until(ExpectedConditions.visibilityOf(predoctoralTrainingList));
            List<WebElement> textListArray = predoctoralTrainingList.findElements(By.xpath(webElementPredoctoralTrainingList));
            String[] actualText = new String[textListArray.size()];
            int i = 0;
            for (WebElement a : textListArray) {
                actualText[i] = a.getText();
                i++;
            }

            return compareTextListToExpectedStringArray(actualText, path, "PredoctoralTrainingText");
        }

    }
    public boolean getPredoctoralTrainingURLS() throws Exception{
        getEducationAndTrainingpage();
        if(closeAlert.isDisplayed())
            closeAlert.click();
        try {
            scrollToElementJScript(predoctoralTrainingList);
            wait.until(ExpectedConditions.visibilityOf(predoctoralTrainingList));
            boolean urlsValid = false;
            if (clickLinksSwitchTabsCompareURLs(By.xpath(webElementPredoctoralTrainingList), path, "PredoctoralTrainingURLS") == true)
                urlsValid = true;
            return urlsValid;
        } catch (Exception e){
            scrollToElementJScript(predoctoralTrainingList);
            wait.until(ExpectedConditions.visibilityOf(predoctoralTrainingList));
            boolean urlsValid = false;
            if (clickLinksSwitchTabsCompareURLs(By.xpath(webElementPredoctoralTrainingList), path, "PredoctoralTrainingURLS") == true)
                urlsValid = true;
            return urlsValid;
        }
    }
    public boolean getPredoctoralTrainingNum() throws Exception {
        getEducationAndTrainingpage();
        if (closeAlert.isDisplayed())
            closeAlert.click();
        scrollToElementJScript(predoctoralTrainingList);
        wait.until(ExpectedConditions.visibilityOf(predoctoralTrainingList));
       return compareListSizeToExpectedCount(By.xpath(webElementPredoctoralTrainingList),path,"PredoctoralTrainingSize");

    }

    public boolean getStJudesGlobal() throws Exception{
        getEducationAndTrainingpage();
        if(closeAlert.isDisplayed())
            closeAlert.click();
        scrollToElementJScript(stJudesGlobalLearnMore);
        wait.until(ExpectedConditions.visibilityOf(stJudesGlobalLearnMore));
        boolean urlsValid = false;
        if (clickLinksSwitchTabsCompareURLs(By.xpath(webElementStJudesGlobalLearnMore),path,"StJudesGlobalURL") == true)
            urlsValid = true;
        return urlsValid;
    }
    public boolean getOnlineResources() throws Exception{
        getEducationAndTrainingpage();
        if(closeAlert.isDisplayed())
            closeAlert.click();
        try {
            scrollToElementJScript(onlineResourcesButton);
            wait.until(ExpectedConditions.visibilityOf(onlineResourcesButton));
            boolean urlsValid = false;
            if (clickLinksSwitchTabsCompareURLs(By.xpath(webElementOnlineResourcesButton), path, "OnlineResourcesURL") == true)
                urlsValid = true;
            return urlsValid;
        }catch (Exception e){
            scrollToElementJScript(onlineResourcesButton);
            wait.until(ExpectedConditions.visibilityOf(onlineResourcesButton));
            boolean urlsValid = false;
            if (clickLinksSwitchTabsCompareURLs(By.xpath(webElementOnlineResourcesButton), path, "OnlineResourcesURL") == true)
                urlsValid = true;
            return urlsValid;
        }
    }
    public boolean getCareerAtStJudes() throws Exception{
        getEducationAndTrainingpage();
        if(closeAlert.isDisplayed())
            closeAlert.click();
        try {
            scrollToElementJScript(careerAtStJudesButton);
            wait.until(ExpectedConditions.visibilityOf(careerAtStJudesButton));
            boolean urlsValid = false;
            if (clickLinksSwitchTabsCompareURLs(By.xpath(webElementCareerAtStJudesButton), path, "CareerAtStJudesURL") == true)
                urlsValid = true;
            return urlsValid;
        } catch (Exception e)
        {
            scrollToElementJScript(careerAtStJudesButton);
            wait.until(ExpectedConditions.visibilityOf(careerAtStJudesButton));
            boolean urlsValid = false;
            if (clickLinksSwitchTabsCompareURLs(By.xpath(webElementCareerAtStJudesButton), path, "CareerAtStJudesURL") == true)
                urlsValid = true;
            return urlsValid;
        }
    }
    public boolean getExploreTheGradSchoolButton() throws Exception{
        getEducationAndTrainingpage();
        if(closeAlert.isDisplayed())
            closeAlert.click();
        try {
            scrollToElementJScript(exploreTheGradSchoolButton);
            wait.until(ExpectedConditions.visibilityOf(exploreTheGradSchoolButton));
            boolean urlsValid = false;
            if (clickLinksSwitchTabsCompareURLs(By.xpath(webElementExploreTheGradSchoolButton), path, "ExploreGradSchool") == true)
                urlsValid = true;
            return urlsValid;
        } catch (Exception e){
            scrollToElementJScript(exploreTheGradSchoolButton);
            wait.until(ExpectedConditions.visibilityOf(exploreTheGradSchoolButton));
            boolean urlsValid = false;
            if (clickLinksSwitchTabsCompareURLs(By.xpath(webElementExploreTheGradSchoolButton), path, "ExploreGradSchool") == true)
                urlsValid = true;
            return urlsValid;
        }
    }
    public boolean getSignUpButton() throws Exception{
        getEducationAndTrainingpage();
        if(closeAlert.isDisplayed())
            closeAlert.click();
        scrollToElementJScript(signUpButton);
        wait.until(ExpectedConditions.elementToBeClickable(signUpButton));
        try {
            return clickLinksSwitchTabsCompareURLs(By.xpath(webElementSignUpButton),path,"SignUpURL");
        }catch (Exception e) {
            clickOnElement(signUpButton);
            String url = getCurrentPageUrl();
            return  compareTextToExpectedString(url,path,"SignUpURL");
        }
    }
    public boolean getContactWithUsButton() throws Exception{
        getEducationAndTrainingpage();
        if(closeAlert.isDisplayed())
            closeAlert.click();
        scrollToElementJScript(connectWithUsButton);
        wait.until(ExpectedConditions.elementToBeClickable(connectWithUsButton));
        try {
            return clickLinksSwitchTabsCompareURLs(By.xpath(webElementConnectWithUsButton),path,"ContactUsURL");
        }catch (Exception e) {
            clickOnElement(connectWithUsButton);
            String url = getCurrentPageUrl();
            return  compareTextToExpectedString(url,path,"ContactUsURL");
        }
    }
    public boolean getFacebookButton() throws Exception{
        getEducationAndTrainingpage();
        if(closeAlert.isDisplayed())
            closeAlert.click();
        scrollToElementJScript(facebookButton);
        wait.until(ExpectedConditions.elementToBeClickable(facebookButton));
        try {
            return clickLinksSwitchTabsCompareURLs(By.xpath(webElementFacebookButton),path,"FacebookURL");
        }catch (Exception e) {
            clickOnElement(facebookButton);
            String url = getCurrentPageUrl();
            return  compareTextToExpectedString(url,path,"FacebookURL");
        }
    }
    public boolean getTwitterButton() throws Exception{
        getEducationAndTrainingpage();
        if(closeAlert.isDisplayed())
            closeAlert.click();
        scrollToElementJScript(twitterButton);
        wait.until(ExpectedConditions.elementToBeClickable(twitterButton));
        try {
            return clickLinksSwitchTabsCompareURLs(By.xpath(webElementTwitterButton),path,"TwitterURL");
        }catch (Exception e) {
            clickOnElement(twitterButton);
            String url = getCurrentPageUrl();
            return  compareTextToExpectedString(url,path,"TwitterURL");
        }
    }
    public boolean getInstagramButton() throws Exception{
        getEducationAndTrainingpage();
        if(closeAlert.isDisplayed())
            closeAlert.click();
        scrollToElementJScript(instagramButton);
        wait.until(ExpectedConditions.elementToBeClickable(instagramButton));
        try {
            return clickLinksSwitchTabsCompareURLs(By.xpath(webElementInstagramButton),path,"InstagramURL");
        }catch (Exception e) {
            clickOnElement(instagramButton);
            String url = getCurrentPageUrl();
            return  compareTextToExpectedString(url,path,"InstagramURL");
        }
    }
    public boolean getYoutubeButton() throws Exception{
        getEducationAndTrainingpage();
        if(closeAlert.isDisplayed())
            closeAlert.click();
        scrollToElementJScript(youtubeButton);
        wait.until(ExpectedConditions.elementToBeClickable(youtubeButton));
        try {
            return clickLinksSwitchTabsCompareURLs(By.xpath(webElementYoutubeButton),path,"YoutubeURL");
        }catch (Exception e) {
            clickOnElement(youtubeButton);
            String url = getCurrentPageUrl();
            return  compareTextToExpectedString(url,path,"YoutubeURL");
        }
    }
    public boolean getCareersButton() throws Exception{
        getEducationAndTrainingpage();
        if(closeAlert.isDisplayed())
            closeAlert.click();
        scrollToElementJScript(careersButton);
        wait.until(ExpectedConditions.elementToBeClickable(careersButton));
        try {
            return clickLinksSwitchTabsCompareURLs(By.xpath(webElementCareersButton),path,"CareersURL");
        }catch (Exception e) {
            clickOnElement(careersButton);
            String url = getCurrentPageUrl();
            return  compareTextToExpectedString(url,path,"CareersURL");
        }
    }
    public boolean getMediaResourcesButton() throws Exception{
        getEducationAndTrainingpage();
        if(closeAlert.isDisplayed())
            closeAlert.click();
        scrollToElementJScript(mediaResourcesButton);
        wait.until(ExpectedConditions.elementToBeClickable(mediaResourcesButton));
        try {
            return clickLinksSwitchTabsCompareURLs(By.xpath(webElementMediaResourcesButton),path,"MediaResourcesURL");

        }catch (Exception e) {
            clickOnElement(mediaResourcesButton);
            String url = getCurrentPageUrl();
            return  compareTextToExpectedString(url,path,"MediaResourcesURL");
        }
    }
    public boolean getVisitUsButton() throws Exception{
        getEducationAndTrainingpage();
        if(closeAlert.isDisplayed())
            closeAlert.click();
        scrollToElementJScript(visitUsButton);
        wait.until(ExpectedConditions.elementToBeClickable(visitUsButton));
        try {
            return clickLinksSwitchTabsCompareURLs(By.xpath(webElementViewMoreButton),path,"VisitUsURL");
        }catch (Exception e) {
            clickOnElement(visitUsButton);
            String url = getCurrentPageUrl();
            return  compareTextToExpectedString(url,path,"VisitUsURL");
        }
    }

}
