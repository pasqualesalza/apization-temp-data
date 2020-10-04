package com.stackoverflow.api;

/**
 * Running Command Line in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8496537">https://stackoverflow.com/a/8496537</a>
 */
public class APIzator8496537 {

  public static Process runningLine() throws RuntimeException {
    Runtime rt = Runtime.getRuntime();
    return rt.exec("java -jar map.jar time.rel test.txt debug");
  }
}
