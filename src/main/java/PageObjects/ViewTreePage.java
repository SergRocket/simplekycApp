package PageObjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewTreePage extends BasePage {
    @FindBy(css = "#mainTree")
    private WebElement treeNavBar;
    @FindBy(css = "#draggable")
    private WebElement controlTreePanel;
    @FindBy(css = "#mainTree")
    private WebElement maintree;
    @FindBy(css = "#get_id_ID-0 > span")
    private WebElement idbutton;
    @FindBy(css = "button[data-ubo-dbid='1449']")
    private WebElement runIdVerifButton;


    public ViewTreePage(WebDriver driver) {
        super(driver);
    }

    public boolean isViewTreeNavBarVisible() {
        try {
            waitForElementToBeVisible(treeNavBar);
            if (treeNavBar.isDisplayed()) {
                return true;
            }
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
        }
        return treeNavBar.isDisplayed();
    }

    public boolean isControlPanelTreeView() {
        try {
            waitForElementToBeVisible(controlTreePanel);
            if (controlTreePanel.isDisplayed()) {
                return true;
            }
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
        }
        return controlTreePanel.isDisplayed();
    }

    public boolean ismainTreeVisible() {
        try {
            waitForElementToBeVisible(maintree);
            if (maintree.isDisplayed()) {
                return true;
            }
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
        }
        return maintree.isDisplayed();
    }

    public void startIdVerif() {
        elementClick(idbutton);
        elementClick(runIdVerifButton);
        }
}
