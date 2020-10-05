package com.stackoverflow.api;

import java.util.concurrent.locks.Lock;

/**
 * Synchronization vs Lock
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4201734">https://stackoverflow.com/a/4201734</a>
 */
public class APIzator4201734 {

  public static void synchronization() throws RuntimeException {
    Lock.acquire();
    // Throws a NPE!
    doSomethingNifty();
    // Oh noes, we never release the lock!
    Lock.release();
    synchronized (myObject) {
      doSomethingNifty();
    }
  }
}
