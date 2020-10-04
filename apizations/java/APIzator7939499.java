package com.stackoverflow.api;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * wait until all threads finish their work in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7939499">https://stackoverflow.com/a/7939499</a>
 */
public class APIzator7939499 {

  public static void wait() throws RuntimeException {
    ExecutorService es = Executors.newCachedThreadPool();
    for (int i = 0; i < 5; i++) es.execute(new Runnable() {});
    es.shutdown();
    boolean finshed = es.awaitTermination(1, TimeUnit.MINUTES);
    // all tasks have finished or the time has been reached.
  }
}
