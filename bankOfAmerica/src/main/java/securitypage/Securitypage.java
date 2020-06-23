package securitypage;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;
import utilities.DataReader;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import static securitypage.SecuritypageElements.*;

public class Securitypage extends WebAPI{

    WebDriverWait wait = new WebDriverWait(driver, 10);
    Wait fluentWait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);
    String path = System.getProperty("user.dir") + "\\src\\main\\java\\resources\\" +
            "St.Judes_EducationalTraining.xlsx";
    DataReader dataReader = new DataReader();



}
