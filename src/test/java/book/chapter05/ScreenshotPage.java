package book.chapter05;

import book.chapter09.tests.DriverBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Test
public class ScreenshotPage extends DriverBase {
  /* start */
  public void takeScreenshot() throws IOException {
    File scrFile = ((TakesScreenshot) driver)
        .getScreenshotAs(OutputType.FILE);
    String fileName = UUID.randomUUID().toString();
    File targetFile = new File("target/screenshots/" + fileName
        + ".jpg");
    FileUtils.copyFile(scrFile, targetFile);
  }
  /* end */
}
