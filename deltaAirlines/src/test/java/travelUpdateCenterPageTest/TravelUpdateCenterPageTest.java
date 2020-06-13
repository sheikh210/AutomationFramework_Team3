package travelUpdateCenterPageTest;

import commonAPI.WebAPI;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import travelUpdateCenterPage.TravelUpdateCenterPage;
import utilities.DataReader;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TravelUpdateCenterPageTest extends WebAPI {

    static TravelUpdateCenterPage travelUpdateCenterPage;
    static DataReader dataReader = new DataReader();

    public static void getInItElement(){
        travelUpdateCenterPage = PageFactory.initElements(driver,TravelUpdateCenterPage.class);
    }

    @Test (priority = 0)
    public static void testNavigationToTravelUpdateCenterPage(){
        getInItElement();
        String actualURL = travelUpdateCenterPage.validateNavigationToTravelUpdateCenterPage();

        try {
            String[] expectedURLArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") + "\\src\\main" +
                    "\\resources\\DeltaTravelUpdateCenterPage_ExpectedElements.xlsx", "Page URL");
            String expectedURL = expectedURLArray[0];
            System.out.println("EXPECTED URL: "+expectedURL);

            Assert.assertEquals(actualURL, expectedURL, "PAGE URL (TRAVEL UPDATE CENTER) DOES NOT MATCH");
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("COULD NOT VALIDATE VIA EXCEL");
        }
    }

    @Test (priority = 1)
    public static void testTravelUpdateCenterDropdownFunctionAndListCount(){
        getInItElement();
        int actualListCount = travelUpdateCenterPage.validateTravelUpdateCenterDropdownListCount();

        try {
            int [] expectedListCountArray = dataReader.fileReaderIntegerXSSF(System.getProperty("user.dir") + "\\src" +
                    "\\main\\resources\\DeltaTravelUpdateCenterPage_ExpectedElements.xlsx", "TUC Dropdown List Count");
            int expectedListCount = expectedListCountArray[0];
            System.out.println("EXPECTED \"TRAVEL UPDATE CENTER\" DROPDOWN LIST COUNT: " + expectedListCount);
            Assert.assertEquals(actualListCount, expectedListCount, "\"TRAVEL UPDATE CENTER\" DROPDOWN LIST COUNT " +
                    "DOES NOT MATCH");
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("COULD NOT VALIDATE VIA EXCEL");
        }
    }

    // ASK ABOUT ’ CHARACTER
    @Test (priority = 2)
    public static void testTravelUpdateCenterDropdownListNames() throws IOException {
        getInItElement();
        String[] actualListNames = travelUpdateCenterPage.validateTravelUpdateCenterDropdownListNames();

        String[] expectedListNames = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") + "\\src" +
                "\\main\\resources\\DeltaTravelUpdateCenterPage_ExpectedElements.xlsx", "TUC Dropdown List Names");

        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i < actualListNames.length; i++) {
            softAssert.assertEquals(actualListNames[i].replace("’", "'"), expectedListNames[i], "\"TRAVEL UPDATE " +
                    "CENTER\" DROPDOWN LIST ITEM AT INDEX " + i + " DOES NOT MATCH");
        }
        softAssert.assertAll();
    }

    @Test (priority = 3)
    public static void testTUCDropdownWaysWereKeepingYouSafeSubmenuListNames() throws IOException {
        getInItElement();
        String[] actualListNames = travelUpdateCenterPage.validateTUCDropdownWaysWereKeepingYouSafeSubmenuListNames();

        String[] expectedListNames = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") + "\\src" +
                "\\main\\resources\\DeltaTravelUpdateCenterPage_ExpectedElements.xlsx", "TUC - WWKYS Submenu Names");

        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i < actualListNames.length; i++) {
            softAssert.assertEquals(actualListNames[i], expectedListNames[i], "\"WAYS WE'RE KEEPING YOU SAFE\" " +
                    "SUBMENU LIST ITEM AT INDEX " + i + " DOES NOT MATCH");
        }
        softAssert.assertAll();
    }


}
