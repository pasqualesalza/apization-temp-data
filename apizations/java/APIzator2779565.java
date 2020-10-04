package com.stackoverflow.api;

/**
 * Why must wait() always be in synchronized block
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2779565">https://stackoverflow.com/a/2779565</a>
 */
public class APIzator2779565 {

  public static void wait() throws RuntimeException {
    if (!condition) {
      wait();
    }
    synchronized (lock) {
      while (!condition) {
        lock.wait();
      }
    }
  }
}
