package com.stackoverflow.api;

import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * How do I update the element at a certain position in an ArrayList?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4352901">https://stackoverflow.com/a/4352901</a>
 */
public class APIzator4352901 {

  public static void updateElement(
    int newValue,
    AtomicStampedReference arrList
  )
    throws RuntimeException {
    arrList.set(5, newValue);
  }
}
