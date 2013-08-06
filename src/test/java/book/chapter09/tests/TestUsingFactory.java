package book.chapter09.tests;

import book.chapter09.pages.Factory;
import org.testng.annotations.Test;

public class TestUsingFactory extends DriverBase {
  @Test
  public void join() {
    Factory pages = new Factory(driver);
    pages.homePage().clickSigninLink().setUsername("Test")
        .setPassword("Case").submitForm();
  }
}
