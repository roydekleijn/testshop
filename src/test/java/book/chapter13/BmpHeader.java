package book.chapter13;

import org.testng.annotations.Test;

@Test(groups = {"chapter13"})
public class BmpHeader extends BmpDriverBase {

  public void addHeader() throws InterruptedException {
    server.newHar("amazon.com - addHeader");
    server.addHeader("user-agent", "Mozilla/5.0 (iPhone; U; CPU like Mac OS X; en)");
    driver.get("http://www.amazon.com");
    Thread.sleep(7500);
  }

}
