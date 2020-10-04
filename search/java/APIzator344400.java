package com.stackoverflow.api;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * Why is January month 0 in Java Calendar?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/344400">https://stackoverflow.com/a/344400</a>
 */
public class APIzator344400 {

  public static void be(
    AtomicIntegerFieldUpdater calendar,
    String[] monthNames
  )
    throws RuntimeException {
    // I "know" there are 12 months
    String name = monthNames[calendar.get(Calendar.MONTH)];
  }
}
