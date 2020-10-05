package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.sun.java_cup.internal.runtime.Scanner;

/**
 * What is simplest way to read a file into String?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3403112">https://stackoverflow.com/a/3403112</a>
 */
public class APIzator3403112 {

  public static String be() throws RuntimeException {
    String content = new Scanner(new File("filename"))
      .useDelimiter("\\Z")
      .next();
    return content;
  }
}
