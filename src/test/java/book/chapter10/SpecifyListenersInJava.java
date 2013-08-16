package book.chapter10;

import org.testng.Assert;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/* start */
@Test
@Listeners({org.uncommons.reportng.HTMLReporter.class, org.uncommons.reportng.JUnitXMLReporter.class})
public class SpecifyListenersInJava {

  public void dummyTest() {
    Assert.assertTrue(true);
  }

}
/* end */
