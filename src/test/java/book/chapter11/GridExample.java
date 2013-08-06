package book.chapter11;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GridExample {
  private static RemoteWebDriver driver;

  @BeforeClass
  public void setUp() throws MalformedURLException {
    DesiredCapabilities capability = DesiredCapabilities.firefox();
    capability.setBrowserName("firefox");
    capability.setPlatform(Platform.LINUX);
    capability.setVersion("3.6");
    driver = new RemoteWebDriver(new URL(
        "http://localhost:4444/wd/hub"), capability);
    driver.get("http://selenium.polteq.com/testshop/");
  }

  @Test
  public void measurePerformance() {

    driver.findElement(By.cssSelector("input#search_query_top"))
        .sendKeys("ipod nano");
    driver.findElement(
        By.cssSelector("input[name='submit_search']")).click();
    String searchHeader = driver.findElement(By.cssSelector("H1"))
        .getText().toLowerCase();

    Assert.assertTrue(searchHeader.contains("ipod nano"));
  }
}