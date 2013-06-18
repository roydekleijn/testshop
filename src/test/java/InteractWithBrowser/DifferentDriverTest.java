package InteractWithBrowser;

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
    
    public void firefoxDriver() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://selenium.polteq.com/testshop/");
        System.out.println(driver.getTitle());
        driver.close();
    }
    
    public void chromeDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://selenium.polteq.com/testshop/");
        System.out.println(driver.getTitle());
        driver.close();
    }
    
    public void internetExplorerDriver() {
        System.setProperty("webdriver.ie.driver", "src/test/resources/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("http://selenium.polteq.com/testshop/");
        System.out.println(driver.getTitle());
        driver.close();
    }
    
    public void htmlUnitDriver() {
        WebDriver driver = new HtmlUnitDriver();
        driver.get("http://selenium.polteq.com/testshop/");
        System.out.println(driver.getTitle());
        driver.close();
    }
    
    /*
     * You have to run a local grid for this test
     */
    public void remoteDriver() throws MalformedURLException {
        DesiredCapabilities cap = DesiredCapabilities.firefox();
        
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
        driver.get("http://selenium.polteq.com/testshop/");
        System.out.println(driver.getTitle());
        driver.close();
    }

}
