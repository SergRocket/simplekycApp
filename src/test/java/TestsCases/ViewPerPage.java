package TestsCases;

import PageObjects.LoginPage;
import PageObjects.WorklistsPage;
import Utills.AppConfig;
import org.testng.annotations.Test;

public class ViewPerPage extends BaseTest {
    @Test
    public void viewPerPage(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        WorklistsPage worklistsPage = new WorklistsPage(driver);
        worklistsPage.numberperPage(2);
        worklistsPage.getSelectedValueinPerPage();
        System.out.print(worklistsPage.getSelectedValueinPerPage()+ " is the selected quantity per page ");
        System.out.print( worklistsPage.getcompanyPerPageQuantity() + " the actual company quantity shown");
        }
}
