package PageObjects;

import Utills.AppConfig;
import java.nio.file.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WorklistsPage extends BasePage {
    @FindBy(className = "navbar-brand")
    private WebElement brandImage;
    @FindBy(id = "thead-not-filter")
    private WebElement spreadsheetWithCompaneys;
    @FindBy(id = "worklist-table")
    private WebElement spreadsheetBody;
    @FindBy(className = "grey-119")
    private WebElement accountMenu;
    @FindBy(xpath = "//span[@class='glyphicon glyphicon-log-out icon-general med-grey']")
    private WebElement logoutButton;
    @FindBy(id = "app_filter")
    private WebElement filter;
    @FindBy(id = "Name-S-BFUQwAzM-S")
    private WebElement simpleCovalue;
    @FindBy(id = "Name-S-BFUQ3kjM-S")
    private WebElement ltGamevalue;
    @FindBy(id = "Name-S-BFUQ1MTM-S")
    private WebElement johnsonvalue;
    @FindBy(css = "#filter-keyword > button")
    private WebElement getRemoveSearchQuery ;
    @FindBy(id = "Name-S-BFUQyUjM-S")
    private WebElement polusValue;
    @FindBy(id = "filter-enable")
    private WebElement enebleFilter;
    @FindBy(xpath = "//button[@class='multiselect dropdown-toggle btn btn-default']")
    private WebElement filterButton;
    @FindBy(xpath = "//input[@value='association']")
    private WebElement associationFilter;
    @FindBy(xpath = "//input[@value='company']")
    private WebElement companyFilter;
    @FindBy(xpath = "//input[@value='foreignerentity']")  //*[@id="filter-enable"]/span[1]
    private WebElement foreignerFilter;
    @FindBy(xpath = "//input[@value='government body']")
    private WebElement govermentFilter;
    @FindBy(xpath = "//input[@value='partnership']")
    private WebElement partnershipFilter;
    @FindBy(xpath = "//input[@value='sole trader']")
    private WebElement soleTraderFilter;
    @FindBy(xpath = "//input[@value='trust']")
    private WebElement trustFilter;
    @FindBy(xpath = "//*[@id=\"filter-enable\"]/span[1]")
    private WebElement disableFilters;
    @FindBy(xpath = "//*[@id=\"filter-keyword\"]/button")
    private WebElement removeSearchQuery;
    @FindBy(xpath = "//*[@id=\"thead-filter\"]/th[5]/span/div/ul")
    private WebElement filterContainer;
    @FindBy(xpath = "//span[@title='View More Options']")
    private WebElement moreButton;
    @FindBy(id = "application-tools-popover-S-BFUQxAzM-S")
    private WebElement viewNotesButton;
    @FindBy(id = "previous-usr-page")
    private WebElement paginationLeftClick;
    @FindBy(id = "next-usr-page")
    private WebElement paginationRightClick;
    @FindBy(id = "current-usr-page")
    private WebElement currentPaginationPage;
    @FindBy(xpath = "//lable[@class='checkbox']")
    private WebElement allcheckboxes;
    @FindBy(id = "Tree-S-BFUQxAzM-S")
    private WebElement tree;
    @FindBy(xpath = "//*[@id='reports-popover']/div[2]/button")
    private WebElement downloadALLReportsButton;
    @FindBy(xpath = "//*[@id=\"ReportsList-S-BFUQxAzM-S\"]")
    private WebElement onlineReport;
    @FindBy(id = "popover40257")
    private WebElement reportsWindow;
    @FindBy(id = "documents-list")
    private WebElement documentList;
    @FindBy(xpath = "//*[@id='documents-list']/tr[1]/td[3]/a")
    private WebElement downloadSpecificReport;
    @FindBy(xpath = "//*[@id='ReportsList-S-BFUQxAzM-S']")
    private WebElement reportsButton;
    @FindBy(id = "select-number-lines")
    private WebElement companyPerPage;
    @FindBy(xpath = "//tr[@role='row']")
    private WebElement companyRowInfo;
    @FindBy(xpath = "//*[@id=\"ET-S-BFUQ4kjM-S\"]")
    private WebElement valueForFilteringinRow;

    public WorklistsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isUrlandCompanyLogoVisible() {
        return brandImage.isDisplayed() && spreadsheetWithCompaneys.isDisplayed();
    }

    public void logout() {
        waitForElementToBeVisible(accountMenu);
        accountMenu.click();
        waitForElementToBeVisible(logoutButton);
        logoutButton.click();
    }

    public String getValueSimpleCo() {
        waitForElementToBeVisible(simpleCovalue);
        waitForElementToBeVisible(spreadsheetBody);
        waitForElementToBeVisible(spreadsheetWithCompaneys);
        String vaueABN = find(simpleCovalue).getText();
        return vaueABN;
    }

    public String getValueLtGame() {
        waitForElementToBeVisible(ltGamevalue);
        waitForElementToBeVisible(spreadsheetBody);
        waitForElementToBeVisible(spreadsheetWithCompaneys);
        String vaueABN = find(ltGamevalue).getText();
        return vaueABN;
    }

    public String getValueJohnson() {
        waitForElementToBeVisible(johnsonvalue);
        waitForElementToBeVisible(spreadsheetBody);
        waitForElementToBeVisible(spreadsheetWithCompaneys);
        String vaueABN = find(johnsonvalue).getText();
        return vaueABN;
    }

    protected WebElement find(WebElement element) {
        return element;
    }

    public void searchForSimpleCO() {
        waitForElementToBeVisible(filter);
        waitForElementToBeVisible(spreadsheetWithCompaneys);
        filter.sendKeys(AppConfig.ABNvalidsearch1);
        waitForElementToBeVisible(spreadsheetBody);
    }

    public void searchForLtgame() {
        waitForElementToBeVisible(filter);
        waitForElementToBeVisible(spreadsheetWithCompaneys);
        filter.sendKeys(AppConfig.ABNvalidsearch2);
        waitForElementToBeVisible(spreadsheetBody);
    }

    public void searchForJohnsonFamily() {
        waitForElementToBeVisible(filter);
        waitForElementToBeVisible(spreadsheetWithCompaneys);
        filter.sendKeys(AppConfig.ABNvalidsearch3);
        waitForElementToBeVisible(spreadsheetBody);
    }

    public void clearSearch() {
        waitForElementToBeVisible(spreadsheetWithCompaneys);
        removeSearchQuery.click();
        waitForElementToBeVisible(spreadsheetBody);
    }

    public void searchForSimpleCoACN() {
        waitForElementToBeVisible(filter);
        waitForElementToBeVisible(spreadsheetWithCompaneys);
        filter.sendKeys(AppConfig.ACNvalidsearch1);
        waitForElementToBeVisible(spreadsheetBody);
    }

    public void searchForLtGameACN() {
        waitForElementToBeVisible(filter);
        waitForElementToBeVisible(spreadsheetWithCompaneys);
        filter.sendKeys(AppConfig.ACNvalidsearch2);
        waitForElementToBeVisible(spreadsheetBody);
    }

    public void searchForPolusACN() {
        waitForElementToBeVisible(filter);
        waitForElementToBeVisible(spreadsheetWithCompaneys);
        filter.sendKeys(AppConfig.ACNvalidsearch3);
        waitForElementToBeVisible(spreadsheetBody);
    }

    public String getValueSimpleCoACN() {
        waitForElementToBeVisible(simpleCovalue);
        waitForElementToBeVisible(spreadsheetBody);
        waitForElementToBeVisible(spreadsheetWithCompaneys);
        String vaueABN = find(johnsonvalue).getText();
        return vaueABN;
    }

    public String getValuepolusACN() {
        waitForElementToBeVisible(polusValue);
        waitForElementToBeVisible(spreadsheetBody);
        waitForElementToBeVisible(spreadsheetWithCompaneys);
        String vaueABN = find(johnsonvalue).getText();
        return vaueABN;
    }

    public String getValueltGameACN() {
        waitForElementToBeVisible(ltGamevalue);
        waitForElementToBeVisible(spreadsheetBody);
        waitForElementToBeVisible(spreadsheetWithCompaneys);
        String vaueABN = find(johnsonvalue).getText();
        return vaueABN;
    }

    public void enebleFilters(){
        waitForElementToBeVisible(enebleFilter);
        enebleFilter.click();
        waitForElementToBeVisible(filterButton);
        filterButton.click();
        waitForElementToBeVisible(filterContainer);
    }

    public String selectAssociationFilter(){
        waitForElementToBeVisible(associationFilter);
        associationFilter.click();
        return associationFilter.getText();
    }

    public void disselectAssociationFilter(){
        waitForElementToBeVisible(associationFilter);
        associationFilter.click();
    }

    public String selectCompanyFilter(){
        waitForElementToBeVisible(companyFilter);
        companyFilter.click();
        return companyFilter.getText();
    }

    public void disselectCompanyFilter(){
        waitForElementToBeVisible(associationFilter);
        associationFilter.click();
    }

    public AlertPage openNotes(){
        waitForElementToBeVisible(moreButton);
        waitForElementToBeVisible(viewNotesButton);
        waitForElementToBeVisible(paginationLeftClick);
        moreButton.click();
        viewNotesButton.click();
        return new AlertPage(driver);
    }

    public void paginationClick(){
        waitForElementToBeVisible(currentPaginationPage);
        waitForElementToBeVisible(paginationLeftClick);
        waitForElementToBeVisible(paginationRightClick);
        paginationLeftClick.click();
        paginationRightClick.click();
        }

     public ViewTreePage clickOnTreeButton(){
        waitForElementToBeVisible(tree);
        tree.click();
        return new ViewTreePage(driver);
     }

     public OnlineReportPage reportsOpening(){
       waitForElementToBeVisible(reportsButton);
       reportsButton.click();
       return new OnlineReportPage(driver);
     }

     public void numberperPage(int a){
         WebElement valuePerPageElement = find(companyPerPage);
         Select value = new Select(valuePerPageElement);
         value.selectByIndex(2);
     }

     public String getSelectedValueinPerPage(){
         WebElement valuePerPageElement = find(companyPerPage);
         Select value = new Select(valuePerPageElement);
         String selectedValue = value.getFirstSelectedOption().getText();
         return selectedValue;
     }

     public String getcompanyPerPageQuantity(){
        List<WebElement> companyRows = driver.findElements(By.xpath("//tr[@role='row']"));
        int rowCounter = companyRows.size();
        String rows = String.valueOf(rowCounter);
        return rows;
       }

       public void downLoadReport(){
        waitForElementToBeVisible(reportsButton);
        reportsButton.click();
        waitForElementToBeVisible(reportsWindow);
        waitForElementToBeVisible(downloadSpecificReport);
        downloadSpecificReport.click();
        }
}





