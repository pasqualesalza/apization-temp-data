package com.stackoverflow.api;

/**
 * Comparing chars in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5034600">https://stackoverflow.com/a/5034600</a>
 */
public class APIzator5034600 {

  public static void compareChar() throws RuntimeException {
    if ((symbol >= 'A' && symbol <= 'Z') || symbol == '?') {
      // ...
    }
    if (symbol.matches("[A-Z?]")) {
      // ...
    }
    if (Character.toString(symbol).matches("[A-Z?]")) {
      // ...
    }
  }
}
