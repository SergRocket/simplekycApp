package TestsCases;

import PageObjects.LoginPage;
import PageObjects.WorklistsPage;
import Utills.AppConfig;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test(testName = "Tests to check if user can login with valid credentials", groups="positive")
    public void validLogin(){
        LoginPage loginPage = new LoginPage(driver);
        WorklistsPage worklistsPage = loginPage.login(AppConfig.validPassword, AppConfig.validUsername);

        Assert.assertTrue(worklistsPage.isUrlandCompanyLogoVisible());
    }

    @Test(testName = "Tests to check if user can loginout with valid credentials", groups="positive")
    public void loginOut(){
        LoginPage loginPage = new  LoginPage(driver);
        WorklistsPage worklistsPage = loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        worklistsPage.logout();

        Assert.assertTrue(loginPage.afterLoginPageisOpen());
    }

    @Test(testName = "Tests to check if user can not login with invalid credentials", groups="negative")
    public void invalidLogIn(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(AppConfig.invalidPassword, AppConfig.invalidUsername);
        String errorMessage = loginPage.checkErrorMessage();

        Assert.assertTrue(errorMessage.contains(AppConfig.errorMessage));
    }
}
