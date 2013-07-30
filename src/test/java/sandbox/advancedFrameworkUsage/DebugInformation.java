package sandbox.advancedFrameworkUsage;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class DebugInformation {

  static Logger logger = Logger.getLogger(DebugInformation.class);

  @Test
  public void testDebugInformation() {
    logger.info("Does it work?");
  }
}
