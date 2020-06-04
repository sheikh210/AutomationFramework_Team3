package homepage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import javax.lang.model.element.Element;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BankOfAmericaHomepage {

    static WebDriver driver;
    static String url = "http://bankofamerica.com";
    static String url1= "https://promo.bankofamerica.com/hp-oaa2/";


    public static void doNavigate(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();

    }


    public static void main(String[] args) {

        //doNavigate();
        //homepageElements();
       // doLogin();
        //openAccount();
       //findWebElements();
        selectLanguage();
    }

    public static void homepageElements() {

        List<WebElement> homepageLinks = driver.findElements(By.tagName("a"));


    }
    public static void doLogin(){

        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.navigate().to(url);
        driver.findElement(By.xpath("//*[@id=\"onlineId1\"]")).sendKeys("abcdef");
        driver.findElement(By.cssSelector("#passcode1")).sendKeys("abcd12345");
        driver.findElement(By.xpath("//*[@id=\"saveOnlineId\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"signIn\"]")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.quit();
    }
    public static void openAccount(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.navigate().to(url);
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"open\"]")).click();
        driver.navigate().to(url1);
        driver.findElement(By.xpath("//*[@id=\"SB_GetStarted_2017mOAA2RS\"]/div/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"SMP_MPP_Index3_Check_CTA_CompareAccounts\"]")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.quit();
    }
    public static void findWebElements(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.navigate().to(url);
        driver.manage().window().fullscreen();
        WebElement tableElement= driver.findElement(By.xpath("//*[@id=\"panel-legal\"]/div[2]/div/div/div/p"));
        List<WebElement> elements=tableElement.findElements(By.className("cell"));
        System.out.println("Total Elements "+elements.size());
        for (WebElement option : elements){
            System.out.println(option.getText());
            System.out.println(option.getAttribute("cell"));
            System.out.println();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();

    }
    public static void selectLanguage(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"NAV_EN_ES\"]")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement dropdownElements=driver.findElement(By.xpath("//*[@id=\"NAV_EN_ES\"]"));

        Select select=new Select(dropdownElements);
        List<WebElement> dropdown=select.getOptions();
        for(WebElement e:dropdown){
            System.out.println(e.getSize());
        }
        //select.selectByVisibleText("");


        driver.quit();

    }


}
