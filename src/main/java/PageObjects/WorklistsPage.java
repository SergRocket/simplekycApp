package PageObjects;

import Utills.AppConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorklistsPage extends BasePage {
    @FindBy(className = "navbar-brand")
    private WebElement brandImage;
    @FindBy(className = "padding-container")
    private WebElement spreadsheetWithCompaneys;
    @FindBy(className = "grey-119")
    private WebElement accountMenu;
    @FindBy(xpath = "//span[@class='glyphicon glyphicon-log-out icon-general med-grey']")
    private WebElement logoutButton;
    @FindBy(id = "app_filter")
    private WebElement filter;
    public WorklistsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isUrlandCompanyLogoVisible(){
        return brandImage.isDisplayed() && spreadsheetWithCompaneys.isDisplayed();
    }

    public void logout(){
        waitForElementToBeVisible(accountMenu);
        accountMenu.click();
        waitForElementToBeVisible(logoutButton);
        logoutButton.click();
     }


}

