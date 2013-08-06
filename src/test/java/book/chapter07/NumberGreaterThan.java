package book.chapter07;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

@Test
public class NumberGreaterThan {

  public void testAssert() {
    int n = 4;
    assertThat("Assert that n is greater than 6", n, Matchers.greaterThan(6));
  }
}
