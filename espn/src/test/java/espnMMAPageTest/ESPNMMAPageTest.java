package espnMMAPageTest;

import commonAPI.WebAPI;
import mmaPage.ESPNMMAPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConnectToSqlDB;
import utilities.DataReader;
import java.io.IOException;

public class ESPNMMAPageTest extends WebAPI {
    static ESPNMMAPage espnMMAPage;
    String path = System.getProperty("user.dir") +"\\src\\main\\resources\\ESPNMMAPage_ExpectedWebElements.xlsx" ;
    DataReader dataReader = new DataReader();
    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    public static void getInItElements(){
        espnMMAPage = PageFactory.initElements(driver, ESPNMMAPage.class);
    }

    @Test(priority = 1)
    public void validatePageTitle() throws IOException, InterruptedException {
        getInItElements();
        Assert.assertTrue(espnMMAPage.validateMMAPageTitle());
    }





}
