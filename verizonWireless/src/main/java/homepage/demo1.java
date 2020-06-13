package homepage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class demo1 {

    static WebDriver driver;
    static String weburl = "https://www.verizonwireless.com/";
    static String username = "pnttest12345@gmail.com";
    static String password = "test12345";

    public static void main(String[] args) {
        homepage();
    }
    public static void homepage() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get(weburl);
        driver.manage().window().maximize();

        String homepageTitle = driver.getTitle();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public static void doSignin () {
        /**
         * >>>Test Case 1 - Login Functionality<<<
         * Open Chrome Browser
         * Maximize Window
         * Go to https://www.verizonwireless.com/
         * Get Title
         * Click Sign in button
         * Wait landing page
         * Type Email
         * Type Password
         * Click sign in
         */

        driver.findElement(By.xpath("//*[@id=\"gnavAccountMenu\"]")).click();
//      Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"IDToken1\"]")).sendKeys(username);

        driver.findElement(By.xpath("//*[@id=\"IDToken2\"]")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();
    }
    public static void goto5GPage () {
        /**
         * >>>Test Case 2 - 5G Page<<<
         * Click Verizon icon
         * Go to Home Page
         * Wait Landing page
         * Click 5G
         * Verify subcategories are visible
         * Verify subcategories are clickable
         * Open 5G Overview
         * Wait landing
         * Scroll down
         * Swipe advertisements
         * Click 5G
         * Open 5G Home Internet
         */

        driver.findElement(By.xpath("//*[@id=\"thirdLevel50\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"video-section-2\"]/div/div/div/div[2]/div/div/button[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"video-section-2\"]/div/div/div/div[2]/div/div/button[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"video-section-2\"]/div/div/div/div[2]/div/div/button[2]")).click();

        driver.findElement(By.xpath("//*[@id=\"thirdLevel51\"]")).click();

    }

    public static void goSupportPage () {
        /**
         * >>>Test Case 3 - Support Page<<<
         * Click Support
         * Open Support overview
         * Click Search bar
         * Type >>>Make Payment<<<
         * Click search
         * Wait landing page
         * Click Pay Bill
         */

        driver.findElement(By.xpath("<a class=\"\" id=\"thirdLevel40\" href=\"https://www.verizonwireless.com/support/\">Support overview</a>")).click();
        driver.findElement(By.xpath("//*[@id=\"navPhoneSearch\"]")).sendKeys();
        driver.findElement(By.xpath("//*[@id=\"searchIconButton\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[5]/div[1]")).click();


    }



}

