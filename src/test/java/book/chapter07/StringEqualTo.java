package book.chapter07;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

@Test
public class StringEqualTo {

  public void testAssert() {
    String s = "This is some text.";
    assertThat("Assert s to match the exact text", s,
        Matchers.equalTo("Tis is some text."));
  }
}
