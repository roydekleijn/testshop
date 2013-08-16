package book.chapter05;

import book.chapter09.tests.DriverBase;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

@Test
public class CreateCookie extends DriverBase {
  /* start */
  public void addCookieToBypassLogin() throws Exception {
    driver.get("http://www.heineken.com/");
    Cookie cookie = new Cookie("AgeGatewayDob", "dob=1986-11-22");
    driver.manage().addCookie(cookie);
    driver.get("http://www.heineken.com/nl/Home.aspx");
    assertThat(driver.findElement(By.cssSelector("a.hdp-header-logo")).isDisplayed(), Matchers.equalTo(true));
  }
  /* end */
}
