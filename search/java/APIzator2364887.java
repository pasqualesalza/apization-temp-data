package com.stackoverflow.api;

import com.google.gwt.user.client.rpc.core.java.util.Arrays;

/**
 * initializing a boolean array in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2364887">https://stackoverflow.com/a/2364887</a>
 */
public class APIzator2364887 {

  public static void initializeArray() throws RuntimeException {
    boolean[] array = new boolean[size];
    Boolean[] array = new Boolean[size];
    Arrays.fill(array, Boolean.FALSE);
  }
}
