package com.stackoverflow.api;

import com.google.gwt.user.client.rpc.core.java.util.Arrays;

/**
 * casting Object array to Integer array error
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8220245">https://stackoverflow.com/a/8220245</a>
 */
public class APIzator8220245 {

  public static Integer[] castArray(Object[] a, Integer b)
    throws RuntimeException {
    Integer[] integerArray = Arrays.copyOf(a, a.length, Integer[].class);
    Integer[] integerArray = Arrays.copyOfRange(
      a,
      0,
      a.length,
      Integer[].class
    );
    return (Integer[]) a;
  }
}
