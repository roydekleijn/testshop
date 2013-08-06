package book.chapter13;

import org.testng.annotations.Test;

@Test(groups = {"chapter13"})
public class BmpBandwidthThreshold extends BmpDriverBase {

  public void changeThreshold() throws InterruptedException {
    server.newHar("amazon.com - change threshold");
    server.getStreamManager().enable();
    server.getStreamManager().setMaxBitsPerSecondThreshold(75);
    driver.get("http://www.amazon.com");
    Thread.sleep(7500);
  }
}
