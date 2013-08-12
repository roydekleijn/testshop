package book.chapter13;

import org.testng.annotations.Test;

@Test(groups = { "chapter13" })
public class BmpRequestTimeout extends BmpDriverBase {

  public void requestTimeout() throws InterruptedException {
    server.newHar("amazon.com - set request timeout");
    server.setRequestTimeout(900);
    driver.get("http://www.amazon.com");
    Thread.sleep(7500);
  }
}
