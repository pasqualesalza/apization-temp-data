package com.stackoverflow.api;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * HashMap - getting First Key value
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/26230259">https://stackoverflow.com/a/26230259</a>
 */
public class APIzator26230259 {

  public static String getValue(Map<String, String> map)
    throws RuntimeException {
    Map<String, String> map = new HashMap<>();
    Map.Entry<String, String> entry = map.entrySet().iterator().next();
    String key = entry.getKey();
    String value = entry.getValue();
    Map.Entry<String, String> entry = map.entrySet().iterator().next();
    String key = entry.getKey();
    String value = entry.getValue();
    System.out.println(key);
    return value;
  }
}
