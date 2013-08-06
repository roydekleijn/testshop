package book.chapter04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTest {
  @Test
  public void login() {
    // Open browser and navigate to website
    WebDriver driver = new FirefoxDriver();
    driver.get("http://selenium.polteq.com/testshop/index.php");
    // Navigate to login page
    driver.findElement(By.className("login")).click();
    // Fill in the form
    driver.findElement(By.id("email")).sendKeys("tester@test.com");
    driver.findElement(By.id("passwd")).sendKeys("tester");
    driver.findElement(By.id("SubmitLogin")).click();

    // Quit browser
    driver.quit();
  }

}
