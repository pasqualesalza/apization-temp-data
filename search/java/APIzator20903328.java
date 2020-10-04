package com.stackoverflow.api;

/**
 * How to wait until an element is present in Selenium?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/20903328">https://stackoverflow.com/a/20903328</a>
 */
public class APIzator20903328 {

  public static WebElement wait() throws RuntimeException {
    FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
      .withTimeout(30, TimeUnit.SECONDS)
      .pollingEvery(200, TimeUnit.MILLISECONDS)
      .ignoring(NoSuchElementException.class);
    return (new WebDriverWait(driver, 10)).until(
        ExpectedConditions.elementToBeClickable(By.id("someid"))
      );
  }
}
