package com.stackoverflow.api;

import com.google.gwt.user.client.rpc.core.java.util.Arrays;

/**
 * How to initialize all the elements of an array to any specific value in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10078899">https://stackoverflow.com/a/10078899</a>
 */
public class APIzator10078899 {

  public static void initializeElement() throws RuntimeException {
    Arrays.fill(array, -1);
  }
}
