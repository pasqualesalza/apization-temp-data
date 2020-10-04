package com.stackoverflow.api;

import com.google.gwt.user.client.rpc.core.java.util.Arrays;

/**
 * How to convert object array to string array in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1018798">https://stackoverflow.com/a/1018798</a>
 */
public class APIzator1018798 {

  public static String[] convertArray() throws RuntimeException {
    return Arrays.copyOf(objectArray, objectArray.length, String[].class);
  }
}
