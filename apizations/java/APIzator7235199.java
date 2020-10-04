package com.stackoverflow.api;

/**
 * Selenium WebDriver and DropDown Boxes
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7235199">https://stackoverflow.com/a/7235199</a>
 */
public class APIzator7235199 {

  public static void webdriver() throws RuntimeException {
    IWebElement dropDownListBox = driver.findElement(By.Id("selection"));
    SelectElement clickThis = new SelectElement(dropDownListBox);
    clickThis.SelectByText("Germany");
  }
}
