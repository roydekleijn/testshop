package book.chapter12;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

@Test
public class CodeTimings extends DriverBase {

  /* start */
  public void loginCodeTimings() {
    // Navigate to login page
    long startTime = System.currentTimeMillis();
    driver.findElement(By.className("login")).click();

    // Fill in the form
    driver.findElement(By.id("email")).sendKeys("tester@test.com");
    driver.findElement(By.id("passwd")).sendKeys("tester");
    long endTime = System.currentTimeMillis();
    long totalTime = endTime - startTime;
    System.out.println("Totaltime: " + totalTime + "milliseconds");
    driver.findElement(By.id("SubmitLogin")).click();
  }
  /* end */

}
