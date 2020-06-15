package ownerspageTest;

import commonAPI.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import ownerspage.OwnersPage;
import utilities.DataReader;

import java.io.IOException;

public class OwnersPageTest extends WebAPI {

    static OwnersPage ownersPage;
    static DataReader dataReader = new DataReader();
    static SoftAssert softAssert = new SoftAssert();

    public static void getInItElements() {
        ownersPage = PageFactory.initElements(driver, OwnersPage.class);
    }

    @Test (priority = 0)
    public static void testNavigationToOwnersPage() throws IOException {
        getInItElements();
        String actualURL = ownersPage.validateNavigationToOwnersPage();
        String[] expectedURLArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir")+"\\src\\main" +
                "\\resources\\TripAdvisor_OwnersPage_ExpectedElements.xlsx", "OwnersPage URL");
        String expectedURL = expectedURLArray[0];

        Assert.assertEquals(actualURL, expectedURL, "NOT NAVIGATED TO OWNER'S PAGE");
    }




}
