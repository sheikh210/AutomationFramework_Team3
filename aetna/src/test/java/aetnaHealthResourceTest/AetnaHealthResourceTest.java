package aetnaHealthResourceTest;

import commonAPI.WebAPI;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import aetnaHealthResource.AetnaHealthResource;

import static aetnaHealthResource.AetnaHealthResource.*;

public class AetnaHealthResourceTest extends WebAPI{

static AetnaHealthResource aetnaHealthResource;
public static void getInItElements(){
    aetnaHealthResource = PageFactory.initElements(driver, AetnaHealthResource.class);
    }
    //2
    @Test (enabled = false)
    public static void testHealthResourcePageUrl (){
    getInItElements();
    String actualUrl= aetnaHealthResource.validateHealthResourcePageUrl();
    Assert.assertEquals(actualUrl,"https://www.aetnacareers.com/");
    }
    //3
    @Test (enabled = false)
    public static void testHealthResourcePageTitle (){
        getInItElements();
        String actualTitle= aetnaHealthResource.validateHealthResourcePageTitle();
        Assert.assertEquals(actualTitle,"Working at Aetna, a CVS Health Company | Jobs and Careers at Aetna");
    }
    //4
    @Test (enabled = false)
    public static void testHealthResourceLinkNumber() {
        getInItElements();
        aetnaHealthResource.validateHealthResourceLinkNumber();
    }
    //5
    @Test (enabled = false)
    public static void testFindOutPageUrlTwo() throws Exception {
    getInItElements();
    aetnaHealthResource.findOutPageUrlTwo();
    aetnaHealthResource.validatePageUrlTwo();
    }
    //6
    @Test(enabled = false)
    public static void testPageUrlThree() {
    getInItElements();
    aetnaHealthResource.validatePageUrlThree();
    }
    //7
    @Test(enabled = false)
    public void testDoSearchDropDownExploreAetnaSite(){
    getInItElements();
    aetnaHealthResource.doSearchDropDownExploreAetnaSite();
    aetnaHealthResource.validateDoAetnaDotCom();
    }
    //8
    @Test(enabled = false)
    public void testDoSearchExploreButton(){
        getInItElements();
        aetnaHealthResource.doSearchExploreButton();
        aetnaHealthResource.validateDoProvidersMenu();
    }
    //9
    @Test(enabled = false)
    public void testDoSearchElementMemberSupportTwo(){
        getInItElements();
        aetnaHealthResource.doSearchElementMemberSupportTwo();
        aetnaHealthResource.validateDoElementsManagingHealth();
    }
    //10
    @Test(enabled = false)
    public void testDoMoveBackward(){
    getInItElements();
    aetnaHealthResource.validateDoMoveBackward();
    }
   //11
    @Test(enabled = false)
    public static void testReturnToAetnaHealthResource(){
    getInItElements();
    aetnaHealthResource.validateReturnToAetnaHealthResource();
    }
    //12
    @Test(enabled = false)
    public static void testHealthResourceIdNumber() {
        getInItElements();
        aetnaHealthResource.validateHealthResourceIdNumber();
    }
    //13
    @Test (enabled = false)
    public static void testNavigateToAetnaHealthResourceOwner(){
    getInItElements();
    String actualURL = aetnaHealthResource.validateNavigateToAetnaHealthResourceOwner();
    String expectedURL = "https://www.aetnacareers.com/";
    Assert.assertEquals(actualURL,expectedURL,"NAVIGATE TO OWNER PAGE");
    }
    //14
    @Test
    public static void testLink(){
    getInItElements();
    aetnaHealthResource.validateLink("null");
    }
    //15
    @Test
    public static void testNursingIsDisplayed(){
    getInItElements();
    boolean actualElementIsDisplayed = aetnaHealthResource.validateNursingIsDisplayed();
    Assert.assertEquals(actualElementIsDisplayed,true);
    }




}
