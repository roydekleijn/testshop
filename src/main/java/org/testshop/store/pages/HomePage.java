package org.testshop.store.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testshop.config.TestConfiguration;
import org.testshop.store.IPage;
import org.testshop.store.PageBase;

public class HomePage extends PageBase implements IPage<HomePage> {

  @FindBy(how = How.CSS, using = "a.login")
  private WebElement loginLink;

  public HomePage(TestConfiguration config) {
    super(config);
  }

  public HomePage get() {
    getConfig().getDriver().get(
        "http://selenium.polteq.com/testshop/index.php");
    return this;
  }

  public LoginPage clickOnLoginLink() {
    loginLink.click();
    return new LoginPage(config);
  }

}
