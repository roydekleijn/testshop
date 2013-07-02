package sandbox.interactWithBrowser;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class RegisterTest extends DriverBase {

	public void register() {
		// Navigate to login page
		driver.findElement(By.className("login")).click();

		Random r = new Random();
		driver.findElement(By.id("email_create")).sendKeys(
				"test" + r.nextInt() + "@test.com");

		driver.findElement(By.id("SubmitCreate")).click();

		driver.findElement(By.id("id_gender1")).click();

		driver.findElement(By.id("customer_firstname")).sendKeys("tester");
		driver.findElement(By.id("customer_lastname")).sendKeys("tester");
		driver.findElement(By.id("passwd")).sendKeys("tester");

		Select days = new Select(driver.findElement(By.id("days")));
		days.selectByIndex(5);

		Select months = new Select(driver.findElement(By.id("months")));
		months.selectByIndex(5);
		Select years = new Select(driver.findElement(By.id("years")));
		years.selectByIndex(5);

		driver.findElement(By.id("customer_privacy")).click();

		driver.findElement(By.id("submitAccount")).click();
	}
}
