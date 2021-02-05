package Utills;

import PageObjects.BasePage;
import org.apache.commons.io.FileUtils;

import org.apache.http.HttpResponse;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;


public class FileDownloader extends BasePage {


    public FileDownloader(WebDriver driver) {
        super(driver);
    }

    public File downloadReport() throws IOException {
        File downLoadFile = File.createTempFile("download", ".tmp");
        //HttpResponse responseAfterRequestReport = getHTTPResponse();
        try{
            //lastHTTPresponce = responseAfterRequestReport.getStatusLine().getStatusCode();
          // FileUtils.copyInputStreamToFile(responseAfterRequestReport.getEntity().getContent(), downLoadFile);
        } finally {
          //  responseAfterRequestReport.getEntity().getContent().close();
        }
        return downLoadFile;
    }
}
