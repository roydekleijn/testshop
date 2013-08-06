package book.chapter13;

import org.testng.annotations.Test;

@Test(groups = {"chapter13"})
public class BmpBandwidthDownstream extends BmpDriverBase {

  public void changeDownstream() throws InterruptedException {
    server.newHar("amazon.com - change downstream");
    server.getStreamManager().enable();
    server.getStreamManager().setDownstreamKbps(125);
    driver.get("http://www.amazon.com");
    Thread.sleep(7500);
  }
}
