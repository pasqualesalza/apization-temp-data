package com.stackoverflow.api;

import com.google.appengine.repackaged.org.joda.time.Instant;
import com.google.appengine.repackaged.org.joda.time.Interval;

/**
 * Calculating the difference between two Java date instances
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1555307">https://stackoverflow.com/a/1555307</a>
 */
public class APIzator1555307 {

  public static Interval calculateDifference() throws RuntimeException {
    return new Interval(oldTime, new Instant());
  }
}
