package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.type.proto1api.Date;

/**
 * java Compare two dates
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15925576">https://stackoverflow.com/a/15925576</a>
 */
public class APIzator15925576 {

  public static void compareDate() throws RuntimeException {
    Date date1 = new Date();
    Date date2 = new Date();
    if (date1.before(date2)) {
      // Do Something
    }
    if (date1.after(date2)) {
      // Do Something else
    }
  }
}
