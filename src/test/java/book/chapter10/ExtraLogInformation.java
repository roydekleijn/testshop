package book.chapter10;

import org.testng.Reporter;

import org.testng.annotations.Test;

@Test
public class ExtraLogInformation {

  /* start */
  public void addLogInformationToReports() {
    Reporter.log("This is everything required to add extra log information to the reports");
  }
  /* end */
}
