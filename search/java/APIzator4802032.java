package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

/**
 * How to create empty folder in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4802032">https://stackoverflow.com/a/4802032</a>
 */
public class APIzator4802032 {

  public static void createFolder() throws RuntimeException {
    // Create a directory; all non-existent ancestor directories are
    // automatically created
    success =
      (new File("../potentially/long/pathname/without/all/dirs")).mkdirs();
    if (!success) {
      // Directory creation failed
    }
  }
}
