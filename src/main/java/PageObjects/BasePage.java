package PageObjects;

import Utills.AppConfig;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    protected WebDriverWait wait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(AppConfig.TIMEOUT));
        PageFactory.initElements(driver, this);
    }

    protected void waitForElementToBeVisible(WebElement element, int timeOut){
        WebDriverWait configWait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        configWait.until(ExpectedConditions.visibilityOf(element));
    }

    protected void waitForElementToBeVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

   protected WebElement findElement(WebElement element) {
        return element;
    }

    protected void selectCompanyFilters(WebElement element) {
        waitForElementToBeVisible(element);
        element.click();
    }

    protected void disselectCompanyFilters(WebElement element) {
        waitForElementToBeVisible(element);
        element.click();
    }

    protected void elementClick(WebElement element) {
        try {
            waitForElementToBeVisible(element);
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
        }
        element.click();
    }
}
