package com.stackoverflow.api;

/**
 * How to perform mouseover function in Selenium WebDriver using Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17294390">https://stackoverflow.com/a/17294390</a>
 */
public class APIzator17294390 {

  public static void performFunction() throws RuntimeException {
    Actions action = new Actions(webdriver);
    WebElement we = webdriver.findElement(
      By.xpath("html/body/div[13]/ul/li[4]/a")
    );
    action
      .moveToElement(we)
      .moveToElement(webdriver.findElement(By.xpath("/expression-here")))
      .click()
      .build()
      .perform();
  }
}
