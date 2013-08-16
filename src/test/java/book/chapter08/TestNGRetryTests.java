package book.chapter08;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

/* start */
@Test(retryAnalyzer = CustomRetryAnalyzer.class)
public class TestNGRetryTests {

  public void testForRetry() {
    Assert.assertEquals(new Random().nextInt(5), 3);
  }
}
/* end */
