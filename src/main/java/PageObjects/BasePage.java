package PageObjects;

import Utills.AppConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(AppConfig.TIMEOUT));
        PageFactory.initElements(driver, this);
    }
    protected void waitForElementToBeVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected void waitForElementToBePresent(WebElement element){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("verification-screening-modal")));
    }
    public void clickElement(WebElement element){
        waitForElementToBeVisible(element);
        clickElement(element);
    }
    public void openFirstUrl (){
        driver.get(AppConfig.startUrl);
    }

    protected WebElement findElement(WebElement element){
        return element;
    }

    protected List<WebElement> findAll(By checkbox){
        return driver.findElements(checkbox);
    }



}
