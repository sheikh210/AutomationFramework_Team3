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

    @Test(priority = 3)
    public static void testPlanDealsText() throws Exception{
        getInItElements();
        Assert.assertTrue(planspage.validatePlansDealsText() == true);
    }

    @Test(priority = 4)
    public static void testPlanDealsSize() throws Exception{
        getInItElements();
        Assert.assertTrue(planspage.validatePlansDealsSize() == true);
    }


}
