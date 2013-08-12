package book.chapter09.factory.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverBase {

  protected WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = new FirefoxDriver();
    driver.get("http://selenium.polteq.com/testshop/index.php");
  }

  @AfterMethod
  public void tearDown() {
    driver.close();
  }
}
