package book.chapter05;

import book.chapter09.tests.DriverBase;

import org.testng.annotations.Test;

@Test
public class DeleteCookies extends DriverBase {
  /* start */
  public void clearCookies() {
    driver.get("http://selenium.polteq.com/testshop");
    driver.manage().deleteAllCookies();
  }
  /* end */
}
