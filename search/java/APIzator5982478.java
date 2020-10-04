package com.stackoverflow.api;

/**
 * How to convert Set<String> to String[]?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5982478">https://stackoverflow.com/a/5982478</a>
 */
public class APIzator5982478 {

  public static String[] convertSet() throws RuntimeException {
    return myset.toArray(new String[myset.size()]);
  }
}
