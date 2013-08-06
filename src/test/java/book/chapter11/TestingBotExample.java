package book.chapter11;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestingBotExample {
  private WebDriver driver;

  @BeforeClass
  public void setUp() throws Exception {
    DesiredCapabilities capabillities = DesiredCapabilities
        .firefox();
    capabillities.setCapability("version", "11");

    capabillities.setCapability("platform", Platform.WINDOWS);
    capabillities.setCapability("name", "Testing Selenium 2");

    driver = new RemoteWebDriver(new URL(
        "http://CKey:CSec@hub.testingbot.com:4444/wd/hub"),
        capabillities);
  }

  @Test
  public void testSimple() throws Exception {
    driver.get("http://selenium.polteq.com/testshop/");
    driver.findElement(By.cssSelector("input#search_query_top"))
        .sendKeys("ipod nano");
    driver.findElement(
        By.cssSelector("input[name='submit_search']")).click();
    String searchHeader = driver.findElement(By.cssSelector("H1"))
        .getText().toLowerCase();

    Assert.assertTrue(searchHeader.contains("ipod nano"));
  }

  @AfterClass
  public void tearDown() throws Exception {
    driver.quit();
  }

}
