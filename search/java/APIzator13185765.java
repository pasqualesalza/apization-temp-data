package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

/**
 * Reading a .txt file using Scanner class in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13185765">https://stackoverflow.com/a/13185765</a>
 */
public class APIzator13185765 {

  public static File readFile() throws RuntimeException {
    return new File("10_Random.txt");
  }
}
