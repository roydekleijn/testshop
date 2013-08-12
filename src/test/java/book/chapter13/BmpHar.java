package book.chapter13;

import org.testng.annotations.Test;

@Test(groups = { "chapter13" })
public class BmpHar extends BmpDriverBase {

  public void createHar() throws Exception {
    // create a new HAR with the label "amazon.com"
    server.newHar("amazon.com - getHar");

    driver.get("http://www.amazon.com");
    Thread.sleep(7500);

    // get the HAR data
    System.out
        .println(server.getHar().getLog().getEntries().size());
  }
}
