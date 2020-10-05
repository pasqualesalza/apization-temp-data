package com.stackoverflow.api;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * Set time to 00:00:00
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17821620">https://stackoverflow.com/a/17821620</a>
 */
public class APIzator17821620 {

  public static void setTime(AtomicStampedReference calendar)
    throws RuntimeException {
    calendar.set(Calendar.HOUR_OF_DAY, 0);
  }
}
