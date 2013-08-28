package book.chapter09.chaining.tests;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import book.chapter09.chaining.pages.HomePage;
import org.testng.annotations.Test;


public class LoginTests extends DriverBase {
  @Test
  public void join() {
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

    driver.findElement(By.cssSelector("body")).click();

    /*
    HomePage homePage = new HomePage(driver);
    homePage.clickSigninLink().setUsername("Test")
        .setPassword("Case").submitForm();
        */
  }
}
