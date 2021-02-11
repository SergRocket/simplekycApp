package PageObjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnlineReportPage extends BasePage {
    @FindBy(css = "#right-report > div.col-md-9.col-xs-9.canvas")
    private WebElement reportBody;
    @FindBy(css = "h2[class='label-company-name']")
    private WebElement reportHeader;
    @FindBy(css = "#next-button")
    private WebElement downloadReport;
    public OnlineReportPage(WebDriver driver) {
        super(driver);
    }

    public boolean onlineReport(){
        try {
            waitForElementToBeVisible(reportBody);
            if(reportBody.isDisplayed()){
                return true;
            }
        } catch (NoSuchElementException n){
            System.out.print("The element is not visible");
            } try {
            waitForElementToBeVisible(reportHeader);
            waitForElementToBeVisible(downloadReport);
        } catch (NoSuchElementException n){
            System.out.print("The elements is not visible");
        }
        return reportBody.isDisplayed();
    }

}
