package TestsCases;

import PageObjects.LoginPage;
import PageObjects.WorklistsPage;
import Utills.AppConfig;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidLogin extends BaseTest {
   @Test
    public void validLogin(){
       LoginPage loginPage = new LoginPage(driver);
       loginPage.openFirstUrl();
       WorklistsPage reportsPage = loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
       Assert.assertTrue(reportsPage.isUrlandCompanyLogoVisible());
       }
}
