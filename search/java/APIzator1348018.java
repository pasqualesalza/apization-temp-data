package com.stackoverflow.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Correct way to initialize HashMap and can HashMap hold different value types?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1348018">https://stackoverflow.com/a/1348018</a>
 */
public class APIzator1348018 {

  public static void way(Map<String, Object> x) throws RuntimeException {
    Map x = new HashMap();
    Map<String, Object> x = new HashMap<String, Object>();
  }
}
