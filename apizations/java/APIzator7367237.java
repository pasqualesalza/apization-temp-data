package com.stackoverflow.api;

/**
 * Getting the length of two-dimensional array
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7367237">https://stackoverflow.com/a/7367237</a>
 */
public class APIzator7367237 {

  public static void getLength(int[][] nir) throws RuntimeException {
    System.out.println(nir[0].length);
    // 5
    System.out.println(nir[0].length);
    // 3
    System.out.println(nir[1].length);
    // Null pointer exception
    System.out.println(nir[2].length);
  }
}
