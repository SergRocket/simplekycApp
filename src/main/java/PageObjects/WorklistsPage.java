package PageObjects;

import Utills.AppConfig;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
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
    private WebElement getRemoveSearchQuery;
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
    @FindBy(css = "#popover199876")
    private WebElement reportsWindow;
    @FindBy(id = "documents-list")
    private WebElement documentList;
    @FindBy(css = "#documents-list > tr:nth-child(1) > td:nth-child(3) > a")
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
        try {
            waitForElementToBeVisible(brandImage);
            waitForElementToBeVisible(spreadsheetWithCompaneys);
            if (brandImage.isDisplayed() && spreadsheetWithCompaneys.isDisplayed()) {
                return true;
            }
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
            return false;
        }
        return brandImage.isDisplayed() && spreadsheetWithCompaneys.isDisplayed();
    }

    public void logout() {
        elementClick(accountMenu);
        elementClick(logoutButton);
    }

    public String getValueSimpleCo() {
        try {
            waitForElementToBeVisible(simpleCovalue);
            waitForElementToBeVisible(spreadsheetBody);
            waitForElementToBeVisible(spreadsheetWithCompaneys);
        } catch (NoSuchElementException n) {
            System.out.print("The elements are not visible");
        }
        String vaueABN = find(simpleCovalue).getText();
        return vaueABN;
    }

    public String getValueLtGame() {
        try {
            waitForElementToBeVisible(ltGamevalue);
            waitForElementToBeVisible(spreadsheetBody);
            waitForElementToBeVisible(spreadsheetWithCompaneys);
        } catch (NoSuchElementException n) {
            System.out.print("The elements are not visible");
        }
        String vaueABN = find(ltGamevalue).getText();
        return vaueABN;
    }

    public String getValueJohnson() {
        try {
            waitForElementToBeVisible(johnsonvalue);
            waitForElementToBeVisible(spreadsheetBody);
            waitForElementToBeVisible(spreadsheetWithCompaneys);
        } catch (NoSuchElementException n) {
            System.out.print("The elements are not visible");
        }
        String vaueABN = find(johnsonvalue).getText();
        return vaueABN;
    }

    protected WebElement find(WebElement element) {
        return element;
    }

    public void searchForSimpleCO() {
        try {
            waitForElementToBeVisible(filter);
            waitForElementToBeVisible(spreadsheetWithCompaneys);
        } catch (NoSuchElementException n) {
            System.out.print("The elements are not visible");
        }
        filter.sendKeys(AppConfig.ABNvalidsearch1);
        try {
            waitForElementToBeVisible(spreadsheetBody);
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
        }
    }

    public void searchForLtgame() {
        try {
            waitForElementToBeVisible(filter);
            waitForElementToBeVisible(spreadsheetWithCompaneys);
        } catch (NoSuchElementException n) {
            System.out.print("The elements are not visible");
        }
        filter.sendKeys(AppConfig.ABNvalidsearch2);
        try {
            waitForElementToBeVisible(spreadsheetBody);
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
        }
    }

    public void searchForJohnsonFamily() {
        try {
            waitForElementToBeVisible(filter);
            waitForElementToBeVisible(spreadsheetWithCompaneys);
        } catch (NoSuchElementException n) {
            System.out.print("The elements are not visible");
        }
        filter.sendKeys(AppConfig.ABNvalidsearch3);
        try {
            waitForElementToBeVisible(spreadsheetBody);
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
        }
    }

    public void clearSearch() {
        try {
            waitForElementToBeVisible(spreadsheetWithCompaneys);
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
        }
        elementClick(removeSearchQuery);
        try {
            waitForElementToBeVisible(spreadsheetBody);
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
        }
    }

    public void searchForSimpleCoACN() {
        try {
            waitForElementToBeVisible(filter);
            waitForElementToBeVisible(spreadsheetWithCompaneys);
        } catch (NoSuchElementException n) {
            System.out.print("The elements are not visible");
        }
        filter.sendKeys(AppConfig.ACNvalidsearch1);
        try {
            waitForElementToBeVisible(spreadsheetBody);
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
        }
    }

    public void searchForLtGameACN() {
        try {
            waitForElementToBeVisible(filter);
            waitForElementToBeVisible(spreadsheetWithCompaneys);
        } catch (NoSuchElementException n) {
            System.out.print("The elements are not visible");
        }
        filter.sendKeys(AppConfig.ACNvalidsearch2);
        try {
            waitForElementToBeVisible(spreadsheetBody);
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
        }
    }

    public void searchForPolusACN() {
        try {
            waitForElementToBeVisible(filter);
            waitForElementToBeVisible(spreadsheetWithCompaneys);
        } catch (NoSuchElementException n) {
            System.out.print("The elements are not visible");
        }
        filter.sendKeys(AppConfig.ACNvalidsearch3);
        try {
            waitForElementToBeVisible(spreadsheetBody);
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
        }
    }

    public String getValueSimpleCoACN() {
        try {
            waitForElementToBeVisible(simpleCovalue);
            waitForElementToBeVisible(spreadsheetBody);
            waitForElementToBeVisible(spreadsheetWithCompaneys);
        } catch (NoSuchElementException n) {
            System.out.print("The elements are not visible");
        }
        return find(johnsonvalue).getText();
    }

    public String getValuepolusACN() {
        try {
            waitForElementToBeVisible(polusValue);
            waitForElementToBeVisible(spreadsheetBody);
            waitForElementToBeVisible(spreadsheetWithCompaneys);
        } catch (NoSuchElementException n) {
            System.out.print("The elements are not visible");
        }
        return find(johnsonvalue).getText();
    }

    public String getValueltGameACN() {
        try {
            waitForElementToBeVisible(ltGamevalue);
            waitForElementToBeVisible(spreadsheetBody);
            waitForElementToBeVisible(spreadsheetWithCompaneys);
        } catch (NoSuchElementException n) {
            System.out.print("The elements are not visible");
        }
        return find(johnsonvalue).getText();
    }

    public void enebleFilters() {
        elementClick(enebleFilter);
        elementClick(filterButton);
        try {
            waitForElementToBeVisible(filterContainer);
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
        }
    }

    public String activateAssociationFilter() {
        try {
            selectCompanyFilters(associationFilter);
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
        }
        selectCompanyFilters(associationFilter);
        return associationFilter.getText();
    }

    public void disselectAssociationFilter() {
        disselectCompanyFilters(associationFilter);
    }

    public String activateCopmFilter() {
        try {
            selectCompanyFilters(associationFilter);
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
        }
        return associationFilter.getText();
    }

    public void disselectCopmFilter() {
        disselectCompanyFilters(associationFilter);
    }

    public String activatForeinerFilter() {
        try {
            selectCompanyFilters(associationFilter);
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
        }
        return associationFilter.getText();
    }

    public void disselectForeiFilter() {
        disselectCompanyFilters(associationFilter);
    }

    public String activateGovFilter() {
        try {
            selectCompanyFilters(associationFilter);
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
        }
        return associationFilter.getText();
    }

    public void disselectGovFilter() {
        disselectCompanyFilters(associationFilter);
    }

    public String activatePertnerFilter() {
        try {
            selectCompanyFilters(associationFilter);
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
        }
        return associationFilter.getText();
    }

    public void disselectPartnerFilter() {
        disselectCompanyFilters(associationFilter);
    }

    public String activateSoleFilter() {
        try {
            selectCompanyFilters(associationFilter);
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
        }
        return associationFilter.getText();
    }

    public void disselectSoleFilter() {
        disselectCompanyFilters(associationFilter);
    }

    public String activateTrustFilter() {
        try {
            selectCompanyFilters(associationFilter);
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
        }
        return associationFilter.getText();
    }

    public void disselectTrustFilter() {
        disselectCompanyFilters(associationFilter);
    }

    public void disablefilters() {
        elementClick(filterButton);
        elementClick(disableFilters);
    }

    public AlertPage openNotes() {
        try {
            waitForElementToBeVisible(moreButton);
            waitForElementToBeVisible(viewNotesButton);
            waitForElementToBeVisible(paginationLeftClick);
        } catch (NoSuchElementException n) {
            System.out.print("The elements are not visible");
        }
        elementClick(moreButton);
        elementClick(viewNotesButton);
        return new AlertPage(driver);
    }

    public void paginationClick() {
        try {
            waitForElementToBeVisible(currentPaginationPage);
            waitForElementToBeVisible(paginationLeftClick);
            waitForElementToBeVisible(paginationRightClick);
        } catch (NoSuchElementException n) {
            System.out.print("The elements are not visible");
        }
        elementClick(paginationLeftClick);
        elementClick(paginationRightClick);
    }

    public ViewTreePage clickOnTreeButton() {
        elementClick(tree);
        return new ViewTreePage(driver);
    }

    public OnlineReportPage reportsOpening() {
        elementClick(reportsButton);
        return new OnlineReportPage(driver);
    }

    public void numberperPage(int a) {
        WebElement valuePerPageElement = find(companyPerPage);
        Select value = new Select(valuePerPageElement);
        value.selectByIndex(2);
    }

    public String getSelectedValueinPerPage() {
        WebElement valuePerPageElement = find(companyPerPage);
        Select value = new Select(valuePerPageElement);
        return value.getFirstSelectedOption().getText();
    }

    public String getcompanyPerPageQuantity() {
        List<WebElement> companyRows = driver.findElements(By.xpath("//tr[@role='row']"));
        int rowCounter = companyRows.size();
        return String.valueOf(rowCounter);
    }

    public void downLoadReport() {
        elementClick(reportsButton);
        elementClick(downloadSpecificReport);
    }

    public Integer validationForDownloadRequest() throws IOException {
        HttpClient client = HttpClientBuilder.create().setConnectionTimeToLive(2000, TimeUnit.MILLISECONDS).build();
        HttpResponse httpResponse = client.execute(new HttpGet(AppConfig.urlToDonwloadReport));
        HttpEntity entity = httpResponse.getEntity();
        String responseCode = EntityUtils.toString(entity);
        if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            System.out.print(responseCode);
        } else {
            throw new HttpResponseException(httpResponse.getStatusLine().getStatusCode(), responseCode);
        }
        return HttpStatus.SC_OK;
    }
}





