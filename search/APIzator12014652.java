package com.stackoverflow.api;

/**
 * Java: Retrieving an element from a HashSet
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12014652">https://stackoverflow.com/a/12014652</a>
 */
public class APIzator12014652 {

  public static MyObject findIfPresent(MyObject source, HashSet<MyObject> set) {
    if (set.contains(source)) {
      for (MyObject obj : set) {
        if (obj.equals(source)) return obj;
      }
    }
    return null;
  }
}
