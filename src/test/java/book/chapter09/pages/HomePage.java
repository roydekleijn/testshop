package book.chapter09.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

  @FindBy(how = How.CSS, using = "h1#etsy a")
  private WebElement homeLink;

  @FindBy(how = How.CSS, using = "a#register")
  private WebElement registerLink;

  @FindBy(how = How.CSS, using = "a#sign-in")
  private WebElement signinLink;

  public HomePage(WebDriver driver) {
    PageFactory.initElements(driver, this);
  }

  public void clickRegisterLink() {
    registerLink.click();
  }

  public void clickSigninLink() {
    signinLink.click();
  }
}
