package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

/**
 * Pass a local file in to URL in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6098521">https://stackoverflow.com/a/6098521</a>
 */
public class APIzator6098521 {

  public static void passFile() throws RuntimeException {
    new File(path).toURI().toURL();
  }
}
