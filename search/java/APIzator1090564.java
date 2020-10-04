package com.stackoverflow.api;

import java.util.IdentityHashMap;

/**
 * Java: how to convert HashMap<String, Object> to array
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1090564">https://stackoverflow.com/a/1090564</a>
 */
public class APIzator1090564 {

  public static void java(IdentityHashMap hashMap) throws RuntimeException {
    // returns an array of keys
    hashMap.keySet().toArray();
    // returns an array of values
    hashMap.values().toArray();
  }
}
