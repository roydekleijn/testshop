package sandbox.clientSidePerformance.dynatrace;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverBase {

  protected WebDriver driver;

  @BeforeMethod
  public void setUp() {
    System.setProperty("webdriver.ie.driver",
        "src/test/resources/IEDriverServer.exe");
    driver = new InternetExplorerDriver();
    driver.get("http://selenium.polteq.com/testshop/index.php");
  }

  @AfterMethod
  public void tearDown() {
    driver.close();
    driver.quit();
  }
}
