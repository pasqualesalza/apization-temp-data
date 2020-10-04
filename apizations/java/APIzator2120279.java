package com.stackoverflow.api;

/**
 * ResultSet exception - before start of result set
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2120279">https://stackoverflow.com/a/2120279</a>
 */
public class APIzator2120279 {

  public static void exception() throws RuntimeException {
    result.next();
    String foundType = result.getString(1);
    if (result.next()) {
      foundType = result.getString(1);
    }
  }
}
