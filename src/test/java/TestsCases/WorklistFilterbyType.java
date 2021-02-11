package TestsCases;

import PageObjects.LoginPage;
import PageObjects.WorklistsPage;
import Utills.AppConfig;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WorklistFilterbyType extends BaseTest {
    @Test(testName = "Tests to check filter Association ", groups = "positive")
    public void filterByTypeAssociation() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        WorklistsPage worklistsPage = new WorklistsPage(driver);
        worklistsPage.enebleFilters();
        worklistsPage.activateAssociationFilter();
        String filteredCompanyType = worklistsPage.getFilteredbyFirstCompanyType();
        System.out.print("The first selected value is " + filteredCompanyType);
        Assert.assertTrue(filteredCompanyType.equals(AppConfig.companyTypeFirstFilter));
        }

    @Test(testName = "Tests to check filter Company", groups = "positive")
    public void filterByTypeCompany() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        WorklistsPage worklistsPage = new WorklistsPage(driver);
        worklistsPage.enebleFilters();
        worklistsPage.activateCompanyFilter();
        String selectedCompanyValue = worklistsPage.getFilteredbySecondCompanytype();
        System.out.println("The second selected value is " + selectedCompanyValue);
        Assert.assertTrue(selectedCompanyValue.equals(AppConfig.companyTypeSecondFilter));
        }

    @Test(testName = "Tests to check filter Foreign Company", groups = "positive")
    public void filterByTypeForeignCompany() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        WorklistsPage worklistsPage = new WorklistsPage(driver);
        worklistsPage.enebleFilters();
        worklistsPage.activateForeignFilter();
        String filteredCompanyType = worklistsPage.getFilteredbyThirdCompanyType();
        System.out.print("The first selected value is " + filteredCompanyType);
        Assert.assertTrue(filteredCompanyType.contains(AppConfig.companyTypeThirdFilter));
        }

    @Test(testName = "Tests to check filter Govermant body", groups = "positive")
    public void filterByTypeGovermentBody() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        WorklistsPage worklistsPage = new WorklistsPage(driver);
        worklistsPage.enebleFilters();
        worklistsPage.activateGovernFilter();
        String filteredCompanyType = worklistsPage.getFilteredbyForthCompanyType();
        System.out.print("The first selected value is " + filteredCompanyType);
        Assert.assertTrue(filteredCompanyType.equals(AppConfig.companyTypeForthFilter));
        }

    @Test(testName = "Tests to check filter Partnership", groups = "positive")
    public void filterByTypePartnership() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        WorklistsPage worklistsPage = new WorklistsPage(driver);
        worklistsPage.enebleFilters();
        worklistsPage.activatePernershipFilter();
        String filteredCompanyType = worklistsPage.getFilteredbyifthCompanyType();
        System.out.print("The first selected value is " + filteredCompanyType);
        Assert.assertTrue(filteredCompanyType.equals(AppConfig.companyTypeFifthFilter));
        }

    @Test(testName = "Tests to check filter Sole Trader", groups = "positive")
    public void filterByTypeSoleTrader() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        WorklistsPage worklistsPage = new WorklistsPage(driver);
        worklistsPage.enebleFilters();
        worklistsPage.activateSoleTrFilter();
        String filteredCompanyType = worklistsPage.getFilteredbySixthCompanyType();
        System.out.print("The first selected value is " + filteredCompanyType);
        Assert.assertTrue(filteredCompanyType.equals(AppConfig.companyTypeSixthFilter));
        }

    @Test(testName = "Tests to check filter Trust", groups = "positive")
    public void filterByTypeTrust() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        WorklistsPage worklistsPage = new WorklistsPage(driver);
        worklistsPage.enebleFilters();
        worklistsPage.activTrustFilter();
        String filteredCompanyType = worklistsPage.getFilteredbySeventhCompanyType();
        System.out.print("The first selected value is " + filteredCompanyType);
        Assert.assertTrue(filteredCompanyType.equals(AppConfig.companyTypeSeventhFilter));
        }
}
