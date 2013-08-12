package sandbox.clientSidePerformance.dynatrace;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

// Reference: http://www.softwareishard.com/blog/firebug/automate-page-load-performance-testing-with-firebug-and-selenium/

@Test
public class LoginTest extends DriverBase {

  public void loginDynatrace() {
    // Navigate to login page
    driver.findElement(By.className("login")).click();

    // Fill in the form
    driver.findElement(By.id("email")).sendKeys("tester@test.com");
    driver.findElement(By.id("passwd")).sendKeys("tester");
    driver.findElement(By.id("SubmitLogin")).click();
  }

}
