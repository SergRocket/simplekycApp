package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewTreePage extends BasePage {
    @FindBy(xpath = "//*[@id='treeNavbar']/div[2]")
    private WebElement treeNavBar;
    @FindBy(id = "draggable")
    private WebElement controlTreePanel;
    @FindBy(id = "mainTree")
    private WebElement maintree;
    @FindBy(xpath = "//*[@id='get_id_ID-0']")
    private WebElement idbutton;
    @FindBy(xpath = "//*[@id='verify-bo-greenid-AU-1449']")
    private WebElement runIdVerifButton;


    public ViewTreePage(WebDriver driver) {
        super(driver);
    }

    public boolean isViewTreeNavBarVisible(){
        waitForElementToBeVisible(treeNavBar);
        boolean navBar = treeNavBar.isDisplayed();
        return navBar;
    }
    public boolean isControlPanelTreeView(){
        waitForElementToBeVisible(controlTreePanel);
        boolean contrPanel = controlTreePanel.isDisplayed();
        return contrPanel;
    }
    public boolean ismainTreeVisible(){
        waitForElementToBeVisible(maintree);
        boolean mainTree = maintree.isDisplayed();
        return mainTree;
    }
    public IdReportPage startIdVerif(){
        waitForElementToBeVisible(idbutton);
        idbutton.click();
        waitForElementToBeVisible(runIdVerifButton);
        runIdVerifButton.click();
        return new IdReportPage(driver);
    }

}
