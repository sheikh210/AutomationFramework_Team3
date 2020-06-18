package patientReferrals;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConnectToSqlDB;
import utilities.DataReader;

import java.io.IOException;

import static patientReferrals.StJudePatientReferralPageWebElements.*;

public class StJudePatientReferralsPage extends WebAPI {
    String path =System.getProperty("user.dir") + "\\src\\main\\resources\\StJudePatientReferralsExpectedElements.xlsx";
    WebDriverWait wait = new WebDriverWait(driver, 10);
    DataReader dataReader = new DataReader();
    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    JavascriptExecutor js= (JavascriptExecutor) driver;
    /**
     * Header
     */
    @FindBy(css = WebElementPatientReferralsLink)
    public WebElement patientReferralsLink;
    @FindBy(xpath = WebElementButtonContactUs)
    public WebElement buttonContactUs;
    @FindBy (xpath = WebElementSpanishLanguage)
    public WebElement spanishLanguage;
    @FindBy(xpath = WebElementDonateNowLink)
    public WebElement donateNowLink;
    @FindBy(xpath = WebElementAboutUsMenu)
    public WebElement aboutUsMenu;
    @FindBy(xpath = WebElementAboutUsLinks)
    public WebElement aboutUsLinks;
    @FindBy(xpath = WebElementButtonSearch)
    public WebElement buttonSearch;
    @FindBy(xpath = WebElementSearchBox)
    public WebElement searchBox;


    public void navigateToPatientReferralsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(patientReferralsLink));
        clickOnElement(patientReferralsLink);
        waitUntilVisible(By.xpath("//body/main/div/section/div/section/div[1]"));
        System.out.println("Navigated to Patient Referrals Page Successfully \n");
    }

    /**
     *  Test case 1:
     *  1)Navigate to "https://www.stjude.org/"
     *  2)Click on "Patient Referrals"
     *  3)Get page title
     * @return
     */

    public String validatePatientReferralTitle(){
        navigateToPatientReferralsPage();
        waitUntilVisible(By.xpath("//body/main/div/section/div/section/div[1]"));
        String title= getCurrentPageTitle();
        return title;

    }
    /**
     *
     Test Case 2: "Validate Contact us button"
     1)Navigate to "https://www.stjude.org/"
     2)Click on "Patient Referrals"
     3)Click on Contact us
     4)Get the page title
     5)close browser
     */
    public boolean validateContactUsLink() throws IOException {
        navigateToPatientReferralsPage();
        buttonContactUs.click();
        String title=getCurrentPageTitle();
        boolean flag= compareTextToExpectedString(title,path,"contactUsTitle");

        return flag;
    }

    /**
     *
     * @return
     * @throws IOException
     */
    public boolean validateSpanishLanguage() throws IOException {
        navigateToPatientReferralsPage();
        spanishLanguage.click();
        String title=getCurrentPageTitle();
        boolean flag= compareTextToExpectedString(title,path,"changeLanguageTitle");

        return flag;
    }

    /**
     *
     * @return
     * @throws IOException
     */
    public boolean validateDonateNowLink() throws IOException {
        navigateToPatientReferralsPage();
        donateNowLink.click();
        waitUntilVisible(By.xpath("//label[contains(text(),'Monthly')]"));
        String title=getCurrentPageTitle();
        boolean flag= compareTextToExpectedString(title,path,"donateNowTitle");

        return flag;
    }
    /**
     *
     */

    public boolean countAboutUsLinks() throws IOException {
        navigateToPatientReferralsPage();
        aboutUsMenu.click();
        boolean flag=compareListSizeToExpectedCount(By.xpath(WebElementAboutUsLinks),path,"aboutUsLinks");
        return flag;
    }

    /**
     *
     *
     * @return
     * @throws IOException
     */
    public boolean searchHematology() throws IOException {
        navigateToPatientReferralsPage();
        buttonSearch.click();
        typeOnElementNEnter(WebElementSearchBox,"Hematology");
        waitUntilVisible(By.xpath("//*[@id=\"site-content\"]/section/div/section[2]/div[1]/div[1]/a/strong"));
        String title=getCurrentPageTitle();
        boolean flag=compareTextToExpectedString(title,path,"searchResultsTitle");
        return flag;
    }






}
