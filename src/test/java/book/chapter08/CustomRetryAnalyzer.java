package book.chapter08;

import org.testng.ITestResult;
import org.testng.util.RetryAnalyzerCount;

/* start */
public class CustomRetryAnalyzer extends RetryAnalyzerCount {

  public CustomRetryAnalyzer() {
    setCount(3);
  }

  @Override
  public boolean retryMethod(ITestResult result) {
    if (result.isSuccess()) {
      return false;
    } else {
      return true;
    }
  }
}
/* end */
