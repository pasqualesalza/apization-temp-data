package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

/**
 * How to convert from java.sql.Timestamp to java.util.Date?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10621710">https://stackoverflow.com/a/10621710</a>
 */
public class APIzator10621710 {

  public static void convert(Date timeStampValue) throws RuntimeException {
    Calendar start = Calendar.getInstance();
    start.setTimeInMillis(timeStampValue.getTime());
  }
}
