package com.stackoverflow.api;

/**
 * How to use JavaScript with Selenium WebDriver Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11439939">https://stackoverflow.com/a/11439939</a>
 */
public class APIzator11439939 {

  public static void useJavascript() throws RuntimeException {
    WebDriver driver = new AnyDriverYouWant();
    if (driver instanceof JavascriptExecutor) {
      ((JavascriptExecutor) driver).executeScript("yourScript();");
    } else {
      throw new IllegalStateException(
        "This driver does not support JavaScript!"
      );
    }
    WebDriver driver = new AnyDriverYouWant();
    JavascriptExecutor js;
    if (driver instanceof JavascriptExecutor) {
      js = (JavascriptExecutor) driver;
    }
    // else throw...
    // later on...
    js.executeScript("return document.getElementById('someId');");
    // returns the right WebElement
    // it's the same as driver.findElement(By.id("someId"))
    js.executeScript("return document.getElementById('someId');");
    // draws a border around WebElement
    WebElement element = driver.findElement(By.anything("tada"));
    js.executeScript("arguments[0].style.border='3px solid red'", element);
    // changes all input elements on the page to radio buttons
    js.executeScript(
      "var inputs = document.getElementsByTagName('input');" +
      "for(var i = 0; i < inputs.length; i++) { " +
      "    inputs[i].type = 'radio';" +
      "}"
    );
  }
}
