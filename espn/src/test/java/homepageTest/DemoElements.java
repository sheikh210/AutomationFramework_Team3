package homepageTest;

import commonAPI.WebAPI;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DemoElements{

    static WebDriver driver;
    static String url = "http://espn.com";

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

//        WebAPI webAPI = new WebAPI();
        WebElement featured = driver.findElement(By.xpath("//*[@id=\"leagues\"]//div[@class=\"scoreEvent scoreEvent--featured\"]"));
        Actions hover = new Actions(driver);
        hover.moveToElement(featured);

        System.out.println("Mouse Hovered over featured box");

        WebElement hidden = driver.findElement(By.xpath("//*[@id=\"leagues\"]//div[@class=\"scoreEvent scoreEvent--featured\"]/div/a"));
        System.out.println(hidden.getAttribute("innerHTML").trim());
        System.out.println(hidden.getAttribute("href"));
    }
}
