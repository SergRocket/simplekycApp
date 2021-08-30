package PageObjects;

import Utills.AppConfig;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;

public class OnlineReportPage extends BasePage {
    @FindBy(xpath = "//*[@id='Report-S-BFUQ1AzM-S']")
    private WebElement reportButton;
    @FindBy(xpath = "//*[@id='documents-list']/tr[2]/td[3]/a")
    private WebElement reportList;
    @FindBy(xpath = "//*[@id='app_filter']")
    private WebElement search;
    @FindBy(xpath = "//*[@id='documents-list']/tr[2]/td[3]/a")
    private WebElement downloadReport;
    public OnlineReportPage(WebDriver driver) {
        super(driver);
    }

    public boolean onlineReport(){
        waitForElementToBeVisible(reportButton);
        boolean report = reportButton.isDisplayed();
        return report;
    }

    public void searchRequest() throws InterruptedException {
        waitForElementToBeVisible(search);
        search.click();
        Thread.sleep(3000);
        search.sendKeys(AppConfig.lookingFor);
        }

    public void downloadReport(){
        waitForElementToBeVisible(reportButton);
        reportButton.click();
    }
    public boolean isdownloadedReport() throws InterruptedException {
        final int SLEEP_TIME_MILLIS = 1000;
        String fileName = "Main Report - SIMPLE CO PTY LTD  (4).pdf";
        File file = new File(AppConfig.filePath);
        final int timeout = 6000* SLEEP_TIME_MILLIS;
        int timeElapsed = 0;
        while (timeElapsed<timeout){
            if (file.exists()) {
                System.out.println(fileName + " is present");
                return true;
            } else {
                timeElapsed +=SLEEP_TIME_MILLIS;
                Thread.sleep(3000);
            }
        }
        return false;
    }
}
