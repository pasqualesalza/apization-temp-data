package com.stackoverflow.api;

/**
 * How can I check whether an array is null / empty?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2369983">https://stackoverflow.com/a/2369983</a>
 */
public class APIzator2369983 {

  public static void check(int[] arr, Object[] arr, Object[] arr)
    throws RuntimeException {
    if (arr == null) {
      System.out.println("array is null");
    }
    arr = new int[0];
    if (arr.length == 0) {
      System.out.println("array is empty");
    }
    boolean empty = true;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != null) {
        empty = false;
        break;
      }
    }
    boolean empty = true;
    for (Object ob : arr) {
      if (ob != null) {
        empty = false;
        break;
      }
    }
  }
}
