package com.stackoverflow.api;

import com.amazonaws.util.StringUtils;

/**
 * Java - Create a new String instance with specified length and filled with specific character. Best solution?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1802970">https://stackoverflow.com/a/1802970</a>
 */
public class APIzator1802970 {

  public static String createInstance() throws RuntimeException {
    return StringUtils.repeat("*", 10);
  }
}
