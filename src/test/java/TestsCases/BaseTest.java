package TestsCases;

import Utills.AppConfig;
import Utills.BrowserFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

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
    }

    @AfterMethod
    public void shuttingDown() {
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
