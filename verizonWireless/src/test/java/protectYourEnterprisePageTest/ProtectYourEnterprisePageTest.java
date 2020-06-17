package protectYourEnterprisePageTest;

import commonAPI.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import protectYourEnterprisePage.ProtectYourEnterprisePage;
import utilities.DataReader;

import java.io.IOException;

public class ProtectYourEnterprisePageTest extends WebAPI {

    static ProtectYourEnterprisePage protectYourEnterprisePage;
    static String path = System.getProperty("user.dir")+"\\src\\main\\resources\\" +
            "VerizonWireless_ProtectYourEnterprisePage_ExpectedElements.xlsx";
    static DataReader dataReader = new DataReader();

    public static void getInItElements() {
        protectYourEnterprisePage = PageFactory.initElements(driver, ProtectYourEnterprisePage.class);
    }

    /**
     * TEST CASE 1 - Navigate to "Protect Your Enterprise From Threats" Page
     * 1. Navigate to http://verizonwireless.com
     * 2. Click "Business" button in header
     * 3. Click "Enterprise" button in header
     * 4. If pop-up is displayed, close pop-up.
     * 5. If pop-up is not displayed, scroll down and click "Protect Your Enterprise From Threats" box
     * 6. Verify image text is correct
     */
//    @Test (priority = 0)
//    public static void testNavToPage() throws Exception {
//        getInItElements();
//        Assert.assertEquals(protectYourEnterprisePage.navigateToProtectYourEnterprisePage(),
//                dataReader.fileReaderStringXSSF(path, "PageConfirmText")[0]);
//    }

    @Test (priority = 1)
    public static void testProtectEnterpriseDropdownListCount() throws IOException {
        getInItElements();
        Assert.assertTrue(protectYourEnterprisePage.validateProtectEnterpriseDropdownListSize());
    }

}
