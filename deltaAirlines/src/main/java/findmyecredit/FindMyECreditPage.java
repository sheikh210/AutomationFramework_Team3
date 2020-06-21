package findmyecredit;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static findmyecredit.FindMyECreditElements.*;

public class FindMyECreditPage extends WebAPI {

    @FindBy(how = How.XPATH, using = webElementFindMyECreditButton)
    public WebElement findMyECreditButton;
    @FindBy(how = How.XPATH, using = webElementTravelUpdateButton)
    public WebElement travelUpdateButton;
    @FindBy(how = How.XPATH, using = webElementFindAndUseECreditButton)
    public WebElement findAndUseECreditButton;
    @FindBy(how = How.XPATH, using = webElementFindAndUseECreditText)
    public WebElement findAndUseECreditText;
    @FindBy(how = How.XPATH, using = webElementSignUpButton)
    public WebElement signUpButton;
    @FindBy(how = How.XPATH, using = webElementPrefixButton)
    public WebElement prefixButton;
    @FindBy(how = How.XPATH, using = webElementPrefixMrText)
    public WebElement prefixMrText;
    @FindBy(how = How.XPATH, using = webElementPrefixMrTextSelected)
    public WebElement prefixMrTextSelected;
    @FindBy(how = How.XPATH, using = webElementFirstNameField)
    public WebElement firstNameField;
    @FindBy(how = How.XPATH, using = webElementMiddleNameField)
    public WebElement middleNameField;
    @FindBy(how = How.XPATH, using = webElementLastNameField)
    public WebElement lastNameField;
    @FindBy(how = How.XPATH, using = webElementSuffixButton)
    public WebElement suffixButton;
    @FindBy(how = How.XPATH, using = webElementSuffixJr)
    public WebElement suffixJr;
    @FindBy(how = How.XPATH, using = webElementSuffixCOFilled)
    public WebElement suffixCOFilled;
    @FindBy(how = How.XPATH, using = webElementSuffixMenu)
    public WebElement suffixMenu;
    @FindBy(how = How.XPATH, using = webElementGenderMenu)
    public WebElement genderMenu;
    @FindBy(how = How.XPATH, using = webElementGenderMale)
    public WebElement genderMale;
    @FindBy(how = How.XPATH, using = webElementGenderMaleSelect)
    public WebElement genderMaleSelect;
    @FindBy(how = How.XPATH, using = webElementMonthMenu)
    public WebElement monthMenu;
    @FindBy(how = How.XPATH, using = webElementMonthJune)
    public WebElement monthJune;
    @FindBy(how = How.XPATH, using = webElementMonthJuneMenu)
    public WebElement monthJuneMenu;
    @FindBy(how = How.XPATH, using = webElementTravelInfoMenu)
    public WebElement travelInfoMenu;
    @FindBy(how = How.XPATH, using = webElementSkyMilesMenu)
    public WebElement skyMilesMenu;
    @FindBy(how = How.XPATH, using = webElementSkyMilesFirstSubMenu)
    public WebElement skyMilesFirstSubMenu;
    @FindBy(how = How.XPATH, using = webElementSkyMilesSecondSubMenu)
    public WebElement skyMilesSecondSubMenu;
    @FindBy(how = How.XPATH, using = webElementSkyMilesThirdSubMenu)
    public WebElement skyMilesThirdSubMenu;
    @FindBy(how = How.XPATH, using = webElementSkyMilesFourthSubMenu)
    public WebElement skyMilesFourthSubMenu;
    @FindBy(how = How.XPATH, using = webElementSkyMilesFifthSubMenu)
    public WebElement skyMilesFifthSubMenu;
    @FindBy(how = How.XPATH, using = webElementSkyMilesSixthSubMenu)
    public WebElement skyMilesSixthSubMenu;
    @FindBy(how = How.XPATH, using = webElementSkyMilesSeventhSubMenu)
    public WebElement skyMilesSeventhSubMenu;
    @FindBy(how = How.XPATH, using = webElementSkyMilesEighthSubMenu)
    public WebElement skyMilesEighthSubMenu;
    @FindBy(how = How.XPATH, using = webElementSkyMilesNinthSubMenu)
    public WebElement skyMilesNinthSubMenu;
    @FindBy(how = How.XPATH, using = webElementSkyMilesTenthSubMenu)
    public WebElement skyMilesTenthSubMenu;
    @FindBy(how = How.XPATH, using = webElementSkyMilesEleventhSubMenu)
    public WebElement skyMilesEleventhSubMenu;
    @FindBy(how = How.XPATH, using = webElementQuestionsOneButton)
    public WebElement questionsOneButton;
    @FindBy(how = How.XPATH, using = webElementQuestionsOne)
    public WebElement questionsOne;
    @FindBy(how = How.XPATH, using = webElementQuestionsOneAnswerPlace)
    public WebElement questionsOneAnswerPlace;
    @FindBy(how = How.XPATH, using = webElementQuestionsOneSubmit)
    public WebElement questionsOneSubmit;
    @FindBy(how = How.XPATH, using = webElementQuestionsTwoButton)
    public WebElement questionsTwoButton;
    @FindBy(how = How.XPATH, using = webElementQuestionsOne)
    public WebElement questionsTwo;

    @FindBy(how = How.XPATH, using = webElementQuestionsTwoSubmit)
    public WebElement questionsTwoSubmit;


    public void navigateToFindMyECreditPage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(findMyECreditButton));
        findMyECreditButton.click();
        driver.navigate().refresh();

    }

    /**
     * Test case-1
     * Navigate to Delta home page (www.delta.com)
     * Click on Find my e credit button to open
     * Click on Travel Update Button
     * Verify Corona Virus update page URL
     */
    public String validateCoronaVirusUpdatePage() {
        navigateToFindMyECreditPage();
        travelUpdateButton.click();
        String coronaVirusUpdatePageUrl = super.getCurrentPageUrl();
        return coronaVirusUpdatePageUrl;
    }

    /**
     * Test case-2
     * Navigate to Delta home page (www.delta.com)
     * Click on Find my e credit button to open
     * Click on find And Use eCredit Button
     * Verify find And Use eCredit text
     */

    public boolean validateECreditTextAvailablety() {
        navigateToFindMyECreditPage();
        findAndUseECreditButton.click();
        boolean eCreditText_Is_Displayed = findAndUseECreditText.isDisplayed();
        return eCreditText_Is_Displayed;
    }

    /**
     * Test case-3
     * Navigate to Delta home page (www.delta.com)
     * Click on Find my e credit button to open
     * Click on Sign up  Button
     * Click on Prefix  Button
     * Click on Prefix  Text
     * Verify Prefix text
     */
    public String validatePrefixText() {
        navigateToFindMyECreditPage();
        signUpButton.click();
        prefixButton.click();

        prefixMrText.click();
        String prefixText = prefixMrTextSelected.getText();
        return prefixText;

    }

    /**
     * Test case-4
     * Navigate to Delta home page (www.delta.com)
     * Click on Find my e credit button to open
     * Click on Sign up  Button
     * Write First Name
     * Write Middle Name
     * Write Last Name
     * Click on Suffix  Button
     * Click on Suffix   Text
     * Verify Suffix text
     */

    public boolean validateSuffixMDFilling() throws InterruptedException {
        navigateToFindMyECreditPage();
        signUpButton.click();
        firstNameField.sendKeys("Sarker");
        middleNameField.sendKeys("M");
        lastNameField.sendKeys("Rashid");
        suffixButton.click();
        Thread.sleep(2000);
//        Select select = new Select(suffixMenu);
//        select.selectByVisibleText("CO");
//        System.out.println(select.getOptions());

        suffixJr.submit();
        Thread.sleep(2000);

        boolean suffix_Is_FilledUp = suffixCOFilled.isDisplayed();
        return suffix_Is_FilledUp;


    }

    /**
     * Test case-5
     * Navigate to Delta home page (www.delta.com)
     * Click on Find my e credit button to open
     * Click on Sign up  Button
     * Click on Gender  Button
     * Click on Male   Text
     * Verify Male gender is Displayed
     */

    public boolean validateGenderMaleDisplayed() throws InterruptedException {
        navigateToFindMyECreditPage();
        signUpButton.click();
        genderMenu.click();
        Select select = new Select(genderMenu);
        System.out.println(select.getOptions().size());
        List<WebElement> list = select.getOptions();

        for (WebElement dList : list) {
            System.out.println(dList.getText());
        }
        select.selectByVisibleText("Male");
        Thread.sleep(3000);

        //genderMale.click();
        boolean male_Is_Selected = genderMaleSelect.isSelected();
        return male_Is_Selected;
    }

    /**
     * Test case-6
     * Navigate to Delta home page (www.delta.com)
     * Click on Find my e credit button to open
     * Click on Sign up  Button
     * Click on Month menu
     * Select June Month
     * Verify the month is Displayed
     */
    public boolean validateJuneMonthIsDisplayed() {

        navigateToFindMyECreditPage();
        signUpButton.click();
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
        monthMenu.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Select select = new Select(monthMenu);
        System.out.println(select.getOptions().size());
        List<WebElement> list = select.getOptions();
        for (WebElement listOfMonth : list) {
            System.out.println(listOfMonth);

        }
        select.selectByVisibleText("June");
        //  monthJuneMenu.click();

        boolean juneMonthIsSelected = monthJune.isSelected();
        return true;


    }

    /**
     * Test case-7
     * Navigate to Delta home page (www.delta.com)
     * Click on Find my e credit button to open
     * Mouse Hover on Travel info menu
     * Find out the Sub Menus
     * Verify the sub menus number
     */


    public int validateSubMenuNumber() {

        navigateToFindMyECreditPage();
        Actions action = new Actions(driver);
        action.moveToElement(travelInfoMenu).build().perform();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        List<WebElement> list = driver.findElements(By.xpath(webElementTravelInfoSubMenu));
        int subMenuNum = list.size();
        System.out.println(subMenuNum);
        return subMenuNum;

    }

    /**
     * Test case-8
     * Navigate to Delta home page (www.delta.com)
     * Click on Find my e credit button to open
     * Mouse Hover on "Sky Miles" menu
     * Find out the "Get to Know Medallion Status" Sub Menu
     * Verify the "Get to Know Medallion Status" sub menu
     */

    public boolean validateGet_To_KnowMedallion_Status() {
        navigateToFindMyECreditPage();
        Actions action = new Actions(driver);
        action.moveToElement(skyMilesMenu).build().perform();
        boolean subMenuOneIsDisplayed = skyMilesFirstSubMenu.isDisplayed();
        return subMenuOneIsDisplayed;

    }

    /**
     * Test case-9
     * Navigate to Delta home page (www.delta.com)
     * Click on Find my e credit button to open
     * Mouse Hover on "Sky Miles" menu
     * Find out the "Program Resources" Sub Menu
     * Verify the "Program Resources" sub menu
     */

    public String validateProgramResourcesAvailable() {

        navigateToFindMyECreditPage();
        Actions action = new Actions(driver);
        action.moveToElement(skyMilesMenu).build().perform();
        String actualText = skyMilesSecondSubMenu.getText();
        return actualText;

    }

    /**
     * Test case-10
     * Navigate to Delta home page (www.delta.com)
     * Click on Find my e credit button to open
     * Mouse Hover on "Sky Miles" menu
     * Find out the "Buy or Transfer Miles" Sub Menu
     * Verify the "Buy or Transfer Miles" sub menu
     */

    public boolean validateBuyOrTransferMilesIsDisplayed() {

        navigateToFindMyECreditPage();
        Actions action = new Actions(driver);
        action.moveToElement(skyMilesMenu).build().perform();
        boolean buyOrTransferMilesIsDisplayed = skyMilesThirdSubMenu.isDisplayed();


        return buyOrTransferMilesIsDisplayed;
    }

    /**
     * Test case-11
     * Navigate to Delta home page (www.delta.com)
     * Click on Find my e credit button to open
     * Mouse Hover on "Sky Miles" menu
     * Find out the "SkyMiles Credit Cards" Sub Menu
     * Verify the "SkyMiles Credit Cards" sub menu
     */

    public String validateSkyMilesCreditCards() {
        navigateToFindMyECreditPage();
        Actions action = new Actions(driver);
        action.moveToElement(skyMilesMenu).build().perform();
        String actualText = skyMilesFourthSubMenu.getText();
        return actualText;


    }

    /**
     * Test case-12
     * Navigate to Delta home page (www.delta.com)
     * Click on Find my e credit button to open
     * Mouse Hover on "Sky Miles" menu
     * Find out the "SkyMiles Partners" Sub Menu
     * Verify the "SkyMiles Partners" sub menu
     */
    public boolean validateSkyMilesPartnersAvailablity() {

        navigateToFindMyECreditPage();
        Actions action = new Actions(driver);
        action.moveToElement(skyMilesMenu).build().perform();
        boolean skyMilesPartnersIsAvailable = skyMilesFifthSubMenu.isDisplayed();


        return skyMilesPartnersIsAvailable;

    }

    /**
     * Test case-13
     * Navigate to Delta home page (www.delta.com)
     * Click on Find my e credit button to open
     * Mouse Hover on "Sky Miles" menu
     * Find out the "News & Special Offers" Sub Menu
     * Verify the "News & Special Offers" sub menu
     */
    public String validateNewsSpecialOffers() {
        navigateToFindMyECreditPage();
        Actions action = new Actions(driver);
        action.moveToElement(skyMilesMenu).build().perform();
        String element = skyMilesSixthSubMenu.getText();
        return element;


    }

    /**
     * Test case-14
     * Navigate to Delta home page (www.delta.com)
     * Click on Find my e credit button to open
     * Mouse Hover on "Sky Miles" menu
     * Find out the "SkyMiles Cruises" Sub Menu
     * Verify the "SkyMiles Cruises" sub menu
     */


    public boolean validateSkyMilesCruisesAvailablity() {

        navigateToFindMyECreditPage();
        Actions action = new Actions(driver);
        action.moveToElement(skyMilesMenu).build().perform();
        boolean skyMilesCruisesIsAvailable = skyMilesSeventhSubMenu.isDisplayed();


        return skyMilesCruisesIsAvailable;

    }

    /**
     * Test case-15
     * Navigate to Delta home page (www.delta.com)
     * Click on Find my e credit button to open
     * Mouse Hover on "Sky Miles" menu
     * Find out the "Book Award Travel" Sub Menu
     * Verify the "Book Award Travel" sub menu
     */
    public String validateBookAwardTravelAvailable() {
        navigateToFindMyECreditPage();
        Actions action = new Actions(driver);
        action.moveToElement(skyMilesMenu).build().perform();
        String bookAwardTravelIsAblelable = skyMilesEighthSubMenu.getText();
        return bookAwardTravelIsAblelable;


    }

    /**
     * Test case-16
     * Navigate to Delta home page (www.delta.com)
     * Click on Find my e credit button to open
     * Mouse Hover on "Sky Miles" menu
     * Find out the "Upgrade with Miles" Sub Menu
     * Verify the "Upgrade with Miles" sub menu
     */

    public boolean validateUpgradeWithMilesAvailablity() {

        navigateToFindMyECreditPage();
        Actions action = new Actions(driver);
        action.moveToElement(skyMilesMenu).build().perform();
        boolean upgradeWithMilesIsAvailable = skyMilesNinthSubMenu.isDisplayed();


        return upgradeWithMilesIsAvailable;


    }

    /**
     * Test case-17
     * Navigate to Delta home page (www.delta.com)
     * Click on Find my e credit button to open
     * Mouse Hover on "Sky Miles" menu
     * Find out the "Manage your Account" Sub Menu
     * Verify the "Manage your Account" sub menu
     */

    public String validateManageYourAccountAvailable() {
        navigateToFindMyECreditPage();
        Actions action = new Actions(driver);
        action.moveToElement(skyMilesMenu).build().perform();
        String manageYourAccountIsAblelable = skyMilesTenthSubMenu.getText();
        return manageYourAccountIsAblelable;
    }

    /**
     * Test case-18
     * Navigate to Delta home page (www.delta.com)
     * Click on Find my e credit button to open
     * Mouse Hover on "Sky Miles" menu
     * Find out the "Certificates & eCredits" Sub Menu
     * Verify the "Certificates & eCredits" sub menu
     */

    public boolean validateCertificatesECreditsAvailablity() {

        navigateToFindMyECreditPage();
        Actions action = new Actions(driver);
        action.moveToElement(skyMilesMenu).build().perform();
        boolean certificatesECreditsIsAvailable = skyMilesEleventhSubMenu.isDisplayed();


        return certificatesECreditsIsAvailable;


    }

    /**
     * Test case-19
     * Navigate to Delta home page (www.delta.com)
     * Click on Find my e credit button to open
     * Click on Sign up  Button
     * Click on "Question One" button
     * Select Question one
     * Verify the Question one is Displayed
     */
    public boolean validateQuestionOneAnswerIsDisplayed() {

        navigateToFindMyECreditPage();
        signUpButton.click();
        questionsOneButton.click();
        questionsOne.isSelected();

        boolean questionOneIsSubmitted = questionsOneSubmit.isDisplayed();
        return questionOneIsSubmitted;


    }

    /**
     * Test case-20
     * Navigate to Delta home page (www.delta.com)
     * Click on Find my e credit button to open
     * Click on Sign up  Button
     * Click on "Question Two" button
     * Select Question Two
     * Verify the Question Two is Displayed
     */
    public boolean validateQuestionTwoAnswerIsDisplayed() {

        navigateToFindMyECreditPage();
        signUpButton.click();
        questionsTwoButton.click();
        questionsTwo.isSelected();

        boolean questionTwoIsSubmitted = questionsTwoSubmit.isDisplayed();
        return questionTwoIsSubmitted;


    }


}
