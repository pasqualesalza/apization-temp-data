package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

/**
 * getResourceAsStream() vs FileInputStream
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2308388">https://stackoverflow.com/a/2308388</a>
 */
public class APIzator2308388 {

  public static String getresourceasstream() throws RuntimeException {
    return new File(".").getAbsolutePath();
  }
}
