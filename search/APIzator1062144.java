package com.stackoverflow.api;

import java.util.IdentityHashMap;

/**
 * Updating a java map entry
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1062144">https://stackoverflow.com/a/1062144</a>
 */
public class APIzator1062144 {

  public static void updateEntry(IdentityHashMap table, int key, int val)
    throws RuntimeException {
    table.put(key, val);
  }
}
