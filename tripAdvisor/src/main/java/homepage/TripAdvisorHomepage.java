package homepage;

import commonAPI.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import static homepage.TripAdvisoryHomepageElements.*;


public class TripAdvisorHomepage extends WebAPI {
  //test case 1
  @FindBy(how = How.CSS, using = webElementHotelMenu)
  public WebElement hotelMenu;
  @FindBy(css = webElementSearchBox1)
  public WebElement searchBox1;
  @FindBy(css = webElementSearchBox1Alt)
  public WebElement searchBox1Alt;
  @FindBy(how = How.CSS, using = webElementSearchBox2)
  public WebElement searchBox2;
  @FindBy(how = How.CSS, using = webElementsSearchingText)
  public WebElement searchingText;


//test case 2
  @FindBy(how = How.XPATH,using = webElementSearchBoxTwo)
  public WebElement searchBoxTwo;
  @FindBy(xpath = webElementSelectText)
  public  WebElement selectText;

//test case 3
  @FindBy(how = How.XPATH,using = webElementsRestaurantMenu)
  public WebElement restaurantMenu;









//test case 1
  public void doSearchingText() {
    hotelMenu.click();

    WebDriverWait wait = new WebDriverWait(driver, 10);

    if (searchBox1Alt.isDisplayed()){
      wait.until(ExpectedConditions.elementToBeClickable(searchBox1Alt));
      searchBox1Alt.sendKeys("South Africa Hotels");
      searchBox1Alt.sendKeys(Keys.ENTER);
    } else if (searchBox1.isDisplayed()){
      wait.until(ExpectedConditions.elementToBeClickable(searchBox1));
      searchBox1.click();

      wait.until(ExpectedConditions.elementToBeClickable(searchBox2));
      searchBox2.sendKeys("South Africa Hotels");
      searchBox2.sendKeys(Keys.ENTER);
    }
  }
  public void validateDoSearchingText() {
    String actualText = searchingText.getText();
    Assert.assertEquals(actualText, "South Africa Hotels");
  }

//test case 2
  public void doSearchElement() throws InterruptedException {
    searchBoxTwo.click();
    searchBoxTwo.sendKeys("aj");
    Thread.sleep(3000);
  }

  public void validateDoSearchElement() {
    String actualText = selectText.getText();
    Assert.assertEquals(actualText, "ajmer ajmer district");

  }
  //test case 3
  public void doSearchTitle(){
    restaurantMenu.click();
  }
  public void validateDoSearchTitle(){
    String actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle,webElementsTitle);

  }




  }

