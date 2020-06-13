package homepageTest;

import commonAPI.WebAPI;
import homepage.VerizonWirelessHomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VerizonWirelessHomepageTest extends WebAPI {

    static VerizonWirelessHomepage testHomepage;

    public static void getInitElements() {
        testHomepage = PageFactory.initElements(driver, VerizonWirelessHomepage.class);

    }

    @Test
    public static void testLogin() {
        getInitElements();
        testHomepage.doLogin();

    }
    @Test
    public static void test5Gpage() {
        testHomepage.goto5Gpage();
    }

}
