package book.chapter11;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PrioritizerExample {

  @Test
  public void importantTest() throws MalformedURLException {
    DesiredCapabilities capability = DesiredCapabilities.firefox();
    capability.setCapability("_important", true);

    RemoteWebDriver driver = new RemoteWebDriver(new URL(
        "http://localhost:4444/wd/hub"), capability);

    driver.get("http://selenium.polteq.com/testshop/");

    driver.findElement(By.cssSelector("input#search_query_top"))
        .sendKeys("ipod nano");
    driver.findElement(
        By.cssSelector("input[name='submit_search']")).click();
    String searchHeader = driver.findElement(By.cssSelector("H1"))
        .getText().toLowerCase();

    Assert.assertTrue(searchHeader.contains("ipod nano"));
    driver.close();
    driver.quit();
  }

  @Test
  public void lessImportantTest() throws MalformedURLException {
    DesiredCapabilities capability = DesiredCapabilities.firefox();
    capability.setCapability("_important", false);

    RemoteWebDriver driver = new RemoteWebDriver(new URL(
        "http://localhost:4444/wd/hub"), capability);
    driver.get("http://selenium.polteq.com/prestashop/");

    driver.findElement(By.cssSelector("input#search_query_top"))
        .sendKeys("ipod nano");
    driver.findElement(
        By.cssSelector("input[name='submit_search']")).click();
    String searchHeader = driver.findElement(By.cssSelector("H1"))
        .getText().toLowerCase();

    Assert.assertTrue(searchHeader.contains("ipod nano"));

    driver.close();
    driver.quit();
  }

}