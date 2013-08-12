package book.chapter12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class WebTimings {

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

  /* start */
  public void loginWebTimings() {
    // Navigate to login page
    driver.findElement(By.className("login")).click();

    // Fill in the form
    driver.findElement(By.id("email")).sendKeys("tester@test.com");
    driver.findElement(By.id("passwd")).sendKeys("tester");
    JavascriptExecutor js = (JavascriptExecutor) driver;
    Long loadEventEnt = (Long) js
        .executeScript("return window.performance.timing.loadEventEnd;");
    Long navigationStart = (Long) js
        .executeScript("return window.performance.timing.navigationStart;");
    System.out.println("Page Load Time = "
        + (loadEventEnt - navigationStart));
    driver.findElement(By.id("SubmitLogin")).click();
  }
  /* end */

}
