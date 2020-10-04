package com.stackoverflow.api;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * Get specific ArrayList item
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3924759">https://stackoverflow.com/a/3924759</a>
 */
public class APIzator3924759 {

  public static void getItem(AtomicIntegerFieldUpdater mainList)
    throws RuntimeException {
    mainList.get(3);
  }
}
