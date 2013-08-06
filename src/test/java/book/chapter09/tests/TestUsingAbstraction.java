package book.chapter09.tests;

import book.chapter09.pages.HomePageAbstractPage;
import book.chapter09.pages.SignInPageAbstractPage;
import org.testng.annotations.Test;

public class TestUsingAbstraction extends DriverBase {
  @Test
  public void join() {
    HomePageAbstractPage homePage = new HomePageAbstractPage(driver);
    homePage.clickSigninLink();
    SignInPageAbstractPage joinPage = new SignInPageAbstractPage(driver);
    joinPage.setUsername("Test");
    joinPage.setPassword("Case");
    joinPage.submitForm();
  }
}
