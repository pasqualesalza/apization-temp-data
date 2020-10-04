package com.stackoverflow.api;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * Can we convert a byte array into an InputStream in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1802126">https://stackoverflow.com/a/1802126</a>
 */
public class APIzator1802126 {

  public static InputStream convertArray() throws RuntimeException {
    return new ByteArrayInputStream(decodedBytes);
  }
}
