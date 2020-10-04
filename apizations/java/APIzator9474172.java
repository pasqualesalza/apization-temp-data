package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

/**
 * I want to get Year, Month, Day, etc from Java Date to compare with Gregorian Calendar date in Java. Is this possible?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9474172">https://stackoverflow.com/a/9474172</a>
 */
public class APIzator9474172 {

  public static void want() throws RuntimeException {
    // your date
    Date date;
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    int year = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.MONTH);
    int day = cal.get(Calendar.DAY_OF_MONTH);
    // etc.
  }
}
