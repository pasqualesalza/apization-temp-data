package com.stackoverflow.api;

import EDU.oswego.cs.dl.util.concurrent.ConcurrentHashMap;
import com.gargoylesoftware.htmlunit.javascript.host.Map;

/**
 * Print all key/value pairs in a Java ConcurrentHashMap
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/22663205">https://stackoverflow.com/a/22663205</a>
 */
public class APIzator22663205 {

  public static void printPair() throws RuntimeException {
    ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
    map.put("A", 1);
    map.put("B", 2);
    map.put("C", 3);
    for (String key : map.keySet()) {
      System.out.println(key + " " + map.get(key));
    }
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      String key = entry.getKey().toString();
      Integer value = entry.getValue();
      System.out.println("key, " + key + " value " + value);
    }
  }
}
