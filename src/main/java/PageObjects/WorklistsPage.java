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
    @FindBy(css = "a[class='navbar-brand']")
    private WebElement brandImage;
    @FindBy(css = "#page-content")
    private WebElement spreadsheetWithCompaneys;
    @FindBy(css = "body > div.page-body.clearfix")
    private WebElement spreadsheetBody;
    @FindBy(css = "span[class='grey-119']")
    private WebElement accountMenu;
    @FindBy(css = "span[class*='glyphicon-log-out']")
    private WebElement logoutButton;
    @FindBy(css = "#filter-disable > span ")
    private WebElement filter;
    @FindBy(css = "#Name-S-BFUQxAzM-S > a")
    private WebElement simpleCovalue;
    @FindBy(css = "#Name-S-BFUQ4kjM-S > a")
    private WebElement ltGamevalue;
    @FindBy(css = "#Name-S-BFUQykjM-S > a")
    private WebElement johnsonvalue;
    @FindBy(css = "#filter-keyword > button > span")
    private WebElement getRemoveSearchQuery;
    @FindBy(css = "#Name-S-BFUQyUjM-S > a")
    private WebElement polusValue;
    @FindBy(css = "#filter-disable > span")
    private WebElement enebleFilter;
    @FindBy(css = "#thead-filter > th:nth-child(5) > span > div > button")
    private WebElement filterButton;
    @FindBy(css = "input[value='association']")
    private WebElement associationFilter;
    @FindBy(css = "input[value='company']")
    private WebElement companyFilter;
    @FindBy(css = "input[value='foreignerentity']")
    private WebElement foreignerFilter;
    @FindBy(css = "input[value*='government']")
    private WebElement govermentFilter;
    @FindBy(css = "input[value*='partnership']")
    private WebElement partnershipFilter;
    @FindBy(css = "input[value*='trader']")
    private WebElement soleTraderFilter;
    @FindBy(css = "input[value='trust']")
    private WebElement trustFilter;
    @FindBy(css = "#filter-enable > span:nth-child(1)")
    private WebElement disableFilters;
    @FindBy(css = "#filter-keyword > button > span")
    private WebElement removeSearchQuery;
    @FindBy(css = "#thead-filter > th:nth-child(5) > span > div > ul")
    private WebElement filterContainer;
    @FindBy(css = "#application-tools-popover-S-BFUQxAzM-S > span")
    private WebElement moreButton;
    @FindBy(css = "#notes-trigger-S-BFUQxAzM-S > a")
    private WebElement viewNotesButton;
    @FindBy(css = "#next-usr-page")
    private WebElement paginationLeftClick;
    @FindBy(css = "#previous-usr-page")
    private WebElement paginationRightClick;
    @FindBy(css = "#current-usr-page")
    private WebElement currentPaginationPage;
    @FindBy(css = "#Tree-S-EUQBVjN-S")
    private WebElement tree;
    @FindBy(css = "button[onClick*='downloadAll']")
    private WebElement downloadALLReportsButton;
    @FindBy(css = "#documents-list > tr:nth-child(1) > td:nth-child(1) > a > div > strong")
    private WebElement onlineReport;
    @FindBy(css = "div[role='tooltip']")
    private WebElement reportsWindow;
    @FindBy(css = "#documents-list > tr:nth-child(1) > td:nth-child(3) > a > span")
    private WebElement downloadSpecificReport;
    @FindBy(css = "#ReportsList-S-EUQBVjN-S")
    private WebElement reportsButton;
    @FindBy(css = "#select-number-lines")
    private WebElement companyPerPage;
    @FindBy(css = "tr[role='row']")
    private WebElement companyRowInfo;

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
        List<WebElement> companyRows = driver.findElements((By) companyRowInfo);
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





