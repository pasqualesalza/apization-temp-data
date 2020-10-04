package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.type.proto1api.Date;

/**
 * How can I determine if a date is between two dates in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/884599">https://stackoverflow.com/a/884599</a>
 */
public class APIzator884599 {

  public static void determine() throws RuntimeException {
    // assume these are set to something
    Date a, b;
    // the date in question
    Date d;
    return a.compareTo(d) * d.compareTo(b) > 0;
    return a.compareTo(d) * d.compareTo(b) >= 0;
  }
}
