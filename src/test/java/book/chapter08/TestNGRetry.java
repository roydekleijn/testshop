package book.chapter08;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class TestNGRetry {

  @Test(retryAnalyzer = CustomRetryAnalyzer.class)
  public void testForRetry() {
    Assert.assertEquals(new Random().nextInt(5), 3);
  }

}
