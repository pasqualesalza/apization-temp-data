package com.stackoverflow.api;

/**
 * Alert handling in Selenium WebDriver (selenium 2) with Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13714614">https://stackoverflow.com/a/13714614</a>
 */
public class APIzator13714614 {

  public static void checkAlert() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 2);
      wait.until(ExpectedConditions.alertIsPresent());
      Alert alert = driver.switchTo().alert();
      alert.accept();
    } catch (Exception e) {
      // exception handling
    }
  }
}
