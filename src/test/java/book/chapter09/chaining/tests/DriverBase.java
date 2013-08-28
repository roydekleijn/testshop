package book.chapter09.chaining.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverBase {

  protected WebDriver driver;

  @BeforeMethod
  public void setUp() {
    System.setProperty("webdriver.ie.driver",
        findFileOnPath("IEDriverServer.exe"));
    driver = new InternetExplorerDriver();
    driver.get("http://www.agame.com/terms_of_use.html");
  }

  @AfterMethod
  public void tearDown() {
    driver.close();
  }

  private static String findFileOnPath(String fileName) {
    return DriverBase.class.getClassLoader().getResource(fileName).getPath();
  }
}
