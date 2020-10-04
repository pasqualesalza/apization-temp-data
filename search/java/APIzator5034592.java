package com.stackoverflow.api;

/**
 * Indexes of all occurrences of character in a string
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5034592">https://stackoverflow.com/a/5034592</a>
 */
public class APIzator5034592 {

  public static void index() throws RuntimeException {
    int index = word.indexOf(guess);
    while (index >= 0) {
      System.out.println(index);
      index = word.indexOf(guess, index + 1);
    }
    for (
      int index = word.indexOf(guess);
      index >= 0;
      index = word.indexOf(guess, index + 1)
    ) {
      System.out.println(index);
    }
  }
}
