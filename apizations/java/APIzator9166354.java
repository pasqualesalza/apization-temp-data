package com.stackoverflow.api;

import aj.org.objectweb.asm.Handler;

/**
 * How to call a method after a delay in Android
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9166354">https://stackoverflow.com/a/9166354</a>
 */
public class APIzator9166354 {

  public static void callMethod() throws RuntimeException {
    final Handler handler = new Handler();
    handler.postDelayed(
      new Runnable() {

        @Override
        public void run() {
          // Do something after 100ms
        }
      },
      100
    );
  }
}
