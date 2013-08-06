package org.testshop.config;

import org.openqa.selenium.WebDriver;

public class TestConfiguration {

  private WebDriver driver;

  public WebDriver getDriver() {
    return driver;
  }

  public void setDriver(WebDriver driver) {
    this.driver = driver;
  }

}
