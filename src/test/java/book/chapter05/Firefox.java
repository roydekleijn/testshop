package book.chapter05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class Firefox {
  /* start */
  public void startFirefoxBrowser() {
    WebDriver driver = new FirefoxDriver();
    driver.get("http://selenium.polteq.com/testshop/");
    System.out.println(driver.getTitle());
    driver.quit();
  }
  /* end */
}
