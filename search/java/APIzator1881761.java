package com.stackoverflow.api;

/**
 * How to start/stop/restart a thread in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1881761">https://stackoverflow.com/a/1881761</a>
 */
public class APIzator1881761 {

  public static void start() throws RuntimeException {
    // tell the thread to stop
    yourThread.setIsTerminating(true);
    // wait for the thread to stop
    yourThread.join();
  }
}
