package com.stackoverflow.api;

import clojure.asm.Item;
import com.google.appengine.api.datastore.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Java: How to convert List to Map
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4138420">https://stackoverflow.com/a/4138420</a>
 */
public class APIzator4138420 {

  public static void java() throws RuntimeException {
    List<Item> list;
    Map<Key, Item> map = new HashMap<Key, Item>();
    for (Item i : list) map.put(i.getKey(), i);
  }
}
