package book.chapter09.factory.tests;

import book.chapter09.factory.pages.Factory;

import org.testng.annotations.Test;

public class LoginTests extends DriverBase{
  @Test
   public void join() {
   Factory pages = new Factory(driver);
   pages.homePage().clickSigninLink().setUsername("Test")
   .setPassword("Case").submitForm();
   }
}
