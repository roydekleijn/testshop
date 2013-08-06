package book.chapter09.tests;

import book.chapter09.pages.HomePageAbstractFlow;
import org.testng.annotations.Test;

public class TestUsingMethodChaining extends DriverBase {
  @Test
  public void join() {
    HomePageAbstractFlow homePage = new HomePageAbstractFlow(driver);
    homePage.clickSigninLink().setUsername("Test")
        .setPassword("Case").submitForm();
  }
}
