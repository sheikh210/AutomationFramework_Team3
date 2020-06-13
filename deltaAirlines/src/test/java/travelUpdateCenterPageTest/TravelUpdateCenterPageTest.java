package travelUpdateCenterPageTest;

import commonAPI.WebAPI;
import org.openqa.selenium.support.PageFactory;

import travelUpdateCenterPage.TravelUpdateCenterPage;

public class TravelUpdateCenterPageTest extends WebAPI {

    static TravelUpdateCenterPage travelUpdateCenterPage;

    public static void getInItElement(){
        travelUpdateCenterPage = PageFactory.initElements(driver,TravelUpdateCenterPage.class);
    }



}
