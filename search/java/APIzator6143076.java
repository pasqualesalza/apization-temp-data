package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

/**
 * How to create a file in a directory in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6143076">https://stackoverflow.com/a/6143076</a>
 */
public class APIzator6143076 {

  public static void createFile(String str1) throws RuntimeException {
    String path = "C:" + File.separator + "hello" + File.separator + str1;
    // Use relative path for Unix systems
    File f = new File(path);
    f.getParentFile().mkdirs();
    f.createNewFile();
  }
}
