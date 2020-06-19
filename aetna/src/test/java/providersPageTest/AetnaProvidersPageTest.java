package providersPageTest;
import commonAPI.WebAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import providersPage.AetnaProvidersPage;

import java.io.IOException;

public class AetnaProvidersPageTest extends WebAPI {
    static AetnaProvidersPage aetnaProvidersPage;

    public static void getInItElements(){
        aetnaProvidersPage = PageFactory.initElements(driver, AetnaProvidersPage.class);
    }
    @Test (priority = 1)
    public void testValidateProvidersPageTitle() throws IOException {
        getInItElements();
        Assert.assertTrue(aetnaProvidersPage.validateProvidersPageTitle());
    }
    @Test(priority = 2)
    public void testValidateContactUsButton() throws IOException {
        getInItElements();
        Assert.assertTrue(aetnaProvidersPage.validateContactUsButton());
    }
    @Test(priority = 3)
    public void testChangeLanguageToSpanish() throws IOException {
        getInItElements();
        Assert.assertTrue(aetnaProvidersPage.changeLanguageToSpanish());
    }
    @Test(priority = 4)
    public void testSearchHsa(){
        getInItElements();
        Assert.assertTrue(aetnaProvidersPage.searchHsa());
    }


}
