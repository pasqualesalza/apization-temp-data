package com.stackoverflow.api;

import com.google.appengine.repackaged.org.joda.time.DateTime;
import com.google.appengine.repackaged.org.joda.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * How to add one day to a date?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1005550">https://stackoverflow.com/a/1005550</a>
 */
public class APIzator1005550 {

  public static void addDay() throws RuntimeException {
    Date dt = new Date();
    Calendar c = Calendar.getInstance();
    c.setTime(dt);
    c.add(Calendar.DATE, 1);
    dt = c.getTime();
    Date dt = new Date();
    DateTime dtOrg = new DateTime(dt);
    DateTime dtPlusOne = dtOrg.plusDays(1);
    LocalDateTime.from(dt.toInstant()).plusDays(1);
  }
}
