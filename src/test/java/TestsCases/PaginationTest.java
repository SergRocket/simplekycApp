package TestsCases;

import PageObjects.LoginPage;
import PageObjects.WorklistsPage;
import Utills.AppConfig;
import org.testng.annotations.Test;

public class PaginationTest extends BaseTest {
    @Test
    public void paginationTest(){
        LoginPage loginPage = new  LoginPage(driver);
        loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        WorklistsPage worklistsPage = new  WorklistsPage(driver);
        worklistsPage.paginationClick();
       }
}
