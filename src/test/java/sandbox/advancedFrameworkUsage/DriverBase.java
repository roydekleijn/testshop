package sandbox.advancedFrameworkUsage;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

class DriverBase {

    protected FirefoxDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("http://selenium.polteq.com/testshop/index.php");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
