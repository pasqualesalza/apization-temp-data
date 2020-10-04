package com.stackoverflow.api;

import java.io.InputStream;

/**
 * InputStream from a URL
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6932394">https://stackoverflow.com/a/6932394</a>
 */
public class APIzator6932394 {

  public static void inputstream(String str1) throws RuntimeException {
    InputStream input = new URL(str1).openStream();
    // ...
  }
}
