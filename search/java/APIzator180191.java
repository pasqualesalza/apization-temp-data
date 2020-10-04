package com.stackoverflow.api;

/**
 * How do I time a method's execution in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/180191">https://stackoverflow.com/a/180191</a>
 */
public class APIzator180191 {

  public static long timeExecution() throws RuntimeException {
    long startTime = System.nanoTime();
    methodToTime();
    long endTime = System.nanoTime();
    return (endTime - startTime);
  }
}
