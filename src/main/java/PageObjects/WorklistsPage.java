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
    @FindBy(css = "#app_filter ")
    private WebElement searchField;
    @FindBy(css = "#Name-S-BFUQ5kjM-S > a")
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
    @FindBy(css = "#Notes-S-BFUQxAzM-S")
    private WebElement viewNotesButton;
    @FindBy(css = "#next-usr-page")
    private WebElement paginationLeftClick;
    @FindBy(css = "#previous-usr-page")
    private WebElement paginationRightClick;
    @FindBy(css = "#current-usr-page")
    private WebElement currentPaginationPage;
    @FindBy(css = "#table_body_aplications > tr.usr-row-301 > td.tbl-vert-padding-icon-tree.worklist-icon-style")
    private WebElement tree;
    @FindBy(css = "button[onClick*='downloadAll']")
    private WebElement downloadALLReportsButton;
    @FindBy(css = "#documents-list > tr:nth-child(1) > td:nth-child(1) > a > div > strong")
    private WebElement onlineReport;
    @FindBy(css = "div[role='tooltip']")
    private WebElement reportsWindow;
    @FindBy(css = "#documents-list > tr:nth-child(1) > td:nth-child(3) > a > span")
    private WebElement downloadSpecificReport;
    @FindBy(css = "span[title='SIMPLE CO PTY LTD  Reports']")
    private WebElement reportsButton;
    @FindBy(css = "#select-number-lines")
    private WebElement companyPerPage;
    @FindBy(css = "#ET-S-BFUQzYjM-S")
    private WebElement filteredAssociationCompanyOnly;
    @FindBy(css = "#ET-S-BFUQ4gjM-S")
    private WebElement filteredCompanyCompOnly;
    @FindBy(css = "#applications_count")
    private WebElement filtereForeignComOnly;
    @FindBy(css = "#ET-S-BFUQ1cjM-S")
    private WebElement filteredGovCompOnly;
    @FindBy(css = "#ET-S-BFUQzQTM-S")
    private WebElement filteredPartnershipCompOnly;
    @FindBy(css = "#ET-S-BFUQ2IjM-S")
    private WebElement filteredSoleTrCopmOnly;
    @FindBy(css = "#ET-S-BFUQ1MTM-S")
    private WebElement filteredTrustCompOnly;
    @FindBy(css = "tr[role='row']")
    private List<WebElement> companyRowsInfo;

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

    public void logout() throws InterruptedException {
        waitForElementToBeVisible(spreadsheetWithCompaneys);
        waitForElementToBeVisible(spreadsheetBody);
        sleep();
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

    protected WebElement find(WebElement element) {
        return element;
    }

    public void searchForSimpleCO() {
        try {
            waitForElementToBeVisible(searchField);
            waitForElementToBeVisible(spreadsheetWithCompaneys);
        } catch (NoSuchElementException n) {
            System.out.print("The elements are not visible");
        }
        searchField.sendKeys(AppConfig.ABNvalidsearch1);
        try {
            waitForElementToBeVisible(spreadsheetBody);
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
        }
    }

    public void searchForSimpleCoACN() {
        try {
            waitForElementToBeVisible(searchField);
            waitForElementToBeVisible(spreadsheetWithCompaneys);
        } catch (NoSuchElementException n) {
            System.out.print("The elements are not visible");
        }
        searchField.sendKeys(AppConfig.ACNvalidsearch1);
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
        return find(simpleCovalue).getText();
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

    public void activateAssociationFilter() {
        try {
            waitForElementToBeVisible(spreadsheetWithCompaneys);
            waitForElementToBeVisible(spreadsheetBody);
            waitForElementToBeVisible(currentPaginationPage);
            elementClick(associationFilter);
            sleep();
        } catch (NoSuchElementException | InterruptedException n) {
            System.out.print("The element is not visible");
        }
    }

    public void activateCompanyFilter() {
        try {
            elementClick(companyFilter);
            sleep();
        } catch (NoSuchElementException | InterruptedException n) {
            System.out.println("The element is not visible");
        }
    }

    public void activateForeignFilter() {
        try {
            elementClick(foreignerFilter);
            sleep();
        } catch (NoSuchElementException | InterruptedException n) {
            System.out.println("The element is not visible");
        }
    }

    public void activateGovernFilter() {
        try {
            elementClick(govermentFilter);
            sleep();
        } catch (NoSuchElementException | InterruptedException n) {
            System.out.println("The element is not visible");
        }
    }

    public void activatePernershipFilter() {
        try {
            elementClick(partnershipFilter);
            sleep();
        } catch (NoSuchElementException | InterruptedException n) {
            System.out.println("The element is not shown");
        }
    }

    public void activateSoleTrFilter() {
        try {
            elementClick(soleTraderFilter);
            sleep();
        } catch (NoSuchElementException | InterruptedException n) {
            System.out.println("The element is not shown");
        }
    }

    public void activTrustFilter() {
        try {
            elementClick(trustFilter);
            sleep();
        } catch (NoSuchElementException | InterruptedException n) {
            System.out.println("The element is not shown");
        }
    }

    public String getFilteredbySeventhCompanyType() {
        try {
            waitForElementToBeVisible(spreadsheetWithCompaneys);
            waitForElementToBeVisible(spreadsheetBody);
            elementClick(filterButton);
        } catch (NoSuchElementException n) {
            System.out.println("The elements are not peresent");
        }
        return find(filteredTrustCompOnly).getText();
    }

    public String getFilteredbySixthCompanyType() {
        try {
            waitForElementToBeVisible(spreadsheetWithCompaneys);
            waitForElementToBeVisible(spreadsheetBody);
        } catch (NoSuchElementException n) {
            System.out.println("The elements are not peresent");
        }
        return find(filteredSoleTrCopmOnly).getText();
    }

    public String getFilteredbyifthCompanyType() {
        try {
            waitForElementToBeVisible(spreadsheetWithCompaneys);
            waitForElementToBeVisible(spreadsheetBody);
        } catch (NoSuchElementException n) {
            System.out.println("The elements are not peresent");
        }
        return find(filteredPartnershipCompOnly).getText();
    }

    public String getFilteredbyForthCompanyType() {
        try {
            waitForElementToBeVisible(spreadsheetWithCompaneys);
            waitForElementToBeVisible(spreadsheetBody);
        } catch (NoSuchElementException n) {
            System.out.println("The elements are not peresent");
        }
        return find(filteredGovCompOnly).getText();
    }

    public String getFilteredbyThirdCompanyType() {
        try {
            waitForElementToBeVisible(spreadsheetWithCompaneys);
            waitForElementToBeVisible(spreadsheetBody);
        } catch (NoSuchElementException n) {
            System.out.println("The elements are not peresent");
        }
        return find(filtereForeignComOnly).getText();
    }

    public String getFilteredbySecondCompanytype() {
        try {
            waitForElementToBeVisible(spreadsheetWithCompaneys);
            waitForElementToBeVisible(spreadsheetBody);
        } catch (NoSuchElementException n) {
            System.out.println("The elements are not peresent");
        }
        return find(filteredCompanyCompOnly).getText();
    }

    public String getFilteredbyFirstCompanyType() {
        try {
            waitForElementToBeVisible(spreadsheetWithCompaneys);
            waitForElementToBeVisible(spreadsheetBody);
        } catch (NoSuchElementException n) {
            System.out.println("The elements are not peresent");
        }
        return find(filteredAssociationCompanyOnly).getText();
    }

    public AlertPage openNotes() {
        try {
            waitForElementToBeVisible(moreButton);
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
        elementClick(onlineReport);
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
        int rowCounter = companyRowsInfo.size();
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





