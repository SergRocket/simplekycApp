package TestsCases;

import PageObjects.IdReportPage;
import PageObjects.LoginPage;
import PageObjects.ViewTreePage;
import PageObjects.WorklistsPage;
import Utills.AppConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

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
        //Assert.assertTrue(idReportPage.idReportVisible());
        idReportPage.closeIdReport();
    }
}
