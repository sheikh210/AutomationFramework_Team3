package providersPage;

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

import static providersPage.AetnaProvidersElements.*;

public class AetnaProvidersPage extends WebAPI {
    String path = System.getProperty("user.dir") +"\\src\\main\\resources\\AetnaProvidersPage_ExpectedElements.xlsx" ;
    WebDriverWait wait = new WebDriverWait(driver, 10);
    DataReader dataReader = new DataReader();
    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @FindBy(xpath = WebElementProvidersLink)
    public WebElement providersLink;
    /**
     * Header
     */
    @FindBy(xpath = WebElementContactUsButton)
    public WebElement contactUsButton;
    @FindBy(xpath = WebElementSpanishLanguageButton)
    public WebElement spanishLanguageButton;
    @FindBy(xpath = WebElementSearchBox)
    public WebElement searchBox;
    @FindBy(xpath = WebElementHsaSearch)
    public WebElement hsaSearch;


    /**
     * Test case 1: "Validate providers page title"
     * 1)Navigate to "Navigate to http://aetna.com"
     * 2) Navigate to "https://www.aetna.com/health-care-professionals.html".
     * 3)Get title
     * 4)validate title
     * 5)Close browser
     */

    public boolean validateProvidersPageTitle() throws IOException {
        navigateToProvidersPage();
        boolean flag=compareTextToExpectedString(getCurrentPageTitle(),path,"providersPageTitle");
        return flag;
    }
    /**
     * Test Case 2 "Validate Contact us button"
     * 1) Navigate to "Navigate to http://aetna.com"
     * 2) Navigate to "https://www.aetna.com/health-care-professionals.html".
     * 3) Click on "Contact us"
     * 4) Get the page title
     * 5) Validate page title
     * 6) Close browser
     */
    public boolean validateContactUsButton() throws IOException {
        navigateToProvidersPage();
        clickOnElement(contactUsButton);
        String title="Contact Us - Health Care Providers | Aetna";
        wait.until(ExpectedConditions.titleIs(title));
        boolean flag=compareTextToExpectedString(title,path,"contactUsPageTitle");
        return flag;
    }

    /**
     * Test cases 3: "Change language to spanish"
     * 1) Navigate to "Navigate to http://aetna.com"
     * 2) Navigate to "https://www.aetna.com/health-care-professionals.html"
     * 3) Click on "Espagnol" button.
     * 4) Get page title
     * 5) close browser
     */
    public boolean changeLanguageToSpanish() throws IOException {
        navigateToProvidersPage();
        clickOnElement(spanishLanguageButton);
        String title= "Aetna para proveedores del cuidado de salud | Recursos y apoyo para profesionales de la salud";
        wait.until(ExpectedConditions.titleIs(title));
        boolean flag=compareTextToExpectedString(title,path,"spanishPageTitle");
        navigateBack();
        return flag;
    }
    public boolean searchHsa(){
        navigateToProvidersPage();
        typeOnElementNEnter(WebElementSearchBox,"HSA");
        wait.until(ExpectedConditions.visibilityOf(hsaSearch));
        boolean flag=hsaSearch.isDisplayed();
        return flag;
    }











    //Helper Method
    public void navigateToProvidersPage(){
        wait.until(ExpectedConditions.elementToBeClickable(providersLink));
        clickOnElement(providersLink);
        waitUntilVisible(By.xpath("//div[@class='hb_image']//img"));
        System.out.println("Navigated to Aetna Providers Page Successfully");
    }
}
