package protectYourEnterprisePageTest;

import commonAPI.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import protectYourEnterprisePage.ProtectYourEnterprisePage;

public class ProtectYourEnterprisePageTest extends WebAPI {

    static ProtectYourEnterprisePage protectYourEnterprisePage;
    static String path = System.getProperty("user.dir")+"src\\main\\resources\\" +
            "VerizonWireless_ProtectYourEnterprisePage_ExpectedElements.xlsx";

    public static void getInItElements() {
        protectYourEnterprisePage = PageFactory.initElements(driver, ProtectYourEnterprisePage.class);
    }

    @Test (priority = 0)
    public static void test() {
        getInItElements();
        protectYourEnterprisePage.navigateToProtectYourEnterprisePage();
    }

}
