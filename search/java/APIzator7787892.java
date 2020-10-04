package com.stackoverflow.api;

import com.google.gwt.user.client.rpc.core.java.util.Arrays;

/**
 * sorting integers in order lowest to highest java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7787892">https://stackoverflow.com/a/7787892</a>
 */
public class APIzator7787892 {

  public static String sortInteger(int[] ints) throws RuntimeException {
    Arrays.sort(ints);
    return Arrays.asList(ints);
  }
}
