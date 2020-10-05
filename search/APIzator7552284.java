package com.stackoverflow.api;

/**
 * How to remove special characters from a string?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7552284">https://stackoverflow.com/a/7552284</a>
 */
public class APIzator7552284 {

  public static String removeCharacter() throws RuntimeException {
    String result = yourString.replaceAll("[-+.^:,]", "");
    String result = yourString.replaceAll("[\\-\\+\\.\\^:,]", "");
    String result = yourString.replaceAll("[^\\w\\s]", "");
    return yourString.replaceAll("[^\\p{L}\\p{Z}]", "");
  }
}
