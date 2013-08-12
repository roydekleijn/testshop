package book.chapter05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Chrome {
  /* start */
  public void startChromeBrowser() {
    System
        .setProperty("webdriver.chrome.driver", this.getClass()
            .getClassLoader().getResource("chromedriver.exe")
            .getPath());
    WebDriver driver = new ChromeDriver();
    driver.get("http://selenium.polteq.com/testshop/");
    System.out.println(driver.getTitle());
    driver.quit();
  }
  /* end */
}
