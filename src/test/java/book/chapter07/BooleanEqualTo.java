package book.chapter07;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

@Test
public class BooleanEqualTo {

  public void testAssert() {
    boolean b = false;
    assertThat("Assert boolean b against expected result: true", b,
        Matchers.equalTo(true));
  }
}
