package TestsCases;

import Utills.AppConfig;
import Utills.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @Parameters({"browser"})
    @BeforeMethod
    public void beforeLogin(@Optional("chrome") String browser) {
        BrowserFactory browserDriverFactory = new BrowserFactory(browser);
        driver = browserDriverFactory.createDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(AppConfig.TIMEOUT));
        driver.get(AppConfig.startUrl);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void shuttingDown() {
        driver.manage().deleteAllCookies();
        driver.close();
        if (driver != null) {
            driver.quit();
        }
    }

    @DataProvider(name = "data_provider")
    protected static Object[][] data_provider() {
        return new Object[][]{
                {1, "index.html"},
                {2, "groot.jpg"},
        };
    }
}
