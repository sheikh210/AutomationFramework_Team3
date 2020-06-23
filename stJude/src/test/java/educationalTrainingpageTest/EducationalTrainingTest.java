package educationalTrainingpageTest;

import commonAPI.WebAPI;
import org.testng.Assert;
import educationalTrainingpage.EducationalTrainingpage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class EducationalTrainingTest extends WebAPI{

   static EducationalTrainingpage educationalTrainingpage;
    public static void getInItElements(){ educationalTrainingpage = PageFactory.initElements(driver, EducationalTrainingpage.class); }


    @Test(priority = 0)
    public static void testEducationTrainingpage() throws Exception {
        getInItElements();
        Assert.assertTrue(educationalTrainingpage.validateEducationAndTrainingpage());
    }
    @Test(priority = 1)
    public static void testAdvancedTrainingSize() throws Exception {
    getInItElements();
    Assert.assertTrue(educationalTrainingpage.getAdvancedTrainingNum());
}
    @Test(priority = 2)
    public static void testAdvancedTrainingList() throws Exception {
        getInItElements();
        Assert.assertTrue(educationalTrainingpage.getAdvancedTrainingText());
    }
    @Test(priority = 3)
    public static void testAdvancedTrainingURLS() throws Exception {
        getInItElements();
        Assert.assertTrue(educationalTrainingpage.getAdvancedTrainingURLS());
    }
    @Test(priority = 4)
    public static void testPredoctoralTrainingSize() throws Exception {
    getInItElements();
    Assert.assertTrue(educationalTrainingpage.getPredoctoralTrainingNum());
}
    @Test(priority = 5)
    public static void testPredoctoralTrainingText() throws Exception {
        getInItElements();
        Assert.assertTrue(educationalTrainingpage.getPredoctoralTrainingText());
    }
    @Test(priority = 6)
    public static void testPredoctoralTrainingURLS() throws Exception {
        getInItElements();
        Assert.assertTrue(educationalTrainingpage.getPredoctoralTrainingURLS());
    }
    @Test(priority = 7)
    public static void testStJudesGlobalLearnMoreButton() throws Exception {
        getInItElements();
        Assert.assertTrue(educationalTrainingpage.getStJudesGlobal());
    }
    @Test(priority = 8)
    public static void testOnlineResourcesButton() throws Exception {
        getInItElements();
        Assert.assertTrue(educationalTrainingpage.getOnlineResources());
    }
    @Test(priority = 9)
    public static void testCareerAtStJudeButton() throws Exception {
        getInItElements();
        Assert.assertTrue(educationalTrainingpage.getCareerAtStJudes());
    }
    @Test(priority = 10)
    public static void testExploreTheGradSchoolButton() throws Exception {
        getInItElements();
        Assert.assertTrue(educationalTrainingpage.getExploreTheGradSchoolButton());
    }
    @Test(priority = 11)
    public static void testSignUpButton() throws Exception {
        getInItElements();
        Assert.assertTrue(educationalTrainingpage.getSignUpButton());
    }
    @Test(priority = 12)
    public static void testContactWithUsButton() throws Exception {
        getInItElements();
        Assert.assertTrue(educationalTrainingpage.getContactWithUsButton());
    }
    @Test(priority = 13)
    public static void testFacebookButton() throws Exception {
        getInItElements();
        Assert.assertTrue(educationalTrainingpage.getFacebookButton());
    }
    @Test(priority = 14)
    public static void testTwitterButton() throws Exception {
        getInItElements();
        Assert.assertTrue(educationalTrainingpage.getTwitterButton());
    }
    @Test(priority = 15)
    public static void testInstagramButton() throws Exception {
        getInItElements();
        Assert.assertTrue(educationalTrainingpage.getInstagramButton());
    }
    @Test(priority = 16)
    public static void testYoutubeButton() throws Exception {
        getInItElements();
        Assert.assertTrue(educationalTrainingpage.getYoutubeButton());
    }
    @Test(priority = 17)
    public static void testCareersButton() throws Exception {
        getInItElements();
        Assert.assertTrue(educationalTrainingpage.getCareersButton());
    }
    @Test(priority = 18)
    public static void testMediaResourcesButton() throws Exception {
        getInItElements();
        Assert.assertTrue(educationalTrainingpage.getMediaResourcesButton());
    }
    @Test(priority = 19)
    public static void testVisitUsButton() throws Exception {
        getInItElements();
        Assert.assertTrue(educationalTrainingpage.getVisitUsButton());
    }




}
