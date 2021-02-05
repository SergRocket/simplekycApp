package TestsCases;

import PageObjects.LoginPage;
import Utills.AppConfig;
import org.testng.annotations.Test;

public class DownloadReport extends BaseTest {
    @Test
    public void downloadReport(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(AppConfig.validPassword, AppConfig.validUsername);


    }
}
