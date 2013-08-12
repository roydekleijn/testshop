package book.chapter07;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

@Test
public class StringContainsString {
  /* start */
  public void testAssert() {
    String s = "This is some text.";
    assertThat("Assert s to check if string contains", s,
        Matchers.containsString("sme"));
  }
  /* end */
}
