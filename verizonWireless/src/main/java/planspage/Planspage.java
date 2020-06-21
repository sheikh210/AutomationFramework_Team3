package planspage;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DataReader;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import static planspage.PlanspageElements.*;

public class Planspage extends WebAPI {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    Wait fluentWait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);
    String path = System.getProperty("user.dir") + "\\src\\main\\java\\resources\\" +
            "VerizonWireless_Planspage_Elements.xlsx";

    @FindBy(xpath = webElementButtonPlans)
            public WebElement buttonPlans;
    @FindBy(xpath = webElementButtonWireless)
            public WebElement buttonWireless;
    @FindBy(xpath = webElementPlansDropDown)
            public WebElement plansDropDown;
    @FindBy (xpath = webElementPlansDropDownButton)
            public WebElement plansDropDownButton;
    @FindBy(xpath = webElementPlansDeals)
            public WebElement plansDeals;
    @FindBy(xpath = webElementSharedDataButton)
            public WebElement sharedDataButton;
    @FindBy(xpath = webElementGetStartedButton)
            public WebElement getStartedButton;
    @FindBy(xpath = webElementSingleDeviceButton)
            public WebElement singleDeviceButton;
    @FindBy(xpath = webElementNumberShareButton)
            public WebElement numberShareButton;
    @FindBy(xpath = webElementPrepaidButton)
            public WebElement prepaidButton;
    @FindBy(xpath = webElementInternationalButton)
            public WebElement internationalButton;
    @FindBy(xpath = webElementLinesPlusButton)
            public WebElement linesPlusButton;
    @FindBy(xpath = webElementLinesMinusButton)
            public WebElement linesMinusButton;
    @FindBy(xpath = webElementLinesNeededText)
            public WebElement linesNeededText;
    @FindBy(xpath = webElementSlideRightArrow)
            public WebElement slideRightArrow;
    @FindBy(xpath = webElementSlideLeftArrow)
            public WebElement slideLeftArrow;
    @FindBy(xpath = webElementSlideBox1)
            public WebElement slideBox1;
    @FindBy(xpath = webElementSlideBox2)
            public WebElement slideBox2;
    @FindBy(xpath = webElementPhonesButton)
            public WebElement phonesButton;
    @FindBy(xpath = webElementPhonesDropDown)
            public WebElement phonesDropDown;
    @FindBy(xpath = webElementFeaturedPhonesDropDown)
            public WebElement featuredPhonesDropDown;
    @FindBy(xpath = webElementAppsAndServicesList)
            public WebElement appsAndServicesList;

    DataReader dataReader = new DataReader();

    /**
     * Test Case 1 - Navigate to Planspage
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Verizon homepage
     * 3: Click on Wireless button
     * 4: Click on Plans button
     * 5: Validate the Plans page url with what is stored in Exel
     */
    public void getPlanspage() {
            wait.until(ExpectedConditions.elementToBeClickable(buttonWireless));
            clickOnElement(buttonWireless);
            wait.until(ExpectedConditions.elementToBeClickable(buttonPlans));
            clickOnElement(buttonPlans);

        }

        public boolean validatePlanspage() throws Exception {
            getPlanspage();
            String url = getCurrentPageUrl();
            return compareTextToExpectedString(url,path,"PlanspageURL");


        }

    /**
     * Test Case 2 - Planspage Drop Down Text
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Verizon homepage
     * 3: Click on Wireless button
     * 4: Click on Plans button to navigate to plans page
     * 5: Validate Plans Drop Down Text compared to what is stored in excel
     * @return
     * @throws IOException
     */
    public boolean validatePlansDropDownText() throws IOException {
        getPlanspage();
            wait.until(ExpectedConditions.elementToBeClickable(plansDropDownButton));
            mouseHover(plansDropDownButton);
        List<WebElement> textListArray = plansDropDown.findElements(By.xpath(webElementPlansDropDown));
        String [] actualText = new String[textListArray.size()];
        int i = 0;
        for(WebElement a: textListArray)
        {
            actualText[i]=a.getText();
            i++;
        }

        return compareTextListToExpectedStringArray(actualText,path,"PlansDropDown");


        }

    /**
     * Test Case 3 - Planspage Drop Down Size
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Verizon homepage
     * 3: Click on Wireless button
     * 4: Click on Plans button to navigate to plans page
     * 5: Validate Plans Drop Down Text compared to what is stored in excel
     * @return
     * @throws IOException
     */
    public boolean validatePlansDropDownSize() throws IOException{
        getPlanspage();
        wait.until(ExpectedConditions.elementToBeClickable(plansDropDownButton));
        mouseHover(plansDropDownButton);
        List<WebElement> textListArray = plansDropDown.findElements(By.xpath(webElementPlansDropDown));
        String [] actualText = new String[textListArray.size()];
        int i = 0;
        for(WebElement a: textListArray)
        {
            actualText[i]=a.getText();
            i++;
        }
        String[] expectedPlansDropDownArray = dataReader.fileReaderStringXSSF(path, "PlansDropDown");
        boolean arrayMatches;
        if (actualText.length == expectedPlansDropDownArray.length) {
            arrayMatches = true;
            System.out.println("Plans Drop Down List size matches expected. Size of Plans Drop Down List: " + actualText.length);
        }
        else {
            arrayMatches = false;
            System.out.println("Plans Drop Down List size does not match expected. Size of actual Plans Drop Down List: "+ actualText.length);
            System.out.println("Expected size: " + expectedPlansDropDownArray.length);
        }
        return  arrayMatches;
    }

    /**
     * Test Case 4 - Plan Deal Drop Down Text
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Verizon homepage
     * 3: Click on Wireless button
     * 4: Click on Plans button to navigate to plans page
     * 5: Validate Plan Deal Text compared to what is stored in excel
     * @return
     * @throws IOException
     */
    public boolean validatePlansDealsText() throws IOException {
        getPlanspage();
        wait.until(ExpectedConditions.elementToBeClickable(plansDropDownButton));
        mouseHover(plansDropDownButton);
        List<WebElement> textListArray = plansDeals.findElements(By.xpath(webElementPlansDeals));
        String [] actualText = new String[textListArray.size()];
        int i = 0;
        for(WebElement a: textListArray)
        {
            actualText[i]=a.getText();
            i++;
        }

        return compareTextListToExpectedStringArray(actualText,path,"PlanDeals");


    }

    /**
     * Test Case 5 - Plan Deal Drop Down Size
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Verizon homepage
     * 3: Click on Wireless button
     * 4: Click on Plans button to navigate to plans page
     * 5: Validate Plan Deal Text compared to what is stored in excel
     * @return
     * @throws IOException
     */
    public boolean validatePlansDealsSize() throws IOException{
        getPlanspage();
        wait.until(ExpectedConditions.elementToBeClickable(plansDropDownButton));
        mouseHover(plansDropDownButton);
        List<WebElement> textListArray = plansDeals.findElements(By.xpath(webElementPlansDeals));
        String [] actualText = new String[textListArray.size()];
        int i = 0;
        for(WebElement a: textListArray)
        {
            actualText[i]=a.getText();
            i++;
        }
        String[] expectedPlansDropDownArray = dataReader.fileReaderStringXSSF(path, "PlanDeals");
        boolean arrayMatches;
        if (actualText.length == expectedPlansDropDownArray.length) {
            arrayMatches = true;
            System.out.println("Plans Deals List size matches expected. Size of Plans Dealsn List: " + actualText.length);
        }
        else {
            arrayMatches = false;
            System.out.println("Plans Deals List size does not match expected. Size of actual Plans Deals List: "+ actualText.length);
            System.out.println("Expected size: " + expectedPlansDropDownArray.length);
        }
        return  arrayMatches;
    }

    /**
     * Test Case 6 - Shared data Button
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Verizon homepage
     * 3: Click on Wireless button
     * 4: Click on Plans button to navigate to plans page
     * 5: Click on Shared Data Button and verify that the Get Started Button is displayed on the page
     * @return
     * @throws IOException
     */
    public boolean validateSharedDataButton()throws IOException {
        getPlanspage();
        wait.until(ExpectedConditions.elementToBeClickable(sharedDataButton));
        clickOnElement(sharedDataButton);
        fluentWait.until(ExpectedConditions.visibilityOf(getStartedButton));
        boolean isDisplayed;
        if(getStartedButton.isDisplayed() == true) {
            isDisplayed = true;
            System.out.println("Shared Data button is working");
        }
        else {
            isDisplayed = false;
            System.out.println("Shared Data button is not working");
        }
            return isDisplayed;

    }

    /**
     * Test Case 7 - Single Device Button
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Verizon homepage
     * 3: Click on Wireless button
     * 4: Click on Plans button to navigate to plans page
     * 5: Click on Single Device Button and verify that the Get Started Button is displayed on the page
     * @return
     * @throws IOException
     */
    public boolean validateSingleDeviceButton()throws IOException {
        getPlanspage();
        wait.until(ExpectedConditions.elementToBeClickable(singleDeviceButton));
        clickOnElement(singleDeviceButton);
        wait.until(ExpectedConditions.elementToBeClickable(getStartedButton));
        boolean isDisplayed;
        if(getStartedButton.isDisplayed() == true) {
            isDisplayed = true;
            System.out.println("Single Device button is working");
        }
        else {
            isDisplayed = false;
            System.out.println("Single Device button is not working");
        }
        return isDisplayed;

    }

    /**
     * Test Case 8 - Number Share Button
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Verizon homepage
     * 3: Click on Wireless button
     * 4: Click on Plans button to navigate to plans page
     * 5: Click on Number Share Button and verify that the Get Started Button is displayed on the page
     * @return
     * @throws IOException
     */
    public boolean validateNumberShareButton()throws IOException {
        getPlanspage();
        wait.until(ExpectedConditions.elementToBeClickable(numberShareButton));
        clickOnElement(numberShareButton);
        wait.until(ExpectedConditions.elementToBeClickable(getStartedButton));
        boolean isDisplayed;
        if(getStartedButton.isDisplayed() == true) {
            isDisplayed = true;
            System.out.println("Number Share button is working");
        }
        else {
            isDisplayed = false;
            System.out.println("Number Share button is not working");
        }
        return isDisplayed;

    }

    /**
     * Test Case 9 - Prepaid Button
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Verizon homepage
     * 3: Click on Wireless button
     * 4: Click on Plans button to navigate to plans page
     * 5: Click on Prepaid Button and verify that the Get Started Button is displayed on the page
     * @return
     * @throws IOException
     */
    public boolean validatePrepaidButton()throws IOException {
        getPlanspage();
        wait.until(ExpectedConditions.elementToBeClickable(prepaidButton));
        clickOnElement(prepaidButton);
        fluentWait.until(ExpectedConditions.visibilityOf(getStartedButton));
        boolean isDisplayed;
        if(getStartedButton.isDisplayed() == true) {
            isDisplayed = true;
            System.out.println("Prepaid button is working");
        }
        else {
            isDisplayed = false;
            System.out.println("Prepaid button is not working");
        }
        return isDisplayed;

    }

    /**
     * Test Case 10 - International Button
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Verizon homepage
     * 3: Click on Wireless button
     * 4: Click on Plans button to navigate to plans page
     * 5: Click on International Button and verify that the Get Started Button is displayed on the page
     * @return isDisplayed
     * @throws IOException
     */
    public boolean validateInternationalButton()throws IOException {
        getPlanspage();
        wait.until(ExpectedConditions.elementToBeClickable(internationalButton));
        clickOnElement(internationalButton);
        fluentWait.until(ExpectedConditions.visibilityOf(getStartedButton));
        boolean isDisplayed;
        if(getStartedButton.isDisplayed() == true) {
            isDisplayed = true;
            System.out.println("International button is working");
        }
        else {
            isDisplayed = false;
            System.out.println("International button is not working");
        }
        return isDisplayed;

    }

    /**
     * Test Case 11 - Plus Button for Lines needed
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Verizon homepage
     * 3: Click on Wireless button
     * 4: Click on Plans button to navigate to plans page
     * 5: Click on plus button
     * 6: Validate that the Number of lines needed changed after the plus button was clicked
     * @return
     * @throws IOException
     */
    public boolean validateLinesNeedPlus()throws IOException {
        getPlanspage();
        wait.until(ExpectedConditions.elementToBeClickable(linesPlusButton));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(webElementLinesNeededText)));
        String linesText = linesNeededText.getText().replaceAll("[^\\d]"," ").trim();
        int linesTextNum1 = Integer.parseInt(linesText);
        linesPlusButton.click();
        linesText = linesNeededText.getText().replaceAll("[^\\d]"," ").trim();
        int linesTextNum2 = Integer.parseInt(linesText);
        boolean plusWorks = false;

        if(linesTextNum1 < linesTextNum2)
        {
            plusWorks = true;
            System.out.println("Plus Button For lines Needed is working");
        }
        else if (linesTextNum1 > linesTextNum2){
            plusWorks = false;
            System.out.println("Plus Button For lines Needed not working. Lines Decreased instead.");
        }
        else if (linesTextNum1 == linesTextNum2){
            plusWorks = false;
            System.out.println("Lines needed Stayed the same");
        }

        return plusWorks;
    }

    /**
     * Test Case 12 - Minus Button for Lines needed
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Verizon homepage
     * 3: Click on Wireless button
     * 4: Click on Plans button to navigate to plans page
     * 5: Click on minus button
     * 6: Validate that the Number of lines needed changed after the minus button was clicked
     * @return
     * @throws IOException
     */
    public boolean validateLinesNeedMinus()throws IOException {
        getPlanspage();
        wait.until(ExpectedConditions.elementToBeClickable(linesMinusButton));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(webElementLinesNeededText)));
        String linesText = linesNeededText.getText().replaceAll("[^\\d]"," ").trim();
        int linesTextNum1 = Integer.parseInt(linesText);
        linesMinusButton.click();
        linesText = linesNeededText.getText().replaceAll("[^\\d]"," ").trim();
        int linesTextNum2 = Integer.parseInt(linesText);
        boolean minusWorks = false;

        if(linesTextNum1 > linesTextNum2)
        {
            minusWorks = true;
            System.out.println("Minus Button For lines Needed is working");
        }
        else if (linesTextNum1 < linesTextNum2){
            minusWorks = false;
            System.out.println("Minus Button For lines Needed not working. Lines Increased instead.");
        }
        else if (linesTextNum1 == linesTextNum2){
            minusWorks = false;
            System.out.println("Lines needed Stayed the same");
        }

        return minusWorks;
    }

    /**
     * Test Case 13 - Right arrow slide
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Verizon homepage
     * 3: Click on Wireless button
     * 4: Click on Plans button to navigate to plans page
     * 5: Click on Right arrow
     * 6: Validate that the slide number changed after the Right arrow button was clicked
     * @return
     * @throws IOException
     */
    public boolean validateSlideRightArrow()throws IOException {
        getPlanspage();
        wait.until(ExpectedConditions.elementToBeClickable(slideRightArrow));
        slideRightArrow.click();
        wait.until(ExpectedConditions.visibilityOf(slideBox2));
        boolean arrowWorks = false;
        if(slideBox2.isDisplayed())
        {
            arrowWorks = true;
            System.out.println("Right Arrow for Slides is working ");
        }
        else if (slideBox1.isDisplayed()){
            arrowWorks = false;
            System.out.println("Right Arrow for Slides not working. Left arrow clicked instead. ");
        }
        else {
            arrowWorks = false;
            System.out.println("Slides Stayed the same ");
        }

        return arrowWorks;
    }

    /**
     * Test Case 14 - Left arrow slide
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Verizon homepage
     * 3: Click on Wireless button
     * 4: Click on Plans button to navigate to plans page
     * 5: Click on Left arrow
     * 6: Validate that the slide number changed after the Left arrow button was clicked
     * @return
     * @throws IOException
     */
    public boolean validateSlideLeftArrow()throws IOException {
        getPlanspage();
        wait.until(ExpectedConditions.elementToBeClickable(slideLeftArrow));
        slideLeftArrow.click();
        wait.until(ExpectedConditions.visibilityOf(slideBox1));
        boolean arrowWorks = false;
        if(slideBox1.isDisplayed())
        {
            arrowWorks = true;
            System.out.println("Left Arrow for Slides is working ");
        }
        else if (slideBox2.isDisplayed()){
            arrowWorks = false;
            System.out.println("Left Arrow for Slides not working. Right arrow clicked instead. ");
        }
        else {
            arrowWorks = false;
            System.out.println("Slides Stayed the same ");
        }

        return arrowWorks;
    }

    /**
     * Test Case 15 - Phones Drop Down Text
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Verizon homepage
     * 3: Click on Wireless button
     * 4: Click on Plans button to navigate to plans page
     * 5: Validate Phones Drop Down Text compared to what is stored in excel
     * @return
     * @throws IOException
     */
    public boolean validatePhonesDropDownText() throws IOException {
        getPlanspage();
        wait.until(ExpectedConditions.elementToBeClickable(phonesButton));
        mouseHover(phonesButton);
        List<WebElement> textListArray = phonesDropDown.findElements(By.xpath(webElementPhonesDropDown));
        String [] actualText = new String[textListArray.size()];
        int i = 0;
        for(WebElement a: textListArray)
        {
            actualText[i]=a.getText();
            i++;
        }

        return compareTextListToExpectedStringArray(actualText,path,"PhonesDropDown");


    }

    /**
     * Test Case 16 - Phones Drop Down Size
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Verizon homepage
     * 3: Click on Wireless button
     * 4: Click on Plans button to navigate to plans page
     * 5: Validate Phones Drop Down Text compared to what is stored in excel
     * @return
     * @throws IOException
     */
    public boolean validatePhonesDropDownSize() throws IOException{
        getPlanspage();
        wait.until(ExpectedConditions.elementToBeClickable(phonesButton));
        mouseHover(phonesButton);
        List<WebElement> textListArray = phonesDropDown.findElements(By.xpath(webElementPhonesDropDown));
        String [] actualText = new String[textListArray.size()];
        int i = 0;
        for(WebElement a: textListArray)
        {
            actualText[i]=a.getText();
            i++;
        }
        String[] expectedPlansDropDownArray = dataReader.fileReaderStringXSSF(path, "PhonesDropDown");
        boolean arrayMatches;
        if (actualText.length == expectedPlansDropDownArray.length) {
            arrayMatches = true;
            System.out.println("Phones Drop Down List size matches expected. Size of Phones Drop Down List: " + actualText.length);
        }
        else {
            arrayMatches = false;
            System.out.println("Phones Drop Down List size does not match expected. Size of actual Featured Phones Drop Down List: "+ actualText.length);
            System.out.println("Expected size: " + expectedPlansDropDownArray.length);
        }
        return  arrayMatches;
    }
    /**
     * Test Case 17 - Featured Phones Drop Down Text
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Verizon homepage
     * 3: Click on Wireless button
     * 4: Click on Plans button to navigate to plans page
     * 5: Validate Featured Phones Drop Down Text compared to what is stored in excel
     * @return
     * @throws IOException
     */
    public boolean validateFeaturedPhonesDropDownText() throws IOException {
        getPlanspage();
        wait.until(ExpectedConditions.elementToBeClickable(phonesButton));
        mouseHover(phonesButton);
        List<WebElement> textListArray = featuredPhonesDropDown.findElements(By.xpath(webElementFeaturedPhonesDropDown));
        String [] actualText = new String[textListArray.size()];
        int i = 0;
        for(WebElement a: textListArray)
        {
            actualText[i]=a.getText();
            i++;
        }

        return compareTextListToExpectedStringArray(actualText,path,"FeaturedPhones");


    }

    /**
     * Test Case 18 - Phones Drop Down Size
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Verizon homepage
     * 3: Click on Wireless button
     * 4: Click on Plans button to navigate to plans page
     * 5: Validate Featured Phones Drop Down Text compared to what is stored in excel
     * @return
     * @throws IOException
     */
    public boolean validateFeaturedPhonesDropDownSize() throws IOException{
        getPlanspage();
        wait.until(ExpectedConditions.elementToBeClickable(phonesButton));
        mouseHover(phonesButton);
        List<WebElement> textListArray = featuredPhonesDropDown.findElements(By.xpath(webElementFeaturedPhonesDropDown));
        String [] actualText = new String[textListArray.size()];
        int i = 0;
        for(WebElement a: textListArray)
        {
            actualText[i]=a.getText();
            i++;
        }
        String[] expectedPlansDropDownArray = dataReader.fileReaderStringXSSF(path, "FeaturedPhones");
        boolean arrayMatches;
        if (actualText.length == expectedPlansDropDownArray.length) {
            arrayMatches = true;
            System.out.println("Featured Phones Drop Down List size matches expected. Size of Featured Phones Drop Down List: " + actualText.length);
        }
        else {
            arrayMatches = false;
            System.out.println("Featured Phones Drop Down List size does not match expected. Size of actual Featured Phones Drop Down List: "+ actualText.length);
            System.out.println("Expected size: " + expectedPlansDropDownArray.length);
        }
        return  arrayMatches;
    }

    /**
     * Test Case 19 - Apps & Services Text
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Verizon homepage
     * 3: Click on Wireless button
     * 4: Click on Plans button to navigate to plans page
     * 5: Validate Apps & Services Text compared to what is stored in excel
     * @return
     * @throws IOException
     */
    public boolean validateAppsAndServicesList() throws IOException {
        getPlanspage();
        wait.until(ExpectedConditions.visibilityOf(appsAndServicesList));
        List<WebElement> textListArray = appsAndServicesList.findElements(By.xpath(webElementAppsAndServicesList));
        String [] actualText = new String[textListArray.size()];
        int i = 0;
        for(WebElement a: textListArray)
        {
            actualText[i]=a.getText();
            i++;
        }
        return compareTextListToExpectedStringArray(actualText,path,"AppsAndServicesList");


    }

    /**
     * Test Case 20 - Apps & Services Size
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Verizon homepage
     * 3: Click on Wireless button
     * 4: Click on Plans button to navigate to plans page
     * 5: Validate Apps & Services Text compared to what is stored in excel
     * @return
     * @throws IOException
     */
    public boolean validateAppsAndServicesListSize() throws IOException{
        getPlanspage();
        wait.until(ExpectedConditions.elementToBeClickable(appsAndServicesList));
        List<WebElement> textListArray = appsAndServicesList.findElements(By.xpath(webElementAppsAndServicesList));
        String [] actualText = new String[textListArray.size()];
        int i = 0;
        for(WebElement a: textListArray)
        {
            actualText[i]=a.getText();
            i++;
        }
        String[] expectedPlansDropDownArray = dataReader.fileReaderStringXSSF(path, "AppsAndServicesList");
        boolean arrayMatches;
        if (actualText.length == expectedPlansDropDownArray.length) {
            arrayMatches = true;
            System.out.println("Apps And Services List size matches expected. Size of Apps And Services List: " + actualText.length);
        }
        else {
            arrayMatches = false;
            System.out.println("Apps And Services List size does not match expected. Size of actual Apps And Services List: "+ actualText.length);
            System.out.println("Expected size: " + expectedPlansDropDownArray.length);
        }
        return  arrayMatches;
    }



}
