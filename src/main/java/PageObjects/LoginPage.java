package PageObjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(css = "form[role='form']")
    private WebElement credentialsInput;
    @FindBy(css = "input[name='email']")
    private WebElement emailnput;
    @FindBy(css = "input[name='password']")
    private WebElement passwordInput;
    @FindBy(css = "button[type='submit']")
    private WebElement loginButton;
    @FindBy(css = "div[class='alert alert-danger']")
    private WebElement error;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public  boolean  afterLoginPageisOpen(){
        try {
            waitForElementToBeVisible(credentialsInput);
            if(credentialsInput.isDisplayed()){
                return true;
            }
        } catch (NoSuchElementException n){
            System.out.print("The element is not visible");
            }
        return credentialsInput.isDisplayed();
     }

    public WorklistsPage login(String password, String username){
        emailnput.sendKeys(username);
        passwordInput.sendKeys(password);
        elementClick(loginButton);
        return new WorklistsPage(driver);
    }

    public String checkErrorMessage(){
        try {
            waitForElementToBeVisible(error);
        } catch (NoSuchElementException n){
            System.out.print("The element is not visible");
        }
        return error.getText();
    }
}
