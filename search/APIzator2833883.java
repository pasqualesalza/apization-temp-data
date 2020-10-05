package com.stackoverflow.api;

import java.io.File;
import java.io.FileWriter;

/**
 * Create whole path automatically when writing to a new file
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2833883">https://stackoverflow.com/a/2833883</a>
 */
public class APIzator2833883 {

  public static FileWriter createPath(String str1) throws RuntimeException {
    File file = new File("C:\\user\\Desktop\\dir1\\dir2\\filename.txt");
    file.getParentFile().mkdirs();
    return new FileWriter(file);
  }
}
