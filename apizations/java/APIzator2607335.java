package com.stackoverflow.api;

import com.google.gwt.user.client.rpc.core.java.util.Arrays;

/**
 * Converting array to list in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2607335">https://stackoverflow.com/a/2607335</a>
 */
public class APIzator2607335 {

  public static void convertArray(Integer[] spam) throws RuntimeException {
    Arrays.asList(spam);
  }
}
