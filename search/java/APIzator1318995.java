package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.Map;

/**
 * How to iterate over a TreeMap?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1318995">https://stackoverflow.com/a/1318995</a>
 */
public class APIzator1318995 {

  public static void iterate() throws RuntimeException {
    for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
      String key = entry.getKey();
      Integer value = entry.getValue();
      System.out.println(key + " => " + value);
    }
  }
}
