package com.stackoverflow.api;

import com.google.gwt.user.client.rpc.core.java.util.Arrays;

/**
 * get only part of an Array in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11001759">https://stackoverflow.com/a/11001759</a>
 */
public class APIzator11001759 {

  public static void getPart(int[] arr) throws RuntimeException {
    int[] newArray = Arrays.copyOfRange(oldArray, startIndex, endIndex);
    // returns {10, 20}
    Arrays.copyOfRange(arr, 0, 2);
    // returns {20, 30, 40}
    Arrays.copyOfRange(arr, 1, 4);
    // returns {30, 40, 50} (length = 5)
    Arrays.copyOfRange(arr, 2, arr.length);
  }
}
