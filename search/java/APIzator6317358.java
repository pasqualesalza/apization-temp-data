package com.stackoverflow.api;

/**
 * How to force Selenium WebDriver to click on element which is not currently visible?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6317358">https://stackoverflow.com/a/6317358</a>
 */
public class APIzator6317358 {

  public static void forceWebdriver() throws RuntimeException {
    ((JavascriptExecutor) driver).executeScript(
        "arguments[0].checked = true;",
        inputElement
      );
  }
}
