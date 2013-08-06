package book.chapter13;

import net.lightbody.bmp.proxy.ProxyServer;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;

public class BmpDriverBase {
  protected WebDriver driver;
  protected ProxyServer server;

  @BeforeMethod
  public void setup() throws Exception {
    // start the proxy
    server = new ProxyServer(4444);
    server.start();
    // get the Selenium proxy object
    Proxy proxy = server.seleniumProxy();

    // configure it as a desired capability
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability(CapabilityType.PROXY, proxy);

    // start the browser up
    driver = new FirefoxDriver(capabilities);

    // Don't capture everything
    server.setCaptureBinaryContent(false);
    server.setCaptureContent(false);
    server.setCaptureHeaders(false);
  }

  @AfterMethod
  public void teardown(ITestResult result) throws Exception {
    server.getHar().writeTo(new File("target/" + result.getName() + ".json"));
    server.stop();
    driver.quit();
  }

}
