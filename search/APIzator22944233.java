package com.stackoverflow.api;

import java.util.ArrayList;

/**
 * Switch tabs using Selenium WebDriver with Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/22944233">https://stackoverflow.com/a/22944233</a>
 */
public class APIzator22944233 {

  public static void switchTab() throws RuntimeException {
    psdbComponent.clickDocumentLink();
    ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(tabs2.get(1));
    driver.close();
    driver.switchTo().window(tabs2.get(0));
  }
}
