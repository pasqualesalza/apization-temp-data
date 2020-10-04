package com.stackoverflow.api;

import aj.org.objectweb.asm.Handler;
import android.graphics.Color;

/**
 * How to set delay in android?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15874176">https://stackoverflow.com/a/15874176</a>
 */
public class APIzator15874176 {

  public static void setDelay() throws RuntimeException {
    final Handler handler = new Handler();
    handler.postDelayed(
      new Runnable() {

        @Override
        public void run() {
          // Do something after 5s = 5000ms
          buttons[inew][jnew].setBackgroundColor(Color.BLACK);
        }
      },
      5000
    );
  }
}
