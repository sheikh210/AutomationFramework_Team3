package autoLoansPage;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.ConnectToSqlDB;
import utilities.DataReader;

import javax.xml.xpath.XPath;
import java.io.IOException;
import java.sql.*;
import java.sql.DriverManager;
import java.util.List;
import java.util.stream.Collectors;

import static autoLoansPage.BankOfAmericaAutoLoansPageWebElements.*;

public class BankOfAmericaAutoLoansPage extends WebAPI {
    @FindBy(xpath = WebElementAutoLoansTab)
    public WebElement autoLoansTab;
    @FindBy(id = WebElementLearnMore)
    public WebElement learnMore;
    @FindBy(css = WebElementStateDropDown)
    public WebElement stateDropDown;
    @FindBy(id = WebElementGoButton)
    public WebElement goButton;

    /**
     * Header
     */
    @FindBy(xpath =WebElementHomePageLogo )
    public WebElement homePageLogo;
    @FindBy(css = WebElementHeaderSearchBox)
    public WebElement headerSearchBox;
    @FindBy(xpath=WebElementCarFinancingLink)
    public WebElement carFinancingLink;
    @FindBy(xpath = WebElementMenu)
     public WebElement menu;
    @FindBy (xpath = WebElementMenuItems)
    public WebElement menuItems;
    /**
     * Body
     */
    @FindBy(xpath = WebElementLoanAmountBox)
    public WebElement loanAmountBox;
    @FindBy(xpath= WebElementCalculateButton)
    public WebElement calculateButton;
    @FindBy(xpath = WebElementApplyNowButton)
    public WebElement applyNowButton;
    @FindBy(xpath = WebElementShopForYourCarButton)
    public WebElement shopForYourCarButton;




    DataReader dataReader= new DataReader();
    ConnectToSqlDB connectToSqlDB= new ConnectToSqlDB();

    public void navigateToAutoLoansPage(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        clickOnElement(autoLoansTab);
        clickOnElement(learnMore);
        //Select dropDown=new Select(stateDropDown);
        selectOptionByVisibleText(stateDropDown,"New Jersey");
        clickOnElement(goButton);
    }

    /**
     * Test case 1: Verify Page Title
     * 1) Navigate to "www.bankofamerica.com".
     * 2)Navigate to "https://www.bankofamerica.com/auto-loans/".
     * 3) Get page title
     * 4)Close browser
     * @return
     * @throws IOException
     */

    public String verifyAutoLoansPageTitle() throws IOException {
        navigateToAutoLoansPage();
        String actualTitle=getCurrentPageTitle();
        System.out.println("Actual Page Title is : "+ actualTitle);
        String[] expectedTitleArray=dataReader.fileReaderStringXSSF(System.getProperty("user.dir")+"\\src\\main\\resources\\BankOfAmericaAutoLoansPageExpectedElements.xlsx","AutoLoansPageTitle");
        String expectedTitle=expectedTitleArray[0];
        System.out.println("Expected page title is : "+expectedTitle);
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
        return actualTitle;
    }

    /**
     * Test case 2: Verify home page logo is displayed
     * 1) Navigate to "www.bankofamerica.com".
     * 2) Navigate to "https://www.bankofamerica.com/auto-loans/".
     * 3) Ensure that home page logo is displayed.
     * 4) Click on Home page logo
     * 5) Get the page title
     * 6)Close browse
     * @return
     */

    public boolean isHomePageLogoDisplayed(){
        navigateToAutoLoansPage();
        waitUntilVisible(By.xpath(WebElementHomePageLogo));
        boolean isElementDisplayed=homePageLogo.isDisplayed();
        return isElementDisplayed;
    }

    /**
     * Test Case 3: Search "Auto Loans & Car Financing from Bank of America"
     * 1) Navigate to "www.bankofamerica.com".
     * 2) Navigate to "https://www.bankofamerica.com/auto-loans/".
     * 3) Type "Auto Loans & Car Financing from Bank of America"
     * 4) Select the option from the suggested options
     * 5) Click on the option
     * 6) Get the page title
     * 7) Close browser
     */
    public String searchFinancing(){
        navigateToAutoLoansPage();
        typeOnElementNEnter(WebElementHeaderSearchBox,"Auto Finance");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        mouseHover(carFinancingLink);
        clickOnElement(carFinancingLink);
        String actualTitle=getCurrentPageTitle();
        System.out.println("Actual title is : "+actualTitle);
       return actualTitle;
    }

    /**
     *Test case 4: Count menu visible links
     * 1) Navigate to "www.bankofamerica.com".
     * 2) Navigate to "https://www.bankofamerica.com/auto-loans/".
     * 3) Click on the menu
     * 4) Count all visible links
     * 5) Validate count
     * 6) Close Browser
     * @return
     */
    public int countMenuLinks(){
        navigateToAutoLoansPage();
        clickOnElement(menu);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> links= menuItems.findElements(By.tagName("a"));
        List<WebElement> vlinks = links.stream().filter(WebElement::isDisplayed).collect(Collectors.toList());
        System.out.println("The total number of visible links on the page are :" + vlinks.size());
        return  vlinks.size();
    }
    /**
     * Test 5: Print Menu visible links
     * 1) Navigate to "www.bankofamerica.com".
     * 2) Navigate to "https://www.bankofamerica.com/auto-loans/".
     * 3) Click on Menu
     * 4) Print all visible links
     * 5) Validate results
     * 6) Close Browser
     */

    public String[] printMenuLinks() {
        navigateToAutoLoansPage();
        clickOnElement(menu);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> links = menuItems.findElements(By.tagName("a"));
        List<WebElement> vlinks = links.stream().filter(WebElement::isDisplayed).collect(Collectors.toList());
        String[] actualLinks = new String[vlinks.size()];

            for (int i = 0; i < vlinks.size(); i++) {
                actualLinks[i] = vlinks.get(i).getAttribute("href");

        }
        return actualLinks;
    }
    /**
     * Test Case 6 : "Estimate care monthly payment"
     * 1) Navigate to "www.bankofamerica.com".
     * 2) Navigate to "https://www.bankofamerica.com/auto-loans/".
     * 3) Connect to My sql data base
     * 4) Get loan amount and pass it.
     * 6) Close Browser
     */

//    public void calculateCarPayment() throws Exception {
//        navigateToAutoLoansPage();
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        //connectToSqlDB.readDataBase("loans","loanAmount");
//       // System.out.println(connectToSqlDB.readDataBase("loans","loanAmount"));
//        Connection con = DriverManager.getConnection("com.mysql.cj.jdbc.Driver","root","MySql2020");
//        System.out.println("Data base is connected");
//
//    }
    /**
     * Test Case 7: "Validate Apply now button"
     * 1) Navigate to "www.bankofamerica.com".
     * 2) Navigate to "https://www.bankofamerica.com/auto-loans/".
     * 3) Click on "Apply now"
     * 4) Get the page Title
     * 5) Close Browser
     */
    public String clickApplyNowButton(){
        navigateToAutoLoansPage();
        clickOnElement(applyNowButton);
        String actualTitle=getCurrentPageTitle();
        return actualTitle;
    }
    /**
     * Test Case 8: "Validate Shop for your car button"
     * 1) Navigate to "www.bankofamerica.com".
     * 2) Navigate to "https://www.bankofamerica.com/auto-loans/".
     * 3) Click on "Shop for your car now"
     * 4) Get page title
     * 6) Close Browser
     */
    public String clickShopForYourCarButton(){
        navigateToAutoLoansPage();
        clickOnElement(shopForYourCarButton);
        String actualTitle=getCurrentPageTitle();
        return actualTitle;
    }
}
