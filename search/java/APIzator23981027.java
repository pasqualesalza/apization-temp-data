package com.stackoverflow.api;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/**
 * How to replace existing value of ArrayList element in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/23981027">https://stackoverflow.com/a/23981027</a>
 */
public class APIzator23981027 {

  public static void replaceValue(AtomicReferenceFieldUpdater list)
    throws RuntimeException {
    list.set(2, "New");
  }
}
