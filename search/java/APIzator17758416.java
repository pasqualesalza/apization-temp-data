package com.stackoverflow.api;

import java.lang.Thread;

/**
 * Java - creating a new thread
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17758416">https://stackoverflow.com/a/17758416</a>
 */
public class APIzator17758416 {

  public static void createThread(Thread one) throws RuntimeException {
    one =
      new Thread() {

        public void run() {
          try {
            System.out.println("Does it work?");
            Thread.sleep(1000);
            System.out.println("Nope, it doesnt...again.");
          } catch (InterruptedException v) {
            System.out.println(v);
          }
        }
      };
    one.start();
  }
}
