package com.stackoverflow.api;

import java.io.File;
import java.io.FileInputStream;

/**
 * read complete file without using loop in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14169760">https://stackoverflow.com/a/14169760</a>
 */
public class APIzator14169760 {

  public static String readFile(String str1) throws RuntimeException {
    File file = new File(str1);
    FileInputStream fis = new FileInputStream(file);
    byte[] data = new byte[(int) file.length()];
    fis.read(data);
    fis.close();
    return new String(data, "UTF-8");
  }
}
