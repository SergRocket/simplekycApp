package TestsCases;

import PageObjects.LoginPage;
import PageObjects.OnlineReportPage;
import Utills.AppConfig;
import org.testng.annotations.Test;

public class DownloadReport extends BaseTest {
    @Test
    public void downloadReport() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        OnlineReportPage onlineReportPage = new OnlineReportPage(driver);
        onlineReportPage.onlineReport();
        onlineReportPage.searchRequest();
        onlineReportPage.downloadReport();
        onlineReportPage.isdownloadedReport();
    }
}
