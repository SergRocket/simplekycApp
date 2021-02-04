package PageObjects;

import Utills.AppConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(className = "panel-body")
    private WebElement credentialsInput;
    @FindBy(name = "email")
    private WebElement emailnput;
    @FindBy(name = "password")
    private WebElement passwordInput;
    @FindBy(xpath = "//button[@class='btn btn-success']")
    private WebElement loginButton;
    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElement error;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public  boolean  afterLoginPageisOpen(){
        waitForElementToBeVisible(credentialsInput);
        return credentialsInput.isDisplayed();
     }

    public WorklistsPage login(String password, String username){
        emailnput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
        return new WorklistsPage(driver);
    }
    public boolean afterLoginUrl (){
        boolean currentUrl = driver.getCurrentUrl().contains(AppConfig.expectedUrlAfterLogin);
        return currentUrl;
    }

    public String checkErrorMessage(){
        waitForElementToBeVisible(error);
        return error.getText();
    }

}
