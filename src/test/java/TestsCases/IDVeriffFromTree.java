package TestsCases;

import PageObjects.IdReportPage;
import PageObjects.LoginPage;
import PageObjects.ViewTreePage;
import PageObjects.WorklistsPage;
import Utills.AppConfig;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IDVeriffFromTree extends BaseTest {
    @Test
    public void idVerification(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        WorklistsPage worklistsPage = new WorklistsPage(driver);
        ViewTreePage viewTreePage = worklistsPage.clickOnTreeButton();
        IdReportPage idReportPage = viewTreePage.startIdVerif();
        String individualName = idReportPage.checkIndividualsName();
        Assert.assertTrue(individualName.contains(AppConfig.ExpectedIndividualName));
        Assert.assertTrue(idReportPage.idReportVisible());
        idReportPage.closeIdReport();
    }
}
