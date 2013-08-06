package book.chapter07;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

@Test
public class CombinedAllOf {
  /* start */
  public void testAssert() {
    String s = "This is some text.";
    assertThat(
        "Assert a string starting with Tis and a string ending with ext.",
        s,
        Matchers.allOf(Matchers.startsWith("Tis"),
            Matchers.endsWith("ext.")));
  }
  /* end */
}
