package InteractWithBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class FormTest extends DriverBase {

    public void completeForm() throws InterruptedException {
        // Navigate to contact page
        driver.findElement(By.cssSelector("li#header_link_contact a")).click();

        // Complete form
        Select subject = new Select(driver.findElement(By.id("id_contact")));
        subject.selectByVisibleText("Customer service");

        driver.findElement(By.id("email")).sendKeys("tester@test.com");

        driver.findElement(By.id("id_order")).sendKeys("12345");

        driver.findElement(By.id("message")).sendKeys(
                "Message of what went wrong");

        driver.findElement(By.id("submitMessage")).click();
    }
}
