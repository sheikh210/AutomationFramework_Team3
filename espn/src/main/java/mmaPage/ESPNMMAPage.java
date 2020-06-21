package mmaPage;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConnectToSqlDB;
import utilities.DataReader;

import java.io.IOException;

import static mmaPage.ESPNMMAPageElements.*;

public class ESPNMMAPage extends WebAPI {
    String path = System.getProperty("user.dir") +"\\src\\main\\resources\\ESPNMMAPage_ExpectedWebElements.xlsx" ;
    WebDriverWait wait = new WebDriverWait(driver, 10);
    DataReader dataReader = new DataReader();
    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    /**
     * Navigate to MMA page elements
     */
    @FindBy(xpath = WebElementMMAButton)
    public WebElement mmaButton;
    @FindBy(xpath = WebElementMMAHomeButton)
    public WebElement mmaHomeButton;

    public void navigateToMMAPage() throws InterruptedException {
        clickOnElement(mmaButton);
        waitUntilVisible(By.xpath("//*[@id=\"global-nav\"]/ul/li[5]/div"));
        try {
            clickJScript(mmaHomeButton);

            System.out.println("Clicked");

        }catch(Exception e){
            clickJScript(mmaHomeButton);
            System.out.println("Clicked 2");
        }

        if (getCurrentPageTitle().equalsIgnoreCase("Mixed Martial Arts News, Video, Rankings, Results, and History - MMA - ESPN"))
        System.out.println("Navigated to MMA Home Page Successfully");
        else
            System.out.println("Failed to navigate");
    }

    public boolean validateMMAPageTitle() throws IOException, InterruptedException {
        navigateToMMAPage();
        String title=getCurrentPageTitle();
        wait.until(ExpectedConditions.titleIs(title));
        boolean flag=compareTextToExpectedString(title,path,"MMAPageTitle");
        return flag;

    }



}
