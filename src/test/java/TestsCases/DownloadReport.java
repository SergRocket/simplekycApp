package TestsCases;

import PageObjects.LoginPage;
import PageObjects.WorklistsPage;
import Utills.AppConfig;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DownloadReport extends BaseTest {
    @Test
    public void DownloadReport() throws IOException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        WorklistsPage worklistsPage = new WorklistsPage(driver);
        worklistsPage.downLoadReport();
        HttpClient client = HttpClientBuilder.create().setConnectionTimeToLive(2000, TimeUnit.MILLISECONDS).build();
        HttpResponse httpResponse = client.execute(new HttpGet(AppConfig.urlToDonwloadReport));
        HttpEntity entity = httpResponse.getEntity();
        String responseCode = EntityUtils.toString(entity);
        System.out.print(responseCode);
        if(httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
        } else {
            throw new HttpResponseException(httpResponse.getStatusLine().getStatusCode(), responseCode);
        }

// Get the response

    }
}
