package sandbox.interactWithBrowser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

@Test
public class DifferentDriverTest {

  public void startFirefoxBrowser() {
    WebDriver driver = new FirefoxDriver();
    driver.get("http://selenium.polteq.com/testshop/");
    System.out.println(driver.getTitle());
    driver.quit();
  }

  public void startChromeBrowser() {
    System.setProperty("webdriver.chrome.driver", this.getClass()
        .getClassLoader().getResource("chromedriver.exe").getPath());
    WebDriver driver = new ChromeDriver();
    driver.get("http://selenium.polteq.com/testshop/");
    System.out.println(driver.getTitle());
    driver.quit();
  }

  public void startInternetExplorerBrowser() {
    System
        .setProperty("webdriver.ie.driver", this.getClass()
            .getClassLoader().getResource("IEDriverServer.exe")
            .getPath());
    WebDriver driver = new InternetExplorerDriver();
    driver.get("http://selenium.polteq.com/testshop/");
    System.out.println(driver.getTitle());
    driver.quit();
  }

  public void htmlUnitDriver() {
    WebDriver driver = new HtmlUnitDriver();
    driver.get("http://selenium.polteq.com/testshop/");
    System.out.println(driver.getTitle());
    driver.quit();
  }

  /*
   * You have to run a local grid for this test
   */
  public void remoteDriver() throws MalformedURLException {
    DesiredCapabilities cap = DesiredCapabilities.firefox();
    WebDriver driver = new RemoteWebDriver(new URL(
        "http://localhost:4444/wd/hub"), cap);
    driver.get("http://selenium.polteq.com/testshop/");
    System.out.println(driver.getTitle());
    driver.quit();
  }

}
