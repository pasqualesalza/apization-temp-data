package com.stackoverflow.api;

import org.apache.ibatis.annotations.Select;

/**
 * How to select a dropdown value in Selenium WebDriver using Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/20140481">https://stackoverflow.com/a/20140481</a>
 */
public class APIzator20140481 {

  public static void selectValue() throws RuntimeException {
    Select dropdown = new Select(driver.findElement(By.id("identifier")));
    dropdown.selectByValue("prog");
  }
}
