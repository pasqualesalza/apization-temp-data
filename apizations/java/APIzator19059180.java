package com.stackoverflow.api;

/**
 * How to click a link whose href has a certain substring in Selenium?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19059180">https://stackoverflow.com/a/19059180</a>
 */
public class APIzator19059180 {

  public static void clickLink() throws RuntimeException {
    driver.findElement(By.cssSelector("a[href*='long']")).click();
  }
}
