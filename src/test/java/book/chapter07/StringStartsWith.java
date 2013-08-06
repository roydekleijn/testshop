package book.chapter07;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

@Test
public class StringStartsWith {

  public void testAssert() {
    String s = "This is some text.";
    assertThat("Assert s to match the beginning of the string", s,
        Matchers.startsWith("Ths"));
  }
}
