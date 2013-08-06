package book.chapter13;

import org.testng.annotations.Test;

@Test(groups = {"chapter13"})
public class BmpBasicAuthorization extends BmpDriverBase {

  public void basicAuthorization() throws InterruptedException {
    server.newHar("amazon.com - auto Basic Authorization");
    server.autoBasicAuthorization("http://www.amazon.com", "tester", "tester");
    driver.get("http://www.amazon.com");
    Thread.sleep(7500);
  }
}
