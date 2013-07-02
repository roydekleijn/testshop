package sandbox.proxy;

import java.io.File;
import java.io.IOException;

import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.proxy.ProxyServer;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserMob {
	private WebDriver driver;
	private ProxyServer server;

	@BeforeMethod
	public void setUp() throws Exception {
		// start proxy
		server = new ProxyServer(4444);
		server.start();

		// get Selenium proxy object
		Proxy proxy = server.seleniumProxy();

		// configure desired capability
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.PROXY, proxy);

		driver = new FirefoxDriver(capabilities);

		// create a new HAR with label
		server.newHar("testshop");
	}

	@AfterMethod
	public void tearDown() throws Exception {
		server.stop();
		driver.close();
	}

	@Test
	public void bmpCaptureData() throws IOException {
		driver.get("http://selenium.polteq.com/testshop/index.php");

		// server.waitForNetworkTrafficToStop(200, 30000);

		// get HAR data
		Har har = server.getHar();

		System.out.println(har.getLog().getEntries().size());
		har.writeTo(new File("target/har.json"));
	}

	@Test
	public void bmpBlacklist() throws IOException, InterruptedException {
		server.blacklistRequests(".*default.jpg", 404);
		driver.get("http://selenium.polteq.com/testshop/index.php");

		// get HAR data
		Har har = server.getHar();

		System.out.println(har.getLog().getEntries().size());
	}

}
