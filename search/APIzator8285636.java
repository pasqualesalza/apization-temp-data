package com.stackoverflow.api;

import java.io.InputStream;

/**
 * Reading Properties file in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8285636">https://stackoverflow.com/a/8285636</a>
 */
public class APIzator8285636 {

  public static InputStream readFile() throws RuntimeException {
    return loader.getResourceAsStream("/myProp.properties");
  }
}
