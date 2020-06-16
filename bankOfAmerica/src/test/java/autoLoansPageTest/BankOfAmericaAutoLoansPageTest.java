package autoLoansPageTest;

import autoLoansPage.BankOfAmericaAutoLoansPage;
import commonAPI.WebAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
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
    @Test(priority = 4)
    public void testCountMenuLinks() throws IOException {
        getInItElement();
        int actualLinksNumber=bankOfAmericaAutoLoansPage.countMenuLinks();
        int []expectedLinksCountArray=dataReader.fileReaderIntegerXSSF(path,"MenuLinksCount");
        int expectedLinksCount=expectedLinksCountArray[0];
        System.out.println("Expected Links Count is : "+expectedLinksCount);
        Assert.assertEquals(actualLinksNumber,expectedLinksCount,"Count does not match");


    }
}
