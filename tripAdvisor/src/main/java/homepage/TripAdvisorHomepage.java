package homepage;

import commonAPI.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static homepage.TripAdvisorHomepageElements.*;

public class TripAdvisorHomepage extends WebAPI {

    @FindBy(how = How.XPATH,using = webElementSearchBox)
    public WebElement searchBox;
    @FindBy(xpath = webElementSelectText)
    public  WebElement selectText;


    public void doSearchElement() throws InterruptedException {
        searchBox.click();
        searchBox.sendKeys("aj");
        Thread.sleep(3000);
    }

    public void validateDoSearchElement(){
        String actualText=selectText.getText();
        Assert.assertEquals(actualText,"ajmer ajmer district");


    }
}

