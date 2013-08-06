package book.chapter05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

@Test
public class HtmlUnit {
  /* start */
  public void htmlUnitDriver() {
    WebDriver driver = new HtmlUnitDriver();
    driver.get("http://selenium.polteq.com/testshop/");
    System.out.println(driver.getTitle());
    driver.quit();
  }
  /* end */
}
