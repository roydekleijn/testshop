package book.chapter09.flow.tests;

import book.chapter09.flow.pages.HomePage;
import book.chapter09.flow.pages.SignInPage;
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
