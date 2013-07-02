package org.testshop.store;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testshop.config.TestConfiguration;

public class DriverBase {
	protected TestConfiguration config = new TestConfiguration();
	
	@BeforeClass
	public void setUp() {
		WebDriver driver = new FirefoxDriver();
		config.setDriver(driver);
	}
	
	@AfterClass
	public void tearDown() {
		config.getDriver().quit();
	}
}
