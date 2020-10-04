package com.stackoverflow.api;

/**
 * How to convert Integer to int?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3574500">https://stackoverflow.com/a/3574500</a>
 */
public class APIzator3574500 {

  public static void convertInteger() throws RuntimeException {
    // Java 1.5 or later
    pstmt.setInt(1, (tempID != null ? tempID : 0));
    // any version, no autoboxing
    pstmt.setInt(1, (tempID != null ? tempID.intValue() : 0));
  }
}
