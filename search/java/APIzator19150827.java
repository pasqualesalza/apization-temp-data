package com.stackoverflow.api;

/**
 * Selenium Webdriver: Entering text into text field
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19150827">https://stackoverflow.com/a/19150827</a>
 */
public class APIzator19150827 {

  public static void webdriver() throws RuntimeException {
    element_enter
      .findElement(
        By.xpath("//html/body/div[1]/div[3]/div[1]/form/div/div/input")
      )
      .sendKeys(barcode);
  }
}
