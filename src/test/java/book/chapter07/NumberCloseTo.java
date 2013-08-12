package book.chapter07;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

@Test
public class NumberCloseTo {
  /* start */
  public void testAssert() {
    double a = 5.0;
    assertThat("Assert that a is close to 7.0", a,
        Matchers.closeTo(7.0, 1.0));
  }
  /* end */
}
