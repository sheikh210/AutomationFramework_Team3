package verizonInHomePage;

import commonAPI.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static verizonInHomePage.VerizonInHomeElement.*;


public class VerizonInHomePage extends WebAPI {
//1
@FindBy(how = How.XPATH,using = webElementInHomeButtonPage)
public WebElement inHomeButton;



//1
public void navigateToInHomeButtonPage(){
    WebDriverWait wait = new WebDriverWait(driver,10);
    wait.until(ExpectedConditions.elementToBeClickable(inHomeButton));
    inHomeButton.click();
}
//2
    public String validateInHomeButtonPageUrl(){
    navigateToInHomeButtonPage();
    String inHomeButtonPageUrl = super. getCurrentPageUrl();
    driver.navigate().refresh();
    System.out.println("In Home Page Url:"+inHomeButtonPageUrl );
    return inHomeButtonPageUrl;
    }
//3
    public String validateInHomeButtonPageTitle(){
    navigateToInHomeButtonPage();
    String inHomeButtonPageTitle = super. getCurrentPageTitle();
    driver.navigate().refresh();
    System.out.println("In Home Page Title:" +inHomeButtonPageTitle );
    return inHomeButtonPageTitle ;
}
//4



}