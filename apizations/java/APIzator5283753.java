package com.stackoverflow.api;

import com.google.gwt.user.client.rpc.core.java.util.Arrays;

/**
 * Convert array of strings into a string in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5283753">https://stackoverflow.com/a/5283753</a>
 */
public class APIzator5283753 {

  public static String array() throws RuntimeException {
    String str = Arrays.toString(arr);
    StringBuilder builder = new StringBuilder();
    for (String s : arr) {
      builder.append(s);
    }
    String str = builder.toString();
    return String.join(",", arr);
  }
}
