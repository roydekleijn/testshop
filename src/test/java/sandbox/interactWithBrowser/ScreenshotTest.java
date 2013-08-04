package sandbox.interactWithBrowser;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class ScreenshotTest {

  public void takeScreenshot() throws IOException {
    WebDriver driver = new FirefoxDriver();
    driver.get("http://selenium.polteq.com/testshop/");
    File scrFile = ((TakesScreenshot) driver)
        .getScreenshotAs(OutputType.FILE);
    String fileName = UUID.randomUUID().toString();
    File targetFile = new File("target/screenshots/" + fileName
        + ".jpg");
    FileUtils.copyFile(scrFile, targetFile);
  }

}
