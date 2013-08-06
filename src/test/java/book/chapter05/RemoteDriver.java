package book.chapter05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

@Test
public class RemoteDriver {

  public void remoteDriver() throws MalformedURLException {
    DesiredCapabilities cap = DesiredCapabilities.firefox();
    WebDriver driver = new RemoteWebDriver(new URL(
        "http://localhost:4444/wd/hub"), cap);
    driver.get("http://selenium.polteq.com/testshop/");
    System.out.println(driver.getTitle());
    driver.quit();
  }
}
