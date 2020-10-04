package com.stackoverflow.api;

/**
 * How to remove line breaks from a file in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2163056">https://stackoverflow.com/a/2163056</a>
 */
public class APIzator2163056 {

  public static void removeBreak(String str1) throws RuntimeException {
    String text = readFileAsString(str1);
    text = text.replace("\n", "").replace("\r", "");
  }
}
