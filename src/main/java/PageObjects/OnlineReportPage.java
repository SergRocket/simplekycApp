package PageObjects;

import Utills.AppConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;

public class OnlineReportPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"right-report\"]/div[1]")
    private WebElement reportBody;
    @FindBy(id = "simple-co-pty-ltd-cn-114944820-")
    private WebElement reportHeader;
    @FindBy(id = "next-button")
    private WebElement downloadReport;
    public OnlineReportPage(WebDriver driver) {
        super(driver);
    }

    public boolean onlineReport(){
        waitForElementToBeVisible(reportBody);
        waitForElementToBeVisible(reportHeader);
        waitForElementToBeVisible(downloadReport);
        boolean report = reportBody.isDisplayed();
        return report;
    }

    public void downloadReport(){
        waitForElementToBeVisible(downloadReport);
        downloadReport.click();
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