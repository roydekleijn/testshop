package sandbox.advancedFrameworkUsage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class DebugInformation {

  private static Logger log = LogManager
      .getLogger(DebugInformation.class.getName());

  @Test
  public void testDebugInformation() {
    log.info("Information message");
    log.debug("Debug message");
    log.error("Error message");
    log.fatal("Fatal message");
  }
}
