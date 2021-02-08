package TestsCases;

import PageObjects.LoginPage;
import PageObjects.WorklistsPage;
import Utills.AppConfig;
import org.testng.annotations.Test;

public class PaginationViewAndPerPageTests extends BaseTest {
    @Test(testName = "Tests to check if user can switch between pages", groups = "positive")
    public void paginationTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(AppConfig.validPassword, AppConfig.validUsername);

        WorklistsPage worklistsPage = new WorklistsPage(driver);
        worklistsPage.paginationClick();
    }

    @Test(testName = "Tests to check if user can ajust quantity of the companyes", groups = "positive")
    public void viewPerPage() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(AppConfig.validPassword, AppConfig.validUsername);

        WorklistsPage worklistsPage = new WorklistsPage(driver);
        worklistsPage.numberperPage(2);
        worklistsPage.getSelectedValueinPerPage();

        System.out.print(worklistsPage.getSelectedValueinPerPage() + " is the selected quantity per page ");
        System.out.print(worklistsPage.getcompanyPerPageQuantity() + " the actual company quantity shown");
    }
}
