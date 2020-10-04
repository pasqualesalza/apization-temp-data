package com.stackoverflow.api;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Map;

/**
 * How to putAll on Java hashMap contents of one to another, but not replace existing keys and values?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7194914">https://stackoverflow.com/a/7194914</a>
 */
public class APIzator7194914 {

  public static void putall(IdentityHashMap target, Map patch)
    throws RuntimeException {
    Map tmp = new HashMap(patch);
    tmp.keySet().removeAll(target.keySet());
    target.putAll(tmp);
    patch.forEach(target::putIfAbsent);
  }
}
