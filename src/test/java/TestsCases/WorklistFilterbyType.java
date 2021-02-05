package TestsCases;

import PageObjects.LoginPage;
import PageObjects.WorklistsPage;
import Utills.AppConfig;
import org.testng.annotations.Test;

public class WorklistFilterbyType extends BaseTest {
    @Test
    public void filterByType(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        WorklistsPage worklistsPage = new WorklistsPage(driver);
        worklistsPage.enebleFilters();
        worklistsPage.selectAssociationFilter();
        String selectedValue = worklistsPage.selectAssociationFilter();
        System.out.print("The first selected value is " + selectedValue);
        worklistsPage.disselectAssociationFilter();
        worklistsPage.selectCompanyFilter();
        String selectedValue2 = worklistsPage.selectCompanyFilter();
        System.out.print("The second selected value is " + selectedValue2);
        worklistsPage.disselectCompanyFilter();

        //System.out.print(worklistsPage.get);
    }
}
