package TestsCases;

import PageObjects.LoginPage;
import PageObjects.WorklistsPage;
import Utills.AppConfig;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WorklistSearchbyACN extends BaseTest {
    @Test
    public void searchInputACNSimpleCO(){
        LoginPage loginPage = new LoginPage(driver);
        WorklistsPage worklistsPage = loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        worklistsPage.searchForSimpleCoACN();
        String valueSimpleCO = worklistsPage.getValueSimpleCoACN();
        Assert.assertTrue(valueSimpleCO.contains(AppConfig.ACNvalidsearch1));

    }

    @Test
    public void searchInputACNLtGame(){
        LoginPage loginPage = new LoginPage(driver);
        WorklistsPage worklistsPage = loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        worklistsPage.searchForLtGameACN();
        String valueLtGame = worklistsPage.getValueltGameACN();
        Assert.assertTrue(valueLtGame.contains(AppConfig.ACNvalidsearch2));
        worklistsPage.clearSearch();
    }
    @Test
    public void searchInputACNSimpleKyc(){
        LoginPage loginPage = new LoginPage(driver);
        WorklistsPage worklistsPage = loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        worklistsPage.searchForPolusACN();
        String valueJohnsonFamily = worklistsPage.getValuepolusACN();
        Assert.assertTrue(valueJohnsonFamily.contains(AppConfig.ACNvalidsearch3));
        worklistsPage.clearSearch();
    }
}
