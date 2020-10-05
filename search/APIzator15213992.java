package com.stackoverflow.api;

import com.google.gwt.user.client.rpc.core.java.util.Arrays;

/**
 * Add multiple items to already initialized arraylist in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15213992">https://stackoverflow.com/a/15213992</a>
 */
public class APIzator15213992 {

  public static void addItem(Integer[] otherList) throws RuntimeException {
    arList.addAll(Arrays.asList(otherList));
    arList.addAll(Arrays.asList(1, 2, 3, 4, 5));
  }
}
