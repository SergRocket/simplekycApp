package TestsCases;

import PageObjects.LoginPage;
import PageObjects.WorklistsPage;
import Utills.AppConfig;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WorklistFiltersAndSerchByTests extends BaseTest {
    @Test (testName = "Tests to check if user can search company by first ABN value", groups="positive")
    public void searchInputABNSimpleCO(){
        LoginPage loginPage = new LoginPage(driver);
        WorklistsPage worklistsPage = loginPage.login(AppConfig.validPassword, AppConfig.validUsername);

        worklistsPage.searchForSimpleCO();
        String valueSimpleCO = worklistsPage.getValueSimpleCo();

        Assert.assertTrue(valueSimpleCO.contains(AppConfig.ABNvalidSearchResults));

    }

    @Test(testName = "Tests to check if user can search company by first ACN value", groups="positive")
    public void searchInputACNSimpleCO(){
        LoginPage loginPage = new LoginPage(driver);
        WorklistsPage worklistsPage = loginPage.login(AppConfig.validPassword, AppConfig.validUsername);

        worklistsPage.searchForSimpleCoACN();
        String valueSimpleCO = worklistsPage.getValueSimpleCoACN();

        Assert.assertTrue(valueSimpleCO.contains(AppConfig.ACNvalidSearchResults));


    }
}
