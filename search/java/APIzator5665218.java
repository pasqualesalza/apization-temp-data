package com.stackoverflow.api;

/**
 * Difference between webdriver.get() and webdriver.navigate()
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5665218">https://stackoverflow.com/a/5665218</a>
 */
public class APIzator5665218 {

  public static void difference() throws RuntimeException {
    driver.get("http://www.google.com");
    driver.navigate().to("http://www.example.com");
    driver.navigate().forward();
    driver.navigate().back();
  }
}
