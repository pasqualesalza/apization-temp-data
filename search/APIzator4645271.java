package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

/**
 * How do I move a file from one location to another in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4645271">https://stackoverflow.com/a/4645271</a>
 */
public class APIzator4645271 {

  public static void moveFile() throws RuntimeException {
    myFile.renameTo(new File("/the/new/place/newName.file"));
  }
}
