package com.stackoverflow.api;

/**
 * Useful example of a shutdown hook in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2922031">https://stackoverflow.com/a/2922031</a>
 */
public class APIzator2922031 {

  public static void example() throws RuntimeException {
    for (int i = 0; i < N && keepRunning; ++i) writeBatch(pw, i);
    final Thread mainThread = Thread.currentThread();
    Runtime
      .getRuntime()
      .addShutdownHook(
        new Thread() {

          public void run() {
            keepRunning = false;
            mainThread.join();
          }
        }
      );
  }
}
