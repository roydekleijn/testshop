package book.chapter07;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

@Test
public class NumberEqualTo {
  /* start */
  public void testAssert() {
    int n = 4;
    assertThat("Assert that n is equal to 5", n,
        Matchers.equalTo(5));
  }
  /* end */
}
