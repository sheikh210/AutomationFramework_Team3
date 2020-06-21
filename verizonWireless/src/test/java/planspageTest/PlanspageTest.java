package planspageTest;

import commonAPI.WebAPI;
import org.testng.Assert;
import planspage.Planspage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.DataReader;

public class PlanspageTest extends WebAPI  {
    static Planspage planspage;
    static DataReader dataReader = new DataReader();
    public static void getInItElements(){
        planspage = PageFactory.initElements(driver, Planspage.class);
    }

    @Test(priority = 0,enabled = false)
    public static void testPlanspage() throws Exception {
        getInItElements();
        Assert.assertEquals(planspage.validatePlanspage(),true);
    }

    @Test(priority = 1,enabled = false)
    public static void testPlansDropDownText() throws Exception{
        getInItElements();
        Assert.assertTrue(planspage.validatePlansDropDownText() == true);

    }

    @Test(priority = 2,enabled = false)
    public static void testPlansDropDownSize() throws Exception{
        getInItElements();
        Assert.assertTrue(planspage.validatePlansDropDownSize() == true);

    }

    @Test(priority = 3,enabled = false)
    public static void testPlanDealsText() throws Exception{
        getInItElements();
        Assert.assertTrue(planspage.validatePlansDealsText() == true);
    }

    @Test(priority = 4,enabled = false)
    public static void testPlanDealsSize() throws Exception{
        getInItElements();
        Assert.assertTrue(planspage.validatePlansDealsSize() == true);
    }

    @Test(priority = 5,enabled = false)
    public static void testSharedDataButton() throws Exception{
        getInItElements();
        Assert.assertTrue(planspage.validateSharedDataButton() == true);
    }
    @Test(priority = 6,enabled = false)
    public static void testSingleDeviceButton() throws Exception{
        getInItElements();
        Assert.assertTrue(planspage.validateSingleDeviceButton() == true);
    }
    @Test(priority = 7)
    public static void testNumberShareButton() throws Exception{
        getInItElements();
        Assert.assertTrue(planspage.validateNumberShareButton() == true);
    }
    @Test(priority = 8)
    public static void testPrepaidButton() throws Exception{
        getInItElements();
        Assert.assertTrue(planspage.validatePrepaidButton() == true);
    }
    @Test(priority = 9)
    public static void testInternationalButton() throws Exception{
        getInItElements();
        Assert.assertTrue(planspage.validateInternationalButton() == true);
    }

}
