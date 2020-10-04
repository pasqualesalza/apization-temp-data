package com.stackoverflow.api;

/**
 * Get the last three chars from any string - Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15253450">https://stackoverflow.com/a/15253450</a>
 */
public class APIzator15253450 {

  public static void getChar() throws RuntimeException {
    if (word.length() == 3) {
      return word;
    } else if (word.length() > 3) {
      return word.substring(word.length() - 3);
    } else {
      // whatever is appropriate in this case
      throw new IllegalArgumentException("word has less than 3 characters!");
    }
  }
}
