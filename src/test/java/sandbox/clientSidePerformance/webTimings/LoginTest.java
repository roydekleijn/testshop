package sandbox.clientSidePerformance.webTimings;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

@Test
public class LoginTest extends DriverBase {

	public void loginWebTimings() {
		// Navigate to login page
		driver.findElement(By.className("login")).click();

		// Fill in the form
		driver.findElement(By.id("email")).sendKeys("tester@test.com");
		driver.findElement(By.id("passwd")).sendKeys("tester");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long loadEventEnt = (Long) js
				.executeScript("return window.performance.timing.loadEventEnd;");
		Long navigationStart = (Long) js
				.executeScript("return window.performance.timing.navigationStart;");
		System.out.println("Page Load Time = "
				+ (loadEventEnt - navigationStart));
		driver.findElement(By.id("SubmitLogin")).click();
	}

}
