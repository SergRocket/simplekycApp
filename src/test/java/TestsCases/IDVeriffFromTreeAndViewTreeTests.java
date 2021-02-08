package TestsCases;

import PageObjects.IdReportPage;
import PageObjects.LoginPage;
import PageObjects.ViewTreePage;
import PageObjects.WorklistsPage;
import Utills.AppConfig;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IDVeriffFromTreeAndViewTreeTests extends BaseTest {
    @Test (testName = "Tests to check if user can copplete Id verification", groups="positive" )
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

    @Test (testName = "Tests to check if user can view tree structure", groups="positive")
    public void viewTree(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(AppConfig.validPassword, AppConfig.validUsername);

        WorklistsPage worklistsPage = new WorklistsPage(driver);
        ViewTreePage viewTreePage = worklistsPage.clickOnTreeButton();

        Assert.assertTrue(viewTreePage.isControlPanelTreeView());
        Assert.assertTrue(viewTreePage.ismainTreeVisible());
        Assert.assertTrue(viewTreePage.isViewTreeNavBarVisible());
    }
}
