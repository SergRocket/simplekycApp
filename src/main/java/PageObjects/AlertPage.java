package PageObjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage {
    @FindBy(css = "div[class='textarea']")
    private WebElement commentField;
    @FindBy(css = "button[class='close']")
    private WebElement closeModalWin;
    @FindBy(css = "button[class*='btn-default']")
    private WebElement closeButtonModal;
    @FindBy(css = "li[data-sort-key='newest']")
    private WebElement newestComments;
    @FindBy(css = "li[data-sort-key='oldest']")
    private WebElement oldestComments;
    @FindBy(css = "div[id='notes-response']")
    private WebElement modalPopUp;
    public AlertPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkVisibilityofElements(){
        try {
            waitForElementToBeVisible(modalPopUp);
            if(modalPopUp.isDisplayed()){
                System.out.print("The element is visible");
                return true;
            }
        } catch (NoSuchElementException n){
            System.out.print("The element is not shown");
            }
        return modalPopUp.isDisplayed();
    }
}
