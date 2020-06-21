package employerspage;
import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DataReader;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import static employerspage.EmployerspageElements.*;

public class Employerspage extends WebAPI {

    WebDriverWait wait = new WebDriverWait(driver, 10);
    Wait fluentWait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);
    String path = System.getProperty("user.dir") + "\\src\\main\\resources\\" +
            "Aetna_Employerspage_Elements.xlsx";
    DataReader dataReader = new DataReader();

    @FindBy(xpath = webElementExploreAetnaSitesDropDown)
            public WebElement exploreAetnaSitesDropDown;
    @FindBy(xpath = webElementForEmployersLink)
            public WebElement forEmployersLink;

    /**
     * Test Case 1 - Navigate to Employerspage
     * 1: Launch Chrome Browser
     * 2: Direct chrome to Aetna homepage
     * 3: Click on Explore Aetna Sites to reveal dropdown menu
     * 4: Click on For Employers link
     * 5: Validate the For Employers page url with what is stored in Exel
     */
    public void getEmployersPage() {
        wait.until(ExpectedConditions.elementToBeClickable(exploreAetnaSitesDropDown));
        clickOnElement(exploreAetnaSitesDropDown);
        wait.until(ExpectedConditions.elementToBeClickable(forEmployersLink));
        clickOnElement(forEmployersLink);

    }

    public boolean validatePlanspage() throws Exception {
        getEmployersPage();
        String url = getCurrentPageUrl();
        return compareTextToExpectedString(url,path,"EmployersPageURL");


    }

}
