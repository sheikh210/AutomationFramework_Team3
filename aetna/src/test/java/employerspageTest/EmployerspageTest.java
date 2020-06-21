package employerspageTest;
import commonAPI.WebAPI;
import org.testng.Assert;
import employerspage.Employerspage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.DataReader;

public class EmployerspageTest extends WebAPI{
    static Employerspage employerspage;
    static DataReader dataReader = new DataReader();
    public static void getInItElements(){
        employerspage = PageFactory.initElements(driver, Employerspage.class);
    }

    @Test(priority = 0)
    public static void testGetEmployersPage()throws Exception{
        getInItElements();
        Assert.assertTrue(employerspage.validatePlanspage());
    }


}
