package TestsCases;

import PageObjects.LoginPage;
import PageObjects.WorklistsPage;
import Utills.AppConfig;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WorklistFiltersAndSerchByTests extends BaseTest {
    @Test (testName = "Tests to check if user can filter companyes by all types", groups="positive")
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

    @Test (testName = "Tests to check if user can search company by first ABN value", groups="positive")
    public void searchInputABNSimpleCO(){
        LoginPage loginPage = new LoginPage(driver);
        WorklistsPage worklistsPage = loginPage.login(AppConfig.validPassword, AppConfig.validUsername);

        worklistsPage.searchForSimpleCO();
        String valueSimpleCO = worklistsPage.getValueSimpleCo();

        Assert.assertTrue(valueSimpleCO.contains(AppConfig.ABNvalidsearch1));

    }

    @Test(testName = "Tests to check if user can search company by second ABN value", groups="positive")
    public void searchInputABNLtGame(){
        LoginPage loginPage = new LoginPage(driver);
        WorklistsPage worklistsPage = loginPage.login(AppConfig.validPassword, AppConfig.validUsername);

        worklistsPage.searchForLtgame();
        String valueLtGame = worklistsPage.getValueLtGame();

        Assert.assertTrue(valueLtGame.contains(AppConfig.ABNvalidsearch2));

        worklistsPage.clearSearch();
    }

    @Test(testName = "Tests to check if user can search company by third ABN value", groups="positive")
    public void searchInputJohnsonFamily(){
        LoginPage loginPage = new LoginPage(driver);
        WorklistsPage worklistsPage = loginPage.login(AppConfig.validPassword, AppConfig.validUsername);

        worklistsPage.searchForJohnsonFamily();
        String valueJohnsonFamily = worklistsPage.getValueJohnson();

        Assert.assertTrue(valueJohnsonFamily.contains(AppConfig.ABNvalidsearch3));

        worklistsPage.clearSearch();
    }

    @Test(testName = "Tests to check if user can search company by first ACN value", groups="positive")
    public void searchInputACNSimpleCO(){
        LoginPage loginPage = new LoginPage(driver);
        WorklistsPage worklistsPage = loginPage.login(AppConfig.validPassword, AppConfig.validUsername);

        worklistsPage.searchForSimpleCoACN();
        String valueSimpleCO = worklistsPage.getValueSimpleCoACN();

        Assert.assertTrue(valueSimpleCO.contains(AppConfig.ACNvalidsearch1));

    }

    @Test(testName = "Tests to check if user can search company by second ACN value", groups="positive")
    public void searchInputACNLtGame(){
        LoginPage loginPage = new LoginPage(driver);
        WorklistsPage worklistsPage = loginPage.login(AppConfig.validPassword, AppConfig.validUsername);

        worklistsPage.searchForLtGameACN();
        String valueLtGame = worklistsPage.getValueltGameACN();

        Assert.assertTrue(valueLtGame.contains(AppConfig.ACNvalidsearch2));

        worklistsPage.clearSearch();
    }

    @Test(testName = "Tests to check if user can search company by third ACN value", groups="positive")
    public void searchInputACNSimpleKyc(){
        LoginPage loginPage = new LoginPage(driver);
        WorklistsPage worklistsPage = loginPage.login(AppConfig.validPassword, AppConfig.validUsername);

        worklistsPage.searchForPolusACN();
        String valueJohnsonFamily = worklistsPage.getValuepolusACN();

        Assert.assertTrue(valueJohnsonFamily.contains(AppConfig.ACNvalidsearch3));

        worklistsPage.clearSearch();
    }
}
