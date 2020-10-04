package com.stackoverflow.api;

import io.netty.util.Timer;
import io.netty.util.TimerTask;

/**
 * Cannot refer to a non-final variable inside an inner class defined in a different method
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1299889">https://stackoverflow.com/a/1299889</a>
 */
public class APIzator1299889 {

  public static void refer(int period, int delay) {
    Timer timer = new Timer();
    timer.scheduleAtFixedRate(
      new TimerTask() {
        // Variables as member variables instead of local variables in main()
        private double lastPrice = 0;

        private Price priceObject = new Price();

        private double price = 0;

        public void run() {
          price = priceObject.getNextPrice(lastPrice);
          System.out.println();
          lastPrice = price;
        }
      },
      delay,
      period
    );
  }
}
