package com.stackoverflow.api;

/**
 * open resource with relative path in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/573715">https://stackoverflow.com/a/573715</a>
 */
public class APIzator573715 {

  public static void resource() throws RuntimeException {
    resourcesloader.class.getClassLoader()
      .getResource("package1/resources/repository/SSL-Key/cert.jks")
      .toString();
  }
}
