package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IdReportPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"c_vue_fullName0\"]/div/div[1]/div/button/div")
    private WebElement nameOfIndividual;
    @FindBy(xpath = "//*[@id=\"modal-v2-close\"]")
    private WebElement closereportButton;
    @FindBy(xpath = "//*[@id=\"verification-screening-modal\"]")
    private WebElement idReport;
    public IdReportPage(WebDriver driver) {
        super(driver);
    }

    public boolean idReportVisible (){
        waitForElementToBeVisible(idReport);
        boolean idReportisVisible = idReport.isDisplayed();
        return idReportisVisible;
    }

    public void closeIdReport(){
        waitForElementToBeVisible(closereportButton);
        closereportButton.click();
    }

    public String checkIndividualsName(){
        waitForElementToBeVisible(nameOfIndividual);
        return nameOfIndividual.getText();
    }
}
