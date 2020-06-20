package providersPageTest;
import commonAPI.WebAPI;
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
    @Test(priority = 5)
    public void testExploreAetnaMenu() throws IOException {
        getInItElements();
        Assert.assertTrue(aetnaProvidersPage.exploreAetnaMenu());
    }
    @Test(priority = 6)
    public void testCountClaimsProvidersSubmenuItems() throws IOException {
        getInItElements();
        Assert.assertTrue(aetnaProvidersPage.countClaimsProvidersSubmenuItems());
    }
    @Test(priority = 7)
    public void testGetTextClaimsProvidersSubmenuItems() throws IOException {
        getInItElements();
        Assert.assertTrue(aetnaProvidersPage.getTextClaimsProvidersSubmenuItems());
    }
    @Test(priority = 8)
    public void testPlayVideo() throws InterruptedException {
        getInItElements();
        aetnaProvidersPage.playVideo();
    }
    @Test(priority = 9)
    public void testViewTranscript() throws IOException {
        getInItElements();
        Assert.assertTrue(aetnaProvidersPage.viewTranscript());
    }
    @Test(priority = 10)
    public void testValidateCoronaVirusFactLink() throws IOException {
        getInItElements();
        Assert.assertTrue(aetnaProvidersPage.validateCoronaVirusFactLink());

    }
    @Test(priority = 11)
    public void testCountQuickLinks() throws IOException {
        getInItElements();
        Assert.assertTrue(aetnaProvidersPage.countQuickLinks());
    }
    @Test(priority = 12)
    public void testValidateQuickLinks() throws IOException, InterruptedException {
        getInItElements();
        Assert.assertTrue(aetnaProvidersPage.validateQuickLinks());
    }
    @Test(priority = 13)
    public void testValidateNewsLetterLink() throws IOException {
        getInItElements();
        Assert.assertTrue(aetnaProvidersPage.validateNewsLetterLink());
    }
    @Test(priority = 14)
    public void testValidateExploreHealthCareResourceLink() throws IOException {
        getInItElements();
        Assert.assertTrue(aetnaProvidersPage.validateExploreHealthCareResourceLink());
    }
    @Test(priority = 15)
    public void testCountHelpfulLinks() throws IOException {
        getInItElements();
        Assert.assertTrue(aetnaProvidersPage.countHelpfulLinks());
    }
    @Test(priority = 16)
    public void testPrintHelpfulLinks() throws IOException, InterruptedException {
        getInItElements();
        Assert.assertTrue(aetnaProvidersPage.printHelpfulLinks());
    }
    @Test(priority = 17)
    public void testCountFooterSectionLinks() throws IOException, InterruptedException {
        getInItElements();
        Assert.assertTrue(aetnaProvidersPage.countFooterSectionLinks());
    }
    @Test(priority = 18)
    public void testPrintFooterSectionItems() throws IOException, InterruptedException {
        getInItElements();
        Assert.assertTrue(aetnaProvidersPage.printFooterSectionItems());
    }
    @Test(priority = 19)
    public void testIsInstagramIconDisplayed() throws IOException, InterruptedException {
        getInItElements();
        Assert.assertTrue(aetnaProvidersPage.isInsIconDisplayed());
    }
    @Test(priority = 20)
    public void testIsFacebookIconDisplayed() throws IOException, InterruptedException {
        getInItElements();
        Assert.assertTrue(aetnaProvidersPage.isFacebookIconDisplayed());
    }



}
