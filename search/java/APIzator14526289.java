package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

/**
 * How do I get the file name from a String containing the Absolute file path?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14526289">https://stackoverflow.com/a/14526289</a>
 */
public class APIzator14526289 {

  public static String getName() throws RuntimeException {
    File f = new File("C:\\Hello\\AnotherFolder\\The File Name.PDF");
    System.out.println(f.getName());
    File f = new File("C:\\Hello\\AnotherFolder\\The File Name.PDF");
    return f
      .getAbsolutePath()
      .substring(f.getAbsolutePath().lastIndexOf("\\") + 1);
  }
}
