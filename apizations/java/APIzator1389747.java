package com.stackoverflow.api;

/**
 * How do I create a unique ID in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1389747">https://stackoverflow.com/a/1389747</a>
 */
public class APIzator1389747 {

  public static String createId() throws RuntimeException {
    return UUID.randomUUID().toString();
  }
}
