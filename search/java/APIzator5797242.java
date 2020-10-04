package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

/**
 * Java - how do I write a file to a specified directory
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5797242">https://stackoverflow.com/a/5797242</a>
 */
public class APIzator5797242 {

  public static File writeFile(String str1) throws RuntimeException {
    File file = new File("Z:\\results\\results.txt");
    return new File("/home/userName/Documents/results.txt");
  }
}
