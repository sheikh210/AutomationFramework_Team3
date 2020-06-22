package employerspage;
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
import static employerspage.EmployerspageElements.*;

public class Employerspage extends WebAPI {

    WebDriverWait wait = new WebDriverWait(driver, 10);
    Wait fluentWait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);
    String path = System.getProperty("user.dir") + "\\src\\main\\resources\\" +
            "Aetna_Employerspage_Elements.xlsx";
    DataReader dataReader = new DataReader();

    @FindBy(xpath = webElementExploreAetnaSitesDropDown)
            public WebElement exploreAetnaSitesDropDown;
    @FindBy(xpath = webElementForEmployersLink)
            public WebElement forEmployersLink;
    @FindBy(xpath = webElementProductsAndServicesButton)
            public WebElement productsAndServicesButton;
    @FindBy(xpath = webElementProductsAndServicesMenu)
            public WebElement productsAndServicesMenu;
    @FindBy(xpath = webElementGetAQuoteButton)
            public WebElement getAQuoteButton;
    @FindBy(xpath = webElementHealthPlansButton)
            public WebElement healthPlansButton;
    @FindBy(xpath = webElementHealthPlansList)
            public WebElement healthPlansList;
    @FindBy(xpath = webElementMemberProgramsButton)
            public WebElement memberProgramsButton;
    @FindBy(xpath = webElementMemberProgramsList)
            public WebElement memberProgramsList;
    @FindBy(xpath = webElementAdministrationOfferingsList)
            public WebElement administrationOfferingsList;
    @FindBy(xpath = webElementAdministrationOfferingsButton)
            public WebElement administrationOfferingsButton;
    @FindBy(xpath = webElementSolutionsButton)
            public WebElement solutionsButton;
    @FindBy(xpath = webElementSolutionsMenu1)
            public WebElement solutionsMenu1;
    @FindBy(xpath = webElementSolutionsMenu2)
            public WebElement solutionsMenu2;
    @FindBy(xpath = webElementByCompanySizeList)
            public WebElement byCompanySizeList;
    @FindBy(xpath = webElementByCompanySizeButton)
            public WebElement byCompanySizeButton;
    @FindBy(xpath = webElementByIndustryList)
            public WebElement byIndustryList;
    @FindBy(xpath = webElementByIndustryButton)
            public WebElement byIndustryButton;
    @FindBy(xpath = webElementResourcesButton)
            public WebElement resourcesButton;
    @FindBy(xpath = webElementResourcesMenu1)
            public WebElement resourcesMenu1;
    @FindBy(xpath = webElementResourcesMenu2)
            public WebElement resourcesMenu2;
    @FindBy(xpath = webElementPayYourBillList)
            public WebElement payYourBillList;
    @FindBy(xpath = webElementPayYourBillButton)
            public WebElement payYourBillButton;
    @FindBy(xpath = webElementToolsManualsFormsList)
            public WebElement toolsManualsFormsList;
    @FindBy(xpath = webElementToolsManualsFormsButton)
    public WebElement toolsManualsFormsButton;
    @FindBy(xpath = webElementTrendsAndInsightsButton)
            public WebElement trendsAndInsightsButton;
    @FindBy(xpath = webElementTrendsAndInsightsList)
            public WebElement trendsAndInsightsList;

    /**
     * Test Case 1 - Navigate to Employerspage
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Aetna homepage
     * 3: Click on Explore Aetna Sites to reveal dropdown menu
     * 4: Click on For Employers link
     * 5: Validate the For Employers page url with what is stored in Exel
     */
    public void getEmployersPage() {
        wait.until(ExpectedConditions.elementToBeClickable(exploreAetnaSitesDropDown));
        clickOnElement(exploreAetnaSitesDropDown);
        wait.until(ExpectedConditions.elementToBeClickable(forEmployersLink));
        clickOnElement(forEmployersLink);

    }

    public boolean validatePlanspage() throws Exception {
        getEmployersPage();
        String url = getCurrentPageUrl();
        return compareTextToExpectedString(url,path,"EmployersPageURL");


    }
    /**
     * Test Case 2: Products & Services Dropdown
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Aetna homepage
     * 3: Click on Explore Aetna Sites to reveal dropdown menu
     * 4: Click on For Employers link
     * 5: Get List of link text under Products & Services
     * 6: Validate the text by comparing to what is stored in excel
     */
    public boolean getProductsAndServicesDropDown() throws Exception{
        getEmployersPage();
        wait.until(ExpectedConditions.elementToBeClickable(productsAndServicesButton));
        clickOnElement(productsAndServicesButton);
        List<WebElement> textListArray = productsAndServicesMenu.findElements(By.xpath(webElementProductsAndServicesMenu));
        String [] actualText = new String[textListArray.size()];
        int i = 0;
        for(WebElement a: textListArray)
        {
            actualText[i]=a.getText();
            i++;
        }

        return compareTextListToExpectedStringArray(actualText,path,"ProductsAndServicesDropDown");

    }

    /**
     * Test Case 3: Health plans list under P&S Dropdown
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Aetna homepage
     * 3: Click on Explore Aetna Sites to reveal dropdown menu
     * 4: Click on For Employers link
     * 5: Get List of link text under Health plans
     * 6: Validate the text by comparing to what is stored in excel
     * @return
     * @throws Exception
     */
    public boolean getHealthPlansList() throws Exception{
        getEmployersPage();
        wait.until(ExpectedConditions.elementToBeClickable(productsAndServicesButton));
        clickOnElement(productsAndServicesButton);
        wait.until(ExpectedConditions.elementToBeClickable(healthPlansButton));
        clickOnElement(healthPlansButton);
        wait.until(ExpectedConditions.visibilityOf(healthPlansList));
        List<WebElement> textListArray = healthPlansList.findElements(By.xpath(webElementHealthPlansList));
        String [] actualText = new String[textListArray.size()];
        int i = 0;
        for(WebElement a: textListArray)
        {
            actualText[i]=a.getText();
            i++;
        }

        return compareTextListToExpectedStringArray(actualText,path,"Healthplans");

    }
    public boolean validateHealthPlansNum() throws IOException{
        getEmployersPage();
        wait.until(ExpectedConditions.elementToBeClickable(productsAndServicesButton));
        clickOnElement(productsAndServicesButton);
        wait.until(ExpectedConditions.elementToBeClickable(healthPlansButton));
        clickOnElement(healthPlansButton);
        wait.until(ExpectedConditions.visibilityOf(healthPlansList));
        List<WebElement> textListArray = healthPlansList.findElements(By.xpath(webElementHealthPlansList));
        String [] actualText = new String[textListArray.size()];
        int i = 0;
        for(WebElement a: textListArray)
        {
            actualText[i]=a.getText();
            i++;
        }
        String[] expectedByCompanySizeArray = dataReader.fileReaderStringXSSF(path, "Healthplans");
        boolean arrayMatches;
        if (actualText.length == expectedByCompanySizeArray.length) {
            arrayMatches = true;
            System.out.println("Health plans List size matches expected. Size of Health plans List: " + actualText.length);
        }
        else {
            arrayMatches = false;
            System.out.println("Health plans List size does not match expected. Size of actual Health plans List: "+ actualText.length);
            System.out.println("Expected size: " + expectedByCompanySizeArray.length);
        }
        return  arrayMatches;
    }

    /**
     *Test Case 4: Member programs list under P&S Dropdown
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Aetna homepage
     * 3: Click on Explore Aetna Sites to reveal dropdown menu
     * 4: Click on For Employers link
     * 5: Get List of link text under Member programs list
     * 6: Validate the text by comparing to what is stored in excel
     */
    public boolean getMemberPrograms() throws Exception{
        getEmployersPage();
        wait.until(ExpectedConditions.elementToBeClickable(productsAndServicesButton));
        clickOnElement(productsAndServicesButton);
        wait.until(ExpectedConditions.elementToBeClickable(memberProgramsButton));
        clickOnElement(memberProgramsButton);
        wait.until(ExpectedConditions.visibilityOf(memberProgramsList));
        List<WebElement> textListArray = memberProgramsList.findElements(By.xpath(webElementMemberProgramsList));
        String [] actualText = new String[textListArray.size()];
        int i = 0;
        for(WebElement a: textListArray)
        {
            actualText[i]=a.getText();
            i++;
        }

        return compareTextListToExpectedStringArray(actualText,path,"MemberPrograms");

    }
    public boolean validateMemberProgramsNum() throws IOException{
        getEmployersPage();
        wait.until(ExpectedConditions.elementToBeClickable(productsAndServicesButton));
        clickOnElement(productsAndServicesButton);
        wait.until(ExpectedConditions.elementToBeClickable(memberProgramsButton));
        clickOnElement(memberProgramsButton);
        wait.until(ExpectedConditions.visibilityOf(memberProgramsList));
        List<WebElement> textListArray = memberProgramsList.findElements(By.xpath(webElementMemberProgramsList));
        String [] actualText = new String[textListArray.size()];
        int i = 0;
        for(WebElement a: textListArray)
        {
            actualText[i]=a.getText();
            i++;
        }
        String[] expectedByCompanySizeArray = dataReader.fileReaderStringXSSF(path, "MemberPrograms");
        boolean arrayMatches;
        if (actualText.length == expectedByCompanySizeArray.length) {
            arrayMatches = true;
            System.out.println("Member Programs List size matches expected. Size of Member Programs List: " + actualText.length);
        }
        else {
            arrayMatches = false;
            System.out.println("Member Programs List size does not match expected. Size of actual Member Programs List: "+ actualText.length);
            System.out.println("Expected size: " + expectedByCompanySizeArray.length);
        }
        return  arrayMatches;
    }

    /**
     * Test Case 5: Administration offerings list under P&S Dropdown
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Aetna homepage
     * 3: Click on Explore Aetna Sites to reveal dropdown menu
     * 4: Click on For Employers link
     * 5: Get List of link text under Administration offerings
     * 6: Validate the text by comparing to what is stored in excel
     */
    public boolean getAdministrationOfferings() throws Exception{
        getEmployersPage();
        wait.until(ExpectedConditions.elementToBeClickable(productsAndServicesButton));
        clickOnElement(productsAndServicesButton);
        wait.until(ExpectedConditions.elementToBeClickable(administrationOfferingsButton));
        clickOnElement(administrationOfferingsButton);
        wait.until(ExpectedConditions.visibilityOf(administrationOfferingsList));
        List<WebElement> textListArray = administrationOfferingsList.findElements(By.xpath(webElementAdministrationOfferingsList));
        String[] actualText = new String[textListArray.size()];
        int i = 0;
        for (WebElement a : textListArray) {
            actualText[i] = a.getText();
            i++;
        }
        return compareTextListToExpectedStringArray(actualText,path,"AdministrationOfferings");

    }
    public boolean validateAdministrationOfferingsNum() throws IOException{
        getEmployersPage();
        wait.until(ExpectedConditions.elementToBeClickable(productsAndServicesButton));
        clickOnElement(productsAndServicesButton);
        wait.until(ExpectedConditions.elementToBeClickable(administrationOfferingsButton));
        clickOnElement(administrationOfferingsButton);
        wait.until(ExpectedConditions.visibilityOf(administrationOfferingsList));
        List<WebElement> textListArray = administrationOfferingsList.findElements(By.xpath(webElementAdministrationOfferingsList));
        String[] actualText = new String[textListArray.size()];
        int i = 0;
        for (WebElement a : textListArray) {
            actualText[i] = a.getText();
            i++;
        }
        String[] expectedByCompanySizeArray = dataReader.fileReaderStringXSSF(path, "AdministrationOfferings");
        boolean arrayMatches;
        if (actualText.length == expectedByCompanySizeArray.length) {
            arrayMatches = true;
            System.out.println("Administration Offerings List size matches expected. Size of Administration Offerings List: " + actualText.length);
        }
        else {
            arrayMatches = false;
            System.out.println("Administration Offerings List size does not match expected. Size of actual Administration Offerings List: "+ actualText.length);
            System.out.println("Expected size: " + expectedByCompanySizeArray.length);
        }
        return  arrayMatches;
    }

    /**
     * Test Case 6: Solutions Dropdown
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Aetna homepage
     * 3: Click on Explore Aetna Sites to reveal dropdown menu
     * 4: Click on For Employers link
     * 5: Get List of link text under Solutions
     * 6: Validate the text by comparing to what is stored in excel
     * @return
     * @throws Exception
     */
    public boolean getSolutionsMenu() throws Exception{
        getEmployersPage();
        wait.until(ExpectedConditions.elementToBeClickable(solutionsButton));
        clickOnElement(solutionsButton);
        wait.until(ExpectedConditions.visibilityOf(solutionsMenu1));
        List<WebElement> textListArray = solutionsMenu1.findElements(By.xpath(webElementSolutionsMenu1));
        String[] actualText = new String[textListArray.size()];
        int i = 0;
        for (WebElement a : textListArray) {
            actualText[i] = a.getText();
            i++;
        }
        wait.until(ExpectedConditions.visibilityOf(solutionsMenu2));
        List<WebElement> textListArray2 = solutionsMenu2.findElements(By.xpath(webElementSolutionsMenu2));
        String[] actualText2 = new String[textListArray2.size()];
        int j = 0;
        for (WebElement a : textListArray2) {
            actualText2[j] = a.getText();
            j++;
        }
        boolean menuIsValid = false;
        if((compareTextListToExpectedStringArray(actualText,path,"Solutions1") && compareTextListToExpectedStringArray(actualText2,path,"Solutions2"))==true)
            menuIsValid = true;
        return menuIsValid;

    }

    /**
     * Test Case 7: By company size list under Solutions Dropdown
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Aetna homepage
     * 3: Click on Explore Aetna Sites to reveal dropdown menu
     * 4: Click on For Employers link
     * 5: Get List of link text under By company size
     * 6: Validate the text by comparing to what is stored in excel
     * @return
     * @throws Exception
     */
    public boolean getByCompanySize() throws Exception{
        getEmployersPage();
        wait.until(ExpectedConditions.elementToBeClickable(solutionsButton));
        clickOnElement(solutionsButton);
        wait.until(ExpectedConditions.elementToBeClickable(byCompanySizeButton));
        clickOnElement(byCompanySizeButton);
        wait.until(ExpectedConditions.visibilityOf(byCompanySizeList));
        List<WebElement> textListArray = byCompanySizeList.findElements(By.xpath(webElementByCompanySizeList));
        String[] actualText = new String[textListArray.size()];
        int i = 0;
        for (WebElement a : textListArray) {
            actualText[i] = a.getText();
            i++;
        }
        return compareTextListToExpectedStringArray(actualText,path,"ByCompanySize");

    }
    /**
     * Test Case 7: By company size list Size under Solutions Dropdown
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Aetna homepage
     * 3: Click on Explore Aetna Sites to reveal dropdown menu
     * 4: Click on For Employers link
     * 5: Get List of link text under By company size list Size
     * 6: Validate the text by comparing to what is stored in excel
     * @return
     * @throws Exception
     */
    public boolean validateByCompanySizeNum() throws IOException{
        getEmployersPage();
        wait.until(ExpectedConditions.elementToBeClickable(solutionsButton));
        clickOnElement(solutionsButton);
        List<WebElement> textListArray = byCompanySizeList.findElements(By.xpath(webElementByCompanySizeList));
        String [] actualText = new String[textListArray.size()];
        int i = 0;
        for(WebElement a: textListArray)
        {
            actualText[i]=a.getText();
            i++;
        }
        String[] expectedByCompanySizeArray = dataReader.fileReaderStringXSSF(path, "ByCompanySize");
        boolean arrayMatches;
        if (actualText.length == expectedByCompanySizeArray.length) {
            arrayMatches = true;
            System.out.println("By Company Size List size matches expected. Size of By Company Size List: " + actualText.length);
        }
        else {
            arrayMatches = false;
            System.out.println("By Company Size List size does not match expected. Size of actual By Company Size List: "+ actualText.length);
            System.out.println("Expected size: " + expectedByCompanySizeArray.length);
        }
        return  arrayMatches;
    }

    /**
     * Test Case 8: By industry list under Solutions Dropdown
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Aetna homepage
     * 3: Click on Explore Aetna Sites to reveal dropdown menu
     * 4: Click on For Employers link
     * 5: Get List of link text under By industry
     * 6: Validate the text by comparing to what is stored in excel
     * @return
     * @throws Exception
     */
    public boolean getByIndustry() throws Exception{
        getEmployersPage();
        wait.until(ExpectedConditions.elementToBeClickable(solutionsButton));
        clickOnElement(solutionsButton);
        wait.until(ExpectedConditions.elementToBeClickable(byIndustryButton));
        clickOnElement(byIndustryButton);
        wait.until(ExpectedConditions.visibilityOf(byIndustryList));
        List<WebElement> textListArray = byIndustryList.findElements(By.xpath(webElementByIndustryList));
        String[] actualText = new String[textListArray.size()];
        int i = 0;
        for (WebElement a : textListArray) {
            actualText[i] = a.getText();
            i++;
        }
        return compareTextListToExpectedStringArray(actualText,path,"ByIndustry");
    }

    public boolean validateByIndustryNum() throws IOException{
        getEmployersPage();
        wait.until(ExpectedConditions.elementToBeClickable(solutionsButton));
        clickOnElement(solutionsButton);
        List<WebElement> textListArray = byIndustryList.findElements(By.xpath(webElementByIndustryList));
        String [] actualText = new String[textListArray.size()];
        int i = 0;
        for(WebElement a: textListArray)
        {
            actualText[i]=a.getText();
            i++;
        }
        String[] expectedByIndustryArray = dataReader.fileReaderStringXSSF(path, "ByIndustry");
        boolean arrayMatches;
        if (actualText.length == expectedByIndustryArray.length) {
            arrayMatches = true;
            System.out.println("By Industry List size matches expected. Size of By Industry List: " + actualText.length);
        }
        else {
            arrayMatches = false;
            System.out.println("By Industry List size does not match expected. Size of actual By Industry List: "+ actualText.length);
            System.out.println("Expected size: " + expectedByIndustryArray.length);
        }
        return  arrayMatches;
    }

    public boolean getResources() throws Exception{
        getEmployersPage();
        wait.until(ExpectedConditions.elementToBeClickable(resourcesButton));
        clickOnElement(resourcesButton);
        wait.until(ExpectedConditions.visibilityOf(resourcesMenu1));
        List<WebElement> textListArray = resourcesMenu1.findElements(By.xpath(webElementResourcesMenu1));
        String[] actualText = new String[textListArray.size()];
        int i = 0;
        for (WebElement a : textListArray) {
            actualText[i] = a.getText();
            i++;
        }
        wait.until(ExpectedConditions.visibilityOf(resourcesMenu2));
        List<WebElement> textListArray2 = resourcesMenu2.findElements(By.xpath(webElementResourcesMenu2));
        String[] actualText2 = new String[textListArray2.size()];
        int j = 0;
        for (WebElement a : textListArray2) {
            actualText2[j] = a.getText();
            j++;
        }
        boolean menuIsValid = false;
        if((compareTextListToExpectedStringArray(actualText,path,"Resources1") && compareTextListToExpectedStringArray(actualText2,path,"Resources2"))==true)
            menuIsValid = true;
        return menuIsValid;
    }

    public boolean getPayYourBill() throws Exception{
        getEmployersPage();
        wait.until(ExpectedConditions.elementToBeClickable(resourcesButton));
        clickOnElement(resourcesButton);
        wait.until(ExpectedConditions.elementToBeClickable(payYourBillButton));
        clickOnElement(payYourBillButton);
        wait.until(ExpectedConditions.visibilityOf(payYourBillList));
        List<WebElement> textListArray = payYourBillList.findElements(By.xpath(webElementPayYourBillList));
        String[] actualText = new String[textListArray.size()];
        int i = 0;
        for (WebElement a : textListArray) {
            actualText[i] = a.getText();
            i++;
        }
        return compareTextListToExpectedStringArray(actualText,path,"PayYourBill");
    }

    public boolean validatePayYourBillNum() throws IOException{
        getEmployersPage();
        wait.until(ExpectedConditions.elementToBeClickable(resourcesButton));
        clickOnElement(resourcesButton);
        wait.until(ExpectedConditions.elementToBeClickable(payYourBillButton));
        clickOnElement(payYourBillButton);
        wait.until(ExpectedConditions.visibilityOf(payYourBillList));
        List<WebElement> textListArray = payYourBillList.findElements(By.xpath(webElementPayYourBillList));
        String[] actualText = new String[textListArray.size()];
        int i = 0;
        for (WebElement a : textListArray) {
            actualText[i] = a.getText();
            i++;
        }
        String[] expectedByIndustryArray = dataReader.fileReaderStringXSSF(path, "PayYourBill");
        boolean arrayMatches;
        if (actualText.length == expectedByIndustryArray.length) {
            arrayMatches = true;
            System.out.println("Pay Your Bill List size matches expected. Size of Pay Your Bill List: " + actualText.length);
        }
        else {
            arrayMatches = false;
            System.out.println("Pay Your Bill List size does not match expected. Size of actual Pay Your Bill List: "+ actualText.length);
            System.out.println("Expected size: " + expectedByIndustryArray.length);
        }
        return  arrayMatches;
    }
    public boolean getToolsManualsForms() throws Exception{
        getEmployersPage();
        wait.until(ExpectedConditions.elementToBeClickable(resourcesButton));
        clickOnElement(resourcesButton);
        wait.until(ExpectedConditions.elementToBeClickable(toolsManualsFormsButton));
        clickOnElement(toolsManualsFormsButton);
        wait.until(ExpectedConditions.visibilityOf(toolsManualsFormsList));
        List<WebElement> textListArray = toolsManualsFormsList.findElements(By.xpath(webElementToolsManualsFormsList));
        String[] actualText = new String[textListArray.size()];
        int i = 0;
        for (WebElement a : textListArray) {
            actualText[i] = a.getText();
            i++;
        }
        return compareTextListToExpectedStringArray(actualText,path,"ToolsManualsForms");
    }

    public boolean validateToolsManualsFormsNum() throws IOException{
        getEmployersPage();
        wait.until(ExpectedConditions.elementToBeClickable(resourcesButton));
        clickOnElement(resourcesButton);
        wait.until(ExpectedConditions.elementToBeClickable(toolsManualsFormsButton));
        clickOnElement(toolsManualsFormsButton);
        wait.until(ExpectedConditions.visibilityOf(toolsManualsFormsList));
        List<WebElement> textListArray = toolsManualsFormsList.findElements(By.xpath(webElementToolsManualsFormsList));
        String[] actualText = new String[textListArray.size()];
        int i = 0;
        for (WebElement a : textListArray) {
            actualText[i] = a.getText();
            i++;
        }
        String[] expectedByIndustryArray = dataReader.fileReaderStringXSSF(path, "ToolsManualsForms");
        boolean arrayMatches;
        if (actualText.length == expectedByIndustryArray.length) {
            arrayMatches = true;
            System.out.println("Tools Manuals Forms List size matches expected. Size of Tools Manuals Forms List: " + actualText.length);
        }
        else {
            arrayMatches = false;
            System.out.println("Tools Manuals Forms List size does not match expected. Size of actual Tools Manuals Forms List: "+ actualText.length);
            System.out.println("Expected size: " + expectedByIndustryArray.length);
        }
        return  arrayMatches;
    }
    public boolean getTrendsAndInsightsDropDown() throws Exception{
        getEmployersPage();
        wait.until(ExpectedConditions.elementToBeClickable(trendsAndInsightsButton));
        clickOnElement(trendsAndInsightsButton);
        List<WebElement> textListArray = trendsAndInsightsList.findElements(By.xpath(webElementTrendsAndInsightsList));
        String [] actualText = new String[textListArray.size()];
        int i = 0;
        for(WebElement a: textListArray)
        {
            actualText[i]=a.getText();
            i++;
        }

        return compareTextListToExpectedStringArray(actualText,path,"TrendsAndInsights");

    }
    public boolean validateTrendsAndInsightsNum() throws IOException{
        getEmployersPage();
        wait.until(ExpectedConditions.elementToBeClickable(trendsAndInsightsButton));
        clickOnElement(trendsAndInsightsButton);
        List<WebElement> textListArray = trendsAndInsightsList.findElements(By.xpath(webElementTrendsAndInsightsList));
        String [] actualText = new String[textListArray.size()];
        int i = 0;
        for(WebElement a: textListArray)
        {
            actualText[i]=a.getText();
            i++;
        }
        String[] expectedByIndustryArray = dataReader.fileReaderStringXSSF(path, "TrendsAndInsights");
        boolean arrayMatches;
        if (actualText.length == expectedByIndustryArray.length) {
            arrayMatches = true;
            System.out.println("Trends And Insights Forms List size matches expected. Size of Trend sAnd Insights List: " + actualText.length);
        }
        else {
            arrayMatches = false;
            System.out.println("Trends And Insights List size does not match expected. Size of actual Trends And Insights List: "+ actualText.length);
            System.out.println("Expected size: " + expectedByIndustryArray.length);
        }
        return  arrayMatches;
    }




}
