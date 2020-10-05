package com.stackoverflow.api;

import com.google.gwt.user.client.rpc.core.java.util.Arrays;

/**
 * How to calculate the median of an array?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11955900">https://stackoverflow.com/a/11955900</a>
 */
public class APIzator11955900 {

  public static void calculateMedian() throws RuntimeException {
    Arrays.sort(numArray);
    double median;
    if (numArray.length % 2 == 0) median =
      (
        (double) numArray[numArray.length / 2] +
        (double) numArray[numArray.length / 2 - 1]
      ) /
      2; else median = (double) numArray[numArray.length / 2];
  }
}
