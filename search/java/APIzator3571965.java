package com.stackoverflow.api;

import java.util.Arrays;
import java.util.List;

/**
 * Find if a String is present in an array
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3571965">https://stackoverflow.com/a/3571965</a>
 */
public class APIzator3571965 {

  public static boolean find() throws RuntimeException {
    List<String> dan = Arrays.asList(
      "Red",
      "Orange",
      "Yellow",
      "Green",
      "Blue",
      "Violet",
      "Orange",
      "Blue"
    );
    return dan.contains(say.getText());
  }
}
