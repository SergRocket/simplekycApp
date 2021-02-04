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
        loginPage.openFirstUrl();
        WorklistsPage reportsPage = loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        reportsPage.logout();
        Assert.assertTrue(loginPage.afterLoginPageisOpen());
        }
}
