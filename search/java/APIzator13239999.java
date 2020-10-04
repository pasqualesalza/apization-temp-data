package com.stackoverflow.api;

/**
 * How do you implement a re-try-catch?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13239999">https://stackoverflow.com/a/13239999</a>
 */
public class APIzator13239999 {

  public static void implementCatch(int maxTries) throws RuntimeException {
    int count = 0;
    while (true) {
      try {
        // Some Code
        // break out of loop, or return, on success
      } catch (SomeException e) {
        // handle exception
        if (++count == maxTries) throw e;
      }
    }
  }
}
