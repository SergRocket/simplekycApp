package TestsCases;

import PageObjects.LoginPage;
import Utills.AppConfig;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLogin extends BaseTest {

    @Test
    public void negativeLogInTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(AppConfig.invalidPassword, AppConfig.invalidUsername);
        String errorMessage = loginPage.checkErrorMessage();
        Assert.assertTrue(errorMessage.contains(AppConfig.errorMessage));
    }
}
