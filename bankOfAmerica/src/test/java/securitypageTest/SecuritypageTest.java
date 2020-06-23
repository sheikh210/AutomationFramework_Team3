package securitypageTest;

import commonAPI.WebAPI;
import org.testng.Assert;
import securitypage.Securitypage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SecuritypageTest  extends WebAPI{

    static Securitypage securitypage;
    public static void getInItElements(){ securitypage = PageFactory.initElements(driver, Securitypage.class); }



}
