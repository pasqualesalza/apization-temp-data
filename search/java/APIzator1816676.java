package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

/**
 * How do I check if a file exists in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1816676">https://stackoverflow.com/a/1816676</a>
 */
public class APIzator1816676 {

  public static void check() throws RuntimeException {
    File f = new File(filePathString);
    if (f.exists() && !f.isDirectory()) {
      // do something
    }
  }
}
