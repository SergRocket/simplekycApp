package TestsCases;

import PageObjects.LoginPage;
import PageObjects.WorklistsPage;
import Utills.AppConfig;
import Utills.FileDownloader;
import jdk.internal.net.http.ResponseBodyHandlers;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DownloadReport extends BaseTest {
    @Test
    public void downloadReport(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        WorklistsPage worklistsPage = new WorklistsPage(driver);
        FileDownloader filedownloader = new FileDownloader(driver);
        //filedownloader.setURL(worklistsPage.getLinkToReport());
        //filedownloader.downloadReport();
        //int httpStatus = filedownloader.getHttpStatus();
        //Assert.assertEquals(httpStatus, 200);
        }
}
