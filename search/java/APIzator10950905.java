package com.stackoverflow.api;

/**
 * Equivalent of waitForVisible/waitForElementPresent in Selenium WebDriver tests using Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10950905">https://stackoverflow.com/a/10950905</a>
 */
public class APIzator10950905 {

  public static WebElement equivalent() throws RuntimeException {
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebDriverWait wait = new WebDriverWait(driver, 10);
    return wait.until(
      ExpectedConditions.visibilityOfElementLocated(By.id("someid"))
    );
  }
}
