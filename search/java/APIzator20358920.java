package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * How to quickly and conveniently create a one element arraylist
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/20358920">https://stackoverflow.com/a/20358920</a>
 */
public class APIzator20358920 {

  public static void createArraylist() throws RuntimeException {
    // Returns a List backed by a varargs T.
    return Arrays.asList(s);
    return new ArrayList<String>(Arrays.asList(s));
    return new ArrayList<>(Arrays.asList(s));
  }
}
