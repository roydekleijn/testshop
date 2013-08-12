package book.chapter09.tests;

import book.chapter09.pages.HomePage;
import book.chapter09.pages.SignInPage;
import org.testng.annotations.Test;


public class LoginTests extends DriverBase {
  @Test
  public void join() {
    HomePage homePage = new HomePage(driver);
    homePage.clickSigninLink();
    SignInPage joinPage = new SignInPage(driver);
    joinPage.setUsername("Test");
    joinPage.setPassword("Case");
    joinPage.submitForm();
  }
}
