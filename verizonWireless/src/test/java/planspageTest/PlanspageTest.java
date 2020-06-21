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

    @Test(priority = 0)
    public static void testPlanspage() throws Exception {
        getInItElements();
        Assert.assertEquals(planspage.validatePlanspage(),true);
    }

    @Test(priority = 1)
    public static void testPlansDropDownText() throws Exception{
        getInItElements();
        Assert.assertTrue(planspage.validatePlansDropDownText() == true);

    }

    @Test(priority = 2)
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

    @Test(priority = 5)
    public static void testSharedDataButton() throws Exception{
        getInItElements();
        Assert.assertTrue(planspage.validateSharedDataButton() == true);
    }
    @Test(priority = 6)
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
    @Test(priority = 10)
    public static void testLinesNeedPlus() throws Exception{
        getInItElements();
        Assert.assertTrue(planspage.validateLinesNeedPlus()==true);
    }
    @Test(priority = 11)
    public static void testLinesNeedMinus() throws Exception{
        getInItElements();
        Assert.assertTrue(planspage.validateLinesNeedMinus()==true);
    }

    @Test(priority = 12)
    public static void testSlidesRightArrow() throws Exception{
        getInItElements();
        Assert.assertTrue(planspage.validateSlideRightArrow()==true);
    }
    @Test(priority = 13)
    public static void testSlidesLeftArrow() throws Exception{
        getInItElements();
        Assert.assertTrue(planspage.validateSlideLeftArrow()==true);
    }
    @Test(priority = 14)
    public static void testPhonesDropDownSize() throws Exception{
        getInItElements();
        Assert.assertTrue(planspage.validatePhonesDropDownSize()==true);
    }
    @Test(priority = 15)
    public static void testPhonesDropDownText() throws Exception{
        getInItElements();
        Assert.assertTrue(planspage.validatePhonesDropDownText()==true);
    }

    @Test(priority = 16)
    public static void testFeaturedPhonesDropDownSize() throws Exception{
        getInItElements();
        Assert.assertTrue(planspage.validateFeaturedPhonesDropDownSize());
    }
    @Test(priority = 17)
    public static void testFeaturedPhonesDropDownText() throws Exception{
        getInItElements();
        Assert.assertTrue(planspage.validateFeaturedPhonesDropDownText());
    }
    @Test(priority = 18)
    public static void testAppsAndServicesList() throws Exception{
        getInItElements();
        Assert.assertTrue(planspage.validateAppsAndServicesList());
    }
    @Test(priority = 19)
    public static void testAppsAndServicesListSize() throws Exception{
        getInItElements();
        Assert.assertTrue(planspage.validateAppsAndServicesListSize());
    }
}
