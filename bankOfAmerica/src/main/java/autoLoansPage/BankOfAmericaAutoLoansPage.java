package autoLoansPage;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.ConnectToSqlDB;
import utilities.DataReader;

import javax.xml.xpath.XPath;
import java.io.IOException;
import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static autoLoansPage.BankOfAmericaAutoLoansPageWebElements.*;

public class BankOfAmericaAutoLoansPage extends WebAPI {
    String path = System.getProperty("user.dir") + "\\src\\main\\resources\\BankOfAmericaAutoLoansPageExpectedElements.xlsx";
    WebDriverWait wait = new WebDriverWait(driver, 10);
    DataReader dataReader = new DataReader();
    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    JavascriptExecutor js= (JavascriptExecutor) driver;

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
    @FindBy(xpath = WebElementHomePageLogo)
    public WebElement homePageLogo;
    @FindBy(css = WebElementHeaderSearchBox)
    public WebElement headerSearchBox;
    @FindBy(xpath = WebElementCarFinancingLink)
    public WebElement carFinancingLink;
    @FindBy(xpath = WebElementMenu)
    public WebElement menu;
    @FindBy(xpath = WebElementMenuItems)
    public WebElement menuItems;
    /**
     * Body
     */
    @FindBy(xpath = WebElementLoanAmountBox)
    public WebElement loanAmountBox;
    @FindBy(xpath = WebElementCalculateButton)
    public WebElement calculateButton;
    @FindBy(css = WebElementPaymentAmountBox)
    public WebElement paymentAmountBox;
    @FindBy(xpath = WebElementApplyNowButton)
    public WebElement applyNowButton;
    @FindBy(xpath = WebElementShopForYourCarButton)
    public WebElement shopForYourCarButton;
    @FindBy(xpath = WebElementLoanTypeDropMenu)
    public WebElement loanTypeDropMenu;
    @FindBy(xpath = WebElementLeaseBuyOutButton)
    public WebElement leaseBuyOutButton;
    @FindBy(xpath = WebElementZipCodeSearchBox)
    public WebElement zipCOdeSearchBox;
    @FindBy(css = WebElementButtonRefineYourSearch)
    public WebElement buttonRefineYourSearch;
    @FindBy(xpath = WebElementSpecializedVehicleLinks)
     public WebElement specializedVehicleLinks;
    @FindBy(xpath = WebElementSmallBusinessVehicle)
    public  WebElement smallBusinessVehicle;

    /**
     * Footer WebElement
     */
    @FindBy(xpath = WebElementAdvertisingPractices)
    public WebElement advertisingPractices;
    @FindBy(xpath = WebElementExit)
    public WebElement exit;


    public void navigateToAutoLoansPage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        clickOnElement(autoLoansTab);
        clickOnElement(learnMore);
        //Select dropDown=new Select(stateDropDown);
        selectOptionByVisibleText(stateDropDown, "New Jersey");
        clickOnElement(goButton);
    }

    /**
     * Test case 1: Verify Page Title
     * 1) Navigate to "www.bankofamerica.com".
     * 2)Navigate to "https://www.bankofamerica.com/auto-loans/".
     * 3) Get page title
     * 4)Close browser
     *
     * @return
     * @throws IOException
     */

    public String verifyAutoLoansPageTitle() throws IOException {
        navigateToAutoLoansPage();
        String actualTitle = getCurrentPageTitle();
        System.out.println("Actual Page Title is : " + actualTitle);
        String[] expectedTitleArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") + "\\src\\main\\resources\\BankOfAmericaAutoLoansPageExpectedElements.xlsx", "AutoLoansPageTitle");
        String expectedTitle = expectedTitleArray[0];
        System.out.println("Expected page title is : " + expectedTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
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
     *
     * @return
     */

    public boolean isHomePageLogoDisplayed() {
        navigateToAutoLoansPage();
        waitUntilVisible(By.xpath(WebElementHomePageLogo));
        boolean isElementDisplayed = homePageLogo.isDisplayed();
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
    public String searchFinancing() {
        navigateToAutoLoansPage();
        typeOnElementNEnter(WebElementHeaderSearchBox, "Auto Finance");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        mouseHover(carFinancingLink);
        clickOnElement(carFinancingLink);
        String actualTitle = getCurrentPageTitle();
        System.out.println("Actual title is : " + actualTitle);
        return actualTitle;
    }

    /**
     * Test case 4: Count menu visible links
     * 1) Navigate to "www.bankofamerica.com".
     * 2) Navigate to "https://www.bankofamerica.com/auto-loans/".
     * 3) Click on the menu
     * 4) Count all visible links
     * 5) Validate count
     * 6) Close Browser
     *
     * @return
     */
    public int countMenuLinks() {
        navigateToAutoLoansPage();
        clickOnElement(menu);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> links = menuItems.findElements(By.tagName("a"));
        List<WebElement> vlinks = links.stream().filter(WebElement::isDisplayed).collect(Collectors.toList());
        System.out.println("The total number of visible links on the page are :" + vlinks.size());
        return vlinks.size();
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

    public boolean calculateCarPayment() throws Exception {
        navigateToAutoLoansPage();
        List<String> loanAmounts = (connectToSqlDB.readDataBase("loans", "LoansAmount"));
        for (String s : loanAmounts) {
            System.out.println(s);
        }
        wait.until(ExpectedConditions.elementToBeClickable(loanAmountBox));
        wait.until(ExpectedConditions.elementToBeClickable(calculateButton));

        int size = loanAmounts.size();
        String[] paymentAmounts = new String[size];

        for (int i = 0; i < size; i++) {
            loanAmountBox.clear();
            loanAmountBox.sendKeys(loanAmounts.get(i));
            calculateButton.click();
            try {
                Thread.sleep(1000);
                paymentAmounts[i] = paymentAmountBox.getText();
            } catch (Exception e) {
                e.getMessage();
                e.printStackTrace();
            }
        }

        boolean flag = compareIntegerListToExpectedStringArray(paymentAmounts, path, "paymentAmount");

        // System.out.println(connectToSqlDB.readDataBase("loans","loanAmount"));
//        Connection con = DriverManager.getConnection("com.mysql.cj.jdbc.Driver", "root", "MySql2020");
//        System.out.println("Data base is connected");
        return flag;
    }

    /**
     * Test Case 7: "Validate Apply now button"
     * 1) Navigate to "www.bankofamerica.com".
     * 2) Navigate to "https://www.bankofamerica.com/auto-loans/".
     * 3) Click on "Apply now"
     * 4) Get the page Title
     * 5) Close Browser
     */
    public String clickApplyNowButton() {
        navigateToAutoLoansPage();
        clickOnElement(applyNowButton);
        String actualTitle = getCurrentPageTitle();
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
    public String clickShopForYourCarButton() {
        navigateToAutoLoansPage();
        clickOnElement(shopForYourCarButton);
        String actualTitle = getCurrentPageTitle();
        return actualTitle;
    }

    /**
     * 1) Navigate to "www.bankofamerica.com".
     * 2) Navigate to "https://www.bankofamerica.com/auto-loans/".
     * 3) Find out how many options present in LoanType drop menu
     * 4) Extract all the options and print them
     * 5) Select "Refinance" from the menu
     * 6) Close Browser
     */
    public void validateLoanTypeDropMenu() {
        navigateToAutoLoansPage();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Select dropdown = new Select(loanTypeDropMenu);
        System.out.println("Number of options present in the menu is : " + dropdown.getOptions().size());
        List<WebElement> options = dropdown.getOptions();
        for (WebElement e : options) {
            System.out.println(e.getText());
        }
        dropdown.selectByVisibleText("Refinance");

    }

    /**
     * Test Case 10
     * 1) Navigate to "www.bankofamerica.com".
     * 2) Navigate to "https://www.bankofamerica.com/auto-loans/".
     * 3) Find out how many options present in LoanType drop menu
     * 4) Extract all the options and print them
     * 5) Select "Buy out your lease" from the menu
     * 6) Close Browser
     */
    public void selectLoanTypeFromDropMenu() {
        navigateToAutoLoansPage();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Select dropdown = new Select(loanTypeDropMenu);
        System.out.println("Number of options present in the menu is : " + dropdown.getOptions().size());
        List<WebElement> options = dropdown.getOptions();
        for (WebElement e : options) {
            System.out.println(e.getText());
        }
        dropdown.selectByVisibleText("Buy out your lease");
    }

    /**
     * Test Case 11:  Select "Used cars "(dealers)" by index number
     * 1) Navigate to "www.bankofamerica.com".
     * 2) Navigate to "https://www.bankofamerica.com/auto-loans/".
     * 3) Find out how many options present in LoanType drop menu
     * 4) Extract all the options and print them
     * 5) Select "Used cars "(dealers)" from the menu
     * 6) Close Browser
     */
    public void selectByIndexFromDropMenu() {
        navigateToAutoLoansPage();
        Select dropdown = new Select(loanTypeDropMenu);
        System.out.println("Number of options present in the menu is : " + dropdown.getOptions().size());
        List<WebElement> options = dropdown.getOptions();
        for (WebElement e : options) {
            System.out.println(e.getText());
        }
        dropdown.selectByIndex(1);
    }

    /**
     * Test Case 12:  Select "Private party" by value
     * 1) Navigate to "www.bankofamerica.com".
     * 2) Navigate to "https://www.bankofamerica.com/auto-loans/".
     * 3) Find out how many options present in LoanType drop menu
     * 4) Extract all the options and print them
     * 5) Select "Used cars "Private party" from the menu
     * 6) Close Browser
     */

    public void selectByValueFromDropMenu() {
        navigateToAutoLoansPage();
        Select dropdown = new Select(loanTypeDropMenu);
        System.out.println("Number of options present in the menu is : " + dropdown.getOptions().size());
        List<WebElement> options = dropdown.getOptions();
        for (WebElement e : options) {
            System.out.println(e.getText());
        }
        dropdown.selectByValue("5.79");
    }

    /**
     * Test case 13
     * 1) Navigate to "www.bankofamerica.com".
     * 2) Navigate to "https://www.bankofamerica.com/auto-loans/".
     * 3) Scroll down to "Lease buyout & private seller loans"
     * 4) count all the visible links
     * 5) Close Browser
     */
    public boolean countFooterLinks() throws IOException {
        navigateToAutoLoansPage();
        waitUntilClickAble(By.xpath(WebElementLeaseBuyOutButton));
        clickOnElement(leaseBuyOutButton);
        boolean flag = compareListSizeToExpectedCount(By.cssSelector(WebElementLeaseBuyOutDropDownLinks), path, "LeaseBuyOutMenu");

//        List<WebElement> menu = leaseBuyOutDropDown.findElements(By.tagName("a"));
//        List<WebElement> vlinks = menu.stream().filter(WebElement::isDisplayed).collect(Collectors.toList());
//        System.out.println("The total number of visible links on the page is :" + vlinks.size());
        return flag;
    }

    /**
     * Test case 14: "Validate near by dealers search".
     * 1) Navigate to "www.bankofamerica.com".
     * 2) Navigate to "https://www.bankofamerica.com/auto-loans/".
     * 3) Scroll down to dealers search box.
     * 4) Type zip code "07306" .
     * 5) Get the page title
     * 6) Close Browser.
     */
    public boolean validateNearByDealersSearch() throws IOException {
        navigateToAutoLoansPage();
        waitUntilVisible(By.xpath(WebElementZipCodeSearchBox));
        typeOnElementNEnter(WebElementZipCodeSearchBox, "07306");

        boolean flag = switchToTabAndCompareURL(path, "zipCodeSearch");

        return flag;
    }
    /**
     * Test Case 15: Validate"Specialized vehicle financing options" links
     * 1) Navigate to "www.bankofamerica.com".
     * 2) Navigate to "https://www.bankofamerica.com/auto-loans/".
     * 3) Scroll down the page until element is found
     * 4) Click on "Loans for customers needing accessible vehicles" link
     * 5) Get the page title
     * 6) Close Browser
     */
    public boolean getTitleSpecializedVehicle() throws IOException {
        navigateToAutoLoansPage();
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",specializedVehicleLinks);
        waitUntilClickAble(By.xpath(WebElementSpecializedVehicleLinks));
        specializedVehicleLinks.click();
        String actualTitle=getCurrentPageTitle();
        boolean flag= compareTextToExpectedString(actualTitle,path,"SpecialVehicle");

        return flag;
    }


    /**
     * * Test Case 16 : "Estimate care monthly payment"
     * * 1) Navigate to "www.bankofamerica.com".
     * * 2) Navigate to "https://www.bankofamerica.com/auto-loans/".
     * * 3) Connect to My sql data base
     * * 4) Get loan amount and pass it.
     * * 6) Close Browser
     */


    public boolean calculateCarPaymentUsedCar() throws Exception {
        navigateToAutoLoansPage();
        Select dropdown = new Select(loanTypeDropMenu);
        dropdown.selectByVisibleText("Used car (dealer)");
        List<String> loanAmounts = (connectToSqlDB.readDataBase("loans", "LoansAmount"));
        for (String s : loanAmounts) {
            System.out.println(s);
        }
        wait.until(ExpectedConditions.elementToBeClickable(loanAmountBox));
        wait.until(ExpectedConditions.elementToBeClickable(calculateButton));

        int size = loanAmounts.size();
        String[] paymentAmounts = new String[size];

        for (int i = 0; i < size; i++) {
            loanAmountBox.clear();
            loanAmountBox.sendKeys(loanAmounts.get(i));
            calculateButton.click();
            try {
                Thread.sleep(1000);
                paymentAmounts[i] = paymentAmountBox.getText();
            } catch (Exception e) {
                e.getMessage();
                e.printStackTrace();
            }
        }
        boolean flag = compareIntegerListToExpectedStringArray(paymentAmounts, path, "paymentAmountUsedCars");
        return flag;
    }

    /**
     * * Test Case 17 : "Estimate care monthly payment  with Refinance"
     * * 1) Navigate to "www.bankofamerica.com".
     * * 2) Navigate to "https://www.bankofamerica.com/auto-loans/".
     * * 3) Connect to My sql data base
     * * 4) Get loan amount and pass it.
     * * 6) Close Browser
     */
    public boolean calculateCarPaymentRefinance() throws Exception {
        navigateToAutoLoansPage();
        Select dropdown = new Select(loanTypeDropMenu);
        dropdown.selectByVisibleText("Refinance");
        List<String> loanAmounts = (connectToSqlDB.readDataBase("loans", "LoansAmount"));
        for (String s : loanAmounts) {
            System.out.println(s);
        }
        wait.until(ExpectedConditions.elementToBeClickable(loanAmountBox));
        wait.until(ExpectedConditions.elementToBeClickable(calculateButton));

        int size = loanAmounts.size();
        String[] paymentAmounts = new String[size];

        for (int i = 0; i < size; i++) {
            loanAmountBox.clear();
            loanAmountBox.sendKeys(loanAmounts.get(i));
            calculateButton.click();
            try {
                Thread.sleep(1000);
                paymentAmounts[i] = paymentAmountBox.getText();
            } catch (Exception e) {
                e.getMessage();
                e.printStackTrace();
            }
        }
        boolean flag = compareIntegerListToExpectedStringArray(paymentAmounts, path, "paymentAmountRefinance");
        return flag;
    }

    /**
     * * Test Case 16 : "Estimate care monthly payment with buy out lease"
     * * 1) Navigate to "www.bankofamerica.com".
     * * 2) Navigate to "https://www.bankofamerica.com/auto-loans/".
     * * 3) Connect to My sql data base
     * * 4) Get loan amount and pass it.
     * * 6) Close Browser
     */
    public boolean calculateCarPaymentBuyOutLease() throws Exception {
        navigateToAutoLoansPage();
        Select dropdown = new Select(loanTypeDropMenu);
        dropdown.selectByIndex(3);
        List<String> loanAmounts = (connectToSqlDB.readDataBase("loans", "LoansAmount"));
        for (String s : loanAmounts) {
            System.out.println(s);
        }
        wait.until(ExpectedConditions.elementToBeClickable(loanAmountBox));
        wait.until(ExpectedConditions.elementToBeClickable(calculateButton));

        int size = loanAmounts.size();
        String[] paymentAmounts = new String[size];

        for (int i = 0; i < size; i++) {
            loanAmountBox.clear();
            loanAmountBox.sendKeys(loanAmounts.get(i));
            calculateButton.click();
            try {
                Thread.sleep(1000);
                paymentAmounts[i] = paymentAmountBox.getText();
            } catch (Exception e) {
                e.getMessage();
                e.printStackTrace();
            }
        }
        boolean flag = compareIntegerListToExpectedStringArray(paymentAmounts, path, "PaymenetAmountLease");
        return flag;
    }
    /**
     * Test Case 19: Validate"Specialized vehicle financing options" links
     * 1) Navigate to "www.bankofamerica.com".
     * 2) Navigate to "https://www.bankofamerica.com/auto-loans/".
     * 3) Scroll down the page until element is found
     * 4) Click on "Loans for customers needing accessible vehicles" link
     * 5) Get the page title
     * 6) Close Browser
     */
    public boolean getTitleSmallBusinessVehicle() throws IOException {
        navigateToAutoLoansPage();
        js.executeScript("arguments[0].scrollIntoView();",smallBusinessVehicle);
        waitUntilClickAble(By.xpath(WebElementSmallBusinessVehicle));
        smallBusinessVehicle.click();
        String actualTitle=getCurrentPageTitle();
        boolean flag= compareTextToExpectedString(actualTitle,path,"smallBusiness");

        return flag;
    }
    /**
     * Test Case 20: Handle popOut window when you click "Advertising Practices"
     * 1) Navigate to "www.bankofamerica.com".
     * 2) Navigate to "https://www.bankofamerica.com/auto-loans/".
     * 3) Scroll down the page.
     * 4) Click on "Advertising Practices".
     * 5) Extract text from the popOut window.
     * 6) Validate text
     * 6) Close popOut window.
     * 7) Close Browser.
     */
    public boolean extractPopOutAdvertisingPracticesText() throws IOException {
        navigateToAutoLoansPage();
        js.executeScript("arguments[0].scrollIntoView();",advertisingPractices);
        waitUntilClickAble(By.xpath(WebElementAdvertisingPractices));
        advertisingPractices.click();
       String text= driver.findElement(By.xpath("//body/div/div/div/div/div/div/div[1]")).getText();
         boolean flag=compareTextToExpectedString(text,path,"PopOutText");
        mouseHover(exit);
        exit.click();
        return flag;
    }
}