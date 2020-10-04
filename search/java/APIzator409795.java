package com.stackoverflow.api;

import com.google.gwt.user.client.rpc.core.java.util.Arrays;

/**
 * What's the simplest way to print a Java array?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/409795">https://stackoverflow.com/a/409795</a>
 */
public class APIzator409795 {

  public static String be(
    String[] array,
    String[][] deepArray,
    double[] doubleArray,
    int[] intArray
  )
    throws RuntimeException {
    System.out.println(Arrays.toString(array));
    System.out.println(Arrays.toString(deepArray));
    // output: [[Ljava.lang.String;@106d69c, [Ljava.lang.String;@52e922]
    System.out.println(Arrays.deepToString(deepArray));
    System.out.println(Arrays.toString(doubleArray));
    return Arrays.toString(intArray);
  }
}
