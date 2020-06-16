package aetnaHealthResourceTest;

import commonAPI.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import aetnaHealthResource.AetnaHealthResource;

public class AetnaHealthResourceTest extends WebAPI{

static AetnaHealthResource aetnaHealthResource;
public static void getInItElements(){
    aetnaHealthResource = PageFactory.initElements(driver, AetnaHealthResource.class);
    }

    @Test (enabled = false)
    public static void testHealthResourcePageUrl (){
    getInItElements();
    String actualUrl= aetnaHealthResource.validateHealthResourcePageUrl();
    Assert.assertEquals(actualUrl,"https://www.aetnacareers.com/");
    }
    @Test (enabled = false)
    public static void testHealthResourcePageTitle (){
        getInItElements();
        String actualTitle= aetnaHealthResource.validateHealthResourcePageTitle();
        Assert.assertEquals(actualTitle,"Working at Aetna, a CVS Health Company | Jobs and Careers at Aetna");
    }
    @Test (enabled = false)
    public static void testHealthResourceLinkNumber() {
        getInItElements();
        aetnaHealthResource.validateHealthResourceLinkNumber();
    }
    @Test (enabled = false)
    public static void testFindOutPageUrlTwo() throws Exception {
    getInItElements();
    aetnaHealthResource.findOutPageUrlTwo();
    aetnaHealthResource.validatePageUrlTwo();
    }
    @Test
    public static void testSupportMenu() throws Exception {
    getInItElements();
    aetnaHealthResource.validatePageUrlThree();
    }


}
