package book.chapter05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

@Test
public class InternetExplorer {
  /* start */
  public void startInternetExplorerBrowser() {
    System.setProperty("webdriver.ie.driver", this.getClass()
        .getClassLoader().getResource("IEDriverServer.exe")
        .getPath());
    WebDriver driver = new InternetExplorerDriver();
    driver.get("http://selenium.polteq.com/testshop/");
    System.out.println(driver.getTitle());
    driver.quit();
  }
  /* end */
}
