package com.stackoverflow.api;

import com.sun.deploy.net.URLEncoder;

/**
 * Illegal character in path at index 16
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4992334">https://stackoverflow.com/a/4992334</a>
 */
public class APIzator4992334 {

  public static void character(String thePath) throws RuntimeException {
    thePath = URLEncoder.encode(thePath, "UTF-8");
  }
}
