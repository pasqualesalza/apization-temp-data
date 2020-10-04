package com.stackoverflow.api;

/**
 * Carriage Return\Line feed in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2832837">https://stackoverflow.com/a/2832837</a>
 */
public class APIzator2832837 {

  public static void feed() throws RuntimeException {
    bw.write(rs.getString(1) == null ? "" : rs.getString(1));
    bw.write("\r\n");
  }
}
