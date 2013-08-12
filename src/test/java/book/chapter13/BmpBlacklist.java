package book.chapter13;

import org.testng.annotations.Test;

@Test(groups = { "chapter13" })
public class BmpBlacklist extends BmpDriverBase {

  public void blacklist() throws InterruptedException {
    server.newHar("amazon.com - blacklist");
    server
        .blacklistRequests("http://ecx.images-amazon.com/.*", 404);
    server
        .blacklistRequests(
            "http://z-ecx.images-amazon.com/images/G/01/browser-scripts/.*",
            404);
    driver.get("http://www.amazon.com");
    Thread.sleep(7500);
  }

}
