package book.chapter12;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverBaseNetExport {
  /* start */
  protected WebDriver driver;

  @BeforeMethod
  public void setUp() {
    FirefoxProfile profile = new FirefoxProfile();
    try {
      profile.addExtension(new File(
          "src/test/resources/firebug-1.11.0.xpi"));
      profile.addExtension(new File(
          "src/test/resources/netExport-0.9b3.xpi"));
    } catch (IOException e) {
      throw new RuntimeException(
          "Could not load required extensions?", e);
    }
    // Firefox preferences
    profile.setPreference("app.update.enabled", false);

    // Firebug preferences
    profile.setPreference("extensions.firebug.currentVersion",
        "1.11.0");
    profile.setPreference("extensions.firebug.allPagesActivation",
        "on");
    profile.setPreference("extensions.firebug.defaultPanelName",
        "net");
    profile.setPreference("extensions.firebug.net.enableSites",
        true);

    // NetExport preferences
    profile
        .setPreference(
            "extensions.firebug.netexport.alwaysEnableAutoExport",
            true);
    profile.setPreference(
        "extensions.firebug.netexport.showPreview", false);
    profile.setPreference(
        "extensions.firebug.netexport.defaultLogDir", "C:\\har\\");
    driver = new FirefoxDriver(profile);
    driver.get("http://selenium.polteq.com/testshop/index.php");
  }

  /* end */

  @AfterMethod
  public void tearDown() {
    driver.close();
  }
}