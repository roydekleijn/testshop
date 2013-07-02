package sandbox.advancedFrameworkUsage;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.util.RetryAnalyzerCount;

public class myRetryAnalyzer extends RetryAnalyzerCount {

	public myRetryAnalyzer() {
		setCount(99);
	}

	@Override
	public boolean retryMethod(ITestResult result) {
	    DriverBase base = (DriverBase) result.getMethod().getInstance();
	    WebDriver driver = base.driver;
	    
		if (result.isSuccess()) {
			return false;
		} else {
			return true;
		}
	}

}
