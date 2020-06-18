package patientReferralsTest;

import commonAPI.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import patientReferrals.StJudePatientReferralsPage;
import utilities.DataReader;

import java.io.IOException;
import java.util.PrimitiveIterator;

public class StJudePatientReferralsTest extends WebAPI {
    static StJudePatientReferralsPage stJudePatientReferralsPage;
    static DataReader dataReader = new DataReader();
    static String path=System.getProperty("user.dir") + "StJudePatientReferralsExpectedElements.xlsx";

    public static void getInItElement() {
        stJudePatientReferralsPage = PageFactory.initElements(driver, StJudePatientReferralsPage.class);
    }
//    @Test(priority = 1)
//    public void testValidatePatientReferralTitle(){
//        getInItElement();
//        String actualTitle= stJudePatientReferralsPage.validatePatientReferralTitle();
//        String expectedTitle="Patient Referrals - St. Jude Children’s Research Hospital";
//        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
//
//    }
//    @Test(priority = 2)
//    public void testValidateContactUsLink() throws IOException {
//        getInItElement();
//        Assert.assertTrue(stJudePatientReferralsPage.validateContactUsLink());
//    }
//    @Test(priority = 3)
//    public void testValidateSpanishLanguage() throws IOException {
//        getInItElement();
//        Assert.assertTrue(stJudePatientReferralsPage.validateSpanishLanguage());
//    }
//    @Test(priority = 4)
//    public void testValidateDonateNowLink() throws IOException {
//        getInItElement();
//        Assert.assertTrue(stJudePatientReferralsPage.validateDonateNowLink());
//    }
//    @Test(priority = 5)
//    public void testCountAboutUsLinks() throws IOException {
//        getInItElement();
//        Assert.assertTrue(stJudePatientReferralsPage.countAboutUsLinks());
//}
    @Test(priority = 6)
    public void testSearchHematology() throws IOException {
        getInItElement();
        Assert.assertTrue(stJudePatientReferralsPage.searchHematology());
    }


}
