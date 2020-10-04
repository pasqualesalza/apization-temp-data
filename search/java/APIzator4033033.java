package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

/**
 * How to get the real path of Java application at runtime?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4033033">https://stackoverflow.com/a/4033033</a>
 */
public class APIzator4033033 {

  public static String getPath() throws RuntimeException {
    return new File(".").getCanonicalPath();
  }
}
