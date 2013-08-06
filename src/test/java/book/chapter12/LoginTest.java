package book.chapter12;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

// Reference: http://www.softwareishard.com/blog/firebug/automate-page-load-performance-testing-with-firebug-and-selenium/

@Test
public class LoginTest extends DriverBaseNetExport {

	public void loginNetExport() {
		// Navigate to login page
		driver.findElement(By.className("login")).click();

		// Fill in the form
		driver.findElement(By.id("email")).sendKeys("tester@test.com");
		driver.findElement(By.id("passwd")).sendKeys("tester");
		driver.findElement(By.id("SubmitLogin")).click();
	}

}
