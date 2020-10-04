package com.stackoverflow.api;

/**
 * How to wait for a number of threads to complete?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1252202">https://stackoverflow.com/a/1252202</a>
 */
public class APIzator1252202 {

  public static void wait() throws RuntimeException {
    for (i = 0; i < threads.length; i++) threads[i].join();
  }
}
