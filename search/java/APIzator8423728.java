package com.stackoverflow.api;

/**
 * How to create a custom exception type in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8423728">https://stackoverflow.com/a/8423728</a>
 */
public class APIzator8423728 {

  public static void createType() throws RuntimeException {
    try {
      if (word.contains(" ")) {
        throw new WordContainsException();
      }
    } catch (WordContainsException ex) {
      // Process message however you would like
    }
  }
}
