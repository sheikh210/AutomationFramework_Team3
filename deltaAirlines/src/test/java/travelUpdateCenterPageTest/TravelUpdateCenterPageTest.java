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

    @Test (priority = 4)
    public static void testTUCDropdownFromDeltaToOurCustomersSubmenuListNames() throws IOException {
        getInItElement();
        String[] actualListNames = travelUpdateCenterPage.validateTUCDropdownFromDeltaToOurCustomersSubmenuListNames();

        String[] expectedListNames = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") + "\\src" +
                "\\main\\resources\\DeltaTravelUpdateCenterPage_ExpectedElements.xlsx", "TUC - FDTOC Submenu Names");

        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i < actualListNames.length; i++) {
            softAssert.assertEquals(actualListNames[i], expectedListNames[i], "\"FROM DELTA TO OUR CUSTOMERS\" " +
                    "SUBMENU LIST ITEM AT INDEX " + i + " DOES NOT MATCH");
        }
        softAssert.assertAll();
    }

    @Test (priority = 5)
    public static void testTUCDropdownFlyingWhatYouNeedToKnowSubmenuListNames() throws IOException {
        getInItElement();
        String[] actualListNames = travelUpdateCenterPage.validateTUCDropdownFlyingWhatYouNeedToKnowSubmenuListNames();

        String[] expectedListNames = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") + "\\src" +
                "\\main\\resources\\DeltaTravelUpdateCenterPage_ExpectedElements.xlsx", "TUC - FWYNTK Submenu Names");

        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i < actualListNames.length; i++) {
            softAssert.assertEquals(actualListNames[i], expectedListNames[i], "\"FLYING? WHAT YOU NEED TO KNOW\" " +
                    "SUBMENU LIST ITEM AT INDEX " + i + " DOES NOT MATCH");
        }
        softAssert.assertAll();
    }

    @Test (priority = 6)
    public static void testCoronavirusUpdateCenterGridHeaderNames() throws IOException {
        getInItElement();
        String[] actualGridNames = travelUpdateCenterPage.validateCoronavirusUpdateCenterGridHeaderNames();

        String[] expectedGridNames = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") + "\\src" +
                "\\main\\resources\\DeltaTravelUpdateCenterPage_ExpectedElements.xlsx", "CUC - Grid Header Names");

        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i < actualGridNames.length; i++) {
            softAssert.assertEquals(actualGridNames[i], expectedGridNames[i], "\""+expectedGridNames[i]+"\" HEADER " +
                    "TITLE DOES NOT MATCH");
        }
        softAssert.assertAll();
    }

    @Test (priority = 7)
    public static void testTravelFlexibilityGridNames() throws IOException{
        getInItElement();
        String[] actualNames = travelUpdateCenterPage.validateTravelFlexibilityGridNames();

        String[] expectedNames = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") + "\\src" +
                "\\main\\resources\\DeltaTravelUpdateCenterPage_ExpectedElements.xlsx", "CUC - TravelFlexibility Names");

        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i<actualNames.length; i++) {
            softAssert.assertEquals(actualNames[i], expectedNames[i], "LIST ITEM NAME UNDER \"TRAVEL FLEXIBILITY\" " +
                    "GRID AT INDEX " + i + " DOES NOT MATCH");
        }
        softAssert.assertAll();
    }

    @Test (priority = 8)
    public static void testTravelFlexibilityGridURLs() throws IOException{
        getInItElement();
        String[] actualNames = travelUpdateCenterPage.validateTravelFlexibilityGridURLs();

        String[] expectedNames = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") + "\\src" +
                "\\main\\resources\\DeltaTravelUpdateCenterPage_ExpectedElements.xlsx", "CUC - TravelFlexibility URLs");

        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i<actualNames.length; i++) {
            softAssert.assertEquals(actualNames[i], expectedNames[i], "LIST ITEM URL UNDER \"TRAVEL FLEXIBILITY\" " +
                    "GRID AT INDEX " + i + " DOES NOT MATCH");
        }
        softAssert.assertAll();
    }

    //********* &nbsp; - HTML whitespace character not able to be handled in this test case *********
    @Test (priority = 9)
    public static void testTravelingWithUsGridNames() throws IOException{
        getInItElement();
        String[] actualNames = travelUpdateCenterPage.validateTravelingWithUsGridNames();

        String[] expectedNames = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") + "\\src" +
                "\\main\\resources\\DeltaTravelUpdateCenterPage_ExpectedElements.xlsx", "CUC - TravelingWithUs Names");

        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i<actualNames.length; i++) {
            softAssert.assertEquals(actualNames[i].replaceAll("&nbsp;", " "), expectedNames[i], "LIST ITEM NAME UNDER" +
                    " \"TRAVELING WITH " +
                    "US\"" +
                    " " +
                    "GRID AT INDEX " + i + " DOES NOT MATCH");
        }
        softAssert.assertAll();
    }

    @Test (priority = 10)
    public static void testTravelingWithUsGridURLs() throws IOException{
        getInItElement();
        String[] actualNames = travelUpdateCenterPage.validateTravelingWithUsGridURLs();

        String[] expectedNames = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") + "\\src" +
                "\\main\\resources\\DeltaTravelUpdateCenterPage_ExpectedElements.xlsx", "CUC - TravelingWithUs URLs");

        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i<actualNames.length; i++) {
            softAssert.assertEquals(actualNames[i], expectedNames[i], "LIST ITEM URL UNDER \"TRAVELING WITH US\" GRID" +
                    " AT INDEX " + i + " DOES NOT MATCH");
        }
        softAssert.assertAll();
    }

    @Test (priority = 11)
    public static void testCaringForYouGridNames() throws IOException{
        getInItElement();
        String[] actualNames = travelUpdateCenterPage.validateCaringForYouGridNames();

        String[] expectedNames = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") + "\\src" +
                "\\main\\resources\\DeltaTravelUpdateCenterPage_ExpectedElements.xlsx", "CUC - CaringForYou Names");

        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i<actualNames.length; i++) {
            softAssert.assertEquals(actualNames[i], expectedNames[i], "LIST ITEM NAME UNDER \"CARING FOR YOU\" GRID " +
                    "AT INDEX " + i + " DOES NOT MATCH");
        }
        softAssert.assertAll();
    }

    @Test (priority = 11)
    public static void testCaringForYouGridURLs() throws IOException{
        getInItElement();
        String[] actualNames = travelUpdateCenterPage.validateCaringForYouGridURLs();

        String[] expectedNames = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") + "\\src" +
                "\\main\\resources\\DeltaTravelUpdateCenterPage_ExpectedElements.xlsx", "CUC - CaringForYou URLs");

        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i<actualNames.length; i++) {
            softAssert.assertEquals(actualNames[i], expectedNames[i], "LIST ITEM URL UNDER \"CARING FOR YOU\" GRID AT" +
                    " INDEX " + i + " DOES NOT MATCH");
        }
        softAssert.assertAll();
    }
}
