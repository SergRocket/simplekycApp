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
        worklistsPage.activateAssociationFilter();
        String selecteAssosiationdValue = worklistsPage.activateAssociationFilter();
        System.out.print("The first selected value is " + selecteAssosiationdValue);
        worklistsPage.disselectAssociationFilter();

        worklistsPage.activateCopmFilter();
        String selectedCompanyValue = worklistsPage.activateCopmFilter();
        System.out.println("The second selected value is " + selectedCompanyValue);
        worklistsPage.disselectCopmFilter();

        worklistsPage.activatForeinerFilter();
        String selectedForeignCompany = worklistsPage.activatForeinerFilter();
        System.out.println("The second selected value is " + selectedForeignCompany);
        worklistsPage.disselectForeiFilter();

        worklistsPage.disselectGovFilter();
        String selectedGovCompany = worklistsPage.activateGovFilter();
        System.out.println("The second selected value is " + selectedGovCompany);
        worklistsPage.disselectGovFilter();

        worklistsPage.disselectPartnerFilter();
        String selectedPartnershipCompany = worklistsPage.activatePertnerFilter();
        System.out.println("The second selected value is "+ selectedPartnershipCompany);
        worklistsPage.disselectPartnerFilter();

        worklistsPage.activateSoleFilter();
        String selectedSoleTrCompany = worklistsPage.activateSoleFilter();
        System.out.println("The second selected value is "+ selectedSoleTrCompany);
        worklistsPage.disselectSoleFilter();

        worklistsPage.activateTrustFilter();
        String selectedTrustCompany = worklistsPage.activateTrustFilter();
        System.out.println("The second selected value is "+ selectedTrustCompany);
        worklistsPage.disselectTrustFilter();
        worklistsPage.disablefilters();
        }
}
