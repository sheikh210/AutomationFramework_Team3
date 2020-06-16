package inHomePage;

import commonAPI.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import javax.xml.xpath.XPath;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static inHomePage.VerizonWirelessInHomePageWebElements.*;

public class VerizonWirelessInHomePage extends WebAPI {
    /**
     * Header WebElements
     */
    @FindBy(xpath=WebElementInHomeTab)
    public WebElement inHomeTab;
    @FindBy(xpath = WebElementShopMenu)
    public WebElement shopMenu;
    @FindBy(xpath =WebElementIconsLinks)
    public WebElement iconsLinks;
    @FindBy(css = WebElementSearchButton)
    public WebElement searchButton;
    @FindBy(css = WebElementFiosInternetOption)
    public WebElement fiosInternetOption;
    @FindBy(xpath=WebElementTvImage)
    public WebElement tvImage;
    @FindBy(xpath = WebElementInputSearchBox)
    public WebElement inputSearchBox;
    @FindBy(xpath = WebElementMyVerizonTab)
    public WebElement myVerizonTab;
    @FindBy (xpath =WebElementSupportTab )
    WebElement supportTab;
    @FindBy (xpath = WebElementWatchTvTab)
    WebElement watchTvTab;
    @FindBy(xpath = WebElementSpanishLanguage)
    WebElement spanishLanguage;
    @FindBy(xpath = WebElementHomePageLogo)
    WebElement homePageLogo;
    @FindBy(xpath = WebElementLocateCompass)
    WebElement locateCompass;

    /**
     * Body WebElements
     */
    @FindBy(xpath = WebElementRegisterNyButton)
    public WebElement registerNyButton;
    @FindBy(xpath = WebElementSignInText)
    public WebElement signInText;
    @FindBy(xpath = WebElementSignInButton)
    public WebElement signInButton;
    /**
     * Footer Web Elements
     */
    @FindBy(xpath = WebElementContactUs)
    public WebElement contactUs;
    @FindBy(xpath= WebElementSocialMediaTabs)
    WebElement socialMediaTabs;
    @FindBy(xpath=WebElementMyFiosAppLink)
    public WebElement myFiosAppLink;
    @FindBy(xpath = WebElementGooglePlayLogo)
    public WebElement googlePlayLogo;
    @FindBy(xpath = WebElementTermsAndConditionsLink)
    public WebElement termsAndConditionsLink;
    @FindBy(xpath = WebElementTermsAndConditionsText)
    public WebElement termsAndConditionsText;
    @FindBy(xpath = WebElementSearchByStateLink)
    public WebElement searchByStateLink;
    @FindBy(xpath = WebElementFooterSectionLinks)
    public WebElement footerSectionLinks;

    /**
     *  Test Case 1: "Validate url"
     *  1)Navigate to "https://www.verizon.com/?lid=//global//residential"
     *  2)Get the page title
     *  3)validate the Page Title.
     */
    public void navigateToInHomePage(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        inHomeTab.click();
    }
    public void validateInHomePage(){
        navigateToInHomePage();
        driver.getTitle();

    }
    public void validatePageTitle(){
        String actualTitle=getCurrentPageTitle();
        String expectedTitle="Verizon: Internet, TV and Phone Services | Official Site";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }
    /**
     *  Test Case 2:"Validate Shop menu
     * 1) Navigate to "https://www.verizon.com/?lid=//global//residential"
     * 2) Count how many links in "Shop" sub menu
     * 3) Validate number of links
     * 4)Close Browser
     */
    public void countShopMenuOption(){
        navigateToInHomePage();
        mouseHover(shopMenu);
        List<WebElement> menu= shopMenu.findElements(By.tagName("a"));
//        System.out.println(menu.size());
//        for(WebElement link:menu){
//        System.out.println(link.getAttribute("href") + " - " );
        List<WebElement> vlinks = menu.stream().filter(WebElement::isDisplayed).collect(Collectors.toList());
        System.out.println("The total number of visible links on the page is :" + vlinks.size());

        for (WebElement link : vlinks) {
            String url = link.getAttribute("href");
            System.out.println(url);
        }


    }
    public void validateShopMenuOption(){

        List<WebElement> menu= shopMenu.findElements(By.tagName("a"));
        List<WebElement> vlinks = menu.stream().filter(WebElement::isDisplayed).collect(Collectors.toList());
        System.out.println("The total number of visible links on the page are :" + vlinks.size());
        int actualLinksNum=vlinks.size();
        int expectedLinksNum=14;
        Assert.assertEquals(actualLinksNum,expectedLinksNum,"Count does not match");
    }
    /**
     * Test Case 3: "Open display menu links in new tabs"
     * 1) Navigate to "https://www.verizon.com/?lid=//global//residential"
     * 2) Count how many links in "Shop" sub menu
     * 3) Open each link in new tab
     * 4) Close Browser
     */
    public void openDisplayMenuLinks(){
        navigateToInHomePage();
        WebElement iconLinks=driver.findElement(By.xpath(WebElementIconsLinks));
        int linksNumber=iconLinks.findElements(By.tagName("a")).size();
        System.out.println(linksNumber);
        for (int i=1; i<6;i++)
        {
            String openTabs= Keys.chord(Keys.CONTROL,Keys.ENTER);
            iconLinks.findElements(By.tagName("a")).get(i).sendKeys(openTabs);
        }

    }
    public void validateOpenDisplayMenuLinks(){
        WebElement iconLinks=driver.findElement(By.xpath(WebElementIconsLinks));
        int actualLinksNumber=iconLinks.findElements(By.tagName("a")).size();
        int expectedLinksNumber=6;
        Assert.assertEquals(actualLinksNumber,expectedLinksNumber,"Links count does not match");

    }
    public void OpenSearchBox(){
        navigateToInHomePage();
        searchButton.click();
        mouseHover(fiosInternetOption);
        fiosInternetOption.click();
    }
    public void validateSearchBox(){
        String actualTitle=getCurrentPageTitle();
        String expectedTitle="High Speed Fiber-Optic Internet Services Provider | Verizon Fios";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }
    /**
     * Test Case 5: "Open a new tab"
     * 1) Navigate to "https://www.verizonWireless.com"
     * 2)Click on "Inhome Page" tab
     * 3)hover over to TV link
     * 4)Open the link in new tab using "Ctrl + Enter"
     * 5)get the title of the new page
     * 6)Close the new tab.
     * 7)Close Browser.
     */
    public void openNewTab(){
        navigateToInHomePage();
//
//        WebElement iconLinks=driver.findElement(By.xpath(WebElementTvImage));
//
//
//            String openTabs= Keys.chord(Keys.CONTROL,Keys.ENTER);
//            iconLinks.findElements(By.tagName("a")).;
//            String h=driver.getWindowHandle();
//            System.out.println(driver.switchTo().window(h).getTitle());


    }
    /**
     * Test Case 6: "Test Search box by passing "Moving"
     * 1) Navigate to "https://www.verizonWireless.com"
     * 2)Click on "Inhome Page" tab
     * 3)Click search box
     * 4)Type "Moving"
     * 5)Click enter
     * 6)Get page title
     * 7)Close browser
     */

    public void typeOnSearchBox(){
        navigateToInHomePage();
        searchButton.click();
        inputSearchBox.sendKeys("Moving",Keys.ENTER);
    }
    public void validateTypeOnSearchBar(){
        String actualTitle=getCurrentPageTitle();
        String expectedTitle="Search Results | Verizon";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }
    /**
     * Test Cse 7: "Validate "Register" button"
     * 1) Navigate to "https://www.verizonWireless.com"
     * 2)Click on "Inhome Page" tab
     * 3)Scroll down until "Register" button is found
     * 4)Click Register
     * 5)Switch to the new tab
     * 6)get page title
     * 7)Close browser
     */

    public void registerNyTimes() {
        navigateToInHomePage();
        registerNyButton.click();

    }
    public void validateRegisterNyTimes(){
        Set<String> handleValues = driver.getWindowHandles();
        for (String h : handleValues) {
            String title = driver.switchTo().window(h).getTitle();
            System.out.println(title);
            if (title.equals("New York Times Free Access for Students")){
                System.out.println("Thank you for visiting NY Times Website");
                driver.close();
            }
        }

    }
    /**
     * Test Case 8: "Validate My verizon Tab"
     * 1)Navigate to "https://www.verizonWireless.com"
     * 2)Click on "Inhome Page" tab
     * 3)Click on "My Verizon" tab
     * 4)Confirm that "Sign In" is displayed
     * 5)Close Browser
     */
    public void clickMyVerizonTab(){
        navigateToInHomePage();
        myVerizonTab.click();

    }
    public void validateClickMyVerizonTab(){

        boolean isSignInDisplayed= signInText.isDisplayed();
        Assert.assertEquals(isSignInDisplayed,true,"Element sis no displayed");

    }
    /**
     * Test Case 9: "Validate Support Tab"
     * 1)Navigate to "https://www.verizonWireless.com"
     * 2)Click on "Inhome Page" tab
     * 3)Click on "Support" tab
     * 4)Confirm that "Sign In" is displayed
     * 5)Close Browser
     */
    public void clickSupportTab() throws InterruptedException {
        navigateToInHomePage();
        supportTab.click();
        sleepFor(3);
        System.out.println("title is "+getCurrentPageTitle());

    }
    public void validateClickSupportTab(){
        String actualTitle= driver.getTitle();
        String expectedTitle="TV, Phone, Internet, Billing & Account - Customer Service | Verizon support.";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }

    /**
     * Test Case 10: "Watch TV Tab"
     * 1)Navigate to "https://www.verizonWireless.com"
     * 2)Click on "Inhome Page" tab
     * 3)Click on "Watch TV" tab
     * 4)Get the title page
     * 5)Close Browser
     */
    public void clickWatchTvTab()  {
        navigateToInHomePage();
        watchTvTab.click();
        System.out.println("Title is "+getCurrentPageTitle());

    }
    public void validateClickWatchTvTab(){
        String actualTitle= driver.getTitle();
        String expectedTitle="Verizon Fios TV";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }
    /**
     * Test Case 11: " Change the language to Spanish"
     * 1)Navigate to "https://www.verizonWireless.com"
     * 2)Click on "Inhome Page" tab
     * 3)Change language to Spanish
     * 4)get the page title
     * 5)navigate back using mouse
     * 6)Close browser
     */
    public void changePageLanguage() throws InterruptedException {
        navigateToInHomePage();
        spanishLanguage.click();
        sleepFor(3);

//        Actions act= new Actions(driver);
//        act.sendKeys(Keys.ALT,Keys.ARROW_LEFT).build().perform();
        System.out.println("Title is"+getCurrentPageTitle());

    }
    public void validateChangePageTitle(){
        String actualTitle=getCurrentPageTitle();
        String expectedTitle="Verizon: servicios de Internet, TV y teléfono | Sitio oficial";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");

    }

    /**
     * Test Case 12: "Count SignIn button options"
     * 1)Navigate to "https://www.verizonWireless.com"
     * 2)Click on "Inhome Page" tab
     * 3)Click on SignIn button
     * 4)count number of options
     * 5)print options
     * 6)Close browser
     * @return
     */
    public int countSignInButtonOption(){
        navigateToInHomePage();
        mouseHover(signInButton);
        List<WebElement> menu= driver.findElement(By.xpath("//*[@id=\"gh-accessebility\"]/div[1]/div[2]/div/div[2]/div/div[2]/ul")).findElements(By.tagName("a"));
        List<WebElement> vlinks = menu.stream().filter(WebElement::isDisplayed).collect(Collectors.toList());
        int signInButtonOptions=vlinks.size();
        System.out.println("The total number of visible links on the page are :" + signInButtonOptions);

//        for (WebElement link : vlinks) {
//           String url = link.getAttribute("href");
//           // String url=link.getText();
//            System.out.println(url);
//        }
        return signInButtonOptions;
    }

    public void validateCountSignInButtonOption(){
        List<WebElement> menu= driver.findElement(By.xpath("//*[@id=\"gh-accessebility\"]/div[1]/div[2]/div/div[2]/div/div[2]/ul")).findElements(By.tagName("a"));
        List<WebElement> vlinks = menu.stream().filter(WebElement::isDisplayed).collect(Collectors.toList());
        int actualCount=vlinks.size();
        int expectedCount=3;
        Assert.assertEquals(actualCount,expectedCount,"Count does not match");

    }
    /**
     * Test case 13: "Validate Contact us link "
     * 1)Navigate to "https://www.verizonWireless.com"
     * 2)Click on "Inhome Page" tab
     * 3)Scroll down the page
     * 4)click on "Contact us"
     * 5)Get the title
     */

    public String clickContactUsLink() throws InterruptedException {
        navigateToInHomePage();
        sleepFor(3);
        String title= getCurrentPageTitle();
        System.out.println("Title is : "+title);
        contactUs.click();
        sleepFor(3);
        String title2= getCurrentPageTitle();
        System.out.println("Title is : "+title2);

        return title;
    }
    public void validateClickContactUsLink() throws InterruptedException {
        String actualTitle=getCurrentPageTitle();
        String expectedTitle="Verizon Customer Service - Contact Us | Verizon Help Center and Support | Verizon";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }
    /**
     * Test case 14: "Validate "Follow sub links"
     * 1)Navigate to "https://www.verizonWireless.com"
     * 2)Click on "Inhome Page" tab
     * 3)Scroll down the page
     * 4)open all sub links in new tabs
     * 5)Count links
     * 6)Close browser
     */
    public int countSocialMediaTabs(){
        navigateToInHomePage();
        WebElement iconLinks=driver.findElement(By.xpath(WebElementSocialMediaTabs));
        int linksNumber=iconLinks.findElements(By.tagName("a")).size();
        System.out.println(linksNumber);
        for (int i=0; i<linksNumber;i++)
        {
            String openTabs= Keys.chord(Keys.CONTROL,Keys.ENTER);
            iconLinks.findElements(By.tagName("a")).get(i).sendKeys(openTabs);
        }

        return linksNumber;
    }

    public void validateCountSocialMediaLinks(){
        WebElement iconLinks=driver.findElement(By.xpath(WebElementSocialMediaTabs));
        int actualCount=iconLinks.findElements(By.tagName("a")).size();
        int expectedCount=3;
        Assert.assertEquals(actualCount,expectedCount,"Count does not match");
    }
    /**
     * Test case 15:" validate My fios app"
     * 1)Navigate to "https://www.verizonWireless.com"
     * 2)Click on "Inhome Page" tab
     * 3)Scroll down the page
     * 4)Click "My Fios Account App"
     * 5)Verify google play store logo is displayed
     * 5)Close browser
     */
    public boolean verifyMyFiosApp(){
        navigateToInHomePage();
        myFiosAppLink.click();
        waitUntilVisible(By.xpath(WebElementGooglePlayLogo));
        boolean isLogoDisplayed=googlePlayLogo.isDisplayed();
        return isLogoDisplayed;
    }
    public void validateMyFiosAppLink(){
        boolean isLogoDisplayed=googlePlayLogo.isDisplayed();
        Assert.assertEquals(isLogoDisplayed,true,"Item is not displayed");
    }

    /**
     * Test case 16:" validate Terms&Conditions"
     * 1)Navigate to "https://www.verizonWireless.com"
     * 2)Click on "Inhome Page" tab
     * 3)Scroll down the page
     * 4)Click "Terms&Conditions"
     * 5)Verify Terms&Conditions text is displayed
     * 5)Close browser
     */
    public boolean verifyTermsAndConditionsLink(){
        navigateToInHomePage();
        termsAndConditionsLink.click();
        boolean isTextDisplayed=termsAndConditionsText.isDisplayed();
        return isTextDisplayed;
    }
    public void validateTermsAndConditionsLink(){
        boolean isLogoDisplayed=termsAndConditionsText.isDisplayed();
        Assert.assertEquals(isLogoDisplayed,true,"Item is not displayed");
    }

    /**
     * Test Case 17:
     * 1)Navigate to "https://www.verizonWireless.com"
     * 2)Click on "Inhome Page" tab
     * 3)Click "search by state" button
     * 4)get page title
     * 5)close browser
     * @return
     * @throws InterruptedException
     */


    public String clickSearchByStateLink() throws InterruptedException {
        navigateToInHomePage();
        searchByStateLink.click();
        sleepFor(3);
        String title= getCurrentPageTitle();
        System.out.println("Title is : "+title);
        return title;
    }
    public void validateClickSearchByStateLink() throws InterruptedException {
        String actualTitle=getCurrentPageTitle();
        String expectedTitle="Fios Store Locator | Fios TV, Fios Internet and Phone | Verizon";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }

    /**
     *  Test Case 18: "Validate Home page logo is displayed"
     * 1)Navigate to "https://www.verizonWireless.com"
     * 2)Click on "Inhome Page" tab
     * 3)Verify if home page logo is displayed
     */
    public void validateHomePageLogo(){
        navigateToInHomePage();
        boolean isHomePageLogoDisplayed=homePageLogo.isDisplayed();
        Assert.assertEquals(isHomePageLogoDisplayed,true,"Home Page Logo is not displayed");

    }
    /**
     * Test case 19: "Test "Locate" Button
     * 1)Navigate to "https://www.verizonWireless.com"
     * 2)Click on "Inhome Page" tab
     * 3)Click on "Locate" button
     * 4)Get page title
     * 5)close browser
     * @return
     * @throws InterruptedException
     */
    public String validateLocateCompass() throws InterruptedException {
        navigateToInHomePage();
        locateCompass.click();
        sleepFor(3);
        String actualTitle=getCurrentPageTitle();
        String expectedTitle="In Home Product Qualification";
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
        return actualTitle;
    }
    /**
     * Test Case 20:" Print footer section link"
     * 1)Navigate to "https://www.verizonWireless.com"
     * 2)Click on "Inhome Page" tab
     * 3)Print 1 st link of the list
     * 4)Validate link
     * 5)Close browser
     */
    public void printFooterSectionLinks(){
        navigateToInHomePage();
        List<WebElement> menu= footerSectionLinks.findElements(By.tagName("a"));
        System.out.println(menu.size());
        List<WebElement> vlinks = menu.stream().filter(WebElement::isDisplayed).collect(Collectors.toList());
        System.out.println("The total number of visible links on the page are :" + vlinks.size());
        String actualLinks=vlinks.get(1).getAttribute("href");
        String expectedLink="https://www.verizon.com/about/";
        Assert.assertEquals(actualLinks,expectedLink,"Link does not match");


    }




}
