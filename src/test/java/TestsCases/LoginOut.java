package TestsCases;

import PageObjects.LoginPage;
import PageObjects.WorklistsPage;
import Utills.AppConfig;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginOut extends BaseTest {

    @Test
    public void loginOut(){
        LoginPage loginPage = new  LoginPage(driver);
        WorklistsPage worklistsPage = loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        worklistsPage.logout();
        Assert.assertTrue(loginPage.afterLoginPageisOpen());

        }
}
