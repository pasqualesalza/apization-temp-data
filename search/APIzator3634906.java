package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

/**
 * How to create a directory in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3634906">https://stackoverflow.com/a/3634906</a>
 */
public class APIzator3634906 {

  public static void createDirectory() throws RuntimeException {
    new File("/path/directory").mkdirs();
    File theDir = new File("new folder");
    // if the directory does not exist, create it
    if (!theDir.exists()) {
      System.out.println("creating directory: " + theDir.getName());
      boolean result = false;
      try {
        theDir.mkdir();
        result = true;
      } catch (SecurityException se) {
        // handle it
      }
      if (result) {
        System.out.println("DIR created");
      }
    }
  }
}
