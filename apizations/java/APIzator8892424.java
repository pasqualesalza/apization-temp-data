package com.stackoverflow.api;

import java.util.Collection;
import java.util.Collection;

/**
 * Convert Set to List without creating new List
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8892424">https://stackoverflow.com/a/8892424</a>
 */
public class APIzator8892424 {

  public static void set(Collection mainList, Collection set)
    throws RuntimeException {
    mainList.addAll(set);
  }
}
