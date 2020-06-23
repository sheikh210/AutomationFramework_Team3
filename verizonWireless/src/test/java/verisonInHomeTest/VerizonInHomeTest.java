package verisonInHomeTest;
import commonAPI.WebAPI;
import org.openqa.selenium.support.PageFactory;
import verizonInHomePage.VerizonInHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;



public class VerizonInHomeTest extends WebAPI{

    static VerizonInHomePage verizonInHomePage;
    public static void getInItElements() {
        verizonInHomePage = PageFactory.initElements(driver, VerizonInHomePage.class);
    }
    //2
    @Test
    public static void testPhonePageUrl(){
        getInItElements();
        String actualUrl = verizonInHomePage.validateInHomeButtonPageUrl();
        Assert.assertEquals(actualUrl,"");
    }
    //3
    @Test(enabled = false)
    public static void testPhonePageTitle() {
        getInItElements();
        String actualTitle = verizonInHomePage.validateInHomeButtonPageTitle();
        Assert.assertEquals(actualTitle, "bb");
    }










}
