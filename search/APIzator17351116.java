package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

/**
 * How to get absolute path to file in /resources folder in your project
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17351116">https://stackoverflow.com/a/17351116</a>
 */
public class APIzator17351116 {

  public static String getPath(String str1) throws RuntimeException {
    File file = new File(str1);
    return file.getAbsolutePath();
  }
}
