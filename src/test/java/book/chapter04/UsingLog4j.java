package book.chapter04;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

@Test
public class UsingLog4j {
  private static Logger log = LogManager.getLogger(UsingLog4j.class
      .getName());

  public void testLog4j() {
    log.info("Information message");
    log.debug("Debug message");
    log.debug("Error message");
  }
}
