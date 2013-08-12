package book.chapter09.chaining.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
  private WebDriver driver;

  @FindBy(how = How.CSS, using = "input#username-existing")
  private WebElement usernameTextfield;

  @FindBy(how = How.CSS, using = "input#password-existing")
  private WebElement passwordTextfield;

  @FindBy(how = How.CSS, using = "input#signin_button")
  private WebElement signInButton;

  public SignInPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public SignInPage setUsername(String username) {
    usernameTextfield.sendKeys(username);
    return this;
  }

  public SignInPage setPassword(String password) {
    passwordTextfield.sendKeys(password);
    return this;
  }

  public MemberPage submitForm() {
    signInButton.click();
    return new MemberPage(driver);
  }
}
