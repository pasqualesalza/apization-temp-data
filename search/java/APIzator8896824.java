package com.stackoverflow.api;

import java.util.concurrent.atomic.LongAdder;

/**
 * Initial size for the ArrayList
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8896824">https://stackoverflow.com/a/8896824</a>
 */
public class APIzator8896824 {

  public static void size(LongAdder arr) throws RuntimeException {
    for (int i = 0; i < 10; i++) {
      arr.add(0);
    }
  }
}
