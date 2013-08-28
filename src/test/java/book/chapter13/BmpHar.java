package book.chapter13;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(groups = {"chapter13"})
public class BmpHar extends BmpDriverBase {

  @BeforeMethod
  public void createNewHar() {
    // create a new HAR with the label "amazon.com"
    server.newHar("amazon.com - getHar");
  }

  @AfterMethod
  public void displayHar() {
    // get the HAR data
    System.out
        .println(server.getHar().getLog().getEntries().size());
  }

  public void createHar() throws Exception {
    driver.get("http://www.amazon.com");
    Thread.sleep(7500);
  }
}
