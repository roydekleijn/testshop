package book.chapter09.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignInPageAbstractPage {
  @FindBy(how = How.CSS, using = "input#username-existing")
  private WebElement usernameTextfield;

  @FindBy(how = How.CSS, using = "input#password-existing")
  private WebElement passwordTextfield;

  @FindBy(how = How.CSS, using = "input#signin_button")
  private WebElement signInButton;

  public SignInPageAbstractPage(WebDriver driver) {
    PageFactory.initElements(driver, this);
  }

  public SignInPageAbstractPage setUsername(String username) {
    usernameTextfield.sendKeys(username);
    return this;
  }

  public SignInPageAbstractPage setPassword(String password) {
    passwordTextfield.sendKeys(password);
    return this;
  }

  public void submitForm() {
    signInButton.click();
  }
}
