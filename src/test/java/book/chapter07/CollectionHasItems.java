package book.chapter07;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

@Test
public class CollectionHasItems {

  public void testAssert() {
    List<String> list = new ArrayList<String>();
    list.add("test");
    list.add("webdriver");
    assertThat("Assert that the list contains: tedst", list,
        Matchers.hasItems("tedst"));
  }
}
