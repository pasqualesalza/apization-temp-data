package com.stackoverflow.api;

import java.util.Map;
import java.util.TreeMap;

/**
 * How print out the contents of a HashMap<String, String> in ascending order based on its values?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3605320">https://stackoverflow.com/a/3605320</a>
 */
public class APIzator3605320 {

  public static void print() throws RuntimeException {
    Map<String, String> reversedMap = new TreeMap<String, String>(codes);
    // then you just access the reversedMap however you like...
    for (Map.Entry entry : reversedMap.entrySet()) {
      System.out.println(entry.getKey() + ", " + entry.getValue());
    }
  }
}
