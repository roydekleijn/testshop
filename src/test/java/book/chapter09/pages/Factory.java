package book.chapter09.pages;

import org.openqa.selenium.WebDriver;

public class Factory {
  private WebDriver driver;

  public Factory(WebDriver driver) {
    this.driver = driver;
  }

  public HomePageAbstractFlow homePage() {
    return new HomePageAbstractFlow(driver);
  }

  public SignInPageAbstractPage signInPage() {
    return new SignInPageAbstractPage(driver);
  }
}
