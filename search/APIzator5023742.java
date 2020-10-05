package com.stackoverflow.api;

import java.io.InputStream;

/**
 * How to retrieve raw post data from HttpServletRequest in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5023742">https://stackoverflow.com/a/5023742</a>
 */
public class APIzator5023742 {

  public static void retrieveDatum() throws RuntimeException {
    InputStream body = request.getInputStream();
    // ...
  }
}
