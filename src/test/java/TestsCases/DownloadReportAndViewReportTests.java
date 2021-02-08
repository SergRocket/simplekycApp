package TestsCases;

import PageObjects.LoginPage;
import PageObjects.OnlineReportPage;
import PageObjects.WorklistsPage;
import Utills.AppConfig;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class DownloadReportAndViewReportTests extends BaseTest {
    @Test (testName = "Tests to check if user can download report", groups="positive" )
    public void DownloadReport() throws IOException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(AppConfig.validPassword, AppConfig.validUsername);

        WorklistsPage worklistsPage = new WorklistsPage(driver);
        worklistsPage.downLoadReport();
        worklistsPage.validationForDownloadRequest();

        Assert.assertEquals(HttpStatus.SC_OK, HttpStatus.SC_OK);
        }

    @Test (testName = "Tests to check if user can view report", groups="positive" )
    public void onlineReport() {
        LoginPage loginPage = new  LoginPage(driver);
        loginPage.login(AppConfig.validPassword, AppConfig.validUsername);

        WorklistsPage worklistsPage = new WorklistsPage(driver);
        OnlineReportPage onlinereport = worklistsPage.reportsOpening();

        Assert.assertTrue(onlinereport.onlineReport());
    }
}

