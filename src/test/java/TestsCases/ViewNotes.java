package TestsCases;

import PageObjects.AlertPage;
import PageObjects.LoginPage;
import PageObjects.WorklistsPage;
import Utills.AppConfig;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ViewNotes extends BaseTest {

    @Test
    public void viewNotes(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        WorklistsPage worklistsPage = new WorklistsPage(driver);
        AlertPage alertPage = worklistsPage.openNotes();
        Assert.assertTrue(alertPage.checkVisibilityofElements());
      }
}
