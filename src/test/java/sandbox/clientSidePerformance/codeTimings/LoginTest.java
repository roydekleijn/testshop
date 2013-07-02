package sandbox.clientSidePerformance.codeTimings;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

@Test
public class LoginTest extends DriverBase {

	public void loginCodeTimings() {
		// Navigate to login page
		long startTime = System.currentTimeMillis();
		driver.findElement(By.className("login")).click();

		// Fill in the form
		driver.findElement(By.id("email")).sendKeys("tester@test.com");
		driver.findElement(By.id("passwd")).sendKeys("tester");
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Totaltime: " + totalTime + "milliseconds");
		driver.findElement(By.id("SubmitLogin")).click();
	}

	public void loginCodeTimingsTimerClass() {
		// Navigate to login page
		Timer timer = new Timer();
		timer.start();
		driver.findElement(By.className("login")).click();

		// Fill in the form
		driver.findElement(By.id("email")).sendKeys("tester@test.com");
		driver.findElement(By.id("passwd")).sendKeys("tester");
		timer.end();
		System.out.println("Totaltime: " + timer.getTotalTime()
				+ " milliseconds");
		driver.findElement(By.id("SubmitLogin")).click();
	}

}
