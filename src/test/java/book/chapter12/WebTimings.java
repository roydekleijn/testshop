package book.chapter12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class WebTimings {

  protected WebDriver driver;

  /* start */
  public void loginWebTimings() {
    WebDriver driver = new FirefoxDriver();
    driver.get("http://selenium.polteq.com/testshop/index.php");

    // Navigate to login page
    driver.findElement(By.className("login")).click();

    JavascriptExecutor js = (JavascriptExecutor) driver;
    Long loadEventEnd = (Long) js
        .executeScript("return window.performance.timing.loadEventEnd;");
    Long navigationStart = (Long) js
        .executeScript("return window.performance.timing.navigationStart;");
    System.out.println("Page Load Time = "
      + (loadEventEnd - navigationStart));

    driver.quit();
  }
  /* end */

}
