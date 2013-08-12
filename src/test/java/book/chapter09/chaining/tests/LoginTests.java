package book.chapter09.chaining.tests;

import book.chapter09.chaining.pages.HomePage;
import org.testng.annotations.Test;


public class LoginTests extends DriverBase {
  @Test
  public void join() {
    HomePage homePage = new HomePage(driver);
    homePage.clickSigninLink().setUsername("Test")
        .setPassword("Case").submitForm();
  }
}
