package book.chapter07;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

@Test
public class NumberLessThan {
  /* start */
  public void testAssert() {
    int n = 4;
    assertThat("Assert that n is less than 3", n,
        Matchers.lessThan(3));
  }
  /* end */
}
