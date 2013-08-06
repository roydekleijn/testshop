package book.chapter07;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

@Test
public class CombinedBoth {

  public void testAssert() {
    String s = "This is some text.";
    assertThat(
        "Assert a string starting with Tis and a string ending with ext.",
        s, Matchers.both(Matchers.startsWith("Tis")).and(Matchers.endsWith("ext.")));
  }
}
