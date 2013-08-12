package org.testshop.store.account;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testshop.store.DriverBase;
import org.testshop.store.pages.HomePage;
import org.testshop.store.pages.LoginPage;

@Test
public class LoginTest extends DriverBase {
  private LoginPage loginPage;

  @BeforeMethod
  public void navigateToLoginPage() throws InterruptedException {
    loginPage = new HomePage(config).get().clickOnLoginLink();
  }

  public void loginSuccesful() {
    loginPage.loginWithUsernameAndPassword("tester@test.com",
        "1qazxsw2");
  }
}
