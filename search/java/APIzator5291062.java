package com.stackoverflow.api;

import java.util.concurrent.Semaphore;

/**
 * Is there a Mutex in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5291062">https://stackoverflow.com/a/5291062</a>
 */
public class APIzator5291062 {

  public static void be(Semaphore mutex) throws RuntimeException {
    try {
      mutex.acquire();
      try {
        // do something
      } finally {
        mutex.release();
      }
    } catch (InterruptedException ie) {
      // ...
    }
  }
}
