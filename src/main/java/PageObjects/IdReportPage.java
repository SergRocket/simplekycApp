package PageObjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IdReportPage extends BasePage {
    @FindBy(xpath = "//*[@id='c_vue_fullName0']/div/div[1]/div/button/div")
    private WebElement nameOfIndividual;
    @FindBy(css = "#modal-v2-close")
    private WebElement closereportButton;
    @FindBy(css= "#verification-screening-modal")
    private WebElement idReport;

    public IdReportPage(WebDriver driver) {
        super(driver);
    }

    public boolean idReportVisible() {
        try {
            waitForElementToBeVisible(idReport);
            if (idReport.isDisplayed()) {
                System.out.print("The element is visible");
            }
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
            return false;
        }
        return idReport.isDisplayed();
    }

    public void closeIdReport() {
        elementClick(closereportButton);
    }

    public String checkIndividualsName() {
        try {
            waitForElementToBeVisible(nameOfIndividual);
            if (nameOfIndividual.isDisplayed()) {
                System.out.print("The element is visible");
            }
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
        }
        return nameOfIndividual.getText();
    }
}
