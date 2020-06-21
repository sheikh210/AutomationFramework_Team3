package planspage;
import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import utilities.DataReader;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
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



}
