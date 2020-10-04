package com.stackoverflow.api;

/**
 * What's the difference between Thread start() and Runnable run()
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8579695">https://stackoverflow.com/a/8579695</a>
 */
public class APIzator8579695 {

  public static Thread be() throws RuntimeException {
    R1 r1 = new R1();
    R2 r2 = new R2();
    Thread t1 = new Thread(r1);
    return new Thread(r2);
  }
}
