package com.stackoverflow.api;

/**
 * How to open a new tab using Selenium WebDriver with Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19441842">https://stackoverflow.com/a/19441842</a>
 */
public class APIzator19441842 {

  public static void openTab() throws RuntimeException {
    String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
    driver.findElement(By.linkText("urlLink")).sendKeys(selectLinkOpeninNewTab);
    String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, "t");
    driver.findElement(By.linkText("urlLink")).sendKeys(selectLinkOpeninNewTab);
  }
}
