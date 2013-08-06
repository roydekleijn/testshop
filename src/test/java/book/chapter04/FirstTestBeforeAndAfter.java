package book.chapter04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestBeforeAndAfter {
  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    // Open browser and navigate to website
    WebDriver driver = new FirefoxDriver();
    driver.get("http://selenium.polteq.com/testshop/index.php");
  }

  @AfterMethod
  public void tearDown() {
    // Quit browser
    driver.quit();
  }

  @Test
  public void login() {
    // Navigate to login page
    driver.findElement(By.className("login")).click();
    // Fill in the form
    driver.findElement(By.id("email")).sendKeys("tester@test.com");
    driver.findElement(By.id("passwd")).sendKeys("tester");
    driver.findElement(By.id("SubmitLogin")).click();
    // Assert if element is displayed
    // Assert if element is displayed
    Assert.assertTrue(driver.findElement(By.cssSelector("ul.myaccount_lnk_list"))
        .isDisplayed());
  }
}
