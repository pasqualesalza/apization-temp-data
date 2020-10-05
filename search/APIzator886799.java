package com.stackoverflow.api;

/**
 * How to use wait and notify in Java without IllegalMonitorStateException?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/886799">https://stackoverflow.com/a/886799</a>
 */
public class APIzator886799 {

  public static void useWait() throws RuntimeException {
    synchronized (someObject) {
      someObject.wait();
    }
    /* different thread / object */
    synchronized (someObject) {
      someObject.notify();
    }
  }
}
