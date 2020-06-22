package employerspageTest;
import commonAPI.WebAPI;
import org.testng.Assert;
import employerspage.Employerspage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class EmployerspageTest extends WebAPI{
    static Employerspage employerspage;
    public static void getInItElements(){
        employerspage = PageFactory.initElements(driver, Employerspage.class);
    }

    @Test(priority = 0)
    public static void testGetEmployersPage()throws Exception{
        getInItElements();
        Assert.assertTrue(employerspage.validatePlanspage());
    }

    @Test(priority = 1)
    public static void testGetProductsAndServicesDropDown() throws Exception{
        getInItElements();
        Assert.assertTrue(employerspage.getProductsAndServicesDropDown()==true);
    }
    @Test(priority = 2)
    public static void testHealthPlansList() throws Exception{
        getInItElements();
        Assert.assertTrue(employerspage.getHealthPlansList()==true);
    }
    @Test(priority = 3)
    public static void testHealthPlansNum() throws Exception{
        getInItElements();
        Assert.assertTrue(employerspage.validateHealthPlansNum()==true);
    }
    @Test(priority = 4)
    public static void testMemberPrograms() throws Exception{
        getInItElements();
        Assert.assertTrue(employerspage.getMemberPrograms()==true);
    }
    @Test(priority = 5)
    public static void testMemberProgramsNum() throws Exception{
        getInItElements();
        Assert.assertTrue(employerspage.validateMemberProgramsNum()==true);
    }
    @Test(priority = 6)
    public static void testAdministrationOfferings() throws Exception{
        getInItElements();
        Assert.assertTrue(employerspage.getAdministrationOfferings()==true);
    }
    @Test(priority = 7)
    public static void testAdministrationOfferingsNum() throws Exception{
        getInItElements();
        Assert.assertTrue(employerspage.validateMemberProgramsNum()==true);
    }
    @Test(priority = 8)
    public static void testSolutionsMenu() throws Exception{
        getInItElements();
        Assert.assertTrue(employerspage.getSolutionsMenu()==true);
    }
    @Test(priority = 9)
    public static void testByCompanySize() throws Exception{
        getInItElements();
        Assert.assertTrue(employerspage.getByCompanySize()==true);
    }
    @Test(priority = 10)
    public static void testByCompanySizeNum() throws Exception{
        getInItElements();
        Assert.assertTrue(employerspage.validateByCompanySizeNum()==true);
    }
    @Test(priority = 11)
    public static void testByIndustry() throws Exception{
        getInItElements();
        Assert.assertTrue(employerspage.getByIndustry()==true);
    }
    @Test(priority = 12)
    public static void testByIndustryNum() throws Exception{
        getInItElements();
        Assert.assertTrue(employerspage.validateByIndustryNum()==true);
    }
    @Test(priority = 13)
    public static void testResourcesMenu() throws Exception{
        getInItElements();
        Assert.assertTrue(employerspage.getResources()==true);
    }
    @Test(priority = 14)
    public static void testPayYourBill() throws Exception{
        getInItElements();
        Assert.assertTrue(employerspage.getPayYourBill()==true);
    }
    @Test(priority = 15)
    public static void testPayYourBillNum() throws Exception{
        getInItElements();
        Assert.assertTrue(employerspage.validatePayYourBillNum()==true);
    }
    @Test(priority = 16)
    public static void testToolsManualsForms() throws Exception{
        getInItElements();
        Assert.assertTrue(employerspage.getToolsManualsForms()==true);
    }
    @Test(priority = 17)
    public static void testToolsManualsFormsNum() throws Exception{
        getInItElements();
        Assert.assertTrue(employerspage.validateToolsManualsFormsNum()==true);
    }
    @Test(priority = 18)
    public static void testTrendsAndInsights() throws Exception{
        getInItElements();
        Assert.assertTrue(employerspage.getTrendsAndInsightsDropDown()==true);
    }
    @Test(priority = 19)
    public static void testTrendsAndInsightsNum() throws Exception{
        getInItElements();
        Assert.assertTrue(employerspage.validateTrendsAndInsightsNum()==true);
    }



}
