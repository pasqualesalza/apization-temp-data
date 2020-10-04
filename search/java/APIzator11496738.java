package com.stackoverflow.api;

import java.io.File;
import java.io.PrintWriter;

/**
 * How to use PrintWriter and File classes in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11496738">https://stackoverflow.com/a/11496738</a>
 */
public class APIzator11496738 {

  public static PrintWriter useClass(String str1) throws RuntimeException {
    File file = new File(str1);
    file.getParentFile().mkdirs();
    return new PrintWriter(file);
  }
}
