package TestsCases;

import PageObjects.LoginPage;
import PageObjects.OnlineReportPage;
import PageObjects.WorklistsPage;
import Utills.AppConfig;
import org.testng.Assert;
import org.testng.annotations.Test;

      public class OnlineReport extends BaseTest {
          @Test
          public void onlineReport() throws InterruptedException {
              LoginPage loginPage = new  LoginPage(driver);
              loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
              WorklistsPage worklistsPage = new WorklistsPage(driver);
              OnlineReportPage onlinereport = worklistsPage.reportsOpening();
              onlinereport.downloadReport();
              Assert.assertTrue(onlinereport.isdownloadedReport());
              Assert.assertTrue(onlinereport.onlineReport());
              }

}
