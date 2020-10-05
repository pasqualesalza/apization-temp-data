package com.stackoverflow.api;

import java.util.HashMap;
import java.util.Map;

/**
 * java: HashMap<String, int> not working
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1780390">https://stackoverflow.com/a/1780390</a>
 */
public class APIzator1780390 {

  public static void java(Map<String, Integer> myMap) throws RuntimeException {
    int i = myMap.get("foo");
    int i = myMap.get("foo").intValue();
    // NullPointerException
    int i = myMap.get("bar");
    Integer i = (Integer) myMap.get("foo");
    Map<String, Integer> myMap = new HashMap<String, Integer>();
    Map<Integer, String> map2 = (Map<Integer, String>) myMap;
    map2.put(3, "foo");
  }
}
