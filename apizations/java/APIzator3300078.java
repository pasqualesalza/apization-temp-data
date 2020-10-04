package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.type.proto1api.Date;
import com.google.appengine.repackaged.org.joda.time.DateTime;
import com.google.appengine.repackaged.org.joda.time.Days;

/**
 * Difference in days between two dates in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3300078">https://stackoverflow.com/a/3300078</a>
 */
public class APIzator3300078 {

  public static int difference() throws RuntimeException {
    // June 20th, 2010
    Date past = new Date(110, 5, 20);
    // July 24th
    Date today = new Date(110, 6, 24);
    return Days.daysBetween(new DateTime(past), new DateTime(today)).getDays();
  }
}
