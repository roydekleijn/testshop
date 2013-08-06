package book.chapter12;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

@Test
public class CodeTimingsTimer extends DriverBase {

  /* start */
  public void loginCodeTimingsTimerClass() {
    // Navigate to login page
    Timer timer = new Timer();
    timer.start();
    driver.findElement(By.className("login")).click();

    // Fill in the form
    driver.findElement(By.id("email")).sendKeys("tester@test.com");
    driver.findElement(By.id("passwd")).sendKeys("tester");
    timer.end();
    System.out.println("Totaltime: " + timer.getTotalTime()
        + " milliseconds");
    driver.findElement(By.id("SubmitLogin")).click();
  }
  /* end */
}
