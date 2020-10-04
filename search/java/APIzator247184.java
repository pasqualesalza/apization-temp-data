package com.stackoverflow.api;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * How do I turn a String into a InputStreamReader in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/247184">https://stackoverflow.com/a/247184</a>
 */
public class APIzator247184 {

  public static InputStream turnString() throws RuntimeException {
    return new ByteArrayInputStream(myString.getBytes(charset));
  }
}
