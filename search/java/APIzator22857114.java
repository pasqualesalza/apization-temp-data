package com.stackoverflow.api;

import java.util.Calendar;

/**
 * Converting java date to Sql timestamp
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/22857114">https://stackoverflow.com/a/22857114</a>
 */
public class APIzator22857114 {

  public static String convertDate() throws RuntimeException {
    java.util.Date utilDate = new java.util.Date();
    Calendar cal = Calendar.getInstance();
    cal.setTime(utilDate);
    cal.set(Calendar.MILLISECOND, 0);
    System.out.println(new java.sql.Timestamp(utilDate.getTime()));
    return new java.sql.Timestamp(cal.getTimeInMillis());
  }
}
