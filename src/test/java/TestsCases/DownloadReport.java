package TestsCases;

import PageObjects.LoginPage;
import PageObjects.WorklistsPage;
import Utills.AppConfig;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class DownloadReport extends BaseTest {
    @Test
    public void DownloadReport() throws IOException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        WorklistsPage worklistsPage = new WorklistsPage(driver);
        worklistsPage.downLoadReport();
        worklistsPage.validationForDownloadRequest();
        Assert.assertEquals(HttpStatus.SC_OK, HttpStatus.SC_OK);
        }
}

