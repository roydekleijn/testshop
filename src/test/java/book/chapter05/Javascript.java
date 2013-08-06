package book.chapter05;

import book.chapter09.tests.DriverBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

@Test
public class Javascript extends DriverBase {
  /* start */
  public void executeJavascript() {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("return document.title");
  }
  /* end */
}
