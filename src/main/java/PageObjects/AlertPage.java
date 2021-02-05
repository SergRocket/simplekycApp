package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage { //*[@id="notes-response"]/div[1]/div/div[1]
    @FindBy(xpath = "//div[@data-placeholder='Add a comment']")
    private WebElement commentField;
    @FindBy(xpath = "//button[@data-dismiss='modal']")
    private WebElement closeModalWin;
    @FindBy(xpath = "//button[@data-dismiss='modal']")
    private WebElement closeButtonModal;
    @FindBy(xpath = "//li[@data-sort-key='newest']")
    private WebElement newestComments;
    @FindBy(xpath = "//li[@data-sort-key='oldest']")
    private WebElement oldestComments;
    @FindBy(xpath = "//*[@id=\"modal-notes\"]/div[2]/div")
    private WebElement modalPopUp;
    public AlertPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkVisibilityofElements(){
        waitForElementToBeVisible(modalPopUp);
       boolean alertElementVisible = modalPopUp.isDisplayed();
       return alertElementVisible;
    }

}
