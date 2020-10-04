package com.stackoverflow.api;

/**
 * The most sophisticated way for creating comma-separated Strings from a Collection/Array/List?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/205712">https://stackoverflow.com/a/205712</a>
 */
public class APIzator205712 {

  public static void way() throws RuntimeException {
    StringBuilder result = new StringBuilder();
    for (String string : collectionOfStrings) {
      result.append(string);
      result.append(",");
    }
    return result.length() > 0 ? result.substring(0, result.length() - 1) : "";
  }
}
