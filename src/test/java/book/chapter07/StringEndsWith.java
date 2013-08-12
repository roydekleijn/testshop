package book.chapter07;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

@Test
public class StringEndsWith {
  /* start */
  public void testAssert() {
    String s = "This is some text.";
    assertThat("Assert s to match the end of the string", s,
        Matchers.endsWith("x."));
  }
  /* end */
}
