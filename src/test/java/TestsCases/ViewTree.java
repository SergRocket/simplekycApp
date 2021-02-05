package TestsCases;

import PageObjects.LoginPage;
import PageObjects.ViewTreePage;
import PageObjects.WorklistsPage;
import Utills.AppConfig;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ViewTree extends BaseTest {
    @Test
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
