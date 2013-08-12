package book.chapter13;

import org.testng.annotations.Test;

@Test(groups = { "chapter13" })
public class BmpBandwidthUpstream extends BmpDriverBase {

  public void changeUpstream() throws InterruptedException {
    server.newHar("amazon.com - change upstream");
    server.getStreamManager().enable();
    server.getStreamManager().setUpstreamKbps(25);
    driver.get("http://www.amazon.com");
    Thread.sleep(7500);
  }
}
