package org.testshop.store.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testshop.config.TestConfiguration;
import org.testshop.store.IPage;
import org.testshop.store.PageBase;

public class LoginPage extends PageBase implements IPage<LoginPage> {

  @FindBy(how = How.CSS, using = "unput#email")
  private WebElement usernameTextfield;

  @FindBy(how = How.CSS, using = "input#passwd")
  private WebElement passwordTextfield;

  @FindBy(how = How.CSS, using = "input#SubmitLogin")
  private WebElement submitButton;

  public LoginPage(TestConfiguration config) {
    super(config);
  }

  public LoginPage get() {
    getConfig()
        .getDriver()
        .get(
            "http://selenium.polteq.com/testshop/index.php?controller=authentication");
    return this;
  }

  public void loginWithUsernameAndPassword(String username, String password) {
    usernameTextfield.sendKeys(username);
    passwordTextfield.sendKeys(password);
    submitButton.click();
  }

}
