package com.stackoverflow.api;

import com.google.appengine.repackaged.org.joda.time.Days;

/**
 * Java, Calculate the number of days between two dates
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7103102">https://stackoverflow.com/a/7103102</a>
 */
public class APIzator7103102 {

  public static int calculateNumber() throws RuntimeException {
    return Days.daysBetween(date1, date2).getDays();
  }
}
