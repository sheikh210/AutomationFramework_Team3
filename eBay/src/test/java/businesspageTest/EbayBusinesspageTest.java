package businesspageTest;

import commonAPI.WebAPI;
import businesspage.EbayBusinesspage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DataReader;

import java.io.IOException;


public class EbayBusinesspageTest extends WebAPI {
    static DataReader dataReader = new DataReader();

    static EbayBusinesspage testBusinessPage;

    public static void getInitElements() {
        testBusinessPage = PageFactory.initElements(driver, EbayBusinesspage.class);
    }

    @Test (priority = 0)
    public static void testHomePage() throws IOException, InterruptedException {
        getInitElements();
        testBusinessPage.goHomePage();
    }

    @Test (priority = 1)
    public static void testBusinessPageTitle() throws IOException, InterruptedException {
        getInitElements();
        testBusinessPage.goToBusinessPage();

        String[] expectedBusniessPageTitleArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") +
                "//src/main/resources/Ebay_BusinessPage_ExpectedElements.xlsx", "Business Page Title");
        String expectedBusinessPageTitle = expectedBusniessPageTitleArray[0];
        System.out.println("Expected Page Title: " + expectedBusinessPageTitle);

        Assert.assertEquals(testBusinessPage.goToBusinessPage(),expectedBusinessPageTitle,"Page Title Does not match");

    }

    @Test (priority = 2)
    public static void testMyEbay() throws IOException, InterruptedException {
        getInitElements();
        testBusinessPage.myEbayDropDownMenu();

        String[] expectedDropDownArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") +
                "//src/main/resources/Ebay_BusinessPage_ExpectedElements.xlsx", "Ebay Drop Down Size");
        String expectedDropDownSize = expectedDropDownArray[0];
        System.out.println("Expected Drop Down Size: " + expectedDropDownSize);

        Assert.assertEquals(testBusinessPage.myEbayDropDownMenu(),expectedDropDownSize,"Drop Down Menu Size Does not match");
    }

    @Test (priority = 3)
    public static void testIndustrial() throws IOException, InterruptedException {
        getInitElements();
        testBusinessPage.checkIndustrial();

        String[] expectedDropDownArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") +
                "//src/main/resources/Ebay_BusinessPage_ExpectedElements.xlsx", "Industrial Drop Down Size");
        String expectedDropDownSize = expectedDropDownArray[0];
        System.out.println("Expected Drop Down Size: " + expectedDropDownSize);

        Assert.assertEquals(testBusinessPage.checkIndustrial(),expectedDropDownSize,"Drop Down Menu Size Does not match");

    }

    @Test (priority = 4)
    public static void testSideBar() throws IOException, InterruptedException {
        getInitElements();
        testBusinessPage.sideBar();

        String[] expectedSideBarArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") +
                "//src/main/resources/Ebay_BusinessPage_ExpectedElements.xlsx", "Agriculture Side Bar Size");
        String expectedSideBarSize = expectedSideBarArray[0];
        System.out.println("Expected Drop Down Size: " + expectedSideBarSize);

        Assert.assertEquals(testBusinessPage.sideBar(),expectedSideBarSize,"Side Bar Size Does not match");
    }

    @Test (priority = 5)
    public static void testBuildingMaterialsPage() throws IOException, InterruptedException {
        getInitElements();
        testBusinessPage.goToBuildingMaterialsPage();

        String[] expectedBusinessPageTitleArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") +
                "//src/main/resources/Ebay_BusinessPage_ExpectedElements.xlsx", "Building Materials Page Title");
        String expectedPageTitle = expectedBusinessPageTitleArray[0];
        System.out.println("Expected Page Title: " + expectedPageTitle);

        Assert.assertEquals(testBusinessPage.goToBuildingMaterialsPage(),expectedPageTitle,"Side Bar Size Does not match");
    }

    @Test (priority = 6)
    public static void testSwipeButton() throws IOException, InterruptedException {
        getInitElements();
        testBusinessPage.checkSwipeButton();
    }

    @Test (priority = 7)
    public static void testBrandBox() throws IOException, InterruptedException {
        getInitElements();
        testBusinessPage.checkBrandBox();
    }

    @Test (priority = 8)
    public static void testDeliveryBox() throws IOException, InterruptedException {
        getInitElements();
        testBusinessPage.checkDeliveryBox();
    }

    @Test (priority = 9)
    public static void testPriceBox() throws IOException, InterruptedException {
        getInitElements();
        testBusinessPage.checkPriceBox();
    }

    @Test (priority = 10)
    public static void testItemLocation() throws IOException, InterruptedException {
        getInitElements();
        testBusinessPage.checkItemLocation();
    }

    @Test (priority = 11)
    public static void testShowOnlyBox() throws IOException, InterruptedException {
        getInitElements();
        testBusinessPage.checkShowOnlyBox();
    }

    @Test (priority = 12)
    public static void testSearchBar() throws IOException, InterruptedException {
        getInitElements();
        testBusinessPage.checkSearchBar();
    }

    @Test (priority = 13)
    public static void testPageView() throws IOException, InterruptedException {
        getInitElements();
        testBusinessPage.pageView();
    }

    @Test (priority = 14)
    public static void testMatchBar() throws IOException, InterruptedException {
        getInitElements();
        testBusinessPage.bestMatchBar();

        String[] expectedMatchBarArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") +
                "//src/main/resources/Ebay_BusinessPage_ExpectedElements.xlsx", "Match Bar Size");
        String expectedMatchBarSize = expectedMatchBarArray[0];
        System.out.println("Expected Box Size: " + expectedMatchBarSize);

        Assert.assertEquals(testBusinessPage.bestMatchBar(),expectedMatchBarSize,"Bar Size Does not match");


    }

    @Test (priority = 15)
    public static void testConditionBox() throws IOException, InterruptedException {
        getInitElements();
        testBusinessPage.conditionBox();

        String[] expectedConditionBoxArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") +
                "//src/main/resources/Ebay_BusinessPage_ExpectedElements.xlsx", "Condition Box Size");
        String expectedConditionBoxSize = expectedConditionBoxArray[0];
        System.out.println("Expected Box Size: " + expectedConditionBoxSize);

        Assert.assertEquals(testBusinessPage.conditionBox(),expectedConditionBoxSize,"Box Size Does not match");

    }

    @Test (priority = 16)
    public static void testBuyItNowOption() throws IOException, InterruptedException {
        getInitElements();
        testBusinessPage.buyItNowOption();

        String[] expectedBoxArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") +
                "//src/main/resources/Ebay_BusinessPage_ExpectedElements.xlsx", "Sales Options");
        String expectedBoxSize = expectedBoxArray[0];
        System.out.println("Expected Box Size: " + expectedBoxSize);

        Assert.assertEquals(testBusinessPage.buyItNowOption(),expectedBoxSize,"Box Size Does not match");
    }

    @Test (priority = 17)
    public static void testSwipeButtonOption() throws IOException, InterruptedException {
        getInitElements();
        testBusinessPage.swipeButton();
    }

    @Test (priority = 18)
    public static void testItemsPerPageOption() throws IOException, InterruptedException {
        getInitElements();
        testBusinessPage.itemsPerPage();

        String[] expectedBoxArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir") +
                "//src/main/resources/Ebay_BusinessPage_ExpectedElements.xlsx", "Items Per Page Option");
        String expectedBoxSize = expectedBoxArray[0];
        System.out.println("Expected Box Size: " + expectedBoxSize);

        Assert.assertEquals(testBusinessPage.itemsPerPage(),expectedBoxSize,"Box Size Does not match");

    }

    @Test (priority = 19)
    public static void testRemoveFilter() throws IOException, InterruptedException {
        getInitElements();
        testBusinessPage.removeFilter();
    }

}
