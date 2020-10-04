package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.Map;

/**
 * Get key from a HashMap using the value
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8113029">https://stackoverflow.com/a/8113029</a>
 */
public class APIzator8113029 {

  public static void get() throws RuntimeException {
    for (Map.Entry<Object, Object> e : hashmap.entrySet()) {
      Object key = e.getKey();
      Object value = e.getValue();
    }
  }
}
