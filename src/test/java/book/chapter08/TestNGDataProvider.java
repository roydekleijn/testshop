package book.chapter08;

import book.chapter09.tests.DriverBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class TestNGDataProvider extends DriverBase {
  /* start */
  @DataProvider
  public Object[][] credentials() {
    return new Object[][] {
      {"tester@test.com", "tester"},
      {"nonexistinguser", "tester"},
    };
  }

  public void login(String email, String password) {
    driver.findElement(By.className("login")).click();
    // Fill in the form
    driver.findElement(By.id("email")).sendKeys(email);
    driver.findElement(By.id("passwd")).sendKeys(password);
    driver.findElement(By.id("SubmitLogin")).click();
    // Assert if element is displayed
    Assert.assertTrue(driver.findElement(
        By.cssSelector("ul.myaccount_lnk_list")).isDisplayed());
  }
  /* end */
}
