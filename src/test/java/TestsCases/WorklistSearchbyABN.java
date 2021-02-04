package TestsCases;

import PageObjects.LoginPage;
import Utills.AppConfig;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WorklistSearchbyABN extends BaseTest {

    @Test(dataProvider = "data_provider")
    public void searchInputABN(int no, String fileName){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(AppConfig.validPassword, AppConfig.validUsername);


        Assert.assertTrue(filesNames.contains(fileName), "Our file " +fileName+ " is not one thet is uploaded");

    }
}
