package TestsCases;

import PageObjects.LoginPage;
import PageObjects.WorklistsPage;
import Utills.AppConfig;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WorklistSearchbyABN extends BaseTest {

    @Test
    public void searchInputABNSimpleCO(){
        LoginPage loginPage = new LoginPage(driver);
        WorklistsPage worklistsPage = loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        worklistsPage.searchForSimpleCO();
        String valueSimpleCO = worklistsPage.getValueSimpleCo();
        Assert.assertTrue(valueSimpleCO.contains(AppConfig.ABNvalidsearch1));

        }

    @Test
    public void searchInputABNLtGame(){
        LoginPage loginPage = new LoginPage(driver);
        WorklistsPage worklistsPage = loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        worklistsPage.searchForLtgame();
        String valueLtGame = worklistsPage.getValueLtGame();
        Assert.assertTrue(valueLtGame.contains(AppConfig.ABNvalidsearch2));
        worklistsPage.clearSearch();
    }
    @Test
    public void searchInputJohnsonFamily(){
        LoginPage loginPage = new LoginPage(driver);
        WorklistsPage worklistsPage = loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        worklistsPage.searchForJohnsonFamily();
        String valueJohnsonFamily = worklistsPage.getValueJohnson();
        Assert.assertTrue(valueJohnsonFamily.contains(AppConfig.ABNvalidsearch3));
        worklistsPage.clearSearch();
    }

}
