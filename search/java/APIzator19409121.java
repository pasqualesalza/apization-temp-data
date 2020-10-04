package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;
import com.gargoylesoftware.htmlunit.javascript.host.Set;

/**
 * How to handle Pop-up in Selenium WebDriver using Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19409121">https://stackoverflow.com/a/19409121</a>
 */
public class APIzator19409121 {

  public static void handleUp() throws RuntimeException {
    // Store your parent window
    String parentWindowHandler = driver.getWindowHandle();
    String subWindowHandler = null;
    // get all window handles
    Set<String> handles = driver.getWindowHandles();
    Iterator<String> iterator = handles.iterator();
    while (iterator.hasNext()) {
      subWindowHandler = iterator.next();
    }
    // switch to popup window
    driver.switchTo().window(subWindowHandler);
    // Now you are in the popup window, perform necessary actions here
    // switch back to parent window
    driver.switchTo().window(parentWindowHandler);
  }
}
