package homepage;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import javax.swing.*;
import javax.swing.text.html.CSS;

import static homepage.StJudeHomepageElements.*;

public class StJudeHomepage extends WebAPI {


    @FindBy(how = How.XPATH, using = webElementAboutUs)
    public WebElement aboutUs;
    @FindBy(how = How.XPATH, using = webElementSearchingText)
    public WebElement seachingText;

    @FindBy(how = How.XPATH, using = webElementCareAndTreatment)
    public WebElement careAndTreatment;
    @FindBy(how = How.XPATH, using = webElementSearchBar)
    public WebElement searchBar;

    @FindBy(how = How.XPATH, using = webElementResearch)
    public WebElement research;
    @FindBy(how = How.XPATH, using = webElementSearchTopic)
    public WebElement searchTopic;

    @FindBy(how = How.XPATH, using = webElementTraining)
    public WebElement training;
    @FindBy(how = How.XPATH, using = webElementSearchTrainingTopic)
    public WebElement searchTrainingTopic;


    @FindBy(how = How.XPATH, using = webElementGetInvolvedMenu)
    public WebElement getInvolvedMenu;

    @FindBy(how = How.XPATH, using = webElementWaysToGive)
    public WebElement waysToGive;
    @FindBy(how = How.XPATH, using = webElementSearchElement)
    public WebElement searchElement;

    @FindBy(how = How.XPATH, using = webElementContactUs)
    public WebElement contactUs;
    @FindBy(how = How.XPATH, using = webElementSearchButton)
    public WebElement searchButton;

    @FindBy(how = How.XPATH, using = webElementDonateNow)
    public WebElement donateNow;
    @FindBy(how = How.XPATH, using = webElementSearchingButton)
    public WebElement searchingButton;

    @FindBy(how = How.XPATH, using = webElementPatientReferrals)
    public WebElement patientReferrals;
    @FindBy(how = How.XPATH, using = webElementSearchingElement)
    public WebElement searchingElement;

    @FindBy(how = How.XPATH, using = webElementExploreOurResearch)
    public WebElement exploreOurResarch;
    @FindBy(how = How.XPATH, using = webElementSearchingTopic)
    public WebElement searchingTopic;

    @FindBy(how = How.XPATH, using = webElementSignTextAndEmailMenu)
    public WebElement signTextAndEmailMenu;

    @FindBy(how = How.XPATH, using = webElementMoreScienceAndMedicineMenu)
    public WebElement moreScienceAndMedicineMenu;

    @FindBy(how = How.XPATH, using = webElementComprehensiveCancerCenter)
    public WebElement comprehensiveCancerCenter;

    @FindBy(how = How.ID, using = webElementDropDownButton)
    public WebElement dropDownButton;
    @FindBy(how = How.XPATH, using = webElementDropDownSubMenu)
    public WebElement dropDownSubMenu;

    @FindBy(how = How.XPATH,using = webElementUniqueOperatingModel)
    public WebElement uniqueOperatingModel;

    @FindBy(how = How.XPATH, using = webElementDropDownSubMenu1)
    public WebDriverWait dropDownSubMenu1;

    @FindBy(how = How.XPATH,using = webElementBrainTumors)
    public WebElement brainTumors;




    //Test 1
    public void doSearchText() throws InterruptedException {
        try {
            aboutUs.click();
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Sleep time is not enough");
        }
    }

    public void validateSearchText() {
        String actualText = seachingText.getText();
        Assert.assertEquals(actualText, "Our Unique Operating Model");
    }

    // Test 2
    public void doSearchBar() throws InterruptedException {
        careAndTreatment.click();
    }

    public void validateSearchBar() {
        String actualText = searchBar.getText();
        Assert.assertEquals(actualText, "Does your child need treatment?");
    }

    //Test 3
    public void doSearchTopic() {
        research.click();
    }

    public void validateDoSearchTopic() {
        String actualText = searchTopic.getText();
        Assert.assertEquals(actualText, "NCI-Funded Shared Resources");
    }

    //Test 4
    public void searchTraining() {
        training.click();
    }

    public void validateSearchTrainingTopic() {
        String actualText = searchTrainingTopic.getText();
        Assert.assertEquals(actualText, "Advanced Training");
    }

    //Test 5
    public void doSearchTitle() {
        getInvolvedMenu.click();
    }

    public void validateDoSearchTitle() {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, webElementSearchingTitle);
    }

    //Test 6
    public void doSearchElement() {
        waysToGive.click();
    }

    public void validateDoSearchElement() {
        String actualText = searchElement.getText();
        Assert.assertEquals(actualText, "Send a Memorial Card");
    }

    //Test 7
    public void doSearchButton() {
        contactUs.click();
    }

    public void validateDoSearchButton() {
        String actualText = searchButton.getText();
        Assert.assertEquals(actualText, "Frequently asked questions");
    }

    //Test 8
    public void doSearchingButton() {
        donateNow.click();
    }

    public void validateDoSearchingButton() {
        String actualText = searchingButton.getText();
        Assert.assertEquals(actualText, "Make a donation to end childhood cancer");
    }

    //Test 9
    public void doSearchingElement() {
        patientReferrals.click();
    }

    public void validateDoSearchingElement() {
        String actualText = searchingElement.getText();
        Assert.assertEquals(actualText, "How to get your child admitted to St. Jude");
    }

    //Test 10
    public void doSearchingTopic() {
        exploreOurResarch.click();
    }

    public void validateDoSearchingTopic() {
        String actualText = searchingTopic.getText();
        Assert.assertEquals(actualText, "Research at St. Jude");
    }

    //Test 11
    public void doSearchUrl1() {
        signTextAndEmailMenu.click();
    }

    public void validateDoSearchUrl1() {
        String actualUrl1 = super.getCurrentPageUrl();
        System.out.println(actualUrl1);
        String expectedUrl1 = "https://www.stjude.org/get-involved/other-ways/stay-connected.html";
        Assert.assertEquals(actualUrl1, expectedUrl1, "Expected Url Not Found");
    }

    //Test 12
    public void validateHomePageTitle() {
        String homePageTitle = super.getCurrentPageTitle();
        String expectedTitle = "St. Jude Children's Research Hospital";
        Assert.assertEquals(homePageTitle, expectedTitle, "Expected title not found");
    }

    //Test 13: 243
    public void validateHomePageLinkNumber() {
        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println(list.size());
        int linkNumber = list.size();
        Assert.assertEquals(linkNumber, "243", "Expected link number not found");
    }

    //Test 14
    public void doSearchUrl2() {
        moreScienceAndMedicineMenu.click();
    }

    public void validateDoSearchUrl2() {
        String actualUrl2 = super.getCurrentPageUrl();
        System.out.println(actualUrl2);

    }

    //Test 15
    public void doSearchDisplayText() {
        careAndTreatment.click();

    }

    public void validateSearchDisplayText() {
        boolean actualText_Is_Available = searchBar.isDisplayed();
        boolean expectedText_Is_Available = true;
        Assert.assertEquals(actualText_Is_Available, expectedText_Is_Available, "Display not found");
    }

    //Test 16
    public void validateSearchUrl3() {
        research.click();
        comprehensiveCancerCenter.click();
        String actualUrl = super.getCurrentPageUrl();
        String expectedUrl = "https://www.stjude.org/research/comprehensive-cancer-center.html?sc_icid=res-mm-ccc";

    }
    //Test 17
    public void validateSearchUrl4(){
        careAndTreatment.click();
        brainTumors.click();
        String actualUrl = super.getCurrentPageUrl();
        String expectedUrl = "https://www.stjude.org/treatment/disease/brain-tumor.html?sc_icid=ct-mm-brain-tumor";

    }
    //Test 18
    public void validateSearchUrl5(){
        aboutUs.click();
        uniqueOperatingModel.click();
        String actualUrl = super.getCurrentPageUrl();
        String expectedUrl = "https://www.stjude.org/about-st-jude/unique-operating-model.html?sc_icid=us-mm-model";

    }



    //Test 19
    public void doHandleDropDownMenu() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dropDownButton));
        dropDownButton.click();
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(dropDownSubMenu).build().perform();
        dropDownSubMenu.click();
        Thread.sleep(4000);
    }

    public void validateDropDownSubMenu() {
        String currentPageUrl = super.getCurrentPageUrl();
        Assert.assertEquals(currentPageUrl, "https://www.stjude.org/disease/acute-lymphoblastic-leukemia-all.html");
    }

    //Test 20
    public void doHandleDropDownSubMenu1() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dropDownButton));
        dropDownButton.click();
        Thread.sleep(5000);
        try {
            Actions actions = new Actions(driver);
            actions.moveToElement(driver.findElement(By.xpath(webElementDropDownSubMenu1))).build().perform();
            driver.findElement(By.xpath(webElementDropDownSubMenu1)).click();
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Waiting time was not enough");
        }



    }
}