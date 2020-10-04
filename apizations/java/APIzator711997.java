package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

/**
 * Does Java have a path joining method?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/711997">https://stackoverflow.com/a/711997</a>
 */
public class APIzator711997 {

  public static String combine(String path1, String path2) {
    File file1 = new File(path1);
    File file2 = new File(file1, path2);
    return file2.getPath();
  }
}
