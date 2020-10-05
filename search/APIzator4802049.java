package com.stackoverflow.api;

/**
 * Difference between null and empty ("") Java String
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4802049">https://stackoverflow.com/a/4802049</a>
 */
public class APIzator4802049 {

  public static String difference(String a, String b) throws RuntimeException {
    String a = new String("");
    String b = new String("");
    System.out.println(a == b);
    return a == b;
  }
}
