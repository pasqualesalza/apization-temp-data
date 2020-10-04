package com.stackoverflow.api;

/**
 * Finding Key associated with max Value in a Java Map
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5911199">https://stackoverflow.com/a/5911199</a>
 */
public class APIzator5911199 {

  public static void findKey() throws RuntimeException {
    Map.Entry<Foo, Bar> maxEntry = null;
    for (Map.Entry<Foo, Bar> entry : map.entrySet()) {
      if (
        maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0
      ) {
        maxEntry = entry;
      }
    }
  }
}
