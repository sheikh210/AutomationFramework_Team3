package autoLoansPageTest;

import autoLoansPage.BankOfAmericaAutoLoansPage;
import commonAPI.WebAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.DataReader;

import java.io.IOException;

public class BankOfAmericaAutoLoansPageTest extends WebAPI {
    static BankOfAmericaAutoLoansPage bankOfAmericaAutoLoansPage;
    static DataReader dataReader = new DataReader();
    static String path=System.getProperty("user.dir")+"\\src\\main\\resources\\BankOfAmericaAutoLoansPageExpectedElements.xlsx";

    public static void getInItElement() {
        bankOfAmericaAutoLoansPage = PageFactory.initElements(driver,BankOfAmericaAutoLoansPage.class);
    }

    /**
     * Test case 1
     * @throws IOException
     */
//    @Test (priority = 0)
//    public void testVerifyAutoLoansPageTitle() throws IOException {
//        getInItElement();
//        bankOfAmericaAutoLoansPage.verifyAutoLoansPageTitle();
//
//    }
//
//    /**
//     * Test Case 2
//     */
//    @Test(priority=1)
//    public void testIsHomePageLogoDisplayed(){
//        getInItElement();
//        bankOfAmericaAutoLoansPage.isHomePageLogoDisplayed();
//        Assert.assertEquals(bankOfAmericaAutoLoansPage.isHomePageLogoDisplayed(),true,"Home Page Logo is not displayed");
//    }
//
//    /**
//     * Test Case 3
//     */
//    @Test(priority = 3)
//    public void testSearchFinancing() throws IOException {
//        getInItElement();
//        String actualTitle=bankOfAmericaAutoLoansPage.searchFinancing();
//        String[] expectedTitleArray=dataReader.fileReaderStringXSSF(path,"CarFinancePageTitle");
//        String expectedTitle=expectedTitleArray[0];
//        System.out.println("Expected page title is : "+expectedTitle);
//        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
//    }
    /**
     * Test Case 4
     *
     */
//    @Test(priority = 4)
//    public void testCountMenuLinks() throws IOException {
//        getInItElement();
//        int actualLinksNumber=bankOfAmericaAutoLoansPage.countMenuLinks();
//        int []expectedLinksCountArray=dataReader.fileReaderIntegerXSSF(path,"MenuLinksCount");
//        int expectedLinksCount=expectedLinksCountArray[0];
//        System.out.println("Expected Links Count is : "+expectedLinksCount);
//        Assert.assertEquals(actualLinksNumber,expectedLinksCount,"Count does not match");
//
//    }

    /**
     * Test case 5
     */
//    @Test(priority = 5)
//    public void testPrintMenuLinks() throws IOException {
//        getInItElement();
//        String[] actualLinks=bankOfAmericaAutoLoansPage.printMenuLinks();
//        String[] expectedLinks=dataReader.fileReaderStringXSSF(path,"MenuLinks");
//        SoftAssert softAssert = new SoftAssert();
//
//        System.out.println("Total Number of Links : " + actualLinks.length);
//        for (int i = 0; i < 16; i++) {
//            System.out.println(actualLinks[i]);
//            System.out.println(expectedLinks[i]);
//            softAssert.assertEquals(actualLinks[i],expectedLinks [i], "LINK AT POSITION " + i + " (Menu) DOES NOT MATCH");
//        }
//        softAssert.assertAll();
//    }

//    @Test(priority = 6)
//    public void testCalculateCarPayment() throws Exception {
//        getInItElement();
//        bankOfAmericaAutoLoansPage.calculateCarPayment();
//    }
    @Test(priority = 7)
    public void testClickApplyNowButton() throws IOException {
        getInItElement();
        String actualTitle=bankOfAmericaAutoLoansPage.clickApplyNowButton();
        String[] expectedTitleArray=dataReader.fileReaderStringXSSF(path,"ApplyNow");
        String expectedTitle=expectedTitleArray[0];
        System.out.println("Expected Title is : "+expectedTitleArray[0]);
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");

    }
    @Test(priority = 8)
    public void testClickShopForYourCarButton() throws IOException {
        getInItElement();
        String actualTitle=bankOfAmericaAutoLoansPage.clickShopForYourCarButton();
        String[] expectedTitleArray=dataReader.fileReaderStringXSSF(path,"ShopForYourCarNow");
        String expectedTitle=expectedTitleArray[0];
        System.out.println("Expected Title is : "+expectedTitleArray[0]);
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");

    }

}
